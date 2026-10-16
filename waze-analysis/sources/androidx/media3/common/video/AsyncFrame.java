package androidx.media3.common.video;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AsyncFrame {
    public final SyncFenceWrapper acquireFence;
    public final Frame frame;

    public AsyncFrame(Frame frame, SyncFenceWrapper syncFenceWrapper) {
        this.frame = frame;
        this.acquireFence = syncFenceWrapper;
    }
}
