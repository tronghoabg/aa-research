package j$.util.stream;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class u5 extends p5 {

    /* renamed from: b, reason: collision with root package name */
    public long f50634b;

    /* renamed from: c, reason: collision with root package name */
    public long f50635c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f50636d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(t5 t5Var, long j2, long j3) {
        super(t5Var);
        this.f50636d = j2;
        this.f50634b = j2;
        this.f50635c = j3 < 0 ? Long.MAX_VALUE : j3;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        long j2 = this.f50634b;
        if (j2 != 0) {
            this.f50634b = j2 - 1;
            return;
        }
        long j3 = this.f50635c;
        if (j3 > 0) {
            this.f50635c = j3 - 1;
            this.f50576a.accept((t5) obj);
        }
    }

    @Override // j$.util.stream.p5, j$.util.stream.t5
    public final void l(long j2) {
        this.f50576a.l(e6.a(j2, this.f50636d, this.f50635c));
    }

    @Override // j$.util.stream.p5, j$.util.stream.t5
    public final boolean o() {
        return this.f50635c == 0 || this.f50576a.o();
    }
}
