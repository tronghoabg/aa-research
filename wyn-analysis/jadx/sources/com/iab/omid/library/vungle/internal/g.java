package com.iab.omid.library.vungle.internal;

import android.content.Context;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static g f28157b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f28158a;

    private g() {
    }

    public static g b() {
        return f28157b;
    }

    public Context a() {
        return this.f28158a;
    }

    public void a(Context context) {
        this.f28158a = context != null ? context.getApplicationContext() : null;
    }
}
