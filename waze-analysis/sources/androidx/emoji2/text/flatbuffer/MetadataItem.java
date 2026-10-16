package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MetadataItem extends Table {
    public static void ValidateVersion() {
    }

    public static void addCodepoints(FlatBufferBuilder flatBufferBuilder, int i2) {
        flatBufferBuilder.addOffset(6, i2, 0);
    }

    public static void addCompatAdded(FlatBufferBuilder flatBufferBuilder, short s) {
        flatBufferBuilder.addShort(3, s, 0);
    }

    public static void addEmojiStyle(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(1, z, false);
    }

    public static void addHeight(FlatBufferBuilder flatBufferBuilder, short s) {
        flatBufferBuilder.addShort(5, s, 0);
    }

    public static void addId(FlatBufferBuilder flatBufferBuilder, int i2) {
        flatBufferBuilder.addInt(0, i2, 0);
    }

    public static void addSdkAdded(FlatBufferBuilder flatBufferBuilder, short s) {
        flatBufferBuilder.addShort(2, s, 0);
    }

    public static void addWidth(FlatBufferBuilder flatBufferBuilder, short s) {
        flatBufferBuilder.addShort(4, s, 0);
    }

    public static int createCodepointsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        int length = iArr.length;
        flatBufferBuilder.startVector(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return flatBufferBuilder.endVector();
            }
            flatBufferBuilder.addInt(iArr[length]);
        }
    }

    public static int createMetadataItem(FlatBufferBuilder flatBufferBuilder, int i2, boolean z, short s, short s2, short s3, short s4, int i3) {
        flatBufferBuilder.startTable(7);
        addCodepoints(flatBufferBuilder, i3);
        addId(flatBufferBuilder, i2);
        addHeight(flatBufferBuilder, s4);
        addWidth(flatBufferBuilder, s3);
        addCompatAdded(flatBufferBuilder, s2);
        addSdkAdded(flatBufferBuilder, s);
        addEmojiStyle(flatBufferBuilder, z);
        return endMetadataItem(flatBufferBuilder);
    }

    public static int endMetadataItem(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static MetadataItem getRootAsMetadataItem(ByteBuffer byteBuffer, MetadataItem metadataItem) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        metadataItem.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return metadataItem;
    }

    public static void startCodepointsVector(FlatBufferBuilder flatBufferBuilder, int i2) {
        flatBufferBuilder.startVector(4, i2, 4);
    }

    public static void startMetadataItem(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(7);
    }

    public MetadataItem __assign(int i2, ByteBuffer byteBuffer) {
        __init(i2, byteBuffer);
        return this;
    }

    public void __init(int i2, ByteBuffer byteBuffer) {
        __reset(i2, byteBuffer);
    }

    public int codepoints(int i2) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return this.bb.getInt(__vector(i__offset) + (i2 * 4));
        }
        return 0;
    }

    public ByteBuffer codepointsAsByteBuffer() {
        return __vector_as_bytebuffer(16, 4);
    }

    public ByteBuffer codepointsInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 16, 4);
    }

    public int codepointsLength() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public IntVector codepointsVector(IntVector intVector) {
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return null;
        }
        intVector.__assign(__vector(i__offset), this.bb);
        return intVector;
    }

    public short compatAdded() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public boolean emojiStyle() {
        int i__offset = __offset(6);
        return (i__offset == 0 || this.bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public short height() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return this.bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public int id() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public short sdkAdded() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public short width() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    /* compiled from: WazeSource */
    public final class Vector extends BaseVector {
        public Vector __assign(int i2, int i3, ByteBuffer byteBuffer) {
            __reset(i2, i3, byteBuffer);
            return this;
        }

        public MetadataItem get(MetadataItem metadataItem, int i2) {
            metadataItem.__assign(MetadataItem.__indirect(__element(i2), this.bb), this.bb);
            return metadataItem;
        }

        public MetadataItem get(int i2) {
            MetadataItem metadataItem = new MetadataItem();
            get(metadataItem, i2);
            return metadataItem;
        }
    }

    public IntVector codepointsVector() {
        return codepointsVector(new IntVector());
    }

    public static MetadataItem getRootAsMetadataItem(ByteBuffer byteBuffer) {
        MetadataItem metadataItem = new MetadataItem();
        getRootAsMetadataItem(byteBuffer, metadataItem);
        return metadataItem;
    }
}
