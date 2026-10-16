package androidx.media3.extractor.mp3;

import androidx.camera.video.AudioStats;
import androidx.media3.common.C;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class XingSeeker implements Seeker {
    private static final String TAG = "XingSeeker";
    private final int averageBitrate;
    private final long dataEndPosition;
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;
    private final long[] tableOfContents;
    private final int xingFrameSize;

    private XingSeeker(long j2, int i2, long j3, long j4, long[] jArr) {
        this.dataStartPosition = j2;
        this.xingFrameSize = i2;
        this.durationUs = j3;
        this.averageBitrate = Mp3Util.computeAverageBitrate(j4 - i2, j3);
        this.dataSize = j4;
        this.tableOfContents = jArr;
        this.dataEndPosition = j4 != -1 ? j2 + j4 : -1L;
    }

    public static XingSeeker create(XingFrame xingFrame, long j2, long j3) {
        long jComputeDurationUs = xingFrame.computeDurationUs();
        if (jComputeDurationUs == C.TIME_UNSET) {
            return null;
        }
        long jMin = xingFrame.dataSize;
        if (jMin != -1 && j3 != -1 && j2 + jMin != j3) {
            long j4 = j3 - j2;
            Log.i(TAG, "Data size mismatch between stream (" + j4 + ") and Xing frame (" + jMin + "), using smaller value.");
            jMin = Math.min(xingFrame.dataSize, j4);
        }
        return new XingSeeker(j2, xingFrame.header.frameSize, jComputeDurationUs, jMin, xingFrame.tableOfContents);
    }

    private long getTimeUsForTableIndex(int i2) {
        return (this.durationUs * i2) / 100;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.averageBitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataStartPosition() {
        return this.dataStartPosition + this.xingFrameSize;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.dataStartPosition + this.xingFrameSize));
        }
        long jConstrainValue = Util.constrainValue(j2, 0L, this.durationUs);
        double d2 = (jConstrainValue * 100.0d) / this.durationUs;
        double d3 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (d2 > AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i2 = (int) d2;
                long[] jArr = this.tableOfContents;
                an.B(jArr);
                double d4 = jArr[i2];
                d3 = d4 + ((d2 - i2) * ((i2 == 99 ? 256.0d : r3[i2 + 1]) - d4));
            }
        }
        long j3 = this.dataSize;
        return new SeekMap.SeekPoints(new SeekPoint(jConstrainValue, this.dataStartPosition + Util.constrainValue(Math.round((d3 / 256.0d) * j3), this.xingFrameSize, j3 - 1)));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j2) {
        if (!isSeekable()) {
            return 0L;
        }
        long j3 = j2 - this.dataStartPosition;
        if (j3 <= this.xingFrameSize) {
            return 0L;
        }
        long[] jArr = this.tableOfContents;
        an.B(jArr);
        double d2 = (j3 * 256.0d) / this.dataSize;
        long[] jArr2 = jArr;
        int iBinarySearchFloor = Util.binarySearchFloor(jArr2, (long) d2, true, true);
        long timeUsForTableIndex = getTimeUsForTableIndex(iBinarySearchFloor);
        long j4 = jArr2[iBinarySearchFloor];
        int i2 = iBinarySearchFloor + 1;
        long timeUsForTableIndex2 = getTimeUsForTableIndex(i2);
        return timeUsForTableIndex + Math.round((j4 == (iBinarySearchFloor == 99 ? 256L : jArr2[i2]) ? AudioStats.AUDIO_AMPLITUDE_NONE : (d2 - j4) / (r0 - j4)) * (timeUsForTableIndex2 - timeUsForTableIndex));
    }

    @Override // androidx.media3.extractor.SeekMap
    public /* synthetic */ boolean isEstimated() {
        return false;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.tableOfContents != null;
    }
}
