package com.google.android.gms.carsetup;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class FirstActivityImpl extends defpackage.bc {
    static boolean n;
    static boolean o;
    public defpackage.swi q;
    private final defpackage.shj r = new defpackage.shl();
    private com.google.android.gms.carsetup.FirstActivityImpl.LocalBinder s;
    private defpackage.qtp t;
    private defpackage.ryk u;
    private defpackage.sbg v;
    public static final defpackage.yqk m = defpackage.omv.n("CAR.FIRST");
    static final long p = android.os.SystemClock.elapsedRealtime();

    public static class LocalBinder extends com.google.android.gms.carsetup.setup.SetupBinder {
        private com.google.android.gms.carsetup.FirstActivityImpl b;

        public LocalBinder(com.google.android.gms.carsetup.FirstActivityImpl firstActivityImpl, android.content.Intent intent, defpackage.slu sluVar) {
            super(sluVar);
            this.a = intent;
            this.b = firstActivityImpl;
        }

        @Override // com.google.android.gms.carsetup.setup.SetupBinder
        public final void a() {
            com.google.android.gms.carsetup.FirstActivityImpl firstActivityImpl = this.b;
            if (firstActivityImpl != null) {
                firstActivityImpl.finishAndRemoveTask();
            }
            this.b = null;
        }

        @Override // com.google.android.gms.carsetup.setup.SetupBinder
        public final boolean b() {
            return this.b != null;
        }
    }

    private final void C(android.content.Intent intent) {
        android.os.IBinder iBinder;
        new sdg();
        usd usdVar = new usd(this, intent);
        com.google.android.gms.carsetup.BinderParcel binderParcel = (com.google.android.gms.carsetup.BinderParcel) intent.getParcelableExtra("0p_checker");
        if (binderParcel == null || (iBinder = binderParcel.a) == null) {
            defpackage.rrx.b("CAR.MISC", null, "No 0p checker");
            usdVar.e(false);
            return;
        }
        sdh sdhVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.IZeroPartyChecker");
        sdh sdfVar = sdhVarQueryLocalInterface instanceof sdh ? sdhVarQueryLocalInterface : new sdf(iBinder);
        android.os.IBinder.DeathRecipient sdoVar = new sdo(sdfVar.asBinder(), usdVar);
        try {
            sdfVar.asBinder().linkToDeath(sdoVar, 0);
            sdfVar.e(sdoVar);
        } catch (android.os.RemoteException unused) {
            defpackage.rrx.b("CAR.MISC", null, "Remote process died before validation");
            sdoVar.binderDied();
        }
    }

    public final void A(android.content.Intent intent) {
        defpackage.yqk yqkVar = m;
        yqkVar.l().ai(8725).R("handle intent %s, restart suppressed %b, skipRestartFlow: %b", intent, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
        if (this.t.g() && sdp.a(this)) {
            yqkVar.h().ai(8729).y("Detected unsupported device, ignoring %s", intent);
            finish();
            return;
        }
        if (defpackage.sfq.a.c(this)) {
            yqkVar.h().ai(8728).y("Detected user disabled Gearhead, ignoring %s", intent);
            defpackage.sbg sbgVar = this.v;
            sbgVar.getClass();
            sbgVar.e(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.FIRST_ACTIVITY, defpackage.zbd.rh).l());
            finishAndRemoveTask();
            return;
        }
        if (defpackage.shb.d(this, intent)) {
            yqkVar.f().ai(8726).u("PreSetup flow started, exiting for now");
            finishAndRemoveTask();
            return;
        }
        defpackage.swi swiVarQ = q();
        this.q = swiVarQ;
        swiVarQ.c();
        B(2);
        this.s = new com.google.android.gms.carsetup.FirstActivityImpl.LocalBinder(this, intent, new defpackage.slu(this.q));
        android.content.Intent intentPutExtra = new android.content.Intent().setClassName(this, ((android.content.ComponentName) defpackage.riv.b.fF()).getClassName()).putExtra("EXTRA_LOCAL_BINDER", this.s).putExtra("PreSetup.PRE_SETUP_WELCOME_SCREEN_SHOWN", false);
        defpackage.omv.i(this, defpackage.yyn.CAR_SETUP_STARTED_SETUP_SERVICE);
        p(intentPutExtra);
    }

    public final void B(int i) {
        defpackage.omv.g(getApplicationContext(), "com.google.android.gms.car.CONNECTIVITY_STAGE_REACHED", i - 1, null);
    }

    protected defpackage.ryk o() {
        return defpackage.ryk.a(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0104, code lost:
    
        if (r2.equals("android.hardware.usb.action.USB_ACCESSORY_ATTACHED") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010b, code lost:
    
        if (r2.equals("com.google.android.gms.car.usb.USB_ACCESSORY_FORCE_START") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x010d, code lost:
    
        r2 = (android.hardware.usb.UsbAccessory) r8.getParcelableExtra("accessory");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0115, code lost:
    
        if (r2 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011b, code lost:
    
        if (r2.getVersion() != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011d, code lost:
    
        defpackage.omv.i(getApplicationContext(), defpackage.yyn.USB_ISSUE_NO_VERSION_FIELD);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0126, code lost:
    
        if (r2 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0132, code lost:
    
        if (r2.getModel().equals("Android") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013e, code lost:
    
        if (defpackage.adcq.a.fF().r() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0140, code lost:
    
        r0.f().ai(8721).u("Do not handle accessory model 'Android'");
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015b, code lost:
    
        if ("com.google.android.gms.car.usb.USB_ACCESSORY_FORCE_START".equals(r8.getAction()) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x015d, code lost:
    
        defpackage.omv.g(r7, "com.google.android.gms.car.FIRST_ACTIVITY", defpackage.rsm.i.ordinal(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0167, code lost:
    
        defpackage.omv.g(r7, "com.google.android.gms.car.FIRST_ACTIVITY", defpackage.rsm.c.ordinal(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0170, code lost:
    
        A(r8);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.bc, defpackage.od, defpackage.cs, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.carsetup.FirstActivityImpl.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.bc, android.app.Activity
    public final void onDestroy() {
        m.l().ai(8734).u("onDestroy");
        B(3);
        defpackage.sbg sbgVar = this.v;
        if (sbgVar != null) {
            sbgVar.a();
        }
        super.onDestroy();
        defpackage.swi swiVar = this.q;
        if (swiVar != null) {
            swiVar.e();
            this.q = null;
        }
        com.google.android.gms.carsetup.FirstActivityImpl.LocalBinder localBinder = this.s;
        if (localBinder != null) {
            localBinder.a();
            this.s = null;
        }
        defpackage.ryk rykVar = this.u;
        if (rykVar != null) {
            rykVar.e(this);
            this.u = null;
        }
    }

    @Override // defpackage.od, android.app.Activity
    public final void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (defpackage.shb.e(intent)) {
            return;
        }
        m.f().ai(8735).y("Received new intent: %s, ignoring it.", intent);
        defpackage.omv.h(this, "com.google.android.gms.car.FIRST_ACTIVITY", defpackage.rsm.h, null);
    }

    protected void p(android.content.Intent intent) {
        startService(intent);
    }

    public final defpackage.swi q() {
        defpackage.swi swiVar = new defpackage.swi(getApplicationContext(), 268435462, "CAR.FIRST");
        swiVar.g();
        return swiVar;
    }
}
