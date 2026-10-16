package com.waze.ui.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    private final String f42014a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ae.a f42015b;

    /* renamed from: c, reason: collision with root package name */
    private final String f42016c;

    public /* synthetic */ ar(String str, com.waze.ui.ae.a aVar) {
        h.g.b.x.f(str, "number");
        h.g.b.x.f(aVar, "unit");
        h.g.b.x.f("%s %s", "formatting");
        this.f42014a = str;
        this.f42015b = aVar;
        this.f42016c = "%s %s";
    }

    public final com.waze.ui.ae.a a() {
        return this.f42015b;
    }

    public final String b() {
        return this.f42016c;
    }

    public final String c() {
        return this.f42014a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        return h.g.b.x.n(this.f42014a, arVar.f42014a) && this.f42015b == arVar.f42015b && h.g.b.x.n(this.f42016c, arVar.f42016c);
    }

    public final int hashCode() {
        return (((this.f42014a.hashCode() * 31) + this.f42015b.hashCode()) * 31) + this.f42016c.hashCode();
    }

    public final String toString() {
        return "Distance(number=" + this.f42014a + ", unit=" + this.f42015b + ", formatting=" + this.f42016c + ")";
    }
}
