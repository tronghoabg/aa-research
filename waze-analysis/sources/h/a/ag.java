package h.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f47970a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f47971b;

    public ag(int i2, Object obj) {
        this.f47970a = i2;
        this.f47971b = obj;
    }

    public final int a() {
        return this.f47970a;
    }

    public final int b() {
        return this.f47970a;
    }

    public final Object c() {
        return this.f47971b;
    }

    public final Object d() {
        return this.f47971b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return this.f47970a == agVar.f47970a && h.g.b.x.n(this.f47971b, agVar.f47971b);
    }

    public final int hashCode() {
        Object obj = this.f47971b;
        return (this.f47970a * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f47970a + ", value=" + this.f47971b + ")";
    }
}
