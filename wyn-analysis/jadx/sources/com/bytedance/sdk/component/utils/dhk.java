package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import android.util.Log;
import ka.AbstractC3256n;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public class dhk {

    /* renamed from: oa, reason: collision with root package name */
    private static String f25097oa = "";
    private static boolean uef = false;

    public static void oa() {
        uef = false;
    }

    public static void uef() {
        uef = true;
    }

    public static void yo(String str, String str2) {
        if (uef && str2 != null) {
            Log.e(oa(str), str2);
        }
    }

    public static void oa(String str, String str2) {
        if (uef && str2 != null) {
            Log.i(oa(str), str2);
        }
    }

    public static void uef(String str, String str2) {
        if (uef && str2 != null) {
            Log.d(oa(str), str2);
        }
    }

    public static void yo(String str, Object... objArr) {
        if (uef && objArr != null) {
            Log.e(oa(str), uef(objArr));
        }
    }

    public static void oa(String str, Object... objArr) {
        if (uef && objArr != null) {
            Log.i(oa(str), uef(objArr));
        }
    }

    public static void uef(String str, Object... objArr) {
        if (uef && objArr != null) {
            Log.d(oa(str), uef(objArr));
        }
    }

    private static String oa(String str) {
        return TextUtils.isEmpty(f25097oa) ? str : uef(AbstractC3256n.h(new StringBuilder("["), f25097oa, "]-[", str, "]"));
    }

    public static void uef(String str, String str2, Throwable th) {
        if (uef) {
            if (str2 == null && th == null) {
                return;
            }
            Log.e(oa(str), str2, th);
        }
    }

    public static void uef(String str) {
        f25097oa = str;
    }

    private static String uef(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : objArr) {
                if (obj != null) {
                    sb2.append(obj.toString());
                } else {
                    sb2.append(" null ");
                }
                sb2.append(StringUtils.SPACE);
            }
            return sb2.toString();
        }
        return "";
    }
}
