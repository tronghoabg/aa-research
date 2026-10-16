package h.n;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f48240a;

    /* renamed from: b, reason: collision with root package name */
    private final h.k.j f48241b;

    public f(String str, h.k.j jVar) {
        x.f(str, "value");
        x.f(jVar, "range");
        this.f48240a = str;
        this.f48241b = jVar;
    }

    public final String a() {
        return this.f48240a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return x.n(this.f48240a, fVar.f48240a) && x.n(this.f48241b, fVar.f48241b);
    }

    public final int hashCode() {
        return (this.f48240a.hashCode() * 31) + this.f48241b.hashCode();
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f48240a + ", range=" + this.f48241b + ")";
    }
}
