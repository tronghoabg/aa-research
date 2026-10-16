package k;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ah implements j {

    /* renamed from: a, reason: collision with root package name */
    public final am f50803a;

    /* renamed from: b, reason: collision with root package name */
    public final h f50804b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f50805c;

    public ah(am amVar) {
        h.g.b.x.f(amVar, "source");
        this.f50803a = amVar;
        this.f50804b = new h();
    }

    @Override // k.j
    public final h B() {
        return this.f50804b;
    }

    @Override // k.j
    public final j F() {
        return aq.f(new ac(this));
    }

    @Override // k.j
    public final k H(long j2) throws EOFException {
        O(j2);
        return this.f50804b.H(j2);
    }

    @Override // k.j
    public final short L() throws EOFException {
        O(2L);
        return this.f50804b.L();
    }

    @Override // k.j
    public final short M() throws EOFException {
        O(2L);
        return this.f50804b.M();
    }

    @Override // k.j
    public final void O(long j2) throws EOFException {
        if (!S(j2)) {
            throw new EOFException();
        }
    }

    @Override // k.j
    public final void Q(long j2) throws EOFException {
        if (this.f50805c) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            h hVar = this.f50804b;
            if (hVar.q() == 0 && this.f50803a.a(hVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j2, hVar.q());
            hVar.Q(jMin);
            j2 -= jMin;
        }
    }

    @Override // k.j
    public final boolean R() {
        if (this.f50805c) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f50804b;
        return hVar.R() && this.f50803a.a(hVar, 8192L) == -1;
    }

    @Override // k.j
    public final boolean S(long j2) {
        h hVar;
        if (j2 < 0) {
            throw new IllegalArgumentException(o.b(j2, "byteCount < 0: "));
        }
        if (this.f50805c) {
            throw new IllegalStateException("closed");
        }
        do {
            hVar = this.f50804b;
            if (hVar.q() >= j2) {
                return true;
            }
        } while (this.f50803a.a(hVar, 8192L) != -1);
        return false;
    }

    @Override // k.j
    public final byte[] T() {
        h hVar = this.f50804b;
        hVar.ac(this.f50803a);
        return hVar.T();
    }

    @Override // k.j
    public final byte[] U(long j2) throws EOFException {
        O(j2);
        return this.f50804b.U(j2);
    }

    @Override // k.am
    public final long a(h hVar, long j2) {
        h.g.b.x.f(hVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(o.b(j2, "byteCount < 0: "));
        }
        if (this.f50805c) {
            throw new IllegalStateException("closed");
        }
        h hVar2 = this.f50804b;
        if (hVar2.q() == 0) {
            if (j2 == 0) {
                return 0L;
            }
            if (this.f50803a.a(hVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return hVar2.a(hVar, Math.min(j2, hVar2.q()));
    }

    public final long b() {
        return d((byte) 0, Long.MAX_VALUE);
    }

    @Override // k.j
    public final byte c() throws EOFException {
        O(1L);
        return this.f50804b.c();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, k.am
    public final void close() {
        if (this.f50805c) {
            return;
        }
        this.f50805c = true;
        this.f50803a.close();
        this.f50804b.N();
    }

    public final long d(byte b2, long j2) {
        if (this.f50805c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (jMax < j2) {
            h hVar = this.f50804b;
            byte b3 = b2;
            long j3 = j2;
            long jK = hVar.k(b3, jMax, j3);
            if (jK != -1) {
                return jK;
            }
            long jQ = hVar.q();
            if (jQ >= j3 || this.f50803a.a(hVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, jQ);
            b2 = b3;
            j2 = j3;
        }
        return -1L;
    }

    @Override // k.j
    public final int e() throws EOFException {
        O(4L);
        return this.f50804b.e();
    }

    @Override // k.j
    public final int f() throws EOFException {
        O(4L);
        return this.f50804b.f();
    }

    @Override // k.j
    public final int g(z zVar) {
        h.g.b.x.f(zVar, "options");
        if (this.f50805c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            h hVar = this.f50804b;
            int iB = k.a.a.b(hVar, zVar, true);
            if (iB != -2) {
                if (iB != -1) {
                    hVar.Q(zVar.b()[iB].d());
                    return iB;
                }
            } else if (this.f50803a.a(hVar, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // k.am
    public final ao h() {
        return this.f50803a.h();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f50805c;
    }

    @Override // k.j
    public final long j(k kVar) {
        long j2;
        h.g.b.x.f(kVar, "bytes");
        h.g.b.x.f(kVar, "bytes");
        h.g.b.x.f(kVar, "bytes");
        int iD = kVar.d();
        h.g.b.x.f(this, "<this>");
        h.g.b.x.f(kVar, "bytes");
        long j3 = iD;
        okhttp3.internal.publicsuffix.a.g(kVar.d(), 0L, j3);
        if (this.f50805c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            h hVar = this.f50804b;
            long jE = k.a.a.e(hVar, kVar, jMax, Long.MAX_VALUE, iD);
            long j4 = -1;
            if (jE != -1) {
                return jE;
            }
            long jQ = (hVar.q() - j3) + 1;
            if (jQ >= Long.MAX_VALUE) {
                return -1L;
            }
            if (hVar.q() < Long.MAX_VALUE) {
                j2 = -1;
            } else {
                int iMax = (int) Math.max(1L, hVar.q() - 9223372036854775806L);
                int iMin = ((int) Math.min(j3, 1 + (hVar.q() - jMax))) - 1;
                if (iMax > iMin) {
                    return -1L;
                }
                while (true) {
                    j2 = j4;
                    if (hVar.X(hVar.q() - iMin, kVar, iMin)) {
                        break;
                    }
                    if (iMin == iMax) {
                        return j2;
                    }
                    iMin--;
                    j4 = j2;
                }
            }
            if (this.f50803a.a(hVar, 8192L) == j2) {
                return j2;
            }
            jMax = Math.max(jMax, jQ);
        }
    }

    @Override // k.j
    public final long m(k kVar) {
        h.g.b.x.f(kVar, "targetBytes");
        h.g.b.x.f(kVar, "targetBytes");
        if (this.f50805c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            h hVar = this.f50804b;
            long jN = hVar.n(kVar, jMax);
            if (jN != -1) {
                return jN;
            }
            am amVar = this.f50803a;
            long jQ = hVar.q();
            if (amVar.a(hVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, jQ);
        }
    }

    @Override // k.j
    public final long o() throws EOFException {
        byte b2;
        O(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!S(i3)) {
                break;
            }
            b2 = this.f50804b.b(i2);
            if ((b2 < 48 || b2 > 57) && ((b2 < 97 || b2 > 102) && (b2 < 65 || b2 > 70))) {
                break;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            h.m.k.y(16);
            String string = Integer.toString(b2, 16);
            h.g.b.x.e(string, "toString(...)");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(String.valueOf(string)));
        }
        return this.f50804b.o();
    }

    @Override // k.j
    public final long p() throws EOFException {
        O(8L);
        return this.f50804b.p();
    }

    @Override // k.j
    public final InputStream r() {
        return new ag(this);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        h.g.b.x.f(byteBuffer, "sink");
        h hVar = this.f50804b;
        if (hVar.q() == 0 && this.f50803a.a(hVar, 8192L) == -1) {
            return -1;
        }
        return hVar.read(byteBuffer);
    }

    @Override // k.j
    public final String t(Charset charset) {
        h.g.b.x.f(charset, "charset");
        h hVar = this.f50804b;
        hVar.ac(this.f50803a);
        return hVar.t(charset);
    }

    public final String toString() {
        return "buffer(" + this.f50803a + ")";
    }

    @Override // k.j
    public final String w(long j2) throws EOFException {
        O(j2);
        return this.f50804b.w(j2);
    }

    @Override // k.j
    public final String x() {
        return y(Long.MAX_VALUE);
    }

    @Override // k.j
    public final String y(long j2) throws EOFException {
        if (j2 < 0) {
            throw new IllegalArgumentException(o.b(j2, "limit < 0: "));
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long jD = d((byte) 10, j3);
        if (jD != -1) {
            return k.a.a.c(this.f50804b, jD);
        }
        if (j3 < Long.MAX_VALUE && S(j3)) {
            h hVar = this.f50804b;
            if (hVar.b((-1) + j3) == 13 && S(1 + j3) && hVar.b(j3) == 10) {
                return k.a.a.c(hVar, j3);
            }
        }
        h hVar2 = new h();
        h hVar3 = this.f50804b;
        hVar3.V(hVar2, 0L, Math.min(32L, hVar3.q()));
        throw new EOFException("\\n not found: limit=" + Math.min(hVar3.q(), j2) + " content=" + hVar2.G().h() + "…");
    }

    @Override // k.j
    public final h z() {
        return this.f50804b;
    }
}
