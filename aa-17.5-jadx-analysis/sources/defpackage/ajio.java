package defpackage;

/* loaded from: classes3.dex */
public final class ajio extends ajih implements ajoc {
    private final ajhz a;
    private final long b;

    public ajio(ajhz ajhzVar, long j) {
        this.a = ajhzVar;
        this.b = j;
    }

    @Override // defpackage.ajih
    public final long a() {
        return this.b;
    }

    @Override // defpackage.ajih
    public final ajhz b() {
        return this.a;
    }

    @Override // defpackage.ajih
    public final ajna c() {
        return ahfm.b(this);
    }

    @Override // defpackage.ajoc
    public final long hU(ajmy ajmyVar, long j) {
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.ajoc
    public final ajoe hV() {
        return ajoe.k;
    }

    @Override // defpackage.ajih, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
