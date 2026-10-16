package e.a.f.a.a;

import java.io.IOException;
import java.util.logging.Level;
import k.am;
import k.ao;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i implements am {

    /* renamed from: a, reason: collision with root package name */
    int f47514a;

    /* renamed from: b, reason: collision with root package name */
    byte f47515b;

    /* renamed from: c, reason: collision with root package name */
    int f47516c;

    /* renamed from: d, reason: collision with root package name */
    int f47517d;

    /* renamed from: e, reason: collision with root package name */
    short f47518e;

    /* renamed from: f, reason: collision with root package name */
    private final k.j f47519f;

    public i(k.j jVar) {
        this.f47519f = jVar;
    }

    @Override // k.am
    public final long a(k.h hVar, long j2) throws IOException {
        int i2;
        int iE;
        do {
            int i3 = this.f47517d;
            k.j jVar = this.f47519f;
            if (i3 == 0) {
                jVar.Q(this.f47518e);
                this.f47518e = (short) 0;
                if ((this.f47515b & 4) == 0) {
                    i2 = this.f47516c;
                    int iB = m.b(jVar);
                    this.f47517d = iB;
                    this.f47514a = iB;
                    int iC = jVar.c() & 255;
                    this.f47515b = (byte) (jVar.c() & 255);
                    byte b2 = (byte) iC;
                    if (m.f47531a.isLoggable(Level.FINE)) {
                        m.f47531a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", j.a(true, this.f47516c, this.f47514a, b2, this.f47515b));
                    }
                    iE = jVar.e() & Integer.MAX_VALUE;
                    this.f47516c = iE;
                    if (b2 != 9) {
                        throw m.i("%s != TYPE_CONTINUATION", Byte.valueOf(b2));
                    }
                }
            } else {
                long jA = jVar.a(hVar, Math.min(j2, i3));
                if (jA != -1) {
                    this.f47517d -= (int) jA;
                    return jA;
                }
            }
            return -1L;
        } while (iE == i2);
        throw m.i("TYPE_CONTINUATION streamId changed", new Object[0]);
    }

    @Override // k.am, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // k.am
    public final ao h() {
        return this.f47519f.h();
    }
}
