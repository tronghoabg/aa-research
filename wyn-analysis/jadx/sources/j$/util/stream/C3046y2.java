package j$.util.stream;

/* renamed from: j$.util.stream.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3046y2 extends AbstractC2977k2 {

    /* renamed from: b, reason: collision with root package name */
    long f38360b;

    /* renamed from: c, reason: collision with root package name */
    long f38361c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3051z2 f38362d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3046y2(C3051z2 c3051z2, InterfaceC3011r2 interfaceC3011r2) {
        super(interfaceC3011r2);
        this.f38362d = c3051z2;
        this.f38360b = c3051z2.f38363m;
        long j8 = c3051z2.f38364n;
        this.f38361c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // j$.util.stream.AbstractC2977k2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38245a.l(C2.a(j8, this.f38362d.f38363m, this.f38361c));
    }

    @Override // j$.util.stream.InterfaceC2997o2, j$.util.stream.InterfaceC3011r2
    public final void accept(double d3) {
        long j8 = this.f38360b;
        if (j8 == 0) {
            long j10 = this.f38361c;
            if (j10 > 0) {
                this.f38361c = j10 - 1;
                this.f38245a.accept(d3);
                return;
            }
            return;
        }
        this.f38360b = j8 - 1;
    }

    @Override // j$.util.stream.AbstractC2977k2, j$.util.stream.InterfaceC3011r2
    public final boolean n() {
        return this.f38361c == 0 || this.f38245a.n();
    }
}
