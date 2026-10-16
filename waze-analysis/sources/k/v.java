package k;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class v implements am {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f50877a;

    /* renamed from: b, reason: collision with root package name */
    private final ao f50878b;

    public v(InputStream inputStream, ao aoVar) {
        h.g.b.x.f(inputStream, "input");
        h.g.b.x.f(aoVar, "timeout");
        this.f50877a = inputStream;
        this.f50878b = aoVar;
    }

    @Override // k.am
    public final long a(h hVar, long j2) throws IOException {
        h.g.b.x.f(hVar, "sink");
        if (j2 == 0) {
            return 0L;
        }
        if (j2 < 0) {
            throw new IllegalArgumentException(o.b(j2, "byteCount < 0: "));
        }
        try {
            this.f50878b.u();
            ai aiVarK = hVar.K(1);
            int i2 = this.f50877a.read(aiVarK.f50806a, aiVarK.f50808c, (int) Math.min(j2, 8192 - aiVarK.f50808c));
            if (i2 != -1) {
                aiVarK.f50808c += i2;
                long j3 = i2;
                hVar.P(hVar.q() + j3);
                return j3;
            }
            if (aiVarK.f50807b != aiVarK.f50808c) {
                return -1L;
            }
            hVar.f50841a = aiVarK.a();
            aj.b(aiVarK);
            return -1L;
        } catch (AssertionError e2) {
            if (k.a.l.b(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // k.am, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f50877a.close();
    }

    @Override // k.am
    public final ao h() {
        return this.f50878b;
    }

    public final String toString() {
        return "source(" + this.f50877a + ")";
    }
}
