package com.google.y.a.a.b;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f13426a;

    /* renamed from: b, reason: collision with root package name */
    private a f13427b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f13428c = new byte[8];

    /* renamed from: d, reason: collision with root package name */
    private final c f13429d = c.a();

    public b(InputStream inputStream) {
        this.f13426a = inputStream;
    }

    private final long h() throws IOException {
        byte bA = this.f13427b.a();
        a aVar = this.f13427b;
        if (bA < 24) {
            long jA = aVar.a();
            k();
            return jA;
        }
        if (aVar.a() == 24) {
            int i2 = this.f13426a.read();
            if (i2 == -1) {
                throw new EOFException();
            }
            k();
            return i2 & 255;
        }
        if (this.f13427b.a() == 25) {
            m(2);
            byte[] bArr = this.f13428c;
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        if (this.f13427b.a() == 26) {
            m(4);
            byte[] bArr2 = this.f13428c;
            return ((bArr2[0] & 255) << 24) | ((bArr2[1] & 255) << 16) | ((bArr2[2] & 255) << 8) | (bArr2[3] & 255);
        }
        if (this.f13427b.a() != 27) {
            throw new IOException(String.format("invalid additional information %s for major type %s", Byte.valueOf(this.f13427b.a()), Integer.valueOf(this.f13427b.c())));
        }
        m(8);
        byte[] bArr3 = this.f13428c;
        return ((bArr3[0] & 255) << 56) | ((bArr3[1] & 255) << 48) | ((bArr3[2] & 255) << 40) | ((bArr3[3] & 255) << 32) | ((bArr3[4] & 255) << 24) | ((bArr3[5] & 255) << 16) | ((bArr3[6] & 255) << 8) | (bArr3[7] & 255);
    }

    private final void i() throws IOException {
        d();
        if (this.f13427b.a() == 31) {
            throw new IllegalStateException(String.format("expected definite length but found %s", Byte.valueOf(this.f13427b.a())));
        }
    }

    private final void j(byte b2) throws IOException {
        d();
        if (this.f13427b.b() != b2) {
            throw new IllegalStateException(String.format("expected major type %s but found %s", Integer.valueOf((b2 >> 5) & 7), Integer.valueOf(this.f13427b.c())));
        }
    }

    private final void k() {
        this.f13427b = null;
    }

    private final void l(byte[] bArr, int i2) throws IOException {
        int i3 = 0;
        while (i3 != i2) {
            int i4 = this.f13426a.read(bArr, i3, i2 - i3);
            if (i4 == -1) {
                throw new EOFException();
            }
            i3 += i4;
        }
        k();
    }

    private final void m(int i2) throws IOException {
        l(this.f13428c, i2);
    }

    private final byte[] n() throws IOException {
        i();
        long jH = h();
        if (jH < 0 || jH > SieveCacheKt.NodeLinkMask) {
            throw new UnsupportedOperationException(String.format("the maximum supported byte/text string length is %s bytes", Integer.MAX_VALUE));
        }
        if (this.f13426a.available() < jH) {
            throw new EOFException();
        }
        int i2 = (int) jH;
        byte[] bArr = new byte[i2];
        l(bArr, i2);
        return bArr;
    }

    public final long a() throws IOException {
        j((byte) -128);
        i();
        long jH = h();
        if (jH < 0) {
            throw new UnsupportedOperationException(String.format("the maximum supported array length is %s", Long.MAX_VALUE));
        }
        if (jH > 0) {
            this.f13429d.g(jH);
        }
        return jH;
    }

    public final long b() throws IOException {
        boolean z;
        d();
        if (this.f13427b.b() == 0) {
            z = true;
        } else {
            if (this.f13427b.b() != 32) {
                throw new IllegalStateException(String.format("expected major type 0 or 1 but found %s", Integer.valueOf(this.f13427b.c())));
            }
            z = false;
        }
        long jH = h();
        if (jH >= 0) {
            return z ? jH : ~jH;
        }
        throw new UnsupportedOperationException(String.format("the maximum supported unsigned/negative integer is %s", Long.MAX_VALUE));
    }

    public final long c() throws IOException {
        j((byte) -96);
        i();
        long jH = h();
        if (jH < 0 || jH > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jH > 0) {
            this.f13429d.g(jH + jH);
        }
        return jH;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f13426a.close();
        this.f13429d.b();
    }

    public final a d() throws IOException {
        if (this.f13427b == null) {
            int i2 = this.f13426a.read();
            if (i2 == -1) {
                this.f13429d.b();
                return null;
            }
            a aVar = new a(i2);
            this.f13427b = aVar;
            byte b2 = aVar.b();
            if (b2 == -128 || b2 == -96 || b2 == -64) {
                this.f13429d.d();
                this.f13429d.f();
            } else {
                if (b2 != -32) {
                    if (b2 != 0 && b2 != 32) {
                        if (b2 == 64) {
                            this.f13429d.e(-1L);
                        } else {
                            if (b2 != 96) {
                                throw new IllegalStateException(String.format("invalid major type: %s", Integer.valueOf(this.f13427b.c())));
                            }
                            this.f13429d.e(-2L);
                        }
                    }
                    this.f13429d.f();
                } else if (this.f13427b.a() == 31) {
                    this.f13429d.c();
                }
                this.f13429d.d();
                this.f13429d.f();
            }
        }
        return this.f13427b;
    }

    public final String e() throws IOException {
        j((byte) 96);
        return new String(n(), StandardCharsets.UTF_8);
    }

    public final boolean f() throws IOException {
        j((byte) -32);
        if (this.f13427b.a() > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iH = (int) h();
        if (iH == 20) {
            return false;
        }
        if (iH == 21) {
            return true;
        }
        throw new IllegalStateException(String.format("expected FALSE or TRUE", new Object[0]));
    }

    public final byte[] g() throws IOException {
        j((byte) 64);
        return n();
    }
}
