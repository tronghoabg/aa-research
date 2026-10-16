package cg;

import A7.AbstractC0279p0;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class r implements H {

    /* renamed from: a, reason: collision with root package name */
    public byte f19921a;

    /* renamed from: b, reason: collision with root package name */
    public final C1610B f19922b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f19923c;

    /* renamed from: d, reason: collision with root package name */
    public final s f19924d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f19925e;

    public r(H source) {
        AbstractC3340k.e(source, "source");
        C1610B c1610b = new C1610B(source);
        this.f19922b = c1610b;
        Inflater inflater = new Inflater(true);
        this.f19923c = inflater;
        this.f19924d = new s(c1610b, inflater);
        this.f19925e = new CRC32();
    }

    public static void a(String str, int i5, int i10) throws IOException {
        if (i10 != i5) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10), Integer.valueOf(i5)}, 3)));
        }
    }

    public final void b(C1618g c1618g, long j8, long j10) {
        C1611C c1611c = c1618g.f19901a;
        AbstractC3340k.b(c1611c);
        while (true) {
            int i5 = c1611c.f19868c;
            int i10 = c1611c.f19867b;
            if (j8 < i5 - i10) {
                break;
            }
            j8 -= i5 - i10;
            c1611c = c1611c.f19871f;
            AbstractC3340k.b(c1611c);
        }
        while (j10 > 0) {
            int iMin = (int) Math.min(c1611c.f19868c - r6, j10);
            this.f19925e.update(c1611c.f19866a, (int) (c1611c.f19867b + j8), iMin);
            j10 -= iMin;
            c1611c = c1611c.f19871f;
            AbstractC3340k.b(c1611c);
            j8 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f19924d.close();
    }

    @Override // cg.H
    public final long read(C1618g sink, long j8) throws DataFormatException, IOException {
        r rVar = this;
        AbstractC3340k.e(sink, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount < 0: ").toString());
        }
        if (j8 == 0) {
            return 0L;
        }
        byte b5 = rVar.f19921a;
        CRC32 crc32 = rVar.f19925e;
        C1610B c1610b = rVar.f19922b;
        if (b5 == 0) {
            c1610b.require(10L);
            C1618g c1618g = c1610b.f19864b;
            byte bO = c1618g.o(3L);
            boolean z2 = ((bO >> 1) & 1) == 1;
            if (z2) {
                rVar.b(c1618g, 0L, 10L);
            }
            a("ID1ID2", 8075, c1610b.readShort());
            c1610b.skip(8L);
            if (((bO >> 2) & 1) == 1) {
                c1610b.require(2L);
                if (z2) {
                    b(c1618g, 0L, 2L);
                }
                long shortLe = c1618g.readShortLe() & 65535;
                c1610b.require(shortLe);
                if (z2) {
                    b(c1618g, 0L, shortLe);
                }
                c1610b.skip(shortLe);
            }
            if (((bO >> 3) & 1) == 1) {
                long jIndexOf = c1610b.indexOf((byte) 0, 0L, Long.MAX_VALUE);
                if (jIndexOf == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    b(c1618g, 0L, jIndexOf + 1);
                }
                c1610b.skip(jIndexOf + 1);
            }
            if (((bO >> 4) & 1) == 1) {
                long jIndexOf2 = c1610b.indexOf((byte) 0, 0L, Long.MAX_VALUE);
                if (jIndexOf2 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    rVar = this;
                    rVar.b(c1618g, 0L, jIndexOf2 + 1);
                } else {
                    rVar = this;
                }
                c1610b.skip(jIndexOf2 + 1);
            } else {
                rVar = this;
            }
            if (z2) {
                a("FHCRC", c1610b.readShortLe(), (short) crc32.getValue());
                crc32.reset();
            }
            rVar.f19921a = (byte) 1;
        }
        if (rVar.f19921a == 1) {
            long j10 = sink.f19902b;
            long j11 = rVar.f19924d.read(sink, j8);
            if (j11 != -1) {
                rVar.b(sink, j10, j11);
                return j11;
            }
            rVar.f19921a = (byte) 2;
        }
        if (rVar.f19921a == 2) {
            a("CRC", c1610b.readIntLe(), (int) crc32.getValue());
            a("ISIZE", c1610b.readIntLe(), (int) rVar.f19923c.getBytesWritten());
            rVar.f19921a = (byte) 3;
            if (!c1610b.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // cg.H
    public final J timeout() {
        return this.f19922b.f19863a.timeout();
    }
}
