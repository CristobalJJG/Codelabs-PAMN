# Codelabs PAMN 馃摍
Hemos decidido realizar las pr谩cticas con Android Pie (Android 9), para poder tener la aplicaci贸n en nuestros m贸viles y poder probarla.  
---
# Notas de Jose Illera 馃摑
Siguiendo el curso de Codelabs obsoleto. Las distintas aplicaciones subidas por mi parte no tienen los nombres de los Codelabs, se refleja en el README a que aplicaci贸n corresponde cada Codelabs. Tambien a帽adir que en los Codelabs marcan como "tareas a realizar por nosotros mismos" las cuales tambien se han ido completando. A partir del 1.4 sido con el curso no obselto -> continuo con este curso https://developer.android.com/courses/pathways/android-basics-kotlin-unit-2-pathway-1?hl=es-419. 

## **Lecci贸n 1**
### **Codelab 1.1 (Primer Proyecto)**
Compruebo que la instalaci贸n de Android-Studio y que todo funciona correctamente. Creo mi primer proyecto y sigo el curso de Codelabs 1.1. Comrpuebo que los cambios realizados sobre el TextView se han realizado.

---
### **Codelab 1.2 (DiceRoller)**
Aprendo un poco mas como funciona Android-Studio y su multiples ficheros y archivos. A帽adiendo mas funcionalidad a las plicaciones creadas como botones y eventos a ellos.

---
### **Codelab 1.3 (DiceRoller)**
Continuo con la aplicaci贸n creada en el anterior Codelab. A帽ado imagenes a la aplicaci贸n y como se empieza a complicar la cosa tambien explican una manera m谩s f谩cil de cargar las imagenes sin la necesidad de estar buscando la imagen desde el directorio raiz todo el rato. Explican un poco como funcionan las versiones de Android dentro de un proyecto.

---
### **Codelab 1.4 (Plantilla_Basica y sunflower-main)**
Nuevos pryectos creados, en el primero se aprende el manejo de las plantillas, en el segundo a cambiar el icono por defecto de la aplicaci贸n.

---  
## **Unidad 2: Layouts**
### **Get user input in a app: Part 1**
#### **Clases y herencias en Kotlin**
Accedo al Playground de Kotlin en https://developer.android.com/training/kotlinplayground. Desde aqu铆 es donde practico esta parte del tema, en la cual ejecuto c贸digo de Kotlin. El archivo de este Codelab tiene extenci贸n ".txt".

---
#### **C贸mo crear dise帽os XML para Android**
Se crea un nuevo proyecto "TipTime" en cual se pretende hacer una calculadora de propinas, como App para m贸viles. Se comprende mas sobre los archivos XML.

