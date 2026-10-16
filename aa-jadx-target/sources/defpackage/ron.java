package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ron implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ron(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r14v68, types: [java.lang.Object, rya] */
    /* JADX WARN: Type inference failed for: r14v91, types: [java.lang.Object, scj] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        defpackage.rph rphVar;
        defpackage.rpm rpmVar;
        android.util.Pair pairC;
        android.util.Pair pair;
        android.util.Pair pairD;
        int i = -1;
        android.graphics.Rect rect = null;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                android.util.SparseArray sparseArray = defpackage.ror.a;
                java.lang.Object obj = this.b;
                defpackage.ror rorVar = (defpackage.ror) this.a;
                com.google.android.gms.car.DrawingSpec drawingSpec = (com.google.android.gms.car.DrawingSpec) obj;
                rorVar.B = drawingSpec;
                if (rorVar.I == null) {
                    if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
                        defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s Null activity while reattaching", rorVar.t);
                        return;
                    }
                    return;
                }
                rorVar.m(drawingSpec);
                rorVar.k.j();
                rorVar.s(drawingSpec);
                rorVar.b(rorVar.s);
                defpackage.qyu qyuVar = rorVar.i;
                if (qyuVar != null) {
                    try {
                        qyuVar.u();
                        return;
                    } catch (android.os.RemoteException unused) {
                        defpackage.rbz.h(rorVar.d);
                        return;
                    }
                }
                return;
            case 1:
                java.lang.Object obj2 = this.b;
                java.lang.Object obj3 = this.a;
                if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 2)) {
                    android.util.SparseArray sparseArray2 = defpackage.ror.a;
                    defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "%s onInputFocusChange() runOnMain onInputFocusChange(event:%s, callback:%b)", ((defpackage.ror) obj3).t, obj2, java.lang.Boolean.TRUE);
                }
                android.util.SparseArray sparseArray3 = defpackage.ror.a;
                ((defpackage.ror) obj3).o((com.google.android.gms.car.InputFocusChangedEvent) obj2, true);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object obj4 = this.a;
                defpackage.ror rorVar2 = (defpackage.ror) obj4;
                if (rorVar2.I != null) {
                    java.lang.Object obj5 = this.b;
                    if (!rorVar2.y() || (rpmVar = rorVar2.k) == null || (pairC = rpmVar.c((android.view.KeyEvent) obj5)) == null) {
                        zBooleanValue = false;
                        rphVar = null;
                    } else {
                        zBooleanValue = ((java.lang.Boolean) pairC.first).booleanValue();
                        rphVar = (defpackage.rph) pairC.second;
                    }
                    if (zBooleanValue) {
                        defpackage.oml omlVar = rorVar2.K;
                        return;
                    }
                    if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
                        android.view.KeyEvent keyEvent = (android.view.KeyEvent) obj5;
                        defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s Couldn't inject (%d,%d)", rorVar2.t, java.lang.Integer.valueOf(keyEvent.getKeyCode()), java.lang.Integer.valueOf(keyEvent.getAction()));
                    }
                    try {
                        if (((defpackage.ror) obj4).i != null) {
                            if (!((defpackage.ror) obj4).w.p(defpackage.rbf.L)) {
                                ((defpackage.ror) obj4).i.k(false);
                                return;
                            }
                            if (rphVar != null) {
                                rect = rphVar.c;
                            }
                            ((defpackage.ror) obj4).i.j(new com.google.android.gms.car.KeyEventCompleteData(false, rect));
                            return;
                        }
                        return;
                    } catch (android.os.RemoteException unused2) {
                        rorVar2.t();
                        return;
                    }
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Object obj6 = this.a;
                defpackage.ror rorVar3 = (defpackage.ror) obj6;
                if (rorVar3.I != null) {
                    java.lang.Object obj7 = this.b;
                    if (rorVar3.y()) {
                        pair = rorVar3.b;
                        defpackage.rpm rpmVar2 = rorVar3.k;
                        if (rpmVar2 != null && (pairD = rpmVar2.d((android.view.MotionEvent) obj7)) != null) {
                            pair = pairD;
                        }
                    } else {
                        pair = rorVar3.b;
                    }
                    if (defpackage.omv.c("CAR.PROJECTION.CAHI", 2)) {
                        defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "%s.onMotionEvent(%s) hint=%s", rorVar3.t, obj7, pair);
                    }
                    defpackage.oml omlVar2 = rorVar3.K;
                    int iIntValue = ((java.lang.Integer) pair.first).intValue();
                    defpackage.rph rphVar2 = (defpackage.rph) pair.second;
                    if (rphVar2 != null) {
                        try {
                            i = rphVar2.b;
                        } catch (android.os.RemoteException unused3) {
                            rorVar3.t();
                            return;
                        }
                    }
                    android.graphics.Rect rect2 = rphVar2 != null ? rphVar2.c : null;
                    defpackage.qyu qyuVar2 = ((defpackage.ror) obj6).i;
                    if (qyuVar2 != null) {
                        qyuVar2.l(new com.google.android.gms.car.TouchEventCompleteData(iIntValue, rect2, i));
                        return;
                    }
                    return;
                }
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.lang.Object obj8 = this.b;
                defpackage.rqm rqmVar = (defpackage.rqm) this.a;
                if (rqmVar.e.contains(obj8)) {
                    ((defpackage.rqj) obj8).a(rqmVar.g, rqmVar.h);
                    return;
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.xpa xpaVar = ((xpd) this.a).c;
                if (xpaVar == null) {
                    xpaVar = defpackage.xpa.a;
                }
                defpackage.rvo[] rvoVarArr = ((defpackage.rvp) ((defpackage.rtt) this.b).y.a).g;
                if (rvoVarArr == null) {
                    throw new java.lang.IllegalStateException("Service updated before service discovery");
                }
                for (defpackage.rvo rvoVar : rvoVarArr) {
                    if (rvoVar.a == xpaVar.c) {
                        java.lang.Object obj9 = rvoVar.d;
                        if (obj9 instanceof rth) {
                            ((rth) obj9).a();
                            return;
                        } else {
                            if (obj9 == null) {
                                throw new java.lang.IllegalStateException("Service updated before service discovery is complete");
                            }
                            defpackage.rvp.a.h().ai(8370).y("Attempted to update a service that is not updatable: %s", xpaVar);
                            return;
                        }
                    }
                }
                throw new java.lang.IllegalArgumentException("Updating a service that was not registered during service discovery");
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.rwq) this.b).d.h((java.nio.ByteBuffer) this.a);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                rxy.l((android.content.Context) this.b, (yyt) this.a);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object obj10 = this.b;
                defpackage.yqk yqkVar = rxy.a;
                olp olpVarQ = ryb.q((android.content.Context) obj10);
                java.lang.Object obj11 = this.a;
                java.lang.Object obj12 = ryd.b;
                java.lang.Object obj13 = ((defpackage.xei) obj11).a;
                synchronized (obj12) {
                    if (!olpVarQ.d) {
                        ryd.a.h().ai(8503).u("Troubleshooter Feedback Reporting not enabled, killing startup.");
                        return;
                    }
                    defpackage.xei xeiVar = new defpackage.xei(obj13);
                    ryf.a.l().ai(8524).u("Creating bug report thread.");
                    ryg rygVar = new ryg(xeiVar);
                    rygVar.start();
                    ((ryd) obj13).f = defpackage.xyn.h(rygVar);
                    return;
                }
            case 9:
                rxy.m((android.content.Context) this.b, (yyt) this.a);
                return;
            case 10:
                java.lang.Object obj14 = this.b;
                defpackage.yqk yqkVar2 = rxy.a;
                java.lang.Object obj15 = this.a;
                obj15.getClass();
                rxy.a.l().ai(8493).u("Updating troubleshooter parameters");
                android.net.Uri uriBuild = ryc.a.buildUpon().appendPath("parameters").build();
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("troubleshooter_parameters", ((defpackage.abng) obj15).h());
                rxy.o((android.content.Context) obj14, new rxu(uriBuild, contentValues, 0));
                return;
            case 11:
                rxy.k((android.content.Context) this.b, "cancel_notification_for_persistent_detector", (yyt) this.a);
                return;
            case 12:
                rxy.k((android.content.Context) this.b, "show_notification_for_persistent_detector", (yyt) this.a);
                return;
            case 13:
                android.content.Context context = ((rxz) this.b).b.d;
                olp olpVarQ2 = ryb.q(context);
                if (olpVarQ2.c) {
                    this.a.a(ryb.r(context), olpVarQ2);
                    return;
                }
                return;
            case 14:
                java.lang.Object obj16 = this.a;
                rye ryeVar = (rye) obj16;
                defpackage.yqk yqkVar3 = ryeVar.a;
                defpackage.ypu ypuVarAi = yqkVar3.l().ai(8507);
                java.lang.Object obj17 = this.b;
                olq olqVar = (olq) obj17;
                ypuVarAi.y("Collecting bug report for issue %s.", olqVar.c);
                try {
                    yqkVar3.l().ai(8509).M("Finished collecting bug report for issue %s, file stored to %s.", ((olq) obj17).c, ((rye) obj16).c.b(((olq) obj17).c, true));
                    rxy.n(((rye) obj16).b, (olq) obj17, 5);
                    return;
                } catch (java.io.IOException e) {
                    defpackage.ypu ypuVarAi2 = ryeVar.a.h().p(e).ai(8508);
                    yyt yytVarB = yyt.b(olqVar.d);
                    if (yytVarB == null) {
                        yytVarB = yyt.a;
                    }
                    ypuVarAi2.y("FAILED TO COLLECT BUG REPORT FOR ISSUE. TYPE: %s", yytVarB.name());
                    return;
                }
            case 15:
                defpackage.sau sauVar = (defpackage.sau) ((defpackage.qzx) this.a).a.get();
                if (sauVar != null) {
                    java.lang.Object obj18 = this.b;
                    if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
                        defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s onWindowAttributesChanged(attrs: %s)", sauVar.a, obj18);
                    }
                    defpackage.rpm rpmVar3 = sauVar.g;
                    if (rpmVar3 != null) {
                        rpmVar3.w(((com.google.android.gms.car.CarWindowManagerLayoutParams) obj18).a);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                defpackage.sau sauVar2 = (defpackage.sau) ((defpackage.qzx) this.a).a.get();
                if (sauVar2 != null) {
                    sauVar2.p((android.graphics.Rect) this.b);
                    return;
                }
                return;
            case 17:
                java.lang.Object obj19 = this.b;
                java.lang.Object obj20 = this.a;
                if (defpackage.rrx.e("CAR.CLIENT.WM.WIN", 2)) {
                    defpackage.rrx.d(2, "CAR.CLIENT.WM.WIN", null, "%s onKeyEvent(keyEvent:%s)", ((defpackage.qzx) obj20).a(), obj19);
                }
                defpackage.sau sauVar3 = (defpackage.sau) ((defpackage.qzx) obj20).a.get();
                if (sauVar3 != null) {
                    if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
                        defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s onKeyEvent(%s)", sauVar3.a, obj19);
                    }
                    android.util.Pair pair2 = new android.util.Pair(java.lang.Boolean.FALSE, null);
                    defpackage.rpm rpmVar4 = sauVar3.g;
                    if (rpmVar4 != null) {
                        pair2 = rpmVar4.c((android.view.KeyEvent) obj19);
                    }
                    if (sauVar3.g == null || pair2 == null || !((java.lang.Boolean) pair2.first).booleanValue()) {
                        sauVar3.d(false, pair2 != null ? (defpackage.rph) pair2.second : null);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                defpackage.sau sauVar4 = (defpackage.sau) ((defpackage.qzx) this.a).a.get();
                if (sauVar4 != null) {
                    sauVar4.m((com.google.android.gms.car.DrawingSpec) this.b, null);
                    return;
                }
                return;
            case 19:
                java.lang.Object obj21 = this.a;
                if (defpackage.rrx.e("CAR.CLIENT.WM.WIN", 2)) {
                    defpackage.rrx.d(2, "CAR.CLIENT.WM.WIN", null, "%s onMotionEvent() Post to CarWindow", ((defpackage.qzx) obj21).a());
                }
                defpackage.sau sauVar5 = (defpackage.sau) ((defpackage.qzx) obj21).a.get();
                if (sauVar5 != null) {
                    defpackage.rpm rpmVar5 = sauVar5.g;
                    if (rpmVar5 == null) {
                        sauVar5.j(-1, null);
                        return;
                    }
                    android.util.Pair pairD2 = rpmVar5.d((android.view.MotionEvent) this.b);
                    if (pairD2 != null) {
                        sauVar5.j(((java.lang.Integer) pairD2.first).intValue(), (defpackage.rph) pairD2.second);
                        return;
                    } else {
                        sauVar5.j(-1, null);
                        return;
                    }
                }
                return;
            default:
                android.os.Bundle bundle = (android.os.Bundle) this.b;
                java.lang.String string = bundle.getString("PARAM_HOST_ADDRESS");
                int i2 = bundle.getInt("PARAM_SERVICE_PORT", -1);
                android.net.wifi.WifiInfo wifiInfo = (android.net.wifi.WifiInfo) bundle.getParcelable("wifi_info");
                android.net.Network network = (android.net.Network) bundle.getParcelable("PARAM_SERVICE_WIFI_NETWORK");
                boolean z = bundle.getBoolean("WIFI_Q_ENABLED");
                com.google.android.gms.carsetup.CarSetupServiceImpl.a.f().ai(8679).S("Start wifi setup %s:%s isUsingQNetworkStack=%b wifiInfo=(%s)", string, java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z), wifiInfo);
                ?? r14 = this.a;
                com.google.android.gms.carsetup.CarSetupServiceImpl carSetupServiceImpl = (com.google.android.gms.carsetup.CarSetupServiceImpl) r14;
                defpackage.sci sciVar = carSetupServiceImpl.n;
                defpackage.yqk yqkVar4 = defpackage.sci.a;
                yqkVar4.l().ai(8715).u("init");
                if (sciVar.h) {
                    yqkVar4.g().ai(8716).u("Already initialized");
                } else {
                    sciVar.d = r14;
                    sciVar.f = java.util.concurrent.Executors.newScheduledThreadPool(1);
                    android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                    intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                    defpackage.duw.e(sciVar.b, sciVar.l, intentFilter, null, 2);
                    sciVar.j = 0;
                    sciVar.h = true;
                }
                carSetupServiceImpl.n.b(string, i2, wifiInfo, network, z);
                return;
        }
    }

    public /* synthetic */ ron(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
