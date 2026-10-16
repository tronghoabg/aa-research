package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class adre implements aeag {
    public final ByteBuffer a;

    public adre(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.aeag
    public final int a() {
        return this.a.position();
    }

    @Override // defpackage.aeag
    public final int b() {
        return this.a.remaining();
    }

    @Override // defpackage.aeag
    public final void c(byte b) {
        this.a.put(b);
    }

    @Override // defpackage.aeag
    public final void d(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
    }
}
