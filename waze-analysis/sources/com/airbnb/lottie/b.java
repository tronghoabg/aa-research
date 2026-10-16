package com.airbnb.lottie;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final a f1942a = a.f1741a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile com.airbnb.lottie.e.d f1943b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile com.airbnb.lottie.e.c f1944c;

    public static a a() {
        return f1942a;
    }

    public static com.airbnb.lottie.e.d b(Context context) {
        com.airbnb.lottie.e.d dVar;
        com.airbnb.lottie.e.c cVar;
        com.airbnb.lottie.e.d dVar2 = f1943b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (com.airbnb.lottie.e.d.class) {
            dVar = f1943b;
            if (dVar == null) {
                Context applicationContext = context.getApplicationContext();
                com.airbnb.lottie.e.c cVar2 = f1944c;
                if (cVar2 == null) {
                    synchronized (com.airbnb.lottie.e.c.class) {
                        cVar = f1944c;
                        if (cVar == null) {
                            cVar = new com.airbnb.lottie.e.c(new com.google.firebase.messaging.l(applicationContext));
                            f1944c = cVar;
                        }
                    }
                    cVar2 = cVar;
                }
                dVar = new com.airbnb.lottie.e.d(cVar2);
                f1943b = dVar;
            }
        }
        return dVar;
    }
}
