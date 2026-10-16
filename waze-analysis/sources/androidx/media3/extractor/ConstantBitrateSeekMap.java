package androidx.media3.extractor;

import androidx.media3.common.C;
import androidx.media3.extractor.SeekMap;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ConstantBitrateSeekMap implements SeekMap {
    private final boolean allowSeeksIfLengthUnknown;
    private final int bitrate;
    private final long dataSize;
    private final long durationUs;
    private final long firstFrameBytePosition;
    private final int frameSize;
    private final long inputLength;
    private final boolean isEstimated;

    protected ConstantBitrateSeekMap(long j2, long j3, int i2, int i3, boolean z, boolean z2) {
        long timeUsAtPosition;
        this.inputLength = j2;
        this.firstFrameBytePosition = j3;
        this.frameSize = i3 == -1 ? 1 : i3;
        this.bitrate = i2;
        this.allowSeeksIfLengthUnknown = z;
        this.isEstimated = z2;
        if (j2 == -1) {
            this.dataSize = -1L;
            timeUsAtPosition = C.TIME_UNSET;
        } else {
            this.dataSize = j2 - j3;
            timeUsAtPosition = getTimeUsAtPosition(j2, j3, i2);
        }
        this.durationUs = timeUsAtPosition;
    }

    private long getFramePositionForTimeUs(long j2) {
        long j3 = this.frameSize;
        long jMin = (((j2 * this.bitrate) / 8000000) / j3) * j3;
        long j4 = this.dataSize;
        if (j4 != -1) {
            jMin = Math.min(jMin, j4 - j3);
        }
        return this.firstFrameBytePosition + Math.max(jMin, 0L);
    }

    private static long getTimeUsAtPosition(long j2, long j3, int i2) {
        return (Math.max(0L, j2 - j3) * 8000000) / i2;
    }

    protected final int getBitrate() {
        return this.bitrate;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    protected final long getFirstFramePosition() {
        return this.firstFrameBytePosition;
    }

    protected final int getFrameSize() {
        return this.frameSize;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        if (this.dataSize == -1 && !this.allowSeeksIfLengthUnknown) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstFrameBytePosition));
        }
        long framePositionForTimeUs = getFramePositionForTimeUs(j2);
        long timeUsAtPosition = getTimeUsAtPosition(framePositionForTimeUs);
        SeekPoint seekPoint = new SeekPoint(timeUsAtPosition, framePositionForTimeUs);
        if (this.dataSize != -1 && timeUsAtPosition < j2) {
            long j3 = framePositionForTimeUs + this.frameSize;
            if (j3 < this.inputLength) {
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUsAtPosition(j3), j3));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isEstimated() {
        return this.isEstimated;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.dataSize != -1 || this.allowSeeksIfLengthUnknown;
    }

    protected final boolean shouldAllowSeeksIfLengthUnknown() {
        return this.allowSeeksIfLengthUnknown;
    }

    public long getTimeUsAtPosition(long j2) {
        return getTimeUsAtPosition(j2, this.firstFrameBytePosition, this.bitrate);
    }

    public ConstantBitrateSeekMap(long j2, long j3, int i2, int i3, boolean z) {
        this(j2, j3, i2, i3, z, true);
    }

    public ConstantBitrateSeekMap(long j2, long j3, int i2, int i3) {
        this(j2, j3, i2, i3, false);
    }
}
