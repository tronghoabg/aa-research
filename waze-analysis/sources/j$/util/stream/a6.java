package j$.util.stream;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class a6 extends m5 {

    /* renamed from: b, reason: collision with root package name */
    public long f50331b;

    /* renamed from: c, reason: collision with root package name */
    public long f50332c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f50333d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(t5 t5Var, long j2, long j3) {
        super(t5Var);
        this.f50333d = j2;
        this.f50331b = j2;
        this.f50332c = j3 < 0 ? Long.MAX_VALUE : j3;
    }

    @Override // j$.util.stream.q5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        long j2 = this.f50331b;
        if (j2 != 0) {
            this.f50331b = j2 - 1;
            return;
        }
        long j3 = this.f50332c;
        if (j3 > 0) {
            this.f50332c = j3 - 1;
            this.f50521a.accept(d2);
        }
    }

    @Override // j$.util.stream.m5, j$.util.stream.t5
    public final void l(long j2) {
        this.f50521a.l(e6.a(j2, this.f50333d, this.f50332c));
    }

    @Override // j$.util.stream.m5, j$.util.stream.t5
    public final boolean o() {
        return this.f50332c == 0 || this.f50521a.o();
    }
}
