package e.a.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f46471a;

    /* renamed from: b, reason: collision with root package name */
    private final int f46472b;

    static {
        e eVar = new e();
        eVar.b();
        f46471a = eVar.a();
    }

    /* synthetic */ f(int i2) {
        this.f46472b = i2;
    }

    public final int a() {
        return this.f46472b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f46472b == ((f) obj).f46472b;
    }

    public final int hashCode() {
        return this.f46472b;
    }

    public final String toString() {
        return "BindServiceFlags{" + Integer.toHexString(this.f46472b) + "}";
    }
}
