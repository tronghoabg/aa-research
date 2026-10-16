package defpackage;

import java.io.OutputStream;

/* loaded from: classes3.dex */
final class adwo extends OutputStream {
    final /* synthetic */ adwq a;

    public adwo(adwq adwqVar) {
        this.a = adwqVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.c(bArr, i, i2);
    }
}
