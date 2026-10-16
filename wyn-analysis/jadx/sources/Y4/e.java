package Y4;

import Va.M6;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class e extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final long f16684a;

    /* renamed from: b, reason: collision with root package name */
    public int f16685b;

    public e(InputStream inputStream, long j8) {
        super(inputStream);
        this.f16684a = j8;
    }

    public final void a(int i5) throws IOException {
        if (i5 >= 0) {
            this.f16685b += i5;
            return;
        }
        long j8 = this.f16685b;
        long j10 = this.f16684a;
        if (j10 - j8 <= 0) {
            return;
        }
        StringBuilder sbU = M6.u(j10, "Failed to read all expected data, expected: ", ", but read: ");
        sbU.append(this.f16685b);
        throw new IOException(sbU.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f16684a - this.f16685b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i5;
        i5 = super.read();
        a(i5 >= 0 ? 1 : -1);
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i5, int i10) {
        int i11;
        i11 = super.read(bArr, i5, i10);
        a(i11);
        return i11;
    }
}
