//Ejercicio 2
/*
Crear un programa en Javascript que realice lo siguiente:
Debe solicitar al usuario la temperatura en grados Celsius por prompt o por un input.
Debe convertir la temperatura ingresada de grados Celsius a grados Fahrenheit y Kelvin
Debe imprimir ambos resultados por consola o por el DOM.
Debe ser capaz de identificar si los datos de entrada sean de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar los datos.
*/

function calcularTemperatura(celsius) {
    let fahrenheit = (celsius * 1.8) + 32;
    let kelvin = celsius + 273.15;
    return { fahrenheit, kelvin };
}

function solicitarTemperatura() {
    let temperatura = prompt("Temperatura en grados Celsius:");
    if (isNaN(temperatura) || temperatura === "") {
        alert("Ingrese un valor numerico");
        return solicitarTemperatura(); 
    }
    temperatura = parseFloat(temperatura);
    let resultados = calcularTemperatura(temperatura);
    console.log(`Grados Celsius: ${temperatura}°C`);
    console.log(`Grados Kelvin: ${resultados.kelvin} K`);
    console.log(`GradosFahrenheit: ${resultados.fahrenheit}°F`);
  
}
solicitarTemperatura();

