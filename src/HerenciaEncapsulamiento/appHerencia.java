package HerenciaEncapsulamiento;
public class appHerencia {
    public static void main(String[] args) throws Exception {
        
        empleadoHerencia emple = new empleadoHerencia(1, 12, "Alex", "Hernandez", "Hernandez", "Desarollo", 2.500);
        System.out.println(emple.getId());
    }
}