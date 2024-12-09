// Ejercicio 5
/*
Debe pedirle al usuario que intente adivinar el número secreto por prompt o por input, dicho número será del 1 al 100.
Si el usuario no adivina el número secreto, debe mostrar un mensaje por consola o DOM diciendo: “Ups, el número secreto es incorrecto, vuelve a intentarlo. ” y volver a solicitarle que ingrese un número.
Si el usuario adivina el número secreto debe de mostrar un mensaje por consola o DOM diciendo: “Felicidades, adivinaste el número secreto”. Además debe imprimir por consola o DOM la lista de números introducidos antes de adivinar el número secreto.
El número secreto puede ser introducido manualmente o generar un número aleatorio, pero recuerda que debe ser del 1 al 100.
Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.
*/

const numeroSecreto = Math.floor(Math.random() * 100) + 1;
console.log(numeroSecreto);
let intentos = [];

function adivinarNumero() {
let numeroIngresado;
    while (true) {
        numeroIngresado = prompt("Adivina el número secreto entre 1 y 100:");
        numeroIngresado = Number(numeroIngresado);
    if (isNaN(numeroIngresado)) {
        alert("Por favor, ingresa un número válido.");
    continue;
    }
    intentos.push(numeroIngresado);
    
    if (numeroIngresado === numeroSecreto) {
        alert("¡Felicidades, adivinaste el número secreto!");
        console.log(`El numero secreto es: ${numeroSecreto}`)
        console.log("Lista de intentos: ", intentos);
    break;
    } else {
    alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
    }
    }
}

adivinarNumero();
