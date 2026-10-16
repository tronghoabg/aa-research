package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.ScrubbingModeParameters;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.video.FixedFrameRateEstimator;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.VideoFrameReleaseControl;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.VideoSink;
import com.google.d.b.an;
import com.google.d.d.bn;
import com.google.d.m.a.cf;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class MediaCodecVideoRenderer extends MediaCodecRenderer implements VideoFrameReleaseControl.FrameTimingEvaluator {
    public static final long DEFAULT_EARLY_SCHEDULING_THRESHOLD_US = 50000;
    public static final long DEFAULT_LATE_THRESHOLD_TO_DROP_DECODER_INPUT_US = 15000;
    private static final int HEVC_MAX_INPUT_SIZE_THRESHOLD = 2097152;
    private static final float INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR = 1.5f;
    private static final String KEY_CROP_BOTTOM = "crop-bottom";
    private static final String KEY_CROP_LEFT = "crop-left";
    private static final String KEY_CROP_RIGHT = "crop-right";
    private static final String KEY_CROP_TOP = "crop-top";
    private static final String KEY_HDR_ST2094_50_INFO = "hdr-st2094-50-info";
    private static final int MAX_CONSECUTIVE_DROPPED_INPUT_BUFFERS_COUNT_TO_DISCARD_HEADER = 0;
    private static final float MAX_FRAME_RATE_RATIO_DIFF_TO_KEEP_CODEC = 0.01f;
    private static final long MIN_EARLY_US_LATE_THRESHOLD = -30000;
    private static final long MIN_EARLY_US_VERY_LATE_THRESHOLD = -500000;
    private static final long OFFSET_FROM_PERIOD_END_TO_TREAT_AS_LAST_US = 100000;
    private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = {DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, 1600, DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT, DisplayStrings.DS_LOCATION_PREVIEW_TEMPORARILY_CLOSED, 960, DisplayStrings.DS_DEBUG_TOOLS_ENABLED, 640, DisplayStrings.DS_REPORT_MENU_V2_HAZARD_ANIMALS_LABEL, 480};
    private static final String TAG = "MediaCodecVideoRenderer";
    private static final long TUNNELING_EOS_PRESENTATION_TIME_US = Long.MAX_VALUE;
    private static boolean deviceNeedsSetOutputSurfaceWorkaround;
    private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    private final Av1SampleDependencyParser av1SampleDependencyParser;
    private int buffersInCodecCount;
    private int changeFrameRateStrategy;
    private boolean codecHandlesHdr10PlusOutOfBandMetadata;
    private CodecMaxValues codecMaxValues;
    private boolean codecNeedsSetOutputSurfaceWorkaround;
    private int consecutiveDroppedFrameCount;
    private int consecutiveDroppedInputBufferCount;
    private final Context context;
    private VideoSize decodedVideoSize;
    private final boolean deviceNeedsNoPostProcessWorkaround;
    private final PriorityQueue<Long> discardedDecoderInputBufferTimestamps;
    private Surface displaySurface;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final boolean enableDurationToProgressUs;
    private final boolean enableMediaCodecBufferDecodeOnlyFlag;
    private final VideoRendererEventListener.EventDispatcher eventDispatcher;
    private VideoFrameMetadataListener frameMetadataListener;
    private final FixedFrameRateEstimator frameRateEstimator;
    private boolean hasSetVideoSink;
    private boolean haveReportedFirstFrameRenderedForCurrentSurface;
    private boolean isFlushRequired;
    private long lastFrameReleaseTimeNs;
    private long lastResetToKeyFramePositionUs;
    private final int maxDroppedFramesToNotify;
    private final long minEarlyUsToDropDecoderInput;
    private long nextOutputBufferToProcessPresentationTimeUs;
    private int nextVideoSinkFirstFrameReleaseInstruction;
    private Size outputResolution;
    private final boolean ownsVideoSink;
    private boolean pendingVideoSinkInputStreamChange;
    private PlaceholderSurface placeholderSurface;
    private int rendererPriority;
    private VideoSize reportedVideoSize;
    private int scalingMode;
    private ScrubbingModeParameters scrubbingModeParameters;
    private long startPositionUs;
    private long totalVideoFrameProcessingOffsetUs;
    private boolean tunneling;
    private int tunnelingAudioSessionId;
    private OnFrameRenderedListener tunnelingOnFrameRenderedListener;
    private List<Effect> videoEffects;
    private int videoFrameProcessingOffsetCount;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster;
    private final VideoFrameReleaseControl.FrameReleaseInfo videoFrameReleaseInfo;
    private VideoSink videoSink;

    /* compiled from: WazeSource */
    final class Api26 {
        private Api26() {
        }

        public static boolean doesDisplaySupportDolbyVision(Context context) {
            Display.HdrCapabilities hdrCapabilities;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
                return false;
            }
            for (int i2 : hdrCapabilities.getSupportedHdrTypes()) {
                if (i2 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private long allowedJoiningTimeMs;
        private boolean buildCalled;
        private MediaCodecAdapter.Factory codecAdapterFactory;
        private final Context context;
        private boolean enableDecoderFallback;
        private boolean enableDurationToProgressUs;
        private boolean enableMediaCodecBufferDecodeOnlyFlag;
        private Handler eventHandler;
        private VideoRendererEventListener eventListener;
        private int maxDroppedFramesToNotify;
        private VideoSink videoSink;
        private MediaCodecSelector mediaCodecSelector = MediaCodecSelector.DEFAULT;
        private float assumedMinimumCodecOperatingRate = 0.0f;
        private boolean parseAv1SampleDependencies = true;
        private long lateThresholdToDropDecoderInputUs = 15000;
        private long earlySchedulingThresholdUs = MediaCodecVideoRenderer.DEFAULT_EARLY_SCHEDULING_THRESHOLD_US;

        public Builder(Context context) {
            this.context = context;
            this.codecAdapterFactory = MediaCodecAdapter.Factory.CC.getDefault(context);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.media3.exoplayer.video.MediaCodecVideoRenderer build() {
            /*
                r3 = this;
                boolean r0 = r3.buildCalled
                r1 = 1
                r0 = r0 ^ r1
                com.google.d.b.an.u(r0)
                android.os.Handler r0 = r3.eventHandler
                if (r0 != 0) goto L12
                androidx.media3.exoplayer.video.VideoRendererEventListener r2 = r3.eventListener
                if (r2 == 0) goto L10
                goto L12
            L10:
                r2 = r1
                goto L1a
            L12:
                r2 = 0
                if (r0 == 0) goto L1a
                androidx.media3.exoplayer.video.VideoRendererEventListener r0 = r3.eventListener
                if (r0 == 0) goto L1a
                goto L10
            L1a:
                com.google.d.b.an.u(r2)
                r3.buildCalled = r1
                androidx.media3.exoplayer.video.MediaCodecVideoRenderer r0 = new androidx.media3.exoplayer.video.MediaCodecVideoRenderer
                r0.<init>(r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.Builder.build():androidx.media3.exoplayer.video.MediaCodecVideoRenderer");
        }

        public Builder experimentalSetEnableMediaCodecBufferDecodeOnlyFlag(boolean z) {
            this.enableMediaCodecBufferDecodeOnlyFlag = z;
            return this;
        }

        public Builder experimentalSetLateThresholdToDropDecoderInputUs(long j2) {
            this.lateThresholdToDropDecoderInputUs = j2;
            return this;
        }

        public Builder experimentalSetParseAv1SampleDependencies(boolean z) {
            this.parseAv1SampleDependencies = z;
            return this;
        }

        public Builder setAllowedJoiningTimeMs(long j2) {
            this.allowedJoiningTimeMs = j2;
            return this;
        }

        public Builder setAssumedMinimumCodecOperatingRate(float f2) {
            this.assumedMinimumCodecOperatingRate = f2;
            return this;
        }

        public Builder setCodecAdapterFactory(MediaCodecAdapter.Factory factory) {
            this.codecAdapterFactory = factory;
            return this;
        }

        public Builder setEarlySchedulingThresholdUs(long j2) {
            this.earlySchedulingThresholdUs = j2;
            return this;
        }

        public Builder setEnableDecoderFallback(boolean z) {
            this.enableDecoderFallback = z;
            return this;
        }

        public Builder setEnableDurationToProgressUs(boolean z) {
            this.enableDurationToProgressUs = z;
            return this;
        }

        public Builder setEventHandler(Handler handler) {
            this.eventHandler = handler;
            return this;
        }

        public Builder setEventListener(VideoRendererEventListener videoRendererEventListener) {
            this.eventListener = videoRendererEventListener;
            return this;
        }

        public Builder setMaxDroppedFramesToNotify(int i2) {
            this.maxDroppedFramesToNotify = i2;
            return this;
        }

        public Builder setMediaCodecSelector(MediaCodecSelector mediaCodecSelector) {
            this.mediaCodecSelector = mediaCodecSelector;
            return this;
        }

        public Builder setVideoSink(VideoSink videoSink) {
            this.videoSink = videoSink;
            return this;
        }
    }

    /* compiled from: WazeSource */
    public final class CodecMaxValues {
        public final int height;
        public final int inputSize;
        public final int width;

        public CodecMaxValues(int i2, int i3, int i4) {
            this.width = i2;
            this.height = i3;
            this.inputSize = i4;
        }
    }

    /* compiled from: WazeSource */
    final class OnFrameRenderedListener implements MediaCodecAdapter.OnFrameRenderedListener, Handler.Callback {
        private static final int HANDLE_FRAME_RENDERED = 0;
        private final Handler handler;
        final /* synthetic */ MediaCodecVideoRenderer this$0;

        public OnFrameRenderedListener(MediaCodecVideoRenderer mediaCodecVideoRenderer, MediaCodecAdapter mediaCodecAdapter) {
            Objects.requireNonNull(mediaCodecVideoRenderer);
            this.this$0 = mediaCodecVideoRenderer;
            Handler handlerCreateHandlerForCurrentLooper = Util.createHandlerForCurrentLooper(this);
            this.handler = handlerCreateHandlerForCurrentLooper;
            mediaCodecAdapter.setOnFrameRenderedListener(this, handlerCreateHandlerForCurrentLooper);
        }

        private void handleFrameRendered(long j2) {
            if (this != this.this$0.tunnelingOnFrameRenderedListener || this.this$0.getCodec() == null) {
                return;
            }
            MediaCodecVideoRenderer mediaCodecVideoRenderer = this.this$0;
            if (j2 == Long.MAX_VALUE) {
                mediaCodecVideoRenderer.onProcessedTunneledEndOfStream();
                return;
            }
            try {
                mediaCodecVideoRenderer.onProcessedTunneledBuffer(j2);
            } catch (ExoPlaybackException e2) {
                this.this$0.setPendingPlaybackException(e2);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            handleFrameRendered(Util.toLong(message.arg1, message.arg2));
            return true;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener
        public void onFrameRendered(MediaCodecAdapter mediaCodecAdapter, long j2, long j3) {
            if (Build.VERSION.SDK_INT >= 30) {
                handleFrameRendered(j2);
                return;
            }
            Handler handler = this.handler;
            handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j2 >> 32), (int) j2));
        }
    }

    protected MediaCodecVideoRenderer(Builder builder) {
        super(builder.context.getApplicationContext(), 2, builder.codecAdapterFactory, builder.mediaCodecSelector, builder.enableDecoderFallback, builder.assumedMinimumCodecOperatingRate);
        Context applicationContext = builder.context.getApplicationContext();
        this.context = applicationContext;
        this.maxDroppedFramesToNotify = builder.maxDroppedFramesToNotify;
        this.videoSink = builder.videoSink;
        this.eventDispatcher = new VideoRendererEventListener.EventDispatcher(builder.eventHandler, builder.eventListener);
        this.ownsVideoSink = this.videoSink == null;
        VideoFrameReleaseControl videoFrameReleaseControl = new VideoFrameReleaseControl(applicationContext, this, builder.allowedJoiningTimeMs);
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        videoFrameReleaseControl.setEarlySchedulingThresholdUs(builder.earlySchedulingThresholdUs);
        this.videoFrameReleaseInfo = new VideoFrameReleaseControl.FrameReleaseInfo();
        this.frameRateEstimator = new FixedFrameRateEstimator(new FixedFrameRateEstimator.Listener() { // from class: androidx.media3.exoplayer.video.MediaCodecVideoRenderer$$ExternalSyntheticLambda0
            @Override // androidx.media3.exoplayer.video.FixedFrameRateEstimator.Listener
            public final void onFrameRateEstimateChanged(float f2) {
                this.f$0.onFrameRateEstimateChanged(f2);
            }
        });
        this.deviceNeedsNoPostProcessWorkaround = deviceNeedsNoPostProcessWorkaround();
        this.outputResolution = Size.UNKNOWN;
        this.scalingMode = 1;
        this.changeFrameRateStrategy = 0;
        this.decodedVideoSize = VideoSize.UNKNOWN;
        this.tunnelingAudioSessionId = 0;
        this.reportedVideoSize = null;
        this.rendererPriority = -1000;
        this.startPositionUs = C.TIME_UNSET;
        this.av1SampleDependencyParser = builder.parseAv1SampleDependencies ? new Av1SampleDependencyParser() : null;
        this.discardedDecoderInputBufferTimestamps = new PriorityQueue<>();
        if (builder.lateThresholdToDropDecoderInputUs != C.TIME_UNSET) {
            this.minEarlyUsToDropDecoderInput = -builder.lateThresholdToDropDecoderInputUs;
            this.videoFrameReleaseEarlyTimeForecaster = new VideoFrameReleaseEarlyTimeForecaster(1.0f);
        } else {
            this.minEarlyUsToDropDecoderInput = C.TIME_UNSET;
            this.videoFrameReleaseEarlyTimeForecaster = null;
        }
        this.enableMediaCodecBufferDecodeOnlyFlag = builder.enableMediaCodecBufferDecodeOnlyFlag;
        this.enableDurationToProgressUs = builder.enableDurationToProgressUs;
        this.nextOutputBufferToProcessPresentationTimeUs = C.TIME_UNSET;
        this.scrubbingModeParameters = null;
    }

    private void configureVideoSink() {
        this.videoSink.setListener(new VideoSink.Listener(this) { // from class: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.1
            final /* synthetic */ MediaCodecVideoRenderer this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onError(VideoSink.VideoSinkException videoSinkException) {
                this.this$0.setPendingPlaybackException(this.this$0.createRendererException(videoSinkException, videoSinkException.format, PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED));
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onFirstFrameRendered() {
                if (this.this$0.displaySurface != null) {
                    this.this$0.notifyRenderedFirstFrame();
                }
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onFrameAvailableForRendering() {
                Renderer.WakeupListener wakeupListener = this.this$0.getWakeupListener();
                if (wakeupListener != null) {
                    wakeupListener.onWakeup();
                }
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onFrameDropped() {
                if (this.this$0.displaySurface != null) {
                    this.this$0.updateDroppedBufferCounters(0, 1);
                }
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onVideoSizeChanged(VideoSize videoSize) {
            }
        }, cf.y());
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            this.videoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
        }
        if (this.displaySurface != null && !this.outputResolution.equals(Size.UNKNOWN)) {
            this.videoSink.setOutputSurfaceInfo(this.displaySurface, this.outputResolution);
        }
        this.videoSink.setChangeFrameRateStrategy(this.changeFrameRateStrategy);
        this.videoSink.setPlaybackSpeed(getPlaybackSpeed());
        List<Effect> list = this.videoEffects;
        if (list != null) {
            this.videoSink.setVideoEffects(list);
        }
    }

    private static void debugLogForBufferRelease(int i2, long j2, long j3, boolean z, boolean z2, VideoFrameReleaseControl.FrameReleaseInfo frameReleaseInfo, long j4) {
        String str;
        if (i2 == 5) {
            return;
        }
        String strConcat = "video, release output, pts=" + j2 + ", pos=" + j3 + ", early=" + frameReleaseInfo.getEarlyUs();
        if (z) {
            strConcat = strConcat.concat(", decode-only");
        }
        if (z2) {
            strConcat = strConcat.concat(", last-buffer");
        }
        if (i2 != 0) {
            if (i2 == 1) {
                long releaseTimeNs = frameReleaseInfo.getReleaseTimeNs();
                strConcat = strConcat + ", release=" + (releaseTimeNs / 1000);
                if (j4 != 0) {
                    strConcat = strConcat + " (+" + ((releaseTimeNs - j4) / 1000) + ")";
                }
            } else if (i2 == 2) {
                str = ", drop";
            } else if (i2 == 3) {
                str = ", skip";
            } else if (i2 == 4) {
                str = ", ignore";
            }
            Log.d("MCRdebug", strConcat);
        }
        str = ", release immediately";
        strConcat = strConcat.concat(str);
        Log.d("MCRdebug", strConcat);
    }

    private static boolean deviceNeedsNoPostProcessWorkaround() {
        if (MediaLibraryInfo.enableWorkarounds()) {
            return "NVIDIA".equals(Build.MANUFACTURER);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean evaluateDeviceNeedsSetOutputSurfaceWorkaround() {
        /*
            boolean r0 = androidx.media3.common.MediaLibraryInfo.enableWorkarounds()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = android.os.Build.MODEL
            int r2 = r0.hashCode()
            switch(r2) {
                case -349662828: goto L5a;
                case -321033677: goto L51;
                case 2006354: goto L48;
                case 2006367: goto L3f;
                case 2006371: goto L36;
                case 1785421873: goto L2d;
                case 1785421876: goto L24;
                case 1798172390: goto L1b;
                case 2119412532: goto L12;
                default: goto L11;
            }
        L11:
            goto L64
        L12:
            java.lang.String r2 = "AFTEUFF014"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            goto L62
        L1b:
            java.lang.String r2 = "AFTSO001"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            goto L62
        L24:
            java.lang.String r2 = "AFTEU014"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            goto L62
        L2d:
            java.lang.String r2 = "AFTEU011"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            goto L62
        L36:
            java.lang.String r2 = "AFTR"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            goto L62
        L3f:
            java.lang.String r2 = "AFTN"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            goto L62
        L48:
            java.lang.String r2 = "AFTA"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            goto L62
        L51:
            java.lang.String r2 = "AFTKMST12"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            goto L62
        L5a:
            java.lang.String r2 = "AFTJMST12"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
        L62:
            r0 = 1
            return r0
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.evaluateDeviceNeedsSetOutputSurfaceWorkaround():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r3.equals(androidx.media3.common.MimeTypes.VIDEO_VP8) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b5, code lost:
    
        if (r3.equals(androidx.media3.common.MimeTypes.VIDEO_MP4V) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ce, code lost:
    
        if (r3.equals(androidx.media3.common.MimeTypes.VIDEO_AV1) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
    
        if (r3.equals(androidx.media3.common.MimeTypes.VIDEO_H263) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00de, code lost:
    
        return getMaxSampleSize(r0 * r1, 2);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getCodecMaxInputSize(androidx.media3.exoplayer.mediacodec.MediaCodecInfo r9, androidx.media3.common.Format r10) {
        /*
            int r0 = r10.width
            int r1 = r10.height
            r2 = -1
            if (r0 == r2) goto Ldf
            if (r1 != r2) goto Lb
            goto Ldf
        Lb:
            java.lang.String r3 = r10.sampleMimeType
            com.google.d.b.an.B(r3)
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/av01"
            java.lang.String r7 = "video/hevc"
            r8 = 2
            if (r4 == 0) goto L43
            android.util.Pair r10 = androidx.media3.common.util.CodecSpecificDataUtil.getCodecProfileAndLevel(r10)
            if (r10 == 0) goto L42
            java.lang.Object r10 = r10.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r3 = 512(0x200, float:7.17E-43)
            if (r10 == r3) goto L40
            r3 = 1
            if (r10 == r3) goto L40
            if (r10 != r8) goto L3a
            goto L40
        L3a:
            r3 = 1024(0x400, float:1.435E-42)
            if (r10 != r3) goto L42
            r3 = r6
            goto L43
        L40:
            r3 = r5
            goto L43
        L42:
            r3 = r7
        L43:
            int r10 = r3.hashCode()
            switch(r10) {
                case -1664118616: goto Ld1;
                case -1662735862: goto Lca;
                case -1662541442: goto Lb8;
                case 1187890754: goto Laf;
                case 1331836730: goto L65;
                case 1599127256: goto L5b;
                case 1599127257: goto L4c;
                default: goto L4a;
            }
        L4a:
            goto Ldf
        L4c:
            java.lang.String r9 = "video/x-vnd.on2.vp9"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto Ldf
            int r0 = r0 * r1
            r9 = 4
            int r9 = getMaxSampleSize(r0, r9)
            return r9
        L5b:
            java.lang.String r9 = "video/x-vnd.on2.vp8"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto Ldf
            goto Ld9
        L65:
            boolean r10 = r3.equals(r5)
            if (r10 == 0) goto Ldf
            boolean r10 = androidx.media3.common.MediaLibraryInfo.enableWorkarounds()
            if (r10 == 0) goto L9d
            java.lang.String r10 = "BRAVIA 4K 2015"
            java.lang.String r3 = android.os.Build.MODEL
            boolean r10 = r10.equals(r3)
            if (r10 != 0) goto Ldf
            java.lang.String r10 = "Amazon"
            java.lang.String r3 = android.os.Build.MANUFACTURER
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L9d
            java.lang.String r10 = "KFSOWI"
            java.lang.String r3 = android.os.Build.MODEL
            boolean r10 = r10.equals(r3)
            if (r10 != 0) goto Ldf
            java.lang.String r10 = "AFTS"
            java.lang.String r3 = android.os.Build.MODEL
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L9d
            boolean r9 = r9.secure
            if (r9 != 0) goto Ldf
        L9d:
            r9 = 16
            int r10 = androidx.media3.common.util.Util.ceilDivide(r0, r9)
            int r9 = androidx.media3.common.util.Util.ceilDivide(r1, r9)
            int r10 = r10 * r9
            int r10 = r10 * 256
            int r9 = getMaxSampleSize(r10, r8)
            return r9
        Laf:
            java.lang.String r9 = "video/mp4v-es"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto Ldf
            goto Ld9
        Lb8:
            boolean r9 = r3.equals(r7)
            if (r9 == 0) goto Ldf
            int r0 = r0 * r1
            int r9 = getMaxSampleSize(r0, r8)
            r10 = 2097152(0x200000, float:2.938736E-39)
            int r9 = java.lang.Math.max(r10, r9)
            return r9
        Lca:
            boolean r9 = r3.equals(r6)
            if (r9 == 0) goto Ldf
            goto Ld9
        Ld1:
            java.lang.String r9 = "video/3gpp"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto Ldf
        Ld9:
            int r0 = r0 * r1
            int r9 = getMaxSampleSize(r0, r8)
            return r9
        Ldf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.getCodecMaxInputSize(androidx.media3.exoplayer.mediacodec.MediaCodecInfo, androidx.media3.common.Format):int");
    }

    private static Point getCodecMaxSize(MediaCodecInfo mediaCodecInfo, Format format) {
        int i2;
        int i3 = format.height;
        int i4 = format.width;
        boolean z = i3 > i4;
        int i5 = z ? i3 : i4;
        if (true == z) {
            i3 = i4;
        }
        for (int i6 : STANDARD_LONG_EDGE_VIDEO_PX) {
            float f2 = i5;
            float f3 = i3;
            float f4 = i6;
            if (i6 <= i5 || (i2 = (int) (f4 * (f3 / f2))) <= i3) {
                break;
            }
            int i7 = true != z ? i6 : i2;
            if (true != z) {
                i6 = i2;
            }
            Point pointAlignVideoSizeV21 = mediaCodecInfo.alignVideoSizeV21(i7, i6);
            float f5 = format.frameRate;
            if (pointAlignVideoSizeV21 != null) {
                if (mediaCodecInfo.isVideoSizeAndRateSupportedV21(pointAlignVideoSizeV21.x, pointAlignVideoSizeV21.y, f5)) {
                    return pointAlignVideoSizeV21;
                }
            }
        }
        return null;
    }

    private static List<MediaCodecInfo> getDecoderInfos(Context context, MediaCodecSelector mediaCodecSelector, Format format, boolean z, boolean z2) {
        String str = format.sampleMimeType;
        if (str == null) {
            return bn.p();
        }
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(str) && !Api26.doesDisplaySupportDolbyVision(context)) {
            List<MediaCodecInfo> alternativeDecoderInfos = MediaCodecUtil.getAlternativeDecoderInfos(mediaCodecSelector, format, z, z2);
            if (!alternativeDecoderInfos.isEmpty()) {
                return alternativeDecoderInfos;
            }
        }
        return MediaCodecUtil.getDecoderInfosSoftMatch(mediaCodecSelector, format, z, z2);
    }

    protected static int getMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        if (format.maxInputSize == -1) {
            return getCodecMaxInputSize(mediaCodecInfo, format);
        }
        int size = format.initializationData.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += format.initializationData.get(i2).length;
        }
        return format.maxInputSize + length;
    }

    private static int getMaxSampleSize(int i2, int i3) {
        return (i2 * 3) / (i3 + i3);
    }

    private Surface getSurfaceForCodec(MediaCodecInfo mediaCodecInfo) {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            return videoSink.getInputSurface();
        }
        Surface surface = this.displaySurface;
        if (surface != null) {
            return surface;
        }
        if (shouldUseDetachedSurface(mediaCodecInfo)) {
            return null;
        }
        an.u(shouldUsePlaceholderSurface(mediaCodecInfo));
        PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (placeholderSurface != null) {
            if (placeholderSurface.secure != mediaCodecInfo.secure) {
                releasePlaceholderSurface();
            }
        }
        PlaceholderSurface placeholderSurface2 = this.placeholderSurface;
        if (placeholderSurface2 != null) {
            return placeholderSurface2;
        }
        PlaceholderSurface placeholderSurfaceNewInstance = PlaceholderSurface.newInstance(this.context, mediaCodecInfo.secure);
        this.placeholderSurface = placeholderSurfaceNewInstance;
        return placeholderSurfaceNewInstance;
    }

    private boolean hasSurfaceForCodec(MediaCodecInfo mediaCodecInfo) {
        if (this.videoSink != null) {
            return true;
        }
        Surface surface = this.displaySurface;
        return (surface != null && surface.isValid()) || shouldUseDetachedSurface(mediaCodecInfo) || shouldUsePlaceholderSurface(mediaCodecInfo);
    }

    private boolean isBufferBeforeStartTime(DecoderInputBuffer decoderInputBuffer) {
        return decoderInputBuffer.timeUs < getLastResetPositionUs();
    }

    private boolean isBufferProbablyLastSample(DecoderInputBuffer decoderInputBuffer) {
        if (hasReadStreamToEnd() || decoderInputBuffer.isLastSample() || getStreamEndPositionUs() == C.TIME_UNSET) {
            return true;
        }
        return getStreamEndPositionUs() - (decoderInputBuffer.timeUs - getOutputStreamOffsetUs()) <= 100000;
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long jElapsedRealtime = getClock().elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, jElapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = jElapsedRealtime;
        }
    }

    private void maybeNotifyRenderedFirstFrame() {
        if (!this.videoFrameReleaseControl.onFrameReleasedIsFirstFrame() || this.displaySurface == null) {
            return;
        }
        notifyRenderedFirstFrame();
    }

    private void maybeNotifyVideoFrameProcessingOffset() {
        int i2 = this.videoFrameProcessingOffsetCount;
        if (i2 != 0) {
            this.eventDispatcher.reportVideoFrameProcessingOffset(this.totalVideoFrameProcessingOffsetUs, i2);
            this.totalVideoFrameProcessingOffsetUs = 0L;
            this.videoFrameProcessingOffsetCount = 0;
        }
    }

    private void maybeNotifyVideoSizeChanged(VideoSize videoSize) {
        if (videoSize.equals(VideoSize.UNKNOWN) || videoSize.equals(this.reportedVideoSize)) {
            return;
        }
        this.reportedVideoSize = videoSize;
        this.eventDispatcher.videoSizeChanged(videoSize);
    }

    private void maybeRenotifyRenderedFirstFrame() {
        Surface surface = this.displaySurface;
        if (surface == null || !this.haveReportedFirstFrameRenderedForCurrentSurface) {
            return;
        }
        this.eventDispatcher.renderedFirstFrame(surface);
    }

    private void maybeRenotifyVideoSizeChanged() {
        VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null) {
            this.eventDispatcher.videoSizeChanged(videoSize);
        }
    }

    private void maybeSetKeyAllowFrameDrop(MediaFormat mediaFormat) {
        if (this.videoSink == null || Util.isFrameDropAllowedOnSurfaceInput(this.context)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    private void maybeSetupTunnelingForFirstFrame() {
        MediaCodecAdapter codec;
        if (this.tunneling && (codec = getCodec()) != null) {
            this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListener(this, codec);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                codec.setParameters(bundle);
            }
        }
    }

    private void notifyFrameMetadataListener(long j2, long j3, Format format) {
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j2, j3, format, getCodecOutputMediaFormat());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyRenderedFirstFrame() {
        this.eventDispatcher.renderedFirstFrame(this.displaySurface);
        this.haveReportedFirstFrameRenderedForCurrentSurface = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFrameRateEstimateChanged(float f2) {
        this.videoFrameReleaseControl.setSurfaceMediaFrameRate(f2);
        updateCodecOperatingRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProcessedTunneledEndOfStream() {
        setPendingOutputEndOfStream();
    }

    private void releaseFrame(MediaCodecAdapter mediaCodecAdapter, int i2, long j2, Format format) {
        MediaCodecVideoRenderer mediaCodecVideoRenderer;
        VideoFrameReleaseControl.FrameReleaseInfo frameReleaseInfo = this.videoFrameReleaseInfo;
        long releaseTimeNs = frameReleaseInfo.getReleaseTimeNs();
        long earlyUs = frameReleaseInfo.getEarlyUs();
        if (shouldSkipBuffersWithIdenticalReleaseTime() && releaseTimeNs == this.lastFrameReleaseTimeNs) {
            skipOutputBuffer(mediaCodecAdapter, i2, j2);
            mediaCodecVideoRenderer = this;
        } else {
            mediaCodecVideoRenderer = this;
            mediaCodecVideoRenderer.notifyFrameMetadataListener(j2, releaseTimeNs, format);
            mediaCodecVideoRenderer.renderOutputBufferV21(mediaCodecAdapter, i2, j2, releaseTimeNs);
            releaseTimeNs = releaseTimeNs;
        }
        mediaCodecVideoRenderer.updateVideoFrameProcessingOffsetCounters(earlyUs);
        mediaCodecVideoRenderer.lastFrameReleaseTimeNs = releaseTimeNs;
    }

    private void releasePlaceholderSurface() {
        PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.placeholderSurface = null;
        }
    }

    private static void setHdr10PlusInfoV29(MediaCodecAdapter mediaCodecAdapter, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        mediaCodecAdapter.setParameters(bundle);
    }

    private void setOutput(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.displaySurface == surface) {
            if (surface != null) {
                maybeRenotifyVideoSizeChanged();
                maybeRenotifyRenderedFirstFrame();
                return;
            }
            return;
        }
        this.displaySurface = surface;
        if (this.videoSink == null) {
            this.videoFrameReleaseControl.setOutputSurface(surface);
        }
        boolean z = false;
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        int state = getState();
        MediaCodecAdapter codec = getCodec();
        if (codec != null) {
            if (this.videoSink == null) {
                MediaCodecInfo codecInfo = getCodecInfo();
                an.B(codecInfo);
                if (!hasSurfaceForCodec(codecInfo) || this.codecNeedsSetOutputSurfaceWorkaround) {
                    releaseCodec();
                    maybeInitCodecOrBypass();
                } else {
                    setOutputSurface(codec, getSurfaceForCodec(codecInfo));
                    z = true;
                }
            } else {
                z = true;
            }
        }
        if (surface != null) {
            maybeRenotifyVideoSizeChanged();
        } else {
            this.reportedVideoSize = null;
            VideoSink videoSink = this.videoSink;
            if (videoSink != null) {
                videoSink.clearOutputSurfaceInfo();
            }
        }
        if (state == 2) {
            VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.join(z);
            } else {
                this.videoFrameReleaseControl.join(z);
            }
        }
        maybeSetupTunnelingForFirstFrame();
    }

    private void setOutputSurface(MediaCodecAdapter mediaCodecAdapter, Surface surface) {
        if (surface != null) {
            setOutputSurfaceV23(mediaCodecAdapter, surface);
        } else {
            if (Build.VERSION.SDK_INT < 35) {
                throw new IllegalStateException();
            }
            detachOutputSurfaceV35(mediaCodecAdapter);
        }
    }

    private boolean shouldDiscardCodecForFrameRateChange(MediaCodecInfo mediaCodecInfo, Format format, Format format2, boolean z) {
        if (this.changeFrameRateStrategy != Integer.MIN_VALUE && Build.VERSION.SDK_INT < 31 && (Build.VERSION.SDK_INT != 30 || Build.MODEL.startsWith("MiTV"))) {
            float f2 = format.frameRate;
            if (f2 != -1.0f) {
                float f3 = format2.frameRate;
                if (f3 == -1.0f || (mediaCodecInfo.secure && z)) {
                    return false;
                }
                if (Math.abs((Math.max(f3, f2) / Math.min(format2.frameRate, format.frameRate)) - Math.round(r3)) > 0.01f) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int supportsFormatInternal(Context context, MediaCodecSelector mediaCodecSelector, Format format) {
        boolean z;
        int i2 = 0;
        if (MimeTypes.isVideo(format.sampleMimeType)) {
            boolean z2 = format.drmInitData != null;
            List<MediaCodecInfo> decoderInfos = getDecoderInfos(context, mediaCodecSelector, format, z2, false);
            if (z2 && decoderInfos.isEmpty()) {
                decoderInfos = getDecoderInfos(context, mediaCodecSelector, format, false, false);
            }
            if (decoderInfos.isEmpty()) {
                i2 = 1;
            } else {
                if (supportsFormatDrm(format)) {
                    MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
                    boolean zIsFormatSupported = mediaCodecInfo.isFormatSupported(context, format);
                    if (zIsFormatSupported) {
                        z = true;
                    } else {
                        for (int i3 = 1; i3 < decoderInfos.size(); i3++) {
                            MediaCodecInfo mediaCodecInfo2 = decoderInfos.get(i3);
                            if (mediaCodecInfo2.isFormatSupported(context, format)) {
                                z = false;
                                zIsFormatSupported = true;
                                mediaCodecInfo = mediaCodecInfo2;
                                break;
                            }
                        }
                        z = true;
                    }
                    int i4 = true != zIsFormatSupported ? 3 : 4;
                    int i5 = true != mediaCodecInfo.isSeamlessAdaptationSupported(format) ? 8 : 16;
                    int i6 = true != mediaCodecInfo.hardwareAccelerated ? 0 : 64;
                    int i7 = true != z ? 0 : 128;
                    if (MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) && !Api26.doesDisplaySupportDolbyVision(context)) {
                        i7 = 256;
                    }
                    if (zIsFormatSupported) {
                        List<MediaCodecInfo> decoderInfos2 = getDecoderInfos(context, mediaCodecSelector, format, z2, true);
                        if (!decoderInfos2.isEmpty()) {
                            MediaCodecInfo mediaCodecInfo3 = MediaCodecUtil.getDecoderInfosSortedByFormatSupport(context, decoderInfos2, format).get(0);
                            if (mediaCodecInfo3.isFormatSupported(context, format) && mediaCodecInfo3.isSeamlessAdaptationSupported(format)) {
                                i2 = 32;
                            }
                        }
                    }
                    return RendererCapabilities.CC.create(i4, i5, i2, i6, i7);
                }
                i2 = 2;
            }
        }
        return RendererCapabilities.CC.create(i2);
    }

    private void updateCodecImportance() {
        MediaCodecAdapter codec = getCodec();
        if (codec != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.rendererPriority));
            codec.setParameters(bundle);
        }
    }

    private void updateDiscardedBufferCountersWithInputBuffers(long j2) {
        boolean zIsJoining = this.videoFrameReleaseControl.isJoining();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Long lPeek = this.discardedDecoderInputBufferTimestamps.peek();
            if (lPeek == null || lPeek.longValue() >= j2) {
                break;
            }
            this.discardedDecoderInputBufferTimestamps.poll();
            this.frameRateEstimator.onNextFrame(lPeek.longValue() * 1000);
            if (lPeek.longValue() < getLastResetPositionUs() || zIsJoining) {
                i3++;
            } else {
                i2++;
            }
        }
        updateDroppedBufferCounters(i2, 0);
        this.decoderCounters.skippedInputBufferCount += i3;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format, Format format2, boolean z) {
        int i2;
        int i3;
        DecoderReuseEvaluation decoderReuseEvaluationCanReuseCodec = mediaCodecInfo.canReuseCodec(format, format2);
        int i4 = decoderReuseEvaluationCanReuseCodec.discardReasons;
        CodecMaxValues codecMaxValues = this.codecMaxValues;
        an.B(codecMaxValues);
        if (format2.width > codecMaxValues.width || format2.height > codecMaxValues.height) {
            i4 |= 256;
        }
        if (getMaxInputSize(mediaCodecInfo, format2) > codecMaxValues.inputSize) {
            i4 |= 64;
        }
        if (shouldDiscardCodecForFrameRateChange(mediaCodecInfo, format, format2, z)) {
            i4 |= 65536;
        }
        String str = mediaCodecInfo.name;
        if (i4 != 0) {
            i3 = 0;
            i2 = i4;
        } else {
            i2 = 0;
            i3 = decoderReuseEvaluationCanReuseCodec.result;
        }
        return new DecoderReuseEvaluation(str, format, format2, i3, i2);
    }

    protected void changeVideoSinkInputStream(VideoSink videoSink, int i2, Format format, int i3) {
        List<Effect> listP = this.videoEffects;
        if (listP == null) {
            listP = bn.p();
        }
        videoSink.onInputStreamChanged(i2, format, getOutputStreamStartPositionUs(), i3, listP);
    }

    protected boolean codecNeedsSetOutputSurfaceWorkaround(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (MediaCodecVideoRenderer.class) {
            if (!evaluatedDeviceNeedsSetOutputSurfaceWorkaround) {
                deviceNeedsSetOutputSurfaceWorkaround = evaluateDeviceNeedsSetOutputSurfaceWorkaround();
                evaluatedDeviceNeedsSetOutputSurfaceWorkaround = true;
            }
        }
        return deviceNeedsSetOutputSurfaceWorkaround;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected MediaCodecDecoderException createDecoderException(Throwable th, MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecVideoDecoderException(th, mediaCodecInfo, this.displaySurface);
    }

    protected PlaybackVideoGraphWrapper createPlaybackVideoGraphWrapper(Context context, VideoFrameReleaseControl videoFrameReleaseControl) {
        PlaybackVideoGraphWrapper.Builder builder = new PlaybackVideoGraphWrapper.Builder(context, videoFrameReleaseControl);
        builder.setEnablePlaylistMode(true);
        long j2 = this.minEarlyUsToDropDecoderInput;
        long j3 = C.TIME_UNSET;
        if (j2 != C.TIME_UNSET) {
            j3 = -j2;
        }
        builder.experimentalSetLateThresholdToDropInputUs(j3);
        builder.setClock(getClock());
        return builder.build();
    }

    protected void detachOutputSurfaceV35(MediaCodecAdapter mediaCodecAdapter) {
        mediaCodecAdapter.detachOutputSurface();
    }

    protected void dropOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i2, long j2) {
        TraceUtil.beginSection("dropVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i2, false);
        TraceUtil.endSection();
        updateDroppedBufferCounters(0, 1);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public void enableMayRenderStartOfStream() {
        VideoSink videoSink = this.videoSink;
        if (videoSink == null) {
            this.videoFrameReleaseControl.allowReleaseFirstFrameBeforeStarted();
            return;
        }
        int i2 = this.nextVideoSinkFirstFrameReleaseInstruction;
        if (i2 == 0 || i2 == 1) {
            this.nextVideoSinkFirstFrameReleaseInstruction = 0;
        } else {
            videoSink.allowReleaseFirstFrameBeforeStarted();
        }
    }

    protected void experimentalDisableAdvancingTimestampChecksInVideoFrameReleaseControl() {
        this.videoFrameReleaseControl.experimentalDisableAdvancingTimestampChecks();
    }

    protected long getBufferTimestampAdjustmentUs() {
        return -this.startPositionUs;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int getCodecBufferFlags(DecoderInputBuffer decoderInputBuffer) {
        ScrubbingModeParameters scrubbingModeParameters;
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.enableMediaCodecBufferDecodeOnlyFlag || (((scrubbingModeParameters = this.scrubbingModeParameters) != null && scrubbingModeParameters.useDecodeOnlyFlag) || this.tunneling)) && isBufferBeforeStartTime(decoderInputBuffer) && !isBufferProbablyLastSample(decoderInputBuffer)) ? 32 : 0;
        }
        return 0;
    }

    protected CodecMaxValues getCodecMaxValues(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) {
        int codecMaxInputSize;
        int iMax = format.width;
        int iMax2 = format.height;
        int maxInputSize = getMaxInputSize(mediaCodecInfo, format);
        int length = formatArr.length;
        if (length != 1) {
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                Format formatBuild = formatArr[i2];
                if (format.colorInfo != null && formatBuild.colorInfo == null) {
                    Format.Builder builderBuildUpon = formatBuild.buildUpon();
                    builderBuildUpon.setColorInfo(format.colorInfo);
                    formatBuild = builderBuildUpon.build();
                }
                if (mediaCodecInfo.canReuseCodec(format, formatBuild).result != 0) {
                    int i3 = formatBuild.width;
                    z |= i3 == -1 || formatBuild.height == -1;
                    iMax = Math.max(iMax, i3);
                    iMax2 = Math.max(iMax2, formatBuild.height);
                    maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, formatBuild));
                }
            }
            if (z) {
                Log.w(TAG, "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                Point codecMaxSize = getCodecMaxSize(mediaCodecInfo, format);
                if (codecMaxSize != null) {
                    iMax = Math.max(iMax, codecMaxSize.x);
                    iMax2 = Math.max(iMax2, codecMaxSize.y);
                    Format.Builder builderBuildUpon2 = format.buildUpon();
                    builderBuildUpon2.setWidth(iMax);
                    builderBuildUpon2.setHeight(iMax2);
                    maxInputSize = Math.max(maxInputSize, getCodecMaxInputSize(mediaCodecInfo, builderBuildUpon2.build()));
                    Log.w(TAG, "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
        } else if (maxInputSize != -1 && (codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format)) != -1) {
            maxInputSize = Math.min((int) (maxInputSize * INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR), codecMaxInputSize);
        }
        return new CodecMaxValues(iMax, iMax2, maxInputSize);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float getCodecOperatingRateV23(float f2, Format format, Format[] formatArr) {
        MediaCodecInfo codecInfo;
        float frameDurationNs = -1.0f;
        for (Format format2 : formatArr) {
            float f3 = format2.frameRate;
            if (f3 != -1.0f) {
                frameDurationNs = Math.max(frameDurationNs, f3);
            }
        }
        if (frameDurationNs == -1.0f && getCodec() != null && this.frameRateEstimator.getFrameDurationNs() != C.TIME_UNSET) {
            frameDurationNs = 1.0E9f / this.frameRateEstimator.getFrameDurationNs();
        }
        float f4 = frameDurationNs == -1.0f ? -1.0f : frameDurationNs * f2;
        if (this.scrubbingModeParameters == null || (codecInfo = getCodecInfo()) == null) {
            return f4;
        }
        float maxSupportedFrameRate = codecInfo.getMaxSupportedFrameRate(format.width, format.height);
        return f4 != -1.0f ? Math.max(f4, maxSupportedFrameRate) : maxSupportedFrameRate;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected long getDurationToProgressUs(long j2, long j3, boolean z) {
        if (!this.enableDurationToProgressUs || !z) {
            return super.getDurationToProgressUs(j2, j3, z);
        }
        if (getState() != 2) {
            return (isReady() || isEnded()) ? 1000000L : 10000L;
        }
        if (this.nextOutputBufferToProcessPresentationTimeUs != C.TIME_UNSET && this.videoSink == null) {
            if (isEnded()) {
                return Math.max(10000L, (long) (((this.nextOutputBufferToProcessPresentationTimeUs - j2) / getPlaybackSpeed()) / 2.0f));
            }
            try {
                if (this.videoFrameReleaseControl.getFrameReleaseAction(this.nextOutputBufferToProcessPresentationTimeUs, j2, j3, getOutputStreamStartPositionUs(), false, false, this.frameRateEstimator.getFrameDurationNs(), this.frameRateEstimator.getFrameIndex(), this.videoFrameReleaseInfo) != 5) {
                    return 0L;
                }
                return Math.max(0L, (this.videoFrameReleaseInfo.getEarlyUs() + (Util.msToUs(getClock().elapsedRealtime()) - j3)) - 25000);
            } catch (ExoPlaybackException unused) {
                Log.w(TAG, "Error while evaluating frame release action");
            }
        }
        return 10000L;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format, MediaCrypto mediaCrypto, float f2) {
        String str = mediaCodecInfo.codecMimeType;
        CodecMaxValues codecMaxValues = getCodecMaxValues(mediaCodecInfo, format, getStreamFormats());
        this.codecMaxValues = codecMaxValues;
        MediaFormat mediaFormat = getMediaFormat(format, str, codecMaxValues, f2, this.deviceNeedsNoPostProcessWorkaround, this.tunneling ? this.tunnelingAudioSessionId : 0);
        Surface surfaceForCodec = getSurfaceForCodec(mediaCodecInfo);
        maybeSetKeyAllowFrameDrop(mediaFormat);
        return MediaCodecAdapter.Configuration.createForVideoDecoding(mediaCodecInfo, mediaFormat, format, surfaceForCodec, mediaCrypto);
    }

    protected MediaFormat getMediaFormat(Format format, String str, CodecMaxValues codecMaxValues, float f2, boolean z, int i2) {
        Pair<Integer, Integer> codecProfileAndLevel;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", format.width);
        mediaFormat.setInteger("height", format.height);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "rotation-degrees", format.rotationDegrees);
        MediaFormatUtil.maybeSetColorInfo(mediaFormat, format.colorInfo);
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) && (codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format)) != null) {
            MediaFormatUtil.maybeSetInteger(mediaFormat, "profile", ((Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", codecMaxValues.width);
        mediaFormat.setInteger("max-height", codecMaxValues.height);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", codecMaxValues.inputSize);
        mediaFormat.setInteger("priority", 0);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f2);
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i2 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i2);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.rendererPriority));
        }
        applyCodecParametersToMediaFormat(mediaFormat);
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public String getName() {
        return TAG;
    }

    protected Surface getSurface() {
        return this.displaySurface;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer = decoderInputBuffer.supplementalData;
        if (byteBuffer != null && byteBuffer.remaining() >= 7) {
            byte b2 = byteBuffer.get();
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            byte b3 = byteBuffer.get();
            byte b4 = byteBuffer.get();
            byteBuffer.position(0);
            if (b2 == -75) {
                if (s == 60) {
                    if (s2 != 1) {
                        s = 60;
                    } else {
                        if (b3 == 4 && (b4 == 0 || b4 == 1)) {
                            if (this.codecHandlesHdr10PlusOutOfBandMetadata) {
                                byte[] bArr = new byte[byteBuffer.remaining()];
                                byteBuffer.get(bArr);
                                byteBuffer.position(0);
                                MediaCodecAdapter codec = getCodec();
                                an.B(codec);
                                setHdr10PlusInfoV29(codec, bArr);
                                return;
                            }
                            return;
                        }
                        s = 60;
                        s2 = 1;
                    }
                }
                b2 = -75;
            }
            if (Build.VERSION.SDK_INT >= 37 && b2 == -75 && s == 144 && s2 == 1) {
                byteBuffer.position(5);
                int iRemaining = byteBuffer.remaining();
                byte[] bArr2 = new byte[iRemaining];
                byteBuffer.get(bArr2);
                byteBuffer.position(0);
                if (iRemaining > 0) {
                    Bundle bundle = new Bundle();
                    bundle.putByteArray(KEY_HDR_ST2094_50_INFO, bArr2);
                    MediaCodecAdapter codec2 = getCodec();
                    an.B(codec2);
                    codec2.setParameters(bundle);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i2, Object obj) {
        if (i2 == 1) {
            setOutput(obj);
            return;
        }
        if (i2 == 7) {
            an.B(obj);
            VideoFrameMetadataListener videoFrameMetadataListener = (VideoFrameMetadataListener) obj;
            this.frameMetadataListener = videoFrameMetadataListener;
            VideoSink videoSink = this.videoSink;
            if (videoSink != null) {
                videoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
                return;
            }
            return;
        }
        if (i2 == 10) {
            an.B(obj);
            int iIntValue = ((Integer) obj).intValue();
            if (this.tunnelingAudioSessionId != iIntValue) {
                this.tunnelingAudioSessionId = iIntValue;
                if (this.tunneling) {
                    releaseCodec();
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 4) {
            an.B(obj);
            int iIntValue2 = ((Integer) obj).intValue();
            this.scalingMode = iIntValue2;
            MediaCodecAdapter codec = getCodec();
            if (codec != null) {
                codec.setVideoScalingMode(iIntValue2);
                return;
            }
            return;
        }
        if (i2 == 5) {
            an.B(obj);
            int iIntValue3 = ((Integer) obj).intValue();
            this.changeFrameRateStrategy = iIntValue3;
            VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.setChangeFrameRateStrategy(iIntValue3);
                return;
            } else {
                this.videoFrameReleaseControl.setChangeFrameRateStrategy(iIntValue3);
                return;
            }
        }
        if (i2 == 13) {
            an.B(obj);
            setVideoEffects((List) obj);
            return;
        }
        if (i2 == 14) {
            an.B(obj);
            Size size = (Size) obj;
            if (size.getWidth() == 0 || size.getHeight() == 0) {
                return;
            }
            this.outputResolution = size;
            VideoSink videoSink3 = this.videoSink;
            if (videoSink3 != null) {
                Surface surface = this.displaySurface;
                an.B(surface);
                videoSink3.setOutputSurfaceInfo(surface, size);
                return;
            }
            return;
        }
        switch (i2) {
            case 16:
                an.B(obj);
                this.rendererPriority = ((Integer) obj).intValue();
                updateCodecImportance();
                break;
            case 17:
                Surface surface2 = this.displaySurface;
                setOutput(null);
                an.B(obj);
                ((MediaCodecVideoRenderer) obj).handleMessage(1, surface2);
                break;
            case 18:
                ScrubbingModeParameters scrubbingModeParameters = this.scrubbingModeParameters;
                boolean z = scrubbingModeParameters != null && scrubbingModeParameters.shouldIncreaseCodecOperatingRate;
                ScrubbingModeParameters scrubbingModeParameters2 = (ScrubbingModeParameters) obj;
                this.scrubbingModeParameters = scrubbingModeParameters2;
                if (z != (scrubbingModeParameters2 != null && scrubbingModeParameters2.shouldIncreaseCodecOperatingRate)) {
                    updateCodecOperatingRate();
                    break;
                }
                break;
            default:
                super.handleMessage(i2, obj);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        if (!super.isEnded()) {
            return false;
        }
        VideoSink videoSink = this.videoSink;
        return videoSink == null || videoSink.isEnded();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        boolean zIsReadyForDecoding = isReadyForDecoding();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            return videoSink.isReady(zIsReadyForDecoding);
        }
        if (zIsReadyForDecoding && (getCodec() == null || this.tunneling)) {
            return true;
        }
        return this.videoFrameReleaseControl.isReady(zIsReadyForDecoding);
    }

    protected boolean maybeDropBuffersToKeyframe(long j2, boolean z) {
        int iSkipSource = skipSource(j2);
        if (iSkipSource == 0) {
            return false;
        }
        this.lastResetToKeyFramePositionUs = j2;
        VideoFrameReleaseControl videoFrameReleaseControl = this.videoFrameReleaseControl;
        PriorityQueue<Long> priorityQueue = this.discardedDecoderInputBufferTimestamps;
        boolean zIsJoining = videoFrameReleaseControl.isJoining();
        Iterator<Long> it = priorityQueue.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            if (it.next().longValue() < getLastResetPositionUs() || zIsJoining) {
                i3++;
            } else {
                i2++;
            }
        }
        this.discardedDecoderInputBufferTimestamps.clear();
        if (z) {
            DecoderCounters decoderCounters = this.decoderCounters;
            int i4 = decoderCounters.skippedInputBufferCount + iSkipSource;
            decoderCounters.skippedInputBufferCount = i4;
            decoderCounters.skippedOutputBufferCount += this.buffersInCodecCount;
            int i5 = i4 + i2;
            decoderCounters.skippedInputBufferCount = i5;
            decoderCounters.skippedInputBufferCount = i5 + i3;
        } else {
            this.decoderCounters.droppedToKeyframeCount++;
            updateDroppedBufferCounters(iSkipSource + i2, this.buffersInCodecCount);
            this.decoderCounters.skippedInputBufferCount += i3;
        }
        flushOrReinitializeCodec();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.flush(false);
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean maybeInitializeProcessingPipeline(Format format) throws ExoPlaybackException {
        VideoSink videoSink = this.videoSink;
        if (videoSink == null || videoSink.isInitialized()) {
            return true;
        }
        try {
            return this.videoSink.initialize(format);
        } catch (VideoSink.VideoSinkException e2) {
            throw this.createRendererException(e2, format, 7000);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onCodecError(Exception exc) {
        Log.e(TAG, "Video codec error", exc);
        this.eventDispatcher.videoCodecError(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j2, long j3) {
        this.eventDispatcher.decoderInitialized(str, j2, j3);
        this.codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(str);
        MediaCodecInfo codecInfo = getCodecInfo();
        an.B(codecInfo);
        this.codecHandlesHdr10PlusOutOfBandMetadata = codecInfo.isHdr10PlusOutOfBandMetadataSupported();
        maybeSetupTunnelingForFirstFrame();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onCodecParametersChanged(CodecParameters codecParameters) {
        this.eventDispatcher.videoCodecParametersChanged(codecParameters);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onCodecReleased(String str) {
        this.eventDispatcher.decoderReleased(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        this.reportedVideoSize = null;
        maybeSetupTunnelingForFirstFrame();
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        this.tunnelingOnFrameRenderedListener = null;
        this.isFlushRequired = shouldFlushCodec();
        this.nextOutputBufferToProcessPresentationTimeUs = C.TIME_UNSET;
        try {
            super.onDisabled();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
            this.eventDispatcher.videoSizeChanged(VideoSize.UNKNOWN);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onEnabled(boolean z, boolean z2) {
        super.onEnabled(z, z2);
        boolean z3 = getConfiguration().tunneling;
        an.u((z3 && this.tunnelingAudioSessionId == 0) ? false : true);
        if (this.tunneling != z3) {
            this.tunneling = z3;
            releaseCodec();
        }
        this.eventDispatcher.enabled(this.decoderCounters);
        if (!this.hasSetVideoSink) {
            if (this.videoEffects != null && this.videoSink == null) {
                PlaybackVideoGraphWrapper playbackVideoGraphWrapperCreatePlaybackVideoGraphWrapper = createPlaybackVideoGraphWrapper(this.context, this.videoFrameReleaseControl);
                playbackVideoGraphWrapperCreatePlaybackVideoGraphWrapper.setTotalVideoInputCount(1);
                this.videoSink = playbackVideoGraphWrapperCreatePlaybackVideoGraphWrapper.getSink(0);
            }
            this.hasSetVideoSink = true;
        }
        int i2 = !z2 ? 1 : 0;
        if (this.videoSink == null) {
            this.videoFrameReleaseControl.setClock(getClock());
            this.videoFrameReleaseControl.onStreamChanged(i2);
        } else {
            configureVideoSink();
            this.nextVideoSinkFirstFrameReleaseInstruction = i2;
            experimentalEnableProcessedStreamChangedAtStart();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onInit() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) {
        DecoderReuseEvaluation decoderReuseEvaluationOnInputFormatChanged = super.onInputFormatChanged(formatHolder);
        Format format = formatHolder.format;
        an.B(format);
        this.eventDispatcher.inputFormatChanged(format, decoderReuseEvaluationOnInputFormatChanged);
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null) {
            videoFrameReleaseEarlyTimeForecaster.reset();
        }
        return decoderReuseEvaluationOnInputFormatChanged;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onOutputFormatChanged(Format format, MediaFormat mediaFormat) {
        int integer;
        int i2;
        MediaCodecAdapter codec = getCodec();
        if (codec != null) {
            codec.setVideoScalingMode(this.scalingMode);
        }
        if (this.tunneling) {
            i2 = format.width;
            integer = format.height;
        } else {
            an.B(mediaFormat);
            boolean z = mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP);
            int integer2 = z ? (mediaFormat.getInteger(KEY_CROP_RIGHT) - mediaFormat.getInteger(KEY_CROP_LEFT)) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger(KEY_CROP_BOTTOM) - mediaFormat.getInteger(KEY_CROP_TOP)) + 1 : mediaFormat.getInteger("height");
            i2 = integer2;
        }
        float f2 = format.pixelWidthHeightRatio;
        int i3 = format.rotationDegrees;
        if (i3 == 90 || i3 == 270) {
            f2 = 1.0f / f2;
            int i4 = integer;
            integer = i2;
            i2 = i4;
        }
        this.decodedVideoSize = new VideoSize(i2, integer, f2);
        VideoSink videoSink = this.videoSink;
        if (videoSink == null || !this.pendingVideoSinkInputStreamChange) {
            this.frameRateEstimator.onFormatChanged(format.frameRate);
        } else {
            if (i2 <= 0 || integer <= 0) {
                return;
            }
            Format.Builder builderBuildUpon = format.buildUpon();
            builderBuildUpon.setWidth(i2);
            builderBuildUpon.setHeight(integer);
            builderBuildUpon.setPixelWidthHeightRatio(f2);
            changeVideoSinkInputStream(videoSink, 1, builderBuildUpon.build(), this.nextVideoSinkFirstFrameReleaseInstruction);
            this.nextVideoSinkFirstFrameReleaseInstruction = 2;
        }
        this.pendingVideoSinkInputStreamChange = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j2, boolean z, boolean z2) {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null && !z) {
            videoSink.flush(true);
        }
        if (z2) {
            this.lastResetToKeyFramePositionUs = j2;
        }
        super.onPositionReset(j2, z, z2);
        if (this.videoSink == null) {
            this.videoFrameReleaseControl.reset();
        }
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null) {
            videoFrameReleaseEarlyTimeForecaster.reset();
        }
        if (z) {
            VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.join(false);
            } else {
                this.videoFrameReleaseControl.join(false);
            }
        }
        maybeSetupTunnelingForFirstFrame();
        this.consecutiveDroppedFrameCount = 0;
        this.nextOutputBufferToProcessPresentationTimeUs = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onProcessedOutputBuffer(long j2) {
        super.onProcessedOutputBuffer(j2);
        if (this.tunneling) {
            return;
        }
        this.buffersInCodecCount--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onProcessedStreamChange() {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.signalEndOfCurrentInputStream();
            if (this.startPositionUs == C.TIME_UNSET) {
                this.startPositionUs = getOutputStreamStartPositionUs();
            }
            this.videoSink.setBufferTimestampAdjustmentUs(getBufferTimestampAdjustmentUs());
        } else {
            this.videoFrameReleaseControl.onStreamChanged(2);
        }
        this.pendingVideoSinkInputStreamChange = true;
        maybeSetupTunnelingForFirstFrame();
    }

    protected void onProcessedTunneledBuffer(long j2) {
        updateOutputFormatForTime(j2);
        maybeNotifyVideoSizeChanged(this.decodedVideoSize);
        this.decoderCounters.renderedOutputBufferCount++;
        maybeNotifyRenderedFirstFrame();
        onProcessedOutputBuffer(j2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        ColorInfo colorInfo;
        MediaCodecInfo codecInfo = getCodecInfo();
        an.B(codecInfo);
        if (codecInfo.mimeType.equals(MimeTypes.VIDEO_AV1) && (byteBuffer = decoderInputBuffer.data) != null) {
            Format codecInputFormat = getCodecInputFormat();
            if (codecInputFormat != null && (colorInfo = codecInputFormat.colorInfo) != null && colorInfo.lumaBitdepth > 8) {
                Av1ObuUtil.maybeRewriteAv1MetadataObus(byteBuffer);
            }
            if (this.av1SampleDependencyParser != null && decoderInputBuffer.isKeyFrame()) {
                this.av1SampleDependencyParser.queueInputBuffer(byteBuffer);
            }
        }
        this.consecutiveDroppedInputBufferCount = 0;
        int codecBufferFlags = getCodecBufferFlags(decoderInputBuffer);
        if ((Build.VERSION.SDK_INT < 34 || (codecBufferFlags & 32) == 0) && !this.tunneling) {
            this.buffersInCodecCount++;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onRelease() {
        VideoSink videoSink = this.videoSink;
        if (videoSink == null || !this.ownsVideoSink) {
            return;
        }
        videoSink.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onReset() {
        try {
            super.onReset();
        } finally {
            this.hasSetVideoSink = false;
            this.startPositionUs = C.TIME_UNSET;
            this.nextOutputBufferToProcessPresentationTimeUs = C.TIME_UNSET;
            releasePlaceholderSurface();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onStarted() {
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = getClock().elapsedRealtime();
        this.totalVideoFrameProcessingOffsetUs = 0L;
        this.videoFrameProcessingOffsetCount = 0;
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.startRendering();
        } else {
            this.videoFrameReleaseControl.onStarted();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onStopped() {
        maybeNotifyDroppedFrames();
        maybeNotifyVideoFrameProcessingOffset();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.stopRendering();
        } else {
            this.videoFrameReleaseControl.onStopped();
        }
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null) {
            videoFrameReleaseEarlyTimeForecaster.reset();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onStreamChanged(Format[] formatArr, long j2, long j3, MediaSource.MediaPeriodId mediaPeriodId) {
        super.onStreamChanged(formatArr, j2, j3, mediaPeriodId);
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null) {
            videoFrameReleaseEarlyTimeForecaster.reset();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean processOutputBuffer(long j2, long j3, final MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, final int i2, int i3, int i4, long j4, boolean z, boolean z2, Format format) {
        an.B(mediaCodecAdapter);
        final long outputStreamOffsetUs = j4 - getOutputStreamOffsetUs();
        updateDiscardedBufferCountersWithInputBuffers(j4);
        this.frameRateEstimator.onNextFrame(1000 * j4);
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            if (!z || z2) {
                return videoSink.handleInputFrame(j4, new VideoSink.VideoFrameHandler(this) { // from class: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.2
                    final /* synthetic */ MediaCodecVideoRenderer this$0;

                    {
                        Objects.requireNonNull(this);
                        this.this$0 = this;
                    }

                    @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
                    public void render(long j5) {
                        this.this$0.renderOutputBuffer(mediaCodecAdapter, i2, outputStreamOffsetUs, j5);
                    }

                    @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
                    public void skip() {
                        this.this$0.dropOutputBuffer(mediaCodecAdapter, i2, outputStreamOffsetUs);
                    }
                });
            }
            skipOutputBuffer(mediaCodecAdapter, i2, outputStreamOffsetUs);
            return true;
        }
        VideoFrameReleaseControl videoFrameReleaseControl = this.videoFrameReleaseControl;
        long outputStreamStartPositionUs = getOutputStreamStartPositionUs();
        FixedFrameRateEstimator fixedFrameRateEstimator = this.frameRateEstimator;
        long j5 = j4;
        int frameReleaseAction = videoFrameReleaseControl.getFrameReleaseAction(j5, j2, j3, outputStreamStartPositionUs, z, z2, fixedFrameRateEstimator.getFrameDurationNs(), fixedFrameRateEstimator.getFrameIndex(), this.videoFrameReleaseInfo);
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null && frameReleaseAction != 5 && frameReleaseAction != 4) {
            videoFrameReleaseEarlyTimeForecaster.onVideoFrameProcessed(j5, this.videoFrameReleaseInfo.getEarlyUs());
        }
        if (frameReleaseAction != 5) {
            j5 = C.TIME_UNSET;
        }
        this.nextOutputBufferToProcessPresentationTimeUs = j5;
        if (frameReleaseAction == 0) {
            long jNanoTime = getClock().nanoTime();
            notifyFrameMetadataListener(outputStreamOffsetUs, jNanoTime, format);
            renderOutputBuffer(mediaCodecAdapter, i2, outputStreamOffsetUs, jNanoTime);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 1) {
            an.B(mediaCodecAdapter);
            releaseFrame(mediaCodecAdapter, i2, outputStreamOffsetUs, format);
            return true;
        }
        if (frameReleaseAction == 2) {
            dropOutputBuffer(mediaCodecAdapter, i2, outputStreamOffsetUs);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction != 3) {
            return false;
        }
        skipOutputBuffer(mediaCodecAdapter, i2, outputStreamOffsetUs);
        updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public void render(long j2, long j3) throws ExoPlaybackException {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            try {
                videoSink.render(j2, j3);
            } catch (VideoSink.VideoSinkException e2) {
                throw createRendererException(e2, e2.format, PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED);
            }
        }
        super.render(j2, j3);
    }

    @Deprecated
    protected void renderOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i2, long j2) {
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i2, true);
        TraceUtil.endSection();
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        if (this.videoSink == null) {
            maybeNotifyVideoSizeChanged(this.decodedVideoSize);
            maybeNotifyRenderedFirstFrame();
        }
    }

    protected void renderOutputBufferV21(MediaCodecAdapter mediaCodecAdapter, int i2, long j2, long j3) {
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i2, j3);
        TraceUtil.endSection();
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        if (this.videoSink == null) {
            maybeNotifyVideoSizeChanged(this.decodedVideoSize);
            maybeNotifyRenderedFirstFrame();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void renderToEndOfStream() {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.signalEndOfCurrentInputStream();
        } else if (getLastBufferInStreamPresentationTimeUs() != C.TIME_UNSET) {
            this.nextOutputBufferToProcessPresentationTimeUs = getLastBufferInStreamPresentationTimeUs();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void resetCodecStateForFlush() {
        super.resetCodecStateForFlush();
        this.discardedDecoderInputBufferTimestamps.clear();
        this.buffersInCodecCount = 0;
        this.consecutiveDroppedInputBufferCount = 0;
        this.isFlushRequired = false;
        this.nextOutputBufferToProcessPresentationTimeUs = C.TIME_UNSET;
        Av1SampleDependencyParser av1SampleDependencyParser = this.av1SampleDependencyParser;
        if (av1SampleDependencyParser != null) {
            av1SampleDependencyParser.reset();
        }
    }

    protected void setOutputSurfaceV23(MediaCodecAdapter mediaCodecAdapter, Surface surface) {
        mediaCodecAdapter.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public void setPlaybackSpeed(float f2, float f3) {
        super.setPlaybackSpeed(f2, f3);
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setPlaybackSpeed(f2);
        } else {
            this.videoFrameReleaseControl.setPlaybackSpeed(f2);
        }
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null) {
            videoFrameReleaseEarlyTimeForecaster.setPlaybackSpeed(f2);
        }
    }

    public void setVideoEffects(List<Effect> list) {
        if (list.equals(VideoFrameProcessor.REDRAW)) {
            VideoSink videoSink = this.videoSink;
            if (videoSink == null || !videoSink.isInitialized()) {
                return;
            }
            this.videoSink.redraw();
            return;
        }
        this.videoEffects = list;
        VideoSink videoSink2 = this.videoSink;
        if (videoSink2 != null) {
            videoSink2.setVideoEffects(list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean shouldDiscardDecoderInputBuffer(androidx.media3.decoder.DecoderInputBuffer r9) {
        /*
            r8 = this;
            boolean r0 = r8.isBufferProbablyLastSample(r9)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8.isBufferBeforeStartTime(r9)
            androidx.media3.exoplayer.video.VideoFrameReleaseEarlyTimeForecaster r2 = r8.videoFrameReleaseEarlyTimeForecaster
            r3 = 1
            if (r2 == 0) goto L28
            long r4 = r9.timeUs
            long r4 = r2.predictEarlyUs(r4)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L28
            long r6 = r8.minEarlyUsToDropDecoderInput
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L28
            r2 = r3
            goto L29
        L28:
            r2 = r1
        L29:
            if (r0 != 0) goto L2e
            if (r2 != 0) goto L2e
            return r1
        L2e:
            boolean r2 = r9.hasSupplementalData()
            if (r2 == 0) goto L35
            return r1
        L35:
            boolean r2 = r9.notDependedOn()
            if (r2 == 0) goto L40
            r9.clear()
        L3e:
            r1 = r3
            goto La2
        L40:
            androidx.media3.exoplayer.video.Av1SampleDependencyParser r2 = r8.av1SampleDependencyParser
            if (r2 == 0) goto La2
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo r2 = r8.getCodecInfo()
            com.google.d.b.an.B(r2)
            r4 = r2
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo r4 = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) r4
            java.lang.String r2 = r2.mimeType
            java.lang.String r4 = "video/av01"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto La2
            java.nio.ByteBuffer r2 = r9.data
            if (r2 == 0) goto La2
            if (r0 != 0) goto L65
            int r4 = r8.consecutiveDroppedInputBufferCount
            if (r4 > 0) goto L63
            goto L65
        L63:
            r4 = r1
            goto L66
        L65:
            r4 = r3
        L66:
            java.nio.ByteBuffer r2 = r2.asReadOnlyBuffer()
            r2.flip()
            androidx.media3.exoplayer.video.Av1SampleDependencyParser r5 = r8.av1SampleDependencyParser
            int r4 = r5.sampleLimitAfterSkippingNonReferenceFrame(r2, r4)
            if (r4 != 0) goto L79
            r9.clear()
            goto L3e
        L79:
            int r5 = r2.limit()
            if (r4 == r5) goto La2
            androidx.media3.exoplayer.video.MediaCodecVideoRenderer$CodecMaxValues r5 = r8.codecMaxValues
            com.google.d.b.an.B(r5)
            r6 = r5
            androidx.media3.exoplayer.video.MediaCodecVideoRenderer$CodecMaxValues r6 = (androidx.media3.exoplayer.video.MediaCodecVideoRenderer.CodecMaxValues) r6
            int r5 = r5.inputSize
            int r2 = r2.capacity()
            int r5 = r5 + r4
            if (r5 >= r2) goto La2
            boolean r2 = r9.isEncrypted()
            if (r2 != 0) goto La2
            java.nio.ByteBuffer r1 = r9.data
            com.google.d.b.an.B(r1)
            r2 = r1
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r1.position(r4)
            goto L3e
        La2:
            if (r1 == 0) goto Lb6
            if (r0 != 0) goto Lab
            int r0 = r8.consecutiveDroppedInputBufferCount
            int r0 = r0 + r3
            r8.consecutiveDroppedInputBufferCount = r0
        Lab:
            java.util.PriorityQueue<java.lang.Long> r8 = r8.discardedDecoderInputBufferTimestamps
            long r2 = r9.timeUs
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            r8.add(r9)
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.shouldDiscardDecoderInputBuffer(androidx.media3.decoder.DecoderInputBuffer):boolean");
    }

    protected boolean shouldDropBuffersToKeyframe(long j2, long j3, boolean z) {
        return j2 < MIN_EARLY_US_VERY_LATE_THRESHOLD && !z;
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldDropFrame(long j2, long j3, boolean z) {
        return shouldDropOutputBuffer(j2, j3, z);
    }

    protected boolean shouldDropOutputBuffer(long j2, long j3, boolean z) {
        return j2 < MIN_EARLY_US_LATE_THRESHOLD && !z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean shouldFlushCodec() {
        /*
            r12 = this;
            boolean r0 = super.shouldFlushCodec()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            androidx.media3.common.Format r0 = r12.getCodecInputFormat()
            long r2 = r12.getStreamEndPositionUs()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r7 = 1
            if (r6 == 0) goto L34
            r8 = 1
            long r8 = r8 + r2
            long r10 = r12.getOutputStreamOffsetUs()
            long r10 = r10 + r2
            long r2 = r12.getSkippedFlushOffsetUs()
            long r2 = r2 + r8
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r8 = r8 - r10
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 <= 0) goto L32
            goto L34
        L32:
            r2 = r1
            goto L35
        L34:
            r2 = r7
        L35:
            androidx.media3.exoplayer.ScrubbingModeParameters r3 = r12.scrubbingModeParameters
            if (r3 == 0) goto L57
            boolean r3 = r3.allowSkippingMediaCodecFlush
            if (r3 == 0) goto L57
            boolean r3 = r12.isFlushRequired
            if (r3 != 0) goto L57
            boolean r3 = r12.tunneling
            if (r3 != 0) goto L57
            if (r0 == 0) goto L4b
            int r0 = r0.maxNumReorderSamples
            if (r0 > 0) goto L57
        L4b:
            if (r2 != 0) goto L57
            long r2 = r12.getLastBufferInStreamPresentationTimeUs()
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 == 0) goto L56
            goto L57
        L56:
            return r1
        L57:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.shouldFlushCodec():boolean");
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldForceReleaseFrame(long j2, long j3) {
        return shouldForceRenderOutputBuffer(j2, j3);
    }

    protected boolean shouldForceRenderOutputBuffer(long j2, long j3) {
        return j2 < MIN_EARLY_US_LATE_THRESHOLD && j3 > 100000;
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldIgnoreFrame(long j2, long j3, long j4, boolean z, boolean z2) {
        if (this.videoSink != null && this.ownsVideoSink) {
            j3 -= getBufferTimestampAdjustmentUs();
        }
        return shouldDropBuffersToKeyframe(j2, j4, z) && maybeDropBuffersToKeyframe(j3, z2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return hasSurfaceForCodec(mediaCodecInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected final boolean shouldReleaseCodecInsteadOfFlushing() {
        MediaCodecInfo codecInfo = getCodecInfo();
        if (this.videoSink == null || codecInfo == null || !(codecInfo.name.equals("c2.mtk.avc.decoder") || codecInfo.name.equals("c2.mtk.hevc.decoder") || codecInfo.name.equals("c2.mtk.vp9.decoder"))) {
            return super.shouldReleaseCodecInsteadOfFlushing();
        }
        return true;
    }

    protected boolean shouldSkipBuffersWithIdenticalReleaseTime() {
        return true;
    }

    protected boolean shouldUseDetachedSurface(MediaCodecInfo mediaCodecInfo) {
        return Build.VERSION.SDK_INT >= 35 && mediaCodecInfo.detachedSurfaceSupported;
    }

    protected boolean shouldUsePlaceholderSurface(MediaCodecInfo mediaCodecInfo) {
        if (this.tunneling || codecNeedsSetOutputSurfaceWorkaround(mediaCodecInfo.name)) {
            return false;
        }
        return !mediaCodecInfo.secure || PlaceholderSurface.isSecureSupported(this.context);
    }

    protected void skipOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i2, long j2) {
        TraceUtil.beginSection("skipVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i2, false);
        TraceUtil.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format) {
        return supportsFormatInternal(this.context, mediaCodecSelector, format);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public boolean supportsResetPositionWithoutKeyFrameReset(long j2) {
        if (getLargestQueuedPresentationTimeUs() == C.TIME_UNSET || j2 < this.lastResetToKeyFramePositionUs) {
            return false;
        }
        long lastProcessedOutputBufferTimeUs = getLastProcessedOutputBufferTimeUs();
        return lastProcessedOutputBufferTimeUs == C.TIME_UNSET || j2 > lastProcessedOutputBufferTimeUs;
    }

    protected void updateDroppedBufferCounters(int i2, int i3) {
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.droppedInputBufferCount += i2;
        int i4 = i2 + i3;
        decoderCounters.droppedBufferCount += i4;
        this.droppedFrames += i4;
        int i5 = this.consecutiveDroppedFrameCount + i4;
        this.consecutiveDroppedFrameCount = i5;
        decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(i5, decoderCounters.maxConsecutiveDroppedBufferCount);
        int i6 = this.maxDroppedFramesToNotify;
        if (i6 <= 0 || this.droppedFrames < i6) {
            return;
        }
        maybeNotifyDroppedFrames();
    }

    protected void updateVideoFrameProcessingOffsetCounters(long j2) {
        this.decoderCounters.addVideoFrameProcessingOffset(j2);
        this.totalVideoFrameProcessingOffsetUs += j2;
        this.videoFrameProcessingOffsetCount++;
    }

    public static int supportsFormat(Context context, MediaCodecSelector mediaCodecSelector, Format format) {
        return supportsFormatInternal(context, mediaCodecSelector, format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i2, long j2, long j3) {
        renderOutputBufferV21(mediaCodecAdapter, i2, j2, j3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z) {
        return MediaCodecUtil.getDecoderInfosSortedByFormatSupport(this.context, getDecoderInfos(this.context, mediaCodecSelector, format, z, this.tunneling), format);
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j2, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, int i2, float f2) {
        Builder builder = new Builder(context);
        builder.setMediaCodecSelector(mediaCodecSelector);
        builder.setCodecAdapterFactory(factory);
        builder.setAllowedJoiningTimeMs(j2);
        builder.setEnableDecoderFallback(z);
        builder.setEventHandler(handler);
        builder.setEventListener(videoRendererEventListener);
        builder.setMaxDroppedFramesToNotify(i2);
        builder.setAssumedMinimumCodecOperatingRate(f2);
        this(builder);
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j2, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, int i2, float f2, VideoSink videoSink) {
        Builder builder = new Builder(context);
        builder.setMediaCodecSelector(mediaCodecSelector);
        builder.setCodecAdapterFactory(factory);
        builder.setAllowedJoiningTimeMs(j2);
        builder.setEnableDecoderFallback(z);
        builder.setEventHandler(handler);
        builder.setEventListener(videoRendererEventListener);
        builder.setMaxDroppedFramesToNotify(i2);
        builder.setAssumedMinimumCodecOperatingRate(f2);
        builder.setVideoSink(videoSink);
        this(builder);
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        Builder builder = new Builder(context);
        builder.setMediaCodecSelector(mediaCodecSelector);
        this(builder);
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j2) {
        Builder builder = new Builder(context);
        builder.setMediaCodecSelector(mediaCodecSelector);
        builder.setAllowedJoiningTimeMs(j2);
        this(builder);
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j2, Handler handler, VideoRendererEventListener videoRendererEventListener, int i2) {
        Builder builder = new Builder(context);
        builder.setMediaCodecSelector(mediaCodecSelector);
        builder.setAllowedJoiningTimeMs(j2);
        builder.setEventHandler(handler);
        builder.setEventListener(videoRendererEventListener);
        builder.setMaxDroppedFramesToNotify(i2);
        this(builder);
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j2, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, int i2) {
        Builder builder = new Builder(context);
        builder.setMediaCodecSelector(mediaCodecSelector);
        builder.setAllowedJoiningTimeMs(j2);
        builder.setEnableDecoderFallback(z);
        builder.setEventHandler(handler);
        builder.setEventListener(videoRendererEventListener);
        builder.setMaxDroppedFramesToNotify(i2);
        this(builder);
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j2, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, int i2) {
        Builder builder = new Builder(context);
        builder.setMediaCodecSelector(mediaCodecSelector);
        builder.setCodecAdapterFactory(factory);
        builder.setAllowedJoiningTimeMs(j2);
        builder.setEnableDecoderFallback(z);
        builder.setEventHandler(handler);
        builder.setEventListener(videoRendererEventListener);
        builder.setMaxDroppedFramesToNotify(i2);
        this(builder);
    }
}
