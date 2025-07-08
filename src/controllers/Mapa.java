package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
    }

    public void ejemploConLinkedHashMap() {
        Map<String, Integer> productos =new LinkedHashMap<>();
        productos.put("Carro",200);
        productos.put("Moto",780);
        productos.put("Motoneta",440);
        productos.put("Ferrari",410);
        productos.put("Policia",50);
        productos.put("Pionero",50);
        System.out.println("Mapa de productos");
        for(String pais : productos.keySet()) System.out.println("producto: "+pais+", Precio: "+productos.get(pais));

        Integer capital = productos.get("Carro");
        System.out.println("El precio del carro es: "+capital);

       

    }

    public void ejemploConHashMap() {
        Map<String,String> capitales = new HashMap<>();
        capitales.put("Ecuador","Quito");
        capitales.put("Peru","Lima");
        capitales.put("Colombia","Bogota");
        System.out.println("Mapa de capitales");
        for(String pais : capitales.keySet()) System.out.println("Pais: "+pais+"Capital: "+capitales.get(pais));

        String capital = capitales.get("Ecuador");
        System.out.println("La capital de Ecuador es: "+capital);
         
        Map<Integer, Empleado> empleados = new HashMap<>();
        empleados.put(3,new Empleado(3, "Pedro", "Tester"));
        empleados.put(1,new Empleado(1, "Ana", "Dev"));
        empleados.put(2,new Empleado(2, "Luis", "Diseñador"));
        empleados.put(1,new Empleado(3, "Pedro", "Tester"));

        
        System.out.println("Mapa empleados");
        for(Map.Entry<Integer, Empleado> entry : empleados.entrySet()) System.out.println("Clave: "+entry.getKey()+", Valor: "+entry.getValue());

        Map<Empleado, Integer> empleados2 = new HashMap<>();
        empleados2.put(new Empleado(3, "Pedro", "Tester"),1000);
        empleados2.put(new Empleado(1, "Ana", "Dev"),1200);
        empleados2.put(new Empleado(1, "Ana", "Dev"),1700);
        empleados2.put(new Empleado(1, "Ana", "Dev"),7200);

        System.out.println("Mapa empleados 2");
        for(Map.Entry< Empleado, Integer> entry : empleados2.entrySet()) System.out.println("Clave: "+entry.getKey()+", Valor: "+entry.getValue());
    }

    public void ejemploConTreeMap() {
        Map<Integer, String> personas =new TreeMap<>();
        personas.put(1, "Einar");
        personas.put(2, "Cristian");
        personas.put(3, "Juan");
        personas.put(4, "Pedro");
        System.out.println("Mapa de personas");
        for(int codigo : personas.keySet()) System.out.println("Codigo: "+codigo+" Nombre: "+personas.get(codigo));

        String nombre = personas.get(1);
        System.out.println("La persona 1 es: "+nombre);

        System.out.println("Mapa empleados tree");
        Map<Empleado, Integer> empleados2 = new TreeMap<>();
        empleados2.put(new Empleado(3, "Pedro", "Tester"),1000);
        empleados2.put(new Empleado(1, "Ana", "Dev"),1200);
        empleados2.put(new Empleado(1, "Ana", "Dev"),1700);
        empleados2.put(new Empleado(1, "Ana", "Dev"),7200);


        for(Map.Entry< Empleado, Integer> entry : empleados2.entrySet()) System.out.println("Clave: "+entry.getKey()+", Valor: "+entry.getValue());
       
    }
}
