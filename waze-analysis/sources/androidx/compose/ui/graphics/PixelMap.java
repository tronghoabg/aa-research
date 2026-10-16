package androidx.compose.ui.graphics;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PixelMap {
    public static final int $stable = 8;
    private final int[] buffer;
    private final int bufferOffset;
    private final int height;
    private final int stride;
    private final int width;

    public PixelMap(int[] iArr, int i2, int i3, int i4, int i5) {
        this.buffer = iArr;
        this.width = i2;
        this.height = i3;
        this.bufferOffset = i4;
        this.stride = i5;
    }

    /* renamed from: get-WaAFU9c, reason: not valid java name */
    public final long m8569getWaAFU9c(int i2, int i3) {
        return ColorKt.Color(this.buffer[this.bufferOffset + (i3 * this.stride) + i2]);
    }

    public final int[] getBuffer() {
        return this.buffer;
    }

    public final int getBufferOffset() {
        return this.bufferOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getStride() {
        return this.stride;
    }

    public final int getWidth() {
        return this.width;
    }
}
