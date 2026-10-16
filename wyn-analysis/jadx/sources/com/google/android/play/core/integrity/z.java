package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes4.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private static s f27260a;

    public static synchronized s a(Context context) {
        try {
            if (f27260a == null) {
                q qVar = new q(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                qVar.a(context);
                f27260a = qVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f27260a;
    }
}
