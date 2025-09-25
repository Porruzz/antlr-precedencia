import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class EvalStdVisitor extends ExprStdBaseVisitor<Integer> {
    @Override public Integer visitProg(ExprStdParser.ProgContext ctx) {
        return visit(ctx.expr());
    }

    @Override public Integer visitAddExpr(ExprStdParser.AddExprContext ctx) {
        int val = visit(ctx.mulExpr(0));
        for (int i = 1; i < ctx.mulExpr().size(); i++) {
            String op = ctx.getChild(2*i-1).getText();
            int rhs = visit(ctx.mulExpr(i));
            val = op.equals("+") ? val + rhs : val - rhs;
        }
        return val;
    }

    @Override public Integer visitMulExpr(ExprStdParser.MulExprContext ctx) {
        int val = visit(ctx.atom(0));
        for (int i = 1; i < ctx.atom().size(); i++) {
            String op = ctx.getChild(2*i-1).getText();
            int rhs = visit(ctx.atom(i));
            val = op.equals("*") ? val * rhs : val / rhs;
        }
        return val;
    }

    @Override public Integer visitAtom(ExprStdParser.AtomContext ctx) {
        if (ctx.INT() != null) return Integer.parseInt(ctx.INT().getText());
        return visit(ctx.expr()); // ( expr )
    }
}
