package com.google.android.gms.common.d;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final c f4934a = new c();

    /* renamed from: b, reason: collision with root package name */
    private b f4935b = null;

    public static b b(Context context) {
        return f4934a.a(context);
    }

    public final synchronized b a(Context context) {
        b bVar;
        bVar = this.f4935b;
        if (bVar == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            bVar = new b(context);
            this.f4935b = bVar;
        }
        return bVar;
    }
}
