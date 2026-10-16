package defpackage;

/* loaded from: classes2.dex */
public final class lnq extends eqj {
    final /* synthetic */ lnr a;
    private final String h;
    private boolean i;

    public lnq(lnr lnrVar, String str) {
        this.a = lnrVar;
        this.h = str;
    }

    @Override // defpackage.eqj
    protected final void c() {
        yph yphVar = lnr.a;
        ype ypeVar = (ype) yphVar.l().ai(4076);
        lnr lnrVar = this.a;
        zjd zjdVar = new zjd(zjc.a, lnrVar.b.a.flattenToShortString());
        String str = this.h;
        ypeVar.M("subscribe componentName=%s id=%s", zjdVar, str);
        llu lluVar = lnrVar.c;
        if (!lluVar.s()) {
            ((ype) ((ype) ((ype) yphVar.g()).q(ypd.LARGE)).ai((char) 4077)).u("subscription activated outside active connection lifetime, skipping");
            m(lpb.b(4));
        } else {
            m(lpb.b(1));
            lluVar.M(str, new lnp(this));
            this.i = true;
        }
    }

    @Override // defpackage.eqj
    protected final void d() {
        yph yphVar = lnr.a;
        ype ypeVar = (ype) yphVar.l().ai(4078);
        lnr lnrVar = this.a;
        zjd zjdVar = new zjd(zjc.a, lnrVar.b.a.flattenToShortString());
        String str = this.h;
        ypeVar.M("unsubscribe componentName=%s id=%s", zjdVar, str);
        if (!this.i) {
            ((ype) yphVar.l().ai((char) 4079)).u("subscription deactivated outside active connection lifetime, skipping");
        } else {
            lnrVar.c.r(str);
            this.i = false;
        }
    }
}
