package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class yso extends ysl {
    @Override // defpackage.ysl, defpackage.ysv
    public final ysu b(CharSequence charSequence) {
        int length = charSequence.length();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length + length).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < length; i++) {
            byteBufferOrder.putChar(charSequence.charAt(i));
        }
        return a(byteBufferOrder.array());
    }

    @Override // defpackage.ysl, defpackage.ysv
    public final ysw c(int i) {
        woy.N(i >= 0);
        return new ysn(this, i);
    }

    @Override // defpackage.ysv
    public final ysw e() {
        return c(32);
    }
}
