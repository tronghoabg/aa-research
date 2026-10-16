package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.unity3d.services.core.fid.Constants;
import io.flutter.embedding.android.FlutterActivity;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class bcc {
    private static final AtomicReference<Boolean> uef = new AtomicReference<>(null);

    /* renamed from: oa, reason: collision with root package name */
    private static final AtomicReference<String> f26131oa = new AtomicReference<>(null);

    private static boolean bcc(Context context) throws ClassNotFoundException {
        try {
            Class.forName("com.unity3d.player.UnityPlayerActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libunity.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static boolean cz(Context context) {
        try {
            int i5 = FlutterActivity.f36961e;
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libflutter.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static PackageInfo dj(Context context) {
        try {
            String str = Build.VERSION.SDK_INT <= 23 ? (String) Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", new Class[0]).invoke(null, new Object[0]) : (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static PackageInfo ivm(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return WebView.getCurrentWebViewPackage();
            }
            PackageInfo packageInfo = (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
            return packageInfo != null ? packageInfo : dj(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static String lw(Context context) {
        try {
            AtomicReference<String> atomicReference = f26131oa;
            String str = atomicReference.get();
            if (str != null) {
                return str;
            }
            PackageInfo packageInfoIvm = ivm(context);
            String str2 = packageInfoIvm != null ? packageInfoIvm.versionName : "";
            while (!atomicReference.compareAndSet(null, str2) && atomicReference.get() == null) {
            }
            return str2;
        } catch (Throwable unused) {
            AtomicReference<String> atomicReference2 = f26131oa;
            while (!atomicReference2.compareAndSet(null, "") && atomicReference2.get() == null) {
            }
            return "";
        }
    }

    public static int moa(Context context) throws ClassNotFoundException {
        try {
            Class.forName("com.google.android.play.core.splitinstall.SplitInstallManager");
            return 1;
        } catch (ClassNotFoundException unused) {
            return 0;
        }
    }

    public static int oa(Context context) {
        if (bcc(context)) {
            return 1;
        }
        if (cz(context)) {
            return 2;
        }
        return zjm(context) ? 3 : 4;
    }

    public static void uef(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (oa()) {
                com.bytedance.sdk.openadsdk.core.yo yoVarUef = com.bytedance.sdk.openadsdk.core.yo.uef();
                yoVarUef.uef("w_ver", lw(context));
                yoVarUef.uef("bp", oa(context));
                yoVarUef.uef("is_fold", xs(context) ? 1 : 0);
                yoVarUef.uef("abi", uef());
                yoVarUef.uef("t_ver", yo(context));
                yoVarUef.uef("aab", moa(context));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean xs(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.bcc.xs(android.content.Context):boolean");
    }

    public static String yo(Context context) {
        try {
            return String.valueOf(context.getApplicationInfo().targetSdkVersion);
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean zjm(Context context) throws ClassNotFoundException {
        try {
            Class.forName("com.facebook.react.ReactActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libreactnativejni.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static boolean moa() {
        String lowerCase;
        if (dj()) {
            return true;
        }
        String[] strArr = {"sm-f9000", "sm-f9160", "sm-f9260", "sm-f9360", "sm-f9460", "sm-f9560", "sm-f7000", "sm-f7070", "sm-f7110", "sm-f7210", "sm-f7310", "sm-f7410"};
        String[] strArr2 = {"winner", "f2q", "q2q", "q4q", "q5q", "q6q", "bloomq", "bloomxq", "b2q", "b4q", "b5q", "b6q"};
        try {
            String lowerCase2 = Build.DEVICE.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase2)) {
                for (int i5 = 0; i5 < 12; i5++) {
                    if (lowerCase2.contains(strArr2[i5])) {
                        return true;
                    }
                }
            }
            lowerCase = Build.MODEL.toLowerCase();
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(lowerCase)) {
            return false;
        }
        for (int i10 = 0; i10 < 12; i10++) {
            if (lowerCase.contains(strArr[i10])) {
                return true;
            }
        }
        if (oa()) {
            String strUef = com.bytedance.sdk.openadsdk.gzw.lw.uef("fold_config", "fold_samung", "");
            if (TextUtils.isEmpty(strUef)) {
                return false;
            }
            for (String str : strUef.split(",")) {
                if (lowerCase.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean bcc() {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("BED", "isXiaomiFold return false " + th.getMessage());
            return false;
        }
    }

    private static boolean cz() {
        if (zjm()) {
            return true;
        }
        String[] strArr = {"CPH2439", "CPH2437", "CPH2499", "CPH2519", "PEUM00", "PGU110", "PGT110", "PHN110", "PHT110"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i5 = 0; i5 < 9; i5++) {
                    if (lowerCase.contains(strArr[i5].toLowerCase())) {
                        return true;
                    }
                }
                if (oa()) {
                    String strYo = yo();
                    if (TextUtils.isEmpty(strYo)) {
                        return false;
                    }
                    for (String str : strYo.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void oa(JSONObject jSONObject, Context context) {
        try {
            if (oa()) {
                String strOa = com.bytedance.sdk.openadsdk.core.yo.uef().oa("w_ver", lw(context));
                if (TextUtils.isEmpty(strOa)) {
                    return;
                }
                jSONObject.put("w_ver", strOa);
            }
        } catch (Throwable unused) {
        }
    }

    public static String yo() {
        return com.bytedance.sdk.openadsdk.gzw.lw.uef("fold_config", "fold_default", "");
    }

    private static boolean zjm() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object objInvoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]), "oplus.hardware.type.fold");
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
        } catch (ClassNotFoundException e7) {
            e = e7;
            com.bytedance.sdk.component.utils.dhk.yo("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (IllegalAccessException e10) {
            e = e10;
            com.bytedance.sdk.component.utils.dhk.yo("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (NoSuchMethodException e11) {
            e = e11;
            com.bytedance.sdk.component.utils.dhk.yo("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (InvocationTargetException e12) {
            e = e12;
            com.bytedance.sdk.component.utils.dhk.yo("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean lw() {
        if (bcc()) {
            return true;
        }
        String[] strArr = {"M2011J18C", "22061218C", "2308CPXD0C", "24072PX77C", "2405CPX3DC", "2405CPX3DG"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i5 = 0; i5 < 6; i5++) {
                    if (lowerCase.contains(strArr[i5])) {
                        return true;
                    }
                }
                if (oa()) {
                    String strYo = yo();
                    if (TextUtils.isEmpty(strYo)) {
                        return false;
                    }
                    for (String str : strYo.split(",")) {
                        if (lowerCase.contains(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean ivm() {
        if (xs()) {
            return true;
        }
        String[] strArr = {"V2330", "V2178A", "V2229A", "V2303A", "V2337A", "V2256A", "V2266A"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i5 = 0; i5 < 7; i5++) {
                    if (lowerCase.contains(strArr[i5].toLowerCase())) {
                        return true;
                    }
                }
                if (oa()) {
                    String strYo = yo();
                    if (TextUtils.isEmpty(strYo)) {
                        return false;
                    }
                    for (String str : strYo.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean oa() {
        return com.bytedance.sdk.openadsdk.gzw.lw.uef("fold_config", "enable", 0) == 1;
    }

    private static boolean dj() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            Object objInvoke = cls.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
            Method declaredMethod = cls.getDeclaredMethod("getString", String.class);
            if ("TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD"))) {
                return true;
            }
            return "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP"));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
            com.bytedance.sdk.component.utils.dhk.yo("PAG_BANNER", "get ss fold device error: " + e7.getMessage());
            return false;
        }
    }

    public static String uef() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Exception unused) {
            return "";
        }
    }

    public static void uef(JSONObject jSONObject, Context context) {
        if (context == null) {
            return;
        }
        try {
            if (oa()) {
                com.bytedance.sdk.openadsdk.core.yo yoVarUef = com.bytedance.sdk.openadsdk.core.yo.uef();
                String strOa = yoVarUef.oa("md", com.bytedance.sdk.openadsdk.core.zjm.oa().xs());
                if (!TextUtils.isEmpty(strOa)) {
                    jSONObject.put("md", strOa);
                }
                int iOa = yoVarUef.oa("bp", oa(context));
                if (iOa != 4) {
                    jSONObject.put("bp", iOa);
                }
                String strOa2 = yoVarUef.oa("t_ver", yo(context));
                if (!TextUtils.isEmpty(strOa2)) {
                    jSONObject.put("t_ver", strOa2);
                }
                jSONObject.put("is_fold", yoVarUef.oa("is_fold", xs(context) ? 1 : 0));
                jSONObject.put("aab", yoVarUef.oa("aab", moa(context)));
                String strOa3 = yoVarUef.oa("abi", uef());
                if (TextUtils.isEmpty(strOa3)) {
                    return;
                }
                jSONObject.put("abi", strOa3);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean xs() {
        try {
            return "foldable".equals(Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", new Class[0]).invoke(null, new Object[0]));
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("BED", "isVIVOFoldDevice return false " + th.getMessage());
            return false;
        }
    }
}
