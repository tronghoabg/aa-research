package defpackage;

/* loaded from: classes2.dex */
public final class grg implements gvg {
    public final geu a;
    public final gbl b;
    public final aiyk c;
    public final aiyk d;
    public final aiyk e;
    public final aiyk f;
    public final aiyk g;
    public final aiyk h;
    public final aiyk i;
    public final aiyk j;
    public final aiyk k;
    private final gqo l;
    private final aiyk m;
    private final aizz n;
    private final ajab o;

    public grg(geu geuVar) {
        this.a = geuVar;
        ajab ajabVarA = ajac.a(aiyj.a);
        this.o = ajabVarA;
        gbl gblVar = (gbl) geuVar.F(gbl.class);
        this.b = gblVar;
        gqo gqoVar = new gqo(geuVar);
        this.l = gqoVar;
        this.c = gqoVar.m;
        this.d = gqoVar.h;
        this.e = gqoVar.i;
        this.f = gqoVar.j;
        this.g = gqoVar.g;
        this.h = gqoVar.k;
        this.i = gqoVar.l;
        this.j = gqoVar.n;
        this.k = new fuu(gblVar.a(), this, 13);
        gon gonVar = new gon((afck) null, this, 4);
        int i = aizc.a;
        this.m = new ajaq(gonVar, ajabVarA);
        this.n = afrg.w(new ajaq(new gon(null, this, 5, null), ajabVarA), dty.f(geuVar.c().a()), new aizy(5000L), null);
    }

    @Override // defpackage.gvg
    public final aiyk a() {
        return this.m;
    }

    @Override // defpackage.gvg
    public final aizz b() {
        return this.n;
    }

    @Override // defpackage.gvg
    public final void c(aiyk aiykVar) {
        this.o.d(aiykVar);
    }
}
