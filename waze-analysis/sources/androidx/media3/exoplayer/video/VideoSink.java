package androidx.media3.exoplayer.video;

import android.graphics.Bitmap;
import android.view.Surface;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TimestampIterator;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface VideoSink {
    public static final int INPUT_TYPE_BITMAP = 2;
    public static final int INPUT_TYPE_SURFACE = 1;
    public static final int RELEASE_FIRST_FRAME_IMMEDIATELY = 0;
    public static final int RELEASE_FIRST_FRAME_WHEN_PREVIOUS_STREAM_PROCESSED = 2;
    public static final int RELEASE_FIRST_FRAME_WHEN_STARTED = 1;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FirstFrameReleaseInstruction {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InputType {
    }

    /* compiled from: WazeSource */
    public interface Listener {
        public static final Listener NO_OP = new Listener() { // from class: androidx.media3.exoplayer.video.VideoSink.Listener.1
            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public /* synthetic */ void onError(VideoSinkException videoSinkException) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public /* synthetic */ void onFirstFrameRendered() {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public /* synthetic */ void onFrameAvailableForRendering() {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public /* synthetic */ void onFrameDropped() {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            }
        };

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.exoplayer.video.VideoSink$Listener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onError(Listener listener, VideoSinkException videoSinkException) {
            }

            public static void $default$onFirstFrameRendered(Listener listener) {
            }

            public static void $default$onFrameAvailableForRendering(Listener listener) {
            }

            public static void $default$onFrameDropped(Listener listener) {
            }

            public static void $default$onVideoSizeChanged(Listener listener, VideoSize videoSize) {
            }
        }

        void onError(VideoSinkException videoSinkException);

        void onFirstFrameRendered();

        void onFrameAvailableForRendering();

        void onFrameDropped();

        void onVideoSizeChanged(VideoSize videoSize);
    }

    /* compiled from: WazeSource */
    public interface VideoFrameHandler {
        void render(long j2);

        void skip();
    }

    /* compiled from: WazeSource */
    public final class VideoSinkException extends Exception {
        public final Format format;

        public VideoSinkException(Throwable th, Format format) {
            super(th);
            this.format = format;
        }
    }

    void allowReleaseFirstFrameBeforeStarted();

    void clearOutputSurfaceInfo();

    void flush(boolean z);

    Surface getInputSurface();

    boolean handleInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator);

    boolean handleInputFrame(long j2, VideoFrameHandler videoFrameHandler);

    boolean initialize(Format format);

    boolean isEnded();

    boolean isInitialized();

    boolean isReady(boolean z);

    void join(boolean z);

    void onInputStreamChanged(int i2, Format format, long j2, int i3, List<Effect> list);

    void redraw();

    void release();

    void render(long j2, long j3);

    void setBufferTimestampAdjustmentUs(long j2);

    void setChangeFrameRateStrategy(int i2);

    void setListener(Listener listener, Executor executor);

    void setOutputSurfaceInfo(Surface surface, Size size);

    void setPlaybackSpeed(float f2);

    void setVideoEffects(List<Effect> list);

    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    void signalEndOfCurrentInputStream();

    void signalEndOfInput();

    void startRendering();

    void stopRendering();
}
