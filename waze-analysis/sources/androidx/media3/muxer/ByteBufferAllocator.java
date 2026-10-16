package androidx.media3.muxer;

import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface ByteBufferAllocator {
    public static final ByteBufferAllocator DEFAULT = new ByteBufferAllocator() { // from class: androidx.media3.muxer.ByteBufferAllocator$$ExternalSyntheticLambda0
        @Override // androidx.media3.muxer.ByteBufferAllocator
        public final ByteBuffer allocate(int i2) {
            return ByteBuffer.allocateDirect(i2);
        }
    };

    ByteBuffer allocate(int i2);
}
