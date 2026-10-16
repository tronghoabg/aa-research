package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qkr implements defpackage.mnw {
    public boolean f;
    private defpackage.qlj k;
    private boolean l;
    private static final defpackage.yqm i = defpackage.yqm.c("GH.StreamItemManager");
    static final long a = 2000;
    public final java.util.List b = new java.util.ArrayList();
    private final ajaj j = ajap.d(0, 1, 2);
    public final java.util.List c = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.lang.Runnable m = new defpackage.qjo(this, 7, null);
    public final java.lang.Runnable g = new defpackage.qjo(this, 6);
    public final java.lang.Runnable h = new defpackage.qjo(this, 6);
    public final android.os.Handler e = new android.os.Handler();
    public final defpackage.qkq d = new defpackage.qkq();

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public static final boolean n(mog mogVar) throws wfo {
        defpackage.wfp.c();
        return mogVar.F().e == 1;
    }

    private final void o(mog mogVar) {
        if (mogVar == null) {
            defpackage.yqm yqmVar = i;
            if (((defpackage.yqj) yqmVar.h()).Z()) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 7450)).y("Canceling a non-existent stream item: %s", j$.util.Objects.toString((java.lang.Object) null));
                return;
            }
            return;
        }
        this.b.remove(mogVar);
        java.util.Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((mnv) it.next()).e(mogVar);
        }
        this.j.c(defpackage.afbk.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.mnw
    public final mog a(defpackage.zaw zawVar, long j) throws wfo {
        defpackage.wfp.c();
        for (mog mogVar : this.b) {
            if (mogVar.A() == j && mogVar.J() == zawVar) {
                return mogVar;
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.mnw
    public final java.util.List b(defpackage.zaw... zawVarArr) throws wfo {
        defpackage.wfp.c();
        java.util.HashSet hashSetQ = defpackage.ysr.q(zawVarArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (mog mogVar : this.b) {
            if (hashSetQ.contains(mogVar.J())) {
                arrayList.add(mogVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void d() throws wfo {
        defpackage.wfp.c();
        this.l = false;
        this.e.removeCallbacksAndMessages(null);
        this.b.clear();
        this.k = null;
    }

    @Override // defpackage.mnw
    public final aizj e() {
        return this.j;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void eQ() throws wfo {
        defpackage.wfp.c();
        this.k = new defpackage.qlj();
        this.f = true;
        android.os.Handler handler = this.e;
        handler.postDelayed(this.h, a);
        handler.postDelayed(this.m, 60000L);
        this.l = true;
    }

    @Override // defpackage.mnw
    public final void f(mnv mnvVar) {
        this.c.add(mnvVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.mnw
    public final void g(mog mogVar) throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = i;
        if (yqmVar.l().Z()) {
            ((defpackage.yqj) yqmVar.l().ai((char) 7447)).y("cancel() %s", j$.util.Objects.toString(mogVar));
        }
        defpackage.zaw zawVarJ = mogVar.J();
        long jA = mogVar.A();
        defpackage.wfp.c();
        ((defpackage.yqj) yqmVar.l().ai(7448)).L("cancel() type=%s,id=%d", zawVarJ, jA);
        for (mog mogVar2 : this.b) {
            if (zawVarJ == mogVar2.J() && jA == mogVar2.A()) {
                o(mogVar2);
            }
        }
        mogVar2 = null;
        o(mogVar2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.mnw
    public final void h(defpackage.zaw zawVar) throws wfo {
        defpackage.wfp.c();
        ((defpackage.yqj) i.l().ai((char) 7449)).y("cancelAll: %s", zawVar);
        java.util.Iterator it = b(zawVar).iterator();
        while (it.hasNext()) {
            o((mog) it.next());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.mnw
    public final void i(mog mogVar) throws wfo {
        defpackage.wfp.c();
        if (!n(mogVar) || this.k == null) {
            return;
        }
        o(mogVar);
        defpackage.qlj qljVar = this.k;
        java.util.Set set = qljVar.a;
        synchronized (set) {
            set.add(qljVar.a(mogVar));
        }
        mogVar.W();
        defpackage.mny mnyVarM = defpackage.lxy.m();
        mnyVarM.b(mogVar, defpackage.zbe.OVERVIEW_FACET, defpackage.zbd.bc);
        mnyVarM.a(mogVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.mnw
    public final void j(mog mogVar) throws wfo {
        defpackage.wfp.c();
        m(mogVar, true);
    }

    @Override // defpackage.mnw
    public final void k(mnv mnvVar) {
        if (this.c.remove(mnvVar)) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) i.h()).ai((char) 7458)).y("Listener was not registered: %s", mnvVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.mnw
    public final void l(mog mogVar) throws wfo {
        defpackage.wfp.c();
        m(mogVar, false);
    }

    protected final void m(mog mogVar, boolean z) {
        boolean zContains;
        mogVar.getClass();
        if (mogVar.J() == defpackage.zaw.NAV_NOTIFICATION_HERO || mogVar.J() == defpackage.zaw.NAV_NOTIFICATION_NORMAL) {
            if (!defpackage.luq.a().i()) {
                defpackage.rox.o("GH.StreamItemManager", "received nav SI while not connected to a nav provider", new java.lang.Object[0]);
            }
            if (!defpackage.luq.a().e().a().getPackageName().equals(mogVar.O())) {
                defpackage.rox.o("GH.StreamItemManager", "received nav SI from non-provider nav package: %s", mogVar.O());
            }
        }
        if (this.k == null) {
            ((defpackage.yqj) ((defpackage.yqj) i.h()).ai((char) 7457)).u("Ignoring stream item since it was posted before start or after stop.");
            return;
        }
        if (n(mogVar)) {
            defpackage.qlj qljVar = this.k;
            if (mogVar.F().f != 2) {
                java.lang.String strA = qljVar.a(mogVar);
                java.util.Set set = qljVar.a;
                synchronized (set) {
                    zContains = set.contains(strA);
                }
                if (zContains) {
                    return;
                }
            }
        }
        java.util.List list = this.b;
        boolean zContains2 = list.contains(mogVar);
        defpackage.yqm yqmVar = i;
        if (yqmVar.l().Z()) {
            ((defpackage.yqj) yqmVar.l().ai(7455)).R("postInternal: Posting %s. #items %d -> %d", j$.util.Objects.toString(mogVar), java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(list.size() + (!zContains2 ? 1 : 0)));
        }
        if (zContains2) {
            int iIndexOf = list.indexOf(mogVar);
            mog mogVar2 = (mog) list.get(iIndexOf);
            list.set(iIndexOf, mogVar);
            this.d.c(list);
            java.util.Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((mnv) it.next()).d(mogVar2, mogVar);
            }
        } else if (z) {
            list.add(mogVar);
            this.d.c(list);
            if (this.l) {
                defpackage.lxy.m().b(mogVar, defpackage.zbe.OVERVIEW_FACET, defpackage.zbd.bb);
            } else {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 7453)).u("Trying to log creation event before SIM.start() called");
            }
            if (this.f) {
                android.os.Handler handler = this.e;
                java.lang.Runnable runnable = this.g;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 1000L);
            }
            java.util.Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                ((mnv) it2.next()).c(mogVar);
            }
        }
        this.j.c(defpackage.afbk.a);
    }
}
