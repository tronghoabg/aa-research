package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class ajnk implements ajoc {
    private byte a;
    private final ajnw b;
    private final Inflater c;
    private final ajnl d;
    private final CRC32 e;

    public ajnk(ajoc ajocVar) {
        ajnw ajnwVar = new ajnw(ajocVar);
        this.b = ajnwVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new ajnl(ajnwVar, inflater);
        this.e = new CRC32();
    }

    private final void c(ajmy ajmyVar, long j, long j2) {
        ajnx ajnxVar = ajmyVar.a;
        ajnxVar.getClass();
        while (true) {
            long j3 = ajnxVar.c - ajnxVar.b;
            if (j < j3) {
                break;
            }
            ajnxVar = ajnxVar.f;
            ajnxVar.getClass();
            j -= j3;
        }
        while (j2 > 0) {
            int i = (int) (ajnxVar.b + j);
            int iMin = (int) Math.min(ajnxVar.c - i, j2);
            this.e.update(ajnxVar.a, i, iMin);
            ajnxVar = ajnxVar.f;
            ajnxVar.getClass();
            j2 -= iMin;
            j = 0;
        }
    }

    private static final void d(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + afyh.G(ahfd.f(i2), 8) + " != expected 0x" + afyh.G(ahfd.f(i), 8));
    }

    @Override // defpackage.ajoc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // defpackage.ajoc
    public final long hU(ajmy ajmyVar, long j) throws DataFormatException, IOException {
        long j2;
        long j3;
        ajnk ajnkVar = this;
        byte b = ajnkVar.a;
        if (b == 0) {
            ajnw ajnwVar = ajnkVar.b;
            ajnwVar.z(10L);
            ajmy ajmyVar2 = ajnwVar.b;
            byte bC = ajmyVar2.c(3L);
            int i = (bC >> 1) & 1;
            if (i != 0) {
                ajnkVar.c(ajmyVar2, 0L, 10L);
            }
            d("ID1ID2", 8075, ajnwVar.w());
            ajnwVar.A(8L);
            if (((bC >> 2) & 1) == 1) {
                ajnwVar.z(2L);
                if (i != 0) {
                    c(ajmyVar2, 0L, 2L);
                }
                short sW = ajmyVar2.w();
                long j4 = (char) ((short) (((sW & 255) << 8) | ((sW >>> 8) & 255)));
                ajnwVar.z(j4);
                if (i != 0) {
                    c(ajmyVar2, 0L, j4);
                }
                ajnwVar.A(j4);
            }
            if (((bC >> 3) & 1) == 1) {
                long jC = ajnwVar.c((byte) 0, Long.MAX_VALUE);
                if (jC == -1) {
                    throw new EOFException();
                }
                long j5 = jC + 1;
                if (i != 0) {
                    j2 = -1;
                    j3 = Long.MAX_VALUE;
                    c(ajmyVar2, 0L, j5);
                } else {
                    j2 = -1;
                    j3 = Long.MAX_VALUE;
                }
                ajnwVar.A(j5);
            } else {
                j2 = -1;
                j3 = Long.MAX_VALUE;
            }
            if (((bC >> 4) & 1) == 1) {
                long jC2 = ajnwVar.c((byte) 0, j3);
                if (jC2 == j2) {
                    throw new EOFException();
                }
                long j6 = jC2 + 1;
                if (i != 0) {
                    ajnkVar = this;
                    ajnkVar.c(ajmyVar2, 0L, j6);
                } else {
                    ajnkVar = this;
                }
                ajnwVar.A(j6);
            } else {
                ajnkVar = this;
            }
            if (i != 0) {
                short sX = ajnwVar.x();
                CRC32 crc32 = ajnkVar.e;
                d("FHCRC", sX, (short) crc32.getValue());
                crc32.reset();
            }
            ajnkVar.a = (byte) 1;
            b = 1;
        } else {
            j2 = -1;
        }
        if (b != 1) {
            if (b == 2) {
            }
            return j2;
        }
        long j7 = ajmyVar.b;
        long jHU = ajnkVar.d.hU(ajmyVar, 8192L);
        if (jHU != j2) {
            ajnkVar.c(ajmyVar, j7, jHU);
            return jHU;
        }
        ajnkVar.a = (byte) 2;
        ajnw ajnwVar2 = ajnkVar.b;
        d("CRC", ajnwVar2.g(), (int) ajnkVar.e.getValue());
        d("ISIZE", ajnwVar2.g(), (int) ajnkVar.c.getBytesWritten());
        ajnkVar.a = (byte) 3;
        if (!ajnwVar2.B()) {
            throw new IOException("gzip finished without exhausting source");
        }
        return j2;
    }

    @Override // defpackage.ajoc
    public final ajoe hV() {
        return this.b.hV();
    }
}
