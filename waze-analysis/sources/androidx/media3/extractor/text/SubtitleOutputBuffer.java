package androidx.media3.extractor.text;

import androidx.media3.common.text.Cue;
import androidx.media3.decoder.DecoderOutputBuffer;
import com.google.d.b.an;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class SubtitleOutputBuffer extends DecoderOutputBuffer implements Subtitle {
    private long subsampleOffsetUs;
    private Subtitle subtitle;

    @Override // androidx.media3.decoder.DecoderOutputBuffer, androidx.media3.decoder.Buffer
    public void clear() {
        super.clear();
        this.subtitle = null;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public List<Cue> getCues(long j2) {
        Subtitle subtitle = this.subtitle;
        an.B(subtitle);
        return subtitle.getCues(j2 - this.subsampleOffsetUs);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i2) {
        Subtitle subtitle = this.subtitle;
        an.B(subtitle);
        return subtitle.getEventTime(i2) + this.subsampleOffsetUs;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        Subtitle subtitle = this.subtitle;
        an.B(subtitle);
        return subtitle.getEventTimeCount();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j2) {
        Subtitle subtitle = this.subtitle;
        an.B(subtitle);
        return subtitle.getNextEventTimeIndex(j2 - this.subsampleOffsetUs);
    }

    public void setContent(long j2, Subtitle subtitle, long j3) {
        this.timeUs = j2;
        this.subtitle = subtitle;
        if (j3 != Long.MAX_VALUE) {
            j2 = j3;
        }
        this.subsampleOffsetUs = j2;
    }
}
