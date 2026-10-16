package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class lin implements defpackage.lht {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.LifetimeManager");
    public j$.util.OptionalLong b = j$.util.OptionalLong.empty();
    public final android.content.Context c;
    public final defpackage.eqi d;
    public boolean e;
    public boolean f;
    public boolean g;
    public volatile com.google.android.gms.car.AnalyticsSessionInfo h;
    public final java.util.List i;
    public final defpackage.lih j;
    public final android.content.ServiceConnection k;
    public int l;
    private boolean m;
    private boolean n;
    private final defpackage.kfp o;

    public lin(android.content.Context context) {
        defpackage.eqi eqiVar = new defpackage.eqi(this, true);
        this.d = eqiVar;
        int i = defpackage.ygw.d;
        this.h = new com.google.android.gms.car.AnalyticsSessionInfo(-1, defpackage.ymx.a);
        this.l = 1;
        this.i = new java.util.concurrent.CopyOnWriteArrayList();
        this.k = new defpackage.lie();
        this.o = new defpackage.lif(this);
        this.c = context;
        eqiVar.e(defpackage.epw.ON_CREATE);
        this.j = new defpackage.lih(new java.util.function.Supplier() { // from class: lid
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return this.a.h;
            }
        });
    }

    public static java.lang.String j(java.lang.String str, java.lang.String str2) {
        try {
            defpackage.mkp.a.g();
            return defpackage.oml.y(defpackage.kit.b().e(), str, str2);
        } catch (defpackage.qst e) {
            return (java.lang.String) defpackage.rox.p("GH.LifetimeManager", e, "Failed to getStringCarServiceSetting(%s)", str);
        }
    }

    public static void l(com.google.android.gms.car.AnalyticsSessionInfo analyticsSessionInfo, defpackage.rro rroVar) {
        int i = analyticsSessionInfo.a;
        defpackage.ysr.bk(i != -1, "Session ID is invalid");
        rroVar.c = defpackage.xyn.h(java.lang.Integer.valueOf(i));
        rroVar.d = defpackage.ygw.o(defpackage.ygw.o(analyticsSessionInfo.b));
    }

    public static void q(defpackage.lhn lhnVar) {
        ((defpackage.yqj) a.l().ai((char) 3953)).y("Stopping %s", lhnVar);
        lhnVar.d();
    }

    public static boolean r(defpackage.rbf rbfVar) {
        defpackage.mkp.a.g();
        return defpackage.oml.z(defpackage.kit.b().e(), rbfVar);
    }

    public static defpackage.zad t(int i, int i2) {
        defpackage.abor aborVarN = defpackage.zad.a.n();
        aborVarN.t();
        defpackage.zad zadVar = (defpackage.zad) aborVarN.b;
        zadVar.b |= 1;
        zadVar.e = i - 1;
        aborVarN.t();
        defpackage.zad zadVar2 = (defpackage.zad) aborVarN.b;
        zadVar2.c = 4;
        zadVar2.d = java.lang.Integer.valueOf(i2);
        return (defpackage.zad) aborVarN.q();
    }

    public static defpackage.zad u(int i, boolean z) {
        defpackage.abor aborVarN = defpackage.zad.a.n();
        aborVarN.t();
        defpackage.zad zadVar = (defpackage.zad) aborVarN.b;
        zadVar.b |= 1;
        zadVar.e = i - 1;
        aborVarN.t();
        defpackage.zad zadVar2 = (defpackage.zad) aborVarN.b;
        zadVar2.c = 2;
        zadVar2.d = java.lang.Boolean.valueOf(z);
        return (defpackage.zad) aborVarN.q();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lht
    public final void c() throws wfo {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3939)).u("connectToCarService");
        defpackage.wfp.c();
        defpackage.ysr.bj(this.l == 1);
        this.l = 2;
        defpackage.kit.b().v(this.o);
        defpackage.kit.b().eQ();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lht
    public final void d(defpackage.lhs lhsVar) throws wfo {
        defpackage.wfp.c();
        this.i.remove(lhsVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lht
    public final void fV(defpackage.lhs lhsVar) throws wfo {
        fW(lhsVar, false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lht
    public final void fW(defpackage.lhs lhsVar, boolean z) throws wfo {
        defpackage.wfp.c();
        if (z && this.e) {
            lhsVar.c();
            if (this.g) {
                lhsVar.a();
            }
        }
        this.i.add(lhsVar);
    }

    @Override // defpackage.lht
    public final boolean fX() {
        return this.g;
    }

    @Override // defpackage.lht
    public final boolean fY() {
        return this.e;
    }

    @Override // defpackage.lht
    public final boolean g() {
        return this.f || this.e;
    }

    @Override // defpackage.eqg
    public final defpackage.epy getLifecycle() {
        return this.d;
    }

    @Override // defpackage.lht
    public final boolean h() {
        return (g() || this.n) ? false : true;
    }

    @Override // defpackage.lht
    public final boolean i() {
        return !g() || this.n;
    }

    public abstract java.util.List k();

    public final void m(boolean z, boolean z2) {
        java.util.Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((defpackage.lhs) it.next()).d(z, z2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    public final void n() throws wfo {
        defpackage.wfp.c();
        if (!this.g && this.e) {
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.LIFETIME, defpackage.zbd.ph).l());
            defpackage.tgg tggVar = defpackage.tgg.a;
            defpackage.tgf tgfVar = defpackage.tgf.GEARHEAD_PROJECTION_LIFETIME_DELAYED_START;
            tggVar.b(tgfVar);
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3942)).u("Kicking off delayed start");
            defpackage.ygw ygwVar = defpackage.lim.c;
            int i = ((defpackage.ymx) ygwVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                ((defpackage.lii) ygwVar.get(i2)).a("delayed");
            }
            if (defpackage.lzm.c()) {
                defpackage.lim.d.a("delayed");
                this.m = true;
            }
            o();
            this.g = true;
            java.util.Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((defpackage.lhs) it.next()).a();
            }
            tggVar.d(tgfVar, 1);
        }
    }

    protected abstract void o();

    protected void p() {
        throw null;
    }

    protected abstract void s();

    protected abstract void v();

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    public final void w(boolean z) throws wfo {
        long jElapsedRealtime;
        defpackage.yqm yqmVar = a;
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(3951);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.zke zkeVar = defpackage.zke.a;
        yqjVar.M("stop(transitionToProjected=%s, disconnectFromCarService=%s)", new defpackage.zkf(zkeVar, bool), new defpackage.zkf(zkeVar, java.lang.Boolean.valueOf(z)));
        defpackage.wfp.c();
        this.n = true;
        if (this.e) {
            if (defpackage.ler.b().e() == defpackage.liy.a) {
                defpackage.omf.u().x(8, defpackage.zaa.EXIT_WHILE_MOVING);
            }
            s();
            java.util.Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((defpackage.lhs) it.next()).b();
            }
            this.d.e(defpackage.epw.ON_STOP);
            ((defpackage.yqj) yqmVar.l().ai((char) 3956)).u("Stopping lifetime services");
            v();
            ((defpackage.yqj) yqmVar.l().ai((char) 3959)).y("Unbinding lifetime service: %s", k());
            this.c.unbindService(this.k);
            defpackage.ygw ygwVarH = defpackage.lim.b.h();
            int size = ygwVarH.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.lii) ygwVarH.get(i)).b();
            }
            ((defpackage.yqj) yqmVar.l().ai((char) 3954)).u("Stopping mismatched lifetime services");
            q(defpackage.lxy.l());
            if (!defpackage.acvt.m()) {
                q(defpackage.luq.a());
            }
            q(defpackage.lnt.m());
            if (defpackage.acul.y() || defpackage.acul.x()) {
                q(defpackage.lnt.j());
            }
            if (!defpackage.acul.y() || !defpackage.acul.x()) {
                q(defpackage.lnt.k());
                q(defpackage.lnt.l());
            }
            q(defpackage.lvb.a());
            q(defpackage.mca.a());
            q(defpackage.kpu.c());
            q(defpackage.ebo.n());
            q(defpackage.ler.b());
            q(defpackage.lhc.c());
            q(defpackage.kzi.r());
            q(defpackage.lpg.j());
            defpackage.oed oedVarW = defpackage.omf.w();
            oedVarW.x();
            q(defpackage.ngy.g());
            q(defpackage.lxy.n());
            q(defpackage.nuz.b());
            q(defpackage.lxy.o());
            q(oedVarW);
            q(defpackage.ler.a());
            q(defpackage.jrw.a());
            q(defpackage.nsn.e());
            q(defpackage.mpd.b());
            q(defpackage.mrv.a());
            q(defpackage.msh.a());
            q(defpackage.mlv.f());
            ((defpackage.yqj) yqmVar.l().ai((char) 3955)).u("Stopped mismatched lifetime services");
            if (this.g) {
                defpackage.ygw ygwVarH2 = defpackage.lim.c.h();
                int size2 = ygwVarH2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    defpackage.lii liiVar = (defpackage.lii) ygwVarH2.get(i2);
                    if (!(liiVar.a.a() instanceof defpackage.oed)) {
                        liiVar.b();
                    }
                }
                if (this.m) {
                    defpackage.lim.d.b();
                    this.m = false;
                }
            } else {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3957)).u("Skipping stop for delayed start services.");
            }
            ((defpackage.yqj) yqmVar.l().ai((char) 3958)).u("Lifetime services stopped");
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.yzd yzdVar = defpackage.yzd.GEARHEAD;
            defpackage.rro rroVarH = defpackage.rrp.h(yzdVar, 8, defpackage.zaa.LIFETIME_END);
            rroVarH.n = defpackage.xyn.h(defpackage.acrx.c());
            if (this.b.isPresent()) {
                defpackage.ojm.a();
                jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.b.getAsLong();
            } else {
                jElapsedRealtime = 0;
            }
            rroVarH.f = defpackage.xyn.h(java.lang.Long.valueOf(jElapsedRealtime));
            oimVarU.F(rroVarH.l());
            defpackage.omf.u().F(defpackage.rrw.h(yzdVar, defpackage.zbe.LIFETIME, defpackage.zbd.pe).l());
            this.j.d();
            p();
            this.e = false;
            this.g = false;
        }
        if (z && this.l != 1) {
            defpackage.kit.b().d();
            defpackage.kit.b().w(this.o);
            this.l = 1;
        }
        this.n = false;
    }
}
