package singleton;

public class HorarioBrasilia {

    private HorarioBrasilia() {};
    private static HorarioBrasilia instance = new HorarioBrasilia();
    public static HorarioBrasilia getInstance() {
        return instance;
    }

    private String pais;
    private double horario;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }
}
