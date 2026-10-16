package androidx.media3.exoplayer.text;

import androidx.media3.common.text.Cue;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.d.d.bn;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
interface CuesResolver {
    boolean addCues(CuesWithTiming cuesWithTiming, long j2);

    void clear();

    void discardCuesBeforeTimeUs(long j2);

    bn<Cue> getCuesAtTimeUs(long j2);

    long getNextCueChangeTimeUs(long j2);

    long getPreviousCueChangeTimeUs(long j2);
}
