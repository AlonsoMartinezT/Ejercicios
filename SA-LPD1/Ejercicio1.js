// SA-LPD1 - Práctica de comparación de números
/*
Crear un programa en Javascript que realice lo siguiente:
Debe solicitar al usuario 3 números por prompt y guardarlos en sus respectivas variables.
Debe analizar los números, identificar cual es el número mayor, el número del centro y el número menor.
Debe imprimir los números por consola o por el DOM ordenados de mayor a menor, y de menor a mayor.
Debe ser capaz de identificar si los números son iguales e imprimir un mensaje por consola o por el DOM diciendo que los números son iguales. 
*/

let num1 = parseInt(prompt("Introduce el primer número:"));
let num2 = parseInt(prompt("Introduce el segundo número:"));
let num3 = parseInt(prompt("Introduce el tercer número:"));

function ordenarNumeros(a, b, c) {
    let numeros = [a, b, c];
    numeros.sort((x, y) => x - y); 
    return numeros;
}

let [menor, centro, mayor] = ordenarNumeros(num1, num2, num3);
console.log(menor,centro,mayor);

if (num1 === num2 && num2 === num3) {
    console.log("Los tres números son iguales.");
} else {
    console.log("Mayor a Menor: " + mayor + ", " + centro + ", " + menor);
    console.log("Menor a Mayor: " + menor + ", " + centro + ", " + mayor);
}

document.body.innerHTML = 
`
    <h1>Resultados</h1>
    <p>Los números introducidos fueron: ${num1}, ${num2}, ${num3}</p>
    ${num1 === num2 && num2 === num3 ? 
        `<p>Los tres números son iguales.</p>` : 
        `<p>Ordenados de menor a mayor: ${menor}, ${centro}, ${mayor}</p>
         <p>Ordenados de mayor a menor: ${mayor}, ${centro}, ${menor}</p>`
    }
`;



