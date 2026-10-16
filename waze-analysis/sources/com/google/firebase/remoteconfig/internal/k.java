package com.google.firebase.remoteconfig.internal;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final int f10692a;

    /* renamed from: b, reason: collision with root package name */
    private final h f10693b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10694c;

    private k(int i2, h hVar, String str) {
        this.f10692a = i2;
        this.f10693b = hVar;
        this.f10694c = str;
    }

    public static k c(h hVar, String str) {
        return new k(0, hVar, str);
    }

    public static k e(h hVar) {
        return new k(1, hVar, null);
    }

    public static k f() {
        return new k(2, null, null);
    }

    final int a() {
        return this.f10692a;
    }

    public final h b() {
        return this.f10693b;
    }

    final String d() {
        return this.f10694c;
    }
}
