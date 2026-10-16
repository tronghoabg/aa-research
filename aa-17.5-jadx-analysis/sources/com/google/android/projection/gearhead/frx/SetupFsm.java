package com.google.android.projection.gearhead.frx;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.google.android.gms.carsetup.fsm.impl.ActivityResult;
import com.google.android.gms.carsetup.fsm.impl.FsmController;
import com.google.android.projection.gearhead.R;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import defpackage.acvh;
import defpackage.ebf;
import defpackage.kmu;
import defpackage.map;
import defpackage.ohs;
import defpackage.ono;
import defpackage.qpi;
import defpackage.roc;
import defpackage.rrc;
import defpackage.sej;
import defpackage.sel;
import defpackage.sem;
import defpackage.wyi;
import defpackage.wyj;
import defpackage.xbt;
import defpackage.xbu;
import defpackage.xbv;
import defpackage.xbw;
import defpackage.xbx;
import defpackage.xca;
import defpackage.xce;
import defpackage.xch;
import defpackage.xcj;
import defpackage.xcp;
import defpackage.xcq;
import defpackage.xcr;
import defpackage.ykd;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;

/* loaded from: classes3.dex */
public final class SetupFsm {
    public static final yph a = yph.c("GH.FRX");

    @sem(a = {@sel(c = CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @sel(a = AppsPermissionsState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = AppsPermissionsState.class, c = CheckSensitivePermissionsState.class, d = "EVENT_OK_STATE_SKIPPED"), @sel(a = AppsPermissionsState.class, c = CheckPermissionsState.class, d = "EVENT_ACCEPT_CLICKED"), @sel(a = AppsPermissionsState.class, c = SetupFailedState.class, d = "EVENT_EXIT_CLICKED"), @sel(a = AppsPermissionsState.class, c = CheckSensitivePermissionsState.class, d = "EVENT_PREINSTALLED_PERMISSIONS_SKIPPED")})
    public static class AppsPermissionsState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 17;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_ACCEPT_CLICKED".equals(str) || "EVENT_EXIT_CLICKED".equals(str) || "EVENT_PREINSTALLED_PERMISSIONS_SKIPPED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            ((ype) SetupFsm.a.l().ai((char) 10059)).u("AppsPermissionsState onEnter");
            if (!((xcj) this.b.l).s()) {
                if (((xcj) this.b.l).l()) {
                    this.b.f("EVENT_OK_STATE_SKIPPED", null);
                    return;
                } else {
                    this.b.k(xbt.class, null, false);
                    return;
                }
            }
            FsmController fsmController = this.b;
            xcj xcjVar = (xcj) fsmController.l;
            if (xcjVar.n()) {
                fsmController.f("EVENT_PREINSTALLED_PERMISSIONS_SKIPPED", null);
                return;
            }
            xcjVar.o();
            if (roc.bp(this.a).getBoolean("pref_preinstalled_permissions_acknowledged", false)) {
                this.b.f("EVENT_OK_STATE_SKIPPED", null);
            } else {
                this.b.k(xce.class, null, false);
            }
        }
    }

    @sem(a = {@sel(c = CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @sel(a = AutoLaunchState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = AutoLaunchState.class, c = UnplugReplugState.class, d = "EVENT_OK_STATE_SKIPPED"), @sel(a = AutoLaunchState.class, c = UnplugReplugState.class, d = "EVENT_AUTO_LAUNCH_CONTINUED"), @sel(a = AutoLaunchState.class, c = UnplugReplugState.class, d = "EVENT_AUTO_LAUNCH_SKIPPED")})
    public static class AutoLaunchState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 48;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_AUTO_LAUNCH_SKIPPED".equals(str) || "EVENT_AUTO_LAUNCH_CONTINUED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            yph yphVar = SetupFsm.a;
            ((ype) yphVar.l().ai((char) 10060)).u("AutoLaunchState onEnter");
            FsmController fsmController = this.b;
            if (((xcj) fsmController.l).u()) {
                fsmController.f("EVENT_OK_STATE_SKIPPED", null);
            } else {
                ((ype) yphVar.l().ai((char) 10061)).u("BTAL setup during FRX disabled. Skipping");
                this.b.f("EVENT_OK_STATE_SKIPPED", null);
            }
        }
    }

    @sem(a = {@sel(c = CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @sel(a = CarDockPromptState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = CarDockPromptState.class, c = SetupDoneState.class, d = "EVENT_OK_STATE_SKIPPED"), @sel(a = CarDockPromptState.class, c = SetupDoneState.class, d = "EVENT_ACCEPT_CLICKED")})
    public static class CarDockPromptState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 26;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_ACCEPT_CLICKED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            yph yphVar = SetupFsm.a;
            ((ype) yphVar.l().ai((char) 10062)).u("CarDockPromptState onEnter");
            FsmController fsmController = this.b;
            if (((xcj) fsmController.l).u()) {
                fsmController.f("EVENT_OK_STATE_SKIPPED", null);
                return;
            }
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.CAR_DOCK");
            ResolveInfo resolveInfoResolveActivity = this.b.c.getPackageManager().resolveActivity(intent, 0);
            if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo == null) {
                ((ype) ((ype) yphVar.h()).ai((char) 10063)).u("no car dock installed");
                this.b.f("EVENT_CAR_DISCONNECTED", null);
                return;
            }
            ((ype) yphVar.l().ai(10064)).y("ResolveInfo: %s", resolveInfoResolveActivity.activityInfo);
            ((ype) yphVar.l().ai(10065)).y("packageName: %s", resolveInfoResolveActivity.activityInfo.packageName);
            if ("com.google.android.gms".equals(resolveInfoResolveActivity.activityInfo.packageName) || "com.google.android.projection.gearhead".equals(resolveInfoResolveActivity.activityInfo.packageName)) {
                this.b.f("EVENT_OK_STATE_SKIPPED", null);
            } else {
                this.b.k(xbv.class, null, false);
            }
        }
    }

    @sem(a = {@sel(a = CarMovingState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = CarMovingState.class, c = SetupFailedState.class, d = "EVENT_EXIT_CLICKED"), @sel(a = CarMovingState.class, d = "EVENT_CAR_PARKED")})
    public static class CarMovingState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 27;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_EXIT_CLICKED".equals(str) || "EVENT_CAR_PARKED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            ((ype) SetupFsm.a.l().ai((char) 10066)).u("CarMovingState onEnter");
            this.b.k(xbw.class, null, false);
        }
    }

    @sem(a = {@sel(c = CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @sel(a = CheckPermissionsState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = CheckPermissionsState.class, c = CheckSensitivePermissionsState.class, d = "EVENT_OK_STATE_SKIPPED"), @sel(a = CheckPermissionsState.class, c = CheckSensitivePermissionsState.class, d = "EVENT_PERMISSION_DENIED"), @sel(a = CheckPermissionsState.class, c = CheckSensitivePermissionsState.class, d = "EVENT_ALL_PERMISSIONS_GRANTED")})
    public static class CheckPermissionsState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 19;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_PERMISSION_DENIED".equals(str) || "EVENT_ALL_PERMISSIONS_GRANTED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            if (((xcj) this.b.l).o()) {
                this.b.f("EVENT_OK_STATE_SKIPPED", null);
            } else {
                ((ype) SetupFsm.a.l().ai((char) 10067)).u("Asking for permissions");
            }
        }
    }

    @sem(a = {@sel(c = CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @sel(a = CheckSensitivePermissionsState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = CheckSensitivePermissionsState.class, c = GmmSignInState.class, d = "EVENT_OK_STATE_SKIPPED"), @sel(a = CheckSensitivePermissionsState.class, c = SetupFailedState.class, d = "EVENT_EXIT_CLICKED"), @sel(a = CheckSensitivePermissionsState.class, c = GmmSignInState.class, d = "EVENT_SENSITIVE_PERMISSION_DENIED"), @sel(a = CheckSensitivePermissionsState.class, c = GmmSignInState.class, d = "EVENT_ALL_SENSITIVE_PERMISSIONS_GRANTED")})
    public static class CheckSensitivePermissionsState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 36;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_EXIT_CLICKED".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_SENSITIVE_PERMISSION_DENIED".equals(str) || "EVENT_ALL_SENSITIVE_PERMISSIONS_GRANTED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            FsmController fsmController = this.b;
            xcj xcjVar = (xcj) fsmController.l;
            if (xcjVar.n()) {
                fsmController.f("EVENT_OK_STATE_SKIPPED", null);
            } else if (xcjVar.m()) {
                this.b.f("EVENT_OK_STATE_SKIPPED", null);
            } else {
                this.b.k(xch.class, null, false);
            }
        }
    }

    @sem(a = {@sel(a = DownloadAppsState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = DownloadAppsState.class, c = SetupFailedState.class, d = "EVENT_DOWNLOAD_APPS_REJECTED"), @sel(a = DownloadAppsState.class, c = InstallAppsState.class, d = "EVENT_DOWNLOAD_APPS_ACCEPTED"), @sel(a = DownloadAppsState.class, c = AppsPermissionsState.class, d = "EVENT_OK_STATE_SKIPPED"), @sel(a = DownloadAppsState.class, c = AppsPermissionsState.class, d = "EVENT_APPLICATION_INSTALLED")})
    public static class DownloadAppsState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 34;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_DOWNLOAD_APPS_ACCEPTED".equals(str) || "EVENT_DOWNLOAD_APPS_REJECTED".equals(str) || "EVENT_APPLICATION_INSTALLED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            if (((xcj) this.b.l).j()) {
                this.b.f("EVENT_OK_STATE_SKIPPED", null);
            } else {
                this.b.k(xca.class, null, false);
            }
        }
    }

    @sem(a = {@sel(a = ErrorState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = ErrorState.class, c = SetupFailedState.class, d = "EVENT_EXIT_CLICKED")})
    public static class ErrorState extends sej<Bundle> {
        @Override // defpackage.sej
        public final int a() {
            return 28;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_EXIT_CLICKED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            ((ype) SetupFsm.a.l().ai((char) 10068)).u("ErrorState onEnter");
            this.b.k(xbx.class, null, false);
        }
    }

    @sem(a = {@sel(a = FrxStartState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = FrxStartState.class, c = WorkProfileCheckState.class, d = "EVENT_PROJECTED_MODE_STARTED"), @sel(a = FrxStartState.class, c = VanagonCapabilityCheckState.class, d = "EVENT_VANAGON_MODE_STARTED")})
    public static class FrxStartState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 31;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_PROJECTED_MODE_STARTED".equals(str) || "EVENT_VANAGON_MODE_STARTED".equals(str)) ? false : true;
        }
    }

    @sem(a = {@sel(a = GmmSignInState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = GmmSignInState.class, c = GsaSignInState.class, d = "EVENT_PACKAGE_NOT_ALLOWED"), @sel(a = GmmSignInState.class, c = GsaSignInState.class, d = "EVENT_SIGN_IN_GMM"), @sel(a = GmmSignInState.class, c = GsaSignInState.class, d = "EVENT_OPT_OUT_GMM"), @sel(a = GmmSignInState.class, c = GsaSignInState.class, d = "EVENT_SKIP_GMM")})
    public static class GmmSignInState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 20;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            if (!str.equals("EVENT_ACTIVITY_RESULT")) {
                return ("EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_PACKAGE_NOT_ALLOWED".equals(str) || "EVENT_SIGN_IN_GMM".equals(str) || "EVENT_OPT_OUT_GMM".equals(str) || "EVENT_SKIP_GMM".equals(str)) ? false : true;
            }
            int i = ((ActivityResult) obj).a;
            if (i == -1) {
                this.b.f("EVENT_SIGN_IN_GMM", null);
            } else if (i == 0) {
                this.b.f("EVENT_OPT_OUT_GMM", null);
            }
            return true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            yph yphVar = SetupFsm.a;
            ((ype) yphVar.l().ai((char) 10069)).u("GmmSignInState onEnter");
            xcj xcjVar = (xcj) this.b.l;
            if (acvh.y()) {
                ((ype) yphVar.l().ai((char) 10072)).u("Skipping GMM sign-in per flags");
                this.b.f("EVENT_SKIP_GMM", null);
                return;
            }
            String strE = xcjVar.e();
            if (!map.c(strE)) {
                ((ype) ((ype) yphVar.f()).ai((char) 10070)).y("Skipping GMM sign in as GMM is not required app (required: %s)", strE);
                this.b.f("EVENT_OPT_OUT_GMM", null);
                return;
            }
            try {
                this.b.j(new Intent("com.google.android.apps.maps.car.PROJECTED_FIRST_RUN").setComponent(new ComponentName(strE, "com.google.android.apps.gmm.car.firstrun.GmmProjectedFirstRunActivity")));
            } catch (ActivityNotFoundException e) {
                ((ype) ((ype) ((ype) SetupFsm.a.g()).p(e)).ai((char) 10071)).u("Error: cannot start GMM first run activity.");
                this.b.f("EVENT_OPT_OUT_GMM", null);
            }
        }
    }

    @sem(a = {@sel(a = GsaSignInState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = GsaSignInState.class, c = AutoLaunchState.class, d = "EVENT_PACKAGE_NOT_ALLOWED"), @sel(a = GsaSignInState.class, c = AutoLaunchState.class, d = "EVENT_ERROR_GSA"), @sel(a = GsaSignInState.class, c = AutoLaunchState.class, d = "EVENT_USER_DECLINE_GSA"), @sel(a = GsaSignInState.class, c = AutoLaunchState.class, d = "EVENT_SIGN_IN_GSA"), @sel(a = GsaSignInState.class, c = AutoLaunchState.class, d = "EVENT_INELIGIBLE_GSA"), @sel(a = GsaSignInState.class, c = AutoLaunchState.class, d = "EVENT_UNKNOWN_GSA"), @sel(a = GsaSignInState.class, c = AutoLaunchState.class, d = "EVENT_SIGN_IN_OPA"), @sel(a = GsaSignInState.class, c = AutoLaunchState.class, d = "EVENT_OPT_OUT_OPA"), @sel(a = GsaSignInState.class, c = AutoLaunchState.class, d = "EVENT_SKIP_GSA")})
    public static class GsaSignInState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 21;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            String str2 = "EVENT_SIGN_IN_OPA";
            if (!str.equals("EVENT_ACTIVITY_RESULT")) {
                return ("EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_PACKAGE_NOT_ALLOWED".equals(str) || "EVENT_ERROR_GSA".equals(str) || "EVENT_USER_DECLINE_GSA".equals(str) || "EVENT_SIGN_IN_GSA".equals(str) || "EVENT_INELIGIBLE_GSA".equals(str) || "EVENT_UNKNOWN_GSA".equals(str) || "EVENT_SIGN_IN_OPA".equals(str) || "EVENT_OPT_OUT_OPA".equals(str) || "EVENT_SKIP_GSA".equals(str)) ? false : true;
            }
            ActivityResult activityResult = (ActivityResult) obj;
            if (activityResult == null || activityResult.a != -1) {
                this.b.f("EVENT_USER_DECLINE_GSA", null);
                return true;
            }
            Intent intent = activityResult.b;
            if (intent != null) {
                yph yphVar = SetupFsm.a;
                if (intent.hasExtra("opa_opt_in_result")) {
                    int intExtra = intent.getIntExtra("opa_opt_in_result", 0);
                    if (intExtra == 0 || intExtra == 1) {
                        str2 = "EVENT_OPT_OUT_OPA";
                    }
                } else {
                    int intExtra2 = intent.getIntExtra("opt_in_result", -1);
                    if (intExtra2 == 0) {
                        str2 = "EVENT_SIGN_IN_GSA";
                    } else if (intExtra2 == 1) {
                        str2 = "EVENT_ERROR_GSA";
                    } else if (intExtra2 == 2) {
                        str2 = "EVENT_USER_DECLINE_GSA";
                    } else if (intExtra2 != 3) {
                        ((ype) ((ype) SetupFsm.a.h()).ai((char) 10083)).w("unknown GSA result: %d", intExtra2);
                        str2 = "EVENT_UNKNOWN_GSA";
                    } else {
                        str2 = "EVENT_INELIGIBLE_GSA";
                    }
                }
            } else {
                str2 = "EVENT_UNKNOWN_GSA";
            }
            this.b.f(str2, null);
            return true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            yph yphVar = SetupFsm.a;
            ((ype) yphVar.l().ai((char) 10073)).u("GsaSignInState onEnter");
            xcj xcjVar = (xcj) this.b.l;
            if (!xcjVar.y(qpi.f)) {
                ((ype) ((ype) yphVar.g()).ai((char) 10076)).u("Critical error: invalid gsa package");
                this.b.f("EVENT_PACKAGE_NOT_ALLOWED", null);
                return;
            }
            if (acvh.x()) {
                ((ype) yphVar.l().ai((char) 10075)).u("Skipping GSA sign per flags");
                this.b.f("EVENT_SKIP_GSA", null);
                return;
            }
            Intent intent = new Intent();
            intent.setPackage(RemoteApiConstants.NOW_PACKAGE);
            intent.putExtra("source", "GEARHEAD");
            intent.setAction("com.google.android.apps.opa.OPT_IN_1P");
            if (xcjVar.r(intent)) {
                this.b.j(intent);
                return;
            }
            ((ype) ((ype) yphVar.g()).ai((char) 10074)).y("GSA FRX activity not found! intent=%s", intent.toUri(0));
            this.b.f("EVENT_ERROR_GSA", null);
        }
    }

    @sem(a = {@sel(a = InstallAppsState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = InstallAppsState.class, c = ErrorState.class, d = "EVENT_DOWNLOAD_AND_INSTALL_APPS_FAILED"), @sel(a = InstallAppsState.class, c = AppsPermissionsState.class, d = "EVENT_APPLICATION_INSTALLED")})
    public static class InstallAppsState extends sej<ActivityResult> {
        private String c = null;

        private final boolean e() {
            xcj xcjVar = (xcj) this.b.l;
            Intent intentA = xcjVar.a();
            if (intentA == null) {
                return true;
            }
            String strD = xcjVar.d();
            if (strD != null && strD.equals(this.c)) {
                this.b.f("EVENT_DOWNLOAD_AND_INSTALL_APPS_FAILED", null);
                return false;
            }
            ((ype) ((ype) SetupFsm.a.f()).ai((char) 10077)).y("Starting to install app: %s", strD);
            this.c = strD;
            if (intentA.resolveActivity(this.a.getPackageManager()) == null) {
                return false;
            }
            this.b.j(intentA);
            return true;
        }

        @Override // defpackage.sej
        public final int a() {
            return 35;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            String string;
            String string2;
            if ("EVENT_APPLICATION_INSTALLED".equals(str)) {
                yph yphVar = SetupFsm.a;
                ((ype) ((ype) yphVar.f()).ai(10078)).y("App installed: %s", this.c);
                if (((xcj) this.b.l).j()) {
                    ((ype) ((ype) yphVar.f()).ai((char) 10079)).u("Finished updating all required apps");
                    return false;
                }
                e();
                return true;
            }
            if ("EVENT_DOWNLOAD_APPS_UPDATE".equals(str)) {
                Fragment fragmentA = this.b.a();
                if (fragmentA instanceof xca) {
                    ((xca) fragmentA).a();
                }
            } else if ("EVENT_ACTIVITY_RESULT".equals(str)) {
                if (obj != null && ((ActivityResult) obj).a == 0) {
                    FsmController fsmController = this.b;
                    Bundle bundle = new Bundle();
                    String strD = ((xcj) this.b.l).d();
                    CharSequence applicationLabel = null;
                    if (strD != null) {
                        try {
                            PackageManager packageManager = this.a.getPackageManager();
                            applicationLabel = packageManager.getApplicationLabel(packageManager.getPackageInfo(strD, 0).applicationInfo);
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                    if (applicationLabel != null) {
                        string = this.a.getString(R.string.frx_fsm_install_failed_title_with_app_name, applicationLabel);
                        string2 = this.a.getString(R.string.frx_fsm_install_failed_message_with_app_name, applicationLabel);
                    } else {
                        string = this.a.getString(R.string.frx_fsm_install_cancelled_title);
                        string2 = this.a.getString(R.string.frx_fsm_install_cancelled_message);
                    }
                    bundle.putString("errorTitle", string);
                    bundle.putString("errorMessage", string2);
                    fsmController.f("EVENT_DOWNLOAD_AND_INSTALL_APPS_FAILED", bundle);
                }
                return true;
            }
            return ("EVENT_DOWNLOAD_AND_INSTALL_APPS_FAILED".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            xcj xcjVar = (xcj) this.b.l;
            if (!xcjVar.t()) {
                Bundle bundle = new Bundle();
                bundle.putString("errorTitle", this.a.getString(R.string.frx_fsm_download_apps_not_connected));
                bundle.putString("errorMessage", this.a.getString(R.string.frx_fsm_download_apps_not_connected_message));
                this.b.f("EVENT_DOWNLOAD_AND_INSTALL_APPS_FAILED", bundle);
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("installation_allowed", true);
            this.b.k(xca.class, bundle2, true);
            xcjVar.g();
            if (e()) {
                return;
            }
            this.b.f("EVENT_DOWNLOAD_AND_INSTALL_APPS_FAILED", null);
        }
    }

    @sem(a = {@sel(a = ProjectedStartState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = ProjectedStartState.class, c = ErrorState.class, d = "EVENT_CAR_CONNECTION_LOST"), @sel(a = ProjectedStartState.class, c = SafetyNoticeState.class, d = "EVENT_PROJECTED_MODE_INITIALIZED")})
    public static class ProjectedStartState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 33;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_PROJECTED_MODE_INITIALIZED".equals(str) || "EVENT_CAR_CONNECTION_LOST".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            ((xcj) this.b.l).h();
            ohs ohsVarJ = ebf.j();
            yzz yzzVar = yzz.FRX_ENTER;
            ohsVarJ.o(yzzVar, yzy.f);
            ebf.j().o(yzzVar, yzy.bG);
        }
    }

    @sem(a = {@sel(c = CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @sel(a = SafetyNoticeState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = SafetyNoticeState.class, c = TermsOfServiceState.class, d = "EVENT_OK_STATE_SKIPPED"), @sel(a = SafetyNoticeState.class, c = TermsOfServiceState.class, d = "EVENT_SAFETY_NOTICE_ACCEPTED"), @sel(a = SafetyNoticeState.class, c = SetupFailedState.class, d = "EVENT_SAFETY_NOTICE_DECLINED")})
    public static class SafetyNoticeState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 41;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_SAFETY_NOTICE_ACCEPTED".equals(str) || "EVENT_SAFETY_NOTICE_DECLINED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            ono onoVar = new ono(((xcj) this.b.l).c());
            if (!onoVar.c()) {
                onoVar.g("car_tos_safety", 1);
            }
            this.b.f("EVENT_OK_STATE_SKIPPED", null);
        }
    }

    @sem(a = {})
    public static class SetupDoneState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 30;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            ((ype) SetupFsm.a.l().ai((char) 10080)).y("DONE event: %s", str);
            xcj xcjVar = (xcj) this.b.l;
            if (!xcjVar.n()) {
                ohs ohsVarJ = ebf.j();
                yxy yxyVar = yxy.FRX;
                yzz yzzVar = yzz.FRX_COMPLETION_SUCCESS;
                yzy yzyVar = yzy.f;
                ohsVarJ.f(rrc.h(yxyVar, yzzVar, yzyVar));
                ebf.j().f(rrc.h(yxyVar, xcjVar.u() ? yzz.FRX_COMPLETION_SUCCESS_PROJECTED : yzz.FRX_COMPLETION_SUCCESS_VANAGON, yzyVar));
            }
            xcjVar.i(true, false);
        }
    }

    @sem(a = {})
    public static class SetupFailedState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 29;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            ((ype) SetupFsm.a.l().ai((char) 10081)).y("FAILED event: %s", str);
            ebf.j().o(yzz.FRX_COMPLETION_FAILURE, yzy.f);
            ((xcj) this.b.l).i(false, false);
        }
    }

    @sem(a = {@sel(c = CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @sel(a = TermsOfServiceState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = TermsOfServiceState.class, c = DownloadAppsState.class, d = "EVENT_VANAGON_MODE_TOS_ACCEPTED"), @sel(a = TermsOfServiceState.class, c = AppsPermissionsState.class, d = "EVENT_PROJECTED_MODE_TOS_ACCEPTED"), @sel(a = TermsOfServiceState.class, c = SetupFailedState.class, d = "EVENT_EXIT_CLICKED"), @sel(a = TermsOfServiceState.class, c = AppsPermissionsState.class, d = "EVENT_PROJECTED_MODE_TOS_SKIPPED")})
    public static class TermsOfServiceState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 24;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_VANAGON_MODE_TOS_ACCEPTED".equals(str) || "EVENT_PROJECTED_MODE_TOS_ACCEPTED".equals(str) || "EVENT_PROJECTED_MODE_TOS_SKIPPED".equals(str) || "EVENT_EXIT_CLICKED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            ((ype) SetupFsm.a.l().ai((char) 10082)).u("TermsOfServiceState onEnter");
            xcj xcjVar = (xcj) this.b.l;
            ono onoVar = new ono(xcjVar.c());
            if (xcjVar.u()) {
                if (onoVar.d() && onoVar.b()) {
                    this.b.f("EVENT_PROJECTED_MODE_TOS_ACCEPTED", null);
                    return;
                } else if (xcjVar.n()) {
                    this.b.f("EVENT_PROJECTED_MODE_TOS_SKIPPED", null);
                    return;
                }
            } else if (onoVar.d()) {
                this.b.f("EVENT_VANAGON_MODE_TOS_ACCEPTED", null);
                return;
            }
            if (xcjVar.x()) {
                this.b.k(xbu.class, null, false);
            } else {
                this.b.k(xcp.class, null, false);
            }
        }
    }

    @sem(a = {@sel(a = UnplugReplugState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = UnplugReplugState.class, c = CarDockPromptState.class, d = "EVENT_OK_STATE_SKIPPED")})
    public static class UnplugReplugState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 25;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            if (((xcj) this.b.l).w()) {
                this.b.k(xcq.class, null, false);
            } else {
                this.b.f("EVENT_OK_STATE_SKIPPED", null);
            }
        }
    }

    @sem(a = {@sel(a = VanagonCapabilityCheckState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = VanagonCapabilityCheckState.class, c = VanagonStartState.class, d = "EVENT_OK_STATE_SKIPPED"), @sel(a = VanagonCapabilityCheckState.class, c = VanagonStartState.class, d = "EVENT_CAPABILITY_CHECK_SUPPORTED"), @sel(a = VanagonCapabilityCheckState.class, c = VanagonStartState.class, d = "EVENT_CAPABILITY_CHECK_UNSUPPORTED")})
    public static class VanagonCapabilityCheckState extends sej {
        wyj c = null;

        @Override // defpackage.sej
        public final int a() {
            return 38;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_CAPABILITY_CHECK_SUPPORTED".equals(str) || "EVENT_CAPABILITY_CHECK_UNSUPPORTED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            if (!kmu.b().d("device_check_completed")) {
                wyj wyjVar = new wyj(this.a, ebf.j(), new ykd(this, null));
                this.c = wyjVar;
                wyjVar.b();
            } else if (kmu.b().d("device_supported")) {
                this.b.f("EVENT_OK_STATE_SKIPPED", null);
            } else {
                this.b.f("EVENT_CAPABILITY_CHECK_UNSUPPORTED", null);
            }
        }

        @Override // defpackage.sej
        public final void d() {
            wyi wyiVar;
            wyj wyjVar = this.c;
            if (wyjVar != null) {
                synchronized (wyjVar) {
                    wyiVar = wyjVar.b;
                    wyjVar.b = null;
                }
                if (wyiVar == null || !wyiVar.isAlive()) {
                    return;
                }
                wyiVar.interrupt();
                try {
                    wyiVar.join(1000L);
                } catch (InterruptedException e) {
                    Log.w("CAR.SERVICE", "interrupted!", e);
                }
            }
        }
    }

    @sem(a = {@sel(a = VanagonStartState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = VanagonStartState.class, c = SetupFailedState.class, d = "EVENT_BACKBUTTON_PRESSED"), @sel(a = VanagonStartState.class, c = WorkProfileCheckState.class, d = "EVENT_OK_STATE_SKIPPED"), @sel(a = VanagonStartState.class, c = WorkProfileCheckState.class, d = "EVENT_VANAGON_MODE_INTRO_ACKNOWLEDGED"), @sel(a = VanagonStartState.class, c = WorkProfileCheckState.class, d = "EVENT_VANAGON_MODE_INTRO_TOS_ACCEPTED")})
    public static class VanagonStartState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 32;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            xcj xcjVar = (xcj) this.b.l;
            if ("EVENT_VANAGON_MODE_INTRO_TOS_ACCEPTED".equals(str)) {
                new ono(xcjVar.c()).g("car_tos_main", 1);
            }
            return ("EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_BACKBUTTON_PRESSED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_VANAGON_MODE_INTRO_ACKNOWLEDGED".equals(str) || "EVENT_VANAGON_MODE_INTRO_TOS_ACCEPTED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            xcj xcjVar = (xcj) this.b.l;
            SharedPreferences sharedPreferencesBp = roc.bp(this.a);
            ohs ohsVarJ = ebf.j();
            yzz yzzVar = yzz.FRX_ENTER;
            ohsVarJ.o(yzzVar, yzy.f);
            ebf.j().o(yzzVar, yzy.bF);
            ono onoVar = new ono(xcjVar.c());
            if (xcjVar.q() && xcjVar.s()) {
                this.b.f("EVENT_VANAGON_MODE_INTRO_TOS_ACCEPTED", null);
            } else if (sharedPreferencesBp.getBoolean("pref_vanagon_intro_acknowledged", false) && onoVar.d()) {
                this.b.f("EVENT_OK_STATE_SKIPPED", null);
            } else {
                this.b.k(xcr.class, null, false);
            }
        }
    }

    @sem(a = {@sel(a = WorkProfileCheckState.class, c = SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @sel(a = WorkProfileCheckState.class, c = ErrorState.class, d = "EVENT_WORK_PROFILE_DETECTED"), @sel(a = WorkProfileCheckState.class, c = SafetyNoticeState.class, d = "EVENT_WORK_PROFILE_NOT_DETECTED_VANAGON"), @sel(a = WorkProfileCheckState.class, c = ProjectedStartState.class, d = "EVENT_WORK_PROFILE_NOT_DETECTED_PROJECTED")})
    public static class WorkProfileCheckState extends sej {
        @Override // defpackage.sej
        public final int a() {
            return 43;
        }

        @Override // defpackage.sej
        public final boolean b(String str, Object obj) {
            return ("EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_WORK_PROFILE_DETECTED".equals(str) || "EVENT_WORK_PROFILE_NOT_DETECTED_VANAGON".equals(str) || "EVENT_WORK_PROFILE_NOT_DETECTED_PROJECTED".equals(str)) ? false : true;
        }

        @Override // defpackage.sej
        public final void c(String str) {
            xcj xcjVar = (xcj) this.b.l;
            if (!xcjVar.v()) {
                this.b.f(true != xcjVar.u() ? "EVENT_WORK_PROFILE_NOT_DETECTED_VANAGON" : "EVENT_WORK_PROFILE_NOT_DETECTED_PROJECTED", null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("errorTitle", this.a.getString(R.string.frx_fsm_work_profile_title));
            bundle.putString("errorMessage", this.a.getString(R.string.frx_fsm_work_profile_message_public));
            this.b.f("EVENT_WORK_PROFILE_DETECTED", bundle);
        }
    }
}
