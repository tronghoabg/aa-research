package j$.util.stream;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class a3 extends o2 {
    public long b;
    public long c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(z2 z2Var, long j, long j2) {
        super(z2Var);
        this.d = j;
        this.b = j;
        this.c = j2 < 0 ? Long.MAX_VALUE : j2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            ((z2) this.a).accept((z2) obj);
        }
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final void p(long j) {
        ((z2) this.a).p(j >= 0 ? Math.max(-1L, Math.min(j - this.d, this.c)) : -1L);
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final boolean s() {
        return this.c == 0 || ((z2) this.a).s();
    }
}
