package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dl {

    /* renamed from: a, reason: collision with root package name */
    private final int f30087a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30088b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30089c;

    /* renamed from: d, reason: collision with root package name */
    private final ar f30090d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f30091e;

    public dl(int i2, int i3, int i4, ar arVar, boolean z) {
        h.g.b.x.f(arVar, "route");
        this.f30087a = i2;
        this.f30088b = i3;
        this.f30089c = i4;
        this.f30090d = arVar;
        this.f30091e = z;
    }

    public final ar a() {
        return this.f30090d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl)) {
            return false;
        }
        dl dlVar = (dl) obj;
        return this.f30087a == dlVar.f30087a && this.f30088b == dlVar.f30088b && this.f30089c == dlVar.f30089c && h.g.b.x.n(this.f30090d, dlVar.f30090d) && this.f30091e == dlVar.f30091e;
    }

    public final int hashCode() {
        return (((((((this.f30087a * 31) + this.f30088b) * 31) + this.f30089c) * 31) + this.f30090d.hashCode()) * 31) + a.a.a(this.f30091e);
    }

    public final String toString() {
        return "SuggestReroute(id=" + this.f30087a + ", secondsBefore=" + this.f30088b + ", secondsAfter=" + this.f30089c + ", route=" + this.f30090d + ", isSilent=" + this.f30091e + ")";
    }
}
