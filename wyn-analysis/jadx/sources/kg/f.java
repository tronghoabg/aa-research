package kg;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes5.dex */
public final class f extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public volatile ByteArrayInputStream f39724a;

    /* renamed from: b, reason: collision with root package name */
    public volatile byte[] f39725b;

    /* renamed from: c, reason: collision with root package name */
    public int f39726c;

    /* renamed from: d, reason: collision with root package name */
    public int f39727d;

    /* renamed from: e, reason: collision with root package name */
    public int f39728e;

    /* renamed from: f, reason: collision with root package name */
    public int f39729f;

    public final int a(ByteArrayInputStream byteArrayInputStream, byte[] bArr) throws IOException {
        int i5 = this.f39728e;
        if (i5 != -1) {
            int i10 = this.f39729f - i5;
            int i11 = this.f39727d;
            if (i10 < i11) {
                if (i5 == 0 && i11 > bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i11) {
                        i11 = length;
                    }
                    byte[] bArr2 = new byte[i11];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f39725b = bArr2;
                    bArr = bArr2;
                } else if (i5 > 0) {
                    System.arraycopy(bArr, i5, bArr, 0, bArr.length - i5);
                }
                int i12 = this.f39729f - this.f39728e;
                this.f39729f = i12;
                this.f39728e = 0;
                this.f39726c = 0;
                int i13 = byteArrayInputStream.read(bArr, i12, bArr.length - i12);
                int i14 = this.f39729f;
                if (i13 > 0) {
                    i14 += i13;
                }
                this.f39726c = i14;
                return i13;
            }
        }
        int i15 = byteArrayInputStream.read(bArr);
        if (i15 > 0) {
            this.f39728e = -1;
            this.f39729f = 0;
            this.f39726c = i15;
        }
        return i15;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.f39724a;
        if (this.f39725b == null || byteArrayInputStream == null) {
            throw new IOException("Stream is closed");
        }
        return byteArrayInputStream.available() + (this.f39726c - this.f39729f);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f39725b = null;
        ByteArrayInputStream byteArrayInputStream = this.f39724a;
        this.f39724a = null;
        if (byteArrayInputStream != null) {
            byteArrayInputStream.close();
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i5) {
        this.f39727d = i5;
        this.f39728e = this.f39729f;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        if (this.f39725b == null) {
            throw new IOException("Stream is closed");
        }
        int i5 = this.f39728e;
        if (-1 == i5) {
            throw new IOException("Mark has been invalidated");
        }
        this.f39729f = i5;
    }

    @Override // java.io.InputStream
    public final long skip(long j8) throws IOException {
        byte[] bArr = this.f39725b;
        ByteArrayInputStream byteArrayInputStream = this.f39724a;
        if (bArr == null) {
            throw new IOException("Stream is closed");
        }
        if (j8 < 1) {
            return 0L;
        }
        if (byteArrayInputStream == null) {
            throw new IOException("Stream is closed");
        }
        int i5 = this.f39726c;
        int i10 = this.f39729f;
        int i11 = i5 - i10;
        long j10 = i11;
        if (j10 >= j8) {
            this.f39729f = i10 + ((int) j8);
            return j8;
        }
        this.f39729f = i5;
        if (this.f39728e == -1 || j8 > this.f39727d) {
            return byteArrayInputStream.skip(j8 - j10) + j10;
        }
        if (a(byteArrayInputStream, bArr) == -1) {
            return j10;
        }
        int i12 = this.f39726c;
        int i13 = this.f39729f;
        if (i12 - i13 >= j8 - j10) {
            this.f39729f = (((int) j8) - i11) + i13;
            return j8;
        }
        this.f39729f = i12;
        return r2 + i11;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.f39725b;
        ByteArrayInputStream byteArrayInputStream = this.f39724a;
        if (bArr == null || byteArrayInputStream == null) {
            throw new IOException("Stream is closed");
        }
        if (this.f39729f < this.f39726c || a(byteArrayInputStream, bArr) != -1) {
            if (bArr != this.f39725b && (bArr = this.f39725b) == null) {
                throw new IOException("Stream is closed");
            }
            int i5 = this.f39726c;
            int i10 = this.f39729f;
            if (i5 - i10 > 0) {
                this.f39729f = i10 + 1;
                return bArr[i10] & ForkServer.ERROR;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0077 A[SYNTHETIC] */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            byte[] r0 = r6.f39725b
            java.lang.String r1 = "Stream is closed"
            if (r0 == 0) goto L8e
            int r2 = r7.length
            int r2 = r2 - r9
            if (r8 > r2) goto L88
            if (r8 < 0) goto L88
            if (r9 < 0) goto L88
            if (r9 != 0) goto L12
            r7 = 0
            return r7
        L12:
            java.io.ByteArrayInputStream r2 = r6.f39724a
            if (r2 == 0) goto L82
            int r3 = r6.f39729f
            int r4 = r6.f39726c
            if (r3 >= r4) goto L36
            int r4 = r4 - r3
            if (r4 < r9) goto L20
            r4 = r9
        L20:
            java.lang.System.arraycopy(r0, r3, r7, r8, r4)
            int r3 = r6.f39729f
            int r3 = r3 + r4
            r6.f39729f = r3
            if (r4 == r9) goto L35
            int r3 = r2.available()
            if (r3 != 0) goto L31
            goto L35
        L31:
            int r8 = r8 + r4
            int r3 = r9 - r4
            goto L37
        L35:
            return r4
        L36:
            r3 = r9
        L37:
            int r4 = r6.f39728e
            r5 = -1
            if (r4 != r5) goto L4a
            int r4 = r0.length
            if (r3 < r4) goto L4a
            int r4 = r2.read(r7, r8, r3)
            if (r4 != r5) goto L74
            if (r3 != r9) goto L48
            goto L52
        L48:
            int r9 = r9 - r3
            return r9
        L4a:
            int r4 = r6.a(r2, r0)
            if (r4 != r5) goto L55
            if (r3 != r9) goto L53
        L52:
            return r5
        L53:
            int r9 = r9 - r3
            return r9
        L55:
            byte[] r4 = r6.f39725b
            if (r0 == r4) goto L64
            byte[] r0 = r6.f39725b
            if (r0 == 0) goto L5e
            goto L64
        L5e:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r1)
            throw r7
        L64:
            int r4 = r6.f39726c
            int r5 = r6.f39729f
            int r4 = r4 - r5
            if (r4 < r3) goto L6c
            r4 = r3
        L6c:
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)
            int r5 = r6.f39729f
            int r5 = r5 + r4
            r6.f39729f = r5
        L74:
            int r3 = r3 - r4
            if (r3 != 0) goto L78
            return r9
        L78:
            int r5 = r2.available()
            if (r5 != 0) goto L80
            int r9 = r9 - r3
            return r9
        L80:
            int r8 = r8 + r4
            goto L37
        L82:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r1)
            throw r7
        L88:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            r7.<init>()
            throw r7
        L8e:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.f.read(byte[], int, int):int");
    }
}