---
# Notas de Crist贸bal Jim茅nez 馃摑
Empec茅 a hacer los Codelabs de la p谩gina deprecada, y decid铆 cambiar a la p谩gina no deprecada, por lo que los Codelab 1, 2 y 3, son de la p谩gina deprecada y los Codelab 1.5 en adelante son de la [p谩gina no deprecada](https://developer.android.com/courses/fundamentals-training/toc-v2).  

Es bastante molesto que solo haya Codelabs en Java (o al menos no he sido capaz de encontrarlos), por lo que buscando algo de ayuda llegu茅 a otra p谩gina de androdi studio, para poder llegar a un certificado, donde hay ayudas -> [Android Basics](https://developer.android.com/courses/android-basics-kotlin/course).

## **Unidad 1**
### **Lecci贸n 1**
#### **Codelab 1.1** 馃憢
Log y cambiar "Hello World!" por "Feliz Cumplea帽os X"  

---
#### **Codelab 1.2** 馃敇
Cambio de texto al pulsar un bot贸n.  
Bot贸n que al clicar genera un n潞 aleatorio del 1 al 6.  
Bot贸n de contador que va sumando 1 cada vez que se pulsa. 

---
#### **Codelab 1.3** 馃幉
Al pulsar un bot贸n se tiran 2 dados.  
El ejercicio de este Codelab era **trabajar con las fotos** de los dados.  

---
#### **Codelab 1.4 ( 1.2 entero del nuevo )** 馃摬
Se **desarrolla un contador**, con capacidad para reiniciar, y se investiga sobre la pantalla, tener un layout para la forma horizontal, y otro layout para una tablet.  
  
---
#### **Codelab 1.5 ( 1.3 del nuevo )** 猬囷笍
**Se explora el fichero _string.xml_**, en el que se pueden colocar las strings para luego poder usarlas en el dise帽o final.   
**Se explora sobre el _scroll_**, y las distintas formas de colocar el layout para que quede bien.  

>Esta me llev贸 much铆simo tiempo, me daba un error raro, hasta que decid铆 borrar todo el proyecto y **volver a empezar**, y as铆 ocurri贸 todo a la primera.

---
#### **Codelab 1.6 ( 1.4 del nuevo )** 馃攳
Se habla sobre:  
- **Cambio del icono** de la aplicaci贸n.

 ![Foto del icono creado] (Cristobal/Codelab1.6 (1.4 del nuevo)/ic_launcher.png) 
>Podr铆a ser mi incapacidad para leer, pero muchas veces ocurr铆a que las im谩genes **no se actualizaban**, hasta que decid铆 manualmente eliminar las plantillas de fotos que hab铆a por defecto, y dejar solo la creada.

- **Uso de las plantillas** con intenci贸n de modificarlas y ciertos concimientos de la plantilla _"Actividad B谩sica"_.  
- **Importaci贸n de plantillas de ejemplo** "por defecto", de forma m谩s compleja e instalaci贸n y documentaci贸n del SDK.  
- **Conocimientos** sobre algunas p谩ginas de ayuda y uso de _tags_ para la b煤squeda en stack overflow.

---
### **Lecci贸n 2**
#### **Codelab 2.1** 馃槫
Se realiz贸 una **aplicacion** con posibilidad de escribir texto, y al pulsar un bot贸n, el texto pasa de la primera pantalla a la segunda.  
Se aprendi贸 el uso de _**intent**_ para poder pasar de una pantalla a otra.  
Se aprendi贸 el uso de _**contextos**_ para poder decir saber de qu茅 p谩gina venimos y en qu茅 p谩gina estamos.
> Esta tonter铆a me ha llevado **otras 3 horas**, debido a que la p谩gina nueva est谩 escrita para java (por lo que hay funciones que no se escriben de la misma manera), y la informaci贸n general sobre como funciona la transici贸n de pantallas **me result贸 confusa**. Hasta que intentando que funcionara de distintas formas, sali贸 algo aceptable.

---
#### **Codelab 2.2** 馃  
Se reforz贸 la idea de los contextos, adem谩s, se aprendi贸 el ciclo de vida de un programa.  

- onCreate()
- onStart()
- onPause()
- onRestart()
- onResume()
- onStop()
- onDestroy()

Se usa con los Log.d, por lo que podemos ver con cada movimiento de la aplicaci贸n en qu茅 estado se encuentra.  
Adem谩s, se hizo el [coding challenge](https://developer.android.com/codelabs/android-training-activity-lifecycle-and-state?index=..%2F..%2Fandroid-training#4) que consist铆a en tener dos pantallas, la pantalla 1, donde se muestre una palabra, y la pantalla 2, con un conjunto de posibilidades, y al clicar alguna de estas, se muestre la palabra en la pantalla 1.

---
#### **Codelab 2.3** 馃搷  
Se aprendi贸n los distintos tipos de entrada de texto:
- **Web** - Podemos escribir una p谩gina web, y si existe nos llevar谩 a ella.
- **Ubicaci贸n** - Podemos escribir una direcci贸n, y nos llevar谩 a ella.
- **Texto** - Podemos escribir un texto, y al clicar el bot贸n podremos elegir en qu茅 aplicaci贸n queremos enviarlo.

---
### **Lecci贸n 3**
#### **Codelab 3.1** 馃悶
Se aprendi贸n el uso del **_Debugger/Depurador_** sobre un proyecto de calculadora (para simplificar, decid铆 hacer yo una calculadora, y no usar la plantilla).


---
#### **Codelab 3.2** 馃И锔?
Se aprendi贸n el uso de los **_Test Unitarios_** sobre un proyecto de calculadora (Codelab 3.1).

---
#### **Codelab 3.3** 馃枌
Se aprendi贸n el uso de las **_Librer铆as_** sobre un proyecto de en blanco, que consiste en cambiar de color una frase.  

---  

## **Unidad 2**
### **Lecci贸n 4**
#### **Codelab 4.1** 馃崹
Se aprendi贸 la forma de usar **_im谩genes_**, y las distintas utilidades que puede llegar a tener los codelabs anteriores, haciendo uso de los _intent_, los _onclick_, las _variabels globales_ y los datos entre dos actividades distintas.

---
#### **Codelab 4.2** 馃梻
En esta secci贸n se aprendi贸 las distintas formas de usar un "_input_", el uso del _radioButton_, y el uso del _spinner_ (lista desplegable con cosas) en la aplicaci贸n creada en el Codelab 4.1.
