package androidx.media3.exoplayer.source;

import androidx.media3.common.C;
import androidx.media3.common.Format;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MediaLoadData {
    public final int dataType;
    public final long mediaEndTimeMs;
    public final long mediaStartTimeMs;
    public final Format trackFormat;
    public final Object trackSelectionData;
    public final int trackSelectionReason;
    public final int trackType;

    public MediaLoadData(int i2, int i3, Format format, int i4, Object obj, long j2, long j3) {
        this.dataType = i2;
        this.trackType = i3;
        this.trackFormat = format;
        this.trackSelectionReason = i4;
        this.trackSelectionData = obj;
        this.mediaStartTimeMs = j2;
        this.mediaEndTimeMs = j3;
    }

    public MediaLoadData(int i2) {
        this(i2, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }
}
