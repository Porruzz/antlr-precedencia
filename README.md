Pruebas de Precedencia y Asociatividad con ANTLR

Este proyecto muestra cómo cambia el resultado de evaluar expresiones matemáticas cuando se modifica la precedencia y la asociatividad en una gramática.

Estructura

grammars/ExprStd.g4 → Gramática estándar (* tiene más precedencia que +).

grammars/ExprAlt.g4 → Gramática modificada (+ tiene más precedencia que *).

src/ → Clases Java generadas por ANTLR + MainStd.java, MainAlt.java, y visitors de evaluación.

tools/ → Contiene el jar de ANTLR.

Compilación y ejecución

Generar el parser y visitor (si no está hecho):

java -jar tools/antlr-4.13.1-complete.jar -Dlanguage=Java -visitor -o src grammars/ExprStd.g4
java -jar tools/antlr-4.13.1-complete.jar -Dlanguage=Java -visitor -o src grammars/ExprAlt.g4


Compilar:

mkdir -p out
javac -cp tools/antlr-4.13.1-complete.jar -d out $(find src -name "*.java")


Ejecutar ejemplos:

# Gramática estándar
java -cp out:tools/antlr-4.13.1-complete.jar MainStd "2+3*4"
# Gramática modificada
java -cp out:tools/antlr-4.13.1-complete.jar MainAlt "2+3*4"

Resultados principales

ExprStd (clásica): 2+3*4 = 14 → porque * tiene más precedencia que +.

ExprAlt (modificada): 2+3*4 = 20 → porque + tiene más precedencia que *.

Con paréntesis (2+3)*4, ambas gramáticas dan 20.

En expresiones como 100-10-5, ambas respetan asociatividad a izquierda: resultado 85.

Conclusión

Al cambiar la precedencia en la gramática, cambia el resultado de las expresiones. La asociatividad se mantiene a izquierda en ambos diseños, lo que también se confirma en pruebas como 8/2/2.
