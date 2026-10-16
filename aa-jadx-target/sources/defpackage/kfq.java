package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kfq implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kfq(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v66, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object, swq] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, sws] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object, swt] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, qvl] */
    /* JADX WARN: Type inference failed for: r11v56, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, swp, sws, swt] */
    /* JADX WARN: Type inference failed for: r11v92, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        defpackage.rxo rxmVar = null;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.ocn) this.a).f((android.content.Context) this.b, defpackage.kfs.b, 2132083202, 1);
                return;
            case 1:
                java.lang.Object obj = this.b;
                boolean zN = ((defpackage.jpy) obj).n();
                ?? r11 = this.a;
                if (zN) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.jqb.a.f()).ai((char) 2590)).u("Tearing down; skipping registration of CarConnectionListener to delegate.");
                    return;
                }
                try {
                    r11.aM(((defpackage.jqb) obj).h);
                    return;
                } catch (android.os.RemoteException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.jqb.a.g()).p(e)).ai((char) 2589)).u("Failed to register CarConnectionListener to delegate.");
                    throw new java.lang.IllegalStateException(e);
                }
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.util.Iterator<E> it = defpackage.yhx.n(((defpackage.mgv) this.a).a).iterator();
                while (it.hasNext()) {
                    ((defpackage.mgu) it.next()).a((defpackage.mgt) this.b);
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqk yqkVar = defpackage.qsa.a;
                yqkVar.l().ai(7688).u("onEndPointReady on main thread");
                defpackage.qsa qsaVar = (defpackage.qsa) this.b;
                if (qsaVar.i) {
                    yqkVar.l().ai(7692).u("onEndPointReady exit early due onDisconnectedCalled");
                    return;
                }
                if (qsaVar.b != 0) {
                    yqkVar.l().ai(7691).w("onEndPointReady exit early due to initializationStatus!=STATUS_SUCCESS, initializationStatus=%d", qsaVar.b);
                    return;
                }
                qsaVar.g = (defpackage.rtb) this.a;
                if (android.os.Build.VERSION.SDK_INT < 30) {
                    qsaVar.e.c(defpackage.rhj.EVENT_ENDPOINT_READY);
                    return;
                }
                com.google.android.gms.carsetup.CarInfoInternal carInfoInternal = ((defpackage.qtj) qsaVar.p).j;
                java.lang.Boolean boolValueOf = carInfoInternal != null ? java.lang.Boolean.valueOf(carInfoInternal.p) : null;
                defpackage.ysr.bk(boolValueOf != null, "Car should be available at this point!");
                if (boolValueOf.booleanValue()) {
                    yqkVar.l().ai(7690).u("Car authorized; starting normal operation");
                    qsaVar.e.c(defpackage.rhj.EVENT_ENDPOINT_READY);
                    return;
                } else {
                    yqkVar.l().ai(7689).u("Car not authorized; deferring until authorized");
                    qsaVar.e.c(defpackage.rhj.EVENT_ENDPOINT_READY_WAIT_FOR_USER_AUTHORIZATION);
                    return;
                }
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.qtn qtnVar = (defpackage.qtn) ((defpackage.wyz) this.b).a;
                qtnVar.i = true;
                qtnVar.h = (defpackage.rvp) this.a;
                qtnVar.o();
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                android.util.SparseArray sparseArray = defpackage.ror.a;
                defpackage.ror rorVar = (defpackage.ror) this.a;
                android.graphics.Rect rect = rorVar.v;
                rect.set((android.graphics.Rect) this.b);
                defpackage.rpm rpmVar = rorVar.k;
                if (rpmVar != null) {
                    rpmVar.B(rect);
                    return;
                } else {
                    boolean z = defpackage.rrx.a;
                    defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "Non-drawable insets updated before uiHost attached. Will apply to uiHost when attaching.", new java.lang.Object[0]);
                    return;
                }
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                android.util.SparseArray sparseArray2 = defpackage.ror.a;
                defpackage.ror rorVar2 = (defpackage.ror) this.a;
                android.graphics.Rect rect2 = rorVar2.u;
                rect2.set((android.graphics.Rect) this.b);
                defpackage.rpm rpmVar2 = rorVar2.k;
                if (rpmVar2 != null) {
                    rpmVar2.D(rect2);
                    return;
                } else {
                    boolean z2 = defpackage.rrx.a;
                    defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "System window insets updated before uiHost attached. Will apply to uiHost when attaching.", new java.lang.Object[0]);
                    return;
                }
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj2 = this.a;
                java.lang.Object obj3 = this.b;
                if (defpackage.rrx.e("CAR.CLIENT.WM.WIN", 2)) {
                    defpackage.rrx.d(2, "CAR.CLIENT.WM.WIN", null, "%s onInputFocusChange(event:%s)", ((defpackage.qzx) obj3).a(), obj2);
                }
                defpackage.sau sauVar = (defpackage.sau) ((defpackage.qzx) obj3).a.get();
                if (sauVar != null) {
                    if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
                        defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s onInputFocusChange(event:%s)", sauVar.a, obj2);
                    }
                    defpackage.rpm rpmVar3 = sauVar.g;
                    if (rpmVar3 != null) {
                        rpmVar3.o((com.google.android.gms.car.InputFocusChangedEvent) obj2);
                        return;
                    } else {
                        defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s onInputFocusChange(event:%s) presentation:null", sauVar.a, obj2);
                        return;
                    }
                }
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                if (((defpackage.sau) ((defpackage.qzx) this.b).a.get()) != null) {
                    this.a.run();
                    return;
                } else {
                    if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 5)) {
                        defpackage.rrx.d(5, "CAR.CLIENT.WM.WIN", null, "No reference to CarWindow, doing nothing", new java.lang.Object[0]);
                        return;
                    }
                    return;
                }
            case 9:
                ((com.google.android.gms.carsetup.FirstActivityImpl) this.a).A((android.content.Intent) this.b);
                return;
            case 10:
                java.lang.Object obj4 = this.a;
                java.lang.Object obj5 = this.b;
                java.util.List list = com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.a;
                defpackage.duw.e((android.content.Context) obj5, (android.content.BroadcastReceiver) obj4, new android.content.IntentFilter("android.hardware.usb.action.USB_STATE"), com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.g, 2);
                return;
            case 11:
                java.lang.Object obj6 = this.a;
                java.lang.Object obj7 = this.b;
                synchronized (com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.d) {
                    ((android.content.Context) obj7).unregisterReceiver((android.content.BroadcastReceiver) obj6);
                    if (com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.e == null && com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.c.decrementAndGet() == 0) {
                        android.os.HandlerThread handlerThread = com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.f;
                        if (handlerThread != null) {
                            handlerThread.quitSafely();
                        }
                        com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.f = null;
                        com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.g = null;
                    }
                    break;
                }
                return;
            case 12:
                ?? r0 = this.b;
                if (r0 != 0) {
                    android.os.IInterface iInterfaceQueryLocalInterface = r0.queryLocalInterface("com.google.android.gms.car.startup.IStartup");
                    rxmVar = iInterfaceQueryLocalInterface instanceof defpackage.rxo ? (defpackage.rxo) iInterfaceQueryLocalInterface : new defpackage.rxm(r0);
                }
                java.lang.Object obj8 = this.a;
                ((defpackage.shp) obj8).f = rxmVar;
                try {
                    defpackage.rxo rxoVar = ((defpackage.shp) obj8).f;
                    rxoVar.getClass();
                    rxoVar.h(((defpackage.shp) obj8).b, ((defpackage.shp) obj8).a);
                    return;
                } catch (android.os.RemoteException e2) {
                    defpackage.shu.a.g().p(e2).ai(8953).u("Should never get a RemoteException when resuming a connection.");
                    throw new java.lang.RuntimeException(e2);
                }
            case 13:
                defpackage.snd sndVar = (defpackage.snd) this.a;
                defpackage.snb snbVar = (defpackage.snb) sndVar.e.k.get(sndVar.b);
                if (snbVar == null) {
                    return;
                }
                if (!((com.google.android.gms.common.ConnectionResult) this.b).c()) {
                    snbVar.j((com.google.android.gms.common.ConnectionResult) this.b, null);
                    return;
                }
                sndVar.d = true;
                defpackage.slr slrVar = sndVar.a;
                if (slrVar.i()) {
                    sndVar.c();
                    return;
                }
                try {
                    slrVar.s(null, slrVar.m());
                    return;
                } catch (java.lang.SecurityException e3) {
                    android.util.Log.e("GoogleApiManager", "Failed to get service from broker. ", e3);
                    ((defpackage.snd) this.a).a.o("Failed to get service from broker.");
                    snbVar.j(new com.google.android.gms.common.ConnectionResult(1, 10, null, null, null), null);
                    return;
                }
            case 14:
                try {
                    defpackage.swx swxVar = (defpackage.swx) ((defpackage.swm) this.b).a.a((defpackage.swx) this.a);
                    ?? r12 = this.b;
                    if (swxVar == 0) {
                        ((defpackage.swm) r12).d(new java.lang.NullPointerException("Continuation returned null"));
                        return;
                    }
                    java.util.concurrent.Executor executor = defpackage.sxb.b;
                    swxVar.l(executor, r12);
                    swxVar.k(executor, r12);
                    swxVar.h(executor, r12);
                    return;
                } catch (defpackage.swv e4) {
                    boolean z3 = e4.getCause() instanceof java.lang.Exception;
                    java.lang.Object obj9 = this.b;
                    if (z3) {
                        ((defpackage.swm) obj9).b.o((java.lang.Exception) e4.getCause());
                        return;
                    } else {
                        ((defpackage.swm) obj9).b.o(e4);
                        return;
                    }
                } catch (java.lang.Exception e5) {
                    ((defpackage.swm) this.b).b.o(e5);
                    return;
                }
            case 15:
                java.lang.Object obj10 = this.b;
                synchronized (((defpackage.swr) obj10).a) {
                    ((defpackage.swr) obj10).b.a((defpackage.swx) this.a);
                    break;
                }
                return;
            case 16:
                java.lang.Object obj11 = this.b;
                synchronized (((defpackage.swr) obj11).a) {
                    ?? r1 = ((defpackage.swr) obj11).b;
                    java.lang.Exception excD = ((defpackage.swx) this.a).d();
                    if (excD == null) {
                        throw new java.lang.NullPointerException("null reference");
                    }
                    r1.d(excD);
                }
                return;
            case 17:
                java.lang.Object obj12 = this.b;
                synchronized (((defpackage.swr) obj12).a) {
                    ((defpackage.swr) obj12).b.e(((defpackage.swx) this.a).e());
                    break;
                }
                return;
            case 18:
                int i = ((defpackage.vme) this.b).a;
                if (i != 0) {
                    android.os.Process.setThreadPriority(i);
                }
                this.a.run();
                return;
            case 19:
                ((defpackage.vvx) this.a).c.g.a(6, ((defpackage.vlu) this.b).a);
                return;
            default:
                java.util.Map mapA = defpackage.wds.a(((defpackage.wba) this.b).c);
                java.lang.Object obj13 = this.a;
                if (mapA.containsKey(obj13)) {
                    return;
                }
                android.util.Log.e("FilePhenotypeFlags", defpackage.a.bp((java.lang.String) obj13, "Config package ", " cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags."));
                return;
        }
    }

    public /* synthetic */ kfq(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public kfq(java.lang.Object obj, java.lang.Object obj2, int i, char[] cArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public kfq(defpackage.snd sndVar, com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        this.c = i;
        this.b = connectionResult;
        this.a = sndVar;
    }
}
