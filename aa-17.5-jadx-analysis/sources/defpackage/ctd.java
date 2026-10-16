package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class ctd implements ctq {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ Map c;
    final /* synthetic */ afec d;
    final /* synthetic */ cte e;
    final /* synthetic */ ctl f;
    final /* synthetic */ afec g;

    public ctd(int i, int i2, Map map, afec afecVar, cte cteVar, ctl ctlVar, afec afecVar2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = afecVar;
        this.e = cteVar;
        this.f = ctlVar;
        this.g = afecVar2;
    }

    @Override // defpackage.ctq
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ctq
    public final int c() {
        return this.a;
    }

    @Override // defpackage.ctq
    public final Map f() {
        return this.c;
    }

    @Override // defpackage.ctq
    public final afec g() {
        return this.d;
    }

    @Override // defpackage.ctq
    public final void h() {
        cxl cxlVar;
        if (!this.e.eM() || (cxlVar = ((cwq) this.f.a.p()).g) == null) {
            this.g.invoke(this.f.a.p().n);
        } else {
            this.g.invoke(cxlVar.n);
        }
    }

    @Override // defpackage.ctq
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.ctq
    public final /* synthetic */ void j() {
    }
}
