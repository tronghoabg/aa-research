package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class kod extends InputStream implements InputStreamRetargetInterface {
    public final InputStream a;
    private final par b;

    public kod(InputStream inputStream, par parVar) {
        this.a = inputStream;
        this.b = parVar;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        par parVar = this.b;
        if (parVar == par.WPP_READ) {
            koo.m().h(par.WPP_PRE_READ);
        } else if (parVar == par.GAL_READ) {
            koo.m().h(par.GAL_PRE_READ);
        }
        return ((Integer) koo.m().b(parVar, new pcc(this, 1))).intValue();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return ((Integer) koo.m().b(this.b, new kof(this, bArr, i, i2, 1))).intValue();
    }
}
