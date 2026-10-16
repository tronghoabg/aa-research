package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline;
import androidx.media3.common.audio.AudioProcessingPipeline;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.SonicAudioProcessor;
import androidx.media3.common.audio.ToInt16PcmAudioProcessor;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.container.OpusUtil;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioOffloadSupport;
import androidx.media3.exoplayer.audio.AudioOutput;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutputProvider;
import androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.MpegAudioUtil;
import com.google.d.b.an;
import com.google.d.d.bi;
import com.google.d.d.bn;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DefaultAudioSink implements AudioSink {
    private static final int AUDIO_OUTPUT_RETRY_FALLBACK_BUFFER_SIZE = 1000000;
    private static final int AUDIO_OUTPUT_VOLUME_RAMP_TIME_MS = 20;
    public static final float DEFAULT_PLAYBACK_SPEED = 1.0f;
    private static final boolean DEFAULT_SKIP_SILENCE = false;
    public static final float MAX_PITCH = 8.0f;
    public static final float MAX_PLAYBACK_SPEED = 8.0f;
    private static final int MINIMUM_REPORT_SKIPPED_SILENCE_DURATION_US = 300000;
    public static final float MIN_PITCH = 0.1f;
    public static final float MIN_PLAYBACK_SPEED = 0.1f;
    public static final int OUTPUT_MODE_OFFLOAD = 1;
    public static final int OUTPUT_MODE_PASSTHROUGH = 2;
    public static final int OUTPUT_MODE_PCM = 0;
    private static final int REPORT_SKIPPED_SILENCE_DELAY_MS = 100;
    private static final String TAG = "DefaultAudioSink";
    private static final AtomicInteger pendingReleaseCount = new AtomicInteger();
    private long accumulatedSkippedSilenceDurationUs;
    private MediaPositionParameters afterDrainParameters;
    private AudioAttributes audioAttributes;
    private final ExoPlayer.AudioOffloadListener audioOffloadListener;
    private AudioOutput audioOutput;
    private AudioOutputListener audioOutputListener;
    private AudioOutputProvider audioOutputProvider;
    private AudioOutputProvider.Listener audioOutputProviderListener;
    private AudioProcessingPipeline audioProcessingPipeline;
    private final androidx.media3.common.audio.AudioProcessorChain audioProcessorChain;
    private int audioSessionId;
    private AuxEffectInfo auxEffectInfo;
    private final bn<AudioProcessor> availableAudioProcessors;
    private final ChannelMappingAudioProcessor channelMappingAudioProcessor;
    private Configuration configuration;
    private final Context context;
    private final boolean enableFloatOutput;
    private boolean externalAudioSessionIdProvided;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;
    private boolean handledOffloadOnPresentationEnded;
    private final PendingExceptionHolder<AudioSink.InitializationException> initializationExceptionPendingExceptionHolder;
    private ByteBuffer inputBuffer;
    private int inputBufferAccessUnitCount;
    private boolean isWaitingForOffloadEndOfStreamHandled;
    private long lastFeedElapsedRealtimeMs;
    private AudioSink.Listener listener;
    private MediaPositionParameters mediaPositionParameters;
    private final ArrayDeque<MediaPositionParameters> mediaPositionParametersCheckpoints;
    private boolean offloadDisabledUntilNextConfiguration;
    private int offloadMode;
    private ByteBuffer outputBuffer;
    private long outputStreamOffsetUs;
    private boolean pendingAudioSessionIdChangeConfirmation;
    private Configuration pendingConfiguration;
    private PlaybackParameters playbackParameters;
    private PlayerId playerId;
    private boolean playing;
    private final boolean preferAudioOutputPlaybackParameters;
    private AudioDeviceInfo preferredDevice;
    private Handler reportSkippedSilenceHandler;
    private boolean skipSilenceEnabled;
    private long skippedOutputFrameCountAtLastPosition;
    private long startMediaTimeUs;
    private boolean startMediaTimeUsNeedsInit;
    private boolean startMediaTimeUsNeedsSync;
    private boolean stoppedAudioOutput;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final ToFloatPcmAudioProcessor toFloatPcmAudioProcessor;
    private final ToInt16PcmAudioProcessor toInt16PcmAudioProcessor;
    private final TrimmingAudioProcessor trimmingAudioProcessor;
    private boolean tunneling;
    private int virtualDeviceId;
    private float volume;
    private final PendingExceptionHolder<AudioSink.WriteException> writeExceptionPendingExceptionHolder;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    /* compiled from: WazeSource */
    public interface AudioOffloadSupportProvider {
        AudioOffloadSupport getAudioOffloadSupport(Format format, AudioAttributes audioAttributes);
    }

    /* compiled from: WazeSource */
    final class AudioOutputListener implements AudioOutput.Listener {
        private final AudioOutputProvider.OutputConfig outputConfig;
        final /* synthetic */ DefaultAudioSink this$0;

        private AudioOutputListener(DefaultAudioSink defaultAudioSink, AudioOutputProvider.OutputConfig outputConfig) {
            Objects.requireNonNull(defaultAudioSink);
            this.this$0 = defaultAudioSink;
            this.outputConfig = outputConfig;
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.Listener
        public void onOffloadDataRequest() {
            if (equals(this.this$0.audioOutputListener) && this.this$0.listener != null && this.this$0.playing) {
                this.this$0.listener.onOffloadBufferEmptying();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.Listener
        public void onOffloadPresentationEnded() {
            if (equals(this.this$0.audioOutputListener) && this.this$0.stoppedAudioOutput) {
                this.this$0.handledOffloadOnPresentationEnded = true;
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.Listener
        public void onPositionAdvancing(long j2) {
            if (equals(this.this$0.audioOutputListener) && this.this$0.listener != null) {
                this.this$0.listener.onPositionAdvancing(j2);
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.Listener
        public void onReleased() {
            DefaultAudioSink.pendingReleaseCount.getAndDecrement();
            if (this.this$0.listener != null) {
                DefaultAudioSink defaultAudioSink = this.this$0;
                AudioOutputProvider.OutputConfig outputConfig = this.outputConfig;
                defaultAudioSink.listener.onAudioTrackReleased(new AudioSink.AudioTrackConfig(outputConfig.encoding, outputConfig.sampleRate, outputConfig.channelMask, outputConfig.isTunneling, outputConfig.isOffload, outputConfig.bufferSize));
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.Listener
        public void onUnderrun() {
            long jSampleCountToDurationUs;
            if (equals(this.this$0.audioOutputListener) && this.this$0.listener != null) {
                if (this.this$0.configuration.outputPcmFrameSize != -1) {
                    long j2 = this.this$0.configuration.outputConfig.bufferSize / this.this$0.configuration.outputPcmFrameSize;
                    AudioOutput audioOutput = this.this$0.audioOutput;
                    an.B(audioOutput);
                    jSampleCountToDurationUs = Util.sampleCountToDurationUs(j2, audioOutput.getSampleRate());
                } else {
                    jSampleCountToDurationUs = C.TIME_UNSET;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.this$0.lastFeedElapsedRealtimeMs;
                DefaultAudioSink defaultAudioSink = this.this$0;
                defaultAudioSink.listener.onUnderrun(defaultAudioSink.configuration.outputConfig.bufferSize, Util.usToMs(jSampleCountToDurationUs), jElapsedRealtime);
            }
        }
    }

    /* compiled from: WazeSource */
    @Deprecated
    public interface AudioProcessorChain extends androidx.media3.common.audio.AudioProcessorChain {
    }

    /* compiled from: WazeSource */
    public interface AudioTrackBufferSizeProvider {
        public static final AudioTrackBufferSizeProvider DEFAULT = new DefaultAudioTrackBufferSizeProvider.Builder().build();

        int getBufferSizeInBytes(int i2, int i3, int i4, int i5, int i6, int i7, double d2);
    }

    /* compiled from: WazeSource */
    @Deprecated
    public interface AudioTrackProvider {
        public static final AudioTrackProvider DEFAULT = new DefaultAudioTrackProvider();

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.exoplayer.audio.DefaultAudioSink$AudioTrackProvider$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
        }

        AudioTrack getAudioTrack(AudioSink.AudioTrackConfig audioTrackConfig, AudioAttributes audioAttributes, int i2, Context context);

        int getAudioTrackChannelConfig(int i2);
    }

    /* compiled from: WazeSource */
    final class Configuration {
        private final Format afterProcessingInputFormat;
        private final AudioProcessingPipeline audioProcessingPipeline;
        private final Format inputFormat;
        private final int inputPcmFrameSize;
        private final AudioOutputProvider.OutputConfig outputConfig;
        private final int outputPcmFrameSize;
        private final Object periodUid;
        private final Timeline timeline;

        private Configuration(Format format, Format format2, int i2, int i3, AudioOutputProvider.OutputConfig outputConfig, AudioProcessingPipeline audioProcessingPipeline, Timeline timeline, Object obj) {
            this.inputFormat = format;
            this.afterProcessingInputFormat = format2;
            this.inputPcmFrameSize = i2;
            this.outputPcmFrameSize = i3;
            this.outputConfig = outputConfig;
            this.audioProcessingPipeline = audioProcessingPipeline;
            this.timeline = timeline;
            this.periodUid = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AudioSink.AudioTrackConfig buildAudioTrackConfig() {
            AudioOutputProvider.OutputConfig outputConfig = this.outputConfig;
            return new AudioSink.AudioTrackConfig(outputConfig.encoding, outputConfig.sampleRate, outputConfig.channelMask, outputConfig.isTunneling, outputConfig.isOffload, outputConfig.bufferSize);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Configuration copyWithOutputConfig(AudioOutputProvider.OutputConfig outputConfig) {
            return new Configuration(this.inputFormat, this.afterProcessingInputFormat, this.inputPcmFrameSize, this.outputPcmFrameSize, outputConfig, this.audioProcessingPipeline, this.timeline, this.periodUid);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long framesToDurationUs(long j2) {
            return Util.sampleCountToDurationUs(j2, this.outputConfig.sampleRate);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long inputFramesToDurationUs(long j2) {
            return Util.sampleCountToDurationUs(j2, this.inputFormat.sampleRate);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isPcm() {
            return Objects.equals(this.inputFormat.sampleMimeType, MimeTypes.AUDIO_RAW);
        }
    }

    /* compiled from: WazeSource */
    final class MediaPositionParameters {
        public final long audioOutputPositionUs;
        public long mediaPositionDriftUs;
        public final long mediaTimeUs;
        public final PlaybackParameters playbackParameters;

        private MediaPositionParameters(PlaybackParameters playbackParameters, long j2, long j3) {
            this.playbackParameters = playbackParameters;
            this.mediaTimeUs = j2;
            this.audioOutputPositionUs = j3;
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputMode {
    }

    /* compiled from: WazeSource */
    final class PendingExceptionHolder<T extends Exception> {
        private static final int RETRY_DELAY_MS = 50;
        private static final int RETRY_DURATION_MS = 200;
        private T pendingException;
        private long throwDeadlineMs = C.TIME_UNSET;
        private long earliestNextRetryTimeMs = C.TIME_UNSET;

        public void clear() {
            this.pendingException = null;
            this.throwDeadlineMs = C.TIME_UNSET;
            this.earliestNextRetryTimeMs = C.TIME_UNSET;
        }

        public boolean shouldWaitBeforeRetry() {
            if (this.pendingException == null) {
                return false;
            }
            return DefaultAudioSink.hasPendingAudioOutputReleases() || SystemClock.elapsedRealtime() < this.earliestNextRetryTimeMs;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void throwExceptionIfDeadlineIsReached(T t) throws T {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.pendingException == null) {
                this.pendingException = t;
            }
            if (this.throwDeadlineMs == C.TIME_UNSET && !DefaultAudioSink.hasPendingAudioOutputReleases()) {
                this.throwDeadlineMs = 200 + jElapsedRealtime;
            }
            long j2 = this.throwDeadlineMs;
            if (j2 == C.TIME_UNSET || jElapsedRealtime < j2) {
                this.earliestNextRetryTimeMs = jElapsedRealtime + 50;
                return;
            }
            T t2 = this.pendingException;
            if (t2 != t) {
                t2.addSuppressed(t);
            }
            T t3 = this.pendingException;
            clear();
            throw t3;
        }
    }

    private DefaultAudioSink(Builder builder) {
        this.context = builder.context == null ? null : builder.context.getApplicationContext();
        this.audioAttributes = AudioAttributes.DEFAULT;
        this.audioProcessorChain = builder.audioProcessorChain;
        this.enableFloatOutput = builder.enableFloatOutput;
        this.preferAudioOutputPlaybackParameters = builder.enableAudioOutputPlaybackParameters;
        this.offloadMode = 0;
        this.audioOutputProvider = builder.audioOutputProvider;
        ChannelMappingAudioProcessor channelMappingAudioProcessor = new ChannelMappingAudioProcessor();
        this.channelMappingAudioProcessor = channelMappingAudioProcessor;
        TrimmingAudioProcessor trimmingAudioProcessor = new TrimmingAudioProcessor();
        this.trimmingAudioProcessor = trimmingAudioProcessor;
        this.toInt16PcmAudioProcessor = new ToInt16PcmAudioProcessor();
        this.toFloatPcmAudioProcessor = new ToFloatPcmAudioProcessor();
        this.availableAudioProcessors = bn.r(trimmingAudioProcessor, channelMappingAudioProcessor);
        this.volume = 1.0f;
        this.audioSessionId = 0;
        this.auxEffectInfo = new AuxEffectInfo(0, 0.0f);
        PlaybackParameters playbackParameters = PlaybackParameters.DEFAULT;
        this.mediaPositionParameters = new MediaPositionParameters(playbackParameters, 0L, 0L);
        this.playbackParameters = playbackParameters;
        this.skipSilenceEnabled = false;
        this.mediaPositionParametersCheckpoints = new ArrayDeque<>();
        this.initializationExceptionPendingExceptionHolder = new PendingExceptionHolder<>();
        this.writeExceptionPendingExceptionHolder = new PendingExceptionHolder<>();
        this.audioOffloadListener = builder.audioOffloadListener;
        int deviceIdFromContext = -1;
        if (Build.VERSION.SDK_INT >= 34 && builder.context != null) {
            deviceIdFromContext = getDeviceIdFromContext(builder.context);
        }
        this.virtualDeviceId = deviceIdFromContext;
    }

    private void applyAudioProcessorPlaybackParametersAndSkipSilence(long j2) {
        PlaybackParameters playbackParametersApplyPlaybackParameters;
        if (useAudioOutputPlaybackParams()) {
            playbackParametersApplyPlaybackParameters = PlaybackParameters.DEFAULT;
        } else {
            playbackParametersApplyPlaybackParameters = shouldApplyAudioProcessorPlaybackParameters() ? this.audioProcessorChain.applyPlaybackParameters(this.playbackParameters) : PlaybackParameters.DEFAULT;
            this.playbackParameters = playbackParametersApplyPlaybackParameters;
        }
        PlaybackParameters playbackParameters = playbackParametersApplyPlaybackParameters;
        this.skipSilenceEnabled = shouldApplyAudioProcessorPlaybackParameters() ? this.audioProcessorChain.applySkipSilenceEnabled(this.skipSilenceEnabled) : false;
        this.mediaPositionParametersCheckpoints.add(new MediaPositionParameters(playbackParameters, Math.max(0L, j2), this.configuration.framesToDurationUs(getWrittenFrames())));
        setupAudioProcessors(j2);
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onSkipSilenceEnabledChanged(this.skipSilenceEnabled);
        }
    }

    private long applyMediaPositionParameters(long j2) {
        while (!this.mediaPositionParametersCheckpoints.isEmpty() && j2 >= this.mediaPositionParametersCheckpoints.getFirst().audioOutputPositionUs) {
            this.mediaPositionParameters = this.mediaPositionParametersCheckpoints.remove();
        }
        MediaPositionParameters mediaPositionParameters = this.mediaPositionParameters;
        long j3 = j2 - mediaPositionParameters.audioOutputPositionUs;
        long mediaDurationForPlayoutDuration = Util.getMediaDurationForPlayoutDuration(j3, mediaPositionParameters.playbackParameters.speed);
        if (!this.mediaPositionParametersCheckpoints.isEmpty()) {
            MediaPositionParameters mediaPositionParameters2 = this.mediaPositionParameters;
            return mediaPositionParameters2.mediaTimeUs + mediaDurationForPlayoutDuration + mediaPositionParameters2.mediaPositionDriftUs;
        }
        long mediaDuration = this.audioProcessorChain.getMediaDuration(j3);
        MediaPositionParameters mediaPositionParameters3 = this.mediaPositionParameters;
        long j4 = mediaPositionParameters3.mediaTimeUs + mediaDuration;
        mediaPositionParameters3.mediaPositionDriftUs = mediaDuration - mediaDurationForPlayoutDuration;
        return j4;
    }

    private long applySkipping(long j2) {
        long skippedOutputFrameCount = this.audioProcessorChain.getSkippedOutputFrameCount();
        long jFramesToDurationUs = j2 + this.configuration.framesToDurationUs(skippedOutputFrameCount);
        long j3 = this.skippedOutputFrameCountAtLastPosition;
        if (skippedOutputFrameCount > j3) {
            long jFramesToDurationUs2 = this.configuration.framesToDurationUs(skippedOutputFrameCount - j3);
            this.skippedOutputFrameCountAtLastPosition = skippedOutputFrameCount;
            handleSkippedSilence(jFramesToDurationUs2);
        }
        return jFramesToDurationUs;
    }

    private AudioOutput buildAudioOutput(AudioOutputProvider.OutputConfig outputConfig) throws AudioSink.InitializationException {
        try {
            return this.audioOutputProvider.getAudioOutput(outputConfig);
        } catch (AudioOutputProvider.InitializationException e2) {
            AudioSink.InitializationException initializationException = new AudioSink.InitializationException(0, outputConfig.sampleRate, outputConfig.channelMask, outputConfig.encoding, outputConfig.bufferSize, this.configuration.inputFormat, outputConfig.isOffload, e2);
            AudioSink.Listener listener = this.listener;
            if (listener == null) {
                throw initializationException;
            }
            listener.onAudioSinkError(initializationException);
            throw initializationException;
        }
    }

    private AudioOutput buildAudioOutputWithRetry() throws AudioSink.InitializationException {
        try {
            return buildAudioOutput(this.configuration.outputConfig);
        } catch (AudioSink.InitializationException e2) {
            int iMax = this.configuration.outputConfig.bufferSize;
            int minimumRetryBufferSize = this.getMinimumRetryBufferSize();
            int i2 = this.configuration.outputPcmFrameSize != -1 ? this.configuration.outputPcmFrameSize : 1;
            while (iMax > minimumRetryBufferSize) {
                iMax = Math.max(minimumRetryBufferSize, iMax / 2);
                int i3 = iMax % i2;
                if (i3 != 0) {
                    iMax += i2 - i3;
                }
                AudioOutputProvider.OutputConfig.Builder builderBuildUpon = this.configuration.outputConfig.buildUpon();
                builderBuildUpon.setBufferSize(iMax);
                AudioOutputProvider.OutputConfig outputConfigBuild = builderBuildUpon.build();
                try {
                    AudioOutput audioOutputBuildAudioOutput = this.buildAudioOutput(outputConfigBuild);
                    this.configuration = this.configuration.copyWithOutputConfig(outputConfigBuild);
                    return audioOutputBuildAudioOutput;
                } catch (AudioSink.InitializationException e3) {
                    e2.addSuppressed(e3);
                }
            }
            this.maybeDisableOffload();
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void drainOutputBuffer(long r9) throws T, androidx.media3.exoplayer.audio.AudioSink.WriteException {
        /*
            r8 = this;
            java.nio.ByteBuffer r0 = r8.outputBuffer
            if (r0 != 0) goto L6
            goto Lc2
        L6:
            androidx.media3.exoplayer.audio.DefaultAudioSink$PendingExceptionHolder<androidx.media3.exoplayer.audio.AudioSink$WriteException> r0 = r8.writeExceptionPendingExceptionHolder
            boolean r0 = r0.shouldWaitBeforeRetry()
            if (r0 != 0) goto Lc2
            java.nio.ByteBuffer r0 = r8.outputBuffer
            int r0 = r0.remaining()
            r1 = 0
            r3 = 1
            r4 = 0
            androidx.media3.exoplayer.audio.AudioOutput r5 = r8.audioOutput     // Catch: androidx.media3.exoplayer.audio.AudioOutput.WriteException -> L88
            java.nio.ByteBuffer r6 = r8.outputBuffer     // Catch: androidx.media3.exoplayer.audio.AudioOutput.WriteException -> L88
            int r7 = r8.inputBufferAccessUnitCount     // Catch: androidx.media3.exoplayer.audio.AudioOutput.WriteException -> L88
            boolean r9 = r5.write(r6, r7, r9)     // Catch: androidx.media3.exoplayer.audio.AudioOutput.WriteException -> L88
            long r5 = android.os.SystemClock.elapsedRealtime()
            r8.lastFeedElapsedRealtimeMs = r5
            androidx.media3.exoplayer.audio.DefaultAudioSink$PendingExceptionHolder<androidx.media3.exoplayer.audio.AudioSink$WriteException> r10 = r8.writeExceptionPendingExceptionHolder
            r10.clear()
            androidx.media3.exoplayer.audio.AudioOutput r10 = r8.audioOutput
            boolean r10 = r10.isOffloadedPlayback()
            if (r10 == 0) goto L4e
            long r5 = r8.writtenEncodedFrames
            int r10 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r10 <= 0) goto L3d
            r8.isWaitingForOffloadEndOfStreamHandled = r4
        L3d:
            boolean r10 = r8.playing
            if (r10 == 0) goto L4e
            androidx.media3.exoplayer.audio.AudioSink$Listener r10 = r8.listener
            if (r10 == 0) goto L4e
            if (r9 != 0) goto L4e
            boolean r1 = r8.isWaitingForOffloadEndOfStreamHandled
            if (r1 != 0) goto L4e
            r10.onOffloadBufferFull()
        L4e:
            androidx.media3.exoplayer.audio.DefaultAudioSink$Configuration r10 = r8.configuration
            boolean r10 = androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration.m12642$$Nest$misPcm(r10)
            if (r10 == 0) goto L63
            long r1 = r8.writtenPcmBytes
            java.nio.ByteBuffer r10 = r8.outputBuffer
            int r10 = r10.remaining()
            int r0 = r0 - r10
            long r5 = (long) r0
            long r1 = r1 + r5
            r8.writtenPcmBytes = r1
        L63:
            if (r9 == 0) goto Lc2
            androidx.media3.exoplayer.audio.DefaultAudioSink$Configuration r9 = r8.configuration
            boolean r9 = androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration.m12642$$Nest$misPcm(r9)
            if (r9 != 0) goto L84
            java.nio.ByteBuffer r9 = r8.outputBuffer
            java.nio.ByteBuffer r10 = r8.inputBuffer
            if (r9 != r10) goto L74
            goto L75
        L74:
            r3 = r4
        L75:
            com.google.d.b.an.u(r3)
            long r9 = r8.writtenEncodedFrames
            int r0 = r8.framesPerEncodedSample
            long r0 = (long) r0
            int r2 = r8.inputBufferAccessUnitCount
            long r2 = (long) r2
            long r0 = r0 * r2
            long r9 = r9 + r0
            r8.writtenEncodedFrames = r9
        L84:
            r9 = 0
            r8.outputBuffer = r9
            return
        L88:
            r9 = move-exception
            boolean r10 = r9.isRecoverable
            if (r10 == 0) goto La2
            long r5 = r8.getWrittenFrames()
            int r10 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r10 <= 0) goto L96
            goto La3
        L96:
            androidx.media3.exoplayer.audio.AudioOutput r10 = r8.audioOutput
            boolean r10 = r10.isOffloadedPlayback()
            if (r10 == 0) goto La2
            r8.maybeDisableOffload()
            goto La3
        La2:
            r3 = r4
        La3:
            int r10 = r9.errorCode
            androidx.media3.exoplayer.audio.AudioSink$WriteException r0 = new androidx.media3.exoplayer.audio.AudioSink$WriteException
            androidx.media3.exoplayer.audio.DefaultAudioSink$Configuration r1 = r8.configuration
            androidx.media3.common.Format r1 = androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration.m12632$$Nest$fgetinputFormat(r1)
            r0.<init>(r10, r1, r3)
            androidx.media3.exoplayer.audio.AudioSink$Listener r10 = r8.listener
            if (r10 == 0) goto Lb7
            r10.onAudioSinkError(r0)
        Lb7:
            boolean r9 = r9.isRecoverable
            if (r9 != 0) goto Lc1
            androidx.media3.exoplayer.audio.DefaultAudioSink$PendingExceptionHolder<androidx.media3.exoplayer.audio.AudioSink$WriteException> r8 = r8.writeExceptionPendingExceptionHolder
            r8.throwExceptionIfDeadlineIsReached(r0)
            return
        Lc1:
            throw r0
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.drainOutputBuffer(long):void");
    }

    private boolean drainToEndOfStream() throws T, AudioSink.WriteException {
        if (!this.audioProcessingPipeline.isOperational()) {
            drainOutputBuffer(Long.MIN_VALUE);
            return this.outputBuffer == null;
        }
        this.audioProcessingPipeline.queueEndOfStream();
        processBuffers(Long.MIN_VALUE);
        if (!this.audioProcessingPipeline.isEnded()) {
            return false;
        }
        ByteBuffer byteBuffer = this.outputBuffer;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    private static int getDeviceIdFromContext(Context context) {
        return resolveDefaultVirtualDeviceIds(context.getDeviceId());
    }

    private AudioOutputProvider.FormatConfig getFormatConfig(Format format, int i2) {
        AudioOutputProvider.FormatConfig.Builder builder = new AudioOutputProvider.FormatConfig.Builder(format);
        builder.setAudioAttributes(this.audioAttributes);
        builder.setEnableHighResolutionPcmOutput(this.enableFloatOutput);
        builder.setEnablePlaybackParameters(this.preferAudioOutputPlaybackParameters);
        builder.setEnableOffload(this.offloadMode != 0);
        builder.setPreferredDevice(this.preferredDevice);
        builder.setAudioSessionId(this.audioSessionId);
        builder.setEnableTunneling(this.tunneling);
        builder.setPreferredBufferSize(i2);
        builder.setVirtualDeviceId(this.virtualDeviceId);
        return builder.build();
    }

    static int getFramesPerEncodedSample(int i2, ByteBuffer byteBuffer) {
        if (i2 == 20) {
            return OpusUtil.parseOggPacketAudioSampleCount(byteBuffer);
        }
        if (i2 != 30) {
            switch (i2) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int mpegAudioFrameSampleCount = MpegAudioUtil.parseMpegAudioFrameSampleCount(Util.getBigEndianInt(byteBuffer, byteBuffer.position()));
                    if (mpegAudioFrameSampleCount != -1) {
                        return mpegAudioFrameSampleCount;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i2) {
                        case 14:
                            int iFindTrueHdSyncframeOffset = Ac3Util.findTrueHdSyncframeOffset(byteBuffer);
                            if (iFindTrueHdSyncframeOffset == -1) {
                                return 0;
                            }
                            return Ac3Util.parseTrueHdSyncframeAudioSampleCount(byteBuffer, iFindTrueHdSyncframeOffset) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return Ac4Util.parseAc4SyncframeAudioSampleCount(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i2);
                    }
            }
            return Ac3Util.parseAc3SyncframeAudioSampleCount(byteBuffer);
        }
        return DtsUtil.parseDtsAudioSampleCount(byteBuffer);
    }

    private int getMinimumRetryBufferSize() {
        int maximumEncodedRateBytesPerSecond;
        boolean zIsEncodingLinearPcm = Util.isEncodingLinearPcm(this.configuration.outputConfig.encoding);
        Configuration configuration = this.configuration;
        if (zIsEncodingLinearPcm) {
            maximumEncodedRateBytesPerSecond = configuration.outputConfig.sampleRate * this.configuration.outputPcmFrameSize;
        } else {
            int i2 = configuration.inputFormat.bitrate;
            Configuration configuration2 = this.configuration;
            if (i2 != -1) {
                maximumEncodedRateBytesPerSecond = configuration2.inputFormat.bitrate / 8;
            } else {
                maximumEncodedRateBytesPerSecond = ExtractorUtil.getMaximumEncodedRateBytesPerSecond(configuration2.outputConfig.encoding);
                if (maximumEncodedRateBytesPerSecond == -2147483647) {
                    maximumEncodedRateBytesPerSecond = 1000000;
                }
            }
        }
        return Math.max(maximumEncodedRateBytesPerSecond, AudioTrack.getMinBufferSize(this.configuration.outputConfig.sampleRate, this.configuration.outputConfig.channelMask, this.configuration.outputConfig.encoding));
    }

    private static int getNonPcmMaximumEncodedRateBytesPerSecond(int i2) {
        int maximumEncodedRateBytesPerSecond = ExtractorUtil.getMaximumEncodedRateBytesPerSecond(i2);
        an.u(maximumEncodedRateBytesPerSecond != -2147483647);
        return maximumEncodedRateBytesPerSecond;
    }

    private long getSubmittedFrames() {
        return this.configuration.isPcm() ? this.submittedPcmBytes / this.configuration.inputPcmFrameSize : this.submittedEncodedFrames;
    }

    private long getWrittenFrames() {
        return this.configuration.isPcm() ? Util.ceilDivide(this.writtenPcmBytes, this.configuration.outputPcmFrameSize) : this.writtenEncodedFrames;
    }

    private void handleSkippedSilence(long j2) {
        this.accumulatedSkippedSilenceDurationUs += j2;
        Handler handler = this.reportSkippedSilenceHandler;
        if (handler == null) {
            handler = new Handler(Looper.myLooper());
            this.reportSkippedSilenceHandler = handler;
        }
        handler.removeCallbacksAndMessages(null);
        this.reportSkippedSilenceHandler.postDelayed(new Runnable() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.maybeReportSkippedSilence();
            }
        }, 100L);
    }

    private boolean hasAudioOutputPendingData(long j2) {
        long positionUs = this.audioOutput.getPositionUs();
        AudioOutput audioOutput = this.audioOutput;
        an.B(audioOutput);
        return j2 > Util.durationUsToSampleCount(positionUs, audioOutput.getSampleRate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hasPendingAudioOutputReleases() {
        return pendingReleaseCount.get() > 0;
    }

    private boolean initializeAudioOutput() {
        if (this.initializationExceptionPendingExceptionHolder.shouldWaitBeforeRetry()) {
            return false;
        }
        this.audioOutput = buildAudioOutputWithRetry();
        AudioOutputListener audioOutputListener = new AudioOutputListener(this.configuration.outputConfig);
        this.audioOutputListener = audioOutputListener;
        this.audioOutput.addListener(audioOutputListener);
        ExoPlayer.AudioOffloadListener audioOffloadListener = this.audioOffloadListener;
        if (audioOffloadListener != null) {
            audioOffloadListener.onOffloadedPlayback(this.audioOutput.isOffloadedPlayback());
        }
        if (this.audioOutput.isOffloadedPlayback() && this.configuration.outputConfig.useOffloadGapless) {
            this.audioOutput.setOffloadDelayPadding(this.configuration.inputFormat.encoderDelay, this.configuration.inputFormat.encoderPadding);
        }
        PlayerId playerId = this.playerId;
        if (playerId != null) {
            this.audioOutput.setPlayerId(playerId);
        }
        setVolumeInternal();
        int i2 = this.auxEffectInfo.effectId;
        if (i2 != 0) {
            this.audioOutput.attachAuxEffect(i2);
            this.audioOutput.setAuxEffectSendLevel(this.auxEffectInfo.sendLevel);
        }
        AudioDeviceInfo audioDeviceInfo = this.preferredDevice;
        if (audioDeviceInfo != null) {
            this.audioOutput.setPreferredDevice(audioDeviceInfo);
        }
        this.startMediaTimeUsNeedsInit = true;
        int audioSessionId = this.audioOutput.getAudioSessionId();
        int i3 = this.audioSessionId;
        this.audioSessionId = audioSessionId;
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onAudioTrackInitialized(this.configuration.buildAudioTrackConfig());
            if (audioSessionId != i3) {
                this.pendingAudioSessionIdChangeConfirmation = true;
                Configuration configuration = this.configuration;
                AudioOutputProvider.OutputConfig.Builder builderBuildUpon = configuration.outputConfig.buildUpon();
                builderBuildUpon.setAudioSessionId(this.audioSessionId);
                this.configuration = configuration.copyWithOutputConfig(builderBuildUpon.build());
                Configuration configuration2 = this.pendingConfiguration;
                if (configuration2 != null) {
                    AudioOutputProvider.OutputConfig.Builder builderBuildUpon2 = configuration2.outputConfig.buildUpon();
                    builderBuildUpon2.setAudioSessionId(this.audioSessionId);
                    this.pendingConfiguration = configuration2.copyWithOutputConfig(builderBuildUpon2.build());
                }
                this.listener.onAudioSessionIdChanged(this.audioSessionId);
            }
        }
        return true;
    }

    private boolean isAudioOutputInitialized() {
        return this.audioOutput != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeAddAudioOutputProviderListener$0() {
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onAudioCapabilitiesChanged();
        }
    }

    private void maybeAddAudioOutputProviderListener() {
        if (this.audioOutputProviderListener != null || this.context == null) {
            return;
        }
        AudioOutputProvider.Listener listener = new AudioOutputProvider.Listener() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda0
            @Override // androidx.media3.exoplayer.audio.AudioOutputProvider.Listener
            public final void onFormatSupportChanged() {
                this.f$0.lambda$maybeAddAudioOutputProviderListener$0();
            }
        };
        this.audioOutputProviderListener = listener;
        this.audioOutputProvider.addListener(listener);
    }

    private void maybeDisableOffload() {
        if (this.configuration.outputConfig.isOffload) {
            this.offloadDisabledUntilNextConfiguration = true;
        }
    }

    private ByteBuffer maybeRampUpVolume(ByteBuffer byteBuffer) {
        if (this.configuration.isPcm()) {
            int iDurationUsToSampleCount = (int) Util.durationUsToSampleCount(Util.msToUs(20L), this.configuration.outputConfig.sampleRate);
            long writtenFrames = getWrittenFrames();
            if (writtenFrames < iDurationUsToSampleCount) {
                return PcmAudioUtil.rampUpVolume(byteBuffer, this.configuration.outputConfig.encoding, this.configuration.outputPcmFrameSize, (int) writtenFrames, iDurationUsToSampleCount);
            }
        }
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReportSkippedSilence() {
        if (this.accumulatedSkippedSilenceDurationUs >= 300000) {
            this.listener.onSilenceSkipped();
            this.accumulatedSkippedSilenceDurationUs = 0L;
        }
    }

    private void playPendingData() {
        if (this.stoppedAudioOutput) {
            return;
        }
        this.stoppedAudioOutput = true;
        if (this.audioOutput.isOffloadedPlayback()) {
            this.handledOffloadOnPresentationEnded = false;
        }
        this.audioOutput.stop();
    }

    private void processBuffers(long j2) throws T, AudioSink.WriteException {
        drainOutputBuffer(j2);
        if (this.outputBuffer != null) {
            return;
        }
        if (!this.audioProcessingPipeline.isOperational()) {
            ByteBuffer byteBuffer = this.inputBuffer;
            if (byteBuffer != null) {
                setOutputBuffer(byteBuffer);
                drainOutputBuffer(j2);
                return;
            }
            return;
        }
        while (!this.audioProcessingPipeline.isEnded()) {
            do {
                ByteBuffer output = this.audioProcessingPipeline.getOutput();
                if (output.hasRemaining()) {
                    setOutputBuffer(output);
                    drainOutputBuffer(j2);
                } else {
                    ByteBuffer byteBuffer2 = this.inputBuffer;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.audioProcessingPipeline.queueInput(this.inputBuffer);
                    }
                }
            } while (this.outputBuffer == null);
            return;
        }
    }

    private void reconfigureAndFlush() {
        Configuration configuration = this.configuration;
        if (configuration != null) {
            Configuration configuration2 = this.pendingConfiguration;
            if (configuration2 != null) {
                this.configuration = configuration2;
                this.pendingConfiguration = null;
                configuration = configuration2;
            }
            try {
                this.configuration = this.configuration.copyWithOutputConfig(this.audioOutputProvider.getOutputConfig(getFormatConfig(configuration.afterProcessingInputFormat)));
            } catch (AudioOutputProvider.ConfigurationException e2) {
                throw new IllegalStateException(new AudioSink.ConfigurationException(e2, this.configuration.inputFormat));
            }
        }
        flush();
    }

    private void resetSinkStateForFlush() {
        this.submittedPcmBytes = 0L;
        this.submittedEncodedFrames = 0L;
        this.writtenPcmBytes = 0L;
        this.writtenEncodedFrames = 0L;
        this.isWaitingForOffloadEndOfStreamHandled = false;
        this.framesPerEncodedSample = 0;
        this.mediaPositionParameters = new MediaPositionParameters(this.playbackParameters, 0L, 0L);
        this.startMediaTimeUs = 0L;
        this.afterDrainParameters = null;
        this.mediaPositionParametersCheckpoints.clear();
        this.inputBuffer = null;
        this.inputBufferAccessUnitCount = 0;
        this.outputBuffer = null;
        this.stoppedAudioOutput = false;
        this.handledEndOfStream = false;
        this.handledOffloadOnPresentationEnded = false;
        this.trimmingAudioProcessor.resetTrimmedFrameCount();
        setupAudioProcessors(C.TIME_UNSET);
    }

    private static int resolveDefaultVirtualDeviceIds(int i2) {
        if (i2 == 0 || i2 == -1) {
            return -1;
        }
        return i2;
    }

    private void setAudioOutputPlaybackParameters() {
        if (isAudioOutputInitialized()) {
            this.audioOutput.setPlaybackParameters(this.playbackParameters);
            this.playbackParameters = this.audioOutput.getPlaybackParameters();
        }
    }

    private void setAudioProcessorPlaybackParameters(PlaybackParameters playbackParameters) {
        long j2 = C.TIME_UNSET;
        MediaPositionParameters mediaPositionParameters = new MediaPositionParameters(playbackParameters, j2, j2);
        if (isAudioOutputInitialized()) {
            this.afterDrainParameters = mediaPositionParameters;
        } else {
            this.mediaPositionParameters = mediaPositionParameters;
        }
    }

    private void setOutputBuffer(ByteBuffer byteBuffer) {
        an.u(this.outputBuffer == null);
        if (byteBuffer.hasRemaining()) {
            this.outputBuffer = maybeRampUpVolume(byteBuffer);
        }
    }

    private void setVolumeInternal() {
        if (isAudioOutputInitialized()) {
            this.audioOutput.setVolume(this.volume);
        }
    }

    private void setupAudioProcessors(long j2) {
        long positionInWindowUs;
        this.audioProcessingPipeline = this.configuration.audioProcessingPipeline;
        if (j2 == C.TIME_UNSET) {
            positionInWindowUs = 0;
        } else {
            positionInWindowUs = j2 - this.outputStreamOffsetUs;
            if (this.configuration.timeline != Timeline.EMPTY && this.configuration.periodUid != null) {
                Timeline.Period period = new Timeline.Period();
                this.configuration.timeline.getPeriodByUid(this.configuration.periodUid, period);
                positionInWindowUs += period.getPositionInWindowUs();
            }
        }
        AudioProcessingPipeline audioProcessingPipeline = this.audioProcessingPipeline;
        AudioProcessor.StreamMetadata.Builder builder = new AudioProcessor.StreamMetadata.Builder();
        builder.setTimeline(this.configuration.timeline);
        builder.setPeriodUid(this.configuration.periodUid);
        builder.setPositionOffsetUs(positionInWindowUs);
        audioProcessingPipeline.flush(builder.build());
    }

    private boolean shouldApplyAudioProcessorPlaybackParameters() {
        return (this.tunneling || !this.configuration.isPcm() || shouldUseFloatOutput(this.configuration.inputFormat.pcmEncoding)) ? false : true;
    }

    private boolean shouldUseFloatOutput(int i2) {
        return this.enableFloatOutput && Util.isEncodingHighResolutionPcm(i2);
    }

    private boolean useAudioOutputPlaybackParams() {
        Configuration configuration = this.configuration;
        return configuration != null && configuration.outputConfig.usePlaybackParameters;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void configure(AudioSink.AudioSinkConfig audioSinkConfig) throws AudioSink.ConfigurationException {
        Format formatBuild;
        int i2;
        AudioProcessingPipeline audioProcessingPipeline;
        int pcmFrameSize;
        maybeAddAudioOutputProviderListener();
        Format format = audioSinkConfig.format;
        if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
            an.l(Util.isEncodingLinearPcm(format.pcmEncoding));
            int pcmFrameSize2 = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
            bi biVar = new bi();
            biVar.i(this.availableAudioProcessors);
            if (shouldUseFloatOutput(format.pcmEncoding)) {
                biVar.g(this.toFloatPcmAudioProcessor);
            } else {
                biVar.g(this.toInt16PcmAudioProcessor);
                biVar.h(this.audioProcessorChain.getAudioProcessors());
            }
            AudioProcessingPipeline audioProcessingPipeline2 = new AudioProcessingPipeline(biVar.f());
            if (audioProcessingPipeline2.equals(this.audioProcessingPipeline)) {
                audioProcessingPipeline2 = this.audioProcessingPipeline;
            }
            this.trimmingAudioProcessor.setTrimFrameCount(format.encoderDelay, format.encoderPadding);
            this.channelMappingAudioProcessor.setChannelMap(audioSinkConfig.outputChannelMapping);
            try {
                AudioProcessor.AudioFormat audioFormatConfigure = audioProcessingPipeline2.configure(new AudioProcessor.AudioFormat(format));
                Format.Builder builderBuildUpon = format.buildUpon();
                builderBuildUpon.setPcmEncoding(audioFormatConfigure.encoding);
                builderBuildUpon.setSampleRate(audioFormatConfigure.sampleRate);
                builderBuildUpon.setChannelCount(audioFormatConfigure.channelCount);
                builderBuildUpon.setChannelMask(audioFormatConfigure.channelCount == format.channelCount ? format.channelMask : -1);
                formatBuild = builderBuildUpon.build();
                audioProcessingPipeline = audioProcessingPipeline2;
                pcmFrameSize = Util.getPcmFrameSize(audioFormatConfigure.encoding, audioFormatConfigure.channelCount);
                i2 = pcmFrameSize2;
            } catch (AudioProcessor.UnhandledAudioFormatException e2) {
                throw new AudioSink.ConfigurationException(e2, format);
            }
        } else {
            formatBuild = format;
            i2 = -1;
            audioProcessingPipeline = new AudioProcessingPipeline(bn.p());
            pcmFrameSize = -1;
        }
        int i3 = audioSinkConfig.preferredBufferSizeOverride;
        AudioOutputProvider.FormatConfig formatConfig = getFormatConfig(formatBuild, i3 != 0 ? i3 : -1);
        try {
            AudioOutputProvider.OutputConfig outputConfig = this.audioOutputProvider.getOutputConfig(formatConfig);
            if (outputConfig.encoding == 0) {
                throw new AudioSink.ConfigurationException("Invalid output encoding (isOffload=" + outputConfig.isOffload + ")", formatConfig.format);
            }
            if (outputConfig.channelMask == 0) {
                throw new AudioSink.ConfigurationException("Invalid output channel config (isOffload=" + outputConfig.isOffload + ")", formatConfig.format);
            }
            this.offloadDisabledUntilNextConfiguration = false;
            Timeline timeline = audioSinkConfig.timeline;
            MediaSource.MediaPeriodId mediaPeriodId = audioSinkConfig.mediaPeriodId;
            Configuration configuration = new Configuration(format, formatBuild, i2, pcmFrameSize, outputConfig, audioProcessingPipeline, timeline, mediaPeriodId != null ? mediaPeriodId.periodUid : null);
            if (isAudioOutputInitialized()) {
                this.pendingConfiguration = configuration;
            } else {
                this.configuration = configuration;
            }
        } catch (AudioOutputProvider.ConfigurationException e3) {
            throw new AudioSink.ConfigurationException(e3, format);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void disableTunneling() {
        if (this.tunneling) {
            this.tunneling = false;
            reconfigureAndFlush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void enableTunnelingV21() {
        an.u(this.externalAudioSessionIdProvided);
        if (this.tunneling) {
            return;
        }
        this.tunneling = true;
        reconfigureAndFlush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void flush() {
        if (isAudioOutputInitialized()) {
            resetSinkStateForFlush();
            this.audioOutputListener = null;
            Configuration configuration = this.pendingConfiguration;
            if (configuration != null) {
                this.configuration = configuration;
                this.pendingConfiguration = null;
            }
            pendingReleaseCount.incrementAndGet();
            this.audioOutput.release();
            this.audioOutput = null;
        }
        this.writeExceptionPendingExceptionHolder.clear();
        this.initializationExceptionPendingExceptionHolder.clear();
        this.skippedOutputFrameCountAtLastPosition = 0L;
        this.accumulatedSkippedSilenceDurationUs = 0L;
        Handler handler = this.reportSkippedSilenceHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public AudioAttributes getAudioAttributes() {
        return this.audioAttributes;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public AudioCapabilities getAudioCapabilities() {
        AudioOutputProvider audioOutputProvider = this.audioOutputProvider;
        if (audioOutputProvider instanceof AudioTrackAudioOutputProvider) {
            return ((AudioTrackAudioOutputProvider) audioOutputProvider).getAudioCapabilities();
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getAudioTrackBufferSizeUs() {
        return !isAudioOutputInitialized() ? C.TIME_UNSET : this.configuration.isPcm() ? this.configuration.framesToDurationUs(this.audioOutput.getBufferSizeInFrames()) : Util.scaleLargeValue(this.audioOutput.getBufferSizeInFrames(), 1000000L, getNonPcmMaximumEncodedRateBytesPerSecond(this.configuration.outputConfig.encoding), RoundingMode.DOWN);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getCurrentPositionUs(boolean z) {
        if (!isAudioOutputInitialized() || this.startMediaTimeUsNeedsInit) {
            return Long.MIN_VALUE;
        }
        return applySkipping(applyMediaPositionParameters(Math.min(this.audioOutput.getPositionUs(), this.configuration.framesToDurationUs(getWrittenFrames()))));
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public AudioOffloadSupport getFormatOffloadSupport(Format format) {
        if (this.offloadDisabledUntilNextConfiguration) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        AudioOutputProvider.FormatSupport formatSupport = this.audioOutputProvider.getFormatSupport(getFormatConfig(format));
        AudioOffloadSupport.Builder builder = new AudioOffloadSupport.Builder();
        builder.setIsFormatSupported(formatSupport.isFormatSupportedForOffload);
        builder.setIsGaplessSupported(formatSupport.isGaplessSupportedForOffload);
        builder.setIsSpeedChangeSupported(formatSupport.isSpeedChangeSupportedForOffload);
        return builder.build();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int getFormatSupport(Format format) {
        boolean z;
        if (Util.isEncodingLinearPcm(format.pcmEncoding)) {
            boolean zShouldUseFloatOutput = shouldUseFloatOutput(format.pcmEncoding);
            if (!zShouldUseFloatOutput || format.pcmEncoding == 4) {
                z = false;
            } else {
                Format.Builder builderBuildUpon = format.buildUpon();
                builderBuildUpon.setPcmEncoding(4);
                format = builderBuildUpon.build();
                z = true;
            }
            if (!zShouldUseFloatOutput && format.pcmEncoding != 2) {
                Format.Builder builderBuildUpon2 = format.buildUpon();
                builderBuildUpon2.setPcmEncoding(2);
                format = builderBuildUpon2.build();
                z = true;
            }
        } else {
            z = false;
        }
        int i2 = this.audioOutputProvider.getFormatSupport(getFormatConfig(format)).supportLevel;
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 2) {
            return 0;
        }
        return z ? 1 : 2;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return this.skipSilenceEnabled;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean handleBuffer(ByteBuffer byteBuffer, long j2, int i2) throws T, AudioSink.WriteException, AudioSink.InitializationException {
        ByteBuffer byteBuffer2 = this.inputBuffer;
        an.l(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.pendingConfiguration != null) {
            if (!drainToEndOfStream()) {
                return false;
            }
            AudioOutput audioOutput = this.audioOutput;
            if (audioOutput == null || audioOutput.canReuseAudioOutput(this.configuration.outputConfig, getFormatConfig(this.pendingConfiguration.afterProcessingInputFormat), this.pendingConfiguration.outputConfig)) {
                this.configuration = this.pendingConfiguration;
                this.pendingConfiguration = null;
                AudioOutput audioOutput2 = this.audioOutput;
                if (audioOutput2 != null && audioOutput2.isOffloadedPlayback() && this.configuration.outputConfig.useOffloadGapless) {
                    this.audioOutput.setOffloadEndOfStream();
                    this.audioOutput.setOffloadDelayPadding(this.configuration.inputFormat.encoderDelay, this.configuration.inputFormat.encoderPadding);
                    this.isWaitingForOffloadEndOfStreamHandled = true;
                }
            } else {
                playPendingData();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j2);
        }
        if (!isAudioOutputInitialized()) {
            try {
                if (!initializeAudioOutput()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e2) {
                if (e2.isRecoverable) {
                    throw e2;
                }
                this.initializationExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(e2);
                return false;
            }
        }
        this.initializationExceptionPendingExceptionHolder.clear();
        if (this.startMediaTimeUsNeedsInit) {
            this.startMediaTimeUs = Math.max(0L, j2);
            this.startMediaTimeUsNeedsSync = false;
            this.startMediaTimeUsNeedsInit = false;
            if (useAudioOutputPlaybackParams()) {
                setAudioOutputPlaybackParameters();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j2);
            if (this.playing) {
                play();
            }
        }
        if (this.inputBuffer == null) {
            an.l(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.configuration.isPcm() && this.framesPerEncodedSample == 0) {
                int framesPerEncodedSample = getFramesPerEncodedSample(this.configuration.outputConfig.encoding, byteBuffer);
                this.framesPerEncodedSample = framesPerEncodedSample;
                if (framesPerEncodedSample == 0) {
                    return true;
                }
            }
            if (this.afterDrainParameters != null) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                applyAudioProcessorPlaybackParametersAndSkipSilence(j2);
                this.afterDrainParameters = null;
            }
            long jInputFramesToDurationUs = this.startMediaTimeUs + this.configuration.inputFramesToDurationUs(getSubmittedFrames() - this.trimmingAudioProcessor.getTrimmedFrameCount());
            if (!this.startMediaTimeUsNeedsSync && Math.abs(jInputFramesToDurationUs - j2) > 200000) {
                AudioSink.Listener listener = this.listener;
                if (listener != null) {
                    listener.onAudioSinkError(new AudioSink.UnexpectedDiscontinuityException(j2, jInputFramesToDurationUs));
                }
                this.startMediaTimeUsNeedsSync = true;
            }
            if (this.startMediaTimeUsNeedsSync) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                long j3 = j2 - jInputFramesToDurationUs;
                this.startMediaTimeUs += j3;
                this.startMediaTimeUsNeedsSync = false;
                applyAudioProcessorPlaybackParametersAndSkipSilence(j2);
                AudioSink.Listener listener2 = this.listener;
                if (listener2 != null && j3 != 0) {
                    listener2.onPositionDiscontinuity();
                }
            }
            if (this.configuration.isPcm()) {
                this.submittedPcmBytes += byteBuffer.remaining();
            } else {
                this.submittedEncodedFrames += this.framesPerEncodedSample * i2;
            }
            this.inputBuffer = byteBuffer;
            this.inputBufferAccessUnitCount = i2;
        }
        processBuffers(j2);
        if (!this.inputBuffer.hasRemaining()) {
            this.inputBuffer = null;
            this.inputBufferAccessUnitCount = 0;
            return true;
        }
        if (!this.audioOutput.isStalled()) {
            return false;
        }
        Log.w(TAG, "Resetting stalled audio output");
        flush();
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void handleDiscontinuity() {
        this.startMediaTimeUsNeedsSync = true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean hasPendingData() {
        if (isAudioOutputInitialized()) {
            return !(this.audioOutput.isOffloadedPlayback() && this.handledOffloadOnPresentationEnded) && hasAudioOutputPendingData(getWrittenFrames());
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean isEnded() {
        if (isAudioOutputInitialized()) {
            return this.handledEndOfStream && !hasPendingData();
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.playing = false;
        if (isAudioOutputInitialized()) {
            this.audioOutput.pause();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void play() {
        this.playing = true;
        if (isAudioOutputInitialized()) {
            this.audioOutput.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void playToEndOfStream() {
        if (!this.handledEndOfStream && isAudioOutputInitialized() && drainToEndOfStream()) {
            playPendingData();
            this.handledEndOfStream = true;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void release() {
        this.audioOutputProvider.release();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void reset() {
        flush();
        bn<AudioProcessor> bnVar = this.availableAudioProcessors;
        int size = bnVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            bnVar.get(i2).reset();
        }
        this.toInt16PcmAudioProcessor.reset();
        this.toFloatPcmAudioProcessor.reset();
        AudioProcessingPipeline audioProcessingPipeline = this.audioProcessingPipeline;
        if (audioProcessingPipeline != null) {
            audioProcessingPipeline.reset();
        }
        this.playing = false;
        this.offloadDisabledUntilNextConfiguration = false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        if (this.audioAttributes.equals(audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        if (this.tunneling) {
            return;
        }
        reconfigureAndFlush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioOutputProvider(AudioOutputProvider audioOutputProvider) {
        if (audioOutputProvider.equals(this.audioOutputProvider)) {
            return;
        }
        this.audioOutputProvider.release();
        this.audioOutputProvider = audioOutputProvider;
        AudioOutputProvider.Listener listener = this.audioOutputProviderListener;
        if (listener != null) {
            audioOutputProvider.addListener(listener);
        }
        reconfigureAndFlush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioSessionId(int i2) {
        if (this.pendingAudioSessionIdChangeConfirmation) {
            if (this.audioSessionId != i2) {
                return;
            } else {
                this.pendingAudioSessionIdChangeConfirmation = false;
            }
        }
        if (this.audioSessionId != i2) {
            this.audioSessionId = i2;
            this.externalAudioSessionIdProvided = i2 != 0;
            reconfigureAndFlush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        if (this.auxEffectInfo.equals(auxEffectInfo)) {
            return;
        }
        int i2 = auxEffectInfo.effectId;
        float f2 = auxEffectInfo.sendLevel;
        AudioOutput audioOutput = this.audioOutput;
        if (audioOutput != null) {
            if (this.auxEffectInfo.effectId != i2) {
                audioOutput.attachAuxEffect(i2);
            }
            if (i2 != 0) {
                this.audioOutput.setAuxEffectSendLevel(f2);
            }
        }
        this.auxEffectInfo = auxEffectInfo;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setClock(Clock clock) {
        this.audioOutputProvider.setClock(clock);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setListener(AudioSink.Listener listener) {
        this.listener = listener;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOffloadDelayPadding(int i2, int i3) {
        Configuration configuration;
        AudioOutput audioOutput = this.audioOutput;
        if (audioOutput == null || !audioOutput.isOffloadedPlayback() || (configuration = this.configuration) == null || !configuration.outputConfig.useOffloadGapless) {
            return;
        }
        this.audioOutput.setOffloadDelayPadding(i2, i3);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOffloadMode(int i2) {
        an.u(true);
        this.offloadMode = i2;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOutputStreamOffsetUs(long j2) {
        this.outputStreamOffsetUs = j2;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        if (useAudioOutputPlaybackParams()) {
            this.playbackParameters = playbackParameters;
            setAudioOutputPlaybackParameters();
        } else {
            PlaybackParameters playbackParameters2 = new PlaybackParameters(Util.constrainValue(playbackParameters.speed, 0.1f, 8.0f), Util.constrainValue(playbackParameters.pitch, 0.1f, 8.0f));
            this.playbackParameters = playbackParameters2;
            setAudioProcessorPlaybackParameters(playbackParameters2);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlayerId(PlayerId playerId) {
        this.playerId = playerId;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.preferredDevice = audioDeviceInfo;
        AudioOutput audioOutput = this.audioOutput;
        if (audioOutput != null) {
            audioOutput.setPreferredDevice(audioDeviceInfo);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z) {
        this.skipSilenceEnabled = z;
        setAudioProcessorPlaybackParameters(useAudioOutputPlaybackParams() ? PlaybackParameters.DEFAULT : this.playbackParameters);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setVirtualDeviceId(int i2) {
        int i3 = this.virtualDeviceId;
        int iResolveDefaultVirtualDeviceIds = resolveDefaultVirtualDeviceIds(i2);
        if (i3 == iResolveDefaultVirtualDeviceIds) {
            return;
        }
        this.virtualDeviceId = iResolveDefaultVirtualDeviceIds;
        reconfigureAndFlush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setVolume(float f2) {
        if (this.volume != f2) {
            this.volume = f2;
            setVolumeInternal();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean supportsFormat(Format format) {
        return getFormatSupport(format) != 0;
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private AudioCapabilities audioCapabilities;
        private ExoPlayer.AudioOffloadListener audioOffloadListener;
        private AudioOffloadSupportProvider audioOffloadSupportProvider;
        private AudioOutputProvider audioOutputProvider;
        private androidx.media3.common.audio.AudioProcessorChain audioProcessorChain;
        private AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
        private AudioTrackProvider audioTrackProvider;
        private boolean buildCalled;
        private final Context context;
        private boolean enableAudioOutputPlaybackParameters;
        private boolean enableFloatOutput;

        @Deprecated
        public Builder() {
            this.context = null;
            this.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
        }

        public DefaultAudioSink build() {
            an.u(!this.buildCalled);
            this.buildCalled = true;
            if (this.audioProcessorChain == null) {
                this.audioProcessorChain = new DefaultAudioProcessorChain(new AudioProcessor[0]);
            }
            AudioOutputProvider audioOutputProvider = this.audioOutputProvider;
            AudioOffloadSupportProvider audioOffloadSupportProvider = this.audioOffloadSupportProvider;
            if (audioOutputProvider == null) {
                if (audioOffloadSupportProvider == null) {
                    this.audioOffloadSupportProvider = new DefaultAudioOffloadSupportProvider(this.context);
                }
                if (this.audioTrackBufferSizeProvider == null) {
                    this.audioTrackBufferSizeProvider = AudioTrackBufferSizeProvider.DEFAULT;
                }
                AudioTrackAudioOutputProvider.Builder builder = new AudioTrackAudioOutputProvider.Builder(this.context);
                builder.setAudioCapabilities(this.context != null ? null : this.audioCapabilities);
                builder.setAudioOffloadSupportProvider(this.audioOffloadSupportProvider);
                builder.setAudioTrackBufferSizeProvider(this.audioTrackBufferSizeProvider);
                builder.setAudioTrackProvider(this.audioTrackProvider);
                this.audioOutputProvider = builder.build();
            } else {
                an.u(audioOffloadSupportProvider == null);
                an.u(this.audioTrackBufferSizeProvider == null);
                an.u(this.audioTrackProvider == null);
            }
            return new DefaultAudioSink(this);
        }

        @Deprecated
        public Builder setAudioCapabilities(AudioCapabilities audioCapabilities) {
            an.B(audioCapabilities);
            this.audioCapabilities = audioCapabilities;
            return this;
        }

        @Deprecated
        public Builder setAudioOffloadSupportProvider(AudioOffloadSupportProvider audioOffloadSupportProvider) {
            this.audioOffloadSupportProvider = audioOffloadSupportProvider;
            return this;
        }

        public Builder setAudioOutputProvider(AudioOutputProvider audioOutputProvider) {
            an.v(this.context != null, "Cannot set AudioOutputProvider without a Context");
            this.audioOutputProvider = audioOutputProvider;
            return this;
        }

        public Builder setAudioProcessorChain(androidx.media3.common.audio.AudioProcessorChain audioProcessorChain) {
            an.B(audioProcessorChain);
            this.audioProcessorChain = audioProcessorChain;
            return this;
        }

        public Builder setAudioProcessors(AudioProcessor[] audioProcessorArr) {
            an.B(audioProcessorArr);
            setAudioProcessorChain(new DefaultAudioProcessorChain(audioProcessorArr));
            return this;
        }

        @Deprecated
        public Builder setAudioTrackBufferSizeProvider(AudioTrackBufferSizeProvider audioTrackBufferSizeProvider) {
            this.audioTrackBufferSizeProvider = audioTrackBufferSizeProvider;
            return this;
        }

        @Deprecated
        public Builder setAudioTrackProvider(AudioTrackProvider audioTrackProvider) {
            this.audioTrackProvider = audioTrackProvider;
            return this;
        }

        public Builder setEnableAudioOutputPlaybackParameters(boolean z) {
            this.enableAudioOutputPlaybackParameters = z;
            return this;
        }

        @Deprecated
        public Builder setEnableAudioTrackPlaybackParams(boolean z) {
            setEnableAudioOutputPlaybackParameters(z);
            return this;
        }

        public Builder setEnableFloatOutput(boolean z) {
            this.enableFloatOutput = z;
            return this;
        }

        public Builder setExperimentalAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
            this.audioOffloadListener = audioOffloadListener;
            return this;
        }

        public Builder(Context context) {
            this.context = context;
            this.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
        }
    }

    /* compiled from: WazeSource */
    public class DefaultAudioProcessorChain implements AudioProcessorChain {
        private final AudioProcessor[] audioProcessors;
        private final SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
        private final SonicAudioProcessor sonicAudioProcessor;

        public DefaultAudioProcessorChain(AudioProcessor[] audioProcessorArr, SilenceSkippingAudioProcessor silenceSkippingAudioProcessor, SonicAudioProcessor sonicAudioProcessor) {
            int length = audioProcessorArr.length;
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[length + 2];
            this.audioProcessors = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, length);
            this.silenceSkippingAudioProcessor = silenceSkippingAudioProcessor;
            this.sonicAudioProcessor = sonicAudioProcessor;
            audioProcessorArr2[length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[length + 1] = sonicAudioProcessor;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters) {
            this.sonicAudioProcessor.setSpeed(playbackParameters.speed);
            this.sonicAudioProcessor.setPitch(playbackParameters.pitch);
            return playbackParameters;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public boolean applySkipSilenceEnabled(boolean z) {
            this.silenceSkippingAudioProcessor.setEnabled(z);
            return z;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public AudioProcessor[] getAudioProcessors() {
            return this.audioProcessors;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public long getMediaDuration(long j2) {
            return this.sonicAudioProcessor.isActive() ? this.sonicAudioProcessor.getMediaDuration(j2) : j2;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public long getSkippedOutputFrameCount() {
            return this.silenceSkippingAudioProcessor.getSkippedFrames();
        }

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new SilenceSkippingAudioProcessor(), new SonicAudioProcessor());
        }
    }

    private AudioOutputProvider.FormatConfig getFormatConfig(Format format) {
        return getFormatConfig(format, -1);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public /* synthetic */ void configure(Format format, int i2, int[] iArr) {
        AudioSink.CC.$default$configure(this, format, i2, iArr);
    }
}
