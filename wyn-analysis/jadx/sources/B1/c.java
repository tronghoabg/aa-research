package B1;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class c extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f1504a;

    /* renamed from: b, reason: collision with root package name */
    public ByteOrder f1505b;

    public c(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f1504a = outputStream;
        this.f1505b = byteOrder;
    }

    public final void a(int i5) throws IOException {
        this.f1504a.write(i5);
    }

    public final void b(int i5) throws IOException {
        ByteOrder byteOrder = this.f1505b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f1504a;
        if (byteOrder == byteOrder2) {
            outputStream.write(i5 & 255);
            outputStream.write((i5 >>> 8) & 255);
            outputStream.write((i5 >>> 16) & 255);
            outputStream.write((i5 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((i5 >>> 24) & 255);
            outputStream.write((i5 >>> 16) & 255);
            outputStream.write((i5 >>> 8) & 255);
            outputStream.write(i5 & 255);
        }
    }

    public final void d(short s10) throws IOException {
        ByteOrder byteOrder = this.f1505b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f1504a;
        if (byteOrder == byteOrder2) {
            outputStream.write(s10 & 255);
            outputStream.write((s10 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((s10 >>> 8) & 255);
            outputStream.write(s10 & 255);
        }
    }

    public final void h(long j8) throws IOException {
        if (j8 > 4294967295L) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
        }
        b((int) j8);
    }

    public final void i(int i5) throws IOException {
        if (i5 > 65535) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }
        d((short) i5);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f1504a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i5, int i10) throws IOException {
        this.f1504a.write(bArr, i5, i10);
    }
}
