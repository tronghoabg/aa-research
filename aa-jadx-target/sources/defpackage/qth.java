package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class qth implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qth(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v55, types: [java.lang.Object, rda] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((qti) this.a).a.f(com.google.android.gms.car.diagnostics.CriticalError.a(defpackage.zaj.PROTOCOL_BYEBYE_REQUESTED_BY_USER, defpackage.zak.BYEBYE_BY_USER));
                return;
            case 1:
                defpackage.qtj qtjVar = (defpackage.qtj) this.a;
                if (qtjVar.t()) {
                    qtjVar.i.n();
                    return;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.qtn) ((defpackage.wyz) this.a).a).p(com.google.android.gms.car.diagnostics.CriticalError.a(defpackage.zaj.UNKNOWN_CODE, defpackage.zak.UNKNOWN_DETAIL));
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.quc) this.a).g();
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.qtn) ((defpackage.wyz) this.a).a).p(com.google.android.gms.car.diagnostics.CriticalError.a(defpackage.zaj.UNKNOWN_CODE, defpackage.zak.UNKNOWN_DETAIL));
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.qtn) ((defpackage.wyz) this.a).a).p(com.google.android.gms.car.diagnostics.CriticalError.a(defpackage.zaj.UNKNOWN_CODE, defpackage.zak.UNKNOWN_DETAIL));
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.qtq.d();
                defpackage.qtm qtmVar = (defpackage.qtm) this.a;
                if (qtmVar.a) {
                    return;
                }
                qtmVar.a = true;
                if (qtmVar.b) {
                    qtmVar.a();
                    return;
                }
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj = this.a;
                defpackage.rbr rbrVar = (defpackage.rbr) obj;
                if (rbrVar.W) {
                    defpackage.ysr.bk(android.os.Looper.myLooper() != android.os.Looper.getMainLooper(), "checkConfiguration must happen on worker thread");
                }
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                rbrVar.P.getRealMetrics(displayMetrics);
                android.content.res.Configuration configuration = rbrVar.getResources().getConfiguration();
                int iA = defpackage.rbr.a(displayMetrics.widthPixels, displayMetrics.xdpi);
                int iA2 = defpackage.rbr.a(displayMetrics.heightPixels, displayMetrics.ydpi);
                if (configuration.densityDpi == displayMetrics.densityDpi && configuration.screenWidthDp == iA && configuration.screenHeightDp == iA2) {
                    if (defpackage.omv.c("CAR.PROJECTION.PRES", 4)) {
                        defpackage.rrx.d(4, "CAR.PROJECTION.PRES", null, "Dimensions matching -- display: %s, config: %s. Completing presentation start", displayMetrics, rbrVar.getResources().getConfiguration());
                    }
                    rbrVar.k();
                    return;
                }
                int i = rbrVar.U;
                defpackage.rbp rbpVar = rbrVar.Q;
                if (i < rbpVar.f) {
                    rbrVar.U = i + 1;
                    if (defpackage.omv.c("CAR.PROJECTION.PRES", 5)) {
                        defpackage.rrx.d(5, "CAR.PROJECTION.PRES", null, "Dimensions not matching -- display: %s, config: %s. Waiting.", displayMetrics, rbrVar.getResources().getConfiguration());
                    }
                    android.os.Handler handler = rbrVar.T;
                    handler.getClass();
                    handler.postDelayed(new defpackage.qth(obj, 7), rbpVar.e);
                    return;
                }
                if (defpackage.omv.c("CAR.PROJECTION.PRES", 5)) {
                    defpackage.rrx.d(5, "CAR.PROJECTION.PRES", null, "Too many failed config checks -- display: %s, config: %s", displayMetrics, rbrVar.getResources().getConfiguration());
                }
                if (rbpVar.d) {
                    throw new java.lang.IllegalStateException("Unable to configure presentation for ".concat(java.lang.String.valueOf(rbrVar.m)));
                }
                if (defpackage.omv.c("CAR.PROJECTION.PRES", 5)) {
                    defpackage.rrx.d(5, "CAR.PROJECTION.PRES", null, "Completing presentation construction with un-updated context", new java.lang.Object[0]);
                }
                rbrVar.k();
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object obj2 = this.a;
                synchronized (defpackage.rcm.class) {
                    defpackage.rcm rcmVar = ((defpackage.rcl) obj2).c;
                    defpackage.rcj rcjVarA = rcmVar.a(((defpackage.rcl) obj2).b, ((defpackage.rcl) obj2).a);
                    if (rcjVarA != null) {
                        rcmVar.h.remove(rcjVarA);
                    }
                    break;
                }
                return;
            case 9:
                defpackage.rrx.d(5, "CAR.TOKEN", null, "CarClient connection lost.", new java.lang.Object[0]);
                java.lang.Object obj3 = ((defpackage.rem) this.a).e.a;
                synchronized (((defpackage.qtv) obj3).f) {
                    ((defpackage.qtv) obj3).b.b(rcn.b);
                    ((defpackage.qtv) obj3).g();
                    ((defpackage.qtv) obj3).e();
                    break;
                }
                return;
            case 10:
                ((defpackage.qtv) this.a).f();
                return;
            case 11:
                this.a.b();
                return;
            case 12:
                ((rfs) this.a).m();
                return;
            case 13:
                ((rfw) this.a).b();
                return;
            case 14:
                defpackage.yqk yqkVar = rgl.a;
                yqkVar.f().ai(7986).u("requestInitialAndroidFocus");
                rgl rglVar = (rgl) this.a;
                android.os.Handler handler2 = rglVar.c;
                if (handler2 == null) {
                    yqkVar.h().ai(7989).u("Skipping initial focus because focus manager has stopped");
                    return;
                }
                int iD = rglVar.d(1, rgl.b);
                if (iD == 0) {
                    yqkVar.g().ai(7988).u("Got unexpected AUDIOFOCUS_REQUEST_FAILED");
                } else if (iD == 1) {
                    rglVar.e.y();
                } else if (iD != 2) {
                    yqkVar.g().ai(7987).w("Unrecognized focus hint in doRequestInitialAndroidFocus: %d", iD);
                }
                rglVar.d.b = handler2;
                return;
            case 15:
                ((rgl) this.a).b(1);
                return;
            case 16:
                rgl rglVar2 = (rgl) this.a;
                int iA3 = rglVar2.d.a();
                rgl.a.f().ai(7991).w("Most exclusive focus grant: %d", iA3);
                if (iA3 == 0) {
                    rglVar2.e.y();
                    return;
                }
                qrp qrpVar = (qrp) rglVar2.e.a;
                qrpVar.i(iA3);
                qrpVar.c("onExternalAppGainAudioFocus ".concat(sqg.l(iA3)));
                return;
            case 17:
                java.lang.Object obj4 = this.a;
                ((rgy) obj4).b.c();
                try {
                    android.os.ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = ((rgy) obj4).e;
                    autoCloseOutputStream.getClass();
                    autoCloseOutputStream.close();
                    return;
                } catch (java.io.IOException e) {
                    rgy.a.h().p(e).ai(8016).u("Failure closing output stream. Ignoring since this is cleanup.");
                    return;
                }
            case 18:
                ((rgy) this.a).a();
                return;
            case 19:
                defpackage.rhn rhnVar = (defpackage.rhn) this.a;
                defpackage.rib ribVar = rhnVar.d;
                if (ribVar.f()) {
                    rhnVar.e(defpackage.rhk.STATE_WAITING_FOR_BLUETOOTH_PROFILE_UTIL);
                    return;
                }
                rhnVar.h = null;
                defpackage.yqk yqkVar2 = defpackage.rib.a;
                yqkVar2.l().ai(8164).u("enable");
                if (ribVar.n != 0) {
                    yqkVar2.l().ai(8165).u("enable: This object wasn't initialized successfully.");
                } else {
                    defpackage.rhf rhfVar = ribVar.d;
                    rhfVar.getClass();
                    if (rhfVar.e()) {
                        return;
                    }
                }
                rhnVar.c(defpackage.rhj.EVENT_ENABLING_FAILED);
                return;
            default:
                ((defpackage.rib) this.a).b();
                return;
        }
    }

    public qth(defpackage.qtj qtjVar, int i) {
        this.b = i;
        this.a = qtjVar;
    }
}
