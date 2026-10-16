package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes4.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    private static aw f27176a;

    public static synchronized aw a(Context context) {
        try {
            if (f27176a == null) {
                u uVar = new u(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                uVar.a(context);
                f27176a = uVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f27176a;
    }
}
