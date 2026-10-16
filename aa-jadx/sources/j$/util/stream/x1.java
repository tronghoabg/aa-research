package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public class x1 extends j$.util.stream.z1 {
    public final java.lang.Object c;

    public x1(j$.util.stream.x1 x1Var, j$.util.stream.i0 i0Var, int i) {
        super(x1Var, i0Var, i);
        this.c = x1Var.c;
    }

    @Override // j$.util.stream.z1
    public final void a() {
        ((j$.util.stream.i0) this.a).d(this.b, this.c);
    }

    @Override // j$.util.stream.z1
    public final j$.util.stream.z1 b(int i, int i2) {
        return new j$.util.stream.x1(this, ((j$.util.stream.i0) this.a).a(i), i2);
    }

    public x1(j$.util.stream.i0 i0Var, java.lang.Object obj) {
        super(i0Var);
        this.c = obj;
    }
}
