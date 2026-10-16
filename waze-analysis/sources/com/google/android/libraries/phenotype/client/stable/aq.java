package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aq extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    static volatile com.google.firebase.messaging.l f6070a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile com.google.firebase.messaging.l f6071b;

    public static void a(Context context, com.google.firebase.messaging.l lVar, com.google.firebase.messaging.l lVar2) {
        if (f6070a == null) {
            synchronized (aq.class) {
                if (f6070a == null) {
                    if (lVar != null && !Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            context.registerReceiver(new aq(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                        } else {
                            context.registerReceiver(new aq(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                        }
                        f6071b = lVar;
                    }
                    f6070a = lVar2;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            Log.w("PhUpdateBroadcastRecv", "Got an invalid config package for P/H that includes '..': " + stringExtra + ". Exiting.");
            return;
        }
        com.google.firebase.messaging.l lVar = f6071b;
        if (lVar == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
        } else {
            p.a((p) lVar.f10212a, stringExtra);
        }
    }
}
