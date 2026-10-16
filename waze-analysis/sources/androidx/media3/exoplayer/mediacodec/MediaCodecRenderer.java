package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.Util;
import androidx.media3.container.OpusUtil;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.OggOpusAudioPacketizer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.FrameworkCryptoConfig;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.SampleStream;
import com.google.d.b.an;
import com.google.d.d.ci;
import com.google.d.d.fu;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class MediaCodecRenderer extends BaseRenderer {
    private static final byte[] ADAPTATION_WORKAROUND_BUFFER = {0, 0, 1, 103, 66, -64, StylePropertiesKt.WidthFractionId, -38, StylePropertiesKt.ContentColorId, -112, 0, 0, 1, 104, -50, StylePropertiesKt.RightId, StylePropertiesKt.MaxWidthId, StylePropertiesKt.ZIndexId, 0, 0, 1, 101, -120, -124, StylePropertiesKt.LeftId, -50, 113, StylePropertiesKt.TranslationXId, -96, 0, StylePropertiesKt.LineHeightId, -65, StylePropertiesKt.RotationZId, StylePropertiesKt.LineBreakId, -61, StylePropertiesKt.FontWeightId, 93, 120};
    private static final int ADAPTATION_WORKAROUND_MODE_ALWAYS = 2;
    private static final int ADAPTATION_WORKAROUND_MODE_NEVER = 0;
    private static final int ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION = 1;
    private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
    protected static final float CODEC_OPERATING_RATE_UNSET = -1.0f;
    protected static final boolean DEBUG_LOG_ENABLED = false;
    protected static final String DEBUG_LOG_TAG = "MCRdebug";
    private static final int DRAIN_ACTION_FLUSH = 1;
    private static final int DRAIN_ACTION_FLUSH_AND_UPDATE_DRM_SESSION = 2;
    private static final int DRAIN_ACTION_NONE = 0;
    private static final int DRAIN_ACTION_REINITIALIZE = 3;
    private static final int DRAIN_STATE_NONE = 0;
    private static final int DRAIN_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int DRAIN_STATE_WAIT_END_OF_STREAM = 2;
    private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000;
    private static final int RECONFIGURATION_STATE_NONE = 0;
    private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
    private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
    private static final String TAG = "MediaCodecRenderer";
    private CodecParameters activeCodecParameters;
    private final float assumedMinimumCodecOperatingRate;
    private ArrayDeque<MediaCodecInfo> availableCodecInfos;
    private final DecoderInputBuffer buffer;
    private final BatchBuffer bypassBatchBuffer;
    private boolean bypassDrainAndReinitialize;
    private boolean bypassEnabled;
    private final DecoderInputBuffer bypassSampleBuffer;
    private boolean bypassSampleBufferPending;
    private MediaCodecAdapter codec;
    private int codecAdaptationWorkaroundMode;
    private final MediaCodecAdapter.Factory codecAdapterFactory;
    private int codecDrainAction;
    private int codecDrainState;
    private DrmSession codecDrmSession;
    private boolean codecHasOutputMediaFormat;
    private long codecHotswapDeadlineMs;
    private MediaCodecInfo codecInfo;
    private Format codecInputFormat;
    private boolean codecNeedsAdaptationWorkaroundBuffer;
    private boolean codecNeedsEosFlushWorkaround;
    private boolean codecNeedsEosPropagation;
    private boolean codecNeedsSosFlushWorkaround;
    private float codecOperatingRate;
    private MediaFormat codecOutputMediaFormat;
    private boolean codecOutputMediaFormatChanged;
    private boolean codecReceivedBuffers;
    private boolean codecReceivedEos;
    private int codecReconfigurationState;
    private boolean codecReconfigured;
    private boolean codecRegisteredOnBufferAvailableListener;
    private final Context context;
    private float currentPlaybackSpeed;
    protected DecoderCounters decoderCounters;
    private final boolean enableDecoderFallback;
    private boolean experimentalEnableProcessedStreamChangedAtStart;
    private boolean hasSkippedFlushAndWaitingForQueueInputBuffer;
    private Format inputFormat;
    private int inputIndex;
    private boolean inputStreamEnded;
    private boolean isDecodeOnlyOutputBuffer;
    private long largestQueuedPresentationTimeUs;
    private long largestQueuedPresentationTimeWithinDurationUs;
    private CodecParameters lastDispatchedCodecParameters;
    private long lastOutputBufferProcessedRealtimeMs;
    private long lastProcessedOutputBufferTimeUs;
    private final MediaCodecSelector mediaCodecSelector;
    private MediaCrypto mediaCrypto;
    private boolean needToNotifyOutputFormatChangeAfterStreamChange;
    private final DecoderInputBuffer noDataBuffer;
    private final OggOpusAudioPacketizer oggOpusAudioPacketizer;
    private ByteBuffer outputBuffer;
    private final MediaCodec.BufferInfo outputBufferInfo;
    private Format outputFormat;
    private int outputIndex;
    private boolean outputStreamEnded;
    private OutputStreamInfo outputStreamInfo;
    private boolean pendingOutputEndOfStream;
    private final ArrayDeque<OutputStreamInfo> pendingOutputStreamChanges;
    private ExoPlaybackException pendingPlaybackException;
    private DecoderInitializationException preferredDecoderInitializationException;
    private final AtomicInteger readDataResultHolder;
    private long renderTimeLimitMs;
    private boolean shouldSkipAdaptationWorkaroundOutputBuffer;
    private long skippedFlushOffsetUs;
    private DrmSession sourceDrmSession;
    private ci<String> subscribedCodecParameterKeys;
    private float targetPlaybackSpeed;
    private boolean waitingForFirstSampleInFormat;
    private Renderer.WakeupListener wakeupListener;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface AdaptationWorkaroundMode {
    }

    /* compiled from: WazeSource */
    final class Api31 {
        private Api31() {
        }

        public static void setLogSessionIdToMediaCodecFormat(MediaCodecAdapter.Configuration configuration, PlayerId playerId) {
            LogSessionId logSessionId = playerId.getLogSessionId();
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            configuration.mediaFormat.setString("log-session-id", logSessionId.getStringId());
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface DrainAction {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface DrainState {
    }

    /* compiled from: WazeSource */
    final class MediaCodecRendererCodecAdapterListener implements MediaCodecAdapter.OnBufferAvailableListener {
        final /* synthetic */ MediaCodecRenderer this$0;

        private MediaCodecRendererCodecAdapterListener(MediaCodecRenderer mediaCodecRenderer) {
            Objects.requireNonNull(mediaCodecRenderer);
            this.this$0 = mediaCodecRenderer;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener
        public void onInputBufferAvailable() {
            if (this.this$0.wakeupListener != null) {
                this.this$0.wakeupListener.onWakeup();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener
        public void onOutputBufferAvailable() {
            if (this.this$0.wakeupListener != null) {
                this.this$0.wakeupListener.onWakeup();
            }
        }
    }

    /* compiled from: WazeSource */
    final class OutputStreamInfo {
        private static final OutputStreamInfo UNSET = new OutputStreamInfo(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, 0);
        private long durationUs;
        private final TimedValueQueue<Format> formatQueue;
        private long lastBufferTimeUs;
        private final long previousStreamLastBufferTimeUs;
        private boolean queuedBufferAfterReset;
        private final long startPositionUs;
        private int streamFlags;
        private final long streamOffsetUs;

        private OutputStreamInfo(long j2, long j3, long j4, long j5, int i2) {
            this.previousStreamLastBufferTimeUs = j2;
            this.startPositionUs = j3;
            this.streamOffsetUs = j4;
            this.durationUs = j5;
            this.streamFlags = i2;
            this.formatQueue = new TimedValueQueue<>();
            this.lastBufferTimeUs = C.TIME_UNSET;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isDurationStrict() {
            return (this.streamFlags & 1) != 0;
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface ReconfigurationState {
    }

    public MediaCodecRenderer(Context context, int i2, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, boolean z, float f2) {
        super(i2);
        this.context = context.getApplicationContext();
        this.codecAdapterFactory = factory;
        an.B(mediaCodecSelector);
        this.mediaCodecSelector = mediaCodecSelector;
        this.enableDecoderFallback = z;
        this.assumedMinimumCodecOperatingRate = f2;
        this.readDataResultHolder = new AtomicInteger();
        this.noDataBuffer = DecoderInputBuffer.newNoDataInstance();
        this.buffer = new DecoderInputBuffer(0);
        this.bypassSampleBuffer = new DecoderInputBuffer(2);
        BatchBuffer batchBuffer = new BatchBuffer();
        this.bypassBatchBuffer = batchBuffer;
        this.outputBufferInfo = new MediaCodec.BufferInfo();
        this.currentPlaybackSpeed = 1.0f;
        this.targetPlaybackSpeed = 1.0f;
        this.renderTimeLimitMs = C.TIME_UNSET;
        this.pendingOutputStreamChanges = new ArrayDeque<>();
        this.outputStreamInfo = OutputStreamInfo.UNSET;
        batchBuffer.ensureSpaceForWrite(0);
        batchBuffer.data.order(ByteOrder.nativeOrder());
        this.oggOpusAudioPacketizer = new OggOpusAudioPacketizer();
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecReconfigurationState = 0;
        this.inputIndex = -1;
        this.outputIndex = -1;
        this.codecHotswapDeadlineMs = C.TIME_UNSET;
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        this.largestQueuedPresentationTimeWithinDurationUs = C.TIME_UNSET;
        this.lastProcessedOutputBufferTimeUs = C.TIME_UNSET;
        this.lastOutputBufferProcessedRealtimeMs = C.TIME_UNSET;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.decoderCounters = new DecoderCounters();
        this.hasSkippedFlushAndWaitingForQueueInputBuffer = false;
        this.skippedFlushOffsetUs = 0L;
        this.subscribedCodecParameterKeys = ci.o();
        CodecParameters codecParameters = CodecParameters.EMPTY;
        this.activeCodecParameters = codecParameters;
        this.lastDispatchedCodecParameters = codecParameters;
    }

    private void bypassRead() {
        an.u(!this.inputStreamEnded);
        DecoderInputBuffer decoderInputBuffer = this.bypassSampleBuffer;
        FormatHolder formatHolder = getFormatHolder();
        decoderInputBuffer.clear();
        do {
            this.bypassSampleBuffer.clear();
            int source = readSource(formatHolder, this.bypassSampleBuffer, 0);
            if (source == -5) {
                onInputFormatChanged(formatHolder);
                return;
            }
            if (source == -4) {
                if (!this.bypassSampleBuffer.isEndOfStream()) {
                    this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, this.bypassSampleBuffer.timeUs);
                    if (hasReadStreamToEnd() || this.buffer.isLastSample()) {
                        getLastOutputStreamInfo().lastBufferTimeUs = this.largestQueuedPresentationTimeUs;
                    }
                    if (this.waitingForFirstSampleInFormat) {
                        Format format = this.inputFormat;
                        an.B(format);
                        this.outputFormat = format;
                        if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_OPUS) && !this.outputFormat.initializationData.isEmpty()) {
                            int preSkipSamples = OpusUtil.getPreSkipSamples(this.outputFormat.initializationData.get(0));
                            Format.Builder builderBuildUpon = this.outputFormat.buildUpon();
                            builderBuildUpon.setEncoderDelay(preSkipSamples);
                            this.outputFormat = builderBuildUpon.build();
                        }
                        onOutputFormatChanged(this.outputFormat, null);
                        this.waitingForFirstSampleInFormat = false;
                    }
                    this.bypassSampleBuffer.flip();
                    Format format2 = this.outputFormat;
                    if (format2 != null && Objects.equals(format2.sampleMimeType, MimeTypes.AUDIO_OPUS)) {
                        if (this.bypassSampleBuffer.hasSupplementalData()) {
                            DecoderInputBuffer decoderInputBuffer2 = this.bypassSampleBuffer;
                            decoderInputBuffer2.format = this.outputFormat;
                            handleInputBufferSupplementalData(decoderInputBuffer2);
                        }
                        long lastResetPositionUs = getLastResetPositionUs();
                        DecoderInputBuffer decoderInputBuffer3 = this.bypassSampleBuffer;
                        if (OpusUtil.needToDecodeOpusFrame(lastResetPositionUs, decoderInputBuffer3.timeUs)) {
                            this.oggOpusAudioPacketizer.packetize(decoderInputBuffer3, this.outputFormat.initializationData);
                        }
                    }
                    if (!haveBypassBatchBufferAndNewSampleSameDecodeOnlyState()) {
                        break;
                    }
                } else {
                    this.inputStreamEnded = true;
                    getLastOutputStreamInfo().lastBufferTimeUs = this.largestQueuedPresentationTimeUs;
                    return;
                }
            } else {
                if (source != -3) {
                    throw new IllegalStateException();
                }
                if (hasReadStreamToEnd()) {
                    getLastOutputStreamInfo().lastBufferTimeUs = this.largestQueuedPresentationTimeUs;
                    return;
                }
                return;
            }
        } while (this.bypassBatchBuffer.append(this.bypassSampleBuffer));
        this.bypassSampleBufferPending = true;
    }

    private boolean bypassRender(long j2, long j3) {
        boolean z;
        an.u(!this.outputStreamEnded);
        if (this.bypassBatchBuffer.hasSamples()) {
            BatchBuffer batchBuffer = this.bypassBatchBuffer;
            ByteBuffer byteBuffer = batchBuffer.data;
            int i2 = this.outputIndex;
            int sampleCount = batchBuffer.getSampleCount();
            long firstSampleTimeUs = batchBuffer.getFirstSampleTimeUs();
            boolean zIsDecodeOnly = isDecodeOnly(getLastResetPositionUs(), this.bypassBatchBuffer.getLastSampleTimeUs());
            boolean zIsEndOfStream = this.bypassBatchBuffer.isEndOfStream();
            Format format = this.outputFormat;
            an.B(format);
            z = false;
            if (!processOutputBuffer(j2, j3, null, byteBuffer, i2, 0, sampleCount, firstSampleTimeUs, zIsDecodeOnly, zIsEndOfStream, format)) {
                return false;
            }
            onProcessedOutputBuffer(this.bypassBatchBuffer.getLastSampleTimeUs());
            this.bypassBatchBuffer.clear();
        } else {
            z = false;
        }
        if (this.inputStreamEnded) {
            this.outputStreamEnded = true;
            return z;
        }
        if (this.bypassSampleBufferPending) {
            an.u(this.bypassBatchBuffer.append(this.bypassSampleBuffer));
            this.bypassSampleBufferPending = z;
        }
        if (this.bypassDrainAndReinitialize) {
            if (this.bypassBatchBuffer.hasSamples()) {
                return true;
            }
            disableBypass();
            this.bypassDrainAndReinitialize = z;
            maybeInitCodecOrBypass();
            if (!this.bypassEnabled) {
                return z;
            }
        }
        bypassRead();
        if (this.bypassBatchBuffer.hasSamples()) {
            this.bypassBatchBuffer.flip();
        }
        if (this.bypassBatchBuffer.hasSamples() || this.inputStreamEnded || this.bypassDrainAndReinitialize) {
            return true;
        }
        return z;
    }

    private void checkAndNotifyCodecParameterChanges(MediaFormat mediaFormat) {
        if (this.subscribedCodecParameterKeys.isEmpty()) {
            return;
        }
        CodecParameters codecParametersBuild = CodecParameters.createFrom(mediaFormat, this.subscribedCodecParameterKeys).build();
        if (codecParametersBuild.equals(this.lastDispatchedCodecParameters)) {
            return;
        }
        this.lastDispatchedCodecParameters = codecParametersBuild;
        onCodecParametersChanged(codecParametersBuild);
    }

    private int codecAdaptationWorkaroundMode(String str) {
        String str2 = MediaLibraryInfo.TAG;
        return 0;
    }

    private static boolean codecNeedsEosFlushWorkaround(String str) {
        String str2 = MediaLibraryInfo.TAG;
        return false;
    }

    private static boolean codecNeedsEosPropagationWorkaround(MediaCodecInfo mediaCodecInfo) {
        if (!MediaLibraryInfo.enableWorkarounds()) {
            return false;
        }
        String str = mediaCodecInfo.name;
        if (Build.VERSION.SDK_INT > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && mediaCodecInfo.secure;
        }
        return true;
    }

    private static boolean codecNeedsSosFlushWorkaround(String str) {
        return MediaLibraryInfo.enableWorkarounds() && Build.VERSION.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void disableBypass() {
        this.bypassEnabled = false;
        resetBypassState();
    }

    private boolean drainAndFlushCodec() {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (shouldReleaseCodecInsteadOfFlushing()) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 1;
        }
        return true;
    }

    private void drainAndReinitializeCodec() {
        if (!this.codecReceivedBuffers) {
            reinitializeCodec();
        } else {
            this.codecDrainState = 1;
            this.codecDrainAction = 3;
        }
    }

    private boolean drainAndUpdateCodecDrmSession() throws MediaCryptoException, ExoPlaybackException {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (shouldReleaseCodecInsteadOfFlushing()) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 2;
        } else {
            updateDrmSession();
        }
        return true;
    }

    private boolean drainOutputBuffer(long j2, long j3) throws MediaCryptoException, ExoPlaybackException {
        MediaCodecAdapter mediaCodecAdapter = this.codec;
        an.B(mediaCodecAdapter);
        if (!hasOutputBuffer()) {
            int iDequeueOutputBufferIndex = mediaCodecAdapter.dequeueOutputBufferIndex(this.outputBufferInfo);
            if (iDequeueOutputBufferIndex < 0) {
                if (iDequeueOutputBufferIndex == -2) {
                    processOutputMediaFormatChanged();
                    return true;
                }
                if (this.codecNeedsEosPropagation && (this.inputStreamEnded || this.codecDrainState == 2)) {
                    processEndOfStream();
                }
                long j4 = this.lastOutputBufferProcessedRealtimeMs;
                if (j4 != C.TIME_UNSET && j4 + 100 < getClock().currentTimeMillis()) {
                    processEndOfStream();
                }
                return false;
            }
            this.outputBufferInfo.presentationTimeUs -= this.skippedFlushOffsetUs;
            if (this.shouldSkipAdaptationWorkaroundOutputBuffer) {
                this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
                mediaCodecAdapter.releaseOutputBuffer(iDequeueOutputBufferIndex, false);
                return true;
            }
            if (this.outputBufferInfo.size == 0 && (this.outputBufferInfo.flags & 4) != 0) {
                processEndOfStream();
                return false;
            }
            this.outputIndex = iDequeueOutputBufferIndex;
            ByteBuffer outputBuffer = mediaCodecAdapter.getOutputBuffer(iDequeueOutputBufferIndex);
            this.outputBuffer = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.outputBufferInfo.offset);
                ByteBuffer byteBuffer = this.outputBuffer;
                MediaCodec.BufferInfo bufferInfo = this.outputBufferInfo;
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            }
            updateOutputFormatForTime(this.outputBufferInfo.presentationTimeUs);
        }
        boolean z = this.outputStreamInfo.isDurationStrict() && this.outputStreamInfo.durationUs != C.TIME_UNSET && this.outputBufferInfo.presentationTimeUs - getOutputStreamOffsetUs() >= this.outputStreamInfo.durationUs;
        this.isDecodeOnlyOutputBuffer = this.hasSkippedFlushAndWaitingForQueueInputBuffer || this.outputBufferInfo.presentationTimeUs < getLastResetPositionUs() || z;
        boolean z2 = (this.outputStreamInfo.lastBufferTimeUs == C.TIME_UNSET || this.outputStreamInfo.lastBufferTimeUs > this.outputBufferInfo.presentationTimeUs || z) ? false : true;
        ByteBuffer byteBuffer2 = this.outputBuffer;
        int i2 = this.outputIndex;
        MediaCodec.BufferInfo bufferInfo2 = this.outputBufferInfo;
        int i3 = bufferInfo2.flags;
        long j5 = bufferInfo2.presentationTimeUs;
        boolean z3 = this.isDecodeOnlyOutputBuffer;
        Format format = this.outputFormat;
        an.B(format);
        if (processOutputBuffer(j2, j3, mediaCodecAdapter, byteBuffer2, i2, i3, 1, j5, z3, z2, format)) {
            onProcessedOutputBuffer(this.outputBufferInfo.presentationTimeUs);
            boolean z4 = (this.outputBufferInfo.flags & 4) != 0;
            if (!z4 && this.codecReceivedEos && z2) {
                this.lastOutputBufferProcessedRealtimeMs = getClock().currentTimeMillis();
            }
            resetOutputBuffer();
            if (!z4) {
                return true;
            }
            processEndOfStream();
        }
        return false;
    }

    private boolean drmNeedsCodecReinitialization(MediaCodecInfo mediaCodecInfo, Format format, DrmSession drmSession, DrmSession drmSession2) {
        CryptoConfig cryptoConfig;
        CryptoConfig cryptoConfig2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (cryptoConfig = drmSession2.getCryptoConfig()) != null && (cryptoConfig2 = drmSession.getCryptoConfig()) != null && cryptoConfig.getClass().equals(cryptoConfig2.getClass())) {
            if (!(cryptoConfig instanceof FrameworkCryptoConfig)) {
                return false;
            }
            if (drmSession2.getSchemeUuid().equals(drmSession.getSchemeUuid()) && !C.PLAYREADY_UUID.equals(drmSession.getSchemeUuid()) && !C.PLAYREADY_UUID.equals(drmSession2.getSchemeUuid())) {
                if (mediaCodecInfo.secure) {
                    return false;
                }
                if (drmSession2.getState() != 2) {
                    if (drmSession2.getState() != 3 && drmSession2.getState() != 4) {
                        return false;
                    }
                    String str = format.sampleMimeType;
                    an.B(str);
                    if (!drmSession2.requiresSecureDecoder(str)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return true;
    }

    private boolean feedInputBuffer() throws MediaCryptoException, ExoPlaybackException {
        int i2;
        OutputStreamInfo lastOutputStreamInfo = getLastOutputStreamInfo();
        SampleStream stream = getStream();
        an.B(stream);
        lastOutputStreamInfo.streamFlags = stream.getFlags();
        if (this.codec == null || (i2 = this.codecDrainState) == 2 || this.inputStreamEnded) {
            return false;
        }
        if (i2 == 0 && shouldReinitCodec()) {
            drainAndReinitializeCodec();
        }
        MediaCodecAdapter mediaCodecAdapter = this.codec;
        an.B(mediaCodecAdapter);
        if (this.inputIndex < 0) {
            int iDequeueInputBufferIndex = mediaCodecAdapter.dequeueInputBufferIndex();
            this.inputIndex = iDequeueInputBufferIndex;
            if (iDequeueInputBufferIndex < 0) {
                return false;
            }
            this.buffer.data = mediaCodecAdapter.getInputBuffer(iDequeueInputBufferIndex);
            this.buffer.clear();
        }
        if (this.codecDrainState == 1) {
            if (!this.codecNeedsEosPropagation) {
                this.codecReceivedEos = true;
                mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                resetInputBuffer();
            }
            this.codecDrainState = 2;
            return false;
        }
        if (this.codecNeedsAdaptationWorkaroundBuffer) {
            this.codecNeedsAdaptationWorkaroundBuffer = false;
            ByteBuffer byteBuffer = this.buffer.data;
            an.B(byteBuffer);
            byte[] bArr = ADAPTATION_WORKAROUND_BUFFER;
            byteBuffer.put(bArr);
            mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, bArr.length, 0L, 0);
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            return true;
        }
        if (this.codecReconfigurationState == 1) {
            int i3 = 0;
            while (true) {
                Format format = this.codecInputFormat;
                an.B(format);
                if (i3 >= format.initializationData.size()) {
                    break;
                }
                byte[] bArr2 = this.codecInputFormat.initializationData.get(i3);
                ByteBuffer byteBuffer2 = this.buffer.data;
                an.B(byteBuffer2);
                byteBuffer2.put(bArr2);
                i3++;
            }
            this.codecReconfigurationState = 2;
        }
        ByteBuffer byteBuffer3 = this.buffer.data;
        an.B(byteBuffer3);
        int iPosition = byteBuffer3.position();
        final FormatHolder formatHolder = getFormatHolder();
        try {
            mediaCodecAdapter.useInputBuffer(new Runnable() { // from class: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$feedInputBuffer$0(formatHolder);
                }
            });
            int i4 = this.readDataResultHolder.get();
            if (i4 == -3) {
                if (hasReadStreamToEnd()) {
                    getLastOutputStreamInfo().lastBufferTimeUs = getLargestValidQueuedPresentationTimeUs();
                }
                return false;
            }
            if (i4 == -5) {
                if (this.codecReconfigurationState == 2) {
                    this.buffer.clear();
                    this.codecReconfigurationState = 1;
                }
                onInputFormatChanged(formatHolder);
                return true;
            }
            if (this.buffer.isEndOfStream()) {
                getLastOutputStreamInfo().lastBufferTimeUs = getLargestValidQueuedPresentationTimeUs();
                if (this.codecReconfigurationState == 2) {
                    this.buffer.clear();
                    this.codecReconfigurationState = 1;
                }
                this.inputStreamEnded = true;
                if (!this.codecReceivedBuffers) {
                    processEndOfStream();
                    return false;
                }
                if (!this.codecNeedsEosPropagation) {
                    this.codecReceivedEos = true;
                    mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                    resetInputBuffer();
                }
                return false;
            }
            if (!this.codecReceivedBuffers && !this.buffer.isKeyFrame()) {
                this.buffer.clear();
                this.decoderCounters.skippedInputBufferCount++;
                if (this.codecReconfigurationState == 2) {
                    this.codecReconfigurationState = 1;
                }
                return true;
            }
            DecoderInputBuffer decoderInputBuffer = this.buffer;
            long j2 = decoderInputBuffer.timeUs;
            if (shouldDiscardDecoderInputBuffer(decoderInputBuffer)) {
                return true;
            }
            boolean zIsEncrypted = this.buffer.isEncrypted();
            if (zIsEncrypted) {
                this.buffer.cryptoInfo.increaseClearDataFirstSubSampleBy(iPosition);
            }
            if (this.waitingForFirstSampleInFormat) {
                OutputStreamInfo lastOutputStreamInfo2 = getLastOutputStreamInfo();
                TimedValueQueue timedValueQueue = lastOutputStreamInfo2.formatQueue;
                Format format2 = this.inputFormat;
                an.B(format2);
                timedValueQueue.add(j2, format2);
                lastOutputStreamInfo2.queuedBufferAfterReset = true;
                this.waitingForFirstSampleInFormat = false;
            }
            this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, j2);
            long streamEndPositionUs = getStreamEndPositionUs();
            if (streamEndPositionUs == C.TIME_UNSET || j2 - getLastOutputStreamInfo().streamOffsetUs < streamEndPositionUs) {
                this.largestQueuedPresentationTimeWithinDurationUs = Math.max(this.largestQueuedPresentationTimeWithinDurationUs, j2);
            }
            if (hasReadStreamToEnd() || this.buffer.isLastSample()) {
                getLastOutputStreamInfo().lastBufferTimeUs = getLargestValidQueuedPresentationTimeUs();
            }
            this.buffer.flip();
            if (this.buffer.hasSupplementalData()) {
                handleInputBufferSupplementalData(this.buffer);
            }
            if (this.hasSkippedFlushAndWaitingForQueueInputBuffer) {
                long j3 = this.largestQueuedPresentationTimeUs;
                if (j2 <= j3) {
                    this.skippedFlushOffsetUs += (j3 - j2) + 1;
                }
                this.largestQueuedPresentationTimeUs = j2;
                this.largestQueuedPresentationTimeWithinDurationUs = j2;
                this.hasSkippedFlushAndWaitingForQueueInputBuffer = false;
            }
            onQueueInputBuffer(this.buffer);
            int codecBufferFlags = getCodecBufferFlags(this.buffer);
            long j4 = j2 + this.skippedFlushOffsetUs;
            if (zIsEncrypted) {
                mediaCodecAdapter.queueSecureInputBuffer(this.inputIndex, 0, this.buffer.cryptoInfo, j4, codecBufferFlags);
            } else {
                int i5 = this.inputIndex;
                ByteBuffer byteBuffer4 = this.buffer.data;
                an.B(byteBuffer4);
                mediaCodecAdapter.queueInputBuffer(i5, 0, byteBuffer4.limit(), j4, codecBufferFlags);
            }
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            this.codecReconfigurationState = 0;
            this.decoderCounters.queuedInputBufferCount++;
            return true;
        } catch (DecoderInputBuffer.InsufficientCapacityException e2) {
            onCodecError(e2);
            readSourceOmittingSampleData(0);
            flushCodec();
            return true;
        }
    }

    private void flushCodec() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            an.B(mediaCodecAdapter);
            mediaCodecAdapter.flush();
        } finally {
            resetCodecStateForFlush();
        }
    }

    private boolean flushOrReleaseCodec() {
        if (this.codec == null) {
            return false;
        }
        if (shouldReleaseCodecInsteadOfFlushing()) {
            releaseCodec();
            return true;
        }
        if (shouldFlushCodec()) {
            flushCodec();
            return false;
        }
        if (!this.codecReceivedBuffers) {
            return false;
        }
        this.hasSkippedFlushAndWaitingForQueueInputBuffer = true;
        return false;
    }

    private List<MediaCodecInfo> getAvailableCodecInfos(boolean z) {
        Format format = this.inputFormat;
        an.B(format);
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(this.mediaCodecSelector, format, z);
        if (!decoderInfos.isEmpty() || !z) {
            return decoderInfos;
        }
        List<MediaCodecInfo> decoderInfos2 = getDecoderInfos(this.mediaCodecSelector, format, false);
        if (!decoderInfos2.isEmpty()) {
            Log.w(TAG, "Drm session requires secure decoder for " + format.sampleMimeType + ", but no secure decoder available. Trying to proceed with " + String.valueOf(decoderInfos2) + ".");
        }
        return decoderInfos2;
    }

    private long getLargestValidQueuedPresentationTimeUs() {
        return getLastOutputStreamInfo().isDurationStrict() ? this.largestQueuedPresentationTimeWithinDurationUs : this.largestQueuedPresentationTimeUs;
    }

    private OutputStreamInfo getLastOutputStreamInfo() {
        return !this.pendingOutputStreamChanges.isEmpty() ? this.pendingOutputStreamChanges.getLast() : this.outputStreamInfo;
    }

    private boolean hasOutputBuffer() {
        return this.outputIndex >= 0;
    }

    private boolean haveBypassBatchBufferAndNewSampleSameDecodeOnlyState() {
        if (!this.bypassBatchBuffer.hasSamples()) {
            return true;
        }
        long lastResetPositionUs = getLastResetPositionUs();
        return isDecodeOnly(lastResetPositionUs, this.bypassBatchBuffer.getLastSampleTimeUs()) == isDecodeOnly(lastResetPositionUs, this.bypassSampleBuffer.timeUs);
    }

    private void initBypass(Format format) {
        disableBypass();
        String str = format.sampleMimeType;
        if ("audio/mp4a-latm".equals(str) || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
            this.bypassBatchBuffer.setMaxSampleCount(32);
        } else {
            this.bypassBatchBuffer.setMaxSampleCount(1);
        }
        this.bypassEnabled = true;
    }

    private void initCodec(MediaCodecInfo mediaCodecInfo, MediaCrypto mediaCrypto) {
        this.codecInfo = mediaCodecInfo;
        Format format = this.inputFormat;
        an.B(format);
        String str = mediaCodecInfo.name;
        float codecOperatingRateV23 = getCodecOperatingRateV23(this.targetPlaybackSpeed, format, getStreamFormats());
        if (codecOperatingRateV23 <= this.assumedMinimumCodecOperatingRate) {
            codecOperatingRateV23 = -1.0f;
        }
        long jElapsedRealtime = getClock().elapsedRealtime();
        MediaCodecAdapter.Configuration mediaCodecConfiguration = getMediaCodecConfiguration(mediaCodecInfo, format, mediaCrypto, codecOperatingRateV23);
        if (Build.VERSION.SDK_INT >= 31) {
            Api31.setLogSessionIdToMediaCodecFormat(mediaCodecConfiguration, getPlayerId());
        }
        try {
            TraceUtil.beginSection("createCodec:" + str);
            MediaCodecAdapter mediaCodecAdapterCreateAdapter = this.codecAdapterFactory.createAdapter(mediaCodecConfiguration);
            this.codec = mediaCodecAdapterCreateAdapter;
            this.codecRegisteredOnBufferAvailableListener = mediaCodecAdapterCreateAdapter.registerOnBufferAvailableListener(new MediaCodecRendererCodecAdapterListener());
            TraceUtil.endSection();
            long jElapsedRealtime2 = getClock().elapsedRealtime();
            if (!mediaCodecInfo.isFormatSupported(this.context, format)) {
                Log.w(TAG, Util.formatInvariant("Format exceeds selected codec's capabilities [%s, %s]", Format.toLogString(format), str));
            }
            this.codecOperatingRate = codecOperatingRateV23;
            this.codecInputFormat = format;
            codecAdaptationWorkaroundMode(str);
            this.codecAdaptationWorkaroundMode = 0;
            this.codecNeedsSosFlushWorkaround = codecNeedsSosFlushWorkaround(str);
            codecNeedsEosFlushWorkaround(str);
            this.codecNeedsEosFlushWorkaround = false;
            this.codecNeedsEosPropagation = codecNeedsEosPropagationWorkaround(mediaCodecInfo);
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            an.B(mediaCodecAdapter);
            if (mediaCodecAdapter.needsReconfiguration()) {
                this.codecReconfigured = true;
                this.codecReconfigurationState = 1;
                this.codecNeedsAdaptationWorkaroundBuffer = this.codecAdaptationWorkaroundMode != 0;
            }
            if (getState() == 2) {
                this.codecHotswapDeadlineMs = getClock().elapsedRealtime() + 1000;
            }
            this.decoderCounters.decoderInitCount++;
            long j2 = jElapsedRealtime2 - jElapsedRealtime;
            if (Build.VERSION.SDK_INT >= 31 && !this.subscribedCodecParameterKeys.isEmpty()) {
                MediaCodecAdapter codec = getCodec();
                an.B(codec);
                codec.subscribeToVendorParameters(new ArrayList(this.subscribedCodecParameterKeys));
            }
            onCodecInitialized(str, mediaCodecConfiguration, jElapsedRealtime2, j2);
        } catch (Throwable th) {
            TraceUtil.endSection();
            throw th;
        }
    }

    private boolean initMediaCryptoIfDrmSessionReady() throws ExoPlaybackException {
        an.u(this.mediaCrypto == null);
        DrmSession drmSession = this.codecDrmSession;
        CryptoConfig cryptoConfig = drmSession.getCryptoConfig();
        if (MediaLibraryInfo.enableWorkarounds() && FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC && (cryptoConfig instanceof FrameworkCryptoConfig)) {
            int state = drmSession.getState();
            if (state == 1) {
                DrmSession.DrmSessionException error = drmSession.getError();
                an.B(error);
                throw createRendererException(error, this.inputFormat, error.errorCode);
            }
            if (state != 4) {
                return false;
            }
        }
        if (cryptoConfig == null) {
            return drmSession.getError() != null;
        }
        if (cryptoConfig instanceof FrameworkCryptoConfig) {
            FrameworkCryptoConfig frameworkCryptoConfig = (FrameworkCryptoConfig) cryptoConfig;
            try {
                this.mediaCrypto = new MediaCrypto(frameworkCryptoConfig.uuid, frameworkCryptoConfig.sessionId);
            } catch (MediaCryptoException e2) {
                throw createRendererException(e2, this.inputFormat, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
            }
        }
        return true;
    }

    private boolean isDecodeOnly(long j2, long j3) {
        if (j3 >= j2) {
            return false;
        }
        Format format = this.outputFormat;
        return (format != null && Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_OPUS) && OpusUtil.needToDecodeOpusFrame(j2, j3)) ? false : true;
    }

    private static boolean isMediaCodecException(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$feedInputBuffer$0(FormatHolder formatHolder) {
        this.readDataResultHolder.set(readSource(formatHolder, this.buffer, 0));
    }

    private void maybeInitCodecWithFallback(MediaCrypto mediaCrypto, boolean z) throws DecoderInitializationException {
        Format format = this.inputFormat;
        an.B(format);
        if (this.availableCodecInfos == null) {
            try {
                List<MediaCodecInfo> availableCodecInfos = getAvailableCodecInfos(z);
                ArrayDeque<MediaCodecInfo> arrayDeque = new ArrayDeque<>();
                this.availableCodecInfos = arrayDeque;
                if (this.enableDecoderFallback) {
                    arrayDeque.addAll(availableCodecInfos);
                } else if (!availableCodecInfos.isEmpty()) {
                    this.availableCodecInfos.add(availableCodecInfos.get(0));
                }
                this.preferredDecoderInitializationException = null;
            } catch (MediaCodecUtil.DecoderQueryException e2) {
                throw new DecoderInitializationException(format, e2, z, -49998);
            }
        }
        if (this.availableCodecInfos.isEmpty()) {
            throw new DecoderInitializationException(format, (Throwable) null, z, -49999);
        }
        ArrayDeque<MediaCodecInfo> arrayDeque2 = this.availableCodecInfos;
        an.B(arrayDeque2);
        while (this.codec == null) {
            MediaCodecInfo mediaCodecInfoPeekFirst = arrayDeque2.peekFirst();
            an.B(mediaCodecInfoPeekFirst);
            if (!maybeInitializeProcessingPipeline(format) || !shouldInitCodec(mediaCodecInfoPeekFirst)) {
                return;
            }
            try {
                initCodec(mediaCodecInfoPeekFirst, mediaCrypto);
            } catch (Exception e3) {
                Log.w(TAG, "Failed to initialize decoder: ".concat(mediaCodecInfoPeekFirst.toString()), e3);
                arrayDeque2.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(format, e3, z, mediaCodecInfoPeekFirst);
                onCodecError(decoderInitializationException);
                DecoderInitializationException decoderInitializationException2 = this.preferredDecoderInitializationException;
                if (decoderInitializationException2 == null) {
                    this.preferredDecoderInitializationException = decoderInitializationException;
                } else {
                    this.preferredDecoderInitializationException = decoderInitializationException2.copyWithFallbackException(decoderInitializationException);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.preferredDecoderInitializationException;
                }
            }
        }
        this.availableCodecInfos = null;
    }

    private void processEndOfStream() throws MediaCryptoException, ExoPlaybackException {
        int i2 = this.codecDrainAction;
        if (i2 == 1) {
            flushCodec();
            return;
        }
        if (i2 == 2) {
            flushCodec();
            updateDrmSession();
        } else if (i2 == 3) {
            reinitializeCodec();
        } else {
            this.outputStreamEnded = true;
            renderToEndOfStream();
        }
    }

    private void processOutputMediaFormatChanged() {
        this.codecHasOutputMediaFormat = true;
        MediaCodecAdapter mediaCodecAdapter = this.codec;
        an.B(mediaCodecAdapter);
        MediaFormat outputFormat = mediaCodecAdapter.getOutputFormat();
        if (this.codecAdaptationWorkaroundMode != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.shouldSkipAdaptationWorkaroundOutputBuffer = true;
            return;
        }
        checkAndNotifyCodecParameterChanges(outputFormat);
        this.codecOutputMediaFormat = outputFormat;
        this.codecOutputMediaFormatChanged = true;
    }

    private boolean readSourceOmittingSampleData(int i2) throws MediaCryptoException, ExoPlaybackException {
        DecoderInputBuffer decoderInputBuffer = this.noDataBuffer;
        FormatHolder formatHolder = getFormatHolder();
        decoderInputBuffer.clear();
        int source = readSource(formatHolder, this.noDataBuffer, i2 | 4);
        if (source == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (source != -4 || !this.noDataBuffer.isEndOfStream()) {
            return false;
        }
        this.inputStreamEnded = true;
        processEndOfStream();
        return false;
    }

    private void reinitializeCodec() {
        releaseCodec();
        maybeInitCodecOrBypass();
    }

    private void resetBypassState() {
        resetCommonStateForFlush();
        this.bypassDrainAndReinitialize = false;
        this.bypassBatchBuffer.clear();
        this.bypassSampleBuffer.clear();
        this.bypassSampleBufferPending = false;
        this.oggOpusAudioPacketizer.reset();
    }

    private void resetCommonStateForFlush() {
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        this.largestQueuedPresentationTimeWithinDurationUs = C.TIME_UNSET;
        getLastOutputStreamInfo().lastBufferTimeUs = C.TIME_UNSET;
        this.lastProcessedOutputBufferTimeUs = C.TIME_UNSET;
    }

    private void resetInputBuffer() {
        this.inputIndex = -1;
        this.buffer.data = null;
    }

    private void resetOutputBuffer() {
        this.outputIndex = -1;
        this.outputBuffer = null;
    }

    private void setCodecDrmSession(DrmSession drmSession) {
        DrmSession.CC.replaceSession(this.codecDrmSession, drmSession);
        this.codecDrmSession = drmSession;
    }

    private void setOutputStreamInfo(OutputStreamInfo outputStreamInfo) {
        this.outputStreamInfo = outputStreamInfo;
        if (outputStreamInfo.streamOffsetUs != C.TIME_UNSET) {
            this.needToNotifyOutputFormatChangeAfterStreamChange = true;
            onOutputStreamOffsetUsChanged(outputStreamInfo.streamOffsetUs);
        }
    }

    private void setSourceDrmSession(DrmSession drmSession) {
        DrmSession.CC.replaceSession(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private boolean shouldContinueRendering(long j2) {
        return this.renderTimeLimitMs == C.TIME_UNSET || getClock().elapsedRealtime() - j2 < this.renderTimeLimitMs;
    }

    protected static boolean supportsFormatDrm(Format format) {
        int i2 = format.cryptoType;
        return i2 == 0 || i2 == 2;
    }

    private void updateCodecOperatingRate(Format format) {
        if (this.codec == null || this.codecDrainAction == 3 || getState() == 0) {
            return;
        }
        float f2 = this.targetPlaybackSpeed;
        an.B(format);
        float codecOperatingRateV23 = getCodecOperatingRateV23(f2, format, getStreamFormats());
        float f3 = this.codecOperatingRate;
        if (f3 == codecOperatingRateV23 || codecOperatingRateV23 == -1.0f) {
            return;
        }
        if (f3 != -1.0f || codecOperatingRateV23 > this.assumedMinimumCodecOperatingRate) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", codecOperatingRateV23);
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            an.B(mediaCodecAdapter);
            mediaCodecAdapter.setParameters(bundle);
            this.codecOperatingRate = codecOperatingRateV23;
        }
    }

    private void updateCodecSubscriptions(ci<String> ciVar) {
        if (this.subscribedCodecParameterKeys.equals(ciVar)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            HashSet hashSet = new HashSet(ciVar);
            HashSet hashSet2 = new HashSet();
            fu fuVarListIterator = this.subscribedCodecParameterKeys.listIterator();
            while (fuVarListIterator.hasNext()) {
                String str = (String) fuVarListIterator.next();
                if (!hashSet.remove(str)) {
                    hashSet2.add(str);
                }
            }
            MediaCodecAdapter codec = getCodec();
            if (codec != null) {
                if (!hashSet2.isEmpty()) {
                    codec.unsubscribeFromVendorParameters(new ArrayList(hashSet2));
                }
                if (!hashSet.isEmpty()) {
                    codec.subscribeToVendorParameters(new ArrayList(hashSet));
                }
            }
        }
        this.subscribedCodecParameterKeys = ciVar;
    }

    private void updateDrmSession() throws MediaCryptoException, ExoPlaybackException {
        DrmSession drmSession = this.sourceDrmSession;
        an.B(drmSession);
        CryptoConfig cryptoConfig = drmSession.getCryptoConfig();
        if (cryptoConfig instanceof FrameworkCryptoConfig) {
            try {
                MediaCrypto mediaCrypto = this.mediaCrypto;
                an.B(mediaCrypto);
                mediaCrypto.setMediaDrmSession(((FrameworkCryptoConfig) cryptoConfig).sessionId);
            } catch (MediaCryptoException e2) {
                throw createRendererException(e2, this.inputFormat, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
            }
        }
        setCodecDrmSession(this.sourceDrmSession);
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
    }

    protected final void applyCodecParametersToMediaFormat(MediaFormat mediaFormat) {
        this.activeCodecParameters.applyTo(mediaFormat);
    }

    protected DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format, Format format2, boolean z) {
        return new DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, 0, 1);
    }

    protected MediaCodecDecoderException createDecoderException(Throwable th, MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecDecoderException(th, mediaCodecInfo);
    }

    public void experimentalEnableProcessedStreamChangedAtStart() {
        this.experimentalEnableProcessedStreamChangedAtStart = true;
    }

    protected final boolean flushOrReinitializeCodec() {
        boolean zFlushOrReleaseCodec = flushOrReleaseCodec();
        if (zFlushOrReleaseCodec) {
            maybeInitCodecOrBypass();
        }
        return zFlushOrReleaseCodec;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final MediaCodecAdapter getCodec() {
        return this.codec;
    }

    protected int getCodecBufferFlags(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    protected final MediaCodecInfo getCodecInfo() {
        return this.codecInfo;
    }

    protected final Format getCodecInputFormat() {
        return this.codecInputFormat;
    }

    protected float getCodecOperatingRate() {
        return this.codecOperatingRate;
    }

    protected float getCodecOperatingRateV23(float f2, Format format, Format[] formatArr) {
        return -1.0f;
    }

    protected final MediaFormat getCodecOutputMediaFormat() {
        return this.codecOutputMediaFormat;
    }

    protected abstract List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z);

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final long getDurationToProgressUs(long j2, long j3) {
        return getDurationToProgressUs(j2, j3, this.codecRegisteredOnBufferAvailableListener);
    }

    protected long getLargestQueuedPresentationTimeUs() {
        return this.largestQueuedPresentationTimeUs;
    }

    protected long getLastBufferInStreamPresentationTimeUs() {
        return this.outputStreamInfo.lastBufferTimeUs;
    }

    protected final long getLastProcessedOutputBufferTimeUs() {
        return this.lastProcessedOutputBufferTimeUs;
    }

    protected abstract MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format, MediaCrypto mediaCrypto, float f2);

    protected final long getOutputStreamOffsetUs() {
        return this.outputStreamInfo.streamOffsetUs;
    }

    protected final long getOutputStreamStartPositionUs() {
        return this.outputStreamInfo.startPositionUs;
    }

    protected float getPlaybackSpeed() {
        return this.currentPlaybackSpeed;
    }

    protected long getSkippedFlushOffsetUs() {
        return this.skippedFlushOffsetUs;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Renderer.WakeupListener getWakeupListener() {
        return this.wakeupListener;
    }

    protected void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i2, Object obj) {
        if (i2 == 11) {
            Renderer.WakeupListener wakeupListener = (Renderer.WakeupListener) obj;
            an.B(wakeupListener);
            this.wakeupListener = wakeupListener;
        } else {
            if (i2 != 21) {
                if (i2 != 22) {
                    return;
                }
                an.B(obj);
                updateCodecSubscriptions((ci) obj);
                return;
            }
            an.B(obj);
            this.activeCodecParameters = (CodecParameters) obj;
            MediaCodecAdapter codec = getCodec();
            if (codec != null) {
                codec.setParameters(this.activeCodecParameters.toBundle());
            }
        }
    }

    protected final boolean isBypassEnabled() {
        return this.bypassEnabled;
    }

    protected final boolean isBypassPossible(Format format) {
        return this.sourceDrmSession == null && shouldUseBypass(format);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return isReadyForDecoding();
    }

    protected final boolean isReadyForDecoding() {
        if (this.inputFormat == null) {
            return false;
        }
        if (isSourceReady() || hasOutputBuffer()) {
            return true;
        }
        return this.codecHotswapDeadlineMs != C.TIME_UNSET && getClock().elapsedRealtime() < this.codecHotswapDeadlineMs;
    }

    protected final void maybeInitCodecOrBypass() {
        Format format;
        if (this.codec != null || this.bypassEnabled || (format = this.inputFormat) == null) {
            return;
        }
        if (isBypassPossible(format)) {
            initBypass(format);
            return;
        }
        setCodecDrmSession(this.sourceDrmSession);
        if (this.codecDrmSession == null || initMediaCryptoIfDrmSessionReady()) {
            try {
                DrmSession drmSession = this.codecDrmSession;
                boolean z = false;
                if (drmSession != null && (drmSession.getState() == 3 || this.codecDrmSession.getState() == 4)) {
                    DrmSession drmSession2 = this.codecDrmSession;
                    String str = format.sampleMimeType;
                    an.B(str);
                    if (drmSession2.requiresSecureDecoder(str)) {
                        z = true;
                    }
                }
                maybeInitCodecWithFallback(this.mediaCrypto, z);
            } catch (DecoderInitializationException e2) {
                throw createRendererException(e2, format, PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);
            }
        }
        MediaCrypto mediaCrypto = this.mediaCrypto;
        if (mediaCrypto == null || this.codec != null) {
            return;
        }
        mediaCrypto.release();
        this.mediaCrypto = null;
    }

    protected boolean maybeInitializeProcessingPipeline(Format format) {
        return true;
    }

    protected void onCodecError(Exception exc) {
    }

    protected void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j2, long j3) {
    }

    protected abstract void onCodecParametersChanged(CodecParameters codecParameters);

    protected void onCodecReleased(String str) {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        this.inputFormat = null;
        setOutputStreamInfo(OutputStreamInfo.UNSET);
        this.pendingOutputStreamChanges.clear();
        if (this.bypassEnabled) {
            disableBypass();
        } else {
            flushOrReleaseCodec();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onEnabled(boolean z, boolean z2) {
        this.decoderCounters = new DecoderCounters();
    }

    protected DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) {
        int i2;
        boolean z = true;
        this.waitingForFirstSampleInFormat = true;
        Format formatBuild = formatHolder.format;
        an.B(formatBuild);
        String str = formatBuild.sampleMimeType;
        if (str == null) {
            throw createRendererException(new IllegalArgumentException("Sample MIME type is null."), formatBuild, PlaybackException.ERROR_CODE_DECODING_FORMAT_UNSUPPORTED);
        }
        if ((Objects.equals(str, MimeTypes.VIDEO_AV1) || Objects.equals(formatBuild.sampleMimeType, MimeTypes.VIDEO_VP9) || (Objects.equals(formatBuild.sampleMimeType, MimeTypes.VIDEO_DOLBY_VISION) && Objects.equals(CodecSpecificDataUtil.getDolbyVisionBaseLayerMimeType(formatBuild), MimeTypes.VIDEO_AV1))) && !formatBuild.initializationData.isEmpty()) {
            Format.Builder builderBuildUpon = formatBuild.buildUpon();
            builderBuildUpon.setInitializationData(null);
            formatBuild = builderBuildUpon.build();
        }
        Format format = formatBuild;
        setSourceDrmSession(formatHolder.drmSession);
        this.inputFormat = format;
        if (this.bypassEnabled) {
            this.bypassDrainAndReinitialize = true;
            return null;
        }
        MediaCodecAdapter mediaCodecAdapter = this.codec;
        if (mediaCodecAdapter == null) {
            this.availableCodecInfos = null;
            maybeInitCodecOrBypass();
            return null;
        }
        MediaCodecInfo mediaCodecInfo = this.codecInfo;
        an.B(mediaCodecInfo);
        Format format2 = this.codecInputFormat;
        an.B(format2);
        if (drmNeedsCodecReinitialization(mediaCodecInfo, format, this.codecDrmSession, this.sourceDrmSession)) {
            drainAndReinitializeCodec();
            return new DecoderReuseEvaluation(mediaCodecInfo.name, format2, format, 0, 128);
        }
        DrmSession drmSession = this.sourceDrmSession;
        DrmSession drmSession2 = this.codecDrmSession;
        DecoderReuseEvaluation decoderReuseEvaluationCanReuseCodec = canReuseCodec(mediaCodecInfo, format2, format, getLastOutputStreamInfo().queuedBufferAfterReset);
        int i3 = decoderReuseEvaluationCanReuseCodec.result;
        if (i3 != 0) {
            i2 = 2;
            if (i3 == 1) {
                updateCodecOperatingRate(format);
                this.codecInputFormat = format;
                if (drmSession == drmSession2 ? drainAndFlushCodec() : drainAndUpdateCodecDrmSession()) {
                }
            } else if (i3 == 2) {
                updateCodecOperatingRate(format);
                this.codecReconfigured = true;
                this.codecReconfigurationState = 1;
                int i4 = this.codecAdaptationWorkaroundMode;
                if (i4 != 2 && (i4 != 1 || format.width != format2.width || format.height != format2.height)) {
                    z = false;
                }
                this.codecNeedsAdaptationWorkaroundBuffer = z;
                this.codecInputFormat = format;
                if (drmSession == drmSession2 || drainAndUpdateCodecDrmSession()) {
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException();
                }
                updateCodecOperatingRate(format);
                this.codecInputFormat = format;
                if (drmSession == drmSession2 || drainAndUpdateCodecDrmSession()) {
                }
            }
            return (decoderReuseEvaluationCanReuseCodec.result != 0 || (this.codec == mediaCodecAdapter && this.codecDrainAction != 3)) ? decoderReuseEvaluationCanReuseCodec : new DecoderReuseEvaluation(mediaCodecInfo.name, format2, format, 0, i2);
        }
        drainAndReinitializeCodec();
        i2 = 0;
        if (decoderReuseEvaluationCanReuseCodec.result != 0) {
        }
    }

    protected void onOutputFormatChanged(Format format, MediaFormat mediaFormat) {
    }

    protected void onOutputStreamOffsetUsChanged(long j2) {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j2, boolean z, boolean z2) {
        if (!this.pendingOutputStreamChanges.isEmpty()) {
            this.outputStreamInfo = this.pendingOutputStreamChanges.getLast();
        }
        this.pendingOutputStreamChanges.clear();
        if (z2) {
            this.inputStreamEnded = false;
            this.outputStreamEnded = false;
            this.pendingOutputEndOfStream = false;
            if (this.bypassEnabled) {
                resetBypassState();
            } else {
                flushOrReinitializeCodec();
            }
            if (this.outputStreamInfo.formatQueue.size() > 0) {
                this.waitingForFirstSampleInFormat = true;
            }
            this.outputStreamInfo.formatQueue.clear();
            this.outputStreamInfo.queuedBufferAfterReset = false;
        }
    }

    protected void onProcessedOutputBuffer(long j2) {
        this.lastProcessedOutputBufferTimeUs = Math.max(j2, this.lastProcessedOutputBufferTimeUs);
        while (!this.pendingOutputStreamChanges.isEmpty() && j2 >= this.pendingOutputStreamChanges.peek().previousStreamLastBufferTimeUs) {
            OutputStreamInfo outputStreamInfoPoll = this.pendingOutputStreamChanges.poll();
            an.B(outputStreamInfoPoll);
            setOutputStreamInfo(outputStreamInfoPoll);
            onProcessedStreamChange();
        }
    }

    protected void onProcessedStreamChange() {
    }

    protected void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onReset() {
        try {
            disableBypass();
            releaseCodec();
        } finally {
            setSourceDrmSession(null);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStarted() {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStopped() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r2 >= r0) goto L16;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onStreamChanged(androidx.media3.common.Format[] r14, long r15, long r17, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId r19) {
        /*
            r13 = this;
            long r7 = r13.getStreamEndPositionUs()
            androidx.media3.exoplayer.source.SampleStream r14 = r13.getStream()
            com.google.d.b.an.B(r14)
            r0 = r14
            androidx.media3.exoplayer.source.SampleStream r0 = (androidx.media3.exoplayer.source.SampleStream) r0
            int r9 = r14.getFlags()
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r14 = r13.outputStreamInfo
            long r0 = androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.OutputStreamInfo.m12708$$Nest$fgetstreamOffsetUs(r14)
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r14 != 0) goto L3a
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r0 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            r3 = r15
            r5 = r17
            r0.<init>(r1, r3, r5, r7, r9)
            r13.setOutputStreamInfo(r0)
            boolean r14 = r13.experimentalEnableProcessedStreamChangedAtStart
            if (r14 == 0) goto L70
            r13.onProcessedStreamChange()
            return
        L3a:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo> r14 = r13.pendingOutputStreamChanges
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L71
            long r0 = r13.largestQueuedPresentationTimeUs
            int r14 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r14 == 0) goto L52
            long r2 = r13.lastProcessedOutputBufferTimeUs
            int r14 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r14 == 0) goto L71
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 < 0) goto L71
        L52:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r0 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            r3 = r15
            r5 = r17
            r0.<init>(r1, r3, r5, r7, r9)
            r13.setOutputStreamInfo(r0)
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r14 = r13.outputStreamInfo
            long r0 = androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.OutputStreamInfo.m12708$$Nest$fgetstreamOffsetUs(r14)
            int r14 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r14 == 0) goto L70
            r13.onProcessedStreamChange()
        L70:
            return
        L71:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo> r14 = r13.pendingOutputStreamChanges
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r0 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo
            long r1 = r13.largestQueuedPresentationTimeUs
            r10 = 0
            r3 = r15
            r5 = r17
            r0.<init>(r1, r3, r5, r7, r9)
            r14.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.onStreamChanged(androidx.media3.common.Format[], long, long, androidx.media3.exoplayer.source.MediaSource$MediaPeriodId):void");
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onTimelineChanged(Timeline timeline) {
        getLastOutputStreamInfo().durationUs = getStreamEndPositionUs();
    }

    protected abstract boolean processOutputBuffer(long j2, long j3, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, Format format);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r3.mediaCrypto = null;
        setCodecDrmSession(null);
        resetCodecStateForRelease();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        throw r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void releaseCodec() {
        /*
            r3 = this;
            r0 = 0
            androidx.media3.exoplayer.mediacodec.MediaCodecAdapter r1 = r3.codec     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L1d
            r1.release()     // Catch: java.lang.Throwable -> L31
            androidx.media3.exoplayer.DecoderCounters r1 = r3.decoderCounters     // Catch: java.lang.Throwable -> L31
            int r2 = r1.decoderReleaseCount     // Catch: java.lang.Throwable -> L31
            int r2 = r2 + 1
            r1.decoderReleaseCount = r2     // Catch: java.lang.Throwable -> L31
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo r1 = r3.codecInfo     // Catch: java.lang.Throwable -> L31
            com.google.d.b.an.B(r1)     // Catch: java.lang.Throwable -> L31
            r2 = r1
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo r2 = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) r2     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r1.name     // Catch: java.lang.Throwable -> L31
            r3.onCodecReleased(r1)     // Catch: java.lang.Throwable -> L31
        L1d:
            r3.codec = r0
            android.media.MediaCrypto r1 = r3.mediaCrypto     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L26
            r1.release()     // Catch: java.lang.Throwable -> L2f
        L26:
            r3.mediaCrypto = r0
            r3.setCodecDrmSession(r0)
            r3.resetCodecStateForRelease()
            return
        L2f:
            r1 = move-exception
            goto L44
        L31:
            r1 = move-exception
            r3.codec = r0
            android.media.MediaCrypto r2 = r3.mediaCrypto     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L3b
            r2.release()     // Catch: java.lang.Throwable -> L2f
        L3b:
            r3.mediaCrypto = r0
            r3.setCodecDrmSession(r0)
            r3.resetCodecStateForRelease()
            throw r1
        L44:
            r3.mediaCrypto = r0
            r3.setCodecDrmSession(r0)
            r3.resetCodecStateForRelease()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.releaseCodec():void");
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j2, long j3) {
        boolean z = false;
        if (this.pendingOutputEndOfStream) {
            this.pendingOutputEndOfStream = false;
            processEndOfStream();
        }
        ExoPlaybackException exoPlaybackException = this.pendingPlaybackException;
        if (exoPlaybackException != null) {
            this.pendingPlaybackException = null;
            throw exoPlaybackException;
        }
        try {
            if (this.outputStreamEnded) {
                renderToEndOfStream();
                return;
            }
            if (this.inputFormat != null || readSourceOmittingSampleData(2)) {
                maybeInitCodecOrBypass();
                if (this.bypassEnabled) {
                    TraceUtil.beginSection("bypassRender");
                    while (bypassRender(j2, j3)) {
                    }
                    TraceUtil.endSection();
                } else if (this.codec != null) {
                    long jElapsedRealtime = getClock().elapsedRealtime();
                    TraceUtil.beginSection("drainAndFeed");
                    while (drainOutputBuffer(j2, j3) && shouldContinueRendering(jElapsedRealtime)) {
                    }
                    while (feedInputBuffer() && shouldContinueRendering(jElapsedRealtime)) {
                    }
                    TraceUtil.endSection();
                } else {
                    this.decoderCounters.skippedInputBufferCount += skipSource(j2);
                    readSourceOmittingSampleData(1);
                }
                this.decoderCounters.ensureUpdated();
            }
        } catch (MediaCodec.CryptoException e2) {
            throw createRendererException(e2, this.inputFormat, Util.getErrorCodeForMediaDrmErrorCode(e2.getErrorCode()));
        } catch (IllegalStateException e3) {
            if (!isMediaCodecException(e3)) {
                throw e3;
            }
            onCodecError(e3);
            if ((e3 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e3).isRecoverable()) {
                z = true;
            }
            if (z) {
                releaseCodec();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionCreateDecoderException = createDecoderException(e3, getCodecInfo());
            throw createRendererException(mediaCodecDecoderExceptionCreateDecoderException, this.inputFormat, z, mediaCodecDecoderExceptionCreateDecoderException.errorCode == 1101 ? PlaybackException.ERROR_CODE_DECODING_RESOURCES_RECLAIMED : PlaybackException.ERROR_CODE_DECODING_FAILED);
        }
    }

    protected void renderToEndOfStream() {
    }

    protected void resetCodecStateForFlush() {
        resetInputBuffer();
        resetOutputBuffer();
        resetCommonStateForFlush();
        this.codecHotswapDeadlineMs = C.TIME_UNSET;
        this.codecReceivedEos = false;
        this.lastOutputBufferProcessedRealtimeMs = C.TIME_UNSET;
        this.codecReceivedBuffers = false;
        this.codecNeedsAdaptationWorkaroundBuffer = false;
        this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
        this.isDecodeOnlyOutputBuffer = false;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.codecReconfigurationState = this.codecReconfigured ? 1 : 0;
        this.hasSkippedFlushAndWaitingForQueueInputBuffer = false;
        this.skippedFlushOffsetUs = 0L;
    }

    protected void resetCodecStateForRelease() {
        resetCodecStateForFlush();
        this.pendingPlaybackException = null;
        this.availableCodecInfos = null;
        this.codecInfo = null;
        this.codecInputFormat = null;
        this.codecOutputMediaFormat = null;
        this.codecOutputMediaFormatChanged = false;
        this.codecHasOutputMediaFormat = false;
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecNeedsSosFlushWorkaround = false;
        this.codecNeedsEosFlushWorkaround = false;
        this.codecNeedsEosPropagation = false;
        this.codecRegisteredOnBufferAvailableListener = false;
        this.codecReconfigured = false;
        this.codecReconfigurationState = 0;
    }

    protected final void setPendingOutputEndOfStream() {
        this.pendingOutputEndOfStream = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setPendingPlaybackException(ExoPlaybackException exoPlaybackException) {
        this.pendingPlaybackException = exoPlaybackException;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public void setPlaybackSpeed(float f2, float f3) {
        this.currentPlaybackSpeed = f2;
        this.targetPlaybackSpeed = f3;
        updateCodecOperatingRate(this.codecInputFormat);
    }

    public void setRenderTimeLimitMs(long j2) {
        this.renderTimeLimitMs = j2;
    }

    protected boolean shouldDiscardDecoderInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        if (!shouldSkipDecoderInputBuffer(decoderInputBuffer)) {
            return false;
        }
        decoderInputBuffer.clear();
        this.decoderCounters.skippedInputBufferCount++;
        return true;
    }

    protected boolean shouldFlushCodec() {
        return this.codecReceivedBuffers;
    }

    protected boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    protected boolean shouldReinitCodec() {
        return false;
    }

    protected boolean shouldReleaseCodecInsteadOfFlushing() throws MediaCryptoException {
        int i2 = this.codecDrainAction;
        if (i2 == 3 || ((this.codecNeedsSosFlushWorkaround && !this.codecHasOutputMediaFormat) || (this.codecNeedsEosFlushWorkaround && (this.codecReceivedEos || this.codecDrainState == 1)))) {
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        try {
            updateDrmSession();
            return false;
        } catch (ExoPlaybackException e2) {
            Log.w(TAG, "Failed to update the DRM session, releasing the codec instead.", e2);
            return true;
        }
    }

    protected boolean shouldSkipDecoderInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    protected boolean shouldUseBypass(Format format) {
        return false;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int supportsFormat(Format format) throws ExoPlaybackException {
        try {
            return supportsFormat(this.mediaCodecSelector, format);
        } catch (MediaCodecUtil.DecoderQueryException e2) {
            throw this.createRendererException(e2, format, PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED);
        }
    }

    protected abstract int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format);

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    protected final void updateOutputFormatForTime(long j2) {
        Format format = (Format) this.outputStreamInfo.formatQueue.pollFloor(j2);
        if (format == null && this.needToNotifyOutputFormatChangeAfterStreamChange && this.codecOutputMediaFormat != null) {
            format = (Format) this.outputStreamInfo.formatQueue.pollFirst();
        }
        if (format != null) {
            this.outputFormat = format;
        } else if (!this.codecOutputMediaFormatChanged || (format = this.outputFormat) == null) {
            return;
        }
        an.B(format);
        onOutputFormatChanged(format, this.codecOutputMediaFormat);
        this.codecOutputMediaFormatChanged = false;
        this.needToNotifyOutputFormatChangeAfterStreamChange = false;
    }

    protected long getDurationToProgressUs(long j2, long j3, boolean z) {
        return super.getDurationToProgressUs(j2, j3);
    }

    /* compiled from: WazeSource */
    public class DecoderInitializationException extends Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;
        public final MediaCodecInfo codecInfo;
        public final String diagnosticInfo;
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, Throwable th, boolean z, MediaCodecInfo mediaCodecInfo) {
            this("Decoder init failed: " + mediaCodecInfo.name + ", " + String.valueOf(format), th, format.sampleMimeType, z, mediaCodecInfo, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
        }

        private static String buildCustomDiagnosticInfo(int i2) {
            int iAbs = Math.abs(i2);
            StringBuilder sb = new StringBuilder("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_");
            sb.append(i2 < 0 ? "neg_" : "");
            sb.append(iAbs);
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DecoderInitializationException copyWithFallbackException(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }

        public DecoderInitializationException(Format format, Throwable th, boolean z, int i2) {
            this("Decoder init failed: [" + i2 + "], " + String.valueOf(format), th, format.sampleMimeType, z, null, buildCustomDiagnosticInfo(i2), null);
        }

        private DecoderInitializationException(String str, Throwable th, String str2, boolean z, MediaCodecInfo mediaCodecInfo, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = mediaCodecInfo;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }

    protected final void updateCodecOperatingRate() {
        updateCodecOperatingRate(this.codecInputFormat);
    }
}
