package h.g.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class af implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Class f48100a;

    public af(Class cls) {
        x.f(cls, "jClass");
        x.f("", "moduleName");
        this.f48100a = cls;
    }

    @Override // h.g.b.l
    public final Class a() {
        return this.f48100a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof af) && x.n(this.f48100a, ((af) obj).f48100a);
    }

    public final int hashCode() {
        return this.f48100a.hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f48100a.toString()).concat(" (Kotlin reflection is not available)");
    }
}
