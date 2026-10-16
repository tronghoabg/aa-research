package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wzp implements defpackage.rco {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public wzp(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.rco
    public final void a() throws wfo {
        if (this.b == 0) {
            java.lang.Object obj = this.a;
            com.google.android.projection.gearhead.companion.AndroidAutoActivity androidAutoActivity = (com.google.android.projection.gearhead.companion.AndroidAutoActivity) obj;
            defpackage.xaa xaaVar = androidAutoActivity.o;
            boolean z = false;
            try {
                defpackage.mkp.a.g();
                defpackage.rei reiVarD = ((com.google.android.projection.gearhead.companion.AndroidAutoActivity) obj).n.d();
                defpackage.rps rpsVar = reiVarD.f;
                defpackage.rdo rdoVar = new defpackage.rdo(reiVarD, 1);
                int i = defpackage.ygw.d;
                java.util.List list = (java.util.List) rpsVar.d(rdoVar, defpackage.ymx.a);
                if ((list == null || list.isEmpty()) && ((defpackage.knb) defpackage.mkp.a.i(defpackage.knb.class)).d("device_supported") && !defpackage.acwj.v()) {
                    z = true;
                }
            } catch (java.lang.IllegalStateException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.companion.AndroidAutoActivity.m.h()).p(e)).ai((char) 9968)).u("Unexpected exception while checking allowed-cars!");
            }
            xaaVar.f = z;
            xaaVar.g();
            androidAutoActivity.n.g();
            return;
        }
        defpackage.yqm yqmVar = defpackage.kit.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 3119)).u("Token onConnected()");
        defpackage.wfp.c();
        defpackage.wfp.c();
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3141)).u("CarClientToken connected.");
        java.lang.Object obj2 = this.a;
        defpackage.kit kitVar = (defpackage.kit) obj2;
        if (!defpackage.kit.b.contains(kitVar.a())) {
            kitVar.m(defpackage.kis.c);
        }
        defpackage.kip kipVarA = kitVar.g.a();
        try {
            ((defpackage.kit) obj2).i.add(defpackage.kir.a);
            defpackage.qtv qtvVar = ((defpackage.kit) obj2).h;
            defpackage.wfp.c();
            ((defpackage.yqj) yqmVar.l().ai(3129)).u("notifyListenersOnConnected entered");
            java.util.concurrent.CopyOnWriteArraySet<defpackage.kfp> copyOnWriteArraySet = ((defpackage.kit) obj2).k;
            synchronized (copyOnWriteArraySet) {
                for (defpackage.kfp kfpVar : copyOnWriteArraySet) {
                    ((defpackage.yqj) yqmVar.l().ai(3130)).y("calling onConnected on %s", new defpackage.zkf(defpackage.zke.a, kfpVar));
                    kfpVar.c(qtvVar);
                }
            }
            ((defpackage.kit) obj2).l();
            ((defpackage.kit) obj2).i.remove(defpackage.kir.a);
            kipVarA.close();
            if (kitVar.j.remove(defpackage.kir.a) && kitVar.o()) {
                kitVar.f();
            } else if (kitVar.f) {
                java.util.EnumSet enumSet = kitVar.i;
                defpackage.ysr.bn(enumSet.isEmpty(), "activeCallbacks is not empty: %s", enumSet);
                kitVar.t();
            }
        } catch (java.lang.Throwable th) {
            try {
                kipVarA.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.rco
    public final void b(rcn rcnVar) throws wfo {
        if (this.b != 0) {
            defpackage.yqm yqmVar = defpackage.kit.a;
            ((defpackage.yqj) yqmVar.l().ai((char) 3120)).u("Token onConnectionSuspended()");
            defpackage.wfp.c();
            defpackage.wfp.c();
            defpackage.kit kitVar = (defpackage.kit) this.a;
            kitVar.d = rcnVar;
            kitVar.m(defpackage.kis.f);
            defpackage.ypu ypuVarF = yqmVar.f();
            defpackage.zke zkeVar = defpackage.zke.a;
            ((defpackage.yqj) ((defpackage.yqj) ypuVarF).ai((char) 3143)).y("connection suspended: %s", new defpackage.zkf(zkeVar, rcnVar));
            defpackage.wfp.c();
            ((defpackage.yqj) yqmVar.l().ai((char) 3133)).y("notifyListenersOnConnectionSuspended entered %s", new defpackage.zkf(zkeVar, rcnVar));
            java.util.concurrent.CopyOnWriteArraySet<defpackage.kfp> copyOnWriteArraySet = kitVar.k;
            synchronized (copyOnWriteArraySet) {
                for (defpackage.kfp kfpVar : copyOnWriteArraySet) {
                    ((defpackage.yqj) yqmVar.l().ai(3134)).M("calling onConnectionSuspended(%s) on %s", new defpackage.zkf(zkeVar, rcnVar), new defpackage.zkf(zkeVar, kfpVar));
                    kfpVar.eH();
                }
            }
        }
    }
}
