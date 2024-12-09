// Ejercicio 3d
/*
Crear un programa en Javascript que realice lo siguiente:
Debe solicitar al usuario un número por prompt o por input y guardarlo.
Debe calcular el factorial del número recibido utilizando recursión.
Debe imprimir el resultado por consola o por el DOM.
Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.
*/

function calcularFactorial(num) {
    if (num === 0 || num === 1) {
        return 1;
    }
    return num * calcularFactorial(num - 1);
}

function solicitarNumero() {
    let numero = prompt("Ingrese un numero");
    numero = Number(numero);
    if (isNaN(numero)) {
        alert("Eso no es un número válido. Por favor, ingresa un número.");
        solicitarNumero(); 
    } else {
        let resultado = calcularFactorial(numero);
        console.log(`El factorial de ${numero} es: ${resultado}`);
        document.body.innerHTML = `
        <h1>RESULTADOS</h1>
        <h2>El factorial de ${numero} es: ${resultado}</h2>
        `;
    }
}

solicitarNumero();
