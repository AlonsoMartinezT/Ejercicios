// Ejercicio 4
/*
Debe solicitar al usuario un número por prompt o por input y guardarlo.
Debe imprimir la serie de fibonacci dependiendo del número recibido, es decir, si el programa recibe un 8, debe mostrar 8 números de la serie de Fibonacci.
Debe imprimir el resultado por consola o por el DOM.
Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.
*/

function generarFibonacci(n) {
    let fibonacci = [0, 1]; 
    for (let i = 2; i < n; i++) {
        fibonacci.push(fibonacci[i - 1] + fibonacci[i - 2]);
    }
    return fibonacci.slice(0, n); 
}

function solicitarNumero() {
    let numero;
    while (true) {
        numero = prompt("Por favor, ingresa un número para generar la serie de Fibonacci:");
        numero = Number(numero);
    if (!isNaN(numero) && Number.isInteger(numero) && numero > 0) {
        break;
    } else {
        alert("¡Error! Debes ingresar un número entero positivo.");
    }
    }
    const fibonacci = generarFibonacci(numero);
    console.log("Serie de Fibonacci hasta el número " + numero + ":", fibonacci);
    document.body.innerHTML = `
    <h1>RESULTADOS</h1>
    <h2>El factorial de ${numero} es: ${fibonacci}</h2>
    `;
}

solicitarNumero();