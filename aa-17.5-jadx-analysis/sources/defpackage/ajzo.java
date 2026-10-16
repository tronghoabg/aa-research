package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class ajzo extends InputStream implements InputStreamRetargetInterface {
    private final ajzu a;
    private boolean b = false;

    public ajzo(ajzu ajzuVar) {
        ahgm.e(ajzuVar, "Session input buffer");
        this.a = ajzuVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        ajzu ajzuVar = this.a;
        if (ajzuVar instanceof ajzr) {
            return ((ajzr) ajzuVar).g();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b = true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.b) {
            return -1;
        }
        return this.a.a();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.b) {
            return -1;
        }
        return this.a.b(bArr, i, i2);
    }
}
