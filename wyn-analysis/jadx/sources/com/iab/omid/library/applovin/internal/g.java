package com.iab.omid.library.applovin.internal;

import android.content.Context;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static g f27872b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f27873a;

    private g() {
    }

    public static g b() {
        return f27872b;
    }

    public Context a() {
        return this.f27873a;
    }

    public void a(Context context) {
        this.f27873a = context != null ? context.getApplicationContext() : null;
    }
}
