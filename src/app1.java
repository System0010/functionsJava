public class app1 {
  public static void main(String[] args) {
    Functions01 f = new Functions01();
    double dFinalPrice = f.getPriceWiva(20.3d);
    System.out.println("the final price is " + dFinalPrice + "$");

    int iFinalPrice = f.getPriceWiva(300);
    System.out.println("the Integer final price is " + iFinalPrice + "$");


    String[] nombres = {"juan","pedro","alberto","jaime","natalia","emilio"};
    Leer lectura = new Leer();
    lectura.LeerNombres(nombres);
  }
}