package androidx.media3.muxer;

import com.google.d.b.an;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class LinearByteBufferAllocator implements ByteBufferAllocator {
    private ByteBuffer memoryPool;

    public LinearByteBufferAllocator(int i2) {
        an.l(i2 >= 0);
        this.memoryPool = ByteBuffer.allocateDirect(i2);
    }

    @Override // androidx.media3.muxer.ByteBufferAllocator
    public ByteBuffer allocate(int i2) {
        an.l(i2 >= 0);
        if (this.memoryPool.remaining() < i2) {
            int iCapacity = this.memoryPool.capacity();
            this.memoryPool = ByteBuffer.allocateDirect(Math.max(i2, iCapacity + iCapacity));
        }
        ByteBuffer byteBufferSlice = this.memoryPool.slice();
        ByteBuffer byteBuffer = this.memoryPool;
        byteBuffer.position(byteBuffer.position() + i2);
        byteBufferSlice.limit(i2);
        return byteBufferSlice;
    }

    public void reset() {
        this.memoryPool.clear();
    }
}
