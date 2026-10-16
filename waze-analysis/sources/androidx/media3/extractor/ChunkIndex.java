package androidx.media3.extractor;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ChunkIndex implements SeekMap {
    private final long durationUs;
    public final long[] durationsUs;
    public final int length;
    public final long[] offsets;
    public final int[] sizes;
    public final long[] timesUs;

    public ChunkIndex(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.sizes = iArr;
        this.offsets = jArr;
        this.durationsUs = jArr2;
        this.timesUs = jArr3;
        int length = iArr.length;
        this.length = length;
        if (length <= 0) {
            this.durationUs = 0L;
        } else {
            int i2 = length - 1;
            this.durationUs = jArr2[i2] + jArr3[i2];
        }
    }

    public int getChunkIndex(long j2) {
        return Util.binarySearchFloor(this.timesUs, j2, true, true);
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        long[] jArr = this.timesUs;
        int chunkIndex = getChunkIndex(j2);
        SeekPoint seekPoint = new SeekPoint(jArr[chunkIndex], this.offsets[chunkIndex]);
        if (seekPoint.timeUs >= j2 || chunkIndex == this.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i2 = chunkIndex + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs[i2], this.offsets[i2]));
    }

    @Override // androidx.media3.extractor.SeekMap
    public /* synthetic */ boolean isEstimated() {
        return false;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public String toString() {
        long[] jArr = this.durationsUs;
        long[] jArr2 = this.timesUs;
        long[] jArr3 = this.offsets;
        return "ChunkIndex(length=" + this.length + ", sizes=" + Arrays.toString(this.sizes) + ", offsets=" + Arrays.toString(jArr3) + ", timeUs=" + Arrays.toString(jArr2) + ", durationsUs=" + Arrays.toString(jArr) + ")";
    }
}
