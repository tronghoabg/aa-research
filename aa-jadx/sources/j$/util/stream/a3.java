package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class a3 extends j$.util.stream.o2 {
    public long b;
    public long c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(j$.util.stream.z2 z2Var, long j, long j2) {
        super(z2Var);
        this.d = j;
        this.b = j;
        this.c = j2 < 0 ? Long.MAX_VALUE : j2;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            ((j$.util.stream.z2) this.a).accept(obj);
        }
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final void p(long j) {
        ((j$.util.stream.z2) this.a).p(j >= 0 ? java.lang.Math.max(-1L, java.lang.Math.min(j - this.d, this.c)) : -1L);
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final boolean s() {
        return this.c == 0 || ((j$.util.stream.z2) this.a).s();
    }
}
