package com.google.android.gms.common.internal;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class af implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile af f4961a;

    /* renamed from: b, reason: collision with root package name */
    private static Context f4962b;

    private af() {
    }

    public static af b(Context context) {
        af afVar;
        af afVar2 = f4961a;
        if (afVar2 != null) {
            return afVar2;
        }
        synchronized (af.class) {
            afVar = f4961a;
            if (afVar == null) {
                Context applicationContext = context.getApplicationContext();
                com.google.android.gms.common.api.internal.av.m(applicationContext);
                Context context2 = applicationContext;
                f4962b = applicationContext;
                afVar = new af();
                f4961a = afVar;
            }
        }
        return afVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ae.f4960a.post(runnable);
    }
}
