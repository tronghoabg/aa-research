package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Util;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class FixedSampleSizeRechunker {
    private static final int MAX_SAMPLE_SIZE = 8192;

    /* compiled from: WazeSource */
    public final class Results {
        public final long duration;
        public final int[] flags;
        public final int maximumSize;
        public final long[] offsets;
        public final int[] sizes;
        public final long[] timestamps;
        public final long totalSize;

        private Results(long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j2, long j3) {
            this.offsets = jArr;
            this.sizes = iArr;
            this.maximumSize = i2;
            this.timestamps = jArr2;
            this.flags = iArr2;
            this.duration = j2;
            this.totalSize = j3;
        }
    }

    private FixedSampleSizeRechunker() {
    }

    public static Results rechunk(int i2, long[] jArr, int[] iArr, long j2) {
        int[] iArr2 = iArr;
        int i3 = 8192 / i2;
        int i4 = 0;
        int iCeilDivide = 0;
        for (int i5 : iArr2) {
            iCeilDivide += Util.ceilDivide(i5, i3);
        }
        long[] jArr2 = new long[iCeilDivide];
        int[] iArr3 = new int[iCeilDivide];
        long[] jArr3 = new long[iCeilDivide];
        int[] iArr4 = new int[iCeilDivide];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int iMax = 0;
        while (i4 < iArr2.length) {
            int i9 = iArr2[i4];
            long j3 = jArr[i4];
            while (i9 > 0) {
                int iMin = Math.min(i3, i9);
                jArr2[i8] = j3;
                int i10 = i2 * iMin;
                iArr3[i8] = i10;
                i7 += i10;
                iMax = Math.max(iMax, i10);
                jArr3[i8] = i6 * j2;
                iArr4[i8] = 1;
                j3 += iArr3[i8];
                i6 += iMin;
                i9 -= iMin;
                i8++;
                i3 = i3;
            }
            i4++;
            iArr2 = iArr;
        }
        return new Results(jArr2, iArr3, iMax, jArr3, iArr4, j2 * i6, i7);
    }
}
