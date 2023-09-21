package model.toy;

public class Toy implements Comparable<Toy>, ToyItem<Toy> {
    private long id;
    private String name;
    private int frequency;
    public Toy(String name, int frequency) {
        id = -1;
        this.name = name;
        this.frequency = frequency;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
    public int getFrequency() {
        return frequency;
    }
    @Override
    public String toString() {
        return "Игрушка{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", frequency=" + frequency +
                '}';
    }
    @Override
    public int compareTo(Toy o) {
        return name.compareTo(o.name);
    }
}
