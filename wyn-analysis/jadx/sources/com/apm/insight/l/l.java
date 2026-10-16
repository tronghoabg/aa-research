package com.apm.insight.l;

import A7.AbstractC0279p0;
import Va.M6;
import android.os.Build;
import android.text.TextUtils;
import com.applovin.shadow.okio.Segment;
import com.qonversion.android.sdk.internal.Constants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.util.Locale;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final CharSequence f20533a = "amigo";

    /* renamed from: b, reason: collision with root package name */
    private static final CharSequence f20534b = "funtouch";

    public static String a() {
        String string;
        if (d.b()) {
            if (!d.b()) {
                return "";
            }
            return "miui_" + a("ro.miui.ui.version.name") + Constants.USER_ID_SEPARATOR + Build.VERSION.INCREMENTAL;
        }
        if (d.c()) {
            String str = Build.DISPLAY;
            return (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) ? "" : str;
        }
        if (b()) {
            if (!b()) {
                return "";
            }
            return "coloros_" + a("ro.build.version.opporom") + Constants.USER_ID_SEPARATOR + Build.DISPLAY;
        }
        String strA = d.a();
        if (strA == null || !strA.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            string = "";
        } else {
            StringBuilder sbQ = AbstractC0279p0.q(strA, Constants.USER_ID_SEPARATOR);
            sbQ.append(Build.DISPLAY);
            string = sbQ.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strA2 = a("ro.vivo.os.build.display.id");
        if (!TextUtils.isEmpty(strA2) && strA2.toLowerCase(Locale.getDefault()).contains(f20534b)) {
            return a("ro.vivo.os.build.display.id") + Constants.USER_ID_SEPARATOR + a("ro.vivo.product.version");
        }
        String str2 = Build.DISPLAY;
        if (!TextUtils.isEmpty(str2) && str2.toLowerCase(Locale.getDefault()).contains(f20533a)) {
            StringBuilder sbQ2 = AbstractC0279p0.q(str2, Constants.USER_ID_SEPARATOR);
            sbQ2.append(a("ro.gn.sv.version"));
            return sbQ2.toString();
        }
        String str3 = Build.MANUFACTURER + Build.BRAND;
        if (!TextUtils.isEmpty(str3)) {
            String lowerCase = str3.toLowerCase(Locale.getDefault());
            if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
                return M6.t(new StringBuilder(), a("ro.build.uiversion"), Constants.USER_ID_SEPARATOR, str2);
            }
        }
        String strT = TextUtils.isEmpty(a("ro.letv.release.version")) ? "" : M6.t(new StringBuilder("eui_"), a("ro.letv.release.version"), Constants.USER_ID_SEPARATOR, str2);
        return !TextUtils.isEmpty(strT) ? strT : str2;
    }

    private static boolean b() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase(Locale.getDefault()).contains("oppo");
    }

    private static String a(String str) {
        BufferedReader bufferedReader;
        String line = "";
        try {
            Process processExec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
            bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), Segment.SHARE_MINIMUM);
            try {
                line = bufferedReader.readLine();
                processExec.destroy();
                com.apm.insight.a.a((Closeable) bufferedReader);
                return line;
            } catch (Throwable unused) {
                com.apm.insight.a.a((Closeable) bufferedReader);
                return line;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }
}
