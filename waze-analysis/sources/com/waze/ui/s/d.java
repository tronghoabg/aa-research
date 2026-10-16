package com.waze.ui.s;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f43392a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43393b;

    /* renamed from: c, reason: collision with root package name */
    private final String f43394c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f43395d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.a f43396e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.a f43397f;

    /* renamed from: g, reason: collision with root package name */
    private final h.g.a.a f43398g;

    /* renamed from: h, reason: collision with root package name */
    private final h.g.a.a f43399h;

    public d(boolean z, String str, String str2, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, h.g.a.a aVar5) {
        x.f(str, "thirdPartyAppName");
        x.f(aVar, "onAllowAction");
        x.f(aVar2, "onDisallowAction");
        x.f(aVar3, "onPrivacyClick");
        x.f(aVar4, "onIsvPrivacyClick");
        x.f(aVar5, "onLearnMoreClick");
        this.f43392a = z;
        this.f43393b = str;
        this.f43394c = str2;
        this.f43395d = aVar;
        this.f43396e = aVar2;
        this.f43397f = aVar3;
        this.f43398g = aVar4;
        this.f43399h = aVar5;
    }

    public final String a() {
        return this.f43394c;
    }

    public final String b() {
        return this.f43393b;
    }

    public final h.g.a.a c() {
        return this.f43395d;
    }

    public final h.g.a.a d() {
        return this.f43396e;
    }

    public final h.g.a.a e() {
        return this.f43398g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f43392a == dVar.f43392a && x.n(this.f43393b, dVar.f43393b) && x.n(this.f43394c, dVar.f43394c) && x.n(this.f43395d, dVar.f43395d) && x.n(this.f43396e, dVar.f43396e) && x.n(this.f43397f, dVar.f43397f) && x.n(this.f43398g, dVar.f43398g) && x.n(this.f43399h, dVar.f43399h);
    }

    public final h.g.a.a f() {
        return this.f43399h;
    }

    public final h.g.a.a g() {
        return this.f43397f;
    }

    public final int hashCode() {
        int iA = (a.a.a(this.f43392a) * 31) + this.f43393b.hashCode();
        String str = this.f43394c;
        return (((((((((((iA * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.f43395d.hashCode()) * 31) + this.f43396e.hashCode()) * 31) + this.f43397f.hashCode()) * 31) + this.f43398g.hashCode()) * 31) + this.f43399h.hashCode();
    }

    public final String toString() {
        return "NavConnectConsentDialogUiState(isInitial=" + this.f43392a + ", thirdPartyAppName=" + this.f43393b + ", isvBusinessName=" + this.f43394c + ", onAllowAction=" + this.f43395d + ", onDisallowAction=" + this.f43396e + ", onPrivacyClick=" + this.f43397f + ", onIsvPrivacyClick=" + this.f43398g + ", onLearnMoreClick=" + this.f43399h + ")";
    }
}
