package k;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class t implements am {

    /* renamed from: a, reason: collision with root package name */
    private byte f50868a;

    /* renamed from: b, reason: collision with root package name */
    private final ah f50869b;

    /* renamed from: c, reason: collision with root package name */
    private final Inflater f50870c;

    /* renamed from: d, reason: collision with root package name */
    private final u f50871d;

    /* renamed from: e, reason: collision with root package name */
    private final CRC32 f50872e;

    public t(am amVar) {
        h.g.b.x.f(amVar, "source");
        ah ahVar = new ah(amVar);
        this.f50869b = ahVar;
        Inflater inflater = new Inflater(true);
        this.f50870c = inflater;
        this.f50871d = new u(ahVar, inflater);
        this.f50872e = new CRC32();
    }

    private final void b(h hVar, long j2, long j3) {
        ai aiVar = hVar.f50841a;
        h.g.b.x.c(aiVar);
        while (true) {
            long j4 = aiVar.f50808c - aiVar.f50807b;
            if (j2 < j4) {
                break;
            }
            aiVar = aiVar.f50811f;
            h.g.b.x.c(aiVar);
            j2 -= j4;
        }
        while (j3 > 0) {
            int i2 = (int) (aiVar.f50807b + j2);
            int iMin = (int) Math.min(aiVar.f50808c - i2, j3);
            this.f50872e.update(aiVar.f50806a, i2, iMin);
            aiVar = aiVar.f50811f;
            h.g.b.x.c(aiVar);
            j3 -= iMin;
            j2 = 0;
        }
    }

    private static final void c(String str, int i2, int i3) throws IOException {
        if (i3 == i2) {
            return;
        }
        throw new IOException(str + ": actual 0x" + h.n.o.w(okhttp3.internal.publicsuffix.a.f(i3), 8, '0') + " != expected 0x" + h.n.o.w(okhttp3.internal.publicsuffix.a.f(i2), 8, '0'));
    }

    @Override // k.am
    public final long a(h hVar, long j2) throws DataFormatException, IOException {
        t tVar = this;
        h.g.b.x.f(hVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(o.b(j2, "byteCount < 0: "));
        }
        if (j2 == 0) {
            return 0L;
        }
        byte b2 = tVar.f50868a;
        if (b2 == 0) {
            ah ahVar = tVar.f50869b;
            ahVar.O(10L);
            h hVar2 = ahVar.f50804b;
            byte b3 = hVar2.b(3L);
            int i2 = (b3 >> 1) & 1;
            if (i2 != 0) {
                tVar.b(hVar2, 0L, 10L);
            }
            c("ID1ID2", 8075, ahVar.L());
            ahVar.Q(8L);
            if (((b3 >> 2) & 1) == 1) {
                ahVar.O(2L);
                if (i2 != 0) {
                    b(hVar2, 0L, 2L);
                }
                long jM = (char) hVar2.M();
                ahVar.O(jM);
                if (i2 != 0) {
                    b(hVar2, 0L, jM);
                }
                ahVar.Q(jM);
            }
            if (((b3 >> 3) & 1) == 1) {
                long jB = ahVar.b();
                if (jB == -1) {
                    throw new EOFException();
                }
                long j3 = jB + 1;
                if (i2 != 0) {
                    b(hVar2, 0L, j3);
                }
                ahVar.Q(j3);
            }
            if (((b3 >> 4) & 1) == 1) {
                long jB2 = ahVar.b();
                if (jB2 == -1) {
                    throw new EOFException();
                }
                long j4 = jB2 + 1;
                if (i2 != 0) {
                    tVar = this;
                    tVar.b(hVar2, 0L, j4);
                } else {
                    tVar = this;
                }
                ahVar.Q(j4);
            } else {
                tVar = this;
            }
            if (i2 != 0) {
                CRC32 crc32 = tVar.f50872e;
                c("FHCRC", ahVar.M(), (short) crc32.getValue());
                crc32.reset();
            }
            tVar.f50868a = (byte) 1;
            b2 = 1;
        }
        if (b2 != 1) {
            if (b2 == 2) {
            }
            return -1L;
        }
        long jQ = hVar.q();
        long jA = tVar.f50871d.a(hVar, j2);
        if (jA != -1) {
            tVar.b(hVar, jQ, jA);
            return jA;
        }
        tVar.f50868a = (byte) 2;
        ah ahVar2 = tVar.f50869b;
        c("CRC", ahVar2.f(), (int) tVar.f50872e.getValue());
        c("ISIZE", ahVar2.f(), (int) tVar.f50870c.getBytesWritten());
        tVar.f50868a = (byte) 3;
        if (!ahVar2.R()) {
            throw new IOException("gzip finished without exhausting source");
        }
        return -1L;
    }

    @Override // k.am, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f50871d.close();
    }

    @Override // k.am
    public final ao h() {
        return this.f50869b.h();
    }
}
