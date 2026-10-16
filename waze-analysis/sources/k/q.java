package k;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public class q implements al {

    /* renamed from: a, reason: collision with root package name */
    private final al f50865a;

    public q(al alVar) {
        h.g.b.x.f(alVar, "delegate");
        this.f50865a = alVar;
    }

    @Override // k.al, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f50865a.close();
    }

    @Override // k.al, java.io.Flushable
    public void flush() {
        this.f50865a.flush();
    }

    @Override // k.al
    public final ao h() {
        return this.f50865a.h();
    }

    @Override // k.al
    public void l(h hVar, long j2) {
        h.g.b.x.f(hVar, "source");
        this.f50865a.l(hVar, j2);
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f50865a + ")";
    }
}
