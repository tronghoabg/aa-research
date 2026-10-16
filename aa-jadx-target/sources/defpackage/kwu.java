package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kwu {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CrossProfileMgr");
    public final android.content.Context b;
    public final android.content.pm.CrossProfileApps c;
    public final defpackage.qdn d;

    public kwu(android.content.Context context) {
        this.b = context;
        defpackage.qdm qdmVar = new defpackage.qdm();
        qdmVar.c = "com.google.android.enterprise.connectedapps.CrossProfileConnector_Service";
        qdmVar.a = defpackage.qef.DEFAULT;
        qdmVar.b = context;
        this.d = new defpackage.qdn(qdmVar);
        this.c = android.os.Build.VERSION.SDK_INT >= 30 ? jx$.ExternalSyntheticApiModelOutline3.m(context.getSystemService(jx$.ExternalSyntheticApiModelOutline3.m$1())) : null;
    }

    public static defpackage.kwu b() {
        return (defpackage.kwu) defpackage.mkp.a.i(defpackage.kwu.class);
    }

    public final defpackage.kwt a() {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return defpackage.kwt.UNAVAILABLE_OS_VERSION_TOO_LOW;
        }
        if (!d()) {
            return defpackage.kwt.UNAVAILABLE_WORK_PROFILE_NOT_DETECTED;
        }
        if (this.c == null) {
            return defpackage.kwt.UNAVAILABLE_SYSTEM_SERVICE_MISSING;
        }
        defpackage.qdn qdnVar = this.d;
        if (!qdnVar.f().c()) {
            return defpackage.kwt.UNAVAILABLE_PERMISSION_MISSING;
        }
        if (qdnVar.d()) {
            return !defpackage.mpr.f().a().o() ? defpackage.kwt.UNAVAILABLE_SETTING_DISABLED : defpackage.kwt.AVAILABLE;
        }
        return defpackage.kwt.UNAVAILABLE_WORK_PROFILE_CONNECTION_UNAVAILABLE;
    }

    public final boolean c() {
        return this.d.e().a();
    }

    public final boolean d() {
        android.content.pm.CrossProfileApps crossProfileApps = this.c;
        boolean z = crossProfileApps != null && bgp$.ExternalSyntheticApiModelOutline0.m(crossProfileApps);
        boolean zD = this.d.d();
        if (!z && zD) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 3430)).u("isWorkProfileDetected: Compatible profile detected, but can't request cross-profilequerying permission.");
        }
        return z || zD;
    }

    public final boolean e() {
        return a().a(defpackage.kwt.UNAVAILABLE_WORK_PROFILE_CONNECTION_UNAVAILABLE);
    }

    public final boolean f() {
        defpackage.qdn qdnVar = this.d;
        int i = android.os.Build.VERSION.SDK_INT;
        boolean zD = qdnVar.d();
        boolean zC = qdnVar.f().c();
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(3434);
        boolean z = i >= 31;
        yqjVar.R("shouldPromptWorkProfileInFrx\nhasCompatibleOsVersion=%b\nhasWorkProfile=%b\nhasPermission=%b", java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(zD), java.lang.Boolean.valueOf(zC));
        return z && zD && zC;
    }

    public final boolean g() {
        android.content.pm.CrossProfileApps crossProfileApps;
        defpackage.kwt kwtVarA = a();
        if (kwtVarA != defpackage.kwt.UNAVAILABLE_PERMISSION_MISSING) {
            ((defpackage.yqj) a.l().ai((char) 3438)).y("Should *not* request permission (Availability status: %s)", kwtVarA);
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT < 30 || (crossProfileApps = this.c) == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 3435)).u("Should *not* request permission (Something went wrong)");
            return false;
        }
        if (bgp$.ExternalSyntheticApiModelOutline0.m(crossProfileApps)) {
            ((defpackage.yqj) a.l().ai((char) 3436)).u("Should request permission");
            return true;
        }
        ((defpackage.yqj) a.l().ai((char) 3437)).u("Should *not* request permission (prohibited by SDK)");
        return false;
    }
}
