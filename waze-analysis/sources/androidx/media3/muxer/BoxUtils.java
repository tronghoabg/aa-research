package androidx.media3.muxer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class BoxUtils {
    private static final int BOX_SIZE_BYTES = 4;
    private static final int BOX_TYPE_BYTES = 4;

    private BoxUtils() {
    }

    public static ByteBuffer concatenateBuffers(ByteBuffer... byteBufferArr) {
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            iRemaining += byteBuffer.remaining();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBufferAllocate.put(byteBuffer2);
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static byte[] getUleb128Bytes(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Value must be non-negative.");
        }
        int i3 = 0;
        int i4 = i2;
        int i5 = 0;
        do {
            i4 >>>= 7;
            i5++;
        } while (i4 != 0);
        byte[] bArr = new byte[i5];
        while (true) {
            int i6 = i2 >>> 7;
            int i7 = i2 & 127;
            if (i6 != 0) {
                i7 = (byte) (i7 | 128);
            }
            int i8 = i3 + 1;
            bArr[i3] = (byte) i7;
            if (i6 == 0) {
                return bArr;
            }
            i2 = i6;
            i3 = i8;
        }
    }

    public static ByteBuffer wrapBoxesIntoBox(String str, List<ByteBuffer> list) {
        int iRemaining = 8;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iRemaining += list.get(i2).remaining();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining);
        byteBufferAllocate.putInt(iRemaining);
        byteBufferAllocate.put(str.getBytes(StandardCharsets.UTF_8), 0, 4);
        for (int i3 = 0; i3 < list.size(); i3++) {
            byteBufferAllocate.put(list.get(i3));
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ByteBuffer wrapIntoBox(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining() + 8);
        byteBufferAllocate.putInt(byteBuffer.remaining() + 8);
        byteBufferAllocate.put(bArr, 0, 4);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ByteBuffer wrapIntoBox(String str, ByteBuffer byteBuffer) {
        return wrapIntoBox(str.getBytes(StandardCharsets.UTF_8), byteBuffer);
    }
}
