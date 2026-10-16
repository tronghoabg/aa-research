package A7;

/* renamed from: A7.d1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0244d1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f845a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f847c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y f850f;

    public RunnableC0244d1(P0 p02, F0 f02, long j8, boolean z2, F0 f03) {
        this.f848d = f02;
        this.f846b = j8;
        this.f847c = z2;
        this.f849e = f03;
        this.f850f = p02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f845a) {
            case 0:
                P0 p02 = (P0) this.f850f;
                F0 f02 = (F0) this.f848d;
                p02.n0(f02);
                P0.p0((P0) this.f850f, (F0) this.f848d, this.f846b, false, this.f847c);
                P0.q0(p02, f02, (F0) this.f849e);
                break;
            default:
                ((C0259i1) this.f850f).m0((C0262j1) this.f848d, (C0262j1) this.f849e, this.f846b, this.f847c, null);
                break;
        }
    }

    public RunnableC0244d1(C0259i1 c0259i1, C0262j1 c0262j1, C0262j1 c0262j12, long j8, boolean z2) {
        this.f848d = c0262j1;
        this.f849e = c0262j12;
        this.f846b = j8;
        this.f847c = z2;
        this.f850f = c0259i1;
    }
}
