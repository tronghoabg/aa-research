package androidx.camera.video;

import android.content.ContentValues;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.MutableStateObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.StateObservable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.CloseGuardHelper;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.utils.ArrayRingBuffer;
import androidx.camera.core.internal.utils.RingBuffer;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.Recorder;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.OutputStorage;
import androidx.camera.video.internal.OutputStorageImpl;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.camera.video.internal.config.AudioMimeInfo;
import androidx.camera.video.internal.config.MediaConfigUtil;
import androidx.camera.video.internal.config.MediaInfo;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import androidx.camera.video.internal.encoder.BufferCopiedEncodedData;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncodedData;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.EncoderConfig;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.encoder.OutputConfig;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.camera.video.internal.muxer.Media3MuxerImpl;
import androidx.camera.video.internal.muxer.MediaMuxerImpl;
import androidx.camera.video.internal.muxer.Muxer;
import androidx.camera.video.internal.muxer.MuxerException;
import androidx.camera.video.internal.muxer.MuxerFactory;
import androidx.camera.video.internal.utils.CodecUtil;
import androidx.camera.video.internal.utils.OutputUtil;
import androidx.camera.video.internal.utils.StorageUtil;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.media3.common.MimeTypes;
import com.google.d.m.a.bm;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Recorder implements VideoOutput {
    private static final int AUDIO_CACHE_SIZE = 60;
    private static final Executor AUDIO_EXECUTOR;
    static final EncoderFactory DEFAULT_ENCODER_FACTORY;
    private static final MuxerFactory DEFAULT_MUXER_FACTORY;
    public static final QualitySelector DEFAULT_QUALITY_SELECTOR;
    private static final VideoEncoderInfo.Finder DEFAULT_VIDEO_ENCODER_INFO_FINDER;
    private static final String INSUFFICIENT_STORAGE_ERROR_MSG = "Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.";
    private static final String MEDIA_COLUMN = "_data";
    private static final MediaSpec MEDIA_SPEC_DEFAULT;
    private static final int NOT_PENDING = 0;
    private static final OutputStorage.Factory OUTPUT_STORAGE_FACTORY_DEFAULT;
    private static final int PENDING = 1;
    private static final Exception PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
    private static final long REQUIRED_FREE_STORAGE_DEFAULT_BYTES = 52428800;
    private static final long REQUIRED_FREE_STORAGE_UNSET = -1;
    private static final long RETRY_SETUP_VIDEO_DELAY_MS = 1000;
    private static final int RETRY_SETUP_VIDEO_MAX_COUNT = 3;
    private static final long SOURCE_NON_STREAMING_TIMEOUT_MS = 1000;
    private static final String TAG = "Recorder";
    public static final int VIDEO_CAPABILITIES_SOURCE_CAMCORDER_PROFILE = 0;
    public static final int VIDEO_CAPABILITIES_SOURCE_CODEC_CAPABILITIES = 1;
    static final int VIDEO_RECORDING_TYPE_HIGH_SPEED = 2;
    static final int VIDEO_RECORDING_TYPE_REGULAR = 1;
    private static final VideoSpec VIDEO_SPEC_DEFAULT;
    static long sRetrySetupVideoDelayMs;
    static int sRetrySetupVideoMaxCount;
    private final EncoderFactory mAudioEncoderFactory;
    private final Executor mExecutor;
    private final MutableStateObservable<Boolean> mIsRecording;
    SurfaceRequest mLatestSurfaceRequest;
    final MutableStateObservable<MediaSpec> mMediaSpec;
    private final MuxerFactory mMuxerFactory;
    private final OutputStorage.Factory mOutputStorageFactory;
    private final long mRequiredFreeStorageBytes;
    final Executor mSequentialExecutor;
    private final MutableStateObservable<StreamInfo> mStreamInfo;
    private final Executor mUserProvidedExecutor;
    private final int mVideoCapabilitiesSource;
    private final EncoderFactory mVideoEncoderFactory;
    VideoEncoderSession mVideoEncoderSession;
    Timebase mVideoSourceTimebase;
    private static final Set<State> PENDING_STATES = DesugarCollections.unmodifiableSet(EnumSet.of(State.PENDING_RECORDING, State.PENDING_PAUSED));
    private static final Set<State> VALID_NON_PENDING_STATES_WHILE_PENDING = DesugarCollections.unmodifiableSet(EnumSet.of(State.CONFIGURING, State.IDLING, State.RESETTING, State.STOPPING, State.ERROR));
    static final List<String> SUPPORTED_VIDEO_MIME_TYPES = Arrays.asList(MimeTypes.VIDEO_AV1, MimeTypes.VIDEO_MP4V, MimeTypes.VIDEO_H263, "video/avc", MimeTypes.VIDEO_H265, MimeTypes.VIDEO_VP8, MimeTypes.VIDEO_VP9, MimeTypes.VIDEO_APV, MimeTypes.VIDEO_DOLBY_VISION);
    static final List<String> SUPPORTED_AUDIO_MIME_TYPES = Arrays.asList("audio/mp4a-latm", MimeTypes.AUDIO_AMR_NB, MimeTypes.AUDIO_AMR_WB, MimeTypes.AUDIO_OPUS, MimeTypes.AUDIO_VORBIS);
    private final Object mLock = new Object();
    private final MutableStateObservable<Range<Integer>> mVideoEncoderBitrateRange = MutableStateObservable.withInitialState(null);
    private State mState = State.CONFIGURING;
    private State mNonPendingState = null;
    int mStreamId = 0;
    RecordingRecord mActiveRecordingRecord = null;
    RecordingRecord mPendingRecordingRecord = null;
    private long mLastGeneratedRecordingId = 0;
    RecordingRecord mInProgressRecording = null;
    boolean mInProgressRecordingStopping = false;
    private SurfaceRequest.TransformationInfo mInProgressTransformationInfo = null;
    private SurfaceRequest.TransformationInfo mSourceTransformationInfo = null;
    private MediaInfo mResolvedMediaInfo = null;
    final List<bm<Void>> mEncodingFutures = new ArrayList();
    Integer mAudioTrackIndex = null;
    Integer mVideoTrackIndex = null;
    Surface mLatestSurface = null;
    Surface mActiveSurface = null;
    Muxer mMuxer = null;
    AudioSource mAudioSource = null;
    Encoder mVideoEncoder = null;
    OutputConfig mVideoOutputConfig = null;
    Encoder mAudioEncoder = null;
    OutputConfig mAudioOutputConfig = null;
    AudioState mAudioState = AudioState.INITIALIZING;
    Uri mOutputUri = Uri.EMPTY;
    long mRecordingBytes = 0;
    long mRecordingAudioBytes = 0;
    long mRecordingDurationUs = 0;
    long mFirstRecordingVideoDataTimeUs = Long.MAX_VALUE;
    int mFirstRecordingVideoBitrate = 0;
    long mFirstRecordingAudioDataTimeUs = Long.MAX_VALUE;
    long mPreviousRecordingVideoDataTimeUs = Long.MAX_VALUE;
    long mPreviousRecordingAudioDataTimeUs = Long.MAX_VALUE;
    long mFileSizeLimitInBytes = 0;
    long mDurationLimitUs = 0;
    int mRecordingStopError = 1;
    Throwable mRecordingStopErrorCause = null;
    EncodedData mPendingFirstVideoData = null;
    final RingBuffer<EncodedData> mPendingAudioRingBuffer = new ArrayRingBuffer(60);
    Throwable mAudioErrorCause = null;
    boolean mIsAudioSourceSilenced = false;
    VideoOutput.SourceState mSourceState = VideoOutput.SourceState.INACTIVE;
    ScheduledFuture<?> mSourceNonStreamingTimeout = null;
    private boolean mNeedsResetBeforeNextStart = false;
    private VideoEncoderConfig mVideoEncoderConfig = null;
    VideoEncoderSession mVideoEncoderSessionToRelease = null;
    double mAudioAmplitude = AudioStats.AUDIO_AMPLITUDE_NONE;
    private boolean mShouldSendResumeEvent = false;
    private SetupVideoTask mSetupVideoTask = null;
    private OutputStorage mOutputStorage = null;
    private long mAvailableBytesAboveRequired = Long.MAX_VALUE;
    private boolean mHasGlProcessing = false;

    /* compiled from: WazeSource */
    enum AudioState {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private EncoderFactory mAudioEncoderFactory;
        private final MediaSpec.Builder mMediaSpecBuilder;
        private MuxerFactory mMuxerFactory;
        private OutputStorage.Factory mOutputStorageFactory;
        private long mRequiredFreeStorageBytes;
        private EncoderFactory mVideoEncoderFactory;
        private int mVideoCapabilitiesSource = 0;
        private Executor mExecutor = null;

        public Builder() {
            EncoderFactory encoderFactory = Recorder.DEFAULT_ENCODER_FACTORY;
            this.mVideoEncoderFactory = encoderFactory;
            this.mAudioEncoderFactory = encoderFactory;
            this.mMuxerFactory = Recorder.DEFAULT_MUXER_FACTORY;
            this.mOutputStorageFactory = Recorder.OUTPUT_STORAGE_FACTORY_DEFAULT;
            this.mRequiredFreeStorageBytes = -1L;
            this.mMediaSpecBuilder = Recorder.MEDIA_SPEC_DEFAULT.toBuilder();
        }

        public Recorder build() {
            return new Recorder(this.mExecutor, this.mMediaSpecBuilder.build(), this.mVideoCapabilitiesSource, this.mVideoEncoderFactory, this.mAudioEncoderFactory, this.mMuxerFactory, this.mOutputStorageFactory, this.mRequiredFreeStorageBytes);
        }

        public Builder setAspectRatio(final int i2) {
            this.mMediaSpecBuilder.configureVideo(new Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda2
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((VideoSpec.Builder) obj).setAspectRatio(i2);
                }
            });
            return this;
        }

        Builder setAudioEncoderFactory(EncoderFactory encoderFactory) {
            this.mAudioEncoderFactory = encoderFactory;
            return this;
        }

        public Builder setAudioMimeType(final String str) {
            Preconditions.checkArgument(Recorder.SUPPORTED_AUDIO_MIME_TYPES.contains(str), "Unsupported audio MIME type: ".concat(String.valueOf(str)));
            this.mMediaSpecBuilder.configureAudio(new Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda6
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((AudioSpec.Builder) obj).setMimeType(str);
                }
            });
            return this;
        }

        public Builder setAudioSource(final int i2) {
            this.mMediaSpecBuilder.configureAudio(new Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda1
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((AudioSpec.Builder) obj).setSource(i2);
                }
            });
            return this;
        }

        public Builder setExecutor(Executor executor) {
            Preconditions.checkNotNull(executor, "The specified executor can't be null.");
            this.mExecutor = executor;
            return this;
        }

        public Builder setMuxerFactory(MuxerFactory muxerFactory) {
            this.mMuxerFactory = muxerFactory;
            return this;
        }

        public Builder setOutputFormat(int i2) {
            this.mMediaSpecBuilder.setOutputFormat(i2);
            return this;
        }

        Builder setOutputStorageFactory(OutputStorage.Factory factory) {
            this.mOutputStorageFactory = factory;
            return this;
        }

        public Builder setQualitySelector(final QualitySelector qualitySelector) {
            Preconditions.checkNotNull(qualitySelector, "The specified quality selector can't be null.");
            this.mMediaSpecBuilder.configureVideo(new Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda3
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((VideoSpec.Builder) obj).setQualitySelector(qualitySelector);
                }
            });
            return this;
        }

        public Builder setRequiredFreeStorageBytes(long j2) {
            Preconditions.checkArgument(j2 > 0);
            this.mRequiredFreeStorageBytes = j2;
            return this;
        }

        public Builder setTargetAudioChannelCount(final int i2) {
            if (i2 > 0) {
                this.mMediaSpecBuilder.configureAudio(new Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda4
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        ((AudioSpec.Builder) obj).setChannelCount(i2);
                    }
                });
                return this;
            }
            throw new IllegalArgumentException("Target channel count must be greater than 0, but was " + i2);
        }

        public Builder setTargetAudioEncodingBitRate(final int i2) {
            if (i2 > 0) {
                this.mMediaSpecBuilder.configureAudio(new Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda7
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        ((AudioSpec.Builder) obj).setBitrate(i2);
                    }
                });
                return this;
            }
            throw new IllegalArgumentException("The requested target bitrate " + i2 + " is not supported. Target bitrate must be greater than 0.");
        }

        public Builder setTargetVideoEncodingBitRate(final int i2) {
            if (i2 > 0) {
                this.mMediaSpecBuilder.configureVideo(new Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        ((VideoSpec.Builder) obj).setBitrate(i2);
                    }
                });
                return this;
            }
            throw new IllegalArgumentException("The requested target bitrate " + i2 + " is not supported. Target bitrate must be greater than 0.");
        }

        public Builder setVideoCapabilitiesSource(int i2) {
            boolean z = true;
            if (i2 != 0) {
                if (i2 == 1) {
                    i2 = 1;
                } else {
                    z = false;
                }
            }
            Preconditions.checkArgument(z, "Not a supported video capabilities source: " + i2);
            this.mVideoCapabilitiesSource = i2;
            return this;
        }

        Builder setVideoEncoderFactory(EncoderFactory encoderFactory) {
            this.mVideoEncoderFactory = encoderFactory;
            return this;
        }

        public Builder setVideoMimeType(final String str) {
            Preconditions.checkArgument(Recorder.SUPPORTED_VIDEO_MIME_TYPES.contains(str), "Unsupported video MIME type: ".concat(String.valueOf(str)));
            this.mMediaSpecBuilder.configureVideo(new Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda5
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((VideoSpec.Builder) obj).setMimeType(str);
                }
            });
            return this;
        }
    }

    /* compiled from: WazeSource */
    class SetupVideoTask {
        private final int mMaxRetryCount;
        private final MediaInfo mMediaInfo;
        private final SurfaceRequest mSurfaceRequest;
        private final Timebase mTimebase;
        private boolean mIsFailedRetryCanceled = false;
        private int mRetryCount = 0;
        private ScheduledFuture<?> mRetryFuture = null;

        /* compiled from: WazeSource */
        /* renamed from: androidx.camera.video.Recorder$SetupVideoTask$1, reason: invalid class name */
        class AnonymousClass1 implements FutureCallback<Encoder> {
            final /* synthetic */ MediaInfo val$mediaInfo;
            final /* synthetic */ VideoEncoderSession val$videoEncoderSession;

            AnonymousClass1(VideoEncoderSession videoEncoderSession, MediaInfo mediaInfo) {
                this.val$videoEncoderSession = videoEncoderSession;
                this.val$mediaInfo = mediaInfo;
            }

            /* renamed from: lambda$onFailure$0$androidx-camera-video-Recorder$SetupVideoTask$1, reason: not valid java name */
            /* synthetic */ void m1466xdc553cf6(MediaInfo mediaInfo) {
                if (SetupVideoTask.this.mIsFailedRetryCanceled) {
                    return;
                }
                Logger.d(Recorder.TAG, "Retry setupVideo #" + SetupVideoTask.this.mRetryCount);
                SetupVideoTask setupVideoTask = SetupVideoTask.this;
                setupVideoTask.setupVideo(setupVideoTask.mSurfaceRequest, setupVideoTask.mTimebase, mediaInfo);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                Objects.toString(th);
                Logger.w(Recorder.TAG, "VideoEncoder Setup error: ".concat(String.valueOf(th)), th);
                SetupVideoTask setupVideoTask = SetupVideoTask.this;
                int i2 = setupVideoTask.mRetryCount;
                int i3 = setupVideoTask.mMaxRetryCount;
                SetupVideoTask setupVideoTask2 = SetupVideoTask.this;
                if (i2 >= i3) {
                    Recorder.this.onEncoderSetupError(th);
                    return;
                }
                setupVideoTask2.mRetryCount++;
                SetupVideoTask setupVideoTask3 = SetupVideoTask.this;
                final MediaInfo mediaInfo = this.val$mediaInfo;
                setupVideoTask3.mRetryFuture = Recorder.scheduleTask(new Runnable() { // from class: androidx.camera.video.Recorder$SetupVideoTask$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1466xdc553cf6(mediaInfo);
                    }
                }, Recorder.this.mSequentialExecutor, Recorder.sRetrySetupVideoDelayMs, TimeUnit.MILLISECONDS);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Encoder encoder) {
                Objects.toString(encoder);
                Logger.d(Recorder.TAG, "VideoEncoder is created. ".concat(String.valueOf(encoder)));
                if (encoder == null) {
                    return;
                }
                Preconditions.checkState(Recorder.this.mVideoEncoderSession == this.val$videoEncoderSession);
                Preconditions.checkState(Recorder.this.mVideoEncoder == null);
                Recorder.this.onVideoEncoderReady(this.val$videoEncoderSession);
                Recorder.this.onConfigured();
            }
        }

        SetupVideoTask(SurfaceRequest surfaceRequest, Timebase timebase, MediaInfo mediaInfo, boolean z, int i2) {
            this.mSurfaceRequest = surfaceRequest;
            this.mTimebase = timebase;
            this.mMediaInfo = mediaInfo;
            Recorder.this.mHasGlProcessing = z;
            this.mMaxRetryCount = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setupVideo(final SurfaceRequest surfaceRequest, final Timebase timebase, final MediaInfo mediaInfo) {
            Recorder.this.safeToCloseVideoEncoder().addListener(new Runnable() { // from class: androidx.camera.video.Recorder$SetupVideoTask$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1465xdf7f9b96(surfaceRequest, mediaInfo, timebase);
                }
            }, Recorder.this.mSequentialExecutor);
        }

        void cancelFailedRetry() {
            if (this.mIsFailedRetryCanceled) {
                return;
            }
            this.mIsFailedRetryCanceled = true;
            ScheduledFuture<?> scheduledFuture = this.mRetryFuture;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.mRetryFuture = null;
            }
        }

        /* renamed from: lambda$setupVideo$0$androidx-camera-video-Recorder$SetupVideoTask, reason: not valid java name */
        /* synthetic */ void m1465xdf7f9b96(SurfaceRequest surfaceRequest, MediaInfo mediaInfo, Timebase timebase) {
            if (surfaceRequest.isServiced() || (Recorder.this.mVideoEncoderSession.isConfiguredSurfaceRequest(surfaceRequest) && !Recorder.this.isPersistentRecordingInProgress())) {
                Logger.w(Recorder.TAG, "Ignore the SurfaceRequest " + surfaceRequest + " isServiced: " + surfaceRequest.isServiced() + " VideoEncoderSession: " + Recorder.this.mVideoEncoderSession + " has been configured with a persistent in-progress recording.");
                return;
            }
            Recorder recorder = Recorder.this;
            VideoEncoderSession videoEncoderSession = new VideoEncoderSession(recorder.mVideoEncoderFactory, recorder.mSequentialExecutor, recorder.mExecutor);
            Recorder recorder2 = Recorder.this;
            VideoEncoderConfig videoEncoderConfigWorkaroundDataSpaceIfRequired = VideoConfigUtil.workaroundDataSpaceIfRequired(VideoConfigUtil.resolveVideoEncoderConfig(mediaInfo.getVideoMimeInfo(), timebase, ((MediaSpec) recorder2.getObservableData(recorder2.mMediaSpec)).getVideoSpec(), surfaceRequest.getResolution(), surfaceRequest.getDynamicRange(), surfaceRequest.getExpectedFrameRate()), Recorder.this.mHasGlProcessing);
            Recorder.this.mVideoEncoderConfig = videoEncoderConfigWorkaroundDataSpaceIfRequired;
            bm<Encoder> bmVarConfigure = videoEncoderSession.configure(surfaceRequest, videoEncoderConfigWorkaroundDataSpaceIfRequired);
            Recorder recorder3 = Recorder.this;
            recorder3.mVideoEncoderSession = videoEncoderSession;
            Futures.addCallback(bmVarConfigure, new AnonymousClass1(videoEncoderSession, mediaInfo), recorder3.mSequentialExecutor);
        }

        void start() {
            setupVideo(this.mSurfaceRequest, this.mTimebase, this.mMediaInfo);
        }
    }

    /* compiled from: WazeSource */
    enum State {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        QualitySelector qualitySelectorFromOrderedList = QualitySelector.fromOrderedList(Arrays.asList(Quality.FHD, Quality.HD, Quality.SD), FallbackStrategy.higherQualityOrLowerThan(Quality.FHD));
        DEFAULT_QUALITY_SELECTOR = qualitySelectorFromOrderedList;
        VideoSpec videoSpecBuild = VideoSpec.builder().setQualitySelector(qualitySelectorFromOrderedList).setAspectRatio(-1).build();
        VIDEO_SPEC_DEFAULT = videoSpecBuild;
        MEDIA_SPEC_DEFAULT = MediaSpec.builder().setOutputFormat(-1).setVideoSpec(videoSpecBuild).build();
        PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE = new RuntimeException("The video frame producer became inactive before any data was received.");
        DEFAULT_ENCODER_FACTORY = new EncoderFactory() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda16
            @Override // androidx.camera.video.internal.encoder.EncoderFactory
            public final Encoder createEncoder(Executor executor, EncoderConfig encoderConfig, int i2) {
                return new EncoderImpl(executor, encoderConfig, i2);
            }
        };
        DEFAULT_VIDEO_ENCODER_INFO_FINDER = VideoEncoderInfoImpl.FINDER;
        DEFAULT_MUXER_FACTORY = new MuxerFactory() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda17
            @Override // androidx.camera.video.internal.muxer.MuxerFactory
            public final Muxer create(int i2) {
                return Recorder.lambda$static$0(i2);
            }
        };
        OUTPUT_STORAGE_FACTORY_DEFAULT = new OutputStorage.Factory() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda18
            @Override // androidx.camera.video.internal.OutputStorage.Factory
            public final OutputStorage create(OutputOptions outputOptions) {
                return new OutputStorageImpl(outputOptions);
            }
        };
        AUDIO_EXECUTOR = CameraXExecutors.newSequentialExecutor(CameraXExecutors.ioExecutor());
        sRetrySetupVideoMaxCount = 3;
        sRetrySetupVideoDelayMs = 1000L;
    }

    Recorder(Executor executor, MediaSpec mediaSpec, int i2, EncoderFactory encoderFactory, EncoderFactory encoderFactory2, MuxerFactory muxerFactory, OutputStorage.Factory factory, long j2) {
        this.mUserProvidedExecutor = executor;
        executor = executor == null ? CameraXExecutors.ioExecutor() : executor;
        this.mExecutor = executor;
        Executor executorNewSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.mSequentialExecutor = executorNewSequentialExecutor;
        this.mMediaSpec = MutableStateObservable.withInitialState(mediaSpec);
        this.mVideoCapabilitiesSource = i2;
        this.mStreamInfo = MutableStateObservable.withInitialState(StreamInfo.of(this.mStreamId, internalStateToStreamState(this.mState)));
        this.mIsRecording = MutableStateObservable.withInitialState(false);
        this.mVideoEncoderFactory = encoderFactory;
        this.mAudioEncoderFactory = encoderFactory2;
        this.mMuxerFactory = muxerFactory;
        this.mOutputStorageFactory = factory;
        this.mVideoEncoderSession = new VideoEncoderSession(encoderFactory, executorNewSequentialExecutor, executor);
        j2 = j2 == -1 ? REQUIRED_FREE_STORAGE_DEFAULT_BYTES : j2;
        this.mRequiredFreeStorageBytes = j2;
        Objects.toString(mediaSpec);
        Logger.d(TAG, "mediaSpec = ".concat(String.valueOf(mediaSpec)));
        Logger.d(TAG, "mRequiredFreeStorageBytes = ".concat(String.valueOf(StorageUtil.formatSize(j2))));
    }

    private void checkMimeTypeSupportOrThrow(MediaSpec mediaSpec) {
        String mimeType = mediaSpec.getVideoSpec().getMimeType();
        if (!j$.util.Objects.equals(mimeType, MediaConstants.MIME_TYPE_UNSPECIFIED)) {
            Preconditions.checkArgument(getSupportedVideoMimeTypes().contains(mimeType), "The requested video MIME type " + mimeType + " is not supported by this device.");
        }
        String mimeType2 = mediaSpec.getAudioSpec().getMimeType();
        if (j$.util.Objects.equals(mimeType2, MediaConstants.MIME_TYPE_UNSPECIFIED)) {
            return;
        }
        Preconditions.checkArgument(getSupportedAudioMimeTypes().contains(mimeType2), "The requested audio MIME type " + mimeType2 + " is not supported by this device.");
    }

    private void clearPendingAudioRingBuffer() {
        while (!this.mPendingAudioRingBuffer.isEmpty()) {
            this.mPendingAudioRingBuffer.dequeue().close();
        }
    }

    private void configureInternal(SurfaceRequest surfaceRequest, Timebase timebase, boolean z) {
        if (surfaceRequest.isServiced()) {
            Logger.w(TAG, "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        surfaceRequest.setTransformationInfoListener(this.mSequentialExecutor, new SurfaceRequest.TransformationInfoListener() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda3
            @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
            public final void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
                this.f$0.m1443lambda$configureInternal$9$androidxcameravideoRecorder(transformationInfo);
            }
        });
        Size resolution = surfaceRequest.getResolution();
        DynamicRange dynamicRange = surfaceRequest.getDynamicRange();
        VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxyFindNearestHigherSupportedEncoderProfilesFor = getEncoderProfilesResolver(surfaceRequest.getCamera().getCameraInfo(), surfaceRequest.getSessionType()).findNearestHigherSupportedEncoderProfilesFor(resolution, dynamicRange);
        Objects.toString(videoValidatedEncoderProfilesProxyFindNearestHigherSupportedEncoderProfilesFor);
        Logger.d(TAG, "resolvedEncoderProfiles = ".concat(String.valueOf(videoValidatedEncoderProfilesProxyFindNearestHigherSupportedEncoderProfilesFor)));
        MediaInfo mediaInfoResolveMediaInfo = MediaConfigUtil.resolveMediaInfo((MediaSpec) getObservableData(this.mMediaSpec), dynamicRange, videoValidatedEncoderProfilesProxyFindNearestHigherSupportedEncoderProfilesFor);
        Objects.toString(mediaInfoResolveMediaInfo);
        Logger.d(TAG, "resolvedMediaInfo = ".concat(mediaInfoResolveMediaInfo.toString()));
        this.mResolvedMediaInfo = mediaInfoResolveMediaInfo;
        SetupVideoTask setupVideoTask = this.mSetupVideoTask;
        if (setupVideoTask != null) {
            setupVideoTask.cancelFailedRetry();
        }
        SetupVideoTask setupVideoTask2 = new SetupVideoTask(surfaceRequest, timebase, mediaInfoResolveMediaInfo, this.mHasGlProcessing, z ? sRetrySetupVideoMaxCount : 0);
        this.mSetupVideoTask = setupVideoTask2;
        setupVideoTask2.start();
    }

    private void finalizePendingRecording(RecordingRecord recordingRecord, int i2, Throwable th) {
        recordingRecord.finalizeRecording(Uri.EMPTY);
        recordingRecord.updateVideoRecordEvent(VideoRecordEvent.finalizeWithError(recordingRecord.getOutputOptions(), RecordingStats.of(0L, 0L, AudioStats.of(1, this.mAudioErrorCause, AudioStats.AUDIO_AMPLITUDE_NONE, 0L)), OutputResults.of(Uri.EMPTY), i2, th));
    }

    private List<EncodedData> getAudioDataToWriteAndClearCache(long j2) {
        ArrayList arrayList = new ArrayList();
        while (!this.mPendingAudioRingBuffer.isEmpty()) {
            EncodedData encodedDataDequeue = this.mPendingAudioRingBuffer.dequeue();
            if (encodedDataDequeue.getPresentationTimeUs() >= j2) {
                arrayList.add(encodedDataDequeue);
            }
        }
        return arrayList;
    }

    private static EncoderProfilesResolver getEncoderProfilesResolverInternal(int i2, CameraInfo cameraInfo, int i3) {
        return EncoderProfilesResolverFactory.getResolver(cameraInfo, i2, i3, DEFAULT_VIDEO_ENCODER_INFO_FINDER);
    }

    public static VideoCapabilities getHighSpeedVideoCapabilities(CameraInfo cameraInfo, int i2) {
        VideoCapabilities videoCapabilitiesInternal = getVideoCapabilitiesInternal(2, cameraInfo, i2, MediaConstants.MIME_TYPE_UNSPECIFIED);
        if (videoCapabilitiesInternal.getSupportedDynamicRanges().isEmpty()) {
            return null;
        }
        return videoCapabilitiesInternal;
    }

    public static List<String> getSupportedAudioMimeTypes() {
        ArrayList arrayList = new ArrayList(CodecUtil.getAudioEncoderMimeTypes());
        arrayList.retainAll(SUPPORTED_AUDIO_MIME_TYPES);
        return arrayList;
    }

    public static List<String> getSupportedVideoMimeTypes() {
        ArrayList arrayList = new ArrayList(CodecUtil.getVideoEncoderMimeTypes());
        arrayList.retainAll(SUPPORTED_VIDEO_MIME_TYPES);
        return arrayList;
    }

    public static VideoCapabilities getVideoCapabilities(CameraInfo cameraInfo, String str) {
        VideoCapabilities videoCapabilitiesInternal = getVideoCapabilitiesInternal(1, cameraInfo, 0, str);
        if (videoCapabilitiesInternal == VideoCapabilities.EMPTY) {
            return null;
        }
        return videoCapabilitiesInternal;
    }

    private static VideoCapabilities getVideoCapabilitiesInternal(int i2, CameraInfo cameraInfo, int i3, String str) {
        CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) cameraInfo;
        return MediaConstants.MIME_TYPE_UNSPECIFIED.equals(str) ? new RecorderVideoCapabilities(getEncoderProfilesResolverInternal(i2, cameraInfo, i3), cameraInfoInternal) : getSupportedVideoMimeTypes().contains(str) ? new MimeMatchedVideoCapabilities(str, cameraInfoInternal, DEFAULT_VIDEO_ENCODER_INFO_FINDER) : VideoCapabilities.EMPTY;
    }

    private boolean hasInsufficientStorage(long j2) {
        return j2 < this.mRequiredFreeStorageBytes;
    }

    private boolean hasInsufficientStorageOrException(Throwable th) {
        if (StorageUtil.isStorageFullException(th)) {
            return true;
        }
        OutputStorage outputStorage = this.mOutputStorage;
        Preconditions.checkNotNull(outputStorage);
        return hasInsufficientStorage(outputStorage.getAvailableBytes());
    }

    private boolean hasInvalidRecordData() {
        if (this.mRecordingBytes > 0) {
            return isAudioEnabled() && this.mRecordingAudioBytes <= 0;
        }
        return true;
    }

    private int internalAudioStateToAudioStatsState(AudioState audioState) {
        int iOrdinal = audioState.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return 1;
        }
        if (iOrdinal == 3) {
            RecordingRecord recordingRecord = this.mInProgressRecording;
            if (recordingRecord == null || !recordingRecord.isMuted()) {
                return this.mIsAudioSourceSilenced ? 2 : 0;
            }
            return 5;
        }
        if (iOrdinal == 4) {
            return 3;
        }
        if (iOrdinal == 5) {
            return 4;
        }
        Objects.toString(audioState);
        throw new AssertionError("Invalid internal audio state: ".concat(String.valueOf(audioState)));
    }

    private StreamInfo.StreamState internalStateToStreamState(State state) {
        return (state == State.RECORDING || state == State.STOPPING) ? StreamInfo.StreamState.ACTIVE : StreamInfo.StreamState.INACTIVE;
    }

    private static boolean isSameRecording(Recording recording, RecordingRecord recordingRecord) {
        return recordingRecord != null && recording.getRecordingId() == recordingRecord.getRecordingId();
    }

    static /* synthetic */ Muxer lambda$static$0(int i2) {
        if (i2 == 0 || i2 == 2) {
            Logger.d(TAG, "Create Media3MuxerImpl");
            return new Media3MuxerImpl();
        }
        Logger.d(TAG, "Create MediaMuxerImpl");
        return new MediaMuxerImpl();
    }

    private RecordingRecord makePendingRecordingActiveLocked(State state) {
        boolean z;
        if (state == State.PENDING_PAUSED) {
            z = true;
        } else {
            if (state != State.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z = false;
        }
        if (this.mActiveRecordingRecord != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        RecordingRecord recordingRecord = this.mPendingRecordingRecord;
        if (recordingRecord == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.mActiveRecordingRecord = recordingRecord;
        recordingRecord.getRecordingState().addObserver(CameraXExecutors.directExecutor(), new Observable.Observer<Boolean>() { // from class: androidx.camera.video.Recorder.7
            @Override // androidx.camera.core.impl.Observable.Observer
            public void onError(Throwable th) {
                Recorder.this.mIsRecording.setError(th);
            }

            @Override // androidx.camera.core.impl.Observable.Observer
            public void onNewData(Boolean bool) {
                Recorder.this.mIsRecording.setState(bool);
            }
        });
        this.mPendingRecordingRecord = null;
        if (z) {
            setState(State.PAUSED);
            return recordingRecord;
        }
        setState(State.RECORDING);
        return recordingRecord;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: muteInternal, reason: merged with bridge method [inline-methods] */
    public void m1444lambda$mute$8$androidxcameravideoRecorder(RecordingRecord recordingRecord, boolean z) {
        AudioSource audioSource;
        if (recordingRecord.isMuted() == z) {
            return;
        }
        recordingRecord.mute(z);
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping || (audioSource = this.mAudioSource) == null) {
            return;
        }
        audioSource.mute(z);
    }

    static void notifyEncoderSourceStopped(Encoder encoder) {
        if (encoder instanceof EncoderImpl) {
            ((EncoderImpl) encoder).signalSourceStopped();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[Catch: all -> 0x008a, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:7:0x001b, B:22:0x006f, B:10:0x0023, B:11:0x0029, B:12:0x003c, B:14:0x003e, B:16:0x0044, B:17:0x0054, B:19:0x0058, B:32:0x0082, B:33:0x0089), top: B:37:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: all -> 0x008a, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:7:0x001b, B:22:0x006f, B:10:0x0023, B:11:0x0029, B:12:0x003c, B:14:0x003e, B:16:0x0044, B:17:0x0054, B:19:0x0058, B:32:0x0082, B:33:0x0089), top: B:37:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void onRecordingFinalized(androidx.camera.video.Recorder.RecordingRecord r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Unexpected state on finalize of recording: "
            java.lang.Object r1 = r7.mLock
            monitor-enter(r1)
            androidx.camera.video.Recorder$RecordingRecord r2 = r7.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L8a
            if (r2 != r8) goto L82
            androidx.camera.core.impl.StateObservable r8 = r2.getRecordingState()     // Catch: java.lang.Throwable -> L8a
            r8.removeObservers()     // Catch: java.lang.Throwable -> L8a
            r8 = 0
            r7.mActiveRecordingRecord = r8     // Catch: java.lang.Throwable -> L8a
            androidx.camera.video.Recorder$State r2 = r7.mState     // Catch: java.lang.Throwable -> L8a
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L8a
            r3 = 1
            r4 = 0
            switch(r2) {
                case 0: goto L6b;
                case 1: goto L3d;
                case 2: goto L3e;
                case 3: goto L29;
                case 4: goto L23;
                case 5: goto L23;
                case 6: goto L23;
                case 7: goto L1f;
                case 8: goto L6b;
                default: goto L1e;
            }     // Catch: java.lang.Throwable -> L8a
        L1e:
            goto L6b
        L1f:
            r0 = r8
            r2 = r0
            r5 = r4
            goto L6f
        L23:
            androidx.camera.video.Recorder$State r0 = androidx.camera.video.Recorder.State.IDLING     // Catch: java.lang.Throwable -> L8a
            r7.setState(r0)     // Catch: java.lang.Throwable -> L8a
            goto L6b
        L29:
            java.lang.AssertionError r8 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L8a
            androidx.camera.video.Recorder$State r7 = r7.mState     // Catch: java.lang.Throwable -> L8a
            r2.append(r7)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L8a
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8a
            throw r8     // Catch: java.lang.Throwable -> L8a
        L3d:
            r3 = r4
        L3e:
            androidx.camera.video.VideoOutput$SourceState r0 = r7.mSourceState     // Catch: java.lang.Throwable -> L8a
            androidx.camera.video.VideoOutput$SourceState r2 = androidx.camera.video.VideoOutput.SourceState.INACTIVE     // Catch: java.lang.Throwable -> L8a
            if (r0 != r2) goto L54
            androidx.camera.video.Recorder$RecordingRecord r0 = r7.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L8a
            r7.mPendingRecordingRecord = r8     // Catch: java.lang.Throwable -> L8a
            androidx.camera.video.Recorder$State r2 = androidx.camera.video.Recorder.State.CONFIGURING     // Catch: java.lang.Throwable -> L8a
            r7.setState(r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.Exception r2 = androidx.camera.video.Recorder.PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE     // Catch: java.lang.Throwable -> L8a
            r5 = 4
            r6 = r4
            r4 = r3
            r3 = r6
            goto L6f
        L54:
            androidx.camera.video.internal.encoder.Encoder r0 = r7.mVideoEncoder     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L65
            androidx.camera.video.Recorder$State r0 = r7.mState     // Catch: java.lang.Throwable -> L8a
            androidx.camera.video.Recorder$RecordingRecord r0 = r7.makePendingRecordingActiveLocked(r0)     // Catch: java.lang.Throwable -> L8a
            r2 = r8
            r5 = r4
            r8 = r0
            r4 = r3
            r3 = r5
            r0 = r2
            goto L6f
        L65:
            r0 = r8
            r2 = r0
            r5 = r4
            r4 = r3
            r3 = r5
            goto L6f
        L6b:
            r0 = r8
            r2 = r0
            r3 = r4
            r5 = r3
        L6f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            if (r3 == 0) goto L76
            r7.reset()
            return
        L76:
            if (r8 == 0) goto L7c
            r7.startRecording(r8, r4)
            return
        L7c:
            if (r0 == 0) goto L81
            r7.finalizePendingRecording(r0, r5, r2)
        L81:
            return
        L82:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L8a
            java.lang.String r8 = "Active recording did not match finalized recording on finalize."
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L8a
            throw r7     // Catch: java.lang.Throwable -> L8a
        L8a:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.onRecordingFinalized(androidx.camera.video.Recorder$RecordingRecord):void");
    }

    private void onResetVideo() {
        boolean z;
        SurfaceRequest surfaceRequest;
        synchronized (this.mLock) {
            z = true;
            switch (this.mState.ordinal()) {
                case 1:
                case 2:
                    updateNonPendingState(State.CONFIGURING);
                    break;
                case 4:
                case 5:
                case 8:
                    if (isPersistentRecordingInProgress()) {
                        z = false;
                        break;
                    }
                case 3:
                case 6:
                case 7:
                    setState(State.CONFIGURING);
                    break;
            }
        }
        this.mNeedsResetBeforeNextStart = false;
        if (!z || (surfaceRequest = this.mLatestSurfaceRequest) == null || surfaceRequest.isServiced()) {
            return;
        }
        configureInternal(this.mLatestSurfaceRequest, this.mVideoSourceTimebase, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSurfaceRequestedInternal, reason: merged with bridge method [inline-methods] */
    public void m1446lambda$onSurfaceRequested$1$androidxcameravideoRecorder(SurfaceRequest surfaceRequest, Timebase timebase, boolean z) {
        SurfaceRequest surfaceRequest2 = this.mLatestSurfaceRequest;
        if (surfaceRequest2 != null && !surfaceRequest2.isServiced()) {
            this.mLatestSurfaceRequest.willNotProvideSurface();
        }
        this.mHasGlProcessing = z;
        this.mLatestSurfaceRequest = surfaceRequest;
        this.mVideoSourceTimebase = timebase;
        configureInternal(surfaceRequest, timebase, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pauseInternal, reason: merged with bridge method [inline-methods] */
    public void m1447lambda$pause$5$androidxcameravideoRecorder(RecordingRecord recordingRecord) {
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping) {
            return;
        }
        if (isAudioEnabled()) {
            this.mAudioEncoder.pause();
        }
        this.mVideoEncoder.pause();
        RecordingRecord recordingRecord2 = this.mInProgressRecording;
        recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.pause(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
    }

    private PendingRecording prepareRecordingInternal(Context context, OutputOptions outputOptions) {
        Preconditions.checkNotNull(outputOptions, "The OutputOptions cannot be null.");
        return new PendingRecording(context, this, outputOptions);
    }

    private void releaseCurrentAudioSource() {
        final AudioSource audioSource = this.mAudioSource;
        if (audioSource == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.mAudioSource = null;
        Logger.d(TAG, String.format("Releasing audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
        Futures.addCallback(audioSource.release(), new FutureCallback<Void>() { // from class: androidx.camera.video.Recorder.2
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                Logger.d(Recorder.TAG, String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r2) {
                Logger.d(Recorder.TAG, String.format("Released audio source successfully: 0x%x", Integer.valueOf(audioSource.hashCode())));
            }
        }, CameraXExecutors.directExecutor());
    }

    private void reset() {
        if (this.mAudioEncoder != null) {
            Logger.d(TAG, "Releasing audio encoder.");
            this.mAudioEncoder.release();
            this.mAudioEncoder = null;
            this.mAudioOutputConfig = null;
        }
        if (this.mAudioSource != null) {
            releaseCurrentAudioSource();
        }
        setAudioState(AudioState.INITIALIZING);
        resetVideo();
    }

    private void resetVideo() {
        if (this.mVideoEncoder != null) {
            Logger.d(TAG, "Releasing video encoder.");
            tryReleaseVideoEncoder();
        }
        onResetVideo();
    }

    private void restoreNonPendingState() {
        if (PENDING_STATES.contains(this.mState)) {
            setState(this.mNonPendingState);
        } else {
            State state = this.mState;
            Objects.toString(state);
            throw new AssertionError("Cannot restore non-pending state when in state ".concat(String.valueOf(state)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resumeInternal, reason: merged with bridge method [inline-methods] */
    public void m1448lambda$resume$6$androidxcameravideoRecorder(RecordingRecord recordingRecord) {
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping) {
            return;
        }
        if (isAudioEnabled()) {
            this.mAudioEncoder.start();
        }
        Encoder encoder = this.mVideoEncoder;
        if (encoder == null) {
            this.mShouldSendResumeEvent = true;
            return;
        }
        encoder.start();
        RecordingRecord recordingRecord2 = this.mInProgressRecording;
        recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.resume(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bm<Void> safeToCloseVideoEncoder() {
        Encoder encoder = this.mVideoEncoder;
        Objects.toString(encoder);
        Logger.d(TAG, "Try to safely release video encoder: ".concat(String.valueOf(encoder)));
        return this.mVideoEncoderSession.signalTermination();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledFuture<?> scheduleTask(final Runnable runnable, final Executor executor, long j2, TimeUnit timeUnit) {
        return CameraXExecutors.mainThreadExecutor().schedule(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                executor.execute(runnable);
            }
        }, j2, timeUnit);
    }

    private void setStreamId(int i2) {
        if (this.mStreamId == i2) {
            return;
        }
        Logger.d(TAG, "Transitioning streamId: " + this.mStreamId + " --> " + i2);
        this.mStreamId = i2;
        this.mStreamInfo.setState(StreamInfo.of(i2, internalStateToStreamState(this.mState), this.mInProgressTransformationInfo));
    }

    private void setupAudio(RecordingRecord recordingRecord) throws InvalidConfigException {
        MediaSpec mediaSpec = (MediaSpec) getObservableData(this.mMediaSpec);
        MediaInfo mediaInfo = this.mResolvedMediaInfo;
        Preconditions.checkNotNull(mediaInfo);
        AudioMimeInfo audioMimeInfo = mediaInfo.getAudioMimeInfo();
        if (audioMimeInfo == null) {
            throw new InvalidConfigException("Audio is required but no audio mime info was found");
        }
        Timebase timebase = Timebase.UPTIME;
        VideoEncoderConfig videoEncoderConfig = this.mVideoEncoderConfig;
        Preconditions.checkNotNull(videoEncoderConfig);
        AudioSettings audioSettingsResolveAudioSettings = AudioConfigUtil.resolveAudioSettings(mediaSpec.getAudioSpec(), audioMimeInfo.getCompatibleAudioProfile(), videoEncoderConfig.isSlowMotion() ? new Rational(videoEncoderConfig.getCaptureFrameRate(), videoEncoderConfig.getEncodeFrameRate()) : null);
        if (this.mAudioSource != null) {
            releaseCurrentAudioSource();
        }
        AudioSource audioSource = setupAudioSource(recordingRecord, audioSettingsResolveAudioSettings);
        this.mAudioSource = audioSource;
        Logger.d(TAG, String.format("Set up new audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
        AudioEncoderConfig audioEncoderConfigResolveAudioEncoderConfig = AudioConfigUtil.resolveAudioEncoderConfig(audioMimeInfo, timebase, audioSettingsResolveAudioSettings, mediaSpec.getAudioSpec());
        EncoderFactory encoderFactory = this.mAudioEncoderFactory;
        Executor executor = this.mExecutor;
        SurfaceRequest surfaceRequest = this.mLatestSurfaceRequest;
        Preconditions.checkNotNull(surfaceRequest);
        Encoder encoderCreateEncoder = encoderFactory.createEncoder(executor, audioEncoderConfigResolveAudioEncoderConfig, surfaceRequest.getSessionType());
        this.mAudioEncoder = encoderCreateEncoder;
        Encoder.EncoderInput input = encoderCreateEncoder.getInput();
        if (!(input instanceof Encoder.ByteBufferInput)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        this.mAudioSource.setBufferProvider((Encoder.ByteBufferInput) input);
    }

    private AudioSource setupAudioSource(RecordingRecord recordingRecord, AudioSettings audioSettings) {
        return recordingRecord.performOneTimeAudioSourceCreation(audioSettings);
    }

    private void startInternal(RecordingRecord recordingRecord) {
        if (this.mInProgressRecording != null) {
            throw new AssertionError("Attempted to start a new recording while another was in progress.");
        }
        this.mInProgressRecording = recordingRecord;
        OutputStorage outputStorageCreate = this.mOutputStorageFactory.create(recordingRecord.getOutputOptions());
        this.mOutputStorage = outputStorageCreate;
        long availableBytes = outputStorageCreate.getAvailableBytes();
        Logger.d(TAG, "availableBytes = ".concat(String.valueOf(StorageUtil.formatSize(availableBytes))));
        if (hasInsufficientStorage(availableBytes)) {
            finalizeInProgressRecording(3, new IOException(String.format(INSUFFICIENT_STORAGE_ERROR_MSG, Long.valueOf(availableBytes), Long.valueOf(this.mRequiredFreeStorageBytes))));
            return;
        }
        this.mAvailableBytesAboveRequired = availableBytes - this.mRequiredFreeStorageBytes;
        if (recordingRecord.getOutputOptions().getFileSizeLimit() > 0) {
            this.mFileSizeLimitInBytes = Math.round(recordingRecord.getOutputOptions().getFileSizeLimit() * 0.95d);
            Logger.d(TAG, "File size limit in bytes: " + this.mFileSizeLimitInBytes);
        } else {
            this.mFileSizeLimitInBytes = 0L;
        }
        if (recordingRecord.getOutputOptions().getDurationLimitMillis() > 0) {
            this.mDurationLimitUs = TimeUnit.MILLISECONDS.toMicros(recordingRecord.getOutputOptions().getDurationLimitMillis());
            Logger.d(TAG, "Duration limit in microseconds: " + this.mDurationLimitUs);
        } else {
            this.mDurationLimitUs = 0L;
        }
        int iOrdinal = this.mAudioState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                setAudioState(recordingRecord.hasAudioEnabled() ? AudioState.ENABLED : AudioState.DISABLED);
            } else if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                AudioState audioState = this.mAudioState;
                Objects.toString(audioState);
                throw new AssertionError("Incorrectly invoke startInternal in audio state ".concat(String.valueOf(audioState)));
            }
        } else if (recordingRecord.hasAudioEnabled()) {
            if (!isAudioSupported()) {
                throw new AssertionError("The Recorder doesn't support recording with audio");
            }
            try {
                if (!this.mInProgressRecording.isPersistent() || this.mAudioEncoder == null) {
                    setupAudio(recordingRecord);
                }
                setAudioState(AudioState.ENABLED);
            } catch (AudioSourceAccessException | InvalidConfigException e2) {
                Logger.e(TAG, "Unable to create audio resource with error: ", e2);
                setAudioState(e2 instanceof InvalidConfigException ? AudioState.ERROR_ENCODER : AudioState.ERROR_SOURCE);
                this.mAudioErrorCause = e2;
            }
        }
        updateEncoderCallbacks(recordingRecord, false);
        if (isAudioEnabled()) {
            this.mAudioSource.start(recordingRecord.isMuted());
            this.mAudioEncoder.start();
        }
        this.mVideoEncoder.start();
        RecordingRecord recordingRecord2 = this.mInProgressRecording;
        recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.start(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
    }

    private void startRecording(RecordingRecord recordingRecord, boolean z) {
        startInternal(recordingRecord);
        if (z) {
            m1447lambda$pause$5$androidxcameravideoRecorder(recordingRecord);
        }
    }

    private void tryReleaseVideoEncoder() {
        VideoEncoderSession videoEncoderSession = this.mVideoEncoderSessionToRelease;
        if (videoEncoderSession == null) {
            safeToCloseVideoEncoder();
            return;
        }
        Preconditions.checkState(videoEncoderSession.getVideoEncoder() == this.mVideoEncoder);
        Encoder encoder = this.mVideoEncoder;
        Objects.toString(encoder);
        Logger.d(TAG, "Releasing video encoder: ".concat(String.valueOf(encoder)));
        this.mVideoEncoderSessionToRelease.terminateNow();
        this.mVideoEncoderSessionToRelease = null;
        this.mVideoEncoder = null;
        this.mVideoOutputConfig = null;
        setLatestSurface(null);
    }

    private void updateEncoderCallbacks(final RecordingRecord recordingRecord, boolean z) {
        if (!this.mEncodingFutures.isEmpty()) {
            bm bmVarAllAsList = Futures.allAsList(this.mEncodingFutures);
            if (!bmVarAllAsList.isDone()) {
                bmVarAllAsList.cancel(true);
            }
            this.mEncodingFutures.clear();
        }
        this.mEncodingFutures.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda10
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.f$0.m1452lambda$updateEncoderCallbacks$11$androidxcameravideoRecorder(recordingRecord, completer);
            }
        }));
        if (isAudioEnabled() && !z) {
            this.mEncodingFutures.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda11
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return this.f$0.m1454lambda$updateEncoderCallbacks$13$androidxcameravideoRecorder(recordingRecord, completer);
                }
            }));
        }
        Futures.addCallback(Futures.allAsList(this.mEncodingFutures), new FutureCallback<List<Void>>() { // from class: androidx.camera.video.Recorder.6
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                Preconditions.checkState(Recorder.this.mInProgressRecording != null, "In-progress recording shouldn't be null");
                if (Recorder.this.mInProgressRecording.isPersistent()) {
                    return;
                }
                Objects.toString(th);
                Logger.d(Recorder.TAG, "Encodings end with error: ".concat(String.valueOf(th)));
                Recorder recorder = Recorder.this;
                recorder.finalizeInProgressRecording(recorder.mMuxer == null ? 8 : 6, th);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(List<Void> list) {
                Logger.d(Recorder.TAG, "Encodings end successfully.");
                Recorder recorder = Recorder.this;
                recorder.finalizeInProgressRecording(recorder.mRecordingStopError, recorder.mRecordingStopErrorCause);
            }
        }, CameraXExecutors.directExecutor());
    }

    private void updateNonPendingState(State state) {
        if (!PENDING_STATES.contains(this.mState)) {
            State state2 = this.mState;
            Objects.toString(state2);
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is ".concat(String.valueOf(state2)));
        }
        if (!VALID_NON_PENDING_STATES_WHILE_PENDING.contains(state)) {
            Objects.toString(state);
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: ".concat(String.valueOf(state)));
        }
        if (this.mNonPendingState != state) {
            this.mNonPendingState = state;
            this.mStreamInfo.setState(StreamInfo.of(this.mStreamId, internalStateToStreamState(state), this.mInProgressTransformationInfo));
        }
    }

    void finalizeInProgressRecording(int i2, Throwable th) {
        if (this.mInProgressRecording == null) {
            throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        int i3 = 8;
        if (this.mMuxer != null) {
            try {
                try {
                    Logger.d(TAG, "Muxer.stop()");
                    this.mMuxer.stop();
                } catch (MuxerException e2) {
                    Logger.w(TAG, "Muxer failed to stop with error: " + e2, e2);
                    if (i2 == 0) {
                        if (hasInsufficientStorageOrException(e2)) {
                            i3 = 3;
                        } else if (!hasInvalidRecordData()) {
                            i3 = 1;
                        }
                        th = e2;
                        i2 = i3;
                    }
                }
            } finally {
                Logger.d(TAG, "Muxer.release()");
                this.mMuxer.release();
                this.mMuxer = null;
            }
        } else if (i2 == 0) {
            i2 = 8;
        }
        this.mInProgressRecording.finalizeRecording(this.mOutputUri);
        OutputOptions outputOptions = this.mInProgressRecording.getOutputOptions();
        RecordingStats inProgressRecordingStats = getInProgressRecordingStats();
        OutputResults outputResultsOf = OutputResults.of(this.mOutputUri);
        this.mInProgressRecording.updateVideoRecordEvent(i2 == 0 ? VideoRecordEvent.finalize(outputOptions, inProgressRecordingStats, outputResultsOf) : VideoRecordEvent.finalizeWithError(outputOptions, inProgressRecordingStats, outputResultsOf, i2, th));
        RecordingRecord recordingRecord = this.mInProgressRecording;
        this.mInProgressRecording = null;
        this.mInProgressRecordingStopping = false;
        this.mAudioTrackIndex = null;
        this.mVideoTrackIndex = null;
        this.mEncodingFutures.clear();
        this.mOutputUri = Uri.EMPTY;
        this.mRecordingBytes = 0L;
        this.mRecordingAudioBytes = 0L;
        this.mRecordingDurationUs = 0L;
        this.mFirstRecordingVideoDataTimeUs = Long.MAX_VALUE;
        this.mFirstRecordingAudioDataTimeUs = Long.MAX_VALUE;
        this.mPreviousRecordingVideoDataTimeUs = Long.MAX_VALUE;
        this.mPreviousRecordingAudioDataTimeUs = Long.MAX_VALUE;
        this.mRecordingStopError = 1;
        this.mRecordingStopErrorCause = null;
        this.mAudioErrorCause = null;
        this.mAudioAmplitude = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.mOutputStorage = null;
        this.mAvailableBytesAboveRequired = Long.MAX_VALUE;
        clearPendingAudioRingBuffer();
        setInProgressTransformationInfo(null);
        int iOrdinal = this.mAudioState.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            setAudioState(AudioState.IDLING);
            this.mAudioSource.stop();
        } else if (iOrdinal == 4 || iOrdinal == 5) {
            setAudioState(AudioState.INITIALIZING);
        }
        onRecordingFinalized(recordingRecord);
    }

    public int getAspectRatio() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getAspectRatio();
    }

    public String getAudioMimeType() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getAudioSpec().getMimeType();
    }

    public int getAudioSource() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getAudioSpec().getSource();
    }

    @Override // androidx.camera.video.VideoOutput
    public EncoderProfilesResolver getEncoderProfilesResolver(CameraInfo cameraInfo, int i2) {
        return getEncoderProfilesResolverInternal(i2 == 1 ? 2 : 1, cameraInfo, this.mVideoCapabilitiesSource);
    }

    public Executor getExecutor() {
        return this.mUserProvidedExecutor;
    }

    RecordingStats getInProgressRecordingStats() {
        return RecordingStats.of(TimeUnit.MICROSECONDS.toNanos(this.mRecordingDurationUs), this.mRecordingBytes, AudioStats.of(internalAudioStateToAudioStatsState(this.mAudioState), this.mAudioErrorCause, this.mAudioAmplitude, this.mRecordingAudioBytes));
    }

    @Override // androidx.camera.video.VideoOutput
    public VideoCapabilities getMediaCapabilities(CameraInfo cameraInfo, int i2) {
        return getVideoCapabilitiesInternal(i2 == 1 ? 2 : 1, cameraInfo, this.mVideoCapabilitiesSource, ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getMimeType());
    }

    @Override // androidx.camera.video.VideoOutput
    public Observable<MediaSpec> getMediaSpec() {
        return this.mMediaSpec;
    }

    public MuxerFactory getMuxerFactory() {
        return this.mMuxerFactory;
    }

    <T> T getObservableData(StateObservable<T> stateObservable) {
        try {
            return stateObservable.fetchData().get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public int getOutputFormat() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getOutputFormat();
    }

    public QualitySelector getQualitySelector() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getQualitySelector();
    }

    @Override // androidx.camera.video.VideoOutput
    public Observable<StreamInfo> getStreamInfo() {
        return this.mStreamInfo;
    }

    public int getTargetAudioChannelCount() {
        int channelCount = ((MediaSpec) getObservableData(this.mMediaSpec)).getAudioSpec().getChannelCount();
        if (channelCount == -1) {
            return 0;
        }
        return channelCount;
    }

    public int getTargetAudioEncodingBitRate() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getAudioSpec().getBitrate();
    }

    public int getTargetVideoEncodingBitRate() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getBitrate();
    }

    public int getVideoCapabilitiesSource() {
        return this.mVideoCapabilitiesSource;
    }

    public Observable<Range<Integer>> getVideoEncoderBitrateRange() {
        return this.mVideoEncoderBitrateRange;
    }

    public int getVideoEncodingFrameRate() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getEncodeFrameRate();
    }

    public String getVideoMimeType() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getMimeType();
    }

    boolean isAudioEnabled() {
        return this.mAudioState == AudioState.ENABLED;
    }

    boolean isAudioSupported() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getAudioSpec().getChannelCount() != 0;
    }

    boolean isPersistentRecordingInProgress() {
        RecordingRecord recordingRecord = this.mInProgressRecording;
        return recordingRecord != null && recordingRecord.isPersistent();
    }

    @Override // androidx.camera.video.VideoOutput
    public boolean isQualitySelectorDefault() {
        return getQualitySelector() == DEFAULT_QUALITY_SELECTOR;
    }

    @Override // androidx.camera.video.VideoOutput
    public Observable<Boolean> isSourceStreamRequired() {
        return this.mIsRecording;
    }

    /* renamed from: lambda$configureInternal$9$androidx-camera-video-Recorder, reason: not valid java name */
    /* synthetic */ void m1443lambda$configureInternal$9$androidxcameravideoRecorder(SurfaceRequest.TransformationInfo transformationInfo) {
        this.mSourceTransformationInfo = transformationInfo;
    }

    /* renamed from: lambda$setupAndStartMuxer$10$androidx-camera-video-Recorder, reason: not valid java name */
    /* synthetic */ void m1449lambda$setupAndStartMuxer$10$androidxcameravideoRecorder(Uri uri) {
        this.mOutputUri = uri;
    }

    /* renamed from: lambda$start$4$androidx-camera-video-Recorder, reason: not valid java name */
    /* synthetic */ void m1450lambda$start$4$androidxcameravideoRecorder() {
        SurfaceRequest surfaceRequest = this.mLatestSurfaceRequest;
        if (surfaceRequest == null) {
            throw new AssertionError("surface request is required to retry initialization.");
        }
        configureInternal(surfaceRequest, this.mVideoSourceTimebase, false);
    }

    /* renamed from: lambda$updateEncoderCallbacks$11$androidx-camera-video-Recorder, reason: not valid java name */
    /* synthetic */ Object m1452lambda$updateEncoderCallbacks$11$androidxcameravideoRecorder(final RecordingRecord recordingRecord, final CallbackToFutureAdapter.Completer completer) {
        this.mVideoEncoder.setEncoderCallback(new EncoderCallback() { // from class: androidx.camera.video.Recorder.3
            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeError(EncodeException encodeException) {
                completer.setException(encodeException);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStop() {
                completer.set(null);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodedData(EncodedData encodedData) {
                boolean z;
                Recorder recorder = Recorder.this;
                if (recorder.mMuxer != null) {
                    try {
                        recorder.writeVideoData(encodedData, recordingRecord);
                        if (encodedData != null) {
                            encodedData.close();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        if (encodedData != null) {
                            try {
                                encodedData.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                if (recorder.mInProgressRecordingStopping) {
                    Logger.d(Recorder.TAG, "Drop video data since recording is stopping.");
                    encodedData.close();
                    return;
                }
                EncodedData encodedData2 = recorder.mPendingFirstVideoData;
                if (encodedData2 != null) {
                    encodedData2.close();
                    Recorder.this.mPendingFirstVideoData = null;
                    z = true;
                } else {
                    z = false;
                }
                if (!encodedData.isKeyFrame()) {
                    if (z) {
                        Logger.d(Recorder.TAG, "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                    }
                    Logger.d(Recorder.TAG, "Dropped video data since muxer has not yet started and data is not a keyframe.");
                    Recorder.this.mVideoEncoder.requestKeyFrame();
                    encodedData.close();
                    return;
                }
                Recorder recorder2 = Recorder.this;
                recorder2.mPendingFirstVideoData = encodedData;
                if (!recorder2.isAudioEnabled() || !Recorder.this.mPendingAudioRingBuffer.isEmpty()) {
                    Logger.d(Recorder.TAG, "Received video keyframe. Starting muxer...");
                    Recorder.this.setupAndStartMuxer(recordingRecord);
                } else if (z) {
                    Logger.d(Recorder.TAG, "Replaced cached video keyframe with newer keyframe.");
                } else {
                    Logger.d(Recorder.TAG, "Cached video keyframe while we wait for first audio sample before starting muxer.");
                }
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onOutputConfigUpdate(OutputConfig outputConfig) {
                Recorder.this.mVideoOutputConfig = outputConfig;
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public /* synthetic */ void onEncodePaused() {
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStart() {
            }
        }, this.mSequentialExecutor);
        return "videoEncodingFuture";
    }

    /* renamed from: lambda$updateEncoderCallbacks$12$androidx-camera-video-Recorder, reason: not valid java name */
    /* synthetic */ void m1453lambda$updateEncoderCallbacks$12$androidxcameravideoRecorder(CallbackToFutureAdapter.Completer completer, Throwable th) {
        if (this.mAudioErrorCause == null) {
            if (th instanceof EncodeException) {
                setAudioState(AudioState.ERROR_ENCODER);
            } else {
                setAudioState(AudioState.ERROR_SOURCE);
            }
            this.mAudioErrorCause = th;
            updateInProgressStatusEvent(true);
            completer.set(null);
        }
    }

    /* renamed from: lambda$updateEncoderCallbacks$13$androidx-camera-video-Recorder, reason: not valid java name */
    /* synthetic */ Object m1454lambda$updateEncoderCallbacks$13$androidxcameravideoRecorder(final RecordingRecord recordingRecord, final CallbackToFutureAdapter.Completer completer) {
        final Consumer consumer = new Consumer() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda9
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f$0.m1453lambda$updateEncoderCallbacks$12$androidxcameravideoRecorder(completer, (Throwable) obj);
            }
        };
        this.mAudioSource.setAudioSourceCallback(this.mSequentialExecutor, new AudioSource.AudioSourceCallback() { // from class: androidx.camera.video.Recorder.4
            @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
            public void onAmplitudeValue(double d2) {
                Recorder.this.mAudioAmplitude = d2;
            }

            @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
            public void onError(Throwable th) {
                Logger.e(Recorder.TAG, "Error occurred after audio source started.", th);
                if (th instanceof AudioSourceAccessException) {
                    consumer.accept(th);
                }
            }

            @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
            public void onSilenceStateChanged(boolean z) {
                Recorder recorder = Recorder.this;
                if (recorder.mIsAudioSourceSilenced != z) {
                    recorder.mIsAudioSourceSilenced = z;
                    recorder.updateInProgressStatusEvent(true);
                } else {
                    Logger.w(Recorder.TAG, "Audio source silenced transitions to the same state " + z);
                }
            }

            @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
            public /* synthetic */ void onSuspendStateChanged(boolean z) {
            }
        });
        this.mAudioEncoder.setEncoderCallback(new EncoderCallback() { // from class: androidx.camera.video.Recorder.5
            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeError(EncodeException encodeException) {
                if (Recorder.this.mAudioErrorCause == null) {
                    consumer.accept(encodeException);
                }
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStop() {
                completer.set(null);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodedData(EncodedData encodedData) {
                if (Recorder.this.mAudioState == AudioState.DISABLED) {
                    encodedData.close();
                    throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
                }
                Recorder recorder = Recorder.this;
                if (recorder.mMuxer == null) {
                    if (recorder.mInProgressRecordingStopping) {
                        Logger.d(Recorder.TAG, "Drop audio data since recording is stopping.");
                    } else {
                        recorder.mPendingAudioRingBuffer.enqueue(new BufferCopiedEncodedData(encodedData));
                        if (Recorder.this.mPendingFirstVideoData != null) {
                            Logger.d(Recorder.TAG, "Received audio data. Starting muxer...");
                            Recorder.this.setupAndStartMuxer(recordingRecord);
                        } else {
                            Logger.d(Recorder.TAG, "Cached audio data while we wait for video keyframe before starting muxer.");
                        }
                    }
                    encodedData.close();
                    return;
                }
                try {
                    recorder.writeAudioData(encodedData, recordingRecord);
                    if (encodedData != null) {
                        encodedData.close();
                    }
                } catch (Throwable th) {
                    if (encodedData != null) {
                        try {
                            encodedData.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onOutputConfigUpdate(OutputConfig outputConfig) {
                Recorder.this.mAudioOutputConfig = outputConfig;
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public /* synthetic */ void onEncodePaused() {
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStart() {
            }
        }, this.mSequentialExecutor);
        return "audioEncodingFuture";
    }

    void mute(Recording recording, final boolean z) {
        synchronized (this.mLock) {
            if (isSameRecording(recording, this.mPendingRecordingRecord) || isSameRecording(recording, this.mActiveRecordingRecord)) {
                final RecordingRecord recordingRecord = isSameRecording(recording, this.mPendingRecordingRecord) ? this.mPendingRecordingRecord : this.mActiveRecordingRecord;
                this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda15
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1444lambda$mute$8$androidxcameravideoRecorder(recordingRecord, z);
                    }
                });
            } else {
                Logger.d(TAG, "mute() called on a recording that is no longer active: " + recording.getOutputOptions());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[Catch: all -> 0x00b0, TryCatch #0 {, blocks: (B:4:0x0005, B:5:0x000e, B:27:0x0078, B:9:0x0018, B:10:0x0020, B:11:0x0027, B:14:0x002b, B:15:0x0037, B:16:0x004a, B:19:0x004e, B:22:0x0054, B:24:0x005a, B:25:0x0066, B:26:0x0072), top: B:44:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void onConfigured() {
        /*
            r9 = this;
            java.lang.String r0 = "Incorrectly invoke onConfigured() in state "
            java.lang.Object r1 = r9.mLock
            monitor-enter(r1)
            androidx.camera.video.Recorder$State r2 = r9.mState     // Catch: java.lang.Throwable -> Lb0
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> Lb0
            r3 = 1
            r4 = 0
            r5 = 0
            switch(r2) {
                case 0: goto L72;
                case 1: goto L4d;
                case 2: goto L4b;
                case 3: goto L37;
                case 4: goto L2a;
                case 5: goto L28;
                case 6: goto L20;
                case 7: goto L37;
                case 8: goto L18;
                default: goto L11;
            }     // Catch: java.lang.Throwable -> Lb0
        L11:
            r0 = r4
            r7 = r0
        L13:
            r8 = r7
        L14:
            r2 = r5
            r6 = r2
            goto L78
        L18:
            java.lang.String r0 = "Recorder"
            java.lang.String r2 = "onConfigured() was invoked when the Recorder had encountered error"
            androidx.camera.core.Logger.e(r0, r2)     // Catch: java.lang.Throwable -> Lb0
            goto L11
        L20:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = "Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface."
            r9.<init>(r0)     // Catch: java.lang.Throwable -> Lb0
            throw r9     // Catch: java.lang.Throwable -> Lb0
        L28:
            r0 = r3
            goto L2b
        L2a:
            r0 = r4
        L2b:
            boolean r2 = r9.isPersistentRecordingInProgress()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r6 = "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording"
            androidx.core.util.Preconditions.checkState(r2, r6)     // Catch: java.lang.Throwable -> Lb0
            r8 = r3
            r7 = r4
            goto L14
        L37:
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lb0
            androidx.camera.video.Recorder$State r9 = r9.mState     // Catch: java.lang.Throwable -> Lb0
            r3.append(r9)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r9 = r3.toString()     // Catch: java.lang.Throwable -> Lb0
            r2.<init>(r9)     // Catch: java.lang.Throwable -> Lb0
            throw r2     // Catch: java.lang.Throwable -> Lb0
        L4b:
            r0 = r3
            goto L4e
        L4d:
            r0 = r4
        L4e:
            androidx.camera.video.Recorder$RecordingRecord r2 = r9.mActiveRecordingRecord     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto L54
            r7 = r4
            goto L13
        L54:
            androidx.camera.video.VideoOutput$SourceState r2 = r9.mSourceState     // Catch: java.lang.Throwable -> Lb0
            androidx.camera.video.VideoOutput$SourceState r6 = androidx.camera.video.VideoOutput.SourceState.INACTIVE     // Catch: java.lang.Throwable -> Lb0
            if (r2 != r6) goto L66
            androidx.camera.video.Recorder$RecordingRecord r2 = r9.mPendingRecordingRecord     // Catch: java.lang.Throwable -> Lb0
            r9.mPendingRecordingRecord = r5     // Catch: java.lang.Throwable -> Lb0
            r9.restoreNonPendingState()     // Catch: java.lang.Throwable -> Lb0
            java.lang.Exception r6 = androidx.camera.video.Recorder.PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE     // Catch: java.lang.Throwable -> Lb0
            r7 = 4
            r8 = r4
            goto L78
        L66:
            androidx.camera.video.Recorder$State r2 = r9.mState     // Catch: java.lang.Throwable -> Lb0
            androidx.camera.video.Recorder$RecordingRecord r2 = r9.makePendingRecordingActiveLocked(r2)     // Catch: java.lang.Throwable -> Lb0
            r7 = r4
            r8 = r7
            r6 = r5
            r5 = r2
            r2 = r6
            goto L78
        L72:
            androidx.camera.video.Recorder$State r0 = androidx.camera.video.Recorder.State.IDLING     // Catch: java.lang.Throwable -> Lb0
            r9.setState(r0)     // Catch: java.lang.Throwable -> Lb0
            goto L11
        L78:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb0
            if (r8 == 0) goto La4
            androidx.camera.video.Recorder$RecordingRecord r1 = r9.mInProgressRecording
            r9.updateEncoderCallbacks(r1, r3)
            androidx.camera.video.internal.encoder.Encoder r1 = r9.mVideoEncoder
            r1.start()
            boolean r1 = r9.mShouldSendResumeEvent
            if (r1 == 0) goto L9c
            androidx.camera.video.Recorder$RecordingRecord r1 = r9.mInProgressRecording
            androidx.camera.video.OutputOptions r2 = r1.getOutputOptions()
            androidx.camera.video.RecordingStats r3 = r9.getInProgressRecordingStats()
            androidx.camera.video.VideoRecordEvent$Resume r2 = androidx.camera.video.VideoRecordEvent.resume(r2, r3)
            r1.updateVideoRecordEvent(r2)
            r9.mShouldSendResumeEvent = r4
        L9c:
            if (r0 == 0) goto Laf
            androidx.camera.video.internal.encoder.Encoder r9 = r9.mVideoEncoder
            r9.pause()
            return
        La4:
            if (r5 == 0) goto Laa
            r9.startRecording(r5, r0)
            return
        Laa:
            if (r2 == 0) goto Laf
            r9.finalizePendingRecording(r2, r7, r6)
        Laf:
            return
        Lb0:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.onConfigured():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    void onEncoderSetupError(Throwable th) {
        RecordingRecord recordingRecord;
        synchronized (this.mLock) {
            recordingRecord = null;
            switch (this.mState) {
                case CONFIGURING:
                    setStreamId(-1);
                    setState(State.ERROR);
                    break;
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                    RecordingRecord recordingRecord2 = this.mPendingRecordingRecord;
                    this.mPendingRecordingRecord = null;
                    recordingRecord = recordingRecord2;
                    setStreamId(-1);
                    setState(State.ERROR);
                    break;
                case IDLING:
                case RECORDING:
                case PAUSED:
                case STOPPING:
                case RESETTING:
                    throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.mState + ": " + th);
            }
        }
        if (recordingRecord != null) {
            finalizePendingRecording(recordingRecord, 7, th);
        }
    }

    void onInProgressRecordingInternalError(RecordingRecord recordingRecord, int i2, Throwable th) {
        boolean z;
        if (recordingRecord != this.mInProgressRecording) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.mLock) {
            z = false;
            switch (this.mState) {
                case CONFIGURING:
                case IDLING:
                case ERROR:
                    throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.mState);
                case RECORDING:
                case PAUSED:
                    setState(State.STOPPING);
                    z = true;
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                case STOPPING:
                case RESETTING:
                    if (recordingRecord != this.mActiveRecordingRecord) {
                        throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                    }
                    break;
            }
        }
        if (z) {
            m1451lambda$stop$7$androidxcameravideoRecorder(recordingRecord, -1L, i2, th);
        }
    }

    @Override // androidx.camera.video.VideoOutput
    public void onSourceStateChanged(final VideoOutput.SourceState sourceState) {
        this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1445lambda$onSourceStateChanged$2$androidxcameravideoRecorder(sourceState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: onSourceStateChangedInternal, reason: merged with bridge method [inline-methods] */
    public void m1445lambda$onSourceStateChanged$2$androidxcameravideoRecorder(VideoOutput.SourceState sourceState) {
        ScheduledFuture<?> scheduledFuture;
        Encoder encoder;
        VideoOutput.SourceState sourceState2 = this.mSourceState;
        this.mSourceState = sourceState;
        if (sourceState2 == sourceState) {
            Objects.toString(sourceState);
            Logger.d(TAG, "Video source transitions to the same state: ".concat(String.valueOf(sourceState)));
            return;
        }
        Objects.toString(sourceState);
        Logger.d(TAG, "Video source has transitioned to state: ".concat(String.valueOf(sourceState)));
        if (sourceState != VideoOutput.SourceState.INACTIVE) {
            if (sourceState != VideoOutput.SourceState.ACTIVE_NON_STREAMING || (scheduledFuture = this.mSourceNonStreamingTimeout) == null || !scheduledFuture.cancel(false) || (encoder = this.mVideoEncoder) == null) {
                return;
            }
            notifyEncoderSourceStopped(encoder);
            return;
        }
        if (this.mActiveSurface == null) {
            SetupVideoTask setupVideoTask = this.mSetupVideoTask;
            if (setupVideoTask != null) {
                setupVideoTask.cancelFailedRetry();
                this.mSetupVideoTask = null;
            }
            requestReset(4, null, false);
            return;
        }
        this.mNeedsResetBeforeNextStart = true;
        RecordingRecord recordingRecord = this.mInProgressRecording;
        if (recordingRecord == null || recordingRecord.isPersistent()) {
            return;
        }
        onInProgressRecordingInternalError(this.mInProgressRecording, 4, null);
    }

    @Override // androidx.camera.video.VideoOutput
    public void onSurfaceRequested(final SurfaceRequest surfaceRequest, final Timebase timebase, final boolean z) {
        synchronized (this.mLock) {
            Logger.d(TAG, "Surface is requested in state: " + this.mState + ", Current surface: " + this.mStreamId);
            if (this.mState == State.ERROR) {
                setState(State.CONFIGURING);
            }
        }
        this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1446lambda$onSurfaceRequested$1$androidxcameravideoRecorder(surfaceRequest, timebase, z);
            }
        });
    }

    @Override // androidx.camera.video.VideoOutput
    public void onValidateConfig() {
        checkMimeTypeSupportOrThrow((MediaSpec) getObservableData(this.mMediaSpec));
    }

    void onVideoEncoderReady(final VideoEncoderSession videoEncoderSession) {
        Encoder videoEncoder = videoEncoderSession.getVideoEncoder();
        Preconditions.checkNotNull(videoEncoder);
        this.mVideoEncoder = videoEncoder;
        this.mVideoEncoderBitrateRange.setState(((VideoEncoderInfo) videoEncoder.getEncoderInfo()).getSupportedBitrateRange());
        this.mFirstRecordingVideoBitrate = this.mVideoEncoder.getConfiguredBitrate();
        Surface activeSurface = videoEncoderSession.getActiveSurface();
        this.mActiveSurface = activeSurface;
        setLatestSurface(activeSurface);
        Futures.addCallback(videoEncoderSession.getReadyToReleaseFuture(), new FutureCallback<Encoder>() { // from class: androidx.camera.video.Recorder.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                Objects.toString(th);
                Logger.d(Recorder.TAG, "Error in ReadyToReleaseFuture: ".concat(String.valueOf(th)));
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Encoder encoder) {
                Encoder encoder2;
                Objects.toString(encoder);
                Logger.d(Recorder.TAG, "VideoEncoder can be released: ".concat(String.valueOf(encoder)));
                if (encoder == null) {
                    return;
                }
                ScheduledFuture<?> scheduledFuture = Recorder.this.mSourceNonStreamingTimeout;
                if (scheduledFuture != null && scheduledFuture.cancel(false) && (encoder2 = Recorder.this.mVideoEncoder) != null && encoder2 == encoder) {
                    Recorder.notifyEncoderSourceStopped(encoder2);
                }
                Recorder recorder = Recorder.this;
                recorder.mVideoEncoderSessionToRelease = videoEncoderSession;
                recorder.setLatestSurface(null);
                Recorder recorder2 = Recorder.this;
                recorder2.requestReset(4, null, recorder2.isPersistentRecordingInProgress());
            }
        }, this.mSequentialExecutor);
    }

    void pause(Recording recording) {
        synchronized (this.mLock) {
            if (!isSameRecording(recording, this.mPendingRecordingRecord) && !isSameRecording(recording, this.mActiveRecordingRecord)) {
                Logger.d(TAG, "pause() called on a recording that is no longer active: " + recording.getOutputOptions());
                return;
            }
            int iOrdinal = this.mState.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    setState(State.PENDING_PAUSED);
                } else if (iOrdinal != 3) {
                    if (iOrdinal == 4) {
                        setState(State.PAUSED);
                        final RecordingRecord recordingRecord = this.mActiveRecordingRecord;
                        this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda5
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f$0.m1447lambda$pause$5$androidxcameravideoRecorder(recordingRecord);
                            }
                        });
                    }
                }
                return;
            }
            throw new IllegalStateException("Called pause() from invalid state: " + this.mState);
        }
    }

    public PendingRecording prepareRecording(Context context, FileDescriptorOutputOptions fileDescriptorOutputOptions) {
        return prepareRecordingInternal(context, fileDescriptorOutputOptions);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    void requestReset(int i2, Throwable th, boolean z) {
        boolean z2;
        boolean z3;
        synchronized (this.mLock) {
            z2 = true;
            z3 = false;
            switch (this.mState) {
                case CONFIGURING:
                case IDLING:
                case ERROR:
                    break;
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                    updateNonPendingState(State.RESETTING);
                    break;
                case RECORDING:
                case PAUSED:
                    Preconditions.checkState(this.mInProgressRecording != null, "In-progress recording shouldn't be null when in state " + this.mState);
                    if (this.mActiveRecordingRecord != this.mInProgressRecording) {
                        throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                    }
                    if (!isPersistentRecordingInProgress()) {
                        setState(State.RESETTING);
                        z3 = true;
                        z2 = false;
                    }
                    break;
                case STOPPING:
                    setState(State.RESETTING);
                    z2 = false;
                    break;
                case RESETTING:
                default:
                    z2 = false;
                    break;
            }
        }
        if (!z2) {
            if (z3) {
                m1451lambda$stop$7$androidxcameravideoRecorder(this.mInProgressRecording, -1L, i2, th);
            }
        } else if (z) {
            resetVideo();
        } else {
            reset();
        }
    }

    void resume(Recording recording) {
        synchronized (this.mLock) {
            if (!isSameRecording(recording, this.mPendingRecordingRecord) && !isSameRecording(recording, this.mActiveRecordingRecord)) {
                Logger.d(TAG, "resume() called on a recording that is no longer active: " + recording.getOutputOptions());
                return;
            }
            int iOrdinal = this.mState.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 5) {
                    setState(State.RECORDING);
                    final RecordingRecord recordingRecord = this.mActiveRecordingRecord;
                    this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda14
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m1448lambda$resume$6$androidxcameravideoRecorder(recordingRecord);
                        }
                    });
                } else if (iOrdinal == 2) {
                    setState(State.PENDING_RECORDING);
                } else if (iOrdinal != 3) {
                }
                return;
            }
            throw new IllegalStateException("Called resume() from invalid state: " + this.mState);
        }
    }

    void setAudioState(AudioState audioState) {
        Logger.d(TAG, "Transitioning audio state: " + this.mAudioState + " --> " + audioState);
        this.mAudioState = audioState;
    }

    void setInProgressTransformationInfo(SurfaceRequest.TransformationInfo transformationInfo) {
        Objects.toString(transformationInfo);
        Logger.d(TAG, "Update stream transformation info: ".concat(String.valueOf(transformationInfo)));
        this.mInProgressTransformationInfo = transformationInfo;
        synchronized (this.mLock) {
            this.mStreamInfo.setState(StreamInfo.of(this.mStreamId, internalStateToStreamState(this.mState), transformationInfo));
        }
    }

    void setLatestSurface(Surface surface) {
        int iHashCode;
        if (this.mLatestSurface == surface) {
            return;
        }
        this.mLatestSurface = surface;
        synchronized (this.mLock) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                iHashCode = 0;
            }
            setStreamId(iHashCode);
        }
    }

    void setState(State state) {
        if (this.mState == state) {
            throw new AssertionError("Attempted to transition to state " + state + ", but Recorder is already in state " + state);
        }
        Logger.d(TAG, "Transitioning Recorder internal state: " + this.mState + " --> " + state);
        Set<State> set = PENDING_STATES;
        StreamInfo.StreamState streamStateInternalStateToStreamState = null;
        if (set.contains(state)) {
            if (!set.contains(this.mState)) {
                boolean zContains = VALID_NON_PENDING_STATES_WHILE_PENDING.contains(this.mState);
                State state2 = this.mState;
                if (!zContains) {
                    Objects.toString(state2);
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state ".concat(String.valueOf(state2)));
                }
                this.mNonPendingState = state2;
                streamStateInternalStateToStreamState = internalStateToStreamState(state2);
            }
        } else if (this.mNonPendingState != null) {
            this.mNonPendingState = null;
        }
        this.mState = state;
        if (streamStateInternalStateToStreamState == null) {
            streamStateInternalStateToStreamState = internalStateToStreamState(state);
        }
        this.mStreamInfo.setState(StreamInfo.of(this.mStreamId, streamStateInternalStateToStreamState, this.mInProgressTransformationInfo));
    }

    public void setVideoEncodingFrameRate(final int i2) {
        Preconditions.checkArgument(i2 > 0, "frameRate must be greater than 0.");
        this.mMediaSpec.setState(((MediaSpec) getObservableData(this.mMediaSpec)).toBuilder().configureVideo(new Consumer() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda12
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((VideoSpec.Builder) obj).setEncodeFrameRate(i2);
            }
        }).build());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9 A[Catch: all -> 0x0193, TRY_LEAVE, TryCatch #0 {all -> 0x0193, blocks: (B:14:0x0020, B:15:0x0032, B:17:0x0038, B:18:0x0044, B:23:0x0053, B:26:0x0075, B:27:0x0092, B:29:0x0096, B:30:0x0099, B:33:0x00a2, B:34:0x00aa, B:36:0x00b4, B:40:0x00c9, B:42:0x00d7, B:47:0x00e8, B:49:0x011e, B:50:0x014e, B:51:0x0156, B:52:0x015f, B:54:0x0165, B:56:0x0170, B:60:0x0180, B:45:0x00e0, B:39:0x00c1, B:62:0x0185, B:65:0x018c), top: B:78:0x0020, inners: #1, #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e A[Catch: MuxerException -> 0x016f, all -> 0x0193, TryCatch #6 {MuxerException -> 0x016f, blocks: (B:47:0x00e8, B:49:0x011e, B:50:0x014e), top: B:89:0x00e8, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0165 A[Catch: all -> 0x0193, LOOP:1: B:52:0x015f->B:54:0x0165, LOOP_END, TryCatch #0 {all -> 0x0193, blocks: (B:14:0x0020, B:15:0x0032, B:17:0x0038, B:18:0x0044, B:23:0x0053, B:26:0x0075, B:27:0x0092, B:29:0x0096, B:30:0x0099, B:33:0x00a2, B:34:0x00aa, B:36:0x00b4, B:40:0x00c9, B:42:0x00d7, B:47:0x00e8, B:49:0x011e, B:50:0x014e, B:51:0x0156, B:52:0x015f, B:54:0x0165, B:56:0x0170, B:60:0x0180, B:45:0x00e0, B:39:0x00c1, B:62:0x0185, B:65:0x018c), top: B:78:0x0020, inners: #1, #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void setupAndStartMuxer(androidx.camera.video.Recorder.RecordingRecord r13) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.setupAndStartMuxer(androidx.camera.video.Recorder$RecordingRecord):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    Recording start(PendingRecording pendingRecording) {
        long j2;
        boolean z;
        RecordingRecord recordingRecord;
        IOException e2;
        RecordingRecord recordingRecord2;
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        synchronized (this.mLock) {
            j2 = this.mLastGeneratedRecordingId + 1;
            this.mLastGeneratedRecordingId = j2;
            z = false;
            recordingRecord = null;
            switch (this.mState) {
                case CONFIGURING:
                case IDLING:
                case STOPPING:
                case RESETTING:
                case ERROR:
                    if (this.mState == State.IDLING) {
                        Preconditions.checkState(this.mActiveRecordingRecord == null && this.mPendingRecordingRecord == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                    }
                    try {
                        RecordingRecord recordingRecordFrom = RecordingRecord.from(pendingRecording, j2);
                        recordingRecordFrom.initializeRecording(pendingRecording.getApplicationContext(), this.mMuxerFactory);
                        this.mPendingRecordingRecord = recordingRecordFrom;
                        State state = this.mState;
                        if (state == State.IDLING) {
                            setState(State.PENDING_RECORDING);
                            this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f$0.tryServicePendingRecording();
                                }
                            });
                        } else if (state == State.ERROR) {
                            setState(State.PENDING_RECORDING);
                            this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f$0.m1450lambda$start$4$androidxcameravideoRecorder();
                                }
                            });
                        } else {
                            setState(State.PENDING_RECORDING);
                        }
                        e2 = null;
                        break;
                    } catch (IOException e3) {
                        e2 = e3;
                        z = 5;
                        break;
                    }
                    break;
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                    recordingRecord2 = this.mPendingRecordingRecord;
                    Preconditions.checkNotNull(recordingRecord2);
                    recordingRecord = recordingRecord2;
                    e2 = null;
                    break;
                case RECORDING:
                case PAUSED:
                    recordingRecord2 = this.mActiveRecordingRecord;
                    recordingRecord = recordingRecord2;
                    e2 = null;
                    break;
                default:
                    e2 = null;
                    break;
            }
        }
        if (recordingRecord != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (!z) {
            return Recording.from(pendingRecording, j2);
        }
        Objects.toString(e2);
        Logger.e(TAG, "Recording was started when the Recorder had encountered error ".concat(String.valueOf(e2)));
        finalizePendingRecording(RecordingRecord.from(pendingRecording, j2), 5, e2);
        return Recording.createFinalizedFrom(pendingRecording, j2);
    }

    void stop(Recording recording, final int i2, final Throwable th) {
        synchronized (this.mLock) {
            if (!isSameRecording(recording, this.mPendingRecordingRecord) && !isSameRecording(recording, this.mActiveRecordingRecord)) {
                Logger.d(TAG, "stop() called on a recording that is no longer active: " + recording.getOutputOptions());
                return;
            }
            RecordingRecord recordingRecord = null;
            switch (this.mState) {
                case CONFIGURING:
                case IDLING:
                    throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                    Preconditions.checkState(isSameRecording(recording, this.mPendingRecordingRecord));
                    RecordingRecord recordingRecord2 = this.mPendingRecordingRecord;
                    this.mPendingRecordingRecord = null;
                    restoreNonPendingState();
                    recordingRecord = recordingRecord2;
                    break;
                case RECORDING:
                case PAUSED:
                    setState(State.STOPPING);
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    final long jNanoTime = System.nanoTime() / 1000;
                    final RecordingRecord recordingRecord3 = this.mActiveRecordingRecord;
                    this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda8
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m1451lambda$stop$7$androidxcameravideoRecorder(recordingRecord3, jNanoTime, i2, th);
                        }
                    });
                    break;
                case STOPPING:
                case RESETTING:
                    Preconditions.checkState(isSameRecording(recording, this.mActiveRecordingRecord));
                    break;
            }
            if (recordingRecord != null) {
                if (i2 == 10) {
                    Logger.e(TAG, "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                }
                finalizePendingRecording(recordingRecord, 8, new RuntimeException("Recording was stopped before any data could be produced.", th));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: stopInternal, reason: merged with bridge method [inline-methods] */
    public void m1451lambda$stop$7$androidxcameravideoRecorder(RecordingRecord recordingRecord, long j2, int i2, Throwable th) {
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping) {
            return;
        }
        this.mInProgressRecordingStopping = true;
        this.mRecordingStopError = i2;
        this.mRecordingStopErrorCause = th;
        if (isAudioEnabled()) {
            clearPendingAudioRingBuffer();
            this.mAudioEncoder.stop(j2);
        }
        EncodedData encodedData = this.mPendingFirstVideoData;
        if (encodedData != null) {
            encodedData.close();
            this.mPendingFirstVideoData = null;
        }
        if (this.mSourceState != VideoOutput.SourceState.ACTIVE_NON_STREAMING) {
            this.mSourceNonStreamingTimeout = scheduleTask(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    Logger.d(Recorder.TAG, "The source didn't become non-streaming before timeout. Waited 1000ms");
                }
            }, this.mSequentialExecutor, 1000L, TimeUnit.MILLISECONDS);
        } else {
            notifyEncoderSourceStopped(this.mVideoEncoder);
        }
        Encoder encoder = this.mVideoEncoder;
        if (encoder != null) {
            encoder.stop(j2);
        }
    }

    void tryServicePendingRecording() {
        boolean z;
        RecordingRecord recordingRecordMakePendingRecordingActiveLocked;
        int i2;
        RecordingRecord recordingRecord;
        Throwable th;
        synchronized (this.mLock) {
            Logger.d(TAG, "tryServicePendingRecording on state: " + this.mState);
            int iOrdinal = this.mState.ordinal();
            boolean z2 = true;
            z = false;
            recordingRecordMakePendingRecordingActiveLocked = null;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    i2 = 0;
                    recordingRecord = null;
                }
                th = recordingRecord;
            } else {
                z2 = false;
            }
            if (this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                RecordingRecord recordingRecord2 = this.mPendingRecordingRecord;
                this.mPendingRecordingRecord = null;
                restoreNonPendingState();
                recordingRecord = recordingRecord2;
                i2 = 4;
                z = z2;
                th = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
            } else {
                if (this.mActiveRecordingRecord != null || this.mNeedsResetBeforeNextStart) {
                    Logger.w(TAG, "PendingRecording is not handled, active recording = " + this.mActiveRecordingRecord + ", need reset flag = " + this.mNeedsResetBeforeNextStart);
                } else {
                    if (this.mVideoEncoder != null) {
                        recordingRecord = null;
                        recordingRecordMakePendingRecordingActiveLocked = makePendingRecordingActiveLocked(this.mState);
                        i2 = 0;
                    }
                    z = z2;
                    th = recordingRecord;
                }
                i2 = 0;
                recordingRecord = null;
                z = z2;
                th = recordingRecord;
            }
        }
        if (recordingRecordMakePendingRecordingActiveLocked != null) {
            startRecording(recordingRecordMakePendingRecordingActiveLocked, z);
        } else if (recordingRecord != null) {
            finalizePendingRecording(recordingRecord, i2, th);
        }
    }

    void updateInProgressStatusEvent(boolean z) {
        RecordingRecord recordingRecord = this.mInProgressRecording;
        if (recordingRecord != null) {
            recordingRecord.updateVideoRecordEvent(VideoRecordEvent.status(recordingRecord.getOutputOptions(), getInProgressRecordingStats()), z);
        }
    }

    void writeAudioData(EncodedData encodedData, RecordingRecord recordingRecord) {
        boolean z;
        long j2;
        if (this.mAudioEncoder == null) {
            Logger.d(TAG, "Ignore the audio data since the audio encoder has been released.");
            return;
        }
        if (encodedData.getPresentationTimeUs() < this.mFirstRecordingVideoDataTimeUs) {
            Logger.d(TAG, "Skipping audio data: timestamp precedes first video frame.");
            return;
        }
        long size = this.mRecordingBytes + encodedData.size();
        long j3 = this.mFileSizeLimitInBytes;
        if (j3 != 0 && size > j3) {
            Logger.d(TAG, String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
            onInProgressRecordingInternalError(recordingRecord, 2, null);
            return;
        }
        long presentationTimeUs = encodedData.getPresentationTimeUs();
        long j4 = presentationTimeUs - this.mFirstRecordingVideoDataTimeUs;
        try {
            if (this.mFirstRecordingAudioDataTimeUs != Long.MAX_VALUE) {
                if (this.mDurationLimitUs != 0) {
                    Preconditions.checkState(this.mPreviousRecordingAudioDataTimeUs != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
                    long j5 = (presentationTimeUs - this.mPreviousRecordingAudioDataTimeUs) + j4;
                    z = true;
                    j2 = j4;
                    if (j5 > this.mDurationLimitUs) {
                        Logger.d(TAG, String.format("Audio data reaches duration limit %d > %d", Long.valueOf(j5), Long.valueOf(this.mDurationLimitUs)));
                        onInProgressRecordingInternalError(recordingRecord, 9, null);
                        return;
                    }
                }
                encodedData.getBufferInfo().presentationTimeUs = j2;
                this.mMuxer.writeSampleData(this.mAudioTrackIndex.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
                this.mRecordingBytes = size;
                this.mRecordingAudioBytes += encodedData.size();
                this.mPreviousRecordingAudioDataTimeUs = presentationTimeUs;
                return;
            }
            this.mFirstRecordingAudioDataTimeUs = presentationTimeUs;
            Logger.d(TAG, String.format("First audio time: %d (%s)", Long.valueOf(presentationTimeUs), DebugUtils.readableUs(this.mFirstRecordingAudioDataTimeUs)));
            this.mMuxer.writeSampleData(this.mAudioTrackIndex.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
            this.mRecordingBytes = size;
            this.mRecordingAudioBytes += encodedData.size();
            this.mPreviousRecordingAudioDataTimeUs = presentationTimeUs;
            return;
        } catch (MuxerException e2) {
            Logger.w(TAG, "writeAudioData failed", e2);
            boolean z2 = z;
            onInProgressRecordingInternalError(recordingRecord, z2 != hasInsufficientStorageOrException(e2) ? z2 : 3, e2);
            return;
        }
        z = true;
        j2 = j4;
        encodedData.getBufferInfo().presentationTimeUs = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    void writeVideoData(EncodedData encodedData, RecordingRecord recordingRecord) {
        boolean z;
        long j2;
        ?? r16;
        if (this.mVideoEncoder == null) {
            Logger.d(TAG, "Ignore the video data since the video encoder has been released.");
            return;
        }
        if (this.mVideoTrackIndex == null) {
            throw new AssertionError("Video data comes before the track is added to Muxer.");
        }
        long size = this.mRecordingBytes + encodedData.size();
        long j3 = this.mFileSizeLimitInBytes;
        long j4 = 0;
        if (j3 != 0 && size > j3) {
            Logger.d(TAG, String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
            onInProgressRecordingInternalError(recordingRecord, 2, null);
            return;
        }
        long presentationTimeUs = encodedData.getPresentationTimeUs();
        long j5 = this.mFirstRecordingVideoDataTimeUs;
        if (j5 == Long.MAX_VALUE) {
            this.mFirstRecordingVideoDataTimeUs = presentationTimeUs;
            Logger.d(TAG, String.format("First video time: %d (%s)", Long.valueOf(presentationTimeUs), DebugUtils.readableUs(this.mFirstRecordingVideoDataTimeUs)));
            r16 = 1;
        } else {
            long j6 = presentationTimeUs - j5;
            if (this.mDurationLimitUs != 0) {
                Preconditions.checkState(this.mPreviousRecordingVideoDataTimeUs != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
                long j7 = (presentationTimeUs - this.mPreviousRecordingVideoDataTimeUs) + j6;
                z = true;
                j2 = j6;
                if (j7 > this.mDurationLimitUs) {
                    Logger.d(TAG, String.format("Video data reaches duration limit %d > %d", Long.valueOf(j7), Long.valueOf(this.mDurationLimitUs)));
                    onInProgressRecordingInternalError(recordingRecord, 9, null);
                    return;
                }
            } else {
                z = true;
                j2 = j6;
            }
            j4 = j2;
            r16 = z;
        }
        encodedData.getBufferInfo().presentationTimeUs = j4;
        try {
            this.mMuxer.writeSampleData(this.mVideoTrackIndex.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
            this.mRecordingBytes = size;
            this.mRecordingDurationUs = j4;
            this.mPreviousRecordingVideoDataTimeUs = presentationTimeUs;
            updateInProgressStatusEvent(encodedData.isKeyFrame());
            if (size > this.mAvailableBytesAboveRequired) {
                OutputStorage outputStorage = this.mOutputStorage;
                Preconditions.checkNotNull(outputStorage);
                long availableBytes = outputStorage.getAvailableBytes();
                Logger.d(TAG, "availableBytes = ".concat(String.valueOf(StorageUtil.formatSize(availableBytes))));
                if (!hasInsufficientStorage(availableBytes)) {
                    this.mAvailableBytesAboveRequired = availableBytes - this.mRequiredFreeStorageBytes;
                    return;
                }
                Long lValueOf = Long.valueOf(availableBytes);
                Long lValueOf2 = Long.valueOf(this.mRequiredFreeStorageBytes);
                Object[] objArr = new Object[2];
                objArr[0] = lValueOf;
                objArr[r16] = lValueOf2;
                onInProgressRecordingInternalError(recordingRecord, 3, new IOException(String.format(INSUFFICIENT_STORAGE_ERROR_MSG, objArr)));
            }
        } catch (MuxerException e2) {
            Logger.w(TAG, "writeVideoData failed", e2);
            boolean z2 = r16;
            onInProgressRecordingInternalError(recordingRecord, z2 != hasInsufficientStorageOrException(e2) ? z2 : 3, e2);
        }
    }

    public PendingRecording prepareRecording(Context context, FileOutputOptions fileOutputOptions) {
        return prepareRecordingInternal(context, fileOutputOptions);
    }

    public PendingRecording prepareRecording(Context context, MediaStoreOutputOptions mediaStoreOutputOptions) {
        return prepareRecordingInternal(context, mediaStoreOutputOptions);
    }

    public static VideoCapabilities getVideoCapabilities(CameraInfo cameraInfo, int i2) {
        return getVideoCapabilitiesInternal(1, cameraInfo, i2, MediaConstants.MIME_TYPE_UNSPECIFIED);
    }

    public static VideoCapabilities getVideoCapabilities(CameraInfo cameraInfo) {
        return getVideoCapabilitiesInternal(1, cameraInfo, 0, MediaConstants.MIME_TYPE_UNSPECIFIED);
    }

    public static VideoCapabilities getHighSpeedVideoCapabilities(CameraInfo cameraInfo) {
        return getHighSpeedVideoCapabilities(cameraInfo, 0);
    }

    /* compiled from: WazeSource */
    abstract class RecordingRecord implements AutoCloseable {
        private final CloseGuardHelper mCloseGuard = CloseGuardHelper.create();
        private final AtomicBoolean mInitialized = new AtomicBoolean(false);
        private final AtomicReference<MuxerSupplier> mMuxerSupplier = new AtomicReference<>(null);
        private final AtomicReference<AudioSourceSupplier> mAudioSourceSupplier = new AtomicReference<>(null);
        private final AtomicReference<Consumer<Uri>> mRecordingFinalizer = new AtomicReference<>(new Consumer() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda2
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
            }
        });
        private final AtomicBoolean mMuted = new AtomicBoolean(false);
        private final MutableStateObservable<Boolean> mRecordingState = MutableStateObservable.withInitialState(false);

        /* compiled from: WazeSource */
        interface AudioSourceSupplier {
            AudioSource get(AudioSettings audioSettings, Executor executor);
        }

        /* compiled from: WazeSource */
        interface MuxerSupplier {
            Muxer get(int i2, Consumer<Uri> consumer);
        }

        RecordingRecord() {
        }

        private void finalizeRecordingInternal(Consumer<Uri> consumer, Uri uri) {
            if (consumer != null) {
                this.mCloseGuard.close();
                consumer.accept(uri);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        static RecordingRecord from(PendingRecording pendingRecording, long j2) {
            AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord = new AutoValue_Recorder_RecordingRecord(pendingRecording.getOutputOptions(), pendingRecording.getListenerExecutor(), pendingRecording.getEventListener(), pendingRecording.isAudioEnabled(), pendingRecording.isPersistent(), j2);
            autoValue_Recorder_RecordingRecord.mute(pendingRecording.isAudioInitialMuted());
            return autoValue_Recorder_RecordingRecord;
        }

        private static AudioSourceSupplier getAudioSourceSupplier(final Context context) {
            if (Build.VERSION.SDK_INT < 31) {
                context = null;
            }
            return new AudioSourceSupplier() { // from class: androidx.camera.video.Recorder.RecordingRecord.1
                @Override // androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier
                public AudioSource get(AudioSettings audioSettings, Executor executor) {
                    return new AudioSource(audioSettings, executor, context);
                }
            };
        }

        static /* synthetic */ void lambda$initializeRecording$2(MediaStoreOutputOptions mediaStoreOutputOptions, Uri uri) {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_pending", (Integer) 0);
            mediaStoreOutputOptions.getContentResolver().update(uri, contentValues, null, null);
        }

        static /* synthetic */ void lambda$initializeRecording$3(String str, Uri uri) {
            if (uri == null) {
                Logger.e(Recorder.TAG, String.format("File scanning operation failed [path: %s]", str));
            } else {
                Logger.d(Recorder.TAG, String.format("File scan completed successfully [path: %s, URI: %s]", str, uri));
            }
        }

        static /* synthetic */ void lambda$initializeRecording$4(MediaStoreOutputOptions mediaStoreOutputOptions, Context context, Uri uri) throws Throwable {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            String absolutePathFromUri = OutputUtil.getAbsolutePathFromUri(mediaStoreOutputOptions.getContentResolver(), uri, Recorder.MEDIA_COLUMN);
            if (absolutePathFromUri != null) {
                MediaScannerConnection.scanFile(context, new String[]{absolutePathFromUri}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda0
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str, Uri uri2) {
                        Recorder.RecordingRecord.lambda$initializeRecording$3(str, uri2);
                    }
                });
            } else {
                Objects.toString(uri);
                Logger.d(Recorder.TAG, "Skipping media scanner scan. Unable to retrieve file path from URI: ".concat(String.valueOf(uri)));
            }
        }

        private ContentValues resolveContentValues(MediaStoreOutputOptions mediaStoreOutputOptions, Muxer muxer) {
            ContentValues contentValues = new ContentValues(mediaStoreOutputOptions.getContentValues());
            if (!muxer.isInterruptionResilient()) {
                contentValues.put("is_pending", (Integer) 1);
            }
            return contentValues;
        }

        private void updateRecordingState(VideoRecordEvent videoRecordEvent) {
            if ((videoRecordEvent instanceof VideoRecordEvent.Start) || (videoRecordEvent instanceof VideoRecordEvent.Resume)) {
                this.mRecordingState.setState(true);
            } else if ((videoRecordEvent instanceof VideoRecordEvent.Pause) || (videoRecordEvent instanceof VideoRecordEvent.Finalize)) {
                this.mRecordingState.setState(false);
            }
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            finalizeRecording(Uri.EMPTY);
        }

        protected void finalize() throws Throwable {
            try {
                this.mCloseGuard.warnIfOpen();
                Consumer<Uri> andSet = this.mRecordingFinalizer.getAndSet(null);
                if (andSet != null) {
                    finalizeRecordingInternal(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        void finalizeRecording(Uri uri) {
            if (this.mInitialized.get()) {
                finalizeRecordingInternal(this.mRecordingFinalizer.getAndSet(null), uri);
            }
        }

        abstract Executor getCallbackExecutor();

        abstract Consumer<VideoRecordEvent> getEventListener();

        abstract OutputOptions getOutputOptions();

        abstract long getRecordingId();

        StateObservable<Boolean> getRecordingState() {
            return this.mRecordingState;
        }

        abstract boolean hasAudioEnabled();

        void initializeRecording(Context context, final MuxerFactory muxerFactory) {
            if (this.mInitialized.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            final OutputOptions outputOptions = getOutputOptions();
            Consumer<Uri> consumer = null;
            final ParcelFileDescriptor parcelFileDescriptorDup = outputOptions instanceof FileDescriptorOutputOptions ? ((FileDescriptorOutputOptions) outputOptions).getParcelFileDescriptor().dup() : null;
            this.mCloseGuard.open("finalizeRecording");
            this.mMuxerSupplier.set(new MuxerSupplier() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda3
                @Override // androidx.camera.video.Recorder.RecordingRecord.MuxerSupplier
                public final Muxer get(int i2, Consumer consumer2) {
                    return this.f$0.m1455xeed2925(muxerFactory, outputOptions, parcelFileDescriptorDup, i2, consumer2);
                }
            });
            if (hasAudioEnabled()) {
                this.mAudioSourceSupplier.set(getAudioSourceSupplier(context));
            }
            if (outputOptions instanceof MediaStoreOutputOptions) {
                final MediaStoreOutputOptions mediaStoreOutputOptions = (MediaStoreOutputOptions) outputOptions;
                consumer = new Consumer() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda4
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        Recorder.RecordingRecord.lambda$initializeRecording$2(mediaStoreOutputOptions, (Uri) obj);
                    }
                };
            }
            if (consumer != null) {
                this.mRecordingFinalizer.set(consumer);
            }
        }

        boolean isMuted() {
            return this.mMuted.get();
        }

        abstract boolean isPersistent();

        /* renamed from: lambda$initializeRecording$1$androidx-camera-video-Recorder$RecordingRecord, reason: not valid java name */
        /* synthetic */ Muxer m1455xeed2925(MuxerFactory muxerFactory, OutputOptions outputOptions, ParcelFileDescriptor parcelFileDescriptor, int i2, Consumer consumer) throws IOException {
            boolean z = outputOptions instanceof FileOutputOptions;
            Muxer muxerCreate = muxerFactory.create(i2);
            Uri uriInsert = Uri.EMPTY;
            if (z) {
                File file = ((FileOutputOptions) outputOptions).getFile();
                if (!OutputUtil.createParentFolder(file)) {
                    Logger.w(Recorder.TAG, "Failed to create folder for ".concat(String.valueOf(file.getAbsolutePath())));
                }
                Logger.d(Recorder.TAG, "Muxer.setOutput by path = ".concat(String.valueOf(file.getAbsolutePath())));
                muxerCreate.setOutput(file.getAbsolutePath(), i2);
                uriInsert = Uri.fromFile(file);
            } else if (outputOptions instanceof FileDescriptorOutputOptions) {
                Logger.d(Recorder.TAG, "Muxer.setOutput by ParcelFileDescriptor");
                muxerCreate.setOutput(parcelFileDescriptor, i2);
            } else {
                if (!(outputOptions instanceof MediaStoreOutputOptions)) {
                    throw new AssertionError("Invalid output options type: ".concat(String.valueOf(outputOptions.getClass().getSimpleName())));
                }
                MediaStoreOutputOptions mediaStoreOutputOptions = (MediaStoreOutputOptions) outputOptions;
                try {
                    uriInsert = mediaStoreOutputOptions.getContentResolver().insert(mediaStoreOutputOptions.getCollectionUri(), resolveContentValues(mediaStoreOutputOptions, muxerCreate));
                    if (uriInsert == null) {
                        throw new IOException("Unable to create MediaStore entry.");
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = mediaStoreOutputOptions.getContentResolver().openFileDescriptor(uriInsert, "rw");
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        Objects.toString(uriInsert);
                        throw new IOException("Unable to open file descriptor from uri ".concat(uriInsert.toString()));
                    }
                    try {
                        Logger.d(Recorder.TAG, "Muxer.setOutput by ParcelFileDescriptor");
                        muxerCreate.setOutput(parcelFileDescriptorOpenFileDescriptor, i2);
                    } catch (IOException e2) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw e2;
                    }
                } catch (RuntimeException e3) {
                    e3.toString();
                    throw new IOException("Unable to create MediaStore entry by ".concat(e3.toString()), e3);
                }
            }
            consumer.accept(uriInsert);
            return muxerCreate;
        }

        /* renamed from: lambda$updateVideoRecordEvent$5$androidx-camera-video-Recorder$RecordingRecord, reason: not valid java name */
        /* synthetic */ void m1456xd9bc10d1(VideoRecordEvent videoRecordEvent) {
            getEventListener().accept(videoRecordEvent);
        }

        void mute(boolean z) {
            this.mMuted.set(z);
        }

        AudioSource performOneTimeAudioSourceCreation(AudioSettings audioSettings) {
            if (!hasAudioEnabled()) {
                toString();
                throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording ".concat(toString()));
            }
            AudioSourceSupplier andSet = this.mAudioSourceSupplier.getAndSet(null);
            if (andSet != null) {
                return andSet.get(audioSettings, Recorder.AUDIO_EXECUTOR);
            }
            toString();
            throw new AssertionError("One-time audio source creation has already occurred for recording ".concat(toString()));
        }

        Muxer performOneTimeMuxerCreation(int i2, Consumer<Uri> consumer) throws IOException {
            if (!this.mInitialized.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            MuxerSupplier andSet = this.mMuxerSupplier.getAndSet(null);
            if (andSet == null) {
                toString();
                throw new AssertionError("One-time muxer creation has already occurred for recording ".concat(toString()));
            }
            try {
                return andSet.get(i2, consumer);
            } catch (RuntimeException e2) {
                e2.toString();
                throw new IOException("Failed to create Muxer by ".concat(e2.toString()), e2);
            }
        }

        void updateVideoRecordEvent(final VideoRecordEvent videoRecordEvent, boolean z) {
            if (!j$.util.Objects.equals(videoRecordEvent.getOutputOptions(), getOutputOptions())) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + videoRecordEvent.getOutputOptions() + ", Expected: " + getOutputOptions() + "]");
            }
            if (z) {
                boolean z2 = videoRecordEvent instanceof VideoRecordEvent.Finalize;
                String strConcat = "Sending VideoRecordEvent ".concat(String.valueOf(videoRecordEvent.getClass().getSimpleName()));
                if (z2) {
                    VideoRecordEvent.Finalize finalize = (VideoRecordEvent.Finalize) videoRecordEvent;
                    if (finalize.hasError()) {
                        strConcat = strConcat.concat(String.valueOf(String.format(" [error: %s]", VideoRecordEvent.Finalize.errorToString(finalize.getError()))));
                    }
                }
                Logger.d(Recorder.TAG, strConcat);
            }
            updateRecordingState(videoRecordEvent);
            if (getCallbackExecutor() == null || getEventListener() == null) {
                return;
            }
            try {
                getCallbackExecutor().execute(new Runnable() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1456xd9bc10d1(videoRecordEvent);
                    }
                });
            } catch (RejectedExecutionException e2) {
                Logger.e(Recorder.TAG, "The callback executor is invalid.", e2);
            }
        }

        static /* synthetic */ void lambda$new$0(Uri uri) {
        }

        void updateVideoRecordEvent(VideoRecordEvent videoRecordEvent) {
            updateVideoRecordEvent(videoRecordEvent, true);
        }
    }

    @Override // androidx.camera.video.VideoOutput
    public void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        onSurfaceRequested(surfaceRequest, Timebase.UPTIME, false);
    }
}
