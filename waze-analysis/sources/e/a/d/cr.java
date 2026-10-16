package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cr extends gq {

    /* renamed from: b, reason: collision with root package name */
    private boolean f46763b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a.ee f46764c;

    /* renamed from: d, reason: collision with root package name */
    private final ag f46765d;

    /* renamed from: e, reason: collision with root package name */
    private final e.a.p[] f46766e;

    public cr(e.a.ee eeVar, ag agVar, e.a.p[] pVarArr) {
        com.google.d.b.an.m(!eeVar.l(), "error must not be OK");
        this.f46764c = eeVar;
        this.f46765d = agVar;
        this.f46766e = pVarArr;
    }

    @Override // e.a.d.gq, e.a.d.af
    public final void b(dn dnVar) {
        dnVar.b("error", this.f46764c);
        dnVar.b("progress", this.f46765d);
    }

    @Override // e.a.d.gq, e.a.d.af
    public final void m(ah ahVar) {
        com.google.d.b.an.v(!this.f46763b, "already started");
        this.f46763b = true;
        int i2 = 0;
        while (true) {
            e.a.p[] pVarArr = this.f46766e;
            if (i2 >= pVarArr.length) {
                ahVar.c(this.f46764c, this.f46765d, new e.a.cm());
                return;
            } else {
                e.a.p pVar = pVarArr[i2];
                i2++;
            }
        }
    }

    public cr(e.a.ee eeVar, e.a.p[] pVarArr) {
        this(eeVar, ag.f46605a, pVarArr);
    }
}
