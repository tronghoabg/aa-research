package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ljr implements defpackage.ljb {
    private static final defpackage.yqm n = defpackage.yqm.c("GH.LocationManager");
    defpackage.ljf a;
    defpackage.ljg b;
    defpackage.ljs c;
    defpackage.ljj d;
    defpackage.aecq m;
    private final android.content.Context o;
    private boolean p;
    public final java.util.List e = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.List f = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.List g = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.List h = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.List i = new java.util.concurrent.CopyOnWriteArrayList();
    final defpackage.liz j = new defpackage.ljq(this);
    final defpackage.lja k = new defpackage.lja() { // from class: ljn
        @Override // defpackage.lja
        public final void a(boolean z) {
            java.util.Iterator it = this.a.f.iterator();
            while (it.hasNext()) {
                ((defpackage.lja) it.next()).a(z);
            }
        }
    };
    final defpackage.lix l = new defpackage.lix() { // from class: ljo
        @Override // defpackage.lix
        public final void a(boolean z) {
            java.util.Iterator it = this.a.g.iterator();
            while (it.hasNext()) {
                ((defpackage.lix) it.next()).a(z);
            }
        }
    };
    private final defpackage.liv q = new defpackage.liv() { // from class: ljp
        @Override // defpackage.liv
        public final void a(boolean z) {
            java.util.Iterator it = this.a.h.iterator();
            while (it.hasNext()) {
                ((defpackage.liv) it.next()).a(z);
            }
        }
    };
    private final defpackage.liw r = new defpackage.nft(this, 1);

    public ljr(android.content.Context context) {
        context.getClass();
        this.o = context;
    }

    @Override // defpackage.ljb
    public final int a() {
        defpackage.aecq aecqVar = this.m;
        if (aecqVar == null) {
            return -1;
        }
        return aecqVar.a;
    }

    @Override // defpackage.ljb
    public final android.location.Location b() {
        defpackage.ljf ljfVar = this.a;
        if (ljfVar == null) {
            return null;
        }
        return ljfVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, qsy] */
    @Override // defpackage.lhn
    public final void d() {
        defpackage.ljf ljfVar = this.a;
        if (ljfVar != null) {
            ljfVar.i();
        }
        defpackage.ljg ljgVar = this.b;
        if (ljgVar != null) {
            ljgVar.j(this.j);
            defpackage.ljf ljfVar2 = this.a;
            defpackage.ljg ljgVar2 = this.b;
            if (ljfVar2 != ljgVar2) {
                ljgVar2.i();
            }
        }
        defpackage.ljj ljjVar = this.d;
        if (ljjVar != null) {
            ljjVar.a.remove(this.l);
            this.d.b.remove(this.q);
            defpackage.ljj ljjVar2 = this.d;
            ljjVar2.f.b(ljjVar2.e);
        }
        defpackage.aecq aecqVar = this.m;
        if (aecqVar != null) {
            aecqVar.c.remove(this.r);
            defpackage.aecq aecqVar2 = this.m;
            ((defpackage.rpe) aecqVar2.b).b(aecqVar2.d);
        }
        defpackage.ljs ljsVar = this.c;
        if (ljsVar != null) {
            if (this.p) {
                defpackage.omf.u().x(8, ljsVar.c ? defpackage.zaa.WHEEL_SPEED_WAS_NON_ZERO : defpackage.zaa.WHEEL_SPEED_WAS_ALWAYS_ZERO);
            }
            defpackage.ljg ljgVar3 = this.b;
            if (ljgVar3 != null) {
                ljgVar3.j(ljsVar);
            }
            ljsVar.a.remove(this.k);
            defpackage.rpe rpeVar = ljsVar.d;
            if (rpeVar != null) {
                rpeVar.b(ljsVar);
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

    @Override // defpackage.ljb
    public final defpackage.liy e() {
        defpackage.ljg ljgVar = this.b;
        return ljgVar == null ? defpackage.liy.c : ljgVar.d();
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.lhn
    public final void eQ() {
        if (!defpackage.mdp.d().s()) {
            ((defpackage.yqj) n.l().ai((char) 3980)).u("Fine location not available; can't access location data.");
            return;
        }
        if (defpackage.kit.b().r()) {
            try {
                defpackage.laz.a();
                defpackage.rpe rpeVarF = defpackage.ooa.f(defpackage.kit.b().e());
                if (defpackage.ljt.b(rpeVarF)) {
                    this.b = new defpackage.ljt(rpeVarF);
                    this.p = true;
                }
                if (defpackage.ljh.l(rpeVarF)) {
                    this.a = new defpackage.ljh(rpeVarF);
                }
                int i = defpackage.ljs.e;
                if (rpeVarF != null && rpeVarF.d(11)) {
                    this.c = new defpackage.ljs(rpeVarF);
                }
                if (rpeVarF != null && rpeVarF.d(11)) {
                    this.d = new defpackage.ljj(rpeVarF);
                }
                if (rpeVarF != null && rpeVarF.d(7)) {
                    this.m = new defpackage.aecq(rpeVarF);
                }
            } catch (java.lang.IllegalArgumentException | defpackage.qst | defpackage.qsu e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) n.h()).p(e)).ai((char) 3979)).u("Unable to get CarSensorManager. Not starting car sensor providers.");
            }
        }
        if (this.a == null) {
            this.a = new ljm(this.o);
        }
        if (this.b == null) {
            this.b = this.a;
        }
        if (this.c == null) {
            this.c = new defpackage.ljs(null);
        }
        defpackage.ljg ljgVar = this.b;
        ljgVar.getClass();
        ljgVar.h(this.c);
        this.b.h(this.j);
        defpackage.ljs ljsVar = this.c;
        ljsVar.getClass();
        ljsVar.a.add(this.k);
        defpackage.ljj ljjVar = this.d;
        if (ljjVar != null) {
            defpackage.lix lixVar = this.l;
            ljjVar.a.add(lixVar);
            lixVar.a(ljjVar.c);
            defpackage.ljj ljjVar2 = this.d;
            defpackage.liv livVar = this.q;
            ljjVar2.b.add(livVar);
            livVar.a(ljjVar2.d);
        }
        defpackage.aecq aecqVar = this.m;
        if (aecqVar != null) {
            defpackage.liw liwVar = this.r;
            aecqVar.c.add(liwVar);
            liwVar.a(aecqVar.a);
        }
    }

    @Override // defpackage.ljb
    public final java.lang.Float f() {
        defpackage.ljg ljgVar = this.b;
        if (ljgVar == null) {
            return null;
        }
        return ljgVar.f();
    }

    @Override // defpackage.ljb
    public final void g(defpackage.liv livVar) {
        this.h.add(livVar);
        livVar.a(r());
    }

    @Override // defpackage.ljb
    public final void h(defpackage.liw liwVar) {
        this.i.add(liwVar);
        liwVar.a(a());
    }

    @Override // defpackage.ljb
    public final void i(defpackage.lix lixVar) {
        this.g.add(lixVar);
        lixVar.a(q());
    }

    @Override // defpackage.ljb
    public final void j(defpackage.liz lizVar) {
        this.e.add(lizVar);
        lizVar.b(f());
        lizVar.a(e());
    }

    @Override // defpackage.ljb
    public final void k(defpackage.lja ljaVar) {
        this.f.add(ljaVar);
        defpackage.ljs ljsVar = this.c;
        if (ljsVar != null) {
            ljaVar.a(ljsVar.b);
        }
    }

    @Override // defpackage.ljb
    public final void l(defpackage.liv livVar) {
        this.h.remove(livVar);
    }

    @Override // defpackage.ljb
    public final void m(defpackage.liw liwVar) {
        this.i.remove(liwVar);
    }

    @Override // defpackage.ljb
    public final void n(defpackage.lix lixVar) {
        this.g.remove(lixVar);
    }

    @Override // defpackage.ljb
    public final void o(defpackage.liz lizVar) {
        this.e.remove(lizVar);
    }

    @Override // defpackage.ljb
    public final void p(defpackage.lja ljaVar) {
        this.f.remove(ljaVar);
    }

    @Override // defpackage.ljb
    public final boolean q() {
        defpackage.ljj ljjVar = this.d;
        return ljjVar != null && ljjVar.c;
    }

    @Override // defpackage.ljb
    public final boolean r() {
        defpackage.ljj ljjVar = this.d;
        return ljjVar != null && ljjVar.d;
    }

    @Override // defpackage.ljb
    public final boolean s() {
        defpackage.ljs ljsVar = this.c;
        return ljsVar != null && ljsVar.b;
    }
}
