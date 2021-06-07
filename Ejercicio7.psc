ALgoritmo Ejercicio7
// R es la Ruleta 
 CR <- 0
 CR <- 0
 Para i <- 0 Hasta 36 Con Paso 1
  Hacer
  N<-azar(15)
   Si mod(2) Entonces 
   // P son los pares 
   SP <- SR+1
   CP <- CR/100
   Sino 
   Si mod(1) Entonces
   // I son los impares 
   SI <- SR+1
   CI <- CR/100
   Sino
   // N son los ceros 
   SN <- SR+1
   CN <- CR/100
 Fin Para
  // P Es el porciento
  PP <- SP/CP
  PI <- SI/CI
  PN <- SN/CN
 Escribir"El porciento de los numeros pares es PP"
 Escribir"El porciento de los numeros impares es PI"
 Escribir"El porciento de los ceros es PN"
FinAlgoritmo 

