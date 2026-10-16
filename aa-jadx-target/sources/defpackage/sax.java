package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sax {
    public final defpackage.rab a;
    public final android.os.Handler b;
    public final com.google.android.gms.car.display.CarDisplayId c;
    public defpackage.qzs e;
    public final defpackage.ret h;
    private final defpackage.saw i;
    private final defpackage.rpv j;
    private final defpackage.rpw k;
    public final java.lang.Object d = new java.lang.Object();
    public final java.util.concurrent.CopyOnWriteArrayList f = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.Map g = new java.util.HashMap();

    public sax(defpackage.ret retVar, com.google.android.gms.car.display.CarDisplayId carDisplayId, defpackage.rab rabVar, android.os.Looper looper, defpackage.saw sawVar, defpackage.rpv rpvVar, defpackage.rpw rpwVar) {
        this.h = retVar;
        this.c = carDisplayId;
        this.a = rabVar;
        this.b = new defpackage.stq(looper);
        this.i = sawVar;
        this.j = rpvVar;
        this.k = rpwVar;
    }

    public final int a() throws defpackage.qst {
        try {
            return this.a.e();
        } catch (android.os.RemoteException e) {
            throw new defpackage.qst(e);
        }
    }

    public final android.graphics.Point b() throws defpackage.qst {
        try {
            return this.a.f();
        } catch (android.os.RemoteException e) {
            throw new defpackage.qst(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [afak, java.lang.Object] */
    public final android.graphics.Rect c() throws defpackage.qst {
        defpackage.ret retVar = this.h;
        return (android.graphics.Rect) ((defpackage.rps) retVar.f.a()).b(new defpackage.rdo(retVar, 7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [afak, java.lang.Object] */
    public final com.google.android.gms.car.display.CarDisplay d() throws defpackage.qst {
        defpackage.ret retVar = this.h;
        return (com.google.android.gms.car.display.CarDisplay) ((defpackage.rps) retVar.f.a()).b(new defpackage.rdo(retVar, 9));
    }

    public final void e(sav savVar) {
        synchronized (this.d) {
            this.f.addIfAbsent(savVar);
            if (this.e == null) {
                defpackage.qzs qzrVar = new qzr(this);
                this.e = qzrVar;
                try {
                    this.a.h(qzrVar);
                } catch (android.os.RemoteException e) {
                    defpackage.rrx.c("CAR.WM", e, "registerVideoFocusListener RemoteException");
                }
            }
        }
    }

    public final void f(defpackage.rct rctVar, java.lang.String str, android.content.Context context, com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams, int i) {
        if (defpackage.rrx.e("CAR.WM", 2)) {
            defpackage.rrx.d(2, "CAR.WM", null, "addView inflater %s", rctVar);
        }
        defpackage.ret retVar = this.h;
        boolean z = carWindowLayoutParams.m;
        android.os.Handler handler = this.b;
        defpackage.saw sawVar = this.i;
        boolean zBooleanValue = ((java.lang.Boolean) sawVar.a.fF()).booleanValue();
        int i2 = carWindowLayoutParams.o;
        defpackage.rpv rpvVar = this.j;
        defpackage.rpw rpwVar = this.k;
        boolean zBooleanValue2 = ((java.lang.Boolean) sawVar.i.fF()).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) sawVar.f.fF()).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) sawVar.g.fF()).booleanValue();
        defpackage.rbo rboVarA = defpackage.rbp.a();
        rboVarA.h(((java.lang.Boolean) sawVar.c.fF()).booleanValue());
        rboVarA.g(((java.lang.Boolean) sawVar.d.fF()).booleanValue());
        rboVarA.i(((java.lang.Boolean) sawVar.e.fF()).booleanValue());
        rboVarA.d(((java.lang.Integer) sawVar.k.fF()).intValue());
        rboVarA.f(((java.lang.Integer) sawVar.l.fF()).intValue());
        rboVarA.c(((java.lang.Boolean) sawVar.j.fF()).booleanValue());
        defpackage.xzi xziVar = sawVar.m;
        rboVarA.b(((java.lang.Boolean) xziVar.fF()).booleanValue());
        rboVarA.e(((java.lang.Boolean) sawVar.q.fF()).booleanValue());
        defpackage.sau sauVar = new defpackage.sau(retVar, rctVar, str, context, z, handler, i, zBooleanValue, i2, rpvVar, rpwVar, zBooleanValue2, zBooleanValue3, zBooleanValue4, rboVarA.a(), ((java.lang.Boolean) xziVar.fF()).booleanValue(), ((java.lang.Boolean) sawVar.n.fF()).booleanValue(), ((java.lang.Boolean) sawVar.h.fF()).booleanValue(), ((java.lang.Boolean) sawVar.o.fF()).booleanValue(), ((java.lang.Boolean) sawVar.p.fF()).booleanValue());
        try {
            sauVar.i = this.a.g(new com.google.android.gms.car.CarWindowSpec(str, context.getPackageName(), carWindowLayoutParams, sawVar.b), sauVar.u);
            this.g.put(rctVar, sauVar);
        } catch (android.os.RemoteException e) {
            defpackage.rrx.b("CAR.WM", e, "addView RemoteException");
        }
    }

    public final void g(com.google.android.gms.car.display.CarRegionId carRegionId, android.view.KeyEvent keyEvent) throws defpackage.qst {
        try {
            this.a.i(carRegionId, keyEvent);
        } catch (android.os.RemoteException e) {
            throw new defpackage.qst(e);
        }
    }

    public final void h(sav savVar) {
        defpackage.qzs qzsVar;
        synchronized (this.d) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f;
            copyOnWriteArrayList.remove(savVar);
            if (copyOnWriteArrayList.isEmpty() && (qzsVar = this.e) != null) {
                try {
                    this.a.k(qzsVar);
                } catch (android.os.RemoteException e) {
                    defpackage.rrx.c("CAR.WM", e, "unregisterVideoFocusListener RemoteException");
                }
                this.e = null;
            }
        }
    }

    public final void i(defpackage.rct rctVar) {
        defpackage.sau sauVar = (defpackage.sau) this.g.remove(rctVar);
        if (sauVar == null) {
            defpackage.rrx.d(5, "CAR.WM", null, "removeView inflater not found! : %s", rctVar);
        } else {
            defpackage.rrx.d(2, "CAR.WM", null, "removeView inflater %s", rctVar);
            defpackage.rbz.j(new defpackage.ryw(sauVar, 6));
        }
    }

    public final void j() {
        try {
            this.a.l();
        } catch (java.lang.Exception e) {
            defpackage.rrx.c("CAR.WM", e, "Exception calling requestVideoFocus");
        }
    }

    public final boolean k() {
        try {
            return this.a.p();
        } catch (java.lang.Exception e) {
            defpackage.rrx.c("CAR.WM", e, "Exception calling hasVideoFocus");
            return false;
        }
    }
}
