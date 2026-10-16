package androidx.media3.extractor.text;

import androidx.media3.common.text.Cue;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface Subtitle {
    List<Cue> getCues(long j2);

    long getEventTime(int i2);

    int getEventTimeCount();

    int getNextEventTimeIndex(long j2);
}
