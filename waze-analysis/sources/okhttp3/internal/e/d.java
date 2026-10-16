package okhttp3.internal.e;

import h.g.b.x;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import k.h;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class d extends a {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f56088b;

    /* renamed from: c, reason: collision with root package name */
    private long f56089c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, long j2) {
        super(gVar);
        this.f56088b = gVar;
        this.f56089c = j2;
        if (j2 == 0) {
            b();
        }
    }

    @Override // okhttp3.internal.e.a, k.am
    public final long a(h hVar, long j2) throws IOException {
        x.f(hVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        if (c()) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f56089c;
        if (j3 == 0) {
            return -1L;
        }
        long jA = super.a(hVar, Math.min(j3, j2));
        if (jA == -1) {
            this.f56088b.c().l();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
        long j4 = this.f56089c - jA;
        this.f56089c = j4;
        if (j4 == 0) {
            b();
        }
        return jA;
    }

    @Override // k.am, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (c()) {
            return;
        }
        if (this.f56089c != 0 && !okhttp3.internal.b.F(this, TimeUnit.MILLISECONDS)) {
            this.f56088b.c().l();
            b();
        }
        d();
    }
}
