package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Timeline;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.work.WorkRequest;
import com.google.d.b.an;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class DecoderVideoRenderer extends BaseRenderer implements Decoder.Callback {
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "DecoderVideoRenderer";
    private final long allowedJoiningTimeMs;
    private int buffersInCodecCount;
    private int consecutiveDroppedFrameCount;
    private Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder;
    protected DecoderCounters decoderCounters;
    private DrmSession decoderDrmSession;
    private boolean decoderReceivedBuffers;
    private int decoderReinitializationState;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final VideoRendererEventListener.EventDispatcher eventDispatcher;
    private int firstFrameState;
    private final DecoderInputBuffer flagsOnlyBuffer;
    private final TimedValueQueue<Format> formatQueue;
    private VideoFrameMetadataListener frameMetadataListener;
    private long initialPositionUs;
    private DecoderInputBuffer inputBuffer;
    private Format inputFormat;
    private boolean inputStreamEnded;
    private long joiningDeadlineMs;
    private long largestQueuedPresentationTimeUs;
    private long lastRenderTimeUs;
    private final int maxDroppedFramesToNotify;
    private Object output;
    private VideoDecoderOutputBuffer outputBuffer;
    private VideoDecoderOutputBufferRenderer outputBufferRenderer;
    private Format outputFormat;
    private int outputMode;
    private boolean outputStreamEnded;
    private OutputStreamInfo outputStreamInfo;
    private Surface outputSurface;
    private final ArrayDeque<OutputStreamInfo> pendingOutputStreamChanges;
    private Executor playbackThreadExecutor;
    private VideoSize reportedVideoSize;
    private DrmSession sourceDrmSession;
    private boolean waitingForFirstSampleInFormat;
    private Renderer.WakeupListener wakeupListener;

    /* compiled from: WazeSource */
    final class OutputStreamInfo {
        private long durationUs;
        private final long previousStreamLastBufferTimeUs;
        private int streamFlags;
        private final long streamOffsetUs;

        private OutputStreamInfo(long j2, long j3, long j4, int i2) {
            this.previousStreamLastBufferTimeUs = j2;
            this.streamOffsetUs = j3;
            this.durationUs = j4;
            this.streamFlags = i2;
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
    @interface ReinitializationState {
    }

    protected DecoderVideoRenderer(long j2, Handler handler, VideoRendererEventListener videoRendererEventListener, int i2) {
        super(2);
        this.allowedJoiningTimeMs = j2;
        this.maxDroppedFramesToNotify = i2;
        this.joiningDeadlineMs = C.TIME_UNSET;
        this.formatQueue = new TimedValueQueue<>();
        this.pendingOutputStreamChanges = new ArrayDeque<>();
        this.flagsOnlyBuffer = DecoderInputBuffer.newNoDataInstance();
        this.eventDispatcher = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.decoderReinitializationState = 0;
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        this.outputMode = -1;
        this.firstFrameState = 0;
        this.decoderCounters = new DecoderCounters();
    }

    private boolean drainOutputBuffer(long j2, long j3) throws ExoPlaybackException {
        VideoDecoderOutputBuffer videoDecoderOutputBufferDequeueOutputBuffer = this.outputBuffer;
        if (videoDecoderOutputBufferDequeueOutputBuffer == null) {
            Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.decoder;
            an.B(decoder);
            videoDecoderOutputBufferDequeueOutputBuffer = decoder.dequeueOutputBuffer();
            this.outputBuffer = videoDecoderOutputBufferDequeueOutputBuffer;
            if (videoDecoderOutputBufferDequeueOutputBuffer == null) {
                return false;
            }
            this.decoderCounters.skippedOutputBufferCount += videoDecoderOutputBufferDequeueOutputBuffer.skippedOutputBufferCount;
            this.buffersInCodecCount -= videoDecoderOutputBufferDequeueOutputBuffer.skippedOutputBufferCount;
        }
        if (videoDecoderOutputBufferDequeueOutputBuffer.isEndOfStream()) {
            if (this.decoderReinitializationState == 2) {
                releaseDecoder();
                maybeInitDecoder();
            } else {
                this.outputBuffer.release();
                this.outputBuffer = null;
                this.outputStreamEnded = true;
            }
            return false;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.outputBuffer;
        an.B(videoDecoderOutputBuffer);
        long j4 = videoDecoderOutputBuffer.timeUs;
        boolean zProcessOutputBuffer = processOutputBuffer(j2, j3);
        if (zProcessOutputBuffer) {
            onProcessedOutputBuffer(j4);
            this.outputBuffer = null;
        }
        return zProcessOutputBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[PHI: r2
  0x003a: PHI (r2v5 androidx.media3.decoder.DecoderInputBuffer) = (r2v4 androidx.media3.decoder.DecoderInputBuffer), (r2v8 androidx.media3.decoder.DecoderInputBuffer) binds: [B:10:0x002d, B:12:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean feedInputBuffer() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.DecoderVideoRenderer.feedInputBuffer():boolean");
    }

    private OutputStreamInfo getLastOutputStreamInfo() {
        return !this.pendingOutputStreamChanges.isEmpty() ? this.pendingOutputStreamChanges.getLast() : this.outputStreamInfo;
    }

    private boolean hasOutput() {
        return this.outputMode != -1;
    }

    private static boolean isBufferLate(long j2) {
        return j2 < -30000;
    }

    private static boolean isBufferVeryLate(long j2) {
        return j2 < -500000;
    }

    private void lowerFirstFrameState(int i2) {
        this.firstFrameState = Math.min(this.firstFrameState, i2);
    }

    private void maybeInitDecoder() throws ExoPlaybackException {
        CryptoConfig cryptoConfig;
        if (this.decoder != null) {
            return;
        }
        setDecoderDrmSession(this.sourceDrmSession);
        DrmSession drmSession = this.decoderDrmSession;
        if (drmSession != null) {
            cryptoConfig = drmSession.getCryptoConfig();
            if (cryptoConfig == null && this.decoderDrmSession.getError() == null) {
                return;
            }
        } else {
            cryptoConfig = null;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.playbackThreadExecutor == null) {
                Looper looperMyLooper = Looper.myLooper();
                an.B(looperMyLooper);
                Looper looper = looperMyLooper;
                final Handler handler = new Handler(looperMyLooper);
                Objects.requireNonNull(handler);
                this.playbackThreadExecutor = new Executor() { // from class: androidx.media3.exoplayer.video.DecoderVideoRenderer$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handler.post(runnable);
                    }
                };
            }
            Format format = this.inputFormat;
            an.B(format);
            Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoderCreateDecoder = createDecoder(format, cryptoConfig);
            this.decoder = decoderCreateDecoder;
            decoderCreateDecoder.setOutputStartTimeUs(getLastResetPositionUs());
            this.decoder.setCallback(this, this.playbackThreadExecutor);
            setDecoderOutputMode(this.outputMode);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            VideoRendererEventListener.EventDispatcher eventDispatcher = this.eventDispatcher;
            Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.decoder;
            an.B(decoder);
            eventDispatcher.decoderInitialized(decoder.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.decoderCounters.decoderInitCount++;
        } catch (DecoderException e2) {
            Log.e(TAG, "Video codec error", e2);
            this.eventDispatcher.videoCodecError(e2);
            throw createRendererException(e2, this.inputFormat, PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);
        } catch (OutOfMemoryError e3) {
            throw createRendererException(e3, this.inputFormat, PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);
        }
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, jElapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = jElapsedRealtime;
        }
    }

    private void maybeNotifyRenderedFirstFrame() {
        if (this.firstFrameState != 3) {
            this.firstFrameState = 3;
            Object obj = this.output;
            if (obj != null) {
                this.eventDispatcher.renderedFirstFrame(obj);
            }
        }
    }

    private void maybeNotifyVideoSizeChanged(int i2, int i3) {
        VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null && videoSize.width == i2 && videoSize.height == i3) {
            return;
        }
        VideoSize videoSize2 = new VideoSize(i2, i3);
        this.reportedVideoSize = videoSize2;
        this.eventDispatcher.videoSizeChanged(videoSize2);
    }

    private void maybeRenotifyRenderedFirstFrame() {
        Object obj;
        if (this.firstFrameState != 3 || (obj = this.output) == null) {
            return;
        }
        this.eventDispatcher.renderedFirstFrame(obj);
    }

    private void maybeRenotifyVideoSizeChanged() {
        VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null) {
            this.eventDispatcher.videoSizeChanged(videoSize);
        }
    }

    private void onOutputChanged() {
        maybeRenotifyVideoSizeChanged();
        lowerFirstFrameState(1);
        if (getState() == 2) {
            setJoiningDeadlineMs();
        }
    }

    private void onOutputRemoved() {
        this.reportedVideoSize = null;
        lowerFirstFrameState(1);
    }

    private void onOutputReset() {
        maybeRenotifyVideoSizeChanged();
        maybeRenotifyRenderedFirstFrame();
    }

    private boolean processOutputBuffer(long j2, long j3) {
        if (this.initialPositionUs == C.TIME_UNSET) {
            this.initialPositionUs = j2;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.outputBuffer;
        an.B(videoDecoderOutputBuffer);
        long j4 = videoDecoderOutputBuffer.timeUs;
        long j5 = j4 - j2;
        if (!hasOutput()) {
            if (!isBufferLate(j5)) {
                return false;
            }
            skipOutputBuffer(videoDecoderOutputBuffer);
            return true;
        }
        an.B(this.outputStreamInfo);
        long j6 = j4 - this.outputStreamInfo.streamOffsetUs;
        if (this.outputStreamInfo.isDurationStrict() && this.outputStreamInfo.durationUs != C.TIME_UNSET && j6 >= this.outputStreamInfo.durationUs) {
            skipOutputBuffer(videoDecoderOutputBuffer);
            return true;
        }
        Format formatPollFloor = this.formatQueue.pollFloor(j4);
        if (formatPollFloor != null) {
            this.outputFormat = formatPollFloor;
        } else if (this.outputFormat == null) {
            this.outputFormat = this.formatQueue.pollFirst();
        }
        if (shouldForceRender(j5)) {
            Format format = this.outputFormat;
            an.B(format);
            renderOutputBuffer(videoDecoderOutputBuffer, j6, format);
            return true;
        }
        if (getState() != 2 || j2 == this.initialPositionUs) {
            return false;
        }
        if (shouldDropBuffersToKeyframe(j5, j3) && maybeDropBuffersToKeyframe(j2)) {
            return false;
        }
        if (shouldDropOutputBuffer(j5, j3)) {
            dropOutputBuffer(videoDecoderOutputBuffer);
            return true;
        }
        if (j5 >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            return false;
        }
        Format format2 = this.outputFormat;
        an.B(format2);
        renderOutputBuffer(videoDecoderOutputBuffer, j6, format2);
        return true;
    }

    private void setDecoderDrmSession(DrmSession drmSession) {
        DrmSession.CC.replaceSession(this.decoderDrmSession, drmSession);
        this.decoderDrmSession = drmSession;
    }

    private void setJoiningDeadlineMs() {
        long j2 = this.allowedJoiningTimeMs;
        this.joiningDeadlineMs = j2 > 0 ? SystemClock.elapsedRealtime() + j2 : C.TIME_UNSET;
    }

    private void setSourceDrmSession(DrmSession drmSession) {
        DrmSession.CC.replaceSession(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private boolean shouldForceRender(long j2) {
        boolean z = getState() == 2;
        int i2 = this.firstFrameState;
        if (i2 == 0) {
            return z;
        }
        if (i2 == 1) {
            return true;
        }
        if (i2 == 3) {
            return z && shouldForceRenderOutputBuffer(j2, Util.msToUs(SystemClock.elapsedRealtime()) - this.lastRenderTimeUs);
        }
        throw new IllegalStateException();
    }

    protected DecoderReuseEvaluation canReuseDecoder(String str, Format format, Format format2) {
        return new DecoderReuseEvaluation(str, format, format2, 0, 1);
    }

    protected abstract Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> createDecoder(Format format, CryptoConfig cryptoConfig);

    protected void dropOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        updateDroppedBufferCounters(0, 1);
        videoDecoderOutputBuffer.release();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public void enableMayRenderStartOfStream() {
        if (this.firstFrameState == 0) {
            this.firstFrameState = 1;
        }
    }

    protected void flushDecoder() throws ExoPlaybackException {
        this.buffersInCodecCount = 0;
        if (this.decoderReinitializationState != 0) {
            releaseDecoder();
            maybeInitDecoder();
            return;
        }
        this.inputBuffer = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.outputBuffer;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.outputBuffer = null;
        }
        Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.decoder;
        an.B(decoder);
        decoder.flush();
        decoder.setOutputStartTimeUs(getLastResetPositionUs());
        this.decoderReceivedBuffers = false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i2, Object obj) {
        if (i2 == 1) {
            setOutput(obj);
        } else if (i2 == 7) {
            this.frameMetadataListener = (VideoFrameMetadataListener) obj;
        } else if (i2 == 11) {
            this.wakeupListener = (Renderer.WakeupListener) obj;
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        if (this.inputFormat != null && ((isSourceReady() || this.outputBuffer != null) && (this.firstFrameState == 3 || !hasOutput()))) {
            this.joiningDeadlineMs = C.TIME_UNSET;
            return true;
        }
        if (this.joiningDeadlineMs == C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = C.TIME_UNSET;
        return false;
    }

    protected boolean maybeDropBuffersToKeyframe(long j2) throws ExoPlaybackException {
        int iSkipSource = skipSource(j2);
        if (iSkipSource == 0) {
            return false;
        }
        this.decoderCounters.droppedToKeyframeCount++;
        updateDroppedBufferCounters(iSkipSource, this.buffersInCodecCount);
        flushDecoder();
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        this.inputFormat = null;
        this.outputStreamInfo = null;
        this.pendingOutputStreamChanges.clear();
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        this.reportedVideoSize = null;
        lowerFirstFrameState(0);
        try {
            setSourceDrmSession(null);
            releaseDecoder();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onEnabled(boolean z, boolean z2) {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.decoderCounters = decoderCounters;
        this.eventDispatcher.enabled(decoderCounters);
        this.firstFrameState = z2 ? 1 : 0;
    }

    @Override // androidx.media3.decoder.Decoder.Callback
    public void onInputBufferAvailable() {
        Renderer.WakeupListener wakeupListener = this.wakeupListener;
        if (wakeupListener != null) {
            wakeupListener.onWakeup();
        }
    }

    protected void onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        DecoderReuseEvaluation decoderReuseEvaluationCanReuseDecoder;
        this.waitingForFirstSampleInFormat = true;
        Format format = formatHolder.format;
        an.B(format);
        setSourceDrmSession(formatHolder.drmSession);
        Format format2 = this.inputFormat;
        this.inputFormat = format;
        Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.decoder;
        if (decoder == null) {
            maybeInitDecoder();
            VideoRendererEventListener.EventDispatcher eventDispatcher = this.eventDispatcher;
            Format format3 = this.inputFormat;
            an.B(format3);
            eventDispatcher.inputFormatChanged(format3, null);
            return;
        }
        if (this.sourceDrmSession != this.decoderDrmSession) {
            String name = decoder.getName();
            an.B(format2);
            decoderReuseEvaluationCanReuseDecoder = new DecoderReuseEvaluation(name, format2, format, 0, 128);
        } else {
            String name2 = decoder.getName();
            an.B(format2);
            decoderReuseEvaluationCanReuseDecoder = canReuseDecoder(name2, format2, format);
        }
        if (decoderReuseEvaluationCanReuseDecoder.result == 0) {
            if (this.decoderReceivedBuffers) {
                this.decoderReinitializationState = 1;
            } else {
                releaseDecoder();
                maybeInitDecoder();
            }
        }
        VideoRendererEventListener.EventDispatcher eventDispatcher2 = this.eventDispatcher;
        Format format4 = this.inputFormat;
        an.B(format4);
        eventDispatcher2.inputFormatChanged(format4, decoderReuseEvaluationCanReuseDecoder);
    }

    @Override // androidx.media3.decoder.Decoder.Callback
    public void onOutputBufferAvailable() {
        Renderer.WakeupListener wakeupListener = this.wakeupListener;
        if (wakeupListener != null) {
            wakeupListener.onWakeup();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j2, boolean z, boolean z2) throws ExoPlaybackException {
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        if (!this.pendingOutputStreamChanges.isEmpty()) {
            this.outputStreamInfo = this.pendingOutputStreamChanges.getLast();
        }
        this.pendingOutputStreamChanges.clear();
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        lowerFirstFrameState(1);
        this.initialPositionUs = C.TIME_UNSET;
        this.consecutiveDroppedFrameCount = 0;
        if (this.decoder != null) {
            flushDecoder();
        }
        if (z) {
            setJoiningDeadlineMs();
        } else {
            this.joiningDeadlineMs = C.TIME_UNSET;
        }
        if (this.formatQueue.size() > 0) {
            this.waitingForFirstSampleInFormat = true;
        }
        this.formatQueue.clear();
    }

    protected void onProcessedOutputBuffer(long j2) {
        this.buffersInCodecCount--;
        while (!this.pendingOutputStreamChanges.isEmpty() && j2 >= this.pendingOutputStreamChanges.peek().previousStreamLastBufferTimeUs) {
            OutputStreamInfo outputStreamInfoPoll = this.pendingOutputStreamChanges.poll();
            an.B(outputStreamInfoPoll);
            this.outputStreamInfo = outputStreamInfoPoll;
        }
    }

    protected void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStarted() {
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = SystemClock.elapsedRealtime();
        this.lastRenderTimeUs = Util.msToUs(SystemClock.elapsedRealtime());
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStopped() {
        this.joiningDeadlineMs = C.TIME_UNSET;
        maybeNotifyDroppedFrames();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStreamChanged(Format[] formatArr, long j2, long j3, MediaSource.MediaPeriodId mediaPeriodId) {
        SampleStream stream = getStream();
        an.B(stream);
        int flags = stream.getFlags();
        if (this.outputStreamInfo != null && (!this.pendingOutputStreamChanges.isEmpty() || this.buffersInCodecCount != 0)) {
            this.pendingOutputStreamChanges.add(new OutputStreamInfo(this.largestQueuedPresentationTimeUs, j3, getStreamEndPositionUs(), flags));
        } else {
            this.outputStreamInfo = new OutputStreamInfo(C.TIME_UNSET, j3, getStreamEndPositionUs(), flags);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onTimelineChanged(Timeline timeline) {
        OutputStreamInfo lastOutputStreamInfo = getLastOutputStreamInfo();
        if (lastOutputStreamInfo != null) {
            lastOutputStreamInfo.durationUs = getStreamEndPositionUs();
        }
    }

    protected void releaseDecoder() {
        this.inputBuffer = null;
        this.outputBuffer = null;
        this.decoderReinitializationState = 0;
        this.decoderReceivedBuffers = false;
        this.buffersInCodecCount = 0;
        Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.decoder;
        if (decoder != null) {
            this.decoderCounters.decoderReleaseCount++;
            decoder.release();
            this.eventDispatcher.decoderReleased(this.decoder.getName());
            this.decoder = null;
        }
        setDecoderDrmSession(null);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j2, long j3) throws ExoPlaybackException {
        if (this.outputStreamEnded) {
            return;
        }
        if (this.inputFormat == null) {
            FormatHolder formatHolder = getFormatHolder();
            this.flagsOnlyBuffer.clear();
            int source = readSource(formatHolder, this.flagsOnlyBuffer, 2);
            if (source != -5) {
                if (source == -4) {
                    an.u(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    this.outputStreamEnded = true;
                    return;
                }
                return;
            }
            onInputFormatChanged(formatHolder);
        }
        maybeInitDecoder();
        if (this.decoder != null) {
            try {
                TraceUtil.beginSection("drainAndFeed");
                while (drainOutputBuffer(j2, j3)) {
                }
                while (feedInputBuffer()) {
                }
                TraceUtil.endSection();
                this.decoderCounters.ensureUpdated();
            } catch (DecoderException e2) {
                Log.e(TAG, "Video codec error", e2);
                this.eventDispatcher.videoCodecError(e2);
                throw createRendererException(e2, this.inputFormat, PlaybackException.ERROR_CODE_DECODING_FAILED);
            }
        }
    }

    protected void renderOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j2, Format format) {
        boolean z;
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j2, getClock().nanoTime(), format, null);
        }
        this.lastRenderTimeUs = Util.msToUs(SystemClock.elapsedRealtime());
        int i2 = videoDecoderOutputBuffer.mode;
        if (i2 != 1) {
            z = false;
        } else if (this.outputSurface != null) {
            i2 = 1;
            z = true;
        } else {
            z = false;
            i2 = 1;
        }
        boolean z2 = i2 == 0 && this.outputBufferRenderer != null;
        if (!z2 && !z) {
            dropOutputBuffer(videoDecoderOutputBuffer);
            return;
        }
        maybeNotifyVideoSizeChanged(videoDecoderOutputBuffer.width, videoDecoderOutputBuffer.height);
        if (z2) {
            VideoDecoderOutputBufferRenderer videoDecoderOutputBufferRenderer = this.outputBufferRenderer;
            an.B(videoDecoderOutputBufferRenderer);
            videoDecoderOutputBufferRenderer.setOutputBuffer(videoDecoderOutputBuffer);
        } else {
            Surface surface = this.outputSurface;
            an.B(surface);
            renderOutputBufferToSurface(videoDecoderOutputBuffer, surface);
        }
        this.consecutiveDroppedFrameCount = 0;
        this.decoderCounters.renderedOutputBufferCount++;
        maybeNotifyRenderedFirstFrame();
    }

    protected abstract void renderOutputBufferToSurface(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    protected abstract void setDecoderOutputMode(int i2);

    protected final void setOutput(Object obj) {
        int i2;
        if (obj instanceof Surface) {
            this.outputSurface = (Surface) obj;
            this.outputBufferRenderer = null;
            i2 = 1;
            this.outputMode = 1;
        } else if (obj instanceof VideoDecoderOutputBufferRenderer) {
            this.outputSurface = null;
            this.outputBufferRenderer = (VideoDecoderOutputBufferRenderer) obj;
            i2 = 0;
            this.outputMode = 0;
        } else {
            this.outputSurface = null;
            this.outputBufferRenderer = null;
            i2 = -1;
            this.outputMode = -1;
            obj = null;
        }
        if (this.output == obj) {
            if (obj != null) {
                onOutputReset();
                return;
            }
            return;
        }
        this.output = obj;
        if (obj == null) {
            onOutputRemoved();
            return;
        }
        if (this.decoder != null) {
            setDecoderOutputMode(i2);
        }
        onOutputChanged();
    }

    protected boolean shouldDropBuffersToKeyframe(long j2, long j3) {
        return isBufferVeryLate(j2);
    }

    protected boolean shouldDropOutputBuffer(long j2, long j3) {
        return isBufferLate(j2);
    }

    protected boolean shouldForceRenderOutputBuffer(long j2, long j3) {
        return isBufferLate(j2) && j3 > SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    protected void skipOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.decoderCounters.skippedOutputBufferCount++;
        videoDecoderOutputBuffer.release();
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
}
