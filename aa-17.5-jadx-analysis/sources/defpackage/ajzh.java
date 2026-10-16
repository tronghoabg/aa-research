package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class ajzh extends OutputStream {
    private final ajzv a;
    private int c = 0;
    private boolean d = false;
    private boolean e = false;
    private final byte[] b = new byte[2048];

    public ajzh(ajzv ajzvVar) {
        this.a = ajzvVar;
    }

    protected final void a() throws IOException {
        int i = this.c;
        if (i > 0) {
            ajzv ajzvVar = this.a;
            ajzvVar.d(Integer.toHexString(i));
            ajzvVar.c(this.b, 0, this.c);
            ajzvVar.d("");
            this.c = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.e) {
            return;
        }
        this.e = true;
        if (!this.d) {
            a();
            ajzv ajzvVar = this.a;
            ajzvVar.d(CloudRecognizerProtocolStrings.DBG_VALUE);
            ajzvVar.d("");
            this.d = true;
        }
        this.a.a();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        a();
        this.a.a();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.e) {
            throw new IOException("Attempted write to closed stream.");
        }
        byte[] bArr2 = this.b;
        int length = bArr2.length;
        int i3 = this.c;
        if (i2 < 2048 - i3) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.c += i2;
            return;
        }
        ajzv ajzvVar = this.a;
        ajzvVar.d(Integer.toHexString(i3 + i2));
        ajzvVar.c(bArr2, 0, this.c);
        ajzvVar.c(bArr, i, i2);
        ajzvVar.d("");
        this.c = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (!this.e) {
            byte[] bArr = this.b;
            int i2 = this.c;
            bArr[i2] = (byte) i;
            int i3 = i2 + 1;
            this.c = i3;
            int length = bArr.length;
            if (i3 == 2048) {
                a();
                return;
            }
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}
