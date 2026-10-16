package defpackage;

import android.app.KeyguardManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.media.AudioAttributes;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import com.google.android.gms.car.libs.cakewalk.bottomsheets.BottomSheetView;
import com.google.android.projection.gearhead.R;
import j$.util.Optional;

/* loaded from: classes2.dex */
public class sfl extends ep implements sfz, sfu {
    public static final ypf m = ols.R("CAR.SETUP.FRX");
    public static final Intent n = new Intent("com.google.android.gms.carsetup.setup.PreSetupActivityImpl.ACTION_FORCE_FINISH").setPackage(rhz.e.getPackageName());
    static final IntentFilter o = new IntentFilter("com.google.android.gms.carsetup.setup.PreSetupActivityImpl.ACTION_FORCE_FINISH");
    static final IntentFilter p = new IntentFilter("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
    sak q;
    public sga r;
    private Handler s;
    private Intent t = null;
    private rht u;
    private rht v;

    protected Optional A() {
        return Optional.empty();
    }

    @Override // defpackage.sfu
    public final sga B() {
        sga sgaVar = this.r;
        sgaVar.getClass();
        return sgaVar;
    }

    @Override // defpackage.sfz
    public final void C() {
        rht rhtVar = this.u;
        if (rhtVar != null) {
            unregisterReceiver(rhtVar);
            this.u = null;
        }
    }

    @Override // defpackage.sfz
    public final void D() {
        rht rhtVar = this.v;
        if (rhtVar != null) {
            unregisterReceiver(rhtVar);
            this.v = null;
        }
    }

    @Override // defpackage.sfz
    public final void E() {
        getWindow().clearFlags(2621568);
        Handler handler = this.s;
        if (handler != null) {
            m.l().ai(8861).u("Remove 30s dismissal timer");
            handler.removeCallbacksAndMessages(null);
            this.s = null;
        }
    }

    @Override // defpackage.sfz
    public final void F() {
        getWindow().addFlags(2621568);
        int i = 10;
        if (this.s != null) {
            m.h().ai(8867).u("Dismissal already scheduled");
        } else {
            m.l().ai(8866).u("Start 30s dismissal timer");
            sss sssVar = new sss(Looper.getMainLooper());
            this.s = sssVar;
            sssVar.postDelayed(new rzy(this, i), 30000L);
        }
        Vibrator vibrator = (Vibrator) getSystemService("vibrator");
        if (vibrator.hasVibrator()) {
            vibrator.vibrate(new long[]{0, 600, 100, 600}, -1, new AudioAttributes.Builder().setUsage(10).build());
        }
    }

    @Override // defpackage.sfz
    public final void G() {
        qst qstVar = new sfm(this).b;
        int iF = qstVar.f() + 1;
        qstVar.b.edit().putInt("DONT_SHOW_AGAIN_DISMISS_COUNT", iF).apply();
        sfm.a.l().ai(8871).w("Setting DSA count to: %d", iF);
    }

    @Override // defpackage.sfz
    public final void H() {
        if (this.u != null) {
            return;
        }
        sfj sfjVar = new sfj(this);
        this.u = sfjVar;
        dup.e(this, sfjVar, o, null, 2);
    }

    @Override // defpackage.sfz
    public final void I() {
        if (this.v != null) {
            return;
        }
        sfk sfkVar = new sfk(this);
        this.v = sfkVar;
        dup.e(this, sfkVar, p, null, 2);
    }

    @Override // defpackage.sfz
    public final void J(Fragment fragment) {
        w wVar = new w(a());
        wVar.q(R.id.fragment_container, fragment, "fragment_main");
        wVar.i(false, true);
    }

    @Override // defpackage.sfz
    public final void K(boolean z) {
        if (isFinishing()) {
            return;
        }
        sak sakVar = this.q;
        if (sakVar != null) {
            sakVar.a();
        }
        if (z) {
            ypf ypfVar = m;
            ypfVar.l().ai(8868).u("Launching continueIntent");
            PackageManager packageManager = getPackageManager();
            Intent intent = this.t;
            if (intent == null) {
                ypfVar.h().ai(8870).u("continueIntent request to launch was null: skipping");
            } else if (intent.resolveActivityInfo(packageManager, 0) != null) {
                startActivity(this.t);
            } else {
                ypfVar.h().ai(8869).u("Unable to launch continueIntent: did not resolve");
            }
        }
        BottomSheetView bottomSheetView = (BottomSheetView) findViewById(R.id.bottom_sheet);
        if (bottomSheetView != null) {
            bottomSheetView.a.U(5);
        } else {
            finish();
        }
    }

    @Override // defpackage.sfz
    public final boolean L() {
        return ((KeyguardManager) getSystemService("keyguard")).isKeyguardLocked();
    }

    @Override // defpackage.sfz
    public final boolean M() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    @Override // defpackage.ob, android.app.Activity
    public final void onBackPressed() {
        sga sgaVar = this.r;
        sgaVar.getClass();
        if (sgaVar.c) {
            return;
        }
        sgaVar.g.L(yzz.FRX_PRESETUP_EXIT_CONDITIONS, yzy.g);
        sgaVar.g();
    }

    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ypf ypfVar = m;
        ypfVar.f().ai(8863).u("PreSetupActivity:onCreate");
        if (adai.c() && new sfm(this).b.d("DONT_SHOW_AGAIN_SETTING", false)) {
            ypfVar.f().ai(8864).u("Not showing PreSetupActivity: user has selected 'Don't show again'");
            finish();
            return;
        }
        overridePendingTransition(0, 0);
        woy.O(getIntent().hasExtra("PreSetup.AA_SUPPORT_RESULT"), "Invalid intent: missing AaSupportedResult extra");
        int intExtra = getIntent().getIntExtra("PreSetup.AA_SUPPORT_RESULT", -1);
        woy.O(getIntent().hasExtra("connection_type"), "Invalid intent: missing ConnectionType extra");
        int intExtra2 = getIntent().getIntExtra("connection_type", -1);
        Intent intent = (Intent) getIntent().getParcelableExtra("PreSetup.CONTINUE_INTENT");
        intent.getClass();
        this.t = intent;
        setContentView(R.layout.car_bottom_sheet_activity);
        int i = true == getIntent().getBooleanExtra("PreSetup.SKIP_TO_USB_RESET", false) ? 7 : 1;
        qst.a(this);
        this.q = new sak(this, null);
        this.r = new sga(this, intExtra, new erb(this.q), intExtra2, i, A());
    }
}
