package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Carro> listaCarro = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("Menu del taller");
            System.out.println("""
                    1.Registrar Vehiculo
                    2. Mostrar Detalles
                    3. Verificar Antiguedad
                    4. Verificar Mantenimiento
                    5. Calcular Consumo Combustible
                    6. Combustible Restante """);
                    opcion = input.nextInt();
            switch (opcion){
                case 1->{
                    System.out.println("Marca: ");
                    String marca = input.next();
                    System.out.println("Modelo: ");
                    String modelo = input.next();
                    System.out.println("Año: ");
                    Integer anio = input.nextInt();
                    System.out.println("Kilometraje: ");
                    Double kilometraje =  input.nextDouble();
                    System.out.println("Estado: ");
                    String estado = input.next();
                    System.out.println("Placa: ");
                    String placa = input.next();
                     Carro carros = new Carro(marca,modelo,anio,kilometraje,estado,placa);
                    listaCarro.add(carros);
                    System.out.println("Carro registrado exitosamente");
                }
                case 2->{
                    System.out.println("Listando todos los carros registrados.....");
                    if (listaCarro.isEmpty()) {
                        System.out.println("No hay carros registrados..");
                    }else {
                        for(int i =0; i<listaCarro.size();i++){
                            System.out.println(listaCarro.get(i));
                        }
                    }
                }
                case 3->{
                    System.out.println("Ingrese el numero de placa para verificar la antiguedad: ");
                    String placa  = input.next();

                    for (int i = 0; i<listaCarro.size();i++){
                        Carro carroBusqueda = listaCarro.get(i);

                        if (placa.equals(carroBusqueda.getPlaca()) ){
                            System.out.println(carroBusqueda.esAntiguo());
                        }else {
                            System.out.println("Placa del carro no encontrada");
                            break;
                        }
                    }
                }
                case 4->{
                    System.out.println("Ingrese el numero de placa para verificar si necesita mantenimiento: ");
                    String placa  = input.next();

                    for (int i = 0; i<listaCarro.size();i++){
                        Carro carroBusqueda = listaCarro.get(i);

                        if (placa.equals(carroBusqueda.getPlaca())){
                            System.out.println(carroBusqueda.necesitaMantenimiento());
                        }else {
                            System.out.println("Placa del carro no encontrada");
                            break;
                        }
                    }
                }
                case 5->{
                    System.out.println("Ingrese el numero de placa para mirar el consumo de combustible ");
                    String placa  = input.next();

                    for (int i = 0; i<listaCarro.size();i++){
                        Carro carroBusqueda = listaCarro.get(i);

                        if (placa.equals(carroBusqueda.getPlaca())){
                            System.out.println("Ingrese el rendimiento que ha tenido su vehiculo por km/g: ");
                            double consumo = input.nextDouble();
                            carroBusqueda.calcularConsumoCombustible(consumo);
                        }else {
                            System.out.println("Placa del carro no encontrada");
                            break;
                        }
                    }
                }
                case 6->{
                    System.out.println("Ingrese el numero de placa para verificar el combustible restante:  ");
                    String placa  = input.next();

                    for (int i = 0; i<listaCarro.size();i++){
                        Carro carroBusqueda = listaCarro.get(i);

                        if (placa.equals(carroBusqueda.getPlaca())){
                            System.out.println("Ingrese los km recorridos: ");
                            Double kilometros = input.nextDouble();
                            System.out.println("Ingrese el rendimiento que ha tenido su vehiculo: ");
                            Double rendimiento =  input.nextDouble();
                            carroBusqueda.combustibleRestante(kilometros,rendimiento);
                        }else {
                            System.out.println("Placa del carro no encontrada");
                            break;
                        }
                    }
                }
                case 7->{
                    System.out.println("ADIOS VUELVA PRONTO...... ");
                }
            }
        }while (opcion!=7);


    }

}