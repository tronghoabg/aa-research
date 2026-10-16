package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.Cue;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class WebvttCueInfo {
    public final Cue cue;
    public final long endTimeUs;
    public final long startTimeUs;

    public WebvttCueInfo(Cue cue, long j2, long j3) {
        this.cue = cue;
        this.startTimeUs = j2;
        this.endTimeUs = j3;
    }
}
