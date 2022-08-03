package gets_y_sets;


 public  class  Main {


     public static void main(String[] args) {

         getEdad();
         getNombre();
         getTelefono();

         setEdad();
         setNombre();
         setTelefono();

     }

     private static void setTelefono() {
         telefono();
         return;


     }

     private static void setNombre() {
         nombre();
         return;

     }

     private static void setEdad() {

         edad();
         return;


 }
     private static void getTelefono() {
         telefono();

     }

     private static void telefono() {
     }

     private static void getNombre() {
         nombre();

     }

     private static void nombre() {
     }

     private static void getEdad() {
         edad();

     }


     private static void edad() {

         System.out.println("telefono,nombre,edad");

     }
 }