package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class Struct {
    protected ByteBuffer bb;
    protected int bb_pos;

    protected void __reset(int i2, ByteBuffer byteBuffer) {
        this.bb = byteBuffer;
        if (byteBuffer == null) {
            i2 = 0;
        }
        this.bb_pos = i2;
    }

    public void __reset() {
        __reset(0, null);
    }
}
