package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class hie implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ hie(defpackage.imi imiVar, java.lang.Object obj, int i) {
        this.c = i;
        this.b = imiVar;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v20, types: [androidx.car.app.ISurfaceCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object, uv] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r8v37, types: [java.lang.Object, qvo] */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.Object, rqb] */
    /* JADX WARN: Type inference failed for: r8v39, types: [java.lang.Object, qvo] */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, qvu] */
    /* JADX WARN: Type inference failed for: r8v43, types: [java.lang.Object, qvr] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 3;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object obj = this.b;
                java.lang.Object obj2 = this.a;
                ((hig) obj2).a.n("showAlert", new defpackage.hie(obj2, obj, 4));
                return;
            case 1:
                java.lang.Object obj3 = this.b;
                java.lang.Object obj4 = this.a;
                ((hig) obj4).a.n("sendLocation", new defpackage.hie(obj4, obj3, i));
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object obj5 = this.a;
                hih hihVar = ((hig) obj5).a;
                android.content.ComponentName componentName = ((fut) hihVar.c).a.c;
                gnb.c("CarApp.H.Tem", "setSurfaceListener for %s", new java.lang.Object[]{componentName});
                android.content.Context contextA = hihVar.a.a();
                if (contextA == null) {
                    gnb.d("CarApp.H.Tem", "App configuration context is null");
                    return;
                }
                int i2 = 5;
                try {
                    defpackage.mw.j(contextA, "androidx.car.app.ACCESS_SURFACE");
                    gfb.c(new defpackage.hie(obj5, this.b, i2));
                    return;
                } catch (java.lang.SecurityException e) {
                    java.lang.Object[] objArr = {componentName};
                    if (android.util.Log.isLoggable("CarApp.H.Tem", 5)) {
                        android.util.Log.w("CarApp.H.Tem", gnb.a("App %s trying to access surface when the permission was not granted", objArr), e);
                    }
                    throw new java.lang.SecurityException(e);
                }
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                gel gelVarL = ((hig) this.a).a.a.l(gel.class);
                gelVarL.getClass();
                gelVarL.c((android.location.Location) this.b);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                gdr gdrVarL = ((hig) this.a).a.a.l(gdr.class);
                gdrVarL.getClass();
                try {
                    androidx.car.app.model.Alert alert = (androidx.car.app.model.Alert) ((androidx.car.app.serialization.Bundleable) this.b).a();
                    defpackage.eqs eqsVar = gdrVarL.b;
                    if (!eqsVar.n()) {
                        tf callbackDelegate = alert.getCallbackDelegate();
                        if (callbackDelegate != null) {
                            gdrVarL.a.g.e(callbackDelegate, 3);
                            return;
                        }
                        return;
                    }
                    androidx.car.app.model.Alert alertB = gdrVarL.b();
                    if (alertB != null && !alertB.equals(alert)) {
                        gdrVarL.e(alertB);
                    }
                    if (alertB == null || !alertB.equals(alert) || alertB.getDurationMillis() != alert.getDurationMillis()) {
                        gdrVarL.c = java.lang.System.currentTimeMillis();
                    }
                    gdrVarL.e = new etd(gdrVarL, alert, 13, (char[]) null);
                    eqsVar.j(alert);
                    android.os.Handler handler = gdrVarL.d;
                    handler.removeCallbacksAndMessages(null);
                    handler.postDelayed(gdrVarL.e, alert.getDurationMillis());
                    return;
                } catch (xy e2) {
                    throw new java.lang.IllegalArgumentException("Serialization failure", e2);
                }
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                hih hihVar2 = ((hig) this.a).a;
                hihVar2.e = this.b;
                if (hihVar2.e == null || hihVar2.f == null) {
                    return;
                }
                hihVar2.j.N();
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((gfa) this.a).t().h((uv) this.b);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                try {
                    ((hqr) this.b).a.put(this.a);
                    return;
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                    return;
                }
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                if (((hym) this.b).a) {
                    android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.a.run();
                    return;
                } catch (java.lang.Throwable th) {
                    if (android.util.Log.isLoggable("GlideExecutor", 6)) {
                        android.util.Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 9:
                ((defpackage.rkv) this.a).a((com.google.android.gms.car.display.CarDisplayId) this.b).l(defpackage.xid.ACTION_RESIZE_TO_LARGER);
                return;
            case 10:
                ((defpackage.rkv) this.a).a((com.google.android.gms.car.display.CarDisplayId) this.b).l(defpackage.xid.ACTION_RESIZE_TO_SMALLER);
                return;
            case 11:
                ((defpackage.imi) this.b).at(true, (xiw) this.a);
                return;
            case 12:
                ((defpackage.imi) this.b).at(false, (xiw) this.a);
                return;
            case 13:
                defpackage.ioh iohVarN = ((defpackage.imi) this.b).n();
                if (iohVarN != 0) {
                    iohVarN.M(this.a);
                    return;
                }
                return;
            case 14:
                defpackage.ioh iohVarN2 = ((defpackage.imi) this.b).n();
                if (iohVarN2 != 0) {
                    iohVarN2.ai(this.a);
                    return;
                }
                return;
            case 15:
                defpackage.ioh iohVarN3 = ((defpackage.imi) this.b).n();
                if (iohVarN3 != 0) {
                    iohVarN3.ag(this.a);
                    return;
                }
                return;
            case 16:
                defpackage.ioh iohVarN4 = ((defpackage.imi) this.b).n();
                if (iohVarN4 != null) {
                    iohVarN4.ae((com.google.android.gms.car.display.CarRegionId) this.a);
                    return;
                }
                return;
            case 17:
                defpackage.imi imiVar = (defpackage.imi) this.b;
                defpackage.ioh iohVarN5 = imiVar.n();
                ?? r8 = this.a;
                if (iohVarN5 != 0) {
                    iohVarN5.O(r8);
                }
                defpackage.nub nubVar = (defpackage.nub) imiVar.B.get();
                if (nubVar != null) {
                    r8.getClass();
                    nubVar.a = r8;
                    return;
                }
                return;
            case 18:
                defpackage.ioh iohVarN6 = ((defpackage.imi) this.b).n();
                if (iohVarN6 != 0) {
                    iohVarN6.N(this.a);
                    return;
                }
                return;
            case 19:
                defpackage.ioh iohVarN7 = ((defpackage.imi) this.b).n();
                if (iohVarN7 != null) {
                    java.lang.Object obj6 = this.a;
                    defpackage.ill.d();
                    iohVarN7.r.remove(obj6);
                    return;
                }
                return;
            default:
                ((defpackage.imi) this.b).bk((com.google.android.gms.car.lifecycle.CarActivityLayoutConfig) this.a, false);
                return;
        }
    }

    public /* synthetic */ hie(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public hie(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }
}
