package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ar {

    /* renamed from: a, reason: collision with root package name */
    static final long f10176a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f10177b;

    /* renamed from: c, reason: collision with root package name */
    private static com.google.android.gms.n.d f10178c;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f10176a = 60000L;
        f10177b = new Object();
    }

    static ComponentName a(Context context, Intent intent) {
        synchronized (f10177b) {
            e(context);
            boolean zD = d(intent);
            f(intent, true);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            if (!zD) {
                f10178c.b(f10176a);
            }
            return componentNameStartService;
        }
    }

    static void b(Intent intent) {
        synchronized (f10177b) {
            if (f10178c != null && d(intent)) {
                f(intent, false);
                f10178c.c();
            }
        }
    }

    static void c(Context context, av avVar, final Intent intent) {
        synchronized (f10177b) {
            e(context);
            boolean zD = d(intent);
            f(intent, true);
            if (!zD) {
                f10178c.b(f10176a);
            }
            avVar.a(intent).m(new com.google.android.gms.o.k() { // from class: com.google.firebase.messaging.aq
                @Override // com.google.android.gms.o.k
                public final void a(com.google.android.gms.o.t tVar) {
                    ar.b(intent);
                }
            });
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    private static void e(Context context) {
        if (f10178c == null) {
            com.google.android.gms.n.d dVar = new com.google.android.gms.n.d(context);
            f10178c = dVar;
            dVar.e();
        }
    }

    private static void f(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }
}
