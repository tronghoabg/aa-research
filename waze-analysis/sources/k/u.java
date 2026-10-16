package k;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class u implements am {

    /* renamed from: a, reason: collision with root package name */
    private final j f50873a;

    /* renamed from: b, reason: collision with root package name */
    private final Inflater f50874b;

    /* renamed from: c, reason: collision with root package name */
    private int f50875c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f50876d;

    public u(j jVar, Inflater inflater) {
        h.g.b.x.f(jVar, "source");
        h.g.b.x.f(inflater, "inflater");
        this.f50873a = jVar;
        this.f50874b = inflater;
    }

    @Override // k.am
    public final long a(h hVar, long j2) throws DataFormatException, IOException {
        h.g.b.x.f(hVar, "sink");
        do {
            long jB = b(hVar, j2);
            if (jB > 0) {
                return jB;
            }
            Inflater inflater = this.f50874b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f50873a.R());
        throw new EOFException("source exhausted prematurely");
    }

    public final long b(h hVar, long j2) throws DataFormatException, IOException {
        h.g.b.x.f(hVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(o.b(j2, "byteCount < 0: "));
        }
        if (this.f50876d) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return 0L;
        }
        try {
            ai aiVarK = hVar.K(1);
            int iMin = (int) Math.min(j2, 8192 - aiVarK.f50808c);
            Inflater inflater = this.f50874b;
            if (inflater.needsInput()) {
                j jVar = this.f50873a;
                if (!jVar.R()) {
                    ai aiVar = jVar.B().f50841a;
                    h.g.b.x.c(aiVar);
                    int i2 = aiVar.f50808c;
                    int i3 = aiVar.f50807b;
                    int i4 = i2 - i3;
                    this.f50875c = i4;
                    inflater.setInput(aiVar.f50806a, i3, i4);
                }
            }
            int iInflate = inflater.inflate(aiVarK.f50806a, aiVarK.f50808c, iMin);
            int i5 = this.f50875c;
            if (i5 != 0) {
                int remaining = i5 - inflater.getRemaining();
                this.f50875c -= remaining;
                this.f50873a.Q(remaining);
            }
            if (iInflate > 0) {
                aiVarK.f50808c += iInflate;
                long j3 = iInflate;
                hVar.P(hVar.q() + j3);
                return j3;
            }
            if (aiVarK.f50807b == aiVarK.f50808c) {
                hVar.f50841a = aiVarK.a();
                aj.b(aiVarK);
            }
            return 0L;
        } catch (DataFormatException e2) {
            throw new IOException(e2);
        }
    }

    @Override // k.am, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f50876d) {
            return;
        }
        this.f50874b.end();
        this.f50876d = true;
        this.f50873a.close();
    }

    @Override // k.am
    public final ao h() {
        return this.f50873a.h();
    }
}
