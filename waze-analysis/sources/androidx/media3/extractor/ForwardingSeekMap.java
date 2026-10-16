package androidx.media3.extractor;

import androidx.media3.extractor.SeekMap;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ForwardingSeekMap implements SeekMap {
    private final SeekMap seekMap;

    public ForwardingSeekMap(SeekMap seekMap) {
        this.seekMap = seekMap;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.seekMap.getDurationUs();
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        return this.seekMap.getSeekPoints(j2);
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isEstimated() {
        return this.seekMap.isEstimated();
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.seekMap.isSeekable();
    }
}
