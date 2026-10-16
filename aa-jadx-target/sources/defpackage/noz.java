package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class noz extends defpackage.nou {
    public final defpackage.sax k;
    public final com.google.android.gms.car.CarWindowLayoutParams l;
    public final defpackage.rct m;
    private final defpackage.nta n;
    private final defpackage.nsx o;
    private final defpackage.ntb p;
    private final defpackage.eqt q;

    public noz(defpackage.sax saxVar, com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams, defpackage.nta ntaVar, defpackage.ntb ntbVar, android.support.v4.app.Fragment fragment, defpackage.eqg eqgVar, java.lang.Object obj) {
        super(fragment, eqgVar, obj);
        this.m = new defpackage.rct() { // from class: nov
            @Override // defpackage.rct
            public final android.view.View a(android.content.Context context) {
                return this.a.n(context);
            }
        };
        this.o = new defpackage.now(this, 0);
        defpackage.nox noxVar = new defpackage.nox(this);
        this.q = noxVar;
        this.k = saxVar;
        this.l = carWindowLayoutParams;
        this.n = ntaVar;
        this.p = ntbVar;
        defpackage.lem.a.a();
        defpackage.ksi.a.a().e.eM(eqgVar, noxVar);
    }

    @Override // defpackage.nou
    protected final void c() {
        this.p.B(this.n, this.o);
        this.k.i(this.m);
        defpackage.ksi.d().e.k(this.q);
    }

    @Override // defpackage.nou
    protected final void f(boolean z) {
        defpackage.rpm rpmVar;
        java.util.Map map = this.k.g;
        defpackage.rct rctVar = this.m;
        defpackage.sau sauVar = (defpackage.sau) map.get(rctVar);
        if (sauVar == null) {
            defpackage.rrx.d(5, "CAR.WM", null, "attempting to hide window layout, but inflater not found: %s", rctVar);
            return;
        }
        if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s hideWindow(%b)", sauVar.a, java.lang.Boolean.valueOf(z));
        }
        if (sauVar.p && (rpmVar = sauVar.g) != null) {
            rpmVar.k();
        }
        try {
            sauVar.i.e(z);
        } catch (android.os.RemoteException e) {
            defpackage.rrx.b("CAR.CLIENT.WM.WIN", e, "hide RemoteException");
        }
    }

    @Override // defpackage.nou
    protected final void g(com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        java.util.Map map = this.k.g;
        defpackage.rct rctVar = this.m;
        defpackage.sau sauVar = (defpackage.sau) map.get(rctVar);
        if (sauVar == null) {
            defpackage.rrx.d(5, "CAR.WM", null, "attempting to hide window layout, but inflater not found: %s", rctVar);
            return;
        }
        if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s hideWindow(%s)", sauVar.a, projectionWindowAnimationParams);
        }
        try {
            sauVar.i.f(projectionWindowAnimationParams);
        } catch (android.os.RemoteException e) {
            defpackage.rrx.b("CAR.CLIENT.WM.WIN", e, "hide RemoteException");
        }
    }

    @Override // defpackage.nou
    protected final void k(boolean z) {
        java.util.Map map = this.k.g;
        defpackage.rct rctVar = this.m;
        defpackage.sau sauVar = (defpackage.sau) map.get(rctVar);
        if (sauVar == null) {
            defpackage.rrx.d(5, "CAR.WM", null, "attempting to show window layout, but inflater not found: %s", rctVar);
            return;
        }
        if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s showWindow(%b)", sauVar.a, java.lang.Boolean.valueOf(z));
        }
        try {
            sauVar.i.r(z);
        } catch (android.os.RemoteException e) {
            defpackage.rrx.b("CAR.CLIENT.WM.WIN", e, "showWindow RemoteException");
        }
    }

    @Override // defpackage.nou
    protected final void m(int i, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        java.util.Map map = this.k.g;
        defpackage.rct rctVar = this.m;
        defpackage.sau sauVar = (defpackage.sau) map.get(rctVar);
        if (sauVar == null) {
            defpackage.rrx.d(5, "CAR.WM", null, "Attempting to update window critical ui state, but inflater not found: %s", rctVar);
            return;
        }
        if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s requestDragChange(%s, %s, %s)", sauVar.a, java.lang.Integer.valueOf(i), java.lang.Boolean.TRUE, projectionWindowAnimationParams);
        }
        try {
            sauVar.i.l(i, true, projectionWindowAnimationParams);
        } catch (android.os.RemoteException e) {
            defpackage.rrx.b("CAR.CLIENT.WM.WIN", e, "updateCriticalUiState RemoteException");
        }
    }

    protected final android.view.View n(android.content.Context context) {
        rcs rcsVarA;
        defpackage.ntb ntbVar = this.p;
        defpackage.nta ntaVar = this.n;
        ntbVar.x(ntaVar, this.o);
        if (ntaVar != defpackage.nta.B && ntaVar != defpackage.nta.z) {
            context.getClass();
            context = new defpackage.pl(context, defpackage.ebo.o());
        }
        android.content.Context contextA = defpackage.ksi.a.a().a(context);
        java.lang.String str = this.h;
        defpackage.yqm yqmVar = defpackage.nou.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 5314)).y("onCreateView: %s", str);
        if (this.e) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 5316)).y("onCreateView(): Called after finish() just returning dummy view for %s", str);
            return new android.widget.FrameLayout(contextA);
        }
        if (this.j == null) {
            ((defpackage.yqj) yqmVar.l().ai(5315)).K("Create new FragmentController and start Fragment %s. Available screen width in dp: %d", str, contextA.getResources().getConfiguration().screenWidthDp);
            this.c = new defpackage.nos(this, contextA);
            this.c.setId(android.R.id.content);
            this.j = new defpackage.kwv(new defpackage.not(this, contextA, this.b));
            this.j.ah();
            this.j.aa();
            this.d = true;
            defpackage.w wVar = new defpackage.w(this.j.X());
            rcsVarA = null;
            wVar.q(android.R.id.content, this.g, null);
            wVar.c();
            this.g = null;
        } else {
            rcsVarA = rcs.a(this.c);
            super.i(contextA);
        }
        this.j.ad();
        if (rcsVarA != null) {
            rcsVarA.b(this.c);
        }
        return this.c;
    }

    public final com.google.android.gms.car.display.CarDisplayId o() {
        return this.p.o;
    }

    public final void p(java.lang.Runnable runnable) {
        java.util.Map map = this.k.g;
        defpackage.rct rctVar = this.m;
        defpackage.sau sauVar = (defpackage.sau) map.get(rctVar);
        if (sauVar == null) {
            defpackage.rrx.d(5, "CAR.WM", null, "requestWindowFocus inflater not found! : %s", rctVar);
            return;
        }
        if (sauVar.g()) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (runnable != null) {
            sauVar.s.add(new usd(sauVar, runnable, (byte[]) null));
        }
        if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s requestFocus", sauVar.a);
        }
        try {
            sauVar.i.n();
        } catch (android.os.RemoteException e) {
            defpackage.rrx.b("CAR.CLIENT.WM.WIN", e, "requestFocus RemoteException");
        }
    }

    public final void q(boolean z) {
        if (defpackage.acqh.m()) {
            if (!z || this.f) {
                defpackage.sax saxVar = this.k;
                defpackage.rct rctVar = this.m;
                rctVar.getClass();
                defpackage.sau sauVar = (defpackage.sau) saxVar.g.get(rctVar);
                if (sauVar == null) {
                    defpackage.rrx.d(5, "CAR.WM", null, "attempting to set transient window visibility, but inflater not found: %s", rctVar);
                    return;
                }
                if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
                    defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s setOverlayVisible(%s)", sauVar.a, java.lang.Boolean.valueOf(z));
                }
                try {
                    sauVar.i.o(z);
                } catch (android.os.RemoteException e) {
                    defpackage.rrx.b("CAR.CLIENT.WM.WIN", e, "setOverlayVisible RemoteException");
                }
            }
        }
    }

    public final void r() {
        if (defpackage.acqh.m() && this.f) {
            defpackage.sax saxVar = this.k;
            defpackage.rct rctVar = this.m;
            defpackage.sau sauVar = (defpackage.sau) saxVar.g.get(rctVar);
            if (sauVar == null) {
                defpackage.rrx.d(5, "CAR.WM", null, "attempting to show transient window layout, but inflater not found: %s", rctVar);
                return;
            }
            if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
                defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s showTransient", sauVar.a);
            }
            try {
                sauVar.i.q();
            } catch (android.os.RemoteException e) {
                defpackage.rrx.b("CAR.CLIENT.WM.WIN", e, "showTransient RemoteException");
            }
        }
    }
}
