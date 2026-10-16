package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class wdf extends BroadcastReceiver {
    public static volatile wyd a;
    private static volatile wyd b;

    public static void a(Context context, wyd wydVar, wyd wydVar2) {
        if (a == null) {
            synchronized (wdf.class) {
                if (a == null) {
                    if (wydVar != null && !Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            context.registerReceiver(new wdf(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                        } else {
                            context.registerReceiver(new wdf(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                        }
                        b = wydVar;
                    }
                    a = wydVar2;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            Log.w("PhUpdateBroadcastRecv", a.bq(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
            return;
        }
        wyd wydVar = b;
        if (wydVar == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        kgx kgxVar = (kgx) ((wcp) wydVar.a).b.get(stringExtra);
        if (kgxVar != null) {
            kgxVar.k(new wcn(1));
        }
    }
}
