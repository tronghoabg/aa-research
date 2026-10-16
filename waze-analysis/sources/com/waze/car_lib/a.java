package com.waze.car_lib;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f18803a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f18804b;

    public a(com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f("com.google.android.projection.gearhead", "hostName");
        h.g.b.x.f(eVar, "logger");
        this.f18803a = "com.google.android.projection.gearhead";
        this.f18804b = eVar;
    }

    public final Float a(Context context) {
        Object objA;
        String str;
        h.g.b.x.f(context, "context");
        try {
            str = context.getPackageManager().getPackageInfo(this.f18803a, 0).versionName;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        if (str == null) {
            throw new RuntimeException("expecting versionName not null");
        }
        String str2 = str;
        String strSubstring = str.substring(0, h.n.o.W(str2, '.', h.n.o.W(str2, '.', 0, 6) + 1, 4));
        h.g.b.x.e(strSubstring, "substring(...)");
        objA = h.n.o.e(strSubstring);
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            this.f18804b.a("Couldn't get version name of " + this.f18803a + ": " + thC);
            objA = null;
        }
        return (Float) objA;
    }
}
