package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class y1 extends j$.util.stream.z1 {
    public final java.lang.Object[] c;

    public y1(j$.util.stream.y1 y1Var, j$.util.stream.j0 j0Var, int i) {
        super(y1Var, j0Var, i);
        this.c = y1Var.c;
    }

    @Override // j$.util.stream.z1
    public final void a() {
        this.a.h(this.c, this.b);
    }

    @Override // j$.util.stream.z1
    public final j$.util.stream.z1 b(int i, int i2) {
        return new j$.util.stream.y1(this, this.a.a(i), i2);
    }

    public y1(j$.util.stream.j0 j0Var, java.lang.Object[] objArr) {
        super(j0Var);
        this.c = objArr;
    }
}
