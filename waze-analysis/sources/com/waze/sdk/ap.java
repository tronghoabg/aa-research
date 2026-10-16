package com.waze.sdk;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.Looper;
import com.waze.config.ConfigValues;
import com.waze.mg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ap {

    /* renamed from: a, reason: collision with root package name */
    static final ap f35250a = new ap();

    /* renamed from: b, reason: collision with root package name */
    private final Handler f35251b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final Map f35252c = new HashMap();

    private ap() {
    }

    public static /* synthetic */ void a(ap apVar, String str, ah ahVar, Runnable runnable) {
        Map map = apVar.f35252c;
        synchronized (map) {
            if (map.remove(str) != null && ahVar != null) {
                ahVar.i();
            }
        }
        runnable.run();
    }

    private static final boolean f(Intent intent) {
        List<ResolveInfo> listQueryBroadcastReceivers = mg.a().getPackageManager().queryBroadcastReceivers(intent, 0);
        return (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) ? false : true;
    }

    private static final Intent g(String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("com.waze.sdk.audio.ACTION_INIT");
        intent.setPackage(str);
        intent.addFlags(32);
        intent.putExtra("token", str2);
        return intent;
    }

    private static final ah h(String str, Intent intent) {
        mg.a().sendBroadcast(intent);
        return com.waze.sdk.a.j.f35199a.a(str);
    }

    final void b(String str) {
        Runnable runnable;
        Map map = this.f35252c;
        synchronized (map) {
            runnable = (Runnable) map.remove(str);
        }
        if (runnable != null) {
            this.f35251b.removeCallbacks(runnable);
        }
    }

    final void c(String str) {
        Intent launchIntentForPackage = mg.a().getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            SdkConfiguration.openAppInstallPage(mg.a(), str);
        } else {
            launchIntentForPackage.putExtra("Waze.fromWaze", true);
            mg.a().startActivity(launchIntentForPackage);
        }
    }

    final boolean d(String str) {
        return f(g(str, null));
    }

    final boolean e(final String str, String str2, final Runnable runnable) {
        final ah ahVarH;
        boolean zEquals = "com.spotify.music".equals(str);
        Intent intentG = g(str, str2);
        if (zEquals) {
            if (ConfigValues.CONFIG_VALUE_AUDIO_EXTENSION_SPOTIFY_WITH_AUDIO_SDK.b().booleanValue() && f(intentG)) {
                ahVarH = h(str, intentG);
            } else {
                bd.d();
                if (bi.d().q()) {
                    bd.d().E();
                    bd.d().D(true);
                } else {
                    com.waze.sdk.b.m.v().e();
                }
                ahVarH = null;
            }
        } else {
            if (!f(intentG)) {
                return false;
            }
            ahVarH = h(str, intentG);
        }
        if (runnable != null) {
            Runnable runnable2 = new Runnable() { // from class: com.waze.sdk.ao
                @Override // java.lang.Runnable
                public final void run() {
                    ap.a(this.f35246a, str, ahVarH, runnable);
                }
            };
            Map map = this.f35252c;
            synchronized (map) {
                map.put(str, runnable2);
            }
            this.f35251b.postDelayed(runnable2, 15000L);
        }
        return true;
    }
}
