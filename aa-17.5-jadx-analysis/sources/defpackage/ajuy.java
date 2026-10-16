package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class ajuy extends ajuv implements Cloneable {
    private final byte[] d;
    private final int e;

    public ajuy(byte[] bArr) {
        ahgm.e(bArr, "Source byte array");
        this.d = bArr;
        this.e = bArr.length;
    }

    @Override // defpackage.ajpb
    public final long a() {
        return this.e;
    }

    @Override // defpackage.ajpb
    public final InputStream b() {
        return new ByteArrayInputStream(this.d, 0, this.e);
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // defpackage.ajpb
    public final void f(OutputStream outputStream) throws IOException {
        outputStream.write(this.d, 0, this.e);
        outputStream.flush();
    }

    @Override // defpackage.ajpb
    public final boolean h() {
        return true;
    }

    @Override // defpackage.ajpb
    public final boolean i() {
        return false;
    }
}
