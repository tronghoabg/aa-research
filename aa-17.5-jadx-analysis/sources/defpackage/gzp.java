package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class gzp extends gwc {
    public static final yob a = yob.c("com/android/car/libraries/apphost/sectioneditem/SectionedItemTemplateInternalEmitter");
    public static final yob b = yob.c("com/android/car/libraries/apphost/sectioneditem/SectionedItemTemplateInternalEmitter");
    public final geu c;
    public final boolean d;
    public final gzl e;
    public final gzr f;
    public final aizk g;
    public final aiyk h;
    private boolean i;
    private final aiyk j;
    private final ajab k;

    public gzp(geu geuVar) {
        this.c = geuVar;
        gho ghoVar = (gho) geuVar.l(gho.class);
        if (ghoVar != null) {
            ghoVar.a = false;
        }
        this.d = ((ggk) geuVar.F(ggk.class)).A() && geuVar.i().c() >= 9;
        this.k = ajac.a(null);
        gzl gzlVar = new gzl();
        this.e = gzlVar;
        gzr gzrVar = new gzr();
        this.f = gzrVar;
        this.g = aizq.e(0, 1, 2, 1);
        hcg hcgVar = new hcg(new jxz(this.n, 6), new dxp(this, (afck) null, 6), 16);
        affq affqVar = new affq();
        affqVar.a = true;
        gzq gzqVar = new gzq(geuVar, affqVar, null);
        int i = aizc.a;
        fuu fuuVar = new fuu(new ajaq(gzqVar, hcgVar), gzrVar, 20);
        this.j = fuuVar;
        this.h = aiov.a(fuuVar, this.o, gzlVar.c, new gzo(this, null));
    }

    @Override // defpackage.gwc
    public final aiyk a() {
        return this.h;
    }

    @Override // defpackage.gwc
    public final Object b() {
        gzr gzrVar = this.f;
        return new gzn(gzrVar.a, gzrVar.b, gzrVar.e);
    }

    @Override // defpackage.gwc
    public final void c(Object obj) {
        gzn gznVar = obj instanceof gzn ? (gzn) obj : null;
        if (gznVar == null) {
            return;
        }
        this.f.a(gznVar.a, gznVar.b, gznVar.c);
    }

    public final fvs d(List list, boolean z) {
        boolean z2 = this.d;
        if (!z2) {
            if (z) {
                List listD = fxa.d(list, this.c);
                if (true == listD.isEmpty()) {
                    listD = null;
                }
                if (listD != null) {
                    return new fvs(woy.by(listD));
                }
            }
            return null;
        }
        if (!this.i && z2) {
            this.i = true;
            ajab ajabVar = this.k;
            gve gveVar = (gve) this.c.l(gve.class);
            if (gveVar != null) {
                gveVar.a().c(new fuu(new jxz(ajabVar, 6), this, 19));
            }
        }
        this.k.d(list);
        return null;
    }

    @Override // defpackage.gwc
    public final void f() {
        this.g.c(afak.a);
    }
}
