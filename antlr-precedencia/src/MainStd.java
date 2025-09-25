import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MainStd {
    public static void main(String[] args) throws Exception {
        // Lee la expr de stdin o del primer arg
        String input = (args.length > 0) ? args[0] : new String(System.in.readAllBytes());
        CharStream cs = CharStreams.fromString(input.trim());

        ExprStdLexer lexer = new ExprStdLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprStdParser parser = new ExprStdParser(tokens);

        ParseTree tree = parser.prog();
        EvalStdVisitor eval = new EvalStdVisitor();
        int result = eval.visit(tree);

        System.out.println("GRAMMAR: ExprStd (* > +)");
        System.out.println("INPUT  : " + input.trim());
        System.out.println("RESULT : " + result);
    }
}
