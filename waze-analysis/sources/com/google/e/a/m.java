package com.google.e.a;

import com.google.e.a.h.bk;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final l f8764a = new k(0);

    /* renamed from: b, reason: collision with root package name */
    private final bk f8765b;

    /* renamed from: c, reason: collision with root package name */
    private final f f8766c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8767d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8768e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f8769f;

    /* renamed from: g, reason: collision with root package name */
    private final l f8770g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.d.m.a.a.b f8771h;

    /* synthetic */ m(com.google.d.m.a.a.b bVar, bk bkVar, int i2, boolean z, boolean z2, l lVar) {
        this.f8771h = bVar;
        this.f8765b = bkVar;
        int iOrdinal = bkVar.ordinal();
        this.f8766c = iOrdinal != 1 ? iOrdinal != 3 ? f.f8467b : f.f8468c : f.f8466a;
        this.f8767d = i2;
        this.f8768e = z;
        this.f8769f = z2;
        this.f8770g = lVar;
    }

    public final int b() {
        return this.f8767d;
    }

    public final f c() {
        return this.f8766c;
    }

    public final boolean h() {
        return this.f8768e;
    }

    public final com.google.d.m.a.a.b j() {
        this.f8770g.a();
        return this.f8771h;
    }
}
