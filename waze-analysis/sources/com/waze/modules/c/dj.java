package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dj {

    /* renamed from: a, reason: collision with root package name */
    private final String f30077a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30078b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30079c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30080d;

    public dj(String str, String str2, String str3, String str4) {
        h.g.b.x.f(str, "popupId");
        h.g.b.x.f(str2, "popupKey");
        h.g.b.x.f(str3, "primaryActionDeeplink");
        h.g.b.x.f(str4, "secondaryActionDeeplink");
        this.f30077a = str;
        this.f30078b = str2;
        this.f30079c = str3;
        this.f30080d = str4;
    }

    public final String a() {
        return this.f30077a;
    }

    public final String b() {
        return this.f30078b;
    }

    public final String c() {
        return this.f30079c;
    }

    public final String d() {
        return this.f30080d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj)) {
            return false;
        }
        dj djVar = (dj) obj;
        return h.g.b.x.n(this.f30077a, djVar.f30077a) && h.g.b.x.n(this.f30078b, djVar.f30078b) && h.g.b.x.n(this.f30079c, djVar.f30079c) && h.g.b.x.n(this.f30080d, djVar.f30080d);
    }

    public final int hashCode() {
        return (((((this.f30077a.hashCode() * 31) + this.f30078b.hashCode()) * 31) + this.f30079c.hashCode()) * 31) + this.f30080d.hashCode();
    }

    public final String toString() {
        return "RoutingPopupActions(popupId=" + this.f30077a + ", popupKey=" + this.f30078b + ", primaryActionDeeplink=" + this.f30079c + ", secondaryActionDeeplink=" + this.f30080d + ")";
    }
}
