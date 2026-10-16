package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Util;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TrackSampleTable {
    public final long durationUs;
    public final int[] flags;
    public final boolean hasOnlySyncSamples;
    public final int maximumSize;
    public final long[] offsets;
    public final int sampleCount;
    public final int[] sizes;
    public final int[] syncSampleIndices;
    public final long[] timestampsUs;
    public final Track track;

    public TrackSampleTable(Track track, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, int[] iArr3, boolean z, long j2, int i3) {
        int length = iArr.length;
        int length2 = jArr2.length;
        an.l(length == length2);
        an.l(jArr.length == length2);
        int length3 = iArr2.length;
        an.l(length3 == length2);
        this.track = track;
        this.offsets = jArr;
        this.sizes = iArr;
        this.maximumSize = i2;
        this.timestampsUs = jArr2;
        this.flags = iArr2;
        this.syncSampleIndices = iArr3;
        this.hasOnlySyncSamples = z;
        this.durationUs = j2;
        this.sampleCount = i3;
        if (length3 > 0) {
            int i4 = length3 - 1;
            iArr2[i4] = iArr2[i4] | 536870912;
        }
    }

    public int getIndexOfEarlierOrEqualSynchronizationSample(long j2) {
        if (hasSampleTableData()) {
            int i2 = 0;
            if (this.hasOnlySyncSamples) {
                return Util.binarySearchFloor(this.timestampsUs, j2, true, false);
            }
            int length = this.syncSampleIndices.length - 1;
            int i3 = -1;
            while (i2 <= length) {
                int i4 = ((length - i2) / 2) + i2;
                if (this.timestampsUs[this.syncSampleIndices[i4]] <= j2) {
                    i2 = i4 + 1;
                    i3 = i4;
                } else {
                    length = i4 - 1;
                }
            }
            if (i3 != -1) {
                long j3 = this.timestampsUs[this.syncSampleIndices[i3]];
                if (j3 == j2) {
                    while (i3 > 0) {
                        int i5 = i3 - 1;
                        if (this.timestampsUs[this.syncSampleIndices[i5]] != j3) {
                            break;
                        }
                        i3 = i5;
                    }
                }
                return this.syncSampleIndices[i3];
            }
        }
        return -1;
    }

    public int getIndexOfLaterOrEqualSynchronizationSample(long j2) {
        if (hasSampleTableData()) {
            int i2 = 0;
            if (this.hasOnlySyncSamples) {
                return Util.binarySearchCeil(this.timestampsUs, j2, true, false);
            }
            int length = this.syncSampleIndices.length - 1;
            int i3 = -1;
            while (i2 <= length) {
                int i4 = ((length - i2) / 2) + i2;
                if (this.timestampsUs[this.syncSampleIndices[i4]] >= j2) {
                    length = i4 - 1;
                    i3 = i4;
                } else {
                    i2 = i4 + 1;
                }
            }
            if (i3 != -1) {
                long[] jArr = this.timestampsUs;
                int[] iArr = this.syncSampleIndices;
                long j3 = jArr[iArr[i3]];
                if (j3 == j2) {
                    while (true) {
                        iArr = this.syncSampleIndices;
                        if (i3 >= iArr.length - 1) {
                            break;
                        }
                        int i5 = i3 + 1;
                        if (this.timestampsUs[iArr[i5]] != j3) {
                            break;
                        }
                        i3 = i5;
                    }
                }
                return iArr[i3];
            }
        }
        return -1;
    }

    public boolean hasSampleTableData() {
        return this.timestampsUs.length > 0;
    }
}
