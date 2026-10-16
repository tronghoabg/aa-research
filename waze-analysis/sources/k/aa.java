package k;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class aa implements al {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f50786a;

    /* renamed from: b, reason: collision with root package name */
    private final ao f50787b;

    public aa(OutputStream outputStream, ao aoVar) {
        h.g.b.x.f(outputStream, "out");
        h.g.b.x.f(aoVar, "timeout");
        this.f50786a = outputStream;
        this.f50787b = aoVar;
    }

    @Override // k.al, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f50786a.close();
    }

    @Override // k.al, java.io.Flushable
    public final void flush() throws IOException {
        this.f50786a.flush();
    }

    @Override // k.al
    public final ao h() {
        return this.f50787b;
    }

    @Override // k.al
    public final void l(h hVar, long j2) throws IOException {
        h.g.b.x.f(hVar, "source");
        okhttp3.internal.publicsuffix.a.g(hVar.q(), 0L, j2);
        while (j2 > 0) {
            this.f50787b.u();
            ai aiVar = hVar.f50841a;
            h.g.b.x.c(aiVar);
            int iMin = (int) Math.min(j2, aiVar.f50808c - aiVar.f50807b);
            this.f50786a.write(aiVar.f50806a, aiVar.f50807b, iMin);
            aiVar.f50807b += iMin;
            long j3 = iMin;
            hVar.P(hVar.q() - j3);
            j2 -= j3;
            if (aiVar.f50807b == aiVar.f50808c) {
                hVar.f50841a = aiVar.a();
                aj.b(aiVar);
            }
        }
    }

    public final String toString() {
        return "sink(" + this.f50786a + ")";
    }
}
