package com.waze.r;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f33485a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f33486b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f33487c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f33488d;

    /* renamed from: e, reason: collision with root package name */
    private final String f33489e;

    /* renamed from: f, reason: collision with root package name */
    private final String f33490f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f33491g;

    /* renamed from: h, reason: collision with root package name */
    private final String f33492h;

    /* renamed from: i, reason: collision with root package name */
    private final String f33493i;

    /* renamed from: j, reason: collision with root package name */
    private final String f33494j;

    /* renamed from: k, reason: collision with root package name */
    private final String f33495k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.design_components.button.g f33496l;

    public b(String str, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, com.waze.design_components.button.g gVar) {
        x.f(str, "consentContent");
        x.f(aVar, "onAccept");
        x.f(aVar2, "onDecline");
        x.f(aVar3, "onUrlClick");
        x.f(str2, "consentButtonText");
        x.f(str3, "cancelButtonText");
        x.f(str4, "cancellationPopupTitle");
        x.f(str5, "cancellationPopupBody");
        x.f(str6, "cancellationPopupOkButtonText");
        x.f(str7, "cancellationPopupCancelButtonText");
        x.f(gVar, "consentButtonType");
        this.f33485a = str;
        this.f33486b = aVar;
        this.f33487c = aVar2;
        this.f33488d = aVar3;
        this.f33489e = str2;
        this.f33490f = str3;
        this.f33491g = z;
        this.f33492h = str4;
        this.f33493i = str5;
        this.f33494j = str6;
        this.f33495k = str7;
        this.f33496l = gVar;
    }

    public final com.waze.design_components.button.g a() {
        return this.f33496l;
    }

    public final String b() {
        return this.f33490f;
    }

    public final String c() {
        return this.f33493i;
    }

    public final String d() {
        return this.f33495k;
    }

    public final String e() {
        return this.f33494j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.n(this.f33485a, bVar.f33485a) && x.n(this.f33486b, bVar.f33486b) && x.n(this.f33487c, bVar.f33487c) && x.n(this.f33488d, bVar.f33488d) && x.n(this.f33489e, bVar.f33489e) && x.n(this.f33490f, bVar.f33490f) && this.f33491g == bVar.f33491g && x.n(this.f33492h, bVar.f33492h) && x.n(this.f33493i, bVar.f33493i) && x.n(this.f33494j, bVar.f33494j) && x.n(this.f33495k, bVar.f33495k) && this.f33496l == bVar.f33496l;
    }

    public final String f() {
        return this.f33492h;
    }

    public final String g() {
        return this.f33489e;
    }

    public final String h() {
        return this.f33485a;
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.f33485a.hashCode() * 31) + this.f33486b.hashCode()) * 31) + this.f33487c.hashCode()) * 31) + this.f33488d.hashCode()) * 31) + this.f33489e.hashCode()) * 31) + this.f33490f.hashCode()) * 31) + a.a.a(this.f33491g)) * 31) + this.f33492h.hashCode()) * 31) + this.f33493i.hashCode()) * 31) + this.f33494j.hashCode()) * 31) + this.f33495k.hashCode()) * 31) + this.f33496l.hashCode();
    }

    public final h.g.a.a i() {
        return this.f33486b;
    }

    public final h.g.a.a j() {
        return this.f33487c;
    }

    public final h.g.a.a k() {
        return this.f33488d;
    }

    public final boolean l() {
        return this.f33491g;
    }

    public final String toString() {
        return "UidConsentData(consentContent=" + this.f33485a + ", onAccept=" + this.f33486b + ", onDecline=" + this.f33487c + ", onUrlClick=" + this.f33488d + ", consentButtonText=" + this.f33489e + ", cancelButtonText=" + this.f33490f + ", isGdpr=" + this.f33491g + ", cancellationPopupTitle=" + this.f33492h + ", cancellationPopupBody=" + this.f33493i + ", cancellationPopupOkButtonText=" + this.f33494j + ", cancellationPopupCancelButtonText=" + this.f33495k + ", consentButtonType=" + this.f33496l + ")";
    }
}
