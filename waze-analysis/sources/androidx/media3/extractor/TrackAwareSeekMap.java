package androidx.media3.extractor;

import androidx.media3.extractor.SeekMap;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface TrackAwareSeekMap extends SeekMap {
    SeekMap.SeekPoints getSeekPoints(long j2, int i2);

    boolean isSeekable(int i2);
}
