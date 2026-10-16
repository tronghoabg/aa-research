package androidx.media3.exoplayer.source.chunk;

import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class BaseMediaChunkIterator implements MediaChunkIterator {
    private long currentIndex;
    private final long fromIndex;
    private final long toIndex;

    public BaseMediaChunkIterator(long j2, long j3) {
        this.fromIndex = j2;
        this.toIndex = j3;
        reset();
    }

    protected final void checkInBounds() {
        long j2 = this.currentIndex;
        if (j2 < this.fromIndex || j2 > this.toIndex) {
            throw new NoSuchElementException();
        }
    }

    protected final long getCurrentIndex() {
        return this.currentIndex;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
    public boolean isEnded() {
        return this.currentIndex > this.toIndex;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
    public boolean next() {
        this.currentIndex++;
        return !isEnded();
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
    public void reset() {
        this.currentIndex = this.fromIndex - 1;
    }
}
