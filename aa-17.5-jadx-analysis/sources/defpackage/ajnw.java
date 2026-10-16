package defpackage;

import com.google.android.libraries.handwriting.gui.UIHandler;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class ajnw implements ajna {
    public final ajoc a;
    public final ajmy b = new ajmy();
    public boolean c;

    public ajnw(ajoc ajocVar) {
        this.a = ajocVar;
    }

    @Override // defpackage.ajna
    public final void A(long j) throws EOFException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            ajmy ajmyVar = this.b;
            if (ajmyVar.b == 0 && this.a.hU(ajmyVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, ajmyVar.b);
            ajmyVar.A(jMin);
            j -= jMin;
        }
    }

    @Override // defpackage.ajna
    public final boolean B() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        ajmy ajmyVar = this.b;
        return ajmyVar.B() && this.a.hU(ajmyVar, 8192L) == -1;
    }

    @Override // defpackage.ajna
    public final boolean C(long j) {
        ajmy ajmyVar;
        if (j < 0) {
            throw new IllegalArgumentException(a.bN(j, "byteCount < 0: "));
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        do {
            ajmyVar = this.b;
            if (ajmyVar.b >= j) {
                return true;
            }
        } while (this.a.hU(ajmyVar, 8192L) != -1);
        return false;
    }

    @Override // defpackage.ajna
    public final long G(ajnb ajnbVar) {
        ajnbVar.getClass();
        return ahfp.a(this, ajnbVar, ajnbVar.c(), 1024L);
    }

    @Override // defpackage.ajna
    public final boolean H(ajnb ajnbVar) {
        ajnbVar.getClass();
        int iC = ajnbVar.c();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (iC > ajnbVar.c()) {
            return false;
        }
        return iC == 0 || ahfp.a(this, ajnbVar, iC, 1L) != -1;
    }

    @Override // defpackage.ajna
    public final void J(ajoa ajoaVar) throws IOException {
        ajmy ajmyVar;
        while (true) {
            ajoc ajocVar = this.a;
            ajmyVar = this.b;
            if (ajocVar.hU(ajmyVar, 8192L) == -1) {
                break;
            }
            long jH = ajmyVar.h();
            if (jH > 0) {
                ajoaVar.a(ajmyVar, jH);
            }
        }
        long j = ajmyVar.b;
        if (j > 0) {
            ajoaVar.a(ajmyVar, j);
        }
    }

    public final long c(byte b, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (jMax < j) {
            ajmy ajmyVar = this.b;
            byte b2 = b;
            long j2 = j;
            long jI = ajmyVar.i(b2, jMax, j2);
            if (jI != -1) {
                return jI;
            }
            long j3 = ajmyVar.b;
            if (j3 >= j2 || this.a.hU(ajmyVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j3);
            b = b2;
            j = j2;
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.ajoc
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.y();
    }

    @Override // defpackage.ajna
    public final byte d() throws EOFException {
        z(1L);
        return this.b.d();
    }

    @Override // defpackage.ajna
    public final int f() throws EOFException {
        z(4L);
        return this.b.f();
    }

    @Override // defpackage.ajna
    public final int g() throws EOFException {
        z(4L);
        int iF = this.b.f();
        int i = iF >>> 24;
        int i2 = 16711680 & iF;
        int i3 = 65280 & iF;
        return ((iF & 255) << 24) | i | (i2 >>> 8) | (i3 << 8);
    }

    @Override // defpackage.ajoc
    public final long hU(ajmy ajmyVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(a.bN(j, "byteCount < 0: "));
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        ajmy ajmyVar2 = this.b;
        if (ajmyVar2.b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.a.hU(ajmyVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return ajmyVar2.hU(ajmyVar, Math.min(j, ajmyVar2.b));
    }

    @Override // defpackage.ajoc
    public final ajoe hV() {
        return this.a.hV();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.ajna
    public final long k() throws EOFException {
        char c;
        char c2;
        char c3;
        char c4;
        long j;
        long jF;
        z(8L);
        ajmy ajmyVar = this.b;
        long j2 = ajmyVar.b;
        if (j2 < 8) {
            throw new EOFException();
        }
        ajnx ajnxVar = ajmyVar.a;
        ajnxVar.getClass();
        int i = ajnxVar.b;
        int i2 = ajnxVar.c;
        if (i2 - i < 8) {
            jF = ((ajmyVar.f() & 4294967295L) << 32) | (ajmyVar.f() & 4294967295L);
            c3 = '8';
            j = 255;
            c = 24;
            c2 = '(';
            c4 = '\b';
        } else {
            byte[] bArr = ajnxVar.a;
            long j3 = (bArr[i] & 255) << 56;
            long j4 = bArr[i + 1] & 255;
            c = 24;
            c2 = '(';
            long j5 = (bArr[i + 2] & 255) << 40;
            c3 = '8';
            c4 = '\b';
            long j6 = (bArr[i + 3] & 255) << 32;
            j = 255;
            long j7 = (bArr[i + 4] & 255) << 24;
            long j8 = bArr[i + 5] & 255;
            long j9 = (bArr[i + 6] & 255) << 8;
            ajmyVar.b = j2 - 8;
            jF = j3 | (j4 << 48) | j5 | j6 | j7 | (j8 << 16) | j9 | (bArr[i + 7] & 255);
            int i3 = i + 8;
            if (i3 == i2) {
                ajmyVar.a = ajnxVar.a();
                ajny.b(ajnxVar);
            } else {
                ajnxVar.b = i3;
            }
        }
        return ((jF & (-72057594037927936L)) >>> c3) | ((71776119061217280L & jF) >>> c2) | ((280375465082880L & jF) >>> c) | ((1095216660480L & jF) >>> c4) | ((4278190080L & jF) << c4) | ((16711680 & jF) << c) | ((65280 & jF) << c2) | ((jF & j) << c3);
    }

    @Override // defpackage.ajna
    public final InputStream l() {
        return new ajnv(this);
    }

    @Override // defpackage.ajna
    public final String o(long j) throws EOFException {
        z(j);
        return this.b.o(j);
    }

    @Override // defpackage.ajna
    public final String p(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(a.bN(j, "limit < 0: "));
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jC = c((byte) 10, j2);
        if (jC != -1) {
            return ajog.a(this.b, jC);
        }
        if (j2 < Long.MAX_VALUE && C(j2)) {
            ajmy ajmyVar = this.b;
            if (ajmyVar.c((-1) + j2) == 13 && C(1 + j2) && ajmyVar.c(j2) == 10) {
                return ajog.a(ajmyVar, j2);
            }
        }
        ajmy ajmyVar2 = new ajmy();
        ajmy ajmyVar3 = this.b;
        ajmyVar3.F(ajmyVar2, 0L, Math.min(32L, ajmyVar3.b));
        throw new EOFException("\\n not found: limit=" + Math.min(ajmyVar3.b, j) + " content=" + ajmyVar2.r().g() + UIHandler.ContinuousWritingQueue.PLACEHOLDER);
    }

    @Override // defpackage.ajna
    public final ajna q() {
        return ahfm.b(new ajns(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ajmy ajmyVar = this.b;
        if (ajmyVar.b == 0 && this.a.hU(ajmyVar, 8192L) == -1) {
            return -1;
        }
        return ajmyVar.read(byteBuffer);
    }

    @Override // defpackage.ajna
    public final ajnb s(long j) throws EOFException {
        z(j);
        return this.b.s(j);
    }

    public final String toString() {
        return "buffer(" + this.a + ")";
    }

    @Override // defpackage.ajna
    public final short w() throws EOFException {
        z(2L);
        return this.b.w();
    }

    @Override // defpackage.ajna
    public final short x() throws EOFException {
        z(2L);
        short sW = this.b.w();
        int i = sW >>> 8;
        return (short) (((sW & 255) << 8) | (i & 255));
    }

    @Override // defpackage.ajna
    public final void z(long j) throws EOFException {
        if (!C(j)) {
            throw new EOFException();
        }
    }
}
