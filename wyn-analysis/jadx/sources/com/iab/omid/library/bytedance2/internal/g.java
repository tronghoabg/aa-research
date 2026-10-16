package com.iab.omid.library.bytedance2.internal;

import android.content.Context;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static g f28005b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f28006a;

    private g() {
    }

    public static g b() {
        return f28005b;
    }

    public Context a() {
        return this.f28006a;
    }

    public void a(Context context) {
        this.f28006a = context != null ? context.getApplicationContext() : null;
    }
}
