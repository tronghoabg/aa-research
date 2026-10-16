package com.waze.resources;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.waze.mg;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static DisplayMetrics f35083a;

    /* renamed from: b, reason: collision with root package name */
    private static String f35084b;

    public static String a(String str) {
        return d(str, "@2x");
    }

    public static String b(String str) {
        return d(str, "@3x");
    }

    public static String c(String str) {
        return str.endsWith(".png") ? str : String.valueOf(str).concat(".png");
    }

    public static String d(String str, String str2) {
        if (str.contains("@2x") || str.contains("@3x") || str.contains("@5x") || str.contains("@10x")) {
            return str;
        }
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf == -1) {
            return String.valueOf(str).concat(str2);
        }
        return str.substring(0, iLastIndexOf) + str2 + str.substring(iLastIndexOf);
    }

    public static String e(String str) {
        Context contextA = mg.a();
        File file = new File(h.f(contextA) + DomExceptionUtils.SEPARATOR + str);
        String strC = c(str);
        File file2 = new File(h.f(contextA) + DomExceptionUtils.SEPARATOR + strC);
        String strC2 = c(a(str));
        File file3 = new File(h.f(contextA) + DomExceptionUtils.SEPARATOR + strC2);
        String strC3 = c(b(str));
        File file4 = new File(h.f(contextA) + DomExceptionUtils.SEPARATOR + strC3);
        if (i() && file4.exists()) {
            return file4.getAbsolutePath();
        }
        if (h() && file3.exists()) {
            return file3.getAbsolutePath();
        }
        if (file2.exists()) {
            return file2.getAbsolutePath();
        }
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    public static void f(DisplayMetrics displayMetrics) {
        f35083a = displayMetrics;
    }

    public static void g(String str) {
        f35084b = str;
    }

    public static boolean h() {
        return !TextUtils.isEmpty(f35084b) ? f35084b.equals("@2x") : j() >= 1.1f;
    }

    public static boolean i() {
        return !TextUtils.isEmpty(f35084b) ? f35084b.equals("@3x") : j() >= 2.5f;
    }

    private static float j() {
        DisplayMetrics displayMetrics = f35083a;
        if (displayMetrics == null) {
            displayMetrics = Resources.getSystem().getDisplayMetrics();
        }
        return displayMetrics.densityDpi / 163.0f;
    }
}
