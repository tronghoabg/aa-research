package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.MetadataItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MetadataList extends Table {
    public static void ValidateVersion() {
    }

    public static void addList(FlatBufferBuilder flatBufferBuilder, int i2) {
        flatBufferBuilder.addOffset(1, i2, 0);
    }

    public static void addSourceSha(FlatBufferBuilder flatBufferBuilder, int i2) {
        flatBufferBuilder.addOffset(2, i2, 0);
    }

    public static void addVersion(FlatBufferBuilder flatBufferBuilder, int i2) {
        flatBufferBuilder.addInt(0, i2, 0);
    }

    public static int createListVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        int length = iArr.length;
        flatBufferBuilder.startVector(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return flatBufferBuilder.endVector();
            }
            flatBufferBuilder.addOffset(iArr[length]);
        }
    }

    public static int createMetadataList(FlatBufferBuilder flatBufferBuilder, int i2, int i3, int i4) {
        flatBufferBuilder.startTable(3);
        addSourceSha(flatBufferBuilder, i4);
        addList(flatBufferBuilder, i3);
        addVersion(flatBufferBuilder, i2);
        return endMetadataList(flatBufferBuilder);
    }

    public static int endMetadataList(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static void finishMetadataListBuffer(FlatBufferBuilder flatBufferBuilder, int i2) {
        flatBufferBuilder.finish(i2);
    }

    public static void finishSizePrefixedMetadataListBuffer(FlatBufferBuilder flatBufferBuilder, int i2) {
        flatBufferBuilder.finishSizePrefixed(i2);
    }

    public static MetadataList getRootAsMetadataList(ByteBuffer byteBuffer, MetadataList metadataList) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        metadataList.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return metadataList;
    }

    public static void startListVector(FlatBufferBuilder flatBufferBuilder, int i2) {
        flatBufferBuilder.startVector(4, i2, 4);
    }

    public static void startMetadataList(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(3);
    }

    public MetadataList __assign(int i2, ByteBuffer byteBuffer) {
        __init(i2, byteBuffer);
        return this;
    }

    public void __init(int i2, ByteBuffer byteBuffer) {
        __reset(i2, byteBuffer);
    }

    public MetadataItem list(MetadataItem metadataItem, int i2) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        metadataItem.__assign(__indirect(__vector(i__offset) + (i2 * 4)), this.bb);
        return metadataItem;
    }

    public int listLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public MetadataItem.Vector listVector(MetadataItem.Vector vector) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        vector.__assign(__vector(i__offset), 4, this.bb);
        return vector;
    }

    public String sourceSha() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer sourceShaAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public ByteBuffer sourceShaInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 1);
    }

    public int version() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* compiled from: WazeSource */
    public final class Vector extends BaseVector {
        public Vector __assign(int i2, int i3, ByteBuffer byteBuffer) {
            __reset(i2, i3, byteBuffer);
            return this;
        }

        public MetadataList get(MetadataList metadataList, int i2) {
            metadataList.__assign(MetadataList.__indirect(__element(i2), this.bb), this.bb);
            return metadataList;
        }

        public MetadataList get(int i2) {
            MetadataList metadataList = new MetadataList();
            get(metadataList, i2);
            return metadataList;
        }
    }

    public MetadataItem.Vector listVector() {
        return listVector(new MetadataItem.Vector());
    }

    public static MetadataList getRootAsMetadataList(ByteBuffer byteBuffer) {
        MetadataList metadataList = new MetadataList();
        getRootAsMetadataList(byteBuffer, metadataList);
        return metadataList;
    }

    public MetadataItem list(int i2) {
        return list(new MetadataItem(), i2);
    }
}
