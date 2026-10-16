package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.carsetup.fsm.impl.FsmController;
import com.google.android.projection.gearhead.R;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class xco extends seg implements xcj {
    public static final yph a = yph.c("GH.FRX");
    public boolean b;
    public boolean c;
    public qsz f;
    public String h;
    private boolean k;
    private xcn m;
    private xcm n;
    private final yfq i = yfq.r(lgv.b().b(), lgv.b().a());
    private final mdl j = new xck(this, 0);
    public int e = -1;
    private final xyc l = new vdv(this, 15);
    public final List g = new ArrayList();

    @ResultIgnorabilityUnspecified
    public final boolean A() {
        mdn mdnVar;
        int i = 0;
        do {
            yfq yfqVar = this.i;
            if (i >= ((yls) yfqVar).c) {
                return false;
            }
            mdnVar = (mdn) yfqVar.get(i);
            i++;
        } while (mdnVar.d());
        mdnVar.c(getActivity());
        lvl.E().a(mdnVar, this.j, this);
        return true;
    }

    @Override // defpackage.xcj
    public final Intent a() {
        lfk lfkVarB = lfm.c().b();
        if (lfkVarB == null) {
            return null;
        }
        Intent intentC = lfkVarB.c();
        intentC.toUri(0);
        return intentC;
    }

    @Override // defpackage.seg
    public final int b(String str) {
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -2139698821:
                return str.equals("EVENT_VANAGON_MODE_INTRO_ACKNOWLEDGED") ? 74 : 0;
            case -2111813626:
                return str.equals("EVENT_WORK_PROFILE_NOT_DETECTED_PROJECTED") ? 95 : 0;
            case -2087596918:
                return str.equals("EVENT_SIGN_IN_GMM") ? 39 : 0;
            case -2087596744:
                return str.equals("EVENT_SIGN_IN_GSA") ? 36 : 0;
            case -2087589149:
                return str.equals("EVENT_SIGN_IN_OPA") ? 84 : 0;
            case -1871239420:
                return str.equals("EVENT_PROJECTED_MODE_INITIALIZED") ? 65 : 0;
            case -1628676660:
                return str.equals("EVENT_DOWNLOAD_AND_INSTALL_APPS_FAILED") ? 68 : 0;
            case -1618345547:
                return str.equals("EVENT_CAPABILITY_CHECK_SUPPORTED") ? 46 : 0;
            case -1470105137:
                return str.equals("EVENT_AUTO_LAUNCH_SKIPPED") ? 73 : 0;
            case -1446484159:
                return str.equals("EVENT_VANAGON_MODE_STARTED") ? 62 : 0;
            case -1397357139:
                return str.equals("EVENT_SAFETY_NOTICE_DECLINED") ? 52 : 0;
            case -1156533368:
                return str.equals("EVENT_ACTIVITY_RESULT") ? 45 : 0;
            case -1003242684:
                return str.equals("EVENT_OK_STATE_SKIPPED") ? 81 : 0;
            case -990980414:
                return str.equals("EVENT_DOWNLOAD_APPS_ACCEPTED") ? 66 : 0;
            case -913827871:
                return str.equals("EVENT_WORK_PROFILE_DETECTED") ? 55 : 0;
            case -869451135:
                return str.equals("EVENT_BACKBUTTON_PRESSED") ? 69 : 0;
            case -830926916:
                return str.equals("EVENT_CAR_STARTED_MOVING") ? 28 : 0;
            case -777421954:
                return str.equals("EVENT_READY") ? 33 : 0;
            case -702370659:
                return str.equals("EVENT_USER_DECLINE_GSA") ? 37 : 0;
            case -630711372:
                return str.equals("EVENT_ALL_SENSITIVE_PERMISSIONS_GRANTED") ? 70 : 0;
            case -231502837:
                return str.equals("EVENT_CAR_DISCONNECTED") ? 27 : 0;
            case -190054595:
                return str.equals("EVENT_ALL_PERMISSIONS_GRANTED") ? 35 : 0;
            case -164491655:
                return str.equals("EVENT_ERROR_GSA") ? 83 : 0;
            case -62758138:
                return str.equals("EVENT_APPLICATION_INSTALLED") ? 93 : 0;
            case -57245870:
                return str.equals("EVENT_PREINSTALLED_PERMISSIONS_SKIPPED") ? 97 : 0;
            case 182888742:
                return str.equals("EVENT_SAFETY_NOTICE_ACCEPTED") ? 51 : 0;
            case 276285494:
                return str.equals("EVENT_WORK_PROFILE_NOT_DETECTED_VANAGON") ? 94 : 0;
            case 299480997:
                return str.equals("EVENT_OPT_OUT_GMM") ? 40 : 0;
            case 299481171:
                return str.equals("EVENT_OPT_OUT_GSA") ? 38 : 0;
            case 299488766:
                return str.equals("EVENT_OPT_OUT_OPA") ? 85 : 0;
            case 352952341:
                return str.equals("EVENT_CAR_CONNECTION_LOST") ? 75 : 0;
            case 467864558:
                return str.equals("EVENT_VANAGON_MODE_TOS_ACCEPTED") ? 57 : 0;
            case 547048345:
                return str.equals("EVENT_DOWNLOAD_APPS_REJECTED") ? 67 : 0;
            case 1051532318:
                return str.equals("EVENT_PACKAGE_NOT_ALLOWED") ? 43 : 0;
            case 1060689469:
                return str.equals("EVENT_SENSITIVE_PERMISSION_DENIED") ? 71 : 0;
            case 1114922374:
                return str.equals("EVENT_PERMISSION_DENIED") ? 34 : 0;
            case 1141068853:
                return str.equals("EVENT_ACCEPT_CLICKED") ? 31 : 0;
            case 1299458444:
                return str.equals("EVENT_SKIP_GMM") ? 98 : 0;
            case 1299458618:
                return str.equals("EVENT_SKIP_GSA") ? 99 : 0;
            case 1305809753:
                return str.equals("EVENT_PROJECTED_MODE_TOS_SKIPPED") ? 96 : 0;
            case 1447503228:
                return str.equals("EVENT_CAPABILITY_CHECK_UNSUPPORTED") ? 47 : 0;
            case 1481221081:
                return str.equals("EVENT_CAR_PARKED") ? 29 : 0;
            case 1548719223:
                return str.equals("EVENT_INELIGIBLE_GSA") ? 82 : 0;
            case 1551743883:
                return str.equals("EVENT_EXIT_CLICKED") ? 30 : 0;
            case 1649369265:
                return str.equals("EVENT_PROJECTED_MODE_STARTED") ? 64 : 0;
            case 1827567742:
                return str.equals("EVENT_PROJECTED_MODE_TOS_ACCEPTED") ? 57 : 0;
            case 2054867836:
                return str.equals("EVENT_AUTO_LAUNCH_CONTINUED") ? 72 : 0;
            default:
                return 0;
        }
    }

    @Override // defpackage.xcj
    public final qrn c() {
        return this.f;
    }

    @Override // defpackage.xcj
    public final String d() {
        lfk lfkVarB = lfm.c().b();
        if (lfkVarB == null) {
            return null;
        }
        return lfkVarB.a;
    }

    @Override // defpackage.xcj
    public final String e() {
        return this.h;
    }

    @Override // defpackage.xcj
    public final List f() {
        yfq yfqVar = this.i;
        int i = ((yls) yfqVar).c;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            mdn mdnVar = (mdn) yfqVar.get(i2);
            if (!mdnVar.d()) {
                arrayList.add(mdnVar.b());
            }
        }
        return arrayList;
    }

    @Override // defpackage.xcj
    public final void g() {
        lfm lfmVarC = lfm.c();
        ykd ykdVar = new ykd(this, null);
        ((ype) lfm.a.l().ai((char) 3879)).u("beginUpdateRequiredApps");
        lfmVarC.c.registerSessionCallback(new lfl(lfmVarC, ykdVar));
    }

    @Override // defpackage.xcj
    public final void h() {
        try {
            this.n = new xcm(this);
            oni.f(this.f).f(this.n, 11, 0);
            this.d.f("EVENT_PROJECTED_MODE_INITIALIZED", null);
        } catch (IllegalStateException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 10109)).u("Error during FRX start up");
            this.d.f("EVENT_CAR_DISCONNECTED", null);
        } catch (qrz | qsa unused) {
            ((ype) ((ype) a.h()).ai((char) 10110)).u("Error during FRX start up. Possibly Chimera restart.");
            Bundle bundle = new Bundle();
            bundle.putString("errorTitle", getString(R.string.frx_gmscore_car_client_disconnected_title));
            if (this.e == 2) {
                bundle.putString("errorMessage", getString(R.string.frx_gmscore_car_client_wireless_disconnected_message));
            } else {
                bundle.putString("errorMessage", getString(R.string.frx_gmscore_car_client_disconnected_message));
            }
            this.d.f("EVENT_CAR_CONNECTION_LOST", bundle);
        }
    }

    @Override // defpackage.xcj
    public final void i(boolean z, boolean z2) {
        ((ype) a.l().ai(10088)).Q("finishSetup isOptedIn=%b, hasError=%b", z, z2);
        this.d.i(new xcl(z2, z));
    }

    @Override // defpackage.xcj
    public final boolean j() {
        return lfm.c().f();
    }

    @Override // defpackage.seg
    public final void k(int i, int i2, int i3) {
        yyb yybVar;
        rqs rqsVar = new rqs();
        rqsVar.b = yxy.FRX;
        rqsVar.a = yxc.FRX_STATE_CHANGE;
        rqsVar.d = xxh.h(yyc.b(i2));
        switch (i3) {
            case 0:
                yybVar = yyb.UNKNOWN_EVENT;
                break;
            case 1:
                yybVar = yyb.CONNECTECTED_TO_CAR;
                break;
            case 2:
                yybVar = yyb.DISCONNECTED_FROM_CAR;
                break;
            case 3:
                yybVar = yyb.COUNTRY_WHITELISTED;
                break;
            case 4:
                yybVar = yyb.COUNTRY_NOT_WHITELISTED;
                break;
            case 5:
                yybVar = yyb.GEARHEAD_INSTALLED;
                break;
            case 6:
                yybVar = yyb.PHONE_BLACKLISTED;
                break;
            case 7:
                yybVar = yyb.PHONE_NOT_BLACKLISTED;
                break;
            case 8:
                yybVar = yyb.CONNECTION_TO_CAR_ALLOWED;
                break;
            case 9:
                yybVar = yyb.CONNECTION_TO_CAR_NOT_ALLOWED;
                break;
            case 10:
                yybVar = yyb.CAR_STARTED_MOVING;
                break;
            case 11:
                yybVar = yyb.APP_INSTALLATION_ALLOWED;
                break;
            case 12:
                yybVar = yyb.APP_INSTALLATION_CANCELLED;
                break;
            case 13:
                yybVar = yyb.APP_INSTALLATION_FAILED;
                break;
            case 14:
                yybVar = yyb.APP_UP_TO_DATE;
                break;
            case 15:
                yybVar = yyb.OPT_IN_CANCELLED;
                break;
            case 16:
                yybVar = yyb.OPT_IN_ACCEPTED;
                break;
            case 17:
                yybVar = yyb.CONNECTION_ERROR;
                break;
            case 18:
                yybVar = yyb.USER_EXIT;
                break;
            case 19:
                yybVar = yyb.CONNECTION_TO_CAR_CANCELLED;
                break;
            case 20:
                yybVar = yyb.PERMISSION_GRANTED;
                break;
            case 21:
                yybVar = yyb.PERMISSION_DENIED;
                break;
            case 22:
                yybVar = yyb.ALL_PERMISSIONS_GRANTED;
                break;
            case 23:
                yybVar = yyb.FIRST_ACTIVATION;
                break;
            case 24:
                yybVar = yyb.UNUSED_VALUE_24;
                break;
            case 25:
                yybVar = yyb.SCREEN_UNLOCKED;
                break;
            case 26:
                yybVar = yyb.PROCEED_TO_UNLOCK;
                break;
            case 27:
                yybVar = yyb.GH_CAR_DISCONNECTED;
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                yybVar = yyb.GH_CAR_STARTED_MOVING;
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                yybVar = yyb.GH_CAR_PARKED;
                break;
            case 30:
                yybVar = yyb.GH_EXIT_CLICKED;
                break;
            case 31:
                yybVar = yyb.GH_ACCEPT_CLICKED;
                break;
            case 32:
                yybVar = yyb.GH_LEARN_MORE_CLICKED;
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                yybVar = yyb.GH_READY;
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                yybVar = yyb.GH_PERMISSION_DENIED;
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                yybVar = yyb.GH_ALL_PERMISSIONS_GRANTED;
                break;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                yybVar = yyb.GH_SIGN_IN_GSA;
                break;
            case 37:
                yybVar = yyb.GH_USER_DECLINE_GSA;
                break;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                yybVar = yyb.GH_OPT_OUT_GSA;
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                yybVar = yyb.GH_SIGN_IN_GMM;
                break;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                yybVar = yyb.GH_OPT_OUT_GMM;
                break;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                yybVar = yyb.GH_SIGN_IN_MUSIC;
                break;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                yybVar = yyb.GH_OPT_OUT_MUSIC;
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                yybVar = yyb.GH_PACKAGE_NOT_ALLOWED;
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                yybVar = yyb.GH_CAR_IS_STILL_CONNECTED;
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                yybVar = yyb.GH_ACTIVITY_RESULT;
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                yybVar = yyb.GH_CAPABILITY_CHECK_SUPPORTED;
                break;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                yybVar = yyb.GH_CAPABILITY_CHECK_UNSUPPORTED;
                break;
            case 48:
                yybVar = yyb.AUTO_INTRO_DECLINED;
                break;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                yybVar = yyb.AUTO_INTRO_ACKNOWLEDGED;
                break;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                yybVar = yyb.USE_VANAGON_CLICKED;
                break;
            case 51:
                yybVar = yyb.GH_SAFETY_NOTICE_ACCEPTED;
                break;
            case 52:
                yybVar = yyb.GH_SAFETY_NOTICE_DECLINED;
                break;
            case 53:
                yybVar = yyb.DEVICE_IS_COMPATIBLE;
                break;
            case 54:
                yybVar = yyb.DEVICE_IS_INCOMPATIBLE;
                break;
            case 55:
                yybVar = yyb.GH_WORK_PROFILE_DETECTED;
                break;
            case 56:
                yybVar = yyb.GH_WORK_PROFILE_NOT_DETECTED;
                break;
            case 57:
                yybVar = yyb.GH_TOS_ACCEPTED;
                break;
            case 58:
                yybVar = yyb.APP_INSTALLED;
                break;
            case 59:
                yybVar = yyb.LOCK_SCREEN_REJECTED;
                break;
            case 60:
                yybVar = yyb.LOCK_SCREEN_TIMEOUT;
                break;
            case 61:
                yybVar = yyb.AUTO_INTRO_SKIPPED;
                break;
            case 62:
                yybVar = yyb.GH_VANAGON_MODE_STARTED;
                break;
            case 63:
                yybVar = yyb.GH_VANAGON_MODE_INITIALIZED;
                break;
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                yybVar = yyb.GH_PROJECTED_MODE_STARTED;
                break;
            case 65:
                yybVar = yyb.GH_PROJECTED_MODE_INITIALIZED;
                break;
            case 66:
                yybVar = yyb.GH_DOWNLOAD_APPS_ACCEPTED;
                break;
            case 67:
                yybVar = yyb.GH_DOWNLOAD_APPS_DECLINED;
                break;
            case 68:
                yybVar = yyb.GH_INSTALL_APPS_FAILED;
                break;
            case 69:
                yybVar = yyb.GH_BACK_BUTTON;
                break;
            case 70:
                yybVar = yyb.GH_ALL_SENSITIVE_PERMISSIONS_GRANTED;
                break;
            case 71:
                yybVar = yyb.GH_SENSITIVE_PERMISSION_DENIED;
                break;
            case 72:
                yybVar = yyb.GH_AUTO_LAUNCH_CONTINUED;
                break;
            case 73:
                yybVar = yyb.GH_AUTO_LAUNCH_SKIPPED;
                break;
            case 74:
                yybVar = yyb.GH_VANAGON_MODE_INTRO_ACK;
                break;
            case 75:
                yybVar = yyb.GH_CAR_CONNECTION_LOST;
                break;
            case 76:
                yybVar = yyb.OK_STATE_SKIPPED;
                break;
            case 77:
                yybVar = yyb.BACK_BUTTON;
                break;
            case 78:
                yybVar = yyb.CAR_PARKED;
                break;
            case 79:
                yybVar = yyb.CAR_SERVICE_STARTED;
                break;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                yybVar = yyb.CAR_DOCK_CHOICE_RESET;
                break;
            case 81:
                yybVar = yyb.GH_OK_STATE_SKIPPED;
                break;
            case 82:
                yybVar = yyb.GH_INELIGIBLE_GSA;
                break;
            case 83:
                yybVar = yyb.GH_ERROR_GSA;
                break;
            case 84:
                yybVar = yyb.GH_SIGN_IN_OPA;
                break;
            case 85:
                yybVar = yyb.GH_OPT_OUT_OPA;
                break;
            case 86:
                yybVar = yyb.GH_FRX_ACTIVITY_START;
                break;
            case 87:
                yybVar = yyb.GH_FRX_ACTIVITY_STOP;
                break;
            case 88:
                yybVar = yyb.FRX_ACTIVITY_START;
                break;
            case 89:
                yybVar = yyb.FRX_ACTIVITY_STOP;
                break;
            case 90:
                yybVar = yyb.DEVICE_IS_COMPATIBLE_WHITELIST_BYPASS;
                break;
            case 91:
                yybVar = yyb.AUTO_INTRO_TOS_ACCEPTED;
                break;
            case 92:
                yybVar = yyb.CONNECTION_TO_CAR_ALLOWED_WITH_DATA_NOTICE;
                break;
            case 93:
                yybVar = yyb.GH_APPLICATION_INSTALLED;
                break;
            case 94:
                yybVar = yyb.GH_WORK_PROFILE_NOT_DETECTED_VANAGON;
                break;
            case 95:
                yybVar = yyb.GH_WORK_PROFILE_NOT_DETECTED_PROJECTED;
                break;
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                yybVar = yyb.GH_PROJECTED_MODE_TOS_SKIPPED;
                break;
            case 97:
                yybVar = yyb.GH_PREINSTALLED_PERMISSIONS_SKIPPED;
                break;
            case 98:
                yybVar = yyb.GH_GMM_SKIPPED;
                break;
            default:
                yybVar = yyb.GH_GSA_SKIPPED;
                break;
        }
        rqsVar.e = xxh.h(yybVar);
        if (i != -1) {
            rqsVar.c = xxh.h(yyc.b(i));
        }
        ebf.j().F(rqsVar.l());
    }

    @Override // defpackage.xcj
    public final boolean l() {
        return lgv.c().f();
    }

    @Override // defpackage.xcj
    public final boolean m() {
        boolean zD;
        int i = 0;
        do {
            yfq yfqVar = this.i;
            if (i >= ((yls) yfqVar).c) {
                return true;
            }
            zD = ((mdn) yfqVar.get(i)).d();
            i++;
        } while (zD);
        return false;
    }

    @Override // defpackage.xcj
    public final boolean n() {
        return this.c;
    }

    @Override // defpackage.xcj
    public final boolean o() {
        return lgv.c().l(getActivity());
    }

    @Override // defpackage.seg, android.support.v4.app.Fragment
    /* renamed from: onActivityCreated */
    public final void m105lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        super.m105lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
        Intent intent = getActivity().getIntent();
        intent.getClass();
        boolean z = true;
        if (intent.getAction() != null && !intent.getAction().equals("frx_projection_start")) {
            z = false;
        }
        this.b = z;
        this.k = intent.getBooleanExtra("com.google.android.gearhead.CAKEWALK_STYLE", false);
        if (this.f != null) {
            return;
        }
        qsz qszVar = (qsz) this.l.gu();
        this.f = qszVar;
        qszVar.e();
    }

    @Override // android.support.v4.app.Fragment
    public final void onDestroy() {
        qsz qszVar = this.f;
        if (qszVar != null && qszVar.b()) {
            try {
                oni.f(this.f).b(this.n);
            } catch (IllegalStateException | qrz | qsa unused) {
            }
            this.f.g();
        }
        lvl.E().b(this);
        super.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public final void onPause() {
        super.onPause();
        getActivity().unregisterReceiver(this.m);
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        this.m = new xcn(this);
        IntentFilter intentFilter = new IntentFilter("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
        if (Build.VERSION.SDK_INT >= 33) {
            dup.e(getActivity(), this.m, intentFilter, null, 2);
        } else {
            getActivity().registerReceiver(this.m, intentFilter);
        }
        lvl.E().b(this);
        if (this.b && this.f.b()) {
            try {
                oni.d(this.f);
            } catch (qrz unused) {
                this.d.f("EVENT_CAR_DISCONNECTED", null);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        FsmController fsmController = this.d;
        sej sejVar = fsmController == null ? null : fsmController.g;
        if (sejVar != null) {
            ((ype) ((ype) a.f()).ai((char) 10107)).u("GH_FRX_ACTIVITY_START");
            k(yyc.GH_FRX_NOT_RUNNING.X, sejVar.a(), yyb.GH_FRX_ACTIVITY_START.aW);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onStop() {
        FsmController fsmController = this.d;
        sej sejVar = fsmController == null ? null : fsmController.g;
        if (sejVar != null) {
            ((ype) ((ype) a.f()).ai((char) 10108)).u("GH_FRX_ACTIVITY_STOP");
            k(sejVar.a(), yyc.GH_FRX_NOT_RUNNING.X, yyb.GH_FRX_ACTIVITY_STOP.aW);
        }
        super.onStop();
    }

    @Override // defpackage.xcj
    public final boolean p() {
        if (m()) {
            return true;
        }
        A();
        return false;
    }

    @Override // defpackage.xcj
    public final boolean q() {
        return roc.br(getActivity().getIntent());
    }

    @Override // defpackage.xcj
    public final boolean r(Intent intent) {
        return !this.d.c.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    @Override // defpackage.xcj
    public final boolean s() {
        return lfm.c().g();
    }

    @Override // defpackage.xcj
    public final boolean t() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getActivity().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    @Override // defpackage.xcj
    public final boolean u() {
        return this.b;
    }

    @Override // defpackage.xcj
    public final boolean v() {
        return kwp.a().b();
    }

    @Override // defpackage.xcj
    public final boolean w() {
        boolean z;
        if (!this.b) {
            ((ype) ((ype) a.f()).ai((char) 10096)).u("Skipping: mode is vanagon");
            return false;
        }
        try {
            oni.d(this.f);
            z = true;
        } catch (IllegalStateException | qrz unused) {
            z = false;
        }
        ((ype) ((ype) a.f()).ai((char) 10097)).y("isCarReallyConnected: %b", Boolean.valueOf(z));
        return !z;
    }

    @Override // defpackage.xcj
    public final boolean x() {
        return this.k;
    }

    @Override // defpackage.xcj
    public final boolean y(qpi qpiVar) {
        return mjv.b().d(this.f, RemoteApiConstants.NOW_PACKAGE, qpiVar);
    }

    @Override // defpackage.xcj
    public final lds z() {
        return lfm.c().f;
    }

    @Override // defpackage.seg, android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
    }
}
