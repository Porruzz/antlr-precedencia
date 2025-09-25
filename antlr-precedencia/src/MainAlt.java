import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MainAlt {
    public static void main(String[] args) throws Exception {
        String input = (args.length > 0) ? args[0] : new String(System.in.readAllBytes());
        CharStream cs = CharStreams.fromString(input.trim());

        ExprAltLexer lexer = new ExprAltLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprAltParser parser = new ExprAltParser(tokens);

        ParseTree tree = parser.prog();
        EvalAltVisitor eval = new EvalAltVisitor();
        int result = eval.visit(tree);

        System.out.println("GRAMMAR: ExprAlt (+ > *)");
        System.out.println("INPUT  : " + input.trim());
        System.out.println("RESULT : " + result);
    }
}
