package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f10206a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static av f10207b;

    static /* synthetic */ com.google.android.gms.o.t a(Context context, Intent intent, boolean z, com.google.android.gms.o.t tVar) {
        return ((Integer) tVar.g()).intValue() != 402 ? tVar : c(context, intent, z).b(new com.google.android.gms.f.v(5), new com.google.android.gms.f.x(7));
    }

    public static final com.google.android.gms.o.t b(final Intent intent, final Context context, Executor executor) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        int i2 = context.getApplicationInfo().targetSdkVersion;
        final boolean z = (intent.getFlags() & 268435456) != 0;
        return (i2 < 26 || z) ? com.google.android.gms.o.ag.a(executor, new Callable() { // from class: com.google.firebase.messaging.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(ad.c().a(context, intent));
            }
        }).c(executor, new com.google.android.gms.o.a() { // from class: com.google.firebase.messaging.h
            @Override // com.google.android.gms.o.a
            public final Object a(com.google.android.gms.o.t tVar) {
                return i.a(context, intent, z, tVar);
            }
        }) : c(context, intent, false);
    }

    private static com.google.android.gms.o.t c(Context context, Intent intent, boolean z) {
        av avVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f10206a) {
            avVar = f10207b;
            if (avVar == null) {
                avVar = new av(context);
                f10207b = avVar;
            }
        }
        if (!z) {
            return avVar.a(intent).b(new com.google.android.gms.f.v(5), new com.google.android.gms.f.x(6));
        }
        if (ad.c().e(context)) {
            ar.c(context, avVar, intent);
        } else {
            avVar.a(intent);
        }
        return com.google.android.gms.o.ag.c(-1);
    }
}
