package org.example;

public class Carro {
    private String marca;
    private String modelo;
    private Integer anio;
    private Double kilometraje;
    private String estado;
    private String placa;

    public Carro() {
    }

    public Carro(String marca, String modelo, Integer anio, Double kilometraje, String estado, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.estado = estado;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", kilometraje=" + kilometraje +
                ", estado='" + estado + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }

    public void mostrarDetalles(){

        System.out.println("Informacion del vehiculo\n");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año: "+anio);
        System.out.println("Kilometraje: "+kilometraje);
        System.out.println("Estado: "+estado);
    }
    public void actualziarKm(Double kilometraje){
        if (kilometraje>0){
            this.kilometraje = kilometraje;
        }else {
            System.out.println("El kilometraje tiene que ser > a 0");
        }

    }
    public boolean esAntiguo(){
        int calculo = anio-2025;
        if (calculo<15){
            System.out.println("Este carro no esta antiguo ya que tiene menos de 15 años de antiguedad, tiene: "+ calculo);
            return false;
        }else {
            System.out.println("Este carro es antiguo tiene mas de: " + calculo + "años de antiguedad");
            return true;
        }
    }
    public boolean necesitaMantenimiento(){
        if (kilometraje<100000){
            System.out.println("Este carro no necesita mantenimientos ya que solo tiene : "+ kilometraje + "kilometros");
            return false;
        }else {
            System.out.println("Este carro necesita mantenimiento, supera los 100mil kilometros, tiene: " + kilometraje);
            return true;
        }
    }
    public void calcularConsumoCombustible(Double rendimiento){
        Double consumo = kilometraje/rendimiento;
        System.out.println("El consumo del carro es: "+ consumo);
    }

    public void combustibleRestante(Double kmRecorridos, Double rendimiento){
        Double combustible = kmRecorridos-rendimiento;
        System.out.println("Al vehiculo de queda: "+ combustible +" de gasolina");
    }
}
