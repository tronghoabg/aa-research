package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qzx extends defpackage.ijw implements defpackage.qzy {
    public final java.lang.ref.WeakReference a;
    private final android.os.Handler b;

    public qzx(defpackage.sau sauVar, android.os.Handler handler) {
        super("com.google.android.gms.car.ICarWindowCallback");
        this.a = new java.lang.ref.WeakReference(sauVar);
        this.b = handler;
    }

    private final void b(com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent) {
        c(new defpackage.kfq(this, inputFocusChangedEvent, 7, (byte[]) null));
    }

    private final void c(java.lang.Runnable runnable) {
        this.b.post(new defpackage.kfq(this, runnable, 8, (byte[]) null));
    }

    public final java.lang.String a() {
        defpackage.sau sauVar = (defpackage.sau) this.a.get();
        if (sauVar == null) {
            return null;
        }
        return sauVar.a;
    }

    @Override // defpackage.qzy
    public final void e() {
        defpackage.rrx.d(6, "CAR.CLIENT.WM.WIN", null, "ANR in CarWindow %s", this.a.get());
        android.os.Process.killProcess(android.os.Process.myPid());
        java.lang.System.exit(10);
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                com.google.android.gms.car.DrawingSpec drawingSpec = (com.google.android.gms.car.DrawingSpec) defpackage.ijx.a(parcel, com.google.android.gms.car.DrawingSpec.CREATOR);
                defpackage.ijx.d(parcel);
                n(drawingSpec);
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                p();
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                defpackage.ijx.d(parcel);
                h(z, z2);
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                android.view.MotionEvent motionEvent = (android.view.MotionEvent) defpackage.ijx.a(parcel, android.view.MotionEvent.CREATOR);
                defpackage.ijx.d(parcel);
                k(motionEvent);
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                android.view.KeyEvent keyEvent = (android.view.KeyEvent) defpackage.ijx.a(parcel, android.view.KeyEvent.CREATOR);
                defpackage.ijx.d(parcel);
                j(keyEvent);
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                f(i2);
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                e();
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent = (com.google.android.gms.car.InputFocusChangedEvent) defpackage.ijx.a(parcel, com.google.android.gms.car.InputFocusChangedEvent.CREATOR);
                defpackage.ijx.d(parcel);
                g(inputFocusChangedEvent);
                return true;
            case 9:
                com.google.android.gms.car.CarWindowManagerLayoutParams carWindowManagerLayoutParams = (com.google.android.gms.car.CarWindowManagerLayoutParams) defpackage.ijx.a(parcel, com.google.android.gms.car.CarWindowManagerLayoutParams.CREATOR);
                defpackage.ijx.d(parcel);
                o(carWindowManagerLayoutParams);
                return true;
            case 10:
                com.google.android.gms.car.DrawingSpec drawingSpec2 = (com.google.android.gms.car.DrawingSpec) defpackage.ijx.a(parcel, com.google.android.gms.car.DrawingSpec.CREATOR);
                android.content.res.Configuration configuration = (android.content.res.Configuration) defpackage.ijx.a(parcel, android.content.res.Configuration.CREATOR);
                defpackage.ijx.d(parcel);
                m(drawingSpec2, configuration);
                return true;
            case 11:
                android.content.res.Configuration configuration2 = (android.content.res.Configuration) defpackage.ijx.a(parcel, android.content.res.Configuration.CREATOR);
                int i3 = parcel.readInt();
                defpackage.ijx.d(parcel);
                l(configuration2, i3);
                return true;
            case 12:
                android.graphics.Rect rect = (android.graphics.Rect) defpackage.ijx.a(parcel, android.graphics.Rect.CREATOR);
                defpackage.ijx.d(parcel);
                i(rect);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.qzy
    public final void f(int i) throws android.os.RemoteException {
        c(new defpackage.ryw(this, 8));
    }

    @Override // defpackage.qzy
    public final void g(com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent) throws android.os.RemoteException {
        if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "Binder:%s onInputFocusChange(event:%s)", a(), inputFocusChangedEvent);
        }
        b(inputFocusChangedEvent);
    }

    @Override // defpackage.qzy
    @java.lang.Deprecated
    public final void h(boolean z, boolean z2) throws android.os.RemoteException {
        if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "Binder:%s onInputFocusChangedDeprecated(hasFocus:%b, isNotInTouchMode:%b)", a(), java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2));
        }
        b(new com.google.android.gms.car.InputFocusChangedEvent(z, !z2, -1, null));
    }

    @Override // defpackage.qzy
    public final void i(android.graphics.Rect rect) throws android.os.RemoteException {
        c(new defpackage.ron(this, rect, 16));
    }

    @Override // defpackage.qzy
    public final void j(android.view.KeyEvent keyEvent) throws android.os.RemoteException {
        if (defpackage.rrx.e("CAR.CLIENT.WM.WIN", 2)) {
            defpackage.rrx.d(2, "CAR.CLIENT.WM.WIN", null, "Binder:%s onKeyEvent(keyEvent:%s)", a(), keyEvent);
        }
        c(new defpackage.ron(this, keyEvent, 17));
    }

    @Override // defpackage.qzy
    public final void k(android.view.MotionEvent motionEvent) throws android.os.RemoteException {
        if (defpackage.rrx.e("CAR.CLIENT.WM.WIN", 2)) {
            defpackage.rrx.d(2, "CAR.CLIENT.WM.WIN", null, "Binder:%s onMotionEvent(motionEvent:%s)", a(), motionEvent);
        }
        if (motionEvent.isFromSource(4098)) {
            b(new com.google.android.gms.car.InputFocusChangedEvent(true, true, -1, null));
            if (defpackage.rrx.e("CAR.CLIENT.WM.WIN", 2)) {
                defpackage.rrx.d(2, "CAR.CLIENT.WM.WIN", null, "Binder:%s waitForInputFocus()", a());
            }
            defpackage.sau sauVar = (defpackage.sau) this.a.get();
            if (sauVar != null) {
                java.lang.Object obj = sauVar.c;
                synchronized (obj) {
                    try {
                        synchronized (obj) {
                            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                            if (defpackage.rrx.e("CAR.CLIENT.WM.WIN", 2)) {
                                defpackage.rrx.d(2, "CAR.CLIENT.WM.WIN", null, "Binder: %s waitForInputFocus() [hasFocus:%b]", sauVar.a, java.lang.Boolean.valueOf(sauVar.l));
                            }
                            while (!sauVar.l) {
                                obj.wait(500L);
                            }
                            if (defpackage.rrx.e("CAR.CLIENT.WM.WIN", 2)) {
                                defpackage.rrx.d(2, "CAR.CLIENT.WM.WIN", null, "Binder:%s waitForInputFocus() [hasFocus:%b, waitTimeInMs:%d]", sauVar.a, java.lang.Boolean.valueOf(sauVar.l), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                            if (!sauVar.l) {
                                defpackage.rrx.d(6, "CAR.CLIENT.WM.WIN", null, "Binder:%s waitForInputFocus() Focus not gained.", sauVar.a);
                            }
                        }
                    } catch (java.lang.InterruptedException e) {
                        defpackage.rrx.b("CAR.CLIENT.WM.WIN", e, "Error waiting for car window to receive focus on touch.");
                    }
                }
            } else if (defpackage.rrx.e("CAR.CLIENT.WM.WIN", 2)) {
                defpackage.rrx.f("CAR.CLIENT.WM.WIN", "Binder: waitForInputFocus(): CarWindow gone.");
            }
        }
        c(new defpackage.ron(this, motionEvent, 19));
    }

    @Override // defpackage.qzy
    public final void l(android.content.res.Configuration configuration, int i) {
        c(new defpackage.sas(this, configuration, i, 0));
    }

    @Override // defpackage.qzy
    public final void m(com.google.android.gms.car.DrawingSpec drawingSpec, android.content.res.Configuration configuration) throws android.os.RemoteException {
        c(new defpackage.imx(this, drawingSpec, configuration, 8));
    }

    @Override // defpackage.qzy
    public final void n(com.google.android.gms.car.DrawingSpec drawingSpec) throws android.os.RemoteException {
        c(new defpackage.ron(this, drawingSpec, 18));
    }

    @Override // defpackage.qzy
    public final void o(com.google.android.gms.car.CarWindowManagerLayoutParams carWindowManagerLayoutParams) {
        c(new defpackage.ron(this, carWindowManagerLayoutParams, 15));
    }

    @Override // defpackage.qzy
    public final void p() throws android.os.RemoteException {
        c(new defpackage.ryw(this, 7));
    }
}
