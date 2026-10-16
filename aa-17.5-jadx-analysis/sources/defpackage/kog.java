package defpackage;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class kog extends OutputStream {
    public final OutputStream a;
    private final par b;

    public kog(OutputStream outputStream, par parVar) {
        this.a = outputStream;
        this.b = parVar;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws Throwable {
        koo.m().b(this.b, new kof(this, bArr, i, i2, 0));
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws Throwable {
        koo.m().b(this.b, new koe(this, i, 0));
    }
}
