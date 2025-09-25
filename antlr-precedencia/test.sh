set -e

CP="out:tools/antlr-4.13.1-complete.jar"

cases=(
  "2+3*4"
  "(2+3)*4"
  "100-10-5"
  "8/2/2"
  "7+4*2-6"
  "10-3*2+1"
)

echo "== Pruebas de Precedencia y Asociatividad ==" > reporte.txt
echo "" >> reporte.txt

for s in "${cases[@]}"; do
  std=$(java -cp "$CP" MainStd "$s")
  alt=$(java -cp "$CP" MainAlt "$s")
  echo "INPUT: $s" >> reporte.txt
  echo "$std"    >> reporte.txt
  echo "$alt"    >> reporte.txt
  echo ""        >> reporte.txt
done

echo "Reporte generado en reporte.txt"
