package okhttp3.internal.e;

import h.g.b.x;
import java.io.IOException;
import k.h;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class f extends a {

    /* renamed from: b, reason: collision with root package name */
    private boolean f56093b;

    @Override // okhttp3.internal.e.a, k.am
    public final long a(h hVar, long j2) throws IOException {
        x.f(hVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        if (c()) {
            throw new IllegalStateException("closed");
        }
        if (this.f56093b) {
            return -1L;
        }
        long jA = super.a(hVar, j2);
        if (jA != -1) {
            return jA;
        }
        this.f56093b = true;
        b();
        return -1L;
    }

    @Override // k.am, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (c()) {
            return;
        }
        if (!this.f56093b) {
            b();
        }
        d();
    }
}
