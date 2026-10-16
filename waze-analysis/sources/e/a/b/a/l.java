package e.a.b.a;

import e.a.bf;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends InputStream implements InputStreamRetargetInterface, bf, e.a.ah {

    /* renamed from: a, reason: collision with root package name */
    private byte[][] f46411a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f46412b;

    /* renamed from: c, reason: collision with root package name */
    private int f46413c;

    /* renamed from: d, reason: collision with root package name */
    private int f46414d;

    /* renamed from: e, reason: collision with root package name */
    private int f46415e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f46416f;

    l(byte[][] bArr, int i2) {
        this.f46411a = bArr;
        this.f46415e = i2;
        if (bArr.length > 0) {
            this.f46412b = bArr[0];
        }
    }

    private final void b() {
        int i2 = this.f46413c + 1;
        this.f46413c = i2;
        this.f46414d = 0;
        byte[][] bArr = this.f46411a;
        if (bArr == null || i2 >= bArr.length) {
            this.f46412b = null;
        } else {
            this.f46412b = bArr[i2];
        }
    }

    @Override // e.a.ah
    public final int a(OutputStream outputStream) throws IOException {
        int i2 = this.f46415e;
        while (true) {
            int i3 = this.f46415e;
            if (i3 <= 0) {
                return i2;
            }
            int iMin = Math.min(this.f46412b.length - this.f46414d, i3);
            outputStream.write(this.f46412b, this.f46414d, iMin);
            this.f46415e -= iMin;
            b();
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f46415e;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f46416f) {
            return;
        }
        this.f46416f = true;
        byte[][] bArr = this.f46411a;
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                m.a(bArr2);
            }
        } else {
            byte[] bArr3 = this.f46412b;
            if (bArr3 != null) {
                m.a(bArr3);
            }
        }
        this.f46412b = null;
        this.f46411a = null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        int i4 = i3;
        while (true) {
            byte[] bArr2 = this.f46412b;
            if (bArr2 == null) {
                break;
            }
            int[] iArr = {i4, bArr2.length - this.f46414d, this.f46415e};
            com.google.d.b.an.l(true);
            int i5 = iArr[0];
            for (int i6 = 1; i6 < 3; i6++) {
                int i7 = iArr[i6];
                if (i7 < i5) {
                    i5 = i7;
                }
            }
            System.arraycopy(this.f46412b, this.f46414d, bArr, i2, i5);
            i2 += i5;
            i4 -= i5;
            this.f46415e -= i5;
            if (i4 == 0) {
                int i8 = this.f46414d + i5;
                this.f46414d = i8;
                if (i8 == this.f46412b.length) {
                    b();
                }
            } else {
                b();
            }
        }
        int i9 = i3 - i4;
        if (i9 > 0 || this.f46415e > 0) {
            return i9;
        }
        return -1;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    l(byte[] bArr) {
        this.f46411a = null;
        int length = bArr.length;
        this.f46412b = length <= 0 ? null : bArr;
        this.f46415e = length;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f46412b;
        if (bArr == null) {
            return -1;
        }
        int i2 = this.f46414d;
        int i3 = i2 + 1;
        this.f46414d = i3;
        byte b2 = bArr[i2];
        this.f46415e--;
        if (i3 == bArr.length) {
            b();
        }
        return b2;
    }
}
