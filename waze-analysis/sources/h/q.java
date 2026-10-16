package h;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes7.dex */
public final class q implements Comparable<q> {

    /* renamed from: a, reason: collision with root package name */
    public static final e.c.b f48292a = new e.c.b();

    /* renamed from: b, reason: collision with root package name */
    private final byte f48293b;

    private /* synthetic */ q(byte b2) {
        this.f48293b = b2;
    }

    public static String b(byte b2) {
        return String.valueOf(b2 & 255);
    }

    public static final /* synthetic */ q c(byte b2) {
        return new q(b2);
    }

    public final /* synthetic */ byte a() {
        return this.f48293b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(q qVar) {
        return h.g.b.x.a(this.f48293b & 255, qVar.f48293b & 255);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && this.f48293b == ((q) obj).f48293b;
    }

    public final int hashCode() {
        return this.f48293b;
    }

    public final String toString() {
        return b(this.f48293b);
    }
}
