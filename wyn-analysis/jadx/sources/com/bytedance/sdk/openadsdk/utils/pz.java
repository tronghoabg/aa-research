package com.bytedance.sdk.openadsdk.utils;

import A7.AbstractC0279p0;
import android.os.Build;
import android.text.TextUtils;
import com.applovin.shadow.okio.Segment;
import com.qonversion.android.sdk.internal.Constants;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class pz {
    private static int ivm = Integer.MAX_VALUE;
    private static String lw = null;

    /* renamed from: oa, reason: collision with root package name */
    public static boolean f26161oa = false;
    public static boolean uef = false;
    private static final CharSequence yo = "amigo";
    private static final CharSequence moa = "funtouch";
    private static final ConcurrentHashMap<String, String> xs = new ConcurrentHashMap<>();

    public static class uef implements Callable<String> {
        private final String uef;

        public uef(String str) {
            this.uef = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            String str = (String) pz.xs.get(this.uef);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String strYo = pz.yo(this.uef);
            System.currentTimeMillis();
            if (strYo != null) {
                pz.xs.put(this.uef, strYo);
            }
            return strYo;
        }
    }

    public static boolean ab() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean bcc() {
        String strMoa = moa("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(strMoa) && strMoa.toLowerCase().contains(moa);
    }

    public static String bs() {
        if (ab()) {
            try {
                return "smartisan_".concat(String.valueOf(moa("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static String cq() {
        if (!ivm()) {
            return "";
        }
        return "miui_" + moa("ro.miui.ui.version.name") + Constants.USER_ID_SEPARATOR + Build.VERSION.INCREMENTAL;
    }

    public static boolean cz() {
        String str = Build.DISPLAY;
        return !TextUtils.isEmpty(str) && str.toLowerCase().contains(yo);
    }

    public static String dhk() {
        if (!oib()) {
            return "";
        }
        return "coloros_" + moa(gb.cz("ro.build.version.kllkrom")) + Constants.USER_ID_SEPARATOR + Build.DISPLAY;
    }

    public static String dj() {
        if (!wrv()) {
            return "";
        }
        return "eui_" + moa("ro.letv.release.version") + Constants.USER_ID_SEPARATOR + Build.DISPLAY;
    }

    public static String dz() {
        String strWk = wk();
        if (strWk == null || !strWk.toLowerCase().contains("emotionui")) {
            return "";
        }
        StringBuilder sbQ = AbstractC0279p0.q(strWk, Constants.USER_ID_SEPARATOR);
        sbQ.append(Build.DISPLAY);
        return sbQ.toString();
    }

    private static String gzw() {
        if (ab()) {
            return bs();
        }
        if (ivm()) {
            return cq();
        }
        if (yo()) {
            return sy();
        }
        if (oib()) {
            return dhk();
        }
        String strDz = dz();
        if (!TextUtils.isEmpty(strDz)) {
            return strDz;
        }
        if (bcc()) {
            return xs();
        }
        if (cz()) {
            return zjm();
        }
        if (lw()) {
            return moa();
        }
        String strDj = dj();
        return !TextUtils.isEmpty(strDj) ? strDj : Build.DISPLAY;
    }

    public static boolean ivm() throws ClassNotFoundException {
        if (!f26161oa) {
            try {
                Class.forName("miui.os.Build");
                uef = true;
                f26161oa = true;
                return true;
            } catch (Exception unused) {
                f26161oa = true;
            }
        }
        return uef;
    }

    public static boolean lw() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static String moa() {
        return moa("ro.build.uiversion") + Constants.USER_ID_SEPARATOR + Build.DISPLAY;
    }

    public static boolean oib() {
        if (ivm == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String strCz = gb.cz("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(strCz)) {
                ivm = 0;
            } else {
                ivm = 1;
            }
        }
        return ivm == 1;
    }

    public static String sy() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    public static boolean tpx() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                if (!str2.toLowerCase().startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String uef() throws JSONException {
        if (!TextUtils.isEmpty(lw)) {
            return lw;
        }
        String strUef = com.bytedance.sdk.openadsdk.core.zjm.uef("sdk_local_rom_info", 604800000L);
        lw = strUef;
        if (TextUtils.isEmpty(strUef)) {
            String strGzw = gzw();
            lw = strGzw;
            com.bytedance.sdk.openadsdk.core.zjm.uef("sdk_local_rom_info", strGzw);
        }
        return lw;
    }

    public static String wk() {
        return moa("ro.build.version.emui");
    }

    public static boolean wrv() {
        return !TextUtils.isEmpty(moa("ro.letv.release.version"));
    }

    public static String xs() {
        return moa("ro.vivo.os.build.display.id") + Constants.USER_ID_SEPARATOR + moa("ro.vivo.product.version");
    }

    public static boolean yo() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    public static String zjm() {
        return Build.DISPLAY + Constants.USER_ID_SEPARATOR + moa("ro.gn.sv.version");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String moa(String str) {
        String str2;
        String str3 = xs.get(str);
        if (str3 != null) {
            return str3;
        }
        if (TextUtils.isEmpty("")) {
            final com.bytedance.sdk.component.bcc.oa.oa oaVar = new com.bytedance.sdk.component.bcc.oa.oa(new uef(str), 5, 2);
            km.yo((Runnable) new com.bytedance.sdk.component.bcc.oa.yo("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.pz.1
                @Override // java.lang.Runnable
                public void run() {
                    oaVar.run();
                }
            });
            str2 = (String) oaVar.get(1L, TimeUnit.SECONDS);
        } else {
            str2 = "";
        }
        return str2 == null ? "" : str2;
    }

    public static boolean oa() {
        try {
            String strUef = uef();
            if (TextUtils.isEmpty(strUef) || !strUef.startsWith("miui")) {
                return false;
            }
            String str = Build.VERSION.INCREMENTAL;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.toLowerCase().startsWith("v12");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String yo(String str) throws IOException {
        BufferedReader bufferedReader;
        Throwable th;
        Process processExec;
        String line = "";
        Process process = null;
        try {
            try {
                try {
                    processExec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), Segment.SHARE_MINIMUM);
                    } catch (IllegalThreadStateException unused) {
                        bufferedReader = null;
                    }
                } catch (IOException e7) {
                    com.bytedance.sdk.component.utils.dhk.uef("ToolUtils", "Exception while closing InputStream", e7);
                }
            } catch (Throwable th2) {
                bufferedReader = null;
                th = th2;
            }
        } catch (IllegalThreadStateException unused2) {
            bufferedReader = null;
        }
        try {
            line = bufferedReader.readLine();
            processExec.exitValue();
            bufferedReader.close();
        } catch (IllegalThreadStateException unused3) {
            process = processExec;
            try {
                process.destroy();
            } catch (Throwable unused4) {
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            return line;
        } catch (Throwable th3) {
            th = th3;
            try {
                com.bytedance.sdk.component.utils.dhk.uef("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th);
                return line;
            } finally {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e10) {
                        com.bytedance.sdk.component.utils.dhk.uef("ToolUtils", "Exception while closing InputStream", e10);
                    }
                }
            }
        }
        return line;
    }

    public static boolean uef(String str) {
        if (TextUtils.isEmpty(str)) {
            str = wk();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || tpx();
    }
}
