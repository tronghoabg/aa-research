package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ajmx extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ ajmy a;

    public ajmx(ajmy ajmyVar) {
        this.a = ajmyVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.a.b, 2147483647L);
    }

    @Override // java.io.InputStream
    public final int read() {
        ajmy ajmyVar = this.a;
        if (ajmyVar.b > 0) {
            return ajmyVar.d() & 255;
        }
        return -1;
    }

    public final String toString() {
        ajmy ajmyVar = this.a;
        Objects.toString(ajmyVar);
        return ajmyVar.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        return this.a.e(bArr, i, i2);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
