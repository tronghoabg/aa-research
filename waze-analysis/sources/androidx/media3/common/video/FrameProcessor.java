package androidx.media3.common.video;

import androidx.media3.common.VideoFrameProcessingException;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface FrameProcessor extends AutoCloseable {

    /* compiled from: WazeSource */
    public interface Factory {
        FrameProcessor create(FrameWriter frameWriter, Executor executor, Listener listener);
    }

    /* compiled from: WazeSource */
    public interface Listener {
        void onError(VideoFrameProcessingException videoFrameProcessingException);

        void onFrameProcessed(Frame frame, SyncFenceWrapper syncFenceWrapper);

        void onWakeup();
    }

    @Override // java.lang.AutoCloseable
    void close();

    boolean queue(List<AsyncFrame> list);

    void signalEndOfStream();
}
