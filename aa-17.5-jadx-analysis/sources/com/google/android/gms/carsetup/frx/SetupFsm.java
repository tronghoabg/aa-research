package com.google.android.gms.carsetup.frx;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import com.google.android.gms.carsetup.fsm.impl.ActivityResult;
import com.google.android.gms.carsetup.fsm.impl.FsmController;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.abnp;
import defpackage.acvh;
import defpackage.dup;
import defpackage.erb;
import defpackage.ols;
import defpackage.qrv;
import defpackage.rhi;
import defpackage.rhx;
import defpackage.rjg;
import defpackage.rzy;
import defpackage.sdc;
import defpackage.sdd;
import defpackage.sde;
import defpackage.sdh;
import defpackage.sdp;
import defpackage.sdr;
import defpackage.sdt;
import defpackage.sdu;
import defpackage.sdw;
import defpackage.sdy;
import defpackage.seb;
import defpackage.sej;
import defpackage.sel;
import defpackage.sem;
import defpackage.sev;
import defpackage.sfp;
import defpackage.shk;
import defpackage.shm;
import defpackage.sss;
import defpackage.ypf;
import defpackage.yzy;
import defpackage.yzz;
import defpackage.zab;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class SetupFsm {
    public static final ypf a = ols.R("CAR.SETUP.SetupFsm");

    @sem(a = {@sel(c = CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @sel(a = AuthorizingCarConnectionState.class, c = ErrorState.class, d = "EVENT_ERROR"), @sel(a = AuthorizingCarConnectionState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = AuthorizingCarConnectionState.class, c = CheckPermissionsState.class, d = "EVENT_OK_STATE_SKIPPED"), @sel(a = AuthorizingCarConnectionState.class, c = CheckPermissionsState.class, d = "EVENT_CAR_CONNECTION_ALLOWED"), @sel(a = AuthorizingCarConnectionState.class, c = SetupFailedState.class, d = "EVENT_CAR_CONNECTION_DISALLOWED"), @sel(a = AuthorizingCarConnectionState.class, c = SetupFailedState.class, d = "EVENT_CAR_CONNECTION_CANCELLED")})
    public static class AuthorizingCarConnectionState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 4;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            seb sebVar = (seb) this.b.l;
            if ("EVENT_CAR_DISCONNECTED".equals(str)) {
                SetupFsm.a.l().ai(8797).u("FRX disconnected before the user takes any action");
                sebVar.n();
            }
            if ("EVENT_CAR_CONNECTION_ALLOWED".equals(str) || "EVENT_CAR_CONNECTION_DISALLOWED".equals(str) || "EVENT_CAR_CONNECTION_CANCELLED".equals(str)) {
                sebVar.o();
            }
            return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_CAR_CONNECTION_ALLOWED".equals(str) || "EVENT_CAR_CONNECTION_DISALLOWED".equals(str) || "EVENT_CAR_CONNECTION_CANCELLED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            seb sebVar = (seb) this.b.l;
            if (sebVar.r()) {
                this.b.f("EVENT_OK_STATE_SKIPPED", null);
                return;
            }
            if (sebVar.u()) {
                this.b.k(sdc.class, null, false);
                return;
            }
            SetupFsm.a.h().ai(8796).u("Exiting car setup: car is rejected - 'Add new cars to Android Auto' user setting is disabled.");
            this.b.f("EVENT_CAR_CONNECTION_DISALLOWED", null);
            ExecutorService executorServiceE = sebVar.e();
            executorServiceE.execute(new rzy(this, 6));
            executorServiceE.shutdown();
        }
    }

    @sem(a = {@sel(a = AutoIntroState.class, c = ErrorState.class, d = "EVENT_ERROR"), @sel(a = AutoIntroState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = AutoIntroState.class, c = AuthorizingCarConnectionState.class, d = "EVENT_OK_STATE_SKIPPED"), @sel(a = AutoIntroState.class, c = SetupFailedState.class, d = "EVENT_INTRO_DECLINED"), @sel(a = AutoIntroState.class, c = AuthorizingCarConnectionState.class, d = "EVENT_INTRO_ACKNOWLEDGED"), @sel(a = AutoIntroState.class, c = SetupFailedState.class, d = "EVENT_INTRO_LOCK_TIMEOUT")})
    public static class AutoIntroState extends sej {
        private rhi c;
        private final shk d = new sfp(this, 1);
        private Handler e;

        private final boolean e() {
            return ((KeyguardManager) this.a.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        }

        @Override // defpackage.sej
        public final int a() {
            return 39;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            FsmController fsmController = this.b;
            seb sebVar = (seb) fsmController.l;
            if ("EVENT_ACTIVITY_RESULT".equals(str)) {
                fsmController.f("EVENT_CAR_DISCONNECTED", null);
                return true;
            }
            if ("EVENT_CAR_DISCONNECTED".equals(str)) {
                SetupFsm.a.l().ai(8804).u("FRX disconnected before the user takes any action");
                sebVar.n();
            }
            if (!"EVENT_INTRO_ACKNOWLEDGED".equals(str) && !"EVENT_INTRO_DECLINED".equals(str) && !"EVENT_INTRO_LOCK_TIMEOUT".equals(str) && !"EVENT_OK_STATE_SKIPPED".equals(str) && !"EVENT_ERROR".equals(str) && !"EVENT_CAR_DISCONNECTED".equals(str) && !"EVENT_INTRO_CANCEL_TIMER".equals(str)) {
                return true;
            }
            if (this.e != null) {
                SetupFsm.a.f().ai(8803).u("AutoIntroState / auto-dismiss timer cancelled");
                this.e.removeCallbacksAndMessages(null);
                this.e = null;
            }
            if ("EVENT_INTRO_CANCEL_TIMER".equals(str)) {
                SetupFsm.a.f().ai(8802).u("AutoIntroState / auto-dismiss timer cancellation event handled");
                return true;
            }
            rhx rhxVar = rhx.c;
            if (!acvh.w() || !"EVENT_INTRO_ACKNOWLEDGED".equals(str) || !e()) {
                return false;
            }
            SetupFsm.a.f().ai(8801).u("AutoIntroState / delaying acknowledgement until phone is unlocked");
            rhi rhiVar = this.c;
            if (!rhiVar.a) {
                rhiVar.a = true;
                rhiVar.a();
            }
            sebVar.g();
            return true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            rhx rhxVar = rhx.c;
            if (acvh.w()) {
                this.c = new rhi(this.a, new rzy(this, 7));
            }
            seb sebVar = (seb) this.b.l;
            if (sebVar.q()) {
                this.b.f("EVENT_OK_STATE_SKIPPED", null);
                return;
            }
            boolean zE = e();
            shm shmVarD = sebVar.d();
            boolean z = true;
            if (sebVar.s() && shmVarD.d()) {
                z = false;
            }
            if (!zE && !z) {
                this.b.f("EVENT_OK_STATE_SKIPPED", null);
                return;
            }
            if (zE) {
                SetupFsm.a.l().ai(8805).u("Start 30s dismissal timer");
                sss sssVar = new sss();
                this.e = sssVar;
                sssVar.postDelayed(new rzy(this, 8, null), 30000L);
                Vibrator vibrator = (Vibrator) this.a.getSystemService("vibrator");
                if (vibrator.hasVibrator()) {
                    vibrator.vibrate(new long[]{0, 600, 100, 600}, -1, new AudioAttributes.Builder().setUsage(10).build());
                }
            }
            new rjg(this.a, this.d).e(zE ? yzz.FRX_LOCK_SCREEN : yzz.FRX_INTRO_FRAGMENT);
            Class cls = zE ? sdu.class : sdt.class;
            ypf ypfVar = SetupFsm.a;
            this.b.k(cls, null, false);
        }

        @Override // defpackage.sej
        public final void d() {
            rhx rhxVar = rhx.c;
            if (acvh.w()) {
                this.c.b();
            }
        }
    }

    @sem(a = {@sel(a = CarMovingState.class, c = ErrorState.class, d = "EVENT_ERROR"), @sel(a = CarMovingState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = CarMovingState.class, c = SetupFailedState.class, d = "EVENT_USER_EXIT"), @sel(a = CarMovingState.class, d = "EVENT_CAR_PARKED")})
    public static class CarMovingState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 9;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_USER_EXIT".equals(str) || "EVENT_CAR_PARKED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            this.b.k(sdd.class, null, false);
        }
    }

    @sem(a = {@sel(c = CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @sel(a = CheckPermissionsState.class, c = ErrorState.class, d = "EVENT_ERROR"), @sel(a = CheckPermissionsState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = CheckPermissionsState.class, c = DownloadAppsState.class, d = "EVENT_OK_STATE_SKIPPED"), @sel(a = CheckPermissionsState.class, c = ErrorState.class, d = "EVENT_PERMISSION_DENIED"), @sel(a = CheckPermissionsState.class, c = DownloadAppsState.class, d = "EVENT_ALL_PERMISSIONS_GRANTED")})
    public static class CheckPermissionsState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 13;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            if (!"EVENT_ACTIVITY_RESULT".equals(str) || obj == null) {
                return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_PERMISSION_DENIED".equals(str) || "EVENT_ALL_PERMISSIONS_GRANTED".equals(str)) ? false : true;
            }
            ActivityResult activityResult = (ActivityResult) obj;
            SetupFsm.a.l().ai(8807).y("CheckPermissionsState #onEvent %s", activityResult);
            if (activityResult.a == -1) {
                this.b.f("EVENT_ALL_PERMISSIONS_GRANTED", null);
            } else {
                this.b.f("EVENT_PERMISSION_DENIED", null);
            }
            return true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            FsmController fsmController = this.b;
            fsmController.f("EVENT_OK_STATE_SKIPPED", null);
        }
    }

    @sem(a = {@sel(c = CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @sel(a = DeviceIncompatibleState.class, c = ErrorState.class, d = "EVENT_ERROR"), @sel(a = DeviceIncompatibleState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = DeviceIncompatibleState.class, c = SetupFailedState.class, d = "EVENT_INTRO_DECLINED"), @sel(a = DeviceIncompatibleState.class, c = SetupFailedState.class, d = "EVENT_USER_EXIT"), @sel(a = DeviceIncompatibleState.class, c = SetupFailedState.class, d = "EVENT_USE_VANAGON_CLICKED")})
    public static class DeviceIncompatibleState extends sej<Bundle> {
        @Override // defpackage.sej
        public final int a() {
            return 39;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            seb sebVar = (seb) this.b.l;
            if (!"EVENT_USE_VANAGON_CLICKED".equals(str)) {
                return ("EVENT_INTRO_DECLINED".equals(str) || "EVENT_USER_EXIT".equals(str) || "EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str)) ? false : true;
            }
            if (!sebVar.s()) {
                Intent intentB = sev.b(this.b.c, null);
                if (intentB == null) {
                    intentB = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.projection.gearhead"));
                }
                intentB.addFlags(268435456);
                this.a.startActivity(intentB);
            }
            return false;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            ((seb) this.b.l).a();
            this.b.k(sdp.class, null, false);
        }
    }

    @sem(a = {@sel(c = CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @sel(a = DownloadAppsState.class, c = ErrorState.class, d = "EVENT_ERROR"), @sel(a = DownloadAppsState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = DownloadAppsState.class, c = StartCarService.class, d = "EVENT_OK_STATE_SKIPPED"), @sel(a = DownloadAppsState.class, c = InstallingAppsState.class, d = "EVENT_APPLICATION_INSTALLATION_ALLOWED"), @sel(a = DownloadAppsState.class, c = DownloadRetryState.class, d = "EVENT_APPLICATION_INSTALLATION_CANCELLED")})
    public static class DownloadAppsState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 5;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return qrv.u(str);
        }

        @Override // defpackage.sej
        public final void c(String str) {
            seb sebVar = (seb) this.b.l;
            if (sebVar.p()) {
                this.b.f("EVENT_OK_STATE_SKIPPED", null);
                return;
            }
            this.b.k(sdr.class, null, true);
            SetupFsm.a.l().ai(8808).u("DownloadAppsState - enabling driving restriction");
            sebVar.h();
        }
    }

    @sem(a = {@sel(c = CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @sel(a = DownloadRetryState.class, c = ErrorState.class, d = "EVENT_ERROR"), @sel(a = DownloadRetryState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = DownloadRetryState.class, c = StartCarService.class, d = "EVENT_OK_STATE_SKIPPED"), @sel(a = DownloadRetryState.class, c = InstallingAppsState.class, d = "EVENT_APPLICATION_INSTALLATION_ALLOWED"), @sel(a = DownloadRetryState.class, c = SetupFailedState.class, d = "EVENT_APPLICATION_INSTALLATION_CANCELLED")})
    public static class DownloadRetryState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 6;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return qrv.u(str);
        }

        @Override // defpackage.sej
        public final void c(String str) {
            if (((seb) this.b.l).p()) {
                this.b.f("EVENT_OK_STATE_SKIPPED", null);
            } else {
                this.b.k(sde.class, null, false);
            }
        }
    }

    @sem(a = {@sel(a = EntryState.class, c = ErrorState.class, d = "EVENT_ERROR"), @sel(a = EntryState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = EntryState.class, c = SetupFailedState.class, d = "EVENT_COUNTRY_NOT_WHITELISTED"), @sel(a = EntryState.class, c = DeviceIncompatibleState.class, d = "EVENT_PHONE_IN_BLACKLIST"), @sel(a = EntryState.class, c = DeviceIncompatibleState.class, d = "EVENT_DEVICE_INCOMPATIBLE"), @sel(a = EntryState.class, c = AutoIntroState.class, d = "EVENT_DEVICE_COMPATIBLE"), @sel(a = EntryState.class, c = AutoIntroState.class, d = "EVENT_DEVICE_COMPATIBLE_WHITELIST_BYPASS")})
    public static class EntryState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 42;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            if (!"EVENT_ACTIVITY_RESULT".equals(str)) {
                return ("EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_COUNTRY_NOT_WHITELISTED".equals(str) || "EVENT_PHONE_IN_BLACKLIST".equals(str) || "EVENT_DEVICE_INCOMPATIBLE".equals(str) || "EVENT_DEVICE_COMPATIBLE".equals(str) || "EVENT_DEVICE_COMPATIBLE_WHITELIST_BYPASS".equals(str)) ? false : true;
            }
            this.b.f("EVENT_CAR_DISCONNECTED", null);
            return true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            int iA = ((seb) this.b.l).a();
            SetupFsm.a.l().ai(8809).w("Device compatibility check result %d", iA);
            this.b.f(iA != 0 ? "EVENT_ERROR" : "EVENT_DEVICE_COMPATIBLE", null);
        }
    }

    @sem(a = {@sel(a = ErrorState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = ErrorState.class, c = SetupFailedState.class, d = "EVENT_USER_EXIT")})
    public static class ErrorState extends sej<Bundle> {
        @Override // defpackage.sej
        public final int a() {
            return 10;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_USER_EXIT".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            this.b.k(sdh.class, null, false);
        }
    }

    @sem(a = {@sel(a = FrxOptInState.class, c = ErrorState.class, d = "EVENT_ERROR"), @sel(a = FrxOptInState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = FrxOptInState.class, c = ResetDefaultCarDockState.class, d = "EVENT_FRX_OPT_IN_ACCEPTED"), @sel(a = FrxOptInState.class, c = SetupFailedState.class, d = "EVENT_FRX_OPT_IN_CANCELLED")})
    public static class FrxOptInState extends sej<ActivityResult> {
        @Override // defpackage.sej
        public final int a() {
            return 8;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            if (!"EVENT_ACTIVITY_RESULT".equals(str) || obj == null) {
                return ("EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_FRX_OPT_IN_ACCEPTED".equals(str) || "EVENT_FRX_OPT_IN_CANCELLED".equals(str)) ? false : true;
            }
            ActivityResult activityResult = (ActivityResult) obj;
            Intent intent = activityResult.b;
            if (intent == null) {
                this.b.f("EVENT_FRX_OPT_IN_CANCELLED", null);
                return true;
            }
            ypf ypfVar = SetupFsm.a;
            ypfVar.l().ai(8810).y("Intent: %s", intent.toUri(0));
            int i = activityResult.a;
            if (intent.getBooleanExtra("EXTRA_FRX_HAS_ERROR", false)) {
                ypfVar.g().ai(8812).u("Critical error: frx error");
                this.b.f("EVENT_ERROR", null);
                return true;
            }
            if (i == -1) {
                this.b.f("EVENT_FRX_OPT_IN_ACCEPTED", null);
                return true;
            }
            ypfVar.g().ai(8811).u("Critical error: opt in cancelled");
            this.b.f("EVENT_FRX_OPT_IN_CANCELLED", null);
            return true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            seb sebVar = (seb) this.b.l;
            this.a.getPackageManager();
            Intent intentW = sebVar.w();
            if (intentW.resolveActivity(this.a.getPackageManager()) != null) {
                this.b.j(intentW);
            } else {
                this.b.f("EVENT_ERROR", null);
            }
        }
    }

    @sem(a = {@sel(c = CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @sel(a = InstallingAppsState.class, c = ErrorState.class, d = "EVENT_ERROR"), @sel(a = InstallingAppsState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = InstallingAppsState.class, c = StartCarService.class, d = "EVENT_APPLICATIONS_UP_TO_DATE"), @sel(a = InstallingAppsState.class, c = ErrorState.class, d = "EVENT_APPLICATION_INSTALLATION_FAILED")})
    public static class InstallingAppsState extends sej {
        private boolean c;
        private boolean d;
        private BroadcastReceiver e;
        private BroadcastReceiver f;

        public static void e(InputStream inputStream, byte[] bArr) throws IOException {
            int length;
            int i = 0;
            while (true) {
                length = bArr.length;
                int i2 = inputStream.read(bArr, i, length - i);
                if (i2 <= 0) {
                    break;
                } else {
                    i += i2;
                }
            }
            if (i < length) {
                throw new IOException("Manifest underflow");
            }
        }

        @ResultIgnorabilityUnspecified
        private final boolean g() {
            Intent intentC = ((seb) this.b.l).c();
            if (intentC != null) {
                int i = sev.a;
                String stringExtra = intentC.getStringExtra("full_docid");
                stringExtra.getClass();
                if (stringExtra.equals("com.google.android.projection.gearhead") && !this.d) {
                    this.d = true;
                    this.e = new sdw(this);
                    this.f = new sdy(this);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED");
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter2.addDataScheme("package");
                    rhx rhxVar = rhx.c;
                    dup.e(this.a, this.e, intentFilter, null, 2);
                    dup.e(this.a, this.f, intentFilter2, null, 2);
                }
                if (intentC.resolveActivity(this.a.getPackageManager()) == null) {
                    this.b.f("EVENT_ERROR", null);
                    return false;
                }
                this.b.j(intentC);
            }
            return true;
        }

        @Override // defpackage.sej
        public final int a() {
            return 7;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            if ("EVENT_APPLICATION_INSTALLATION_UPDATE".equals(str) || "EVENT_APPLICATION_INSTALLED".equals(str)) {
                Fragment fragmentA = this.b.a();
                if (fragmentA != null && (fragmentA instanceof sdr)) {
                    ((sdr) fragmentA).a();
                }
            } else if ("EVENT_ACTIVITY_RESULT".equals(str)) {
                if (obj != null && ((ActivityResult) obj).a == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("errorTitle", this.a.getString(R.string.common_something_went_wrong));
                    erb erbVarZ = ((seb) this.b.l).z();
                    Context context = this.a;
                    bundle.putString("errorMessage", context.getString(R.string.car_frx_apps_installation_aborted_message, sev.d(context, erbVarZ)));
                    this.b.f("EVENT_APPLICATION_INSTALLATION_FAILED", bundle);
                    FsmController fsmController = this.b;
                    abnp abnpVarN = zab.a.n();
                    int i = yzz.FRX_INSTALL_APPS.he;
                    abnpVarN.t();
                    zab zabVar = (zab) abnpVarN.b;
                    zabVar.b |= 1;
                    zabVar.d = i;
                    int iA = yzy.bP.a();
                    abnpVarN.t();
                    zab zabVar2 = (zab) abnpVarN.b;
                    zabVar2.b |= 2;
                    zabVar2.e = iA;
                    fsmController.g((zab) abnpVarN.q());
                }
                return true;
            }
            if (!"EVENT_APPLICATION_INSTALLED".equals(str)) {
                if ("EVENT_APPLICATIONS_UP_TO_DATE".equals(str)) {
                    if (!((seb) this.b.l).p()) {
                        SetupFsm.a.h().ai(8822).u("Got event that applications are updated, but failed verification");
                    }
                    if (this.d) {
                        this.c = true;
                        return true;
                    }
                }
                if (!"EVENT_CAR_STARTED_MOVING".equals(str)) {
                    f();
                }
                return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_APPLICATIONS_UP_TO_DATE".equals(str) || "EVENT_APPLICATION_INSTALLATION_FAILED".equals(str)) ? false : true;
            }
            g();
            FsmController fsmController2 = this.b;
            abnp abnpVarN2 = zab.a.n();
            int i2 = yzz.FRX_INSTALL_APPS.he;
            abnpVarN2.t();
            zab zabVar3 = (zab) abnpVarN2.b;
            zabVar3.b |= 1;
            zabVar3.d = i2;
            int iA2 = yzy.bR.a();
            abnpVarN2.t();
            zab zabVar4 = (zab) abnpVarN2.b;
            zabVar4.b |= 2;
            zabVar4.e = iA2;
            fsmController2.g((zab) abnpVarN2.q());
            return true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            seb sebVar = (seb) this.b.l;
            if ("EVENT_CAR_PARKED".equals(str)) {
                if (sebVar.p()) {
                    this.b.f("EVENT_APPLICATIONS_UP_TO_DATE", null);
                    return;
                } else {
                    if (g()) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("installation_allowed", true);
                        this.b.k(sdr.class, bundle, true);
                        return;
                    }
                    return;
                }
            }
            if (sebVar.t()) {
                sebVar.f();
                if (g()) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("installation_allowed", true);
                    this.b.k(sdr.class, bundle2, true);
                    return;
                }
                return;
            }
            Bundle bundle3 = new Bundle();
            bundle3.putString("errorTitle", this.a.getString(R.string.car_frx_no_connection_title));
            bundle3.putString("errorMessage", this.a.getString(R.string.car_frx_no_connection_message));
            this.b.f("EVENT_APPLICATION_INSTALLATION_FAILED", bundle3);
            FsmController fsmController = this.b;
            abnp abnpVarN = zab.a.n();
            int i = yzz.FRX_INSTALL_APPS.he;
            abnpVarN.t();
            zab zabVar = (zab) abnpVarN.b;
            zabVar.b = 1 | zabVar.b;
            zabVar.d = i;
            int iA = yzy.bO.a();
            abnpVarN.t();
            zab zabVar2 = (zab) abnpVarN.b;
            zabVar2.b |= 2;
            zabVar2.e = iA;
            fsmController.g((zab) abnpVarN.q());
        }

        public final void f() {
            if (this.d) {
                this.a.unregisterReceiver(this.e);
                this.a.unregisterReceiver(this.f);
                this.d = false;
                if (this.c) {
                    this.b.f("EVENT_APPLICATIONS_UP_TO_DATE", null);
                }
            }
        }
    }

    @sem(a = {@sel(a = ResetDefaultCarDockState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = ResetDefaultCarDockState.class, c = SetupDoneState.class, d = "EVENT_OK_STATE_SKIPPED"), @sel(a = ResetDefaultCarDockState.class, c = SetupDoneState.class, d = "EVENT_CAR_DOCK_CHOICE_RESET")})
    public static class ResetDefaultCarDockState extends sej<Bundle> {
        @Override // defpackage.sej
        public final int a() {
            return 45;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_CAR_DOCK_CHOICE_RESET".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            SetupFsm.a.l().ai(8823).u("Skipping ResetDefaultCarDockState.");
            this.b.f("EVENT_OK_STATE_SKIPPED", null);
        }
    }

    @sem(a = {})
    public static class SetupDoneState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 12;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            seb sebVar = (seb) this.b.l;
            sebVar.x();
            sebVar.i();
        }
    }

    @sem(a = {})
    public static class SetupFailedState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 11;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            seb sebVar = (seb) this.b.l;
            sebVar.a();
            sebVar.y();
        }
    }

    @sem(a = {@sel(a = StartCarService.class, c = ErrorState.class, d = "EVENT_ERROR"), @sel(a = StartCarService.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(c = CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @sel(a = StartCarService.class, c = FrxOptInState.class, d = "EVENT_CAR_SERVICE_STARTED")})
    public static class StartCarService extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 44;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_CAR_SERVICE_STARTED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            if (((seb) this.b.l).v()) {
                this.b.f("EVENT_CAR_SERVICE_STARTED", null);
            }
        }
    }
}
