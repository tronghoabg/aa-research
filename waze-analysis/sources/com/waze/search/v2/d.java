package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f36329a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36330b;

    public d(boolean z, String str) {
        h.g.b.x.f(str, "urlToOpen");
        this.f36329a = z;
        this.f36330b = str;
    }

    public final String a() {
        return this.f36330b;
    }

    public final boolean b() {
        return this.f36329a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f36329a == dVar.f36329a && h.g.b.x.n(this.f36330b, dVar.f36330b);
    }

    public final int hashCode() {
        return (a.a.a(this.f36329a) * 31) + this.f36330b.hashCode();
    }

    public final String toString() {
        return "LegalPopupData(show=" + this.f36329a + ", urlToOpen=" + this.f36330b + ")";
    }
}
