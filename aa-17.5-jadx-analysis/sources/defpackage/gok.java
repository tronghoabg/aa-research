package defpackage;

/* loaded from: classes2.dex */
public final class gok extends gwc {
    public final geu a;
    public final gog b;
    public final gph c;
    public final int d;
    public final ajab e;
    private final gpc f;
    private final aiyk g;
    private final aiyk h;

    public gok(geu geuVar) {
        this.a = geuVar;
        gog gogVar = (gog) ((gyw) geuVar.F(gyw.class)).a(gos.class);
        this.b = gogVar;
        ajab ajabVarA = ajac.a(afbe.a);
        this.e = ajabVarA;
        gpc gpcVarA = ((gpd) geuVar.F(gpd.class)).a();
        this.f = gpcVarA;
        this.c = gpcVarA.g();
        this.d = afgi.k(geuVar.getResources().getDisplayMetrics().density * 8.0f);
        jyc jycVar = new jyc(new jxz(this.n, 6), this.o, new goi(this, null), 5);
        this.g = jycVar;
        this.h = aiov.a(gogVar.e, ajabVarA, jycVar, goj.a);
    }

    @Override // defpackage.gwc
    public final aiyk a() {
        return this.h;
    }
}
