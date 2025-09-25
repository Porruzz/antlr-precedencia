import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class EvalAltVisitor extends ExprAltBaseVisitor<Integer> {
    @Override public Integer visitProg(ExprAltParser.ProgContext ctx) {
        return visit(ctx.expr());
    }

    @Override public Integer visitExpr(ExprAltParser.ExprContext ctx) {
        int val = visit(ctx.addHigher(0));
        for (int i = 1; i < ctx.addHigher().size(); i++) {
            String op = ctx.getChild(2*i-1).getText(); // * o /
            int rhs = visit(ctx.addHigher(i));
            val = op.equals("*") ? val * rhs : val / rhs;
        }
        return val;
    }

    @Override public Integer visitAddHigher(ExprAltParser.AddHigherContext ctx) {
        int val = visit(ctx.atom(0));
        for (int i = 1; i < ctx.atom().size(); i++) {
            String op = ctx.getChild(2*i-1).getText(); // + o -
            int rhs = visit(ctx.atom(i));
            val = op.equals("+") ? val + rhs : val - rhs;
        }
        return val;
    }

    @Override public Integer visitAtom(ExprAltParser.AtomContext ctx) {
        if (ctx.INT() != null) return Integer.parseInt(ctx.INT().getText());
        return visit(ctx.expr());
    }
}
