package j$.util.stream;

/* renamed from: j$.util.stream.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3016s2 extends AbstractC2992n2 {

    /* renamed from: b, reason: collision with root package name */
    long f38306b;

    /* renamed from: c, reason: collision with root package name */
    long f38307c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3021t2 f38308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3016s2(C3021t2 c3021t2, InterfaceC3011r2 interfaceC3011r2) {
        super(interfaceC3011r2);
        this.f38308d = c3021t2;
        this.f38306b = c3021t2.f38314m;
        long j8 = c3021t2.f38315n;
        this.f38307c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // j$.util.stream.AbstractC2992n2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38260a.l(C2.a(j8, this.f38308d.f38314m, this.f38307c));
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        long j8 = this.f38306b;
        if (j8 == 0) {
            long j10 = this.f38307c;
            if (j10 > 0) {
                this.f38307c = j10 - 1;
                this.f38260a.accept((InterfaceC3011r2) obj);
                return;
            }
            return;
        }
        this.f38306b = j8 - 1;
    }

    @Override // j$.util.stream.AbstractC2992n2, j$.util.stream.InterfaceC3011r2
    public final boolean n() {
        return this.f38307c == 0 || this.f38260a.n();
    }
}
