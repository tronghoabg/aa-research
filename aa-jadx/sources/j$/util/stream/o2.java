package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o2 implements j$.util.stream.z2 {
    public java.lang.Object a;

    public o2(j$.util.stream.z2 z2Var) {
        z2Var.getClass();
        this.a = z2Var;
    }

    @Override // j$.util.stream.z2
    public /* synthetic */ void accept(int i) {
        j$.util.stream.a2.d();
        throw null;
    }

    @Override // java.util.function.Consumer
    public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.z2
    public void end() {
        ((j$.util.stream.z2) this.a).end();
    }

    public java.lang.Object get() {
        return this.a;
    }

    @Override // j$.util.stream.z2
    public void p(long j) {
        ((j$.util.stream.z2) this.a).p(j);
    }

    @Override // j$.util.stream.z2
    public boolean s() {
        return ((j$.util.stream.z2) this.a).s();
    }

    @Override // j$.util.stream.z2
    public /* synthetic */ void accept(long j) {
        j$.util.stream.a2.i();
        throw null;
    }
}
