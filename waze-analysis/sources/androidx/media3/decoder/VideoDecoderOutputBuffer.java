package androidx.media3.decoder;

import androidx.media3.common.Format;
import androidx.media3.decoder.DecoderOutputBuffer;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class VideoDecoderOutputBuffer extends DecoderOutputBuffer {
    public static final int COLORSPACE_BT2020 = 3;
    public static final int COLORSPACE_BT601 = 1;
    public static final int COLORSPACE_BT709 = 2;
    public static final int COLORSPACE_UNKNOWN = 0;
    public int colorspace;
    public ByteBuffer data;
    public long decoderPrivate;
    public Format format;
    public int height;
    public int mode;
    private final DecoderOutputBuffer.Owner<VideoDecoderOutputBuffer> owner;
    public ByteBuffer supplementalData;
    public int uvStride;
    public int width;
    public int yStride;
    public ByteBuffer[] yuvPlanes;
    public int[] yuvStrides;

    public VideoDecoderOutputBuffer(DecoderOutputBuffer.Owner<VideoDecoderOutputBuffer> owner) {
        this.owner = owner;
    }

    private static boolean isSafeToMultiply(int i2, int i3) {
        if (i2 < 0 || i3 < 0) {
            return false;
        }
        return i3 <= 0 || i2 < Integer.MAX_VALUE / i3;
    }

    public void init(long j2, int i2, ByteBuffer byteBuffer) {
        this.timeUs = j2;
        this.mode = i2;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.supplementalData = null;
            return;
        }
        addFlag(268435456);
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 == null || byteBuffer2.capacity() < iLimit) {
            this.supplementalData = ByteBuffer.allocate(iLimit);
        } else {
            this.supplementalData.clear();
        }
        this.supplementalData.put(byteBuffer);
        this.supplementalData.flip();
        byteBuffer.position(0);
    }

    public boolean initForOffsetFrames(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ByteBuffer[] byteBufferArr = this.yuvPlanes;
        if (byteBufferArr == null) {
            byteBufferArr = new ByteBuffer[3];
            this.yuvPlanes = byteBufferArr;
        }
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            return false;
        }
        this.width = i3;
        this.height = i4;
        this.colorspace = i7;
        int i9 = i5 * i4;
        int i10 = (i4 >> 1) * i6;
        int i11 = i5 * i8;
        byteBuffer.position(i2);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferArr[0] = byteBufferSlice;
        byteBufferSlice.limit(i9);
        byteBuffer.position(i11 + i2);
        ByteBuffer byteBufferSlice2 = byteBuffer.slice();
        byteBufferArr[1] = byteBufferSlice2;
        byteBufferSlice2.limit(i10);
        byteBuffer.position(i11 + ((i8 >> 1) * i6) + i2);
        ByteBuffer byteBufferSlice3 = byteBuffer.slice();
        byteBufferArr[2] = byteBufferSlice3;
        byteBufferSlice3.limit(i10);
        int[] iArr = this.yuvStrides;
        if (iArr == null) {
            iArr = new int[3];
            this.yuvStrides = iArr;
        }
        iArr[0] = i5;
        iArr[1] = i6;
        iArr[2] = i6;
        return true;
    }

    public void initForPrivateFrame(int i2, int i3) {
        this.width = i2;
        this.height = i3;
    }

    public boolean initForYuvFrame(int i2, int i3, int i4, int i5, int i6) {
        int i7;
        this.width = i2;
        this.height = i3;
        this.colorspace = i6;
        this.yStride = i4;
        this.uvStride = i5;
        if (isSafeToMultiply(i4, i3)) {
            int i8 = (int) ((i3 + 1) / 2);
            if (isSafeToMultiply(i5, i8)) {
                int i9 = i3 * i4;
                int i10 = i8 * i5;
                if (isSafeToMultiply(i10, 2) && (i7 = i10 + i10 + i9) >= i9) {
                    ByteBuffer byteBuffer = this.data;
                    if (byteBuffer == null || byteBuffer.capacity() < i7) {
                        this.data = ByteBuffer.allocateDirect(i7);
                    } else {
                        this.data.position(0);
                        this.data.limit(i7);
                    }
                    ByteBuffer[] byteBufferArr = this.yuvPlanes;
                    if (byteBufferArr == null) {
                        byteBufferArr = new ByteBuffer[3];
                        this.yuvPlanes = byteBufferArr;
                    }
                    ByteBuffer byteBuffer2 = this.data;
                    ByteBuffer byteBufferSlice = byteBuffer2.slice();
                    byteBufferArr[0] = byteBufferSlice;
                    byteBufferSlice.limit(i9);
                    byteBuffer2.position(i9);
                    ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
                    byteBufferArr[1] = byteBufferSlice2;
                    byteBufferSlice2.limit(i10);
                    byteBuffer2.position(i9 + i10);
                    ByteBuffer byteBufferSlice3 = byteBuffer2.slice();
                    byteBufferArr[2] = byteBufferSlice3;
                    byteBufferSlice3.limit(i10);
                    int[] iArr = this.yuvStrides;
                    if (iArr == null) {
                        iArr = new int[3];
                        this.yuvStrides = iArr;
                    }
                    iArr[0] = i4;
                    iArr[1] = i5;
                    iArr[2] = i5;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.decoder.DecoderOutputBuffer
    public void release() {
        this.owner.releaseOutputBuffer(this);
    }
}
