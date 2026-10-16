package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z1 extends java.util.concurrent.CountedCompleter {
    public final j$.util.stream.j0 a;
    public final int b;

    public z1(j$.util.stream.j0 j0Var) {
        this.a = j0Var;
        this.b = 0;
    }

    public abstract void a();

    public abstract j$.util.stream.z1 b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        int i;
        while (this.a.l() != 0) {
            this.setPendingCount(this.a.l() - 1);
            int i2 = 0;
            int iCount = 0;
            while (true) {
                int iL = this.a.l() - 1;
                i = this.b;
                if (i2 < iL) {
                    j$.util.stream.z1 z1VarB = this.b(i2, i + iCount);
                    iCount = (int) (z1VarB.a.count() + ((long) iCount));
                    z1VarB.fork();
                    i2++;
                }
            }
            this = this.b(i2, i + iCount);
        }
        this.a();
        this.propagateCompletion();
    }

    public z1(j$.util.stream.z1 z1Var, j$.util.stream.j0 j0Var, int i) {
        super(z1Var);
        this.a = j0Var;
        this.b = i;
    }
}
