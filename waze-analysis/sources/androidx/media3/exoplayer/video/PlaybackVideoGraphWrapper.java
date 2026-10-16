package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.collection.SieveCacheKt;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.SurfaceInfo;
import androidx.media3.common.VideoCompositorSettings;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.VideoSink;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.d.b.aj;
import com.google.d.b.an;
import com.google.d.d.bn;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PlaybackVideoGraphWrapper implements VideoGraph.Listener {
    public static final long LATE_US_TO_DROP_INPUT_FRAME = 15000;
    private static final Executor NO_OP_EXECUTOR = new Executor() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$$ExternalSyntheticLambda1
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };
    private static final int PRIMARY_SEQUENCE_INDEX = 0;
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_RELEASED = 2;
    private static final String TAG = "PlaybackVidGraphWrapper";
    private final Clock clock;
    private bn<Effect> compositionEffects;
    private VideoCompositorSettings compositorSettings;
    private final Context context;
    private Pair<Surface, Size> currentSurfaceAndSize;
    private final VideoSink defaultVideoSink;
    private final long earlyThresholdToDropInputUs;
    private final boolean enablePlaylistMode;
    private long finalFramePresentationTimeUs;
    private HandlerWrapper handler;
    private boolean hasSignaledEndOfVideoGraphOutputStream;
    private final SparseArray<InputVideoSink> inputVideoSinks;
    private boolean isInputSdrToneMapped;
    private long lastOutputFramePresentationTimeUs;
    private final CopyOnWriteArraySet<Listener> listeners;
    private int outputStreamFirstFrameReleaseInstruction;
    private long outputStreamStartPositionUs;
    private int pendingFlushCount;
    private TimedValueQueue<StreamChangeInfo> pendingStreamChanges;
    private int registeredVideoInputCount;
    private boolean requestOpenGlToneMapping;
    private int state;
    private int totalVideoInputCount;
    private final VideoSink.VideoFrameHandler videoFrameHandler;
    private VideoFrameMetadataListener videoFrameMetadataListener;
    private final VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster;
    private VideoGraph videoGraph;
    private final VideoGraph.Factory videoGraphFactory;
    private Format videoGraphOutputFormat;

    /* compiled from: WazeSource */
    public final class Builder {
        private boolean built;
        private final Context context;
        private boolean enablePlaylistMode;
        private boolean enableReplayableCache;
        private final VideoFrameReleaseControl videoFrameReleaseControl;
        private VideoGraph.Factory videoGraphFactory;
        private long lateThresholdToDropInputUs = 15000;
        private VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = new VideoFrameReleaseEarlyTimeForecaster(1.0f);
        private Clock clock = Clock.DEFAULT;

        public Builder(Context context, VideoFrameReleaseControl videoFrameReleaseControl) {
            this.context = context.getApplicationContext();
            this.videoFrameReleaseControl = videoFrameReleaseControl;
        }

        public PlaybackVideoGraphWrapper build() {
            an.u(!this.built);
            if (this.videoGraphFactory == null) {
                this.videoGraphFactory = new ReflectiveSingleInputVideoGraphFactory(this.enableReplayableCache);
            }
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = new PlaybackVideoGraphWrapper(this);
            this.built = true;
            return playbackVideoGraphWrapper;
        }

        public Builder experimentalSetLateThresholdToDropInputUs(long j2) {
            this.lateThresholdToDropInputUs = j2;
            return this;
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public Builder setEnablePlaylistMode(boolean z) {
            this.enablePlaylistMode = z;
            return this;
        }

        public Builder setEnableReplayableCache(boolean z) {
            this.enableReplayableCache = z;
            return this;
        }

        Builder setVideoFrameReleaseEarlyTimeForecaster(VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster) {
            this.videoFrameReleaseEarlyTimeForecaster = videoFrameReleaseEarlyTimeForecaster;
            return this;
        }

        public Builder setVideoGraphFactory(VideoGraph.Factory factory) {
            this.videoGraphFactory = factory;
            return this;
        }
    }

    /* compiled from: WazeSource */
    final class DefaultVideoSinkListener implements VideoSink.Listener {
        final /* synthetic */ PlaybackVideoGraphWrapper this$0;

        private DefaultVideoSinkListener(PlaybackVideoGraphWrapper playbackVideoGraphWrapper) {
            Objects.requireNonNull(playbackVideoGraphWrapper);
            this.this$0 = playbackVideoGraphWrapper;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onError(VideoSink.VideoSinkException videoSinkException) {
            Iterator it = this.this$0.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onError(VideoFrameProcessingException.from(videoSinkException));
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onFirstFrameRendered() {
            Iterator it = this.this$0.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onFirstFrameRendered();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public /* synthetic */ void onFrameAvailableForRendering() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onFrameDropped() {
            Iterator it = this.this$0.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onFrameDropped();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onVideoSizeChanged(VideoSize videoSize) {
            Iterator it = this.this$0.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onVideoSizeChanged(videoSize);
            }
        }
    }

    /* compiled from: WazeSource */
    final class InputVideoSink implements VideoSink, Listener {
        private static final int MAX_CONSECUTIVE_FRAMES_TO_DROP = 2;
        private int consecutiveDroppedFrames;
        private long inputBufferTimestampAdjustmentUs;
        private Format inputFormat;
        private final int inputIndex;
        private int inputType;
        private boolean isInitialized;
        private long lastFramePresentationTimeUs;
        private VideoSink.Listener listener;
        private Executor listenerExecutor;
        private boolean signaledEndOfStream;
        final /* synthetic */ PlaybackVideoGraphWrapper this$0;
        private bn<Effect> videoEffects;
        private final int videoFrameProcessorMaxPendingFrameCount;

        public InputVideoSink(PlaybackVideoGraphWrapper playbackVideoGraphWrapper, Context context, int i2) {
            Objects.requireNonNull(playbackVideoGraphWrapper);
            this.this$0 = playbackVideoGraphWrapper;
            this.inputIndex = i2;
            this.videoFrameProcessorMaxPendingFrameCount = Util.getMaxPendingFramesCountForMediaCodecDecoders(context);
            this.videoEffects = bn.p();
            this.lastFramePresentationTimeUs = C.TIME_UNSET;
            this.listener = VideoSink.Listener.NO_OP;
            this.listenerExecutor = PlaybackVideoGraphWrapper.NO_OP_EXECUTOR;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$0(VideoSink.Listener listener, VideoFrameProcessingException videoFrameProcessingException) {
            Format format = this.inputFormat;
            an.B(format);
            listener.onError(new VideoSink.VideoSinkException(videoFrameProcessingException, format));
        }

        private void registerInputStream(Format format) {
            Format.Builder builderBuildUpon = format.buildUpon();
            builderBuildUpon.setColorInfo(this.this$0.getAdjustedInputColorInfo(format.colorInfo));
            Format formatBuild = builderBuildUpon.build();
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = this.this$0;
            int i2 = this.inputType;
            VideoGraph videoGraph = playbackVideoGraphWrapper.videoGraph;
            an.B(videoGraph);
            videoGraph.registerInputStream(this.inputIndex, i2 != 1 ? 2 : 1, formatBuild, this.videoEffects, 0L);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void allowReleaseFirstFrameBeforeStarted() {
            if (this.this$0.pendingStreamChanges.size() == 0) {
                this.this$0.allowReleaseFirstFrameBeforeStarted();
                return;
            }
            TimedValueQueue timedValueQueue = new TimedValueQueue();
            boolean z = true;
            while (true) {
                int size = this.this$0.pendingStreamChanges.size();
                PlaybackVideoGraphWrapper playbackVideoGraphWrapper = this.this$0;
                if (size <= 0) {
                    playbackVideoGraphWrapper.pendingStreamChanges = timedValueQueue;
                    return;
                }
                StreamChangeInfo streamChangeInfo = (StreamChangeInfo) playbackVideoGraphWrapper.pendingStreamChanges.pollFirst();
                an.B(streamChangeInfo);
                if (z) {
                    int i2 = streamChangeInfo.firstFrameReleaseInstruction;
                    if (i2 == 0 || i2 == 1) {
                        streamChangeInfo = new StreamChangeInfo(streamChangeInfo.startPositionUs, 0, streamChangeInfo.fromTimestampUs);
                    } else {
                        this.this$0.allowReleaseFirstFrameBeforeStarted();
                    }
                }
                timedValueQueue.add(streamChangeInfo.fromTimestampUs, streamChangeInfo);
                z = false;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void clearOutputSurfaceInfo() {
            this.this$0.clearOutputSurfaceInfo();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void flush(boolean z) {
            if (isInitialized()) {
                VideoGraph videoGraph = this.this$0.videoGraph;
                an.B(videoGraph);
                videoGraph.flush();
            }
            this.lastFramePresentationTimeUs = C.TIME_UNSET;
            this.this$0.flush(z);
            this.signaledEndOfStream = false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public Surface getInputSurface() {
            an.u(isInitialized());
            VideoGraph videoGraph = this.this$0.videoGraph;
            an.B(videoGraph);
            return videoGraph.getInputSurface(this.inputIndex);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean handleInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator) {
            an.u(isInitialized());
            if (this.this$0.shouldRenderToInputVideoSink()) {
                ShiftingTimestampIterator shiftingTimestampIterator = new ShiftingTimestampIterator(timestampIterator, this.inputBufferTimestampAdjustmentUs);
                VideoGraph videoGraph = this.this$0.videoGraph;
                an.B(videoGraph);
                if (videoGraph.queueInputBitmap(this.inputIndex, bitmap, shiftingTimestampIterator)) {
                    long lastTimestampUs = shiftingTimestampIterator.getLastTimestampUs();
                    an.u(lastTimestampUs != C.TIME_UNSET);
                    this.lastFramePresentationTimeUs = lastTimestampUs;
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean handleInputFrame(long j2, VideoSink.VideoFrameHandler videoFrameHandler) {
            int i2;
            an.u(isInitialized());
            long j3 = j2 + this.inputBufferTimestampAdjustmentUs;
            long jPredictEarlyUs = this.this$0.videoFrameReleaseEarlyTimeForecaster.predictEarlyUs(j3);
            if (jPredictEarlyUs != C.TIME_UNSET && this.this$0.earlyThresholdToDropInputUs != C.TIME_UNSET && jPredictEarlyUs < this.this$0.earlyThresholdToDropInputUs && (i2 = this.consecutiveDroppedFrames) < 2) {
                this.consecutiveDroppedFrames = i2 + 1;
                videoFrameHandler.skip();
                return true;
            }
            if (this.this$0.shouldRenderToInputVideoSink()) {
                VideoGraph videoGraph = this.this$0.videoGraph;
                an.B(videoGraph);
                if (videoGraph.getPendingInputFrameCount(this.inputIndex) < this.videoFrameProcessorMaxPendingFrameCount) {
                    VideoGraph videoGraph2 = this.this$0.videoGraph;
                    an.B(videoGraph2);
                    if (videoGraph2.registerInputFrame(this.inputIndex)) {
                        this.lastFramePresentationTimeUs = j3;
                        videoFrameHandler.render(j3 * 1000);
                        this.consecutiveDroppedFrames = 0;
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean initialize(Format format) throws VideoSink.VideoSinkException {
            an.u(!isInitialized());
            boolean zRegisterInput = this.this$0.registerInput(format, this.inputIndex);
            this.isInitialized = zRegisterInput;
            return zRegisterInput;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isEnded() {
            return isInitialized() && this.this$0.isEnded();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isInitialized() {
            return this.isInitialized;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isReady(boolean z) {
            boolean z2 = false;
            if (z && isInitialized()) {
                z2 = true;
            }
            return this.this$0.isReady(z2);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void join(boolean z) {
            if (this.this$0.enablePlaylistMode) {
                this.this$0.joinPlayback(z);
            }
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public /* synthetic */ void onEnded(long j2) {
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onError(final VideoFrameProcessingException videoFrameProcessingException) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$InputVideoSink$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onError$0(listener, videoFrameProcessingException);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFirstFrameRendered() {
            final VideoSink.Listener listener = this.listener;
            Executor executor = this.listenerExecutor;
            Objects.requireNonNull(listener);
            executor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$InputVideoSink$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    listener.onFirstFrameRendered();
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFrameAvailableForRendering() {
            final VideoSink.Listener listener = this.listener;
            Executor executor = this.listenerExecutor;
            Objects.requireNonNull(listener);
            executor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$InputVideoSink$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    listener.onFrameAvailableForRendering();
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFrameDropped() {
            final VideoSink.Listener listener = this.listener;
            Executor executor = this.listenerExecutor;
            Objects.requireNonNull(listener);
            executor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$InputVideoSink$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    listener.onFrameDropped();
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onInputStreamChanged(int i2, Format format, long j2, int i3, List<Effect> list) {
            an.u(isInitialized());
            this.videoEffects = bn.n(list);
            this.inputType = i2;
            this.inputFormat = format;
            this.this$0.finalFramePresentationTimeUs = C.TIME_UNSET;
            this.this$0.hasSignaledEndOfVideoGraphOutputStream = false;
            registerInputStream(format);
            long j3 = this.lastFramePresentationTimeUs;
            boolean z = this.this$0.enablePlaylistMode;
            long j4 = SieveCacheKt.NodeMetaMask;
            if (z) {
                if (j3 != C.TIME_UNSET) {
                    j4 = this.lastFramePresentationTimeUs + 1;
                }
            } else if (this.inputIndex != 0 || j3 != C.TIME_UNSET) {
                return;
            }
            long j5 = j4;
            this.this$0.pendingStreamChanges.add(j5, new StreamChangeInfo(this.inputBufferTimestampAdjustmentUs + j2, i3, j5));
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onVideoSizeChanged(final VideoSize videoSize) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$InputVideoSink$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    listener.onVideoSizeChanged(videoSize);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void redraw() {
            if (isInitialized()) {
                boolean z = this.signaledEndOfStream;
                PlaybackVideoGraphWrapper playbackVideoGraphWrapper = this.this$0;
                long j2 = playbackVideoGraphWrapper.lastOutputFramePresentationTimeUs;
                playbackVideoGraphWrapper.flush(false);
                VideoGraph videoGraph = this.this$0.videoGraph;
                an.B(videoGraph);
                videoGraph.redraw();
                this.this$0.lastOutputFramePresentationTimeUs = j2;
                if (z) {
                    signalEndOfCurrentInputStream();
                }
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void release() {
            this.this$0.release();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void render(long j2, long j3) {
            this.this$0.render(j2 + this.inputBufferTimestampAdjustmentUs, j3);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setBufferTimestampAdjustmentUs(long j2) {
            this.inputBufferTimestampAdjustmentUs = j2;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setChangeFrameRateStrategy(int i2) {
            if (this.inputIndex == 0) {
                this.this$0.setChangeFrameRateStrategy(i2);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setListener(VideoSink.Listener listener, Executor executor) {
            this.listener = listener;
            this.listenerExecutor = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setOutputSurfaceInfo(Surface surface, Size size) {
            this.this$0.setOutputSurfaceInfo(surface, size);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setPlaybackSpeed(float f2) {
            if (this.inputIndex == 0) {
                this.this$0.setPlaybackSpeed(f2);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoEffects(List<Effect> list) {
            if (this.videoEffects.equals(list)) {
                return;
            }
            this.videoEffects = bn.n(list);
            Format format = this.inputFormat;
            if (format != null) {
                registerInputStream(format);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
            if (this.inputIndex == 0) {
                this.this$0.setVideoFrameMetadataListener(videoFrameMetadataListener);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void signalEndOfCurrentInputStream() {
            this.this$0.finalFramePresentationTimeUs = this.lastFramePresentationTimeUs;
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = this.this$0;
            if (playbackVideoGraphWrapper.lastOutputFramePresentationTimeUs >= playbackVideoGraphWrapper.finalFramePresentationTimeUs) {
                this.this$0.signalEndOfVideoGraphOutputStream();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void signalEndOfInput() {
            if (!this.signaledEndOfStream && isInitialized()) {
                VideoGraph videoGraph = this.this$0.videoGraph;
                an.B(videoGraph);
                videoGraph.signalEndOfInput(this.inputIndex);
                this.signaledEndOfStream = true;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void startRendering() {
            if (this.this$0.enablePlaylistMode) {
                this.this$0.startRendering();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void stopRendering() {
            if (this.this$0.enablePlaylistMode) {
                this.this$0.stopRendering();
            }
        }
    }

    /* compiled from: WazeSource */
    public interface Listener {

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$Listener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onEnded(Listener listener, long j2) {
            }

            public static void $default$onError(Listener listener, VideoFrameProcessingException videoFrameProcessingException) {
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

        void onEnded(long j2);

        void onError(VideoFrameProcessingException videoFrameProcessingException);

        void onFirstFrameRendered();

        void onFrameAvailableForRendering();

        void onFrameDropped();

        void onVideoSizeChanged(VideoSize videoSize);
    }

    /* compiled from: WazeSource */
    final class ReflectiveDefaultVideoFrameProcessorFactory implements VideoFrameProcessor.Factory {
        private static final aj<Class<?>> DEFAULT_VIDEO_FRAME_PROCESSOR_FACTORY_BUILDER_CLASS = an.a(new aj() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$ReflectiveDefaultVideoFrameProcessorFactory$$ExternalSyntheticLambda0
            @Override // com.google.d.b.aj
            public final Object get() {
                return PlaybackVideoGraphWrapper.ReflectiveDefaultVideoFrameProcessorFactory.lambda$static$0();
            }
        });
        private final boolean enableReplayableCache;

        public ReflectiveDefaultVideoFrameProcessorFactory(boolean z) {
            this.enableReplayableCache = z;
        }

        static /* synthetic */ Class lambda$static$0() {
            try {
                return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Factory
        public VideoFrameProcessor create(Context context, DebugViewProvider debugViewProvider, ColorInfo colorInfo, boolean z, Executor executor, VideoFrameProcessor.Listener listener) throws IllegalAccessException, VideoFrameProcessingException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            try {
                Class<?> cls = DEFAULT_VIDEO_FRAME_PROCESSOR_FACTORY_BUILDER_CLASS.get();
                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                cls.getMethod("setEnableReplayableCache", Boolean.TYPE).invoke(objNewInstance, Boolean.valueOf(this.enableReplayableCache));
                Object objInvoke = cls.getMethod(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, null).invoke(objNewInstance, null);
                an.B(objInvoke);
                return ((VideoFrameProcessor.Factory) objInvoke).create(context, debugViewProvider, colorInfo, z, executor, listener);
            } catch (Exception e2) {
                throw new VideoFrameProcessingException(e2);
            }
        }
    }

    /* compiled from: WazeSource */
    final class ReflectiveSingleInputVideoGraphFactory implements VideoGraph.Factory {
        private final VideoFrameProcessor.Factory videoFrameProcessorFactory;

        public ReflectiveSingleInputVideoGraphFactory(boolean z) {
            this.videoFrameProcessorFactory = new ReflectiveDefaultVideoFrameProcessorFactory(z);
        }

        @Override // androidx.media3.common.VideoGraph.Factory
        public VideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, long j2, boolean z) {
            try {
                return ((VideoGraph.Factory) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(VideoFrameProcessor.Factory.class).newInstance(this.videoFrameProcessorFactory)).create(context, colorInfo, debugViewProvider, listener, executor, j2, z);
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // androidx.media3.common.VideoGraph.Factory
        public boolean supportsMultipleInputs() {
            return false;
        }
    }

    /* compiled from: WazeSource */
    final class ShiftingTimestampIterator implements TimestampIterator {
        private final long shift;
        private final TimestampIterator timestampIterator;

        public ShiftingTimestampIterator(TimestampIterator timestampIterator, long j2) {
            this.timestampIterator = timestampIterator;
            this.shift = j2;
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public TimestampIterator copyOf() {
            return new ShiftingTimestampIterator(this.timestampIterator.copyOf(), this.shift);
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public long getLastTimestampUs() {
            long lastTimestampUs = this.timestampIterator.getLastTimestampUs();
            return lastTimestampUs == C.TIME_UNSET ? C.TIME_UNSET : lastTimestampUs + this.shift;
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public boolean hasNext() {
            return this.timestampIterator.hasNext();
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public long next() {
            return this.timestampIterator.next() + this.shift;
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface State {
    }

    /* compiled from: WazeSource */
    final class StreamChangeInfo {
        public final int firstFrameReleaseInstruction;
        public final long fromTimestampUs;
        public final long startPositionUs;

        public StreamChangeInfo(long j2, int i2, long j3) {
            this.startPositionUs = j2;
            this.firstFrameReleaseInstruction = i2;
            this.fromTimestampUs = j3;
        }
    }

    private PlaybackVideoGraphWrapper(Builder builder) {
        this.context = builder.context;
        this.pendingStreamChanges = new TimedValueQueue<>();
        VideoGraph.Factory factory = builder.videoGraphFactory;
        an.B(factory);
        this.videoGraphFactory = factory;
        this.inputVideoSinks = new SparseArray<>();
        this.compositionEffects = bn.p();
        this.compositorSettings = VideoCompositorSettings.DEFAULT;
        this.enablePlaylistMode = builder.enablePlaylistMode;
        Clock clock = builder.clock;
        this.clock = clock;
        this.earlyThresholdToDropInputUs = builder.lateThresholdToDropInputUs != C.TIME_UNSET ? -builder.lateThresholdToDropInputUs : -9223372036854775807L;
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = builder.videoFrameReleaseEarlyTimeForecaster;
        this.videoFrameReleaseEarlyTimeForecaster = videoFrameReleaseEarlyTimeForecaster;
        this.defaultVideoSink = new DefaultVideoSink(builder.videoFrameReleaseControl, videoFrameReleaseEarlyTimeForecaster, clock);
        this.videoFrameHandler = new VideoSink.VideoFrameHandler(this) { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.1
            final /* synthetic */ PlaybackVideoGraphWrapper this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
            public void render(long j2) {
                VideoGraph videoGraph = this.this$0.videoGraph;
                an.B(videoGraph);
                videoGraph.renderOutputFrame(j2);
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
            public void skip() {
                VideoGraph videoGraph = this.this$0.videoGraph;
                an.B(videoGraph);
                videoGraph.renderOutputFrame(-2L);
            }
        };
        this.listeners = new CopyOnWriteArraySet<>();
        this.videoGraphOutputFormat = new Format.Builder().build();
        this.outputStreamStartPositionUs = C.TIME_UNSET;
        this.lastOutputFramePresentationTimeUs = C.TIME_UNSET;
        this.finalFramePresentationTimeUs = C.TIME_UNSET;
        this.totalVideoInputCount = -1;
        this.state = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void allowReleaseFirstFrameBeforeStarted() {
        this.defaultVideoSink.allowReleaseFirstFrameBeforeStarted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flush(boolean z) {
        TimedValueQueue<StreamChangeInfo> timedValueQueue;
        if (isInitialized()) {
            this.pendingFlushCount++;
            this.defaultVideoSink.flush(z);
            while (true) {
                int size = this.pendingStreamChanges.size();
                timedValueQueue = this.pendingStreamChanges;
                if (size <= 1) {
                    break;
                } else {
                    timedValueQueue.pollFirst();
                }
            }
            if (timedValueQueue.size() == 1) {
                StreamChangeInfo streamChangeInfoPollFirst = this.pendingStreamChanges.pollFirst();
                an.B(streamChangeInfoPollFirst);
                this.outputStreamStartPositionUs = streamChangeInfoPollFirst.startPositionUs;
                this.outputStreamFirstFrameReleaseInstruction = streamChangeInfoPollFirst.firstFrameReleaseInstruction;
                onOutputStreamChanged();
            }
            this.lastOutputFramePresentationTimeUs = C.TIME_UNSET;
            if (z) {
                this.finalFramePresentationTimeUs = C.TIME_UNSET;
                this.hasSignaledEndOfVideoGraphOutputStream = false;
            }
            HandlerWrapper handlerWrapper = this.handler;
            an.B(handlerWrapper);
            handlerWrapper.post(new Runnable() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$flush$0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ColorInfo getAdjustedInputColorInfo(ColorInfo colorInfo) {
        return (colorInfo == null || !colorInfo.isDataSpaceValid() || this.isInputSdrToneMapped) ? ColorInfo.SDR_BT709_LIMITED : colorInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEnded() {
        return this.pendingFlushCount == 0 && this.hasSignaledEndOfVideoGraphOutputStream && this.defaultVideoSink.isEnded();
    }

    private boolean isInitialized() {
        return this.state == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReady(boolean z) {
        boolean z2 = false;
        if (z && this.pendingFlushCount == 0) {
            z2 = true;
        }
        return this.defaultVideoSink.isReady(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void joinPlayback(boolean z) {
        this.defaultVideoSink.join(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$flush$0() {
        this.pendingFlushCount--;
    }

    static /* synthetic */ void lambda$static$0(Runnable runnable) {
    }

    private void maybeSetOutputSurfaceInfo(Surface surface, int i2, int i3) {
        VideoGraph videoGraph = this.videoGraph;
        if (videoGraph == null) {
            return;
        }
        if (surface != null) {
            videoGraph.setOutputSurfaceInfo(new SurfaceInfo(surface, i2, i3));
            this.defaultVideoSink.setOutputSurfaceInfo(surface, new Size(i2, i3));
        } else {
            videoGraph.setOutputSurfaceInfo(null);
            this.defaultVideoSink.clearOutputSurfaceInfo();
        }
    }

    private void onOutputStreamChanged() {
        this.defaultVideoSink.onInputStreamChanged(1, this.videoGraphOutputFormat, this.outputStreamStartPositionUs, this.outputStreamFirstFrameReleaseInstruction, bn.p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean registerInput(Format format, int i2) throws VideoSink.VideoSinkException {
        PlaybackVideoGraphWrapper playbackVideoGraphWrapper;
        if (i2 == 0) {
            an.u(this.state == 0);
            ColorInfo adjustedInputColorInfo = getAdjustedInputColorInfo(format.colorInfo);
            try {
                if (this.requestOpenGlToneMapping) {
                    adjustedInputColorInfo = ColorInfo.SDR_BT709_LIMITED;
                } else if (adjustedInputColorInfo.colorTransfer == 7 && Build.VERSION.SDK_INT < 34 && GlUtil.isBt2020PqExtensionSupported()) {
                    ColorInfo.Builder builderBuildUpon = adjustedInputColorInfo.buildUpon();
                    builderBuildUpon.setColorTransfer(6);
                    adjustedInputColorInfo = builderBuildUpon.build();
                } else if (GlUtil.isColorTransferSupported(adjustedInputColorInfo.colorTransfer)) {
                    int i3 = adjustedInputColorInfo.colorTransfer;
                    if (i3 == 2 || i3 == 10) {
                        adjustedInputColorInfo = ColorInfo.SDR_BT709_LIMITED;
                    }
                } else {
                    Log.w(TAG, Util.formatInvariant("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", Integer.valueOf(adjustedInputColorInfo.colorTransfer)));
                    adjustedInputColorInfo = ColorInfo.SDR_BT709_LIMITED;
                }
                ColorInfo colorInfo = adjustedInputColorInfo;
                Clock clock = this.clock;
                Looper looperMyLooper = Looper.myLooper();
                an.B(looperMyLooper);
                this.handler = clock.createHandler(looperMyLooper, null);
                try {
                    VideoGraph.Factory factory = this.videoGraphFactory;
                    Context context = this.context;
                    DebugViewProvider debugViewProvider = DebugViewProvider.NONE;
                    final HandlerWrapper handlerWrapper = this.handler;
                    Objects.requireNonNull(handlerWrapper);
                    playbackVideoGraphWrapper = this;
                    VideoGraph videoGraphCreate = factory.create(context, colorInfo, debugViewProvider, playbackVideoGraphWrapper, new Executor() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$$ExternalSyntheticLambda2
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            handlerWrapper.post(runnable);
                        }
                    }, 0L, false);
                    playbackVideoGraphWrapper.videoGraph = videoGraphCreate;
                    videoGraphCreate.setCompositionEffects(playbackVideoGraphWrapper.compositionEffects);
                    playbackVideoGraphWrapper.videoGraph.setCompositorSettings(playbackVideoGraphWrapper.compositorSettings);
                    playbackVideoGraphWrapper.videoGraph.initialize();
                    Pair<Surface, Size> pair = playbackVideoGraphWrapper.currentSurfaceAndSize;
                    if (pair != null) {
                        Surface surface = (Surface) pair.first;
                        Size size = (Size) playbackVideoGraphWrapper.currentSurfaceAndSize.second;
                        playbackVideoGraphWrapper.maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
                    }
                    playbackVideoGraphWrapper.defaultVideoSink.initialize(format);
                    VideoSink videoSink = playbackVideoGraphWrapper.defaultVideoSink;
                    DefaultVideoSinkListener defaultVideoSinkListener = new DefaultVideoSinkListener();
                    final HandlerWrapper handlerWrapper2 = playbackVideoGraphWrapper.handler;
                    Objects.requireNonNull(handlerWrapper2);
                    videoSink.setListener(defaultVideoSinkListener, new Executor() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$$ExternalSyntheticLambda2
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            handlerWrapper2.post(runnable);
                        }
                    });
                    playbackVideoGraphWrapper.state = 1;
                } catch (VideoFrameProcessingException e2) {
                    throw new VideoSink.VideoSinkException(e2, format);
                }
            } catch (GlUtil.GlException e3) {
                throw new VideoSink.VideoSinkException(e3, format);
            }
        } else {
            playbackVideoGraphWrapper = this;
            if (!playbackVideoGraphWrapper.isInitialized()) {
                return false;
            }
        }
        try {
            VideoGraph videoGraph = playbackVideoGraphWrapper.videoGraph;
            an.B(videoGraph);
            videoGraph.registerInput(i2);
            playbackVideoGraphWrapper.registeredVideoInputCount++;
            return true;
        } catch (VideoFrameProcessingException e4) {
            throw new VideoSink.VideoSinkException(e4, format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(long j2, long j3) {
        this.defaultVideoSink.render(j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeFrameRateStrategy(int i2) {
        this.defaultVideoSink.setChangeFrameRateStrategy(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f2) {
        this.videoFrameReleaseEarlyTimeForecaster.setPlaybackSpeed(f2);
        this.defaultVideoSink.setPlaybackSpeed(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        this.videoFrameMetadataListener = videoFrameMetadataListener;
        this.defaultVideoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldRenderToInputVideoSink() {
        int i2 = this.totalVideoInputCount;
        return i2 != -1 && i2 == this.registeredVideoInputCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void signalEndOfVideoGraphOutputStream() {
        this.defaultVideoSink.signalEndOfCurrentInputStream();
        this.hasSignaledEndOfVideoGraphOutputStream = true;
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    public void clearOutputSurfaceInfo() {
        maybeSetOutputSurfaceInfo(null, Size.UNKNOWN.getWidth(), Size.UNKNOWN.getHeight());
        this.currentSurfaceAndSize = null;
    }

    public VideoSink getSink(int i2) {
        if (Util.contains(this.inputVideoSinks, i2)) {
            return this.inputVideoSinks.get(i2);
        }
        InputVideoSink inputVideoSink = new InputVideoSink(this, this.context, i2);
        if (i2 == 0) {
            addListener(inputVideoSink);
            i2 = 0;
        }
        this.inputVideoSinks.put(i2, inputVideoSink);
        return inputVideoSink;
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onEnded(long j2) {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onEnded(j2);
        }
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onError(VideoFrameProcessingException videoFrameProcessingException) {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onError(videoFrameProcessingException);
        }
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputFrameAvailableForRendering(long j2, boolean z) {
        if (this.pendingFlushCount > 0) {
            return;
        }
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onFrameAvailableForRendering();
        }
        if (z) {
            VideoFrameMetadataListener videoFrameMetadataListener = this.videoFrameMetadataListener;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j2, C.TIME_UNSET, this.videoGraphOutputFormat, null);
                return;
            }
            return;
        }
        this.lastOutputFramePresentationTimeUs = j2;
        StreamChangeInfo streamChangeInfoPollFloor = this.pendingStreamChanges.pollFloor(j2);
        if (streamChangeInfoPollFloor != null) {
            this.outputStreamStartPositionUs = streamChangeInfoPollFloor.startPositionUs;
            this.outputStreamFirstFrameReleaseInstruction = streamChangeInfoPollFloor.firstFrameReleaseInstruction;
            onOutputStreamChanged();
        }
        this.defaultVideoSink.handleInputFrame(j2, this.videoFrameHandler);
        long j3 = this.finalFramePresentationTimeUs;
        if (j3 == C.TIME_UNSET || j2 < j3) {
            return;
        }
        signalEndOfVideoGraphOutputStream();
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputFrameRateChanged(float f2) {
        Format.Builder builderBuildUpon = this.videoGraphOutputFormat.buildUpon();
        builderBuildUpon.setFrameRate(f2);
        this.videoGraphOutputFormat = builderBuildUpon.build();
        onOutputStreamChanged();
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputSizeChanged(int i2, int i3) {
        Format.Builder builderBuildUpon = this.videoGraphOutputFormat.buildUpon();
        builderBuildUpon.setWidth(i2);
        builderBuildUpon.setHeight(i3);
        this.videoGraphOutputFormat = builderBuildUpon.build();
        onOutputStreamChanged();
    }

    public void release() {
        if (this.state == 2) {
            return;
        }
        HandlerWrapper handlerWrapper = this.handler;
        if (handlerWrapper != null) {
            handlerWrapper.removeCallbacksAndMessages(null);
        }
        VideoGraph videoGraph = this.videoGraph;
        if (videoGraph != null) {
            videoGraph.release();
        }
        this.currentSurfaceAndSize = null;
        this.state = 2;
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public void setCompositionEffects(List<Effect> list) {
        this.compositionEffects = bn.n(list);
        VideoGraph videoGraph = this.videoGraph;
        if (videoGraph != null) {
            videoGraph.setCompositionEffects(list);
        }
    }

    public void setCompositorSettings(VideoCompositorSettings videoCompositorSettings) {
        this.compositorSettings = videoCompositorSettings;
        VideoGraph videoGraph = this.videoGraph;
        if (videoGraph != null) {
            videoGraph.setCompositorSettings(videoCompositorSettings);
        }
    }

    public void setIsInputSdrToneMapped(boolean z) {
        this.isInputSdrToneMapped = z;
    }

    public void setOutputSurfaceInfo(Surface surface, Size size) {
        Pair<Surface, Size> pair = this.currentSurfaceAndSize;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((Size) this.currentSurfaceAndSize.second).equals(size)) {
            return;
        }
        this.currentSurfaceAndSize = Pair.create(surface, size);
        maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
    }

    public void setRequestOpenGlToneMapping(boolean z) {
        this.requestOpenGlToneMapping = z;
    }

    public void setTotalVideoInputCount(int i2) {
        if (i2 < this.totalVideoInputCount) {
            return;
        }
        this.totalVideoInputCount = i2;
    }

    public void startRendering() {
        this.defaultVideoSink.startRendering();
    }

    public void stopRendering() {
        this.defaultVideoSink.stopRendering();
    }
}
