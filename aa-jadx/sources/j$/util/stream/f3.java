package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f3 extends j$.util.stream.o2 {
    public final java.util.Comparator b;
    public boolean c;

    public f3(j$.util.stream.z2 z2Var, java.util.Comparator comparator) {
        super(z2Var);
        this.b = comparator;
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final boolean s() {
        this.c = true;
        return false;
    }
}
