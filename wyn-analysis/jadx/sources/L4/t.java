package L4;

import io.ktor.utils.io.T;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class t extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public volatile byte[] f6927a;

    /* renamed from: b, reason: collision with root package name */
    public int f6928b;

    /* renamed from: c, reason: collision with root package name */
    public int f6929c;

    /* renamed from: d, reason: collision with root package name */
    public int f6930d;

    /* renamed from: e, reason: collision with root package name */
    public int f6931e;

    /* renamed from: f, reason: collision with root package name */
    public final F4.f f6932f;

    public t(InputStream inputStream, F4.f fVar) {
        super(inputStream);
        this.f6930d = -1;
        this.f6932f = fVar;
        this.f6927a = (byte[]) fVar.e(65536, byte[].class);
    }

    public static void d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i5 = this.f6930d;
        if (i5 != -1) {
            int i10 = this.f6931e - i5;
            int i11 = this.f6929c;
            if (i10 < i11) {
                if (i5 == 0 && i11 > bArr.length && this.f6928b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i11) {
                        i11 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f6932f.e(i11, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f6927a = bArr2;
                    this.f6932f.i(bArr);
                    bArr = bArr2;
                } else if (i5 > 0) {
                    System.arraycopy(bArr, i5, bArr, 0, bArr.length - i5);
                }
                int i12 = this.f6931e - this.f6930d;
                this.f6931e = i12;
                this.f6930d = 0;
                this.f6928b = 0;
                int i13 = inputStream.read(bArr, i12, bArr.length - i12);
                int i14 = this.f6931e;
                if (i13 > 0) {
                    i14 += i13;
                }
                this.f6928b = i14;
                return i13;
            }
        }
        int i15 = inputStream.read(bArr);
        if (i15 > 0) {
            this.f6930d = -1;
            this.f6931e = 0;
            this.f6928b = i15;
        }
        return i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f6927a == null || inputStream == null) {
            d();
            throw null;
        }
        return (this.f6928b - this.f6931e) + inputStream.available();
    }

    public final synchronized void b() {
        if (this.f6927a != null) {
            this.f6932f.i(this.f6927a);
            this.f6927a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f6927a != null) {
            this.f6932f.i(this.f6927a);
            this.f6927a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i5) {
        this.f6929c = Math.max(this.f6929c, i5);
        this.f6930d = this.f6931e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f6927a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            d();
            throw null;
        }
        if (this.f6931e >= this.f6928b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f6927a && (bArr = this.f6927a) == null) {
            d();
            throw null;
        }
        int i5 = this.f6928b;
        int i10 = this.f6931e;
        if (i5 - i10 <= 0) {
            return -1;
        }
        this.f6931e = i10 + 1;
        return bArr[i10] & ForkServer.ERROR;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f6927a == null) {
            throw new IOException("Stream is closed");
        }
        int i5 = this.f6930d;
        if (-1 == i5) {
            throw new T("Mark has been invalidated, pos: " + this.f6931e + " markLimit: " + this.f6929c);
        }
        this.f6931e = i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j8) {
        if (j8 < 1) {
            return 0L;
        }
        byte[] bArr = this.f6927a;
        if (bArr == null) {
            d();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            d();
            throw null;
        }
        int i5 = this.f6928b;
        int i10 = this.f6931e;
        if (i5 - i10 >= j8) {
            this.f6931e = (int) (i10 + j8);
            return j8;
        }
        long j10 = i5 - i10;
        this.f6931e = i5;
        if (this.f6930d == -1 || j8 > this.f6929c) {
            return j10 + inputStream.skip(j8 - j10);
        }
        if (a(inputStream, bArr) == -1) {
            return j10;
        }
        int i11 = this.f6928b;
        int i12 = this.f6931e;
        if (i11 - i12 >= j8 - j10) {
            this.f6931e = (int) ((i12 + j8) - j10);
            return j8;
        }
        long j11 = (j10 + i11) - i12;
        this.f6931e = i11;
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i5, int i10) {
        int i11;
        int i12;
        byte[] bArr2 = this.f6927a;
        if (bArr2 == null) {
            d();
            throw null;
        }
        if (i10 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i13 = this.f6931e;
            int i14 = this.f6928b;
            if (i13 < i14) {
                int i15 = i14 - i13;
                if (i15 >= i10) {
                    i15 = i10;
                }
                System.arraycopy(bArr2, i13, bArr, i5, i15);
                this.f6931e += i15;
                if (i15 == i10 || inputStream.available() == 0) {
                    return i15;
                }
                i5 += i15;
                i11 = i10 - i15;
            } else {
                i11 = i10;
            }
            while (true) {
                if (this.f6930d == -1 && i11 >= bArr2.length) {
                    i12 = inputStream.read(bArr, i5, i11);
                    if (i12 == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                    if (bArr2 != this.f6927a && (bArr2 = this.f6927a) == null) {
                        d();
                        throw null;
                    }
                    int i16 = this.f6928b;
                    int i17 = this.f6931e;
                    i12 = i16 - i17;
                    if (i12 >= i11) {
                        i12 = i11;
                    }
                    System.arraycopy(bArr2, i17, bArr, i5, i12);
                    this.f6931e += i12;
                }
                i11 -= i12;
                if (i11 == 0) {
                    return i10;
                }
                if (inputStream.available() == 0) {
                    return i10 - i11;
                }
                i5 += i12;
            }
        } else {
            d();
            throw null;
        }
    }
}
