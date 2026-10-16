package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class zrd extends InputStream implements InputStreamRetargetInterface {
    private int a;
    private final byte[] b;
    private int c;
    private int d;
    private final InputStream e;

    public zrd(InputStream inputStream, int i) {
        this.e = inputStream;
        this.a = i;
        this.b = new byte[Math.min(i, 4096)];
    }

    private final boolean a() throws IOException {
        int i = this.a;
        if (i <= 0) {
            return false;
        }
        if (this.c < this.d) {
            return true;
        }
        InputStream inputStream = this.e;
        byte[] bArr = this.b;
        int i2 = inputStream.read(bArr, 0, Math.min(i, bArr.length));
        this.d = i2;
        if (i2 <= 0) {
            this.a = 0;
            return false;
        }
        this.c = 0;
        return true;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.d - this.c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (!a()) {
            return -1;
        }
        int iMin = Math.min(i2, this.d - this.c);
        System.arraycopy(this.b, this.c, bArr, i, iMin);
        this.c += iMin;
        this.a -= iMin;
        return iMin;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (!a()) {
            return -1;
        }
        this.a--;
        byte[] bArr = this.b;
        int i = this.c;
        this.c = i + 1;
        return bArr[i] & 255;
    }
}
