package cg;

import A7.AbstractC0279p0;
import Cd.C0351t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: cg.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1610B implements InterfaceC1620i {

    /* renamed from: a, reason: collision with root package name */
    public final H f19863a;

    /* renamed from: b, reason: collision with root package name */
    public final C1618g f19864b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19865c;

    public C1610B(H source) {
        AbstractC3340k.e(source, "source");
        this.f19863a = source;
        this.f19864b = new C1618g();
    }

    @Override // cg.InterfaceC1620i
    public final long F(InterfaceC1619h interfaceC1619h) {
        C1618g c1618g;
        long j8 = 0;
        while (true) {
            c1618g = this.f19864b;
            if (this.f19863a.read(c1618g, 8192L) == -1) {
                break;
            }
            long jD = c1618g.d();
            if (jD > 0) {
                j8 += jD;
                interfaceC1619h.E(c1618g, jD);
            }
        }
        long j10 = c1618g.f19902b;
        if (j10 <= 0) {
            return j8;
        }
        long j11 = j8 + j10;
        interfaceC1619h.E(c1618g, j10);
        return j11;
    }

    public final C1621j a(long j8) throws EOFException {
        require(j8);
        return this.f19864b.z(j8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f19865c) {
            return;
        }
        this.f19865c = true;
        this.f19863a.close();
        this.f19864b.a();
    }

    @Override // cg.InterfaceC1620i
    public final boolean e(long j8, C1621j bytes) {
        AbstractC3340k.e(bytes, "bytes");
        byte[] bArr = bytes.f19904a;
        int length = bArr.length;
        if (this.f19865c) {
            throw new IllegalStateException("closed");
        }
        if (length >= 0 && bArr.length >= length) {
            for (int i5 = 0; i5 < length; i5++) {
                long j10 = i5;
                if (request(1 + j10) && this.f19864b.o(j10) == bArr[i5]) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean exhausted() {
        if (this.f19865c) {
            throw new IllegalStateException("closed");
        }
        C1618g c1618g = this.f19864b;
        return c1618g.exhausted() && this.f19863a.read(c1618g, 8192L) == -1;
    }

    @Override // cg.InterfaceC1620i
    public final C1618g getBuffer() {
        return this.f19864b;
    }

    public final long indexOf(byte b5, long j8, long j10) {
        if (this.f19865c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j10, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j10) {
            C1618g c1618g = this.f19864b;
            byte b10 = b5;
            long j11 = j10;
            long jIndexOf = c1618g.indexOf(b10, jMax, j11);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long j12 = c1618g.f19902b;
            if (j12 >= j11 || this.f19863a.read(c1618g, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j12);
            b5 = b10;
            j10 = j11;
        }
        return -1L;
    }

    @Override // cg.InterfaceC1620i
    public final InputStream inputStream() {
        return new C0351t(this, 3);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f19865c;
    }

    @Override // cg.InterfaceC1620i
    public final long m(C1621j targetBytes) {
        AbstractC3340k.e(targetBytes, "targetBytes");
        if (this.f19865c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            C1618g c1618g = this.f19864b;
            long jY = c1618g.y(jMax, targetBytes);
            if (jY != -1) {
                return jY;
            }
            long j8 = c1618g.f19902b;
            if (this.f19863a.read(c1618g, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j8);
        }
    }

    @Override // cg.InterfaceC1620i
    public final int r(x options) throws EOFException {
        AbstractC3340k.e(options, "options");
        if (this.f19865c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C1618g c1618g = this.f19864b;
            int iC = dg.a.c(c1618g, options, true);
            if (iC != -2) {
                if (iC != -1) {
                    c1618g.skip(options.f19935a[iC].d());
                    return iC;
                }
            } else if (this.f19863a.read(c1618g, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        AbstractC3340k.e(sink, "sink");
        C1618g c1618g = this.f19864b;
        if (c1618g.f19902b == 0 && this.f19863a.read(c1618g, 8192L) == -1) {
            return -1;
        }
        return c1618g.read(sink);
    }

    public final byte readByte() throws EOFException {
        require(1L);
        return this.f19864b.readByte();
    }

    @Override // cg.InterfaceC1620i
    public final byte[] readByteArray() {
        H h10 = this.f19863a;
        C1618g c1618g = this.f19864b;
        c1618g.q(h10);
        return c1618g.readByteArray(c1618g.f19902b);
    }

    @Override // cg.InterfaceC1620i
    public final C1621j readByteString() {
        H h10 = this.f19863a;
        C1618g c1618g = this.f19864b;
        c1618g.q(h10);
        return c1618g.z(c1618g.f19902b);
    }

    public final int readInt() throws EOFException {
        require(4L);
        return this.f19864b.readInt();
    }

    public final int readIntLe() throws EOFException {
        require(4L);
        return AbstractC1613b.i(this.f19864b.readInt());
    }

    public final long readLongLe() throws EOFException {
        long j8;
        require(8L);
        C1618g c1618g = this.f19864b;
        if (c1618g.f19902b < 8) {
            throw new EOFException();
        }
        C1611C c1611c = c1618g.f19901a;
        AbstractC3340k.b(c1611c);
        int i5 = c1611c.f19867b;
        int i10 = c1611c.f19868c;
        if (i10 - i5 < 8) {
            j8 = ((c1618g.readInt() & 4294967295L) << 32) | (4294967295L & c1618g.readInt());
        } else {
            byte[] bArr = c1611c.f19866a;
            int i11 = i5 + 7;
            long j10 = ((bArr[i5 + 1] & 255) << 48) | ((bArr[i5] & 255) << 56) | ((bArr[i5 + 2] & 255) << 40) | ((bArr[i5 + 3] & 255) << 32) | ((bArr[i5 + 4] & 255) << 24) | ((bArr[i5 + 5] & 255) << 16) | ((bArr[i5 + 6] & 255) << 8);
            int i12 = i5 + 8;
            long j11 = j10 | (bArr[i11] & 255);
            c1618g.f19902b -= 8;
            if (i12 == i10) {
                c1618g.f19901a = c1611c.a();
                D.a(c1611c);
            } else {
                c1611c.f19867b = i12;
            }
            j8 = j11;
        }
        return ((j8 & 255) << 56) | (((-72057594037927936L) & j8) >>> 56) | ((71776119061217280L & j8) >>> 40) | ((280375465082880L & j8) >>> 24) | ((1095216660480L & j8) >>> 8) | ((4278190080L & j8) << 8) | ((16711680 & j8) << 24) | ((65280 & j8) << 40);
    }

    public final short readShort() throws EOFException {
        require(2L);
        return this.f19864b.readShort();
    }

    public final short readShortLe() throws EOFException {
        require(2L);
        return this.f19864b.readShortLe();
    }

    @Override // cg.InterfaceC1620i
    public final String readString(Charset charset) {
        C1618g c1618g = this.f19864b;
        c1618g.q(this.f19863a);
        return c1618g.readString(c1618g.f19902b, charset);
    }

    public final String readUtf8(long j8) throws EOFException {
        require(j8);
        C1618g c1618g = this.f19864b;
        c1618g.getClass();
        return c1618g.readString(j8, Bf.a.f1670a);
    }

    public final String readUtf8LineStrict(long j8) throws EOFException {
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "limit < 0: ").toString());
        }
        long j10 = j8 == Long.MAX_VALUE ? Long.MAX_VALUE : j8 + 1;
        long jIndexOf = indexOf((byte) 10, 0L, j10);
        C1618g c1618g = this.f19864b;
        if (jIndexOf != -1) {
            return dg.a.b(c1618g, jIndexOf);
        }
        if (j10 < Long.MAX_VALUE && request(j10) && c1618g.o(j10 - 1) == 13 && request(j10 + 1) && c1618g.o(j10) == 10) {
            return dg.a.b(c1618g, j10);
        }
        C1618g c1618g2 = new C1618g();
        c1618g.h(c1618g2, 0L, Math.min(32, c1618g.f19902b));
        throw new EOFException("\\n not found: limit=" + Math.min(c1618g.f19902b, j8) + " content=" + c1618g2.z(c1618g2.f19902b).e() + (char) 8230);
    }

    @Override // cg.InterfaceC1620i
    public final boolean request(long j8) {
        C1618g c1618g;
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount < 0: ").toString());
        }
        if (this.f19865c) {
            throw new IllegalStateException("closed");
        }
        do {
            c1618g = this.f19864b;
            if (c1618g.f19902b >= j8) {
                return true;
            }
        } while (this.f19863a.read(c1618g, 8192L) != -1);
        return false;
    }

    public final void require(long j8) throws EOFException {
        if (!request(j8)) {
            throw new EOFException();
        }
    }

    @Override // cg.InterfaceC1620i
    public final long s(C1621j bytes) {
        AbstractC3340k.e(bytes, "bytes");
        if (this.f19865c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            C1618g c1618g = this.f19864b;
            long jW = c1618g.w(jMax, bytes);
            if (jW != -1) {
                return jW;
            }
            long j8 = c1618g.f19902b;
            if (this.f19863a.read(c1618g, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, (j8 - bytes.f19904a.length) + 1);
        }
    }

    @Override // cg.InterfaceC1620i
    public final void skip(long j8) throws EOFException {
        if (this.f19865c) {
            throw new IllegalStateException("closed");
        }
        while (j8 > 0) {
            C1618g c1618g = this.f19864b;
            if (c1618g.f19902b == 0 && this.f19863a.read(c1618g, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j8, c1618g.f19902b);
            c1618g.skip(jMin);
            j8 -= jMin;
        }
    }

    @Override // cg.H
    public final J timeout() {
        return this.f19863a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f19863a + ')';
    }

    @Override // cg.H
    public final long read(C1618g sink, long j8) {
        AbstractC3340k.e(sink, "sink");
        if (j8 >= 0) {
            if (!this.f19865c) {
                C1618g c1618g = this.f19864b;
                if (c1618g.f19902b == 0 && this.f19863a.read(c1618g, 8192L) == -1) {
                    return -1L;
                }
                return c1618g.read(sink, Math.min(j8, c1618g.f19902b));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount < 0: ").toString());
    }
}
