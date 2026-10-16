package j$.util.stream;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class w5 extends n5 {

    /* renamed from: b, reason: collision with root package name */
    public long f50661b;

    /* renamed from: c, reason: collision with root package name */
    public long f50662c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f50663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(t5 t5Var, long j2, long j3) {
        super(t5Var);
        this.f50663d = j2;
        this.f50661b = j2;
        this.f50662c = j3 < 0 ? Long.MAX_VALUE : j3;
    }

    @Override // j$.util.stream.r5, j$.util.stream.t5
    public final void accept(int i2) {
        long j2 = this.f50661b;
        if (j2 != 0) {
            this.f50661b = j2 - 1;
            return;
        }
        long j3 = this.f50662c;
        if (j3 > 0) {
            this.f50662c = j3 - 1;
            this.f50539a.accept(i2);
        }
    }

    @Override // j$.util.stream.n5, j$.util.stream.t5
    public final void l(long j2) {
        this.f50539a.l(e6.a(j2, this.f50663d, this.f50662c));
    }

    @Override // j$.util.stream.n5, j$.util.stream.t5
    public final boolean o() {
        return this.f50662c == 0 || this.f50539a.o();
    }
}
