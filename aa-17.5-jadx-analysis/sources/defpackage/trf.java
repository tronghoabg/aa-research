package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class trf implements tri {
    private final int a;
    private final int b;

    public trf(int i, int i2) {
        this.a = i2;
        this.b = tss.i(i, 1.0f);
    }

    @Override // defpackage.tri
    public final int a(int i) {
        return this.a;
    }

    @Override // defpackage.tri
    public final void b(ByteBuffer byteBuffer, int i) {
        for (int i2 = 0; i2 < this.a * i; i2++) {
            byteBuffer.putInt(this.b);
        }
    }
}
