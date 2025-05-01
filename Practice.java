#include <iostream>  // Incluye la biblioteca de entrada/salida estándar de C++
using namespace std; // Utiliza el espacio de nombres estándar para evitar escribir "std::" antes de cada función

// Clase "ContenedorDeNumeros" que se encarga de almacenar y calcular la suma y el promedio de números
class ContenedorDeNumeros {
    int numeros[10];   // Arreglo de 10 enteros para almacenar los números
    int indiceActual = 0; // Índice actual del arreglo "numeros", se incrementa al agregar un nuevo número

public:
    // Método "agregarNumero" que agrega un número al arreglo "numeros"
    void agregarNumero(int valor) {
        numeros[indiceActual++] = valor; // Asigna el valor al elemento actual del arreglo y luego incrementa el índice
    }

    // Método "obtenerSuma" que calcula la suma de todos los números almacenados
    int obtenerSuma() {
        int suma = 0; // Variable para almacenar la suma
        for (int i = 0; i < indiceActual; ++i) { // Recorre el arreglo "numeros" desde el inicio hasta el índice actual
            suma += numeros[i]; // Suma cada número al acumulador "suma"
        }
        return suma; // Devuelve la suma total
    }

    // Método "obtenerPromedio" que calcula el promedio de los números almacenados
    double obtenerPromedio() {
        return indiceActual == 0 ? 0.0 : (double)obtenerSuma() / indiceActual; // Si no hay números, devuelve 0.0, de lo contrario, 
        //calcula el promedio dividiendo la suma entre el número de elementos
    }
};

int main() {
    setlocale(LC_ALL,"spanish"); // Establece el idioma español para la salida
    ContenedorDeNumeros contenedor; // Crea un objeto "contenedor" de la clase "ContenedorDeNumeros"
    int totalDeNumeros; // Variable para almacenar el total de números a ingresar

    cout << "¿Cuántos números ingresará? "; // Solicita al usuario que ingrese la cantidad de números
    cin >> totalDeNumeros; // Lee la cantidad de números desde la entrada

    for (int i = 0; i < totalDeNumeros; ++i) { // Ciclo que se repite "totalDeNumeros" veces
        cout << "Número: "; // Solicita al usuario que ingrese un número
        int numero; // Variable para almacenar el número ingresado
        cin >> numero; // Lee el número desde la entrada
        contenedor.agregarNumero(numero); // Agrega el número al contenedor
    }

    cout << "Suma = " << contenedor.obtenerSuma() << '\n'; // Muestra la suma de los números
    cout << "Promedio = " << contenedor.obtenerPromedio() << '\n'; // Muestra el promedio de los números
    return 0; // Indica que el programa finalizó correctamente
}

