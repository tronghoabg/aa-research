package h;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes7.dex */
public final class y implements Comparable<y> {

    /* renamed from: a, reason: collision with root package name */
    public static final e.c.a.d f48305a = new e.c.a.d();

    /* renamed from: b, reason: collision with root package name */
    private final short f48306b;

    private /* synthetic */ y(short s) {
        this.f48306b = s;
    }

    public static String a(short s) {
        return String.valueOf((int) ((char) s));
    }

    public static final /* synthetic */ y b(short s) {
        return new y(s);
    }

    public final /* synthetic */ short c() {
        return this.f48306b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(y yVar) {
        return h.g.b.x.a((char) this.f48306b, (char) yVar.f48306b);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y) && this.f48306b == ((y) obj).f48306b;
    }

    public final int hashCode() {
        return this.f48306b;
    }

    public final String toString() {
        return a(this.f48306b);
    }
}
