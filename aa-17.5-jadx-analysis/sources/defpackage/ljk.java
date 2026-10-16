package defpackage;

import android.content.Context;
import android.location.Location;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class ljk implements liu {
    private static final yph n = yph.c("GH.LocationManager");
    liy a;
    liz b;
    ljl c;
    ljc d;
    aebq m;
    private final Context o;
    private boolean p;
    public final List e = new CopyOnWriteArrayList();
    public final List f = new CopyOnWriteArrayList();
    public final List g = new CopyOnWriteArrayList();
    public final List h = new CopyOnWriteArrayList();
    public final List i = new CopyOnWriteArrayList();
    final lis j = new ljj(this);
    final lit k = new lit() { // from class: ljg
        @Override // defpackage.lit
        public final void a(boolean z) {
            Iterator it = this.a.f.iterator();
            while (it.hasNext()) {
                ((lit) it.next()).a(z);
            }
        }
    };
    final liq l = new liq() { // from class: ljh
        @Override // defpackage.liq
        public final void a(boolean z) {
            Iterator it = this.a.g.iterator();
            while (it.hasNext()) {
                ((liq) it.next()).a(z);
            }
        }
    };
    private final lio q = new lio() { // from class: lji
        @Override // defpackage.lio
        public final void a(boolean z) {
            Iterator it = this.a.h.iterator();
            while (it.hasNext()) {
                ((lio) it.next()).a(z);
            }
        }
    };
    private final lip r = new nfb(this, 1);

    public ljk(Context context) {
        context.getClass();
        this.o = context;
    }

    @Override // defpackage.liu
    public final int a() {
        aebq aebqVar = this.m;
        if (aebqVar == null) {
            return -1;
        }
        return aebqVar.a;
    }

    @Override // defpackage.liu
    public final Location b() {
        liy liyVar = this.a;
        if (liyVar == null) {
            return null;
        }
        return liyVar.a;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.lhg
    public final void c() {
        if (!lgv.c().s()) {
            ((ype) n.l().ai((char) 3977)).u("Fine location not available; can't access location data.");
            return;
        }
        if (kio.b().r()) {
            try {
                lau.a();
                roj rojVarF = oni.f(kio.b().e());
                if (ljm.b(rojVarF)) {
                    this.b = new ljm(rojVarF);
                    this.p = true;
                }
                if (lja.l(rojVarF)) {
                    this.a = new lja(rojVarF);
                }
                int i = ljl.e;
                if (rojVarF != null && rojVarF.d(11)) {
                    this.c = new ljl(rojVarF);
                }
                if (rojVarF != null && rojVarF.d(11)) {
                    this.d = new ljc(rojVarF);
                }
                if (rojVarF != null && rojVarF.d(7)) {
                    this.m = new aebq(rojVarF);
                }
            } catch (IllegalArgumentException | qrz | qsa e) {
                ((ype) ((ype) ((ype) n.h()).p(e)).ai((char) 3976)).u("Unable to get CarSensorManager. Not starting car sensor providers.");
            }
        }
        if (this.a == null) {
            this.a = new ljf(this.o);
        }
        if (this.b == null) {
            this.b = this.a;
        }
        if (this.c == null) {
            this.c = new ljl(null);
        }
        liz lizVar = this.b;
        lizVar.getClass();
        lizVar.h(this.c);
        this.b.h(this.j);
        ljl ljlVar = this.c;
        ljlVar.getClass();
        ljlVar.a.add(this.k);
        ljc ljcVar = this.d;
        if (ljcVar != null) {
            liq liqVar = this.l;
            ljcVar.a.add(liqVar);
            liqVar.a(ljcVar.c);
            ljc ljcVar2 = this.d;
            lio lioVar = this.q;
            ljcVar2.b.add(lioVar);
            lioVar.a(ljcVar2.d);
        }
        aebq aebqVar = this.m;
        if (aebqVar != null) {
            lip lipVar = this.r;
            aebqVar.c.add(lipVar);
            lipVar.a(aebqVar.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, qse] */
    @Override // defpackage.lhg
    public final void d() {
        liy liyVar = this.a;
        if (liyVar != null) {
            liyVar.i();
        }
        liz lizVar = this.b;
        if (lizVar != null) {
            lizVar.j(this.j);
            liy liyVar2 = this.a;
            liz lizVar2 = this.b;
            if (liyVar2 != lizVar2) {
                lizVar2.i();
            }
        }
        ljc ljcVar = this.d;
        if (ljcVar != null) {
            ljcVar.a.remove(this.l);
            this.d.b.remove(this.q);
            ljc ljcVar2 = this.d;
            ljcVar2.f.b(ljcVar2.e);
        }
        aebq aebqVar = this.m;
        if (aebqVar != null) {
            aebqVar.c.remove(this.r);
            aebq aebqVar2 = this.m;
            ((roj) aebqVar2.b).b(aebqVar2.d);
        }
        ljl ljlVar = this.c;
        if (ljlVar != null) {
            if (this.p) {
                ebf.j().x(8, ljlVar.c ? yyv.WHEEL_SPEED_WAS_NON_ZERO : yyv.WHEEL_SPEED_WAS_ALWAYS_ZERO);
            }
            liz lizVar3 = this.b;
            if (lizVar3 != null) {
                lizVar3.j(ljlVar);
            }
            ljlVar.a.remove(this.k);
            roj rojVar = ljlVar.d;
            if (rojVar != null) {
                rojVar.b(ljlVar);
            }
        }
        this.a = null;
        this.b = null;
        this.d = null;
        this.c = null;
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.i.clear();
    }

    @Override // defpackage.liu
    public final lir e() {
        liz lizVar = this.b;
        return lizVar == null ? lir.c : lizVar.d();
    }

    @Override // defpackage.liu
    public final Float f() {
        liz lizVar = this.b;
        if (lizVar == null) {
            return null;
        }
        return lizVar.f();
    }

    @Override // defpackage.liu
    public final void g(lio lioVar) {
        this.h.add(lioVar);
        lioVar.a(r());
    }

    @Override // defpackage.liu
    public final void h(lip lipVar) {
        this.i.add(lipVar);
        lipVar.a(a());
    }

    @Override // defpackage.liu
    public final void i(liq liqVar) {
        this.g.add(liqVar);
        liqVar.a(q());
    }

    @Override // defpackage.liu
    public final void j(lis lisVar) {
        this.e.add(lisVar);
        lisVar.b(f());
        lisVar.a(e());
    }

    @Override // defpackage.liu
    public final void k(lit litVar) {
        this.f.add(litVar);
        ljl ljlVar = this.c;
        if (ljlVar != null) {
            litVar.a(ljlVar.b);
        }
    }

    @Override // defpackage.liu
    public final void l(lio lioVar) {
        this.h.remove(lioVar);
    }

    @Override // defpackage.liu
    public final void m(lip lipVar) {
        this.i.remove(lipVar);
    }

    @Override // defpackage.liu
    public final void n(liq liqVar) {
        this.g.remove(liqVar);
    }

    @Override // defpackage.liu
    public final void o(lis lisVar) {
        this.e.remove(lisVar);
    }

    @Override // defpackage.liu
    public final void p(lit litVar) {
        this.f.remove(litVar);
    }

    @Override // defpackage.liu
    public final boolean q() {
        ljc ljcVar = this.d;
        return ljcVar != null && ljcVar.c;
    }

    @Override // defpackage.liu
    public final boolean r() {
        ljc ljcVar = this.d;
        return ljcVar != null && ljcVar.d;
    }

    @Override // defpackage.liu
    public final boolean s() {
        ljl ljlVar = this.c;
        return ljlVar != null && ljlVar.b;
    }
}
