package com.waze;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.WindowManager;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import com.waze.config.ConfigValues;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static long f40624a;

    /* renamed from: b, reason: collision with root package name */
    private static String f40625b;

    /* renamed from: c, reason: collision with root package name */
    private static C0486r f40626c;

    /* renamed from: d, reason: collision with root package name */
    private static s f40627d;

    /* renamed from: g, reason: collision with root package name */
    private static Handler f40630g;

    /* renamed from: h, reason: collision with root package name */
    private static final com.waze.asks.ab f40631h = new com.waze.asks.ab((byte[]) null, (byte[]) null);

    /* renamed from: e, reason: collision with root package name */
    private static boolean f40628e = false;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f40629f = false;

    private t() {
    }

    public static long a() {
        return SystemClock.elapsedRealtime() - f40624a;
    }

    public static Resources b() {
        return ((Context) com.waze.web.r.h(Context.class)).getResources();
    }

    public static Display c() {
        WindowManager windowManager = (WindowManager) mg.a().getSystemService("window");
        if (windowManager != null) {
            return windowManager.getDefaultDisplay();
        }
        return null;
    }

    public static kk d() {
        return (kk) com.waze.web.r.h(kk.class);
    }

    public static com.waze.map.bq e() {
        return f40631h.d();
    }

    public static String f(Context context) {
        String str = f40625b;
        if (str != null) {
            return str;
        }
        String parent = context.getFilesDir().getParent();
        f40625b = parent;
        return parent;
    }

    public static String g() {
        return ConfigValues.CONFIG_VALUE_FORCE_UPGRADE_PLAY_STORE_URL_ANDROID.b();
    }

    static /* bridge */ /* synthetic */ void h() {
        NativeManager nativeManager = NativeManager.getInstance();
        if (nativeManager == null) {
            return;
        }
        com.waze.navigate.eo eoVar = (com.waze.navigate.eo) com.waze.web.r.h(com.waze.navigate.eo.class);
        boolean initializedStatus = nativeManager.getInitializedStatus();
        boolean z = false;
        if (initializedStatus && eoVar.T()) {
            z = true;
        }
        com.waze.shared_infra.i.h.h("EndCallListener: isInitialized = " + initializedStatus + ", isNavigating = " + z);
        if (initializedStatus && z) {
            int returnToWazeFromPhoneTimeoutNTV = nativeManager.getReturnToWazeFromPhoneTimeoutNTV();
            com.waze.shared_infra.i.h.h("EndCallListener: Timeout value = " + returnToWazeFromPhoneTimeoutNTV + " secs");
            if (returnToWazeFromPhoneTimeoutNTV >= 0) {
                com.waze.shared_infra.i.h.h("EndCallListener: Starting free map activity, delaySec=" + returnToWazeFromPhoneTimeoutNTV);
                AppServiceBroadcastReceiver.a(new ls(), TimeUnit.SECONDS.toMillis((long) returnToWazeFromPhoneTimeoutNTV));
            }
        }
    }

    public static void i(com.waze.map.bq bqVar) {
        f40631h.e(bqVar);
    }

    public static void j(Context context) {
        TelephonyManager telephonyManager;
        if (f40628e || (telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            C0486r c0486r = new C0486r();
            f40626c = c0486r;
            telephonyManager.listen(c0486r, 32);
        } else if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
            f40627d = new s();
            telephonyManager.registerTelephonyCallback(ContextCompat.getMainExecutor(context), f40627d);
        } else {
            ConfigValues.CONFIG_VALUE_DISPLAY_RETURN_TO_WAZE.d(false);
        }
        f40628e = true;
    }

    public static void k(Context context) {
        if (f40629f) {
            return;
        }
        f40630g = (Handler) com.waze.web.r.h(com.waze.native_managers.j.class);
        j(context);
        f40629f = true;
    }

    public static void l(Runnable runnable) {
        f40630g.post(runnable);
    }

    public static void m(Runnable runnable, long j2) {
        f40630g.postDelayed(runnable, j2);
    }

    public static void n(com.waze.map.bq bqVar) {
        f40631h.f(bqVar);
    }

    public static boolean o() {
        return f40629f && NativeManager.getInstance() != null && NativeManager.isAppStarted();
    }
}
