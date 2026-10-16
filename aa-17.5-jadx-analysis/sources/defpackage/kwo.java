package defpackage;

import android.content.Context;
import android.content.pm.CrossProfileApps;
import android.os.Build;

/* loaded from: classes.dex */
public final class kwo {
    public static final yph a = yph.c("GH.CrossProfileMgr");
    public final Context b;
    public final CrossProfileApps c;
    public final qco d;

    public kwo(Context context) {
        this.b = context;
        zfy zfyVar = new zfy();
        zfyVar.c = "com.google.android.enterprise.connectedapps.CrossProfileConnector_Service";
        zfyVar.a = qdi.DEFAULT;
        zfyVar.b = context;
        this.d = new qco(zfyVar);
        this.c = Build.VERSION.SDK_INT >= 30 ? jw$$ExternalSyntheticApiModelOutline3.m(context.getSystemService(jw$$ExternalSyntheticApiModelOutline3.m$1())) : null;
    }

    public static kwo b() {
        return (kwo) mki.a.i(kwo.class);
    }

    public final kwn a() {
        if (Build.VERSION.SDK_INT < 30) {
            return kwn.UNAVAILABLE_OS_VERSION_TOO_LOW;
        }
        if (!d()) {
            return kwn.UNAVAILABLE_WORK_PROFILE_NOT_DETECTED;
        }
        if (this.c == null) {
            return kwn.UNAVAILABLE_SYSTEM_SERVICE_MISSING;
        }
        qco qcoVar = this.d;
        return !qcoVar.f().d() ? kwn.UNAVAILABLE_PERMISSION_MISSING : !qcoVar.d() ? kwn.UNAVAILABLE_WORK_PROFILE_CONNECTION_UNAVAILABLE : !mpl.f().a().o() ? kwn.UNAVAILABLE_SETTING_DISABLED : kwn.AVAILABLE;
    }

    public final boolean c() {
        return this.d.e().a();
    }

    public final boolean d() {
        CrossProfileApps crossProfileApps = this.c;
        boolean z = crossProfileApps != null && crossProfileApps.canRequestInteractAcrossProfiles();
        boolean zD = this.d.d();
        if (!z && zD) {
            ((ype) ((ype) a.g()).ai((char) 3427)).u("isWorkProfileDetected: Compatible profile detected, but can't request cross-profilequerying permission.");
        }
        return z || zD;
    }

    public final boolean e() {
        return a().a(kwn.UNAVAILABLE_WORK_PROFILE_CONNECTION_UNAVAILABLE);
    }

    public final boolean f() {
        qco qcoVar = this.d;
        int i = Build.VERSION.SDK_INT;
        boolean zD = qcoVar.d();
        boolean zD2 = qcoVar.f().d();
        ype ypeVar = (ype) ((ype) a.f()).ai(3431);
        boolean z = i >= 31;
        ypeVar.R("shouldPromptWorkProfileInFrx\nhasCompatibleOsVersion=%b\nhasWorkProfile=%b\nhasPermission=%b", Boolean.valueOf(z), Boolean.valueOf(zD), Boolean.valueOf(zD2));
        return z && zD && zD2;
    }

    public final boolean g() {
        CrossProfileApps crossProfileApps;
        kwn kwnVarA = a();
        if (kwnVarA != kwn.UNAVAILABLE_PERMISSION_MISSING) {
            ((ype) a.l().ai((char) 3435)).y("Should *not* request permission (Availability status: %s)", kwnVarA);
            return false;
        }
        if (Build.VERSION.SDK_INT < 30 || (crossProfileApps = this.c) == null) {
            ((ype) ((ype) a.g()).ai((char) 3432)).u("Should *not* request permission (Something went wrong)");
            return false;
        }
        if (crossProfileApps.canRequestInteractAcrossProfiles()) {
            ((ype) a.l().ai((char) 3433)).u("Should request permission");
            return true;
        }
        ((ype) a.l().ai((char) 3434)).u("Should *not* request permission (prohibited by SDK)");
        return false;
    }
}
