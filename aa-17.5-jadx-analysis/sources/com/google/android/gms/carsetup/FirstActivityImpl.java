package com.google.android.gms.carsetup;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.carsetup.setup.SetupBinder;
import defpackage.bc;
import defpackage.ols;
import defpackage.qst;
import defpackage.rhz;
import defpackage.rrc;
import defpackage.rrd;
import defpackage.rrs;
import defpackage.rxr;
import defpackage.sak;
import defpackage.scj;
import defpackage.sck;
import defpackage.scl;
import defpackage.scs;
import defpackage.sct;
import defpackage.seu;
import defpackage.sgf;
import defpackage.sgn;
import defpackage.sgp;
import defpackage.sky;
import defpackage.svk;
import defpackage.urg;
import defpackage.ypf;
import defpackage.yxi;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;

/* loaded from: classes.dex */
public class FirstActivityImpl extends bc {
    static boolean n;
    static boolean o;
    public svk q;
    private final sgn r = new sgp();
    private LocalBinder s;
    private qst t;
    private rxr u;
    private sak v;
    public static final ypf m = ols.R("CAR.FIRST");
    static final long p = SystemClock.elapsedRealtime();

    public static class LocalBinder extends SetupBinder {
        private FirstActivityImpl b;

        public LocalBinder(FirstActivityImpl firstActivityImpl, Intent intent, sky skyVar) {
            super(skyVar);
            this.a = intent;
            this.b = firstActivityImpl;
        }

        @Override // com.google.android.gms.carsetup.setup.SetupBinder
        public final void a() {
            FirstActivityImpl firstActivityImpl = this.b;
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

    private final void C(Intent intent) throws RemoteException {
        IBinder iBinder;
        new sck();
        urg urgVar = new urg(this, intent);
        BinderParcel binderParcel = (BinderParcel) intent.getParcelableExtra("0p_checker");
        if (binderParcel == null || (iBinder = binderParcel.a) == null) {
            rrd.b("CAR.MISC", null, "No 0p checker");
            urgVar.e(false);
            return;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.IZeroPartyChecker");
        scl scjVar = iInterfaceQueryLocalInterface instanceof scl ? (scl) iInterfaceQueryLocalInterface : new scj(iBinder);
        scs scsVar = new scs(scjVar.asBinder(), urgVar);
        try {
            scjVar.asBinder().linkToDeath(scsVar, 0);
            scjVar.e(scsVar);
        } catch (RemoteException unused) {
            rrd.b("CAR.MISC", null, "Remote process died before validation");
            scsVar.binderDied();
        }
    }

    public final void A(Intent intent) {
        ypf ypfVar = m;
        ypfVar.l().ai(8700).R("handle intent %s, restart suppressed %b, skipRestartFlow: %b", intent, false, true);
        if (this.t.g() && sct.a(this)) {
            ypfVar.h().ai(8704).y("Detected unsupported device, ignoring %s", intent);
            finish();
            return;
        }
        if (seu.a.c(this)) {
            ypfVar.h().ai(8703).y("Detected user disabled Gearhead, ignoring %s", intent);
            sak sakVar = this.v;
            sakVar.getClass();
            sakVar.e(rrc.h(yxy.CAR_SERVICE, yzz.FIRST_ACTIVITY, yzy.rf).l());
            finishAndRemoveTask();
            return;
        }
        if (sgf.d(this, intent)) {
            ypfVar.f().ai(8701).u("PreSetup flow started, exiting for now");
            finishAndRemoveTask();
            return;
        }
        svk svkVarQ = q();
        this.q = svkVarQ;
        svkVarQ.c();
        B(2);
        this.s = new LocalBinder(this, intent, new sky(this.q));
        Intent intentPutExtra = new Intent().setClassName(this, ((ComponentName) rhz.b.gu()).getClassName()).putExtra("EXTRA_LOCAL_BINDER", this.s).putExtra("PreSetup.PRE_SETUP_WELCOME_SCREEN_SHOWN", false);
        ols.M(this, yxi.CAR_SETUP_STARTED_SETUP_SERVICE);
        p(intentPutExtra);
    }

    public final void B(int i) {
        ols.K(getApplicationContext(), "com.google.android.gms.car.CONNECTIVITY_STAGE_REACHED", i - 1, null);
    }

    protected rxr o() {
        return rxr.a(this);
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
    
        defpackage.ols.M(getApplicationContext(), defpackage.yxi.USB_ISSUE_NO_VERSION_FIELD);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0126, code lost:
    
        if (r2 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0132, code lost:
    
        if (r2.getModel().equals("Android") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013e, code lost:
    
        if (defpackage.adbr.a.gu().r() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0140, code lost:
    
        r0.f().ai(8696).u("Do not handle accessory model 'Android'");
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015b, code lost:
    
        if ("com.google.android.gms.car.usb.USB_ACCESSORY_FORCE_START".equals(r8.getAction()) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x015d, code lost:
    
        defpackage.ols.K(r7, "com.google.android.gms.car.FIRST_ACTIVITY", defpackage.rrs.i.ordinal(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0167, code lost:
    
        defpackage.ols.K(r7, "com.google.android.gms.car.FIRST_ACTIVITY", defpackage.rrs.c.ordinal(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0170, code lost:
    
        A(r8);
     */
    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r8) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.carsetup.FirstActivityImpl.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.bc, android.app.Activity
    public final void onDestroy() {
        m.l().ai(8709).u("onDestroy");
        B(3);
        sak sakVar = this.v;
        if (sakVar != null) {
            sakVar.a();
        }
        super.onDestroy();
        svk svkVar = this.q;
        if (svkVar != null) {
            svkVar.e();
            this.q = null;
        }
        LocalBinder localBinder = this.s;
        if (localBinder != null) {
            localBinder.a();
            this.s = null;
        }
        rxr rxrVar = this.u;
        if (rxrVar != null) {
            rxrVar.e(this);
            this.u = null;
        }
    }

    @Override // defpackage.ob, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (sgf.e(intent)) {
            return;
        }
        m.f().ai(8710).y("Received new intent: %s, ignoring it.", intent);
        ols.L(this, "com.google.android.gms.car.FIRST_ACTIVITY", rrs.h, null);
    }

    protected void p(Intent intent) {
        startService(intent);
    }

    public final svk q() {
        svk svkVar = new svk(getApplicationContext(), 268435462, "CAR.FIRST");
        svkVar.g();
        return svkVar;
    }
}
