package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SniffFailure;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AtomSizeTooSmallSniffFailure implements SniffFailure {
    public final long atomSize;
    public final int atomType;
    public final int minimumHeaderSize;

    public AtomSizeTooSmallSniffFailure(int i2, long j2, int i3) {
        this.atomType = i2;
        this.atomSize = j2;
        this.minimumHeaderSize = i3;
    }

    public String toString() {
        return "AtomSizeTooSmall{type=" + Util.toFourccString(this.atomType) + ", size=" + this.atomSize + ", minHeaderSize=" + this.minimumHeaderSize + "}";
    }
}
