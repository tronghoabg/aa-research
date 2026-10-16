package cg;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: cg.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1614c implements F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19888a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19889b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19890c;

    public /* synthetic */ C1614c(int i5, Object obj, Object obj2) {
        this.f19888a = i5;
        this.f19889b = obj;
        this.f19890c = obj2;
    }

    @Override // cg.F
    public final void E(C1618g source, long j8) {
        switch (this.f19888a) {
            case 0:
                AbstractC3340k.e(source, "source");
                AbstractC1613b.f(source.f19902b, 0L, j8);
                long j10 = j8;
                while (true) {
                    long j11 = 0;
                    if (j10 <= 0) {
                        return;
                    }
                    C1611C c1611c = source.f19901a;
                    AbstractC3340k.b(c1611c);
                    while (true) {
                        if (j11 < 65536) {
                            j11 += c1611c.f19868c - c1611c.f19867b;
                            if (j11 >= j10) {
                                j11 = j10;
                            } else {
                                c1611c = c1611c.f19871f;
                                AbstractC3340k.b(c1611c);
                            }
                        }
                    }
                    C1614c c1614c = (C1614c) this.f19890c;
                    G g9 = (G) this.f19889b;
                    g9.h();
                    try {
                        try {
                            c1614c.E(source, j11);
                            if (g9.i()) {
                                throw g9.k(null);
                            }
                            j10 -= j11;
                        } catch (IOException e7) {
                            if (!g9.i()) {
                                throw e7;
                            }
                            throw g9.k(e7);
                        }
                    } catch (Throwable th) {
                        g9.i();
                        throw th;
                    }
                }
            default:
                AbstractC3340k.e(source, "source");
                AbstractC1613b.f(source.f19902b, 0L, j8);
                while (j8 > 0) {
                    ((J) this.f19890c).f();
                    C1611C c1611c2 = source.f19901a;
                    AbstractC3340k.b(c1611c2);
                    int iMin = (int) Math.min(j8, c1611c2.f19868c - c1611c2.f19867b);
                    ((OutputStream) this.f19889b).write(c1611c2.f19866a, c1611c2.f19867b, iMin);
                    int i5 = c1611c2.f19867b + iMin;
                    c1611c2.f19867b = i5;
                    long j12 = iMin;
                    j8 -= j12;
                    source.f19902b -= j12;
                    if (i5 == c1611c2.f19868c) {
                        source.f19901a = c1611c2.a();
                        D.a(c1611c2);
                    }
                }
                return;
        }
    }

    @Override // cg.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f19888a) {
            case 0:
                C1614c c1614c = (C1614c) this.f19890c;
                G g9 = (G) this.f19889b;
                g9.h();
                try {
                    c1614c.close();
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
                ((OutputStream) this.f19889b).close();
                return;
        }
    }

    @Override // cg.F, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f19888a) {
            case 0:
                C1614c c1614c = (C1614c) this.f19890c;
                G g9 = (G) this.f19889b;
                g9.h();
                try {
                    c1614c.flush();
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
                ((OutputStream) this.f19889b).flush();
                return;
        }
    }

    @Override // cg.F
    public final J timeout() {
        switch (this.f19888a) {
            case 0:
                return (G) this.f19889b;
            default:
                return (J) this.f19890c;
        }
    }

    public final String toString() {
        switch (this.f19888a) {
            case 0:
                return "AsyncTimeout.sink(" + ((C1614c) this.f19890c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f19889b) + ')';
        }
    }
}
