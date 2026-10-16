package androidx.media3.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.media3.common.util.TimestampIterator;
import com.google.d.d.bn;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface VideoFrameProcessor {
    public static final long DROP_OUTPUT_FRAME = -2;
    public static final int INPUT_TYPE_BITMAP = 2;
    public static final int INPUT_TYPE_SURFACE = 1;
    public static final int INPUT_TYPE_SURFACE_AUTOMATIC_FRAME_REGISTRATION = 4;
    public static final int INPUT_TYPE_TEXTURE_ID = 3;
    public static final bn<Effect> REDRAW = bn.q(new Effect() { // from class: androidx.media3.common.VideoFrameProcessor.1
        @Override // androidx.media3.common.Effect
        public /* synthetic */ long getDurationAfterEffectApplied(long j2) {
            return j2;
        }
    });

    @Deprecated
    public static final long RENDER_OUTPUT_FRAME_IMMEDIATELY = -1;
    public static final long RENDER_OUTPUT_FRAME_WITH_PRESENTATION_TIME = -3;

    /* compiled from: WazeSource */
    public interface Factory {
        VideoFrameProcessor create(Context context, DebugViewProvider debugViewProvider, ColorInfo colorInfo, boolean z, Executor executor, Listener listener);
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InputType {
    }

    /* compiled from: WazeSource */
    public interface Listener {

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.common.VideoFrameProcessor$Listener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onEnded(Listener listener) {
            }

            public static void $default$onError(Listener listener, VideoFrameProcessingException videoFrameProcessingException) {
            }

            public static void $default$onInputStreamRegistered(Listener listener, int i2, Format format, List list) {
            }

            public static void $default$onOutputFrameAvailableForRendering(Listener listener, long j2, boolean z) {
            }

            public static void $default$onOutputFrameRateChanged(Listener listener, float f2) {
            }

            public static void $default$onOutputSizeChanged(Listener listener, int i2, int i3) {
            }
        }

        void onEnded();

        void onError(VideoFrameProcessingException videoFrameProcessingException);

        void onInputStreamRegistered(int i2, Format format, List<Effect> list);

        void onOutputFrameAvailableForRendering(long j2, boolean z);

        void onOutputFrameRateChanged(float f2);

        void onOutputSizeChanged(int i2, int i3);
    }

    void flush();

    Surface getInputSurface();

    int getPendingInputFrameCount();

    boolean queueInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator);

    boolean queueInputTexture(int i2, long j2);

    void redraw();

    boolean registerInputFrame();

    void registerInputStream(int i2, Format format, List<Effect> list, long j2);

    void release();

    void renderOutputFrame(long j2);

    void setOnInputFrameProcessedListener(OnInputFrameProcessedListener onInputFrameProcessedListener);

    void setOnInputSurfaceReadyListener(Runnable runnable);

    void setOutputSurfaceInfo(SurfaceInfo surfaceInfo);

    void signalEndOfInput();
}
