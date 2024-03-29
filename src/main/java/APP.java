public class APP {

    public static void inicializar() {
        Restaurant  restaurant= new Restaurant();

        Local local=new Local("Local1","Temuco",100);

        restaurant.setIngresoEsperado(6000);

        restaurant.asignarLocal(local);
        
        restaurant.cerrarLocal(local);

        restaurant.venderLocal(local,50000,"Local1");

        restaurant.transformarLocal(local,"Local1","Local3","Santiago","ferreteria");

        restaurant.crearLocal("Local2","Valdivia",3500);

    }
    public static void main(String[]args) {inicializar();}


}
