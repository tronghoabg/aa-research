package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final /* synthetic */ class ird implements jdh {
    private final /* synthetic */ int a;

    @Override // defpackage.jdh
    public final ByteBuffer a(int i) {
        return this.a != 0 ? ByteBuffer.allocate(i) : ByteBuffer.allocate(i);
    }
}
