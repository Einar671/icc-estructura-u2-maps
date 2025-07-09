import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;
import dao.EmpleadoDAO;
import dao.EmpleadoDAOHashMap;
import dao.EmpleadoDAOTreeMap;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        // runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoController1 = new EmpleadoContoller(empleadoDAOHash);
        EmpleadoDAO empleadoDAOTree= new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoController2 = new EmpleadoContoller(empleadoDAOTree);

        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");

        empleadoController1.agregarEmpleado(emp1);
        empleadoController1.agregarEmpleado(emp2);
        empleadoController1.agregarEmpleado(emp3);
        empleadoController1.agregarEmpleado(emp4);
        empleadoController1.agregarEmpleado(emp5);

        System.out.println("Empleados HashMap");
        empleadoController1.listarEmpleados();
        
        empleadoController2.agregarEmpleado(emp1);
        empleadoController2.agregarEmpleado(emp2);
        empleadoController2.agregarEmpleado(emp3);
        empleadoController2.agregarEmpleado(emp4);
        empleadoController2.agregarEmpleado(emp5);

        System.out.println("Empleados TreeMap");
        empleadoController2.listarEmpleados();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();
    }

    private static void runEjerccios() {
    }
}
