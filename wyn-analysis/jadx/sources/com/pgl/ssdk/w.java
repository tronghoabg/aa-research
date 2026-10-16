package com.pgl.ssdk;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes4.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static String f32620a;

    /* renamed from: b, reason: collision with root package name */
    private static String f32621b;

    public static String a() {
        if (TextUtils.isEmpty(f32621b)) {
            f32621b = b();
        }
        return f32621b;
    }

    private static String b() {
        return (a("com.samsung.android.knox.SemPersonaManager") || a("com.samsung.android.knoxguard.KnoxGuardManager")) ? "samsung" : (a("androidhnext.Manifest") || a("androidhnext.R")) ? "honor" : (a("androidhwext.Manifest") || a("androidhwext.R")) ? "huawei" : (a("oppo.Manifest") || a("oppo.R") || a("oplus.Manifest") || a("oplus.R") || a("com.oneplus.Manifest") || a("com.oneplus.R")) ? "oppo" : (a("vivo.Manifest") || a("vivo.R")) ? "vivo" : (a("miui.Manifest") || a("miui.R") || a("miui.os.Build")) ? "xiaomi" : (a("lineageos.platform.Manifest") || a("lineageos.platform.R")) ? "lineage" : b("/system/framework/com.motorola.motosignature.jar") ? "moto" : (b("/system/framework/transsion-framework.jar") || b("/system/framework/transsion-services.jar")) ? "transsion" : "other";
    }

    public static String a(Context context) {
        String str = f32620a;
        if (str != null) {
            return str;
        }
        f32620a = Build.VERSION.SDK_INT >= 24 ? Settings.Global.getString(context.getContentResolver(), "boot_count") : "lowapi";
        return f32620a;
    }

    private static boolean b(String str) {
        try {
            return new File(str).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
