# Codelabs PAMN 📙
Hemos decidido realizar las prácticas con Android Pie (Android 9), para poder tener la aplicación en nuestros móviles y poder probarla.  
---
# Notas de Jose Illera 📝
---  
# Notas de Cristóbal Jiménez 📝
Empecé a hacer los Codelabs de la página deprecada, y decidí cambiar a la página no deprecada, por lo que los Codelab 1, 2 y 3, son de la página deprecada y los Codelab 1.5 en adelante son de la [página no deprecada](https://developer.android.com/courses/fundamentals-training/toc-v2).  

Es bastante molesto que solo haya Codelabs en Java (o al menos no he sido capaz de encontrarlos), por lo que buscando algo de ayuda llegué a otra página de androdi studio, para poder llegar a un certificado, donde hay ayudas -> [Android Basics](https://developer.android.com/courses/android-basics-kotlin/course).

## **Unidad 1**
### **Lección 1**
#### **Codelab 1.1** 👋
Log y cambiar "Hello World!" por "Feliz Cumpleaños X"  

---
#### **Codelab 1.2** 🔘
Cambio de texto al pulsar un botón.  
Botón que al clicar genera un nº aleatorio del 1 al 6.  
Botón de contador que va sumando 1 cada vez que se pulsa. 

---
#### **Codelab 1.3** 🎲
Al pulsar un botón se tiran 2 dados.  
El ejercicio de este Codelab era **trabajar con las fotos** de los dados.  

---
#### **Codelab 1.4 ( 1.2 entero del nuevo )** 📲
Se **desarrolla un contador**, con capacidad para reiniciar, y se investiga sobre la pantalla, tener un layout para la forma horizontal, y otro layout para una tablet.  
  
---
#### **Codelab 1.5 ( 1.3 del nuevo )** ⬇️
**Se explora el fichero _string.xml_**, en el que se pueden colocar las strings para luego poder usarlas en el diseño final.   
**Se explora sobre el _scroll_**, y las distintas formas de colocar el layout para que quede bien.  

>Esta me llevó muchísimo tiempo, me daba un error raro, hasta que decidí borrar todo el proyecto y **volver a empezar**, y así ocurrió todo a la primera.

---
#### **Codelab 1.6 ( 1.4 del nuevo )** 🔍
Se habla sobre:  
- **Cambio del icono** de la aplicación.

 ![Foto del icono creado] (Cristobal/Codelab1.6 (1.4 del nuevo)/ic_launcher.png) 
>Podría ser mi incapacidad para leer, pero muchas veces ocurría que las imágenes **no se actualizaban**, hasta que decidí manualmente eliminar las plantillas de fotos que había por defecto, y dejar solo la creada.

- **Uso de las plantillas** con intención de modificarlas y ciertos concimientos de la plantilla _"Actividad Básica"_.  
- **Importación de plantillas de ejemplo** "por defecto", de forma más compleja e instalación y documentación del SDK.  
- **Conocimientos** sobre algunas páginas de ayuda y uso de _tags_ para la búsqueda en stack overflow.

---
### **Lección 2**
#### **Codelab 2.1** 😤
Se realizó una **aplicacion** con posibilidad de escribir texto, y al pulsar un botón, el texto pasa de la primera pantalla a la segunda.  
Se aprendió el uso de _**intent**_ para poder pasar de una pantalla a otra.  
Se aprendió el uso de _**contextos**_ para poder decir saber de qué página venimos y en qué página estamos.
> Esta tontería me ha llevado **otras 3 horas**, debido a que la página nueva está escrita para java (por lo que hay funciones que no se escriben de la misma manera), y la información general sobre como funciona la transición de pantallas **me resultó confusa**. Hasta que intentando que funcionara de distintas formas, salió algo aceptable.

---
#### **Codelab 2.2** 🧀  
Se reforzó la idea de los contextos, además, se aprendió el ciclo de vida de un programa.  

- onCreate()
- onStart()
- onPause()
- onRestart()
- onResume()
- onStop()
- onDestroy()

Se usa con los Log.d, por lo que podemos ver con cada movimiento de la aplicación en qué estado se encuentra.  
Además, se hizo el [coding challenge](https://developer.android.com/codelabs/android-training-activity-lifecycle-and-state?index=..%2F..%2Fandroid-training#4) que consistía en tener dos pantallas, la pantalla 1, donde se muestre una palabra, y la pantalla 2, con un conjunto de posibilidades, y al clicar alguna de estas, se muestre la palabra en la pantalla 1.

---
#### **Codelab 2.3** 📍  
Se aprendión los distintos tipos de entrada de texto:
- **Web** - Podemos escribir una página web, y si existe nos llevará a ella.
- **Ubicación** - Podemos escribir una dirección, y nos llevará a ella.
- **Texto** - Podemos escribir un texto, y al clicar el botón podremos elegir en qué aplicación queremos enviarlo.

---
### **Lección 3**
#### **Codelab 3.1** 🐞
Se aprendión el uso del **_Debugger/Depurador_** sobre un proyecto de calculadora (para simplificar, decidí hacer yo una calculadora, y no usar la plantilla).


---
#### **Codelab 3.2** 🧪️
Se aprendión el uso de los **_Test Unitarios_** sobre un proyecto de calculadora (Codelab 3.1).

---
#### **Codelab 3.3** 🖌
Se aprendión el uso de las **_Librerías_** sobre un proyecto de en blanco, que consiste en cambiar de color una frase.  

---  

## **Unidad 2**
### **Lección 4**
#### **Codelab 4.1** 🍨
Se aprendió la forma de usar **_imágenes_**, y las distintas utilidades que puede llegar a tener los codelabs anteriores, haciendo uso de los _intent_, los _onclick_, las _variabels globales_ y los datos entre dos actividades distintas.

---