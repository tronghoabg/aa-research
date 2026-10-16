package androidx.media3.extractor.text;

import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import com.google.d.d.bn;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class CuesWithTiming {
    public final bn<Cue> cues;
    public final long durationUs;
    public final long endTimeUs;
    public final long startTimeUs;

    public CuesWithTiming(List<Cue> list, long j2, long j3) {
        this.cues = bn.n(list);
        this.startTimeUs = j2;
        this.durationUs = j3;
        long j4 = C.TIME_UNSET;
        if (j2 != C.TIME_UNSET && j3 != C.TIME_UNSET) {
            j4 = j2 + j3;
        }
        this.endTimeUs = j4;
    }
}
