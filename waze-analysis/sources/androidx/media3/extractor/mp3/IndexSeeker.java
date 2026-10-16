package androidx.media3.extractor.mp3;

import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.SeekMap;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class IndexSeeker implements Seeker {
    static final long MIN_TIME_BETWEEN_POINTS_US = 100000;
    private final int averageBitrate;
    private final long dataEndPosition;
    private final long dataStartPosition;
    private final IndexSeekMap indexSeekMap;

    public IndexSeeker(long j2, long j3, long j4) {
        this.indexSeekMap = new IndexSeekMap(new long[]{j3}, new long[]{0}, j2);
        this.dataStartPosition = j3;
        this.dataEndPosition = j4;
        this.averageBitrate = Mp3Util.computeAverageBitrate(j4 - j3, j2);
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
        return this.dataStartPosition;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.indexSeekMap.getDurationUs();
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        return this.indexSeekMap.getSeekPoints(j2);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j2) {
        return this.indexSeekMap.getTimeUs(j2);
    }

    @Override // androidx.media3.extractor.SeekMap
    public /* synthetic */ boolean isEstimated() {
        return false;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.indexSeekMap.isSeekable();
    }

    public boolean isTimeUsInIndex(long j2) {
        return this.indexSeekMap.isTimeUsInIndex(j2, 100000L);
    }

    public void maybeAddSeekPoint(long j2, long j3) {
        if (isTimeUsInIndex(j2)) {
            return;
        }
        this.indexSeekMap.addSeekPoint(j2, j3);
    }

    void setDurationUs(long j2) {
        this.indexSeekMap.setDurationUs(j2);
    }
}
