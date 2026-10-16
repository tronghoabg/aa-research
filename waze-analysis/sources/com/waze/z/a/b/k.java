package com.waze.z.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final int f45748a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f45749b;

    public k(int i2, h.g.a.a aVar) {
        h.g.b.x.f(aVar, "onClick");
        this.f45748a = i2;
        this.f45749b = aVar;
    }

    public final int a() {
        return this.f45748a;
    }

    public final h.g.a.a b() {
        return this.f45749b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f45748a == kVar.f45748a && h.g.b.x.n(this.f45749b, kVar.f45749b);
    }

    public final int hashCode() {
        return (this.f45748a * 31) + this.f45749b.hashCode();
    }

    public final String toString() {
        return "Action(iconRes=" + this.f45748a + ", onClick=" + this.f45749b + ")";
    }
}
