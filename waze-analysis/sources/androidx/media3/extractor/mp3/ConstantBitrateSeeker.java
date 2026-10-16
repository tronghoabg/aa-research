package androidx.media3.extractor.mp3;

import androidx.media3.common.C;
import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {
    private final long dataEndPosition;
    private final long durationUs;

    public ConstantBitrateSeeker(long j2, long j3, MpegAudioUtil.Header header, boolean z) {
        this(j2, j3, header.bitrate, header.frameSize, z, C.TIME_UNSET);
    }

    public ConstantBitrateSeeker copyWithNewDataEndPosition(long j2) {
        return new ConstantBitrateSeeker(j2, getFirstFramePosition(), getAverageBitrate(), getFrameSize(), shouldAllowSeeksIfLengthUnknown(), false, this.durationUs);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return getBitrate();
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataStartPosition() {
        return getFirstFramePosition();
    }

    @Override // androidx.media3.extractor.ConstantBitrateSeekMap, androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        long j2 = this.durationUs;
        return j2 != C.TIME_UNSET ? j2 : super.getDurationUs();
    }

    @Override // androidx.media3.extractor.ConstantBitrateSeekMap, androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        long j3 = this.durationUs;
        if (j3 != C.TIME_UNSET && j2 >= j3) {
            long j4 = this.dataEndPosition;
            if (j4 != -1) {
                return new SeekMap.SeekPoints(new SeekPoint(Math.max(0L, this.durationUs - getTimeUsAtPosition(getFirstFramePosition() + getFrameSize())), Math.max(getFirstFramePosition(), j4 - getFrameSize())));
            }
        }
        return super.getSeekPoints(j2);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j2) {
        return getTimeUsAtPosition(j2);
    }

    private ConstantBitrateSeeker(long j2, long j3, int i2, int i3, boolean z, boolean z2, long j4) {
        super(j2, j3, i2, i3, z, z2);
        this.durationUs = j4;
        this.dataEndPosition = j2 == -1 ? -1L : j2;
    }

    public ConstantBitrateSeeker(long j2, long j3, int i2, int i3, boolean z, long j4) {
        this(j2, j3, i2, i3, z, true, j4);
    }
}
