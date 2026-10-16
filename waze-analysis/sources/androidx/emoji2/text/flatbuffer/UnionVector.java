package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class UnionVector extends BaseVector {
    public UnionVector __assign(int i2, int i3, ByteBuffer byteBuffer) {
        __reset(i2, i3, byteBuffer);
        return this;
    }

    public Table get(Table table, int i2) {
        Table.__union(table, __element(i2), this.bb);
        return table;
    }
}
