package j$.util.stream;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class y5 extends o5 {

    /* renamed from: b, reason: collision with root package name */
    public long f50708b;

    /* renamed from: c, reason: collision with root package name */
    public long f50709c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f50710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(t5 t5Var, long j2, long j3) {
        super(t5Var);
        this.f50710d = j2;
        this.f50708b = j2;
        this.f50709c = j3 < 0 ? Long.MAX_VALUE : j3;
    }

    @Override // j$.util.stream.s5, j$.util.stream.t5
    public final void accept(long j2) {
        long j3 = this.f50708b;
        if (j3 != 0) {
            this.f50708b = j3 - 1;
            return;
        }
        long j4 = this.f50709c;
        if (j4 > 0) {
            this.f50709c = j4 - 1;
            this.f50558a.accept(j2);
        }
    }

    @Override // j$.util.stream.o5, j$.util.stream.t5
    public final void l(long j2) {
        this.f50558a.l(e6.a(j2, this.f50710d, this.f50709c));
    }

    @Override // j$.util.stream.o5, j$.util.stream.t5
    public final boolean o() {
        return this.f50709c == 0 || this.f50558a.o();
    }
}
