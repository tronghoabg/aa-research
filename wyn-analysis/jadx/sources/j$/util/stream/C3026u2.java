package j$.util.stream;

/* renamed from: j$.util.stream.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3026u2 extends AbstractC2982l2 {

    /* renamed from: b, reason: collision with root package name */
    long f38320b;

    /* renamed from: c, reason: collision with root package name */
    long f38321c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3031v2 f38322d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3026u2(C3031v2 c3031v2, InterfaceC3011r2 interfaceC3011r2) {
        super(interfaceC3011r2);
        this.f38322d = c3031v2;
        this.f38320b = c3031v2.f38330l;
        long j8 = c3031v2.f38331m;
        this.f38321c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // j$.util.stream.AbstractC2982l2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38253a.l(C2.a(j8, this.f38322d.f38330l, this.f38321c));
    }

    @Override // j$.util.stream.InterfaceC3002p2, j$.util.stream.InterfaceC3011r2
    public final void accept(int i5) {
        long j8 = this.f38320b;
        if (j8 == 0) {
            long j10 = this.f38321c;
            if (j10 > 0) {
                this.f38321c = j10 - 1;
                this.f38253a.accept(i5);
                return;
            }
            return;
        }
        this.f38320b = j8 - 1;
    }

    @Override // j$.util.stream.AbstractC2982l2, j$.util.stream.InterfaceC3011r2
    public final boolean n() {
        return this.f38321c == 0 || this.f38253a.n();
    }
}
