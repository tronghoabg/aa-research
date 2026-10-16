package androidx.media3.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.media3.common.util.TimestampIterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface VideoGraph {

    /* compiled from: WazeSource */
    public interface Factory {
        VideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, Listener listener, Executor executor, long j2, boolean z);

        boolean supportsMultipleInputs();
    }

    /* compiled from: WazeSource */
    public interface Listener {

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.common.VideoGraph$Listener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onEnded(Listener listener, long j2) {
            }

            public static void $default$onError(Listener listener, VideoFrameProcessingException videoFrameProcessingException) {
            }

            public static void $default$onOutputFrameAvailableForRendering(Listener listener, long j2, boolean z) {
            }

            public static void $default$onOutputFrameRateChanged(Listener listener, float f2) {
            }

            public static void $default$onOutputSizeChanged(Listener listener, int i2, int i3) {
            }
        }

        void onEnded(long j2);

        void onError(VideoFrameProcessingException videoFrameProcessingException);

        void onOutputFrameAvailableForRendering(long j2, boolean z);

        void onOutputFrameRateChanged(float f2);

        void onOutputSizeChanged(int i2, int i3);
    }

    void flush();

    Surface getInputSurface(int i2);

    int getPendingInputFrameCount(int i2);

    boolean hasProducedFrameWithTimestampZero();

    void initialize();

    boolean queueInputBitmap(int i2, Bitmap bitmap, TimestampIterator timestampIterator);

    boolean queueInputTexture(int i2, int i3, long j2);

    void redraw();

    void registerInput(int i2);

    boolean registerInputFrame(int i2);

    void registerInputStream(int i2, int i3, Format format, List<Effect> list, long j2);

    void release();

    void renderOutputFrame(long j2);

    void setCompositionEffects(List<Effect> list);

    void setCompositorSettings(VideoCompositorSettings videoCompositorSettings);

    void setOnInputFrameProcessedListener(int i2, OnInputFrameProcessedListener onInputFrameProcessedListener);

    void setOnInputSurfaceReadyListener(int i2, Runnable runnable);

    void setOutputSurfaceInfo(SurfaceInfo surfaceInfo);

    void signalEndOfInput(int i2);
}
