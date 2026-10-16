package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ae extends h.c.a {

    /* renamed from: a, reason: collision with root package name */
    public static final h.c.f f51340a = new h.c.f(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f51341b;

    public ae(String str) {
        super(f51340a);
        this.f51341b = str;
    }

    public final String a() {
        return this.f51341b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ae) && h.g.b.x.n(this.f51341b, ((ae) obj).f51341b);
    }

    public final int hashCode() {
        return this.f51341b.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.f51341b + ")";
    }
}
