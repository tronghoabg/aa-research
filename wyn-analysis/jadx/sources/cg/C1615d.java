package cg;

import A7.AbstractC0279p0;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: cg.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1615d implements H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19891a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19892b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19893c;

    public C1615d(InputStream input, J j8) {
        AbstractC3340k.e(input, "input");
        this.f19892b = input;
        this.f19893c = j8;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f19891a) {
            case 0:
                C1615d c1615d = (C1615d) this.f19893c;
                G g9 = (G) this.f19892b;
                g9.h();
                try {
                    c1615d.close();
                    if (g9.i()) {
                        throw g9.k(null);
                    }
                    return;
                } catch (IOException e7) {
                    if (!g9.i()) {
                        throw e7;
                    }
                    throw g9.k(e7);
                } finally {
                    g9.i();
                }
            default:
                ((InputStream) this.f19892b).close();
                return;
        }
    }

    @Override // cg.H
    public final long read(C1618g sink, long j8) {
        switch (this.f19891a) {
            case 0:
                AbstractC3340k.e(sink, "sink");
                C1615d c1615d = (C1615d) this.f19893c;
                G g9 = (G) this.f19892b;
                g9.h();
                try {
                    long j10 = c1615d.read(sink, j8);
                    if (g9.i()) {
                        throw g9.k(null);
                    }
                    return j10;
                } catch (IOException e7) {
                    if (g9.i()) {
                        throw g9.k(e7);
                    }
                    throw e7;
                } finally {
                    g9.i();
                }
            default:
                AbstractC3340k.e(sink, "sink");
                if (j8 == 0) {
                    return 0L;
                }
                if (j8 < 0) {
                    throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount < 0: ").toString());
                }
                try {
                    ((J) this.f19893c).f();
                    C1611C c1611cP = sink.P(1);
                    int i5 = ((InputStream) this.f19892b).read(c1611cP.f19866a, c1611cP.f19868c, (int) Math.min(j8, 8192 - c1611cP.f19868c));
                    if (i5 == -1) {
                        if (c1611cP.f19867b == c1611cP.f19868c) {
                            sink.f19901a = c1611cP.a();
                            D.a(c1611cP);
                        }
                        return -1L;
                    }
                    c1611cP.f19868c += i5;
                    long j11 = i5;
                    sink.f19902b += j11;
                    return j11;
                } catch (AssertionError e10) {
                    if (AbstractC1613b.g(e10)) {
                        throw new IOException(e10);
                    }
                    throw e10;
                }
        }
    }

    @Override // cg.H
    public final J timeout() {
        switch (this.f19891a) {
            case 0:
                return (G) this.f19892b;
            default:
                return (J) this.f19893c;
        }
    }

    public final String toString() {
        switch (this.f19891a) {
            case 0:
                return "AsyncTimeout.source(" + ((C1615d) this.f19893c) + ')';
            default:
                return "source(" + ((InputStream) this.f19892b) + ')';
        }
    }

    public C1615d(G g9, C1615d c1615d) {
        this.f19892b = g9;
        this.f19893c = c1615d;
    }
}
