 class Vehiculo {
    String tipo;
    public String getTipoVehiculo() {
        return tipo;
    }
}

class coche extends Vehiculo{

    public coche(String tipo) {this.tipo = tipo;}

}

class CocheElectrico extends Vehiculo{

    String baterias;

    public CocheElectrico(String tipo) {
        this.tipo = tipo;
        this.baterias = "si";

    }

    public String getBaterias() {
        return this.baterias;
    }

}

class CocheHibrido extends Vehiculo{

    String cambioDeMotor;

    public CocheHibrido(String tipo) {
        this.tipo = tipo;
        this.cambioDeMotor = "si";

    }

    public String getCambioDeMotor(){
        return this.cambioDeMotor;
    }

}

