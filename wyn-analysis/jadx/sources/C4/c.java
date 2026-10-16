package C4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f1786a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f1787b;

    /* renamed from: c, reason: collision with root package name */
    public final F4.f f1788c;

    /* renamed from: d, reason: collision with root package name */
    public int f1789d;

    public c(FileOutputStream fileOutputStream, F4.f fVar) {
        this.f1786a = fileOutputStream;
        this.f1788c = fVar;
        this.f1787b = (byte[]) fVar.e(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f1786a;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f1787b;
            if (bArr != null) {
                this.f1788c.i(bArr);
                this.f1787b = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i5 = this.f1789d;
        FileOutputStream fileOutputStream = this.f1786a;
        if (i5 > 0) {
            fileOutputStream.write(this.f1787b, 0, i5);
            this.f1789d = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i5) throws IOException {
        byte[] bArr = this.f1787b;
        int i10 = this.f1789d;
        int i11 = i10 + 1;
        this.f1789d = i11;
        bArr[i10] = (byte) i5;
        if (i11 != bArr.length || i11 <= 0) {
            return;
        }
        this.f1786a.write(bArr, 0, i11);
        this.f1789d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i5, int i10) throws IOException {
        int i11 = 0;
        do {
            int i12 = i10 - i11;
            int i13 = i5 + i11;
            int i14 = this.f1789d;
            FileOutputStream fileOutputStream = this.f1786a;
            if (i14 == 0 && i12 >= this.f1787b.length) {
                fileOutputStream.write(bArr, i13, i12);
                return;
            }
            int iMin = Math.min(i12, this.f1787b.length - i14);
            System.arraycopy(bArr, i13, this.f1787b, this.f1789d, iMin);
            int i15 = this.f1789d + iMin;
            this.f1789d = i15;
            i11 += iMin;
            byte[] bArr2 = this.f1787b;
            if (i15 == bArr2.length && i15 > 0) {
                fileOutputStream.write(bArr2, 0, i15);
                this.f1789d = 0;
            }
        } while (i11 < i10);
    }
}
