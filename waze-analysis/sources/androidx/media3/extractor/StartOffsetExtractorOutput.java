package androidx.media3.extractor;

import androidx.media3.extractor.SeekMap;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class StartOffsetExtractorOutput implements ExtractorOutput {
    private final ExtractorOutput extractorOutput;
    private final long startOffset;

    public StartOffsetExtractorOutput(long j2, ExtractorOutput extractorOutput) {
        this.startOffset = j2;
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(final SeekMap seekMap) {
        this.extractorOutput.seekMap(new ForwardingSeekMap(this, seekMap) { // from class: androidx.media3.extractor.StartOffsetExtractorOutput.1
            final /* synthetic */ StartOffsetExtractorOutput this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // androidx.media3.extractor.ForwardingSeekMap, androidx.media3.extractor.SeekMap
            public SeekMap.SeekPoints getSeekPoints(long j2) {
                SeekMap.SeekPoints seekPoints = seekMap.getSeekPoints(j2);
                SeekPoint seekPoint = seekPoints.first;
                SeekPoint seekPoint2 = new SeekPoint(seekPoint.timeUs, seekPoint.position + this.this$0.startOffset);
                SeekPoint seekPoint3 = seekPoints.second;
                return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(seekPoint3.timeUs, seekPoint3.position + this.this$0.startOffset));
            }
        });
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i2, int i3) {
        return this.extractorOutput.track(i2, i3);
    }
}
