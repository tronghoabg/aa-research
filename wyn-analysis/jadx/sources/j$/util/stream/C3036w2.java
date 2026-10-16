package j$.util.stream;

/* renamed from: j$.util.stream.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3036w2 extends AbstractC2987m2 {

    /* renamed from: b, reason: collision with root package name */
    long f38342b;

    /* renamed from: c, reason: collision with root package name */
    long f38343c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3041x2 f38344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3036w2(C3041x2 c3041x2, InterfaceC3011r2 interfaceC3011r2) {
        super(interfaceC3011r2);
        this.f38344d = c3041x2;
        this.f38342b = c3041x2.f38349m;
        long j8 = c3041x2.f38350n;
        this.f38343c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // j$.util.stream.AbstractC2987m2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38258a.l(C2.a(j8, this.f38344d.f38349m, this.f38343c));
    }

    @Override // j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final void accept(long j8) {
        long j10 = this.f38342b;
        if (j10 == 0) {
            long j11 = this.f38343c;
            if (j11 > 0) {
                this.f38343c = j11 - 1;
                this.f38258a.accept(j8);
                return;
            }
            return;
        }
        this.f38342b = j10 - 1;
    }

    @Override // j$.util.stream.AbstractC2987m2, j$.util.stream.InterfaceC3011r2
    public final boolean n() {
        return this.f38343c == 0 || this.f38258a.n();
    }
}
