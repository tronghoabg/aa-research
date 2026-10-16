package j$.util.stream;

/* loaded from: classes2.dex */
final class U3 extends AbstractC2982l2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f38114b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ V3 f38115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U3(V3 v32, InterfaceC3011r2 interfaceC3011r2) {
        super(interfaceC3011r2);
        this.f38115c = v32;
        this.f38114b = true;
    }

    @Override // j$.util.stream.AbstractC2982l2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38253a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC3002p2, j$.util.stream.InterfaceC3011r2
    public final void accept(int i5) {
        if (this.f38114b) {
            boolean zTest = this.f38115c.f38118l.test(i5);
            this.f38114b = zTest;
            if (zTest) {
                this.f38253a.accept(i5);
            }
        }
    }

    @Override // j$.util.stream.AbstractC2982l2, j$.util.stream.InterfaceC3011r2
    public final boolean n() {
        return !this.f38114b || this.f38253a.n();
    }
}
