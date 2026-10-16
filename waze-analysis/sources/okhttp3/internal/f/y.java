package okhttp3.internal.f;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.am;
import k.ao;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class y implements am {

    /* renamed from: a, reason: collision with root package name */
    private final k.j f56241a;

    /* renamed from: b, reason: collision with root package name */
    private int f56242b;

    /* renamed from: c, reason: collision with root package name */
    private int f56243c;

    /* renamed from: d, reason: collision with root package name */
    private int f56244d;

    /* renamed from: e, reason: collision with root package name */
    private int f56245e;

    /* renamed from: f, reason: collision with root package name */
    private int f56246f;

    public y(k.j jVar) {
        h.g.b.x.f(jVar, "source");
        this.f56241a = jVar;
    }

    @Override // k.am
    public final long a(k.h hVar, long j2) throws IOException {
        int i2;
        int iE;
        h.g.b.x.f(hVar, "sink");
        do {
            int i3 = this.f56245e;
            k.j jVar = this.f56241a;
            if (i3 == 0) {
                jVar.Q(this.f56246f);
                this.f56246f = 0;
                if ((this.f56243c & 4) == 0) {
                    i2 = this.f56244d;
                    int iG = okhttp3.internal.b.g(jVar);
                    this.f56245e = iG;
                    this.f56242b = iG;
                    int iB = okhttp3.internal.b.B(jVar.c());
                    this.f56243c = okhttp3.internal.b.B(jVar.c());
                    if (z.f56247a.isLoggable(Level.FINE)) {
                        Logger logger = z.f56247a;
                        k.k kVar = g.f56178a;
                        logger.fine(g.b(true, this.f56244d, this.f56242b, iB, this.f56243c));
                    }
                    iE = jVar.e() & Integer.MAX_VALUE;
                    this.f56244d = iE;
                    if (iB != 9) {
                        throw new IOException(iB + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jA = jVar.a(hVar, Math.min(j2, i3));
                if (jA != -1) {
                    this.f56245e -= (int) jA;
                    return jA;
                }
            }
            return -1L;
        } while (iE == i2);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    public final int b() {
        return this.f56245e;
    }

    public final void c(int i2) {
        this.f56243c = i2;
    }

    public final void d(int i2) {
        this.f56245e = i2;
    }

    public final void e(int i2) {
        this.f56242b = i2;
    }

    public final void f(int i2) {
        this.f56246f = i2;
    }

    public final void g(int i2) {
        this.f56244d = i2;
    }

    @Override // k.am
    public final ao h() {
        return this.f56241a.h();
    }

    @Override // k.am, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
