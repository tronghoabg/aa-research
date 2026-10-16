package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hd {

    /* renamed from: a, reason: collision with root package name */
    private final e.a.bq f47074a;

    /* renamed from: b, reason: collision with root package name */
    private e.a.w f47075b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f47076c = false;

    /* renamed from: d, reason: collision with root package name */
    private e.a.x f47077d = e.a.x.b(e.a.w.f47854d);

    public hd(e.a.bq bqVar, e.a.w wVar) {
        this.f47074a = bqVar;
        this.f47075b = wVar;
    }

    static /* bridge */ /* synthetic */ void h(hd hdVar, e.a.w wVar) {
        boolean z;
        hdVar.f47075b = wVar;
        if (wVar == e.a.w.f47852b || wVar == e.a.w.f47853c) {
            z = true;
        } else if (wVar != e.a.w.f47854d) {
            return;
        } else {
            z = false;
        }
        hdVar.f47076c = z;
    }

    public final e.a.w c() {
        return this.f47075b;
    }

    public final e.a.bq f() {
        return this.f47074a;
    }

    public final boolean i() {
        return this.f47076c;
    }
}
