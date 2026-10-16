package com.applovin.impl;

import android.content.Context;

/* loaded from: classes.dex */
public class p4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f22495a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22496b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f22497c;

    public p4(String str, String str2, Context context) {
        this.f22495a = str.replace("android.permission.", "");
        this.f22496b = str2;
        this.f22497c = AbstractC1654o0.a(str, context);
    }

    public String a() {
        return this.f22496b;
    }

    public String b() {
        return this.f22495a;
    }

    public boolean c() {
        return this.f22497c;
    }
}
