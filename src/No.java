public class No {
    No esq;
    No dir;
    int dado;

    public No(int dado, No dir, No esq) {
        this.esq = esq;
        this.dir = dir;
        this.dado = dado;
    }

    public No() {
    }
}
