package androidx.media3.common;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final Timeline timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(Timeline timeline, int i2, long j2) {
        this.timeline = timeline;
        this.windowIndex = i2;
        this.positionMs = j2;
    }
}
