package k;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public class r implements am {

    /* renamed from: a, reason: collision with root package name */
    private final am f50866a;

    public r(am amVar) {
        h.g.b.x.f(amVar, "delegate");
        this.f50866a = amVar;
    }

    @Override // k.am
    public long a(h hVar, long j2) {
        h.g.b.x.f(hVar, "sink");
        return this.f50866a.a(hVar, j2);
    }

    public final am c() {
        return this.f50866a;
    }

    @Override // k.am, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f50866a.close();
    }

    @Override // k.am
    public final ao h() {
        return this.f50866a.h();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f50866a + ")";
    }
}
