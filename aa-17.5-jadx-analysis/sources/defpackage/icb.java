package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class icb implements hux {
    private final ByteBuffer a;

    public icb(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.hux
    public final /* bridge */ /* synthetic */ Object a() throws IOException {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // defpackage.hux
    public final void b() {
    }
}
