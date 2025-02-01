public class Mesa {
    public int id;
    public int lugares;

    public Mesa(int id, int lugares) {
        this.id = id;
        this.lugares = lugares;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }
}
