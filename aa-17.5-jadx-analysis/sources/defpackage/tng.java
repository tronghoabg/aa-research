package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class tng {
    private static final sid i = new tne();
    public final sio a;
    public final ExecutorService b;
    public final tmb c;
    public final Context d;
    public SharedPreferences e;
    public long f;
    public final erb g;
    public final erb h;

    public tng(Context context, tmb tmbVar, ExecutorService executorService, shv shvVar) {
        sio sioVar = new sio(shvVar, spk.a);
        this.a = sioVar;
        this.g = new erb(sioVar.d("SdkStartupTimeToMapLoaded", sio.a));
        this.h = new erb(sioVar.d("FrameTime", i));
        this.b = executorService;
        this.c = tmbVar;
        this.d = context;
        shvVar.e(new tnf());
    }

    public static void b(String str, zbu zbuVar) {
        if (Log.isLoggable("SdkMonitoringLogger", 3)) {
            Log.d("SdkMonitoringLogger", str + ": [" + Base64.encodeToString(zbuVar.h(), 2) + "]");
        }
    }

    public void a() {
        this.a.e();
        if (Log.isLoggable("SdkMonitoringLogger", 3)) {
            Log.d("SdkMonitoringLogger", "All counters flushed.");
        }
    }
}
