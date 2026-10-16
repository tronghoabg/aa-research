package androidx.media3.common.video;

import androidx.media3.common.Format;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface FrameWriter extends AutoCloseable {

    /* compiled from: WazeSource */
    public interface Info {
        boolean isSupported(Format format, long j2);
    }

    @Override // java.lang.AutoCloseable
    void close();

    void configure(Format format, long j2);

    AsyncFrame dequeueInputFrame(Executor executor, Runnable runnable);

    Info getInfo();

    void queueInputFrame(Frame frame, SyncFenceWrapper syncFenceWrapper);

    void signalEndOfStream();
}
