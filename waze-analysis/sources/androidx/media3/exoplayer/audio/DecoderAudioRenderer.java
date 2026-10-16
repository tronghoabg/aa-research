package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.MediaClock;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.d.b.an;
import com.google.d.l.b;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class DecoderAudioRenderer<T extends Decoder<DecoderInputBuffer, ? extends SimpleDecoderOutputBuffer, ? extends DecoderException>> extends BaseRenderer implements MediaClock, Decoder.Callback {
    private static final int MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT = 10;
    private static final long READY_GRACE_PERIOD_MS = 100;
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "DecoderAudioRenderer";
    private boolean allowPositionDiscontinuity;
    private final AudioSink audioSink;
    private boolean audioTrackNeedsConfigure;
    private long currentPositionUs;
    private T decoder;
    private DecoderCounters decoderCounters;
    private DrmSession decoderDrmSession;
    private boolean decoderReceivedBuffers;
    private int decoderReinitializationState;
    private int encoderDelay;
    private int encoderPadding;
    private final AudioRendererEventListener.EventDispatcher eventDispatcher;
    private long firstNotReadyTimeMs;
    private boolean firstStreamSampleRead;
    private final DecoderInputBuffer flagsOnlyBuffer;
    private boolean hasBeenReady;
    private boolean hasPendingReportedSkippedSilence;
    private boolean hasReportedAudioPositionAdvancing;
    private DecoderInputBuffer inputBuffer;
    private Format inputFormat;
    private boolean inputStreamEnded;
    private boolean isStarted;
    private long largestQueuedPresentationTimeUs;
    private long lastBufferInStreamPresentationTimeUs;
    private long nextBufferToWritePresentationTimeUs;
    private SimpleDecoderOutputBuffer outputBuffer;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private int pendingOutputStreamOffsetCount;
    private final long[] pendingOutputStreamOffsetsUs;
    private Executor playbackThreadExecutor;
    private DrmSession sourceDrmSession;
    private Renderer.WakeupListener wakeupListener;

    /* compiled from: WazeSource */
    final class AudioSinkListener implements AudioSink.Listener {
        final /* synthetic */ DecoderAudioRenderer this$0;

        private AudioSinkListener(DecoderAudioRenderer decoderAudioRenderer) {
            Objects.requireNonNull(decoderAudioRenderer);
            this.this$0 = decoderAudioRenderer;
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioCapabilitiesChanged() {
            this.this$0.onRendererCapabilitiesChanged();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioSessionIdChanged(int i2) {
            this.this$0.eventDispatcher.audioSessionIdChanged(i2);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioSinkError(Exception exc) {
            Log.e(DecoderAudioRenderer.TAG, "Audio sink error", exc);
            this.this$0.eventDispatcher.audioSinkError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
            this.this$0.eventDispatcher.audioTrackInitialized(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
            this.this$0.eventDispatcher.audioTrackReleased(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public /* synthetic */ void onOffloadBufferEmptying() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public /* synthetic */ void onOffloadBufferFull() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onPositionAdvancing(long j2) {
            this.this$0.hasReportedAudioPositionAdvancing = true;
            this.this$0.eventDispatcher.positionAdvancing(j2);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onPositionDiscontinuity() {
            this.this$0.onPositionDiscontinuity();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onSilenceSkipped() {
            this.this$0.hasPendingReportedSkippedSilence = true;
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onSkipSilenceEnabledChanged(boolean z) {
            this.this$0.eventDispatcher.skipSilenceEnabledChanged(z);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onUnderrun(int i2, long j2, long j3) {
            this.this$0.eventDispatcher.underrun(i2, j2, j3);
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface ReinitializationState {
    }

    public DecoderAudioRenderer(Handler handler, AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        super(1);
        this.eventDispatcher = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
        this.audioSink = audioSink;
        this.flagsOnlyBuffer = DecoderInputBuffer.newNoDataInstance();
        this.decoderReinitializationState = 0;
        this.audioTrackNeedsConfigure = true;
        setOutputStreamOffsetUs(C.TIME_UNSET);
        this.pendingOutputStreamOffsetsUs = new long[10];
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        this.lastBufferInStreamPresentationTimeUs = C.TIME_UNSET;
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        this.firstNotReadyTimeMs = C.TIME_UNSET;
        this.hasBeenReady = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean drainOutputBuffer() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DecoderAudioRenderer.drainOutputBuffer():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[PHI: r2
  0x001f: PHI (r2v3 androidx.media3.decoder.DecoderInputBuffer) = (r2v2 androidx.media3.decoder.DecoderInputBuffer), (r2v11 androidx.media3.decoder.DecoderInputBuffer) binds: [B:10:0x0012, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean feedInputBuffer() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r6 = this;
            T extends androidx.media3.decoder.Decoder<androidx.media3.decoder.DecoderInputBuffer, ? extends androidx.media3.decoder.SimpleDecoderOutputBuffer, ? extends androidx.media3.decoder.DecoderException> r0 = r6.decoder
            r1 = 0
            if (r0 == 0) goto Lb4
            int r2 = r6.decoderReinitializationState
            r3 = 2
            if (r2 == r3) goto Lb4
            boolean r2 = r6.inputStreamEnded
            if (r2 == 0) goto L10
            goto Lb4
        L10:
            androidx.media3.decoder.DecoderInputBuffer r2 = r6.inputBuffer
            if (r2 != 0) goto L1f
            java.lang.Object r0 = r0.dequeueInputBuffer()
            r2 = r0
            androidx.media3.decoder.DecoderInputBuffer r2 = (androidx.media3.decoder.DecoderInputBuffer) r2
            r6.inputBuffer = r2
            if (r2 == 0) goto Lb4
        L1f:
            int r0 = r6.decoderReinitializationState
            r4 = 0
            r5 = 1
            if (r0 != r5) goto L35
            r0 = 4
            r2.setFlags(r0)
            T extends androidx.media3.decoder.Decoder<androidx.media3.decoder.DecoderInputBuffer, ? extends androidx.media3.decoder.SimpleDecoderOutputBuffer, ? extends androidx.media3.decoder.DecoderException> r0 = r6.decoder
            androidx.media3.decoder.DecoderInputBuffer r2 = r6.inputBuffer
            r0.queueInputBuffer(r2)
            r6.inputBuffer = r4
            r6.decoderReinitializationState = r3
            return r1
        L35:
            androidx.media3.exoplayer.FormatHolder r0 = r6.getFormatHolder()
            androidx.media3.decoder.DecoderInputBuffer r2 = r6.inputBuffer
            int r2 = r6.readSource(r0, r2, r1)
            r3 = -5
            if (r2 == r3) goto Lb0
            r0 = -4
            if (r2 == r0) goto L59
            r0 = -3
            if (r2 != r0) goto L53
            boolean r0 = r6.hasReadStreamToEnd()
            if (r0 == 0) goto Lb4
            long r2 = r6.largestQueuedPresentationTimeUs
            r6.lastBufferInStreamPresentationTimeUs = r2
            goto Lb4
        L53:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L59:
            androidx.media3.decoder.DecoderInputBuffer r0 = r6.inputBuffer
            boolean r0 = r0.isEndOfStream()
            if (r0 == 0) goto L71
            r6.inputStreamEnded = r5
            long r2 = r6.largestQueuedPresentationTimeUs
            r6.lastBufferInStreamPresentationTimeUs = r2
            T extends androidx.media3.decoder.Decoder<androidx.media3.decoder.DecoderInputBuffer, ? extends androidx.media3.decoder.SimpleDecoderOutputBuffer, ? extends androidx.media3.decoder.DecoderException> r0 = r6.decoder
            androidx.media3.decoder.DecoderInputBuffer r2 = r6.inputBuffer
            r0.queueInputBuffer(r2)
            r6.inputBuffer = r4
            return r1
        L71:
            boolean r0 = r6.firstStreamSampleRead
            if (r0 != 0) goto L7e
            r6.firstStreamSampleRead = r5
            androidx.media3.decoder.DecoderInputBuffer r0 = r6.inputBuffer
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0.addFlag(r1)
        L7e:
            androidx.media3.decoder.DecoderInputBuffer r0 = r6.inputBuffer
            long r1 = r0.timeUs
            r6.largestQueuedPresentationTimeUs = r1
            boolean r1 = r6.hasReadStreamToEnd()
            if (r1 != 0) goto L90
            boolean r0 = r0.isLastSample()
            if (r0 == 0) goto L94
        L90:
            long r0 = r6.largestQueuedPresentationTimeUs
            r6.lastBufferInStreamPresentationTimeUs = r0
        L94:
            androidx.media3.decoder.DecoderInputBuffer r0 = r6.inputBuffer
            r0.flip()
            androidx.media3.decoder.DecoderInputBuffer r0 = r6.inputBuffer
            androidx.media3.common.Format r1 = r6.inputFormat
            r0.format = r1
            T extends androidx.media3.decoder.Decoder<androidx.media3.decoder.DecoderInputBuffer, ? extends androidx.media3.decoder.SimpleDecoderOutputBuffer, ? extends androidx.media3.decoder.DecoderException> r1 = r6.decoder
            r1.queueInputBuffer(r0)
            r6.decoderReceivedBuffers = r5
            androidx.media3.exoplayer.DecoderCounters r0 = r6.decoderCounters
            int r1 = r0.queuedInputBufferCount
            int r1 = r1 + r5
            r0.queuedInputBufferCount = r1
            r6.inputBuffer = r4
            return r5
        Lb0:
            r6.onInputFormatChanged(r0)
            return r5
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DecoderAudioRenderer.feedInputBuffer():boolean");
    }

    private void flushDecoder() throws ExoPlaybackException {
        if (this.decoderReinitializationState != 0) {
            releaseDecoder();
            maybeInitDecoder();
            return;
        }
        this.inputBuffer = null;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.outputBuffer;
        if (simpleDecoderOutputBuffer != null) {
            simpleDecoderOutputBuffer.release();
            this.outputBuffer = null;
        }
        T t = this.decoder;
        an.B(t);
        t.flush();
        t.setOutputStartTimeUs(getLastResetPositionUs());
        this.decoderReceivedBuffers = false;
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
            if (this.playbackThreadExecutor == null) {
                final Handler handler = new Handler(Looper.myLooper());
                Objects.requireNonNull(handler);
                this.playbackThreadExecutor = new Executor() { // from class: androidx.media3.exoplayer.audio.DecoderAudioRenderer$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handler.post(runnable);
                    }
                };
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            TraceUtil.beginSection("createAudioDecoder");
            T t = (T) createDecoder(this.inputFormat, cryptoConfig);
            this.decoder = t;
            t.setOutputStartTimeUs(getLastResetPositionUs());
            this.decoder.setCallback(this, this.playbackThreadExecutor);
            TraceUtil.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.eventDispatcher.decoderInitialized(this.decoder.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.decoderCounters.decoderInitCount++;
        } catch (DecoderException e2) {
            Log.e(TAG, "Audio codec error", e2);
            this.eventDispatcher.audioCodecError(e2);
            throw createRendererException(e2, this.inputFormat, PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);
        } catch (OutOfMemoryError e3) {
            throw createRendererException(e3, this.inputFormat, PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);
        }
    }

    private void onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        Format format = formatHolder.format;
        an.B(format);
        setSourceDrmSession(formatHolder.drmSession);
        Format format2 = this.inputFormat;
        this.inputFormat = format;
        this.encoderDelay = format.encoderDelay;
        this.encoderPadding = format.encoderPadding;
        T t = this.decoder;
        if (t == null) {
            maybeInitDecoder();
            this.eventDispatcher.inputFormatChanged(this.inputFormat, null);
            return;
        }
        DecoderReuseEvaluation decoderReuseEvaluation = this.sourceDrmSession != this.decoderDrmSession ? new DecoderReuseEvaluation(t.getName(), format2, format, 0, 128) : canReuseDecoder(t.getName(), format2, format);
        if (decoderReuseEvaluation.result == 0) {
            if (this.decoderReceivedBuffers) {
                this.decoderReinitializationState = 1;
            } else {
                releaseDecoder();
                maybeInitDecoder();
                this.audioTrackNeedsConfigure = true;
            }
        }
        this.eventDispatcher.inputFormatChanged(this.inputFormat, decoderReuseEvaluation);
    }

    private void processEndOfStream() {
        this.outputStreamEnded = true;
        this.audioSink.playToEndOfStream();
        this.nextBufferToWritePresentationTimeUs = this.lastBufferInStreamPresentationTimeUs;
    }

    private void processFirstSampleOfStream() {
        this.audioSink.handleDiscontinuity();
        if (this.pendingOutputStreamOffsetCount != 0) {
            setOutputStreamOffsetUs(this.pendingOutputStreamOffsetsUs[0]);
            int i2 = this.pendingOutputStreamOffsetCount - 1;
            this.pendingOutputStreamOffsetCount = i2;
            long[] jArr = this.pendingOutputStreamOffsetsUs;
            System.arraycopy(jArr, 1, jArr, 0, i2);
        }
    }

    private void releaseDecoder() {
        this.inputBuffer = null;
        this.outputBuffer = null;
        this.decoderReinitializationState = 0;
        this.decoderReceivedBuffers = false;
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        this.lastBufferInStreamPresentationTimeUs = C.TIME_UNSET;
        T t = this.decoder;
        if (t != null) {
            this.decoderCounters.decoderReleaseCount++;
            t.release();
            this.eventDispatcher.decoderReleased(this.decoder.getName());
            this.decoder = null;
        }
        setDecoderDrmSession(null);
    }

    private void setDecoderDrmSession(DrmSession drmSession) {
        DrmSession.CC.replaceSession(this.decoderDrmSession, drmSession);
        this.decoderDrmSession = drmSession;
    }

    private void setOutputStreamOffsetUs(long j2) {
        this.outputStreamOffsetUs = j2;
        if (j2 != C.TIME_UNSET) {
            this.audioSink.setOutputStreamOffsetUs(j2);
        }
    }

    private void setSourceDrmSession(DrmSession drmSession) {
        DrmSession.CC.replaceSession(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private void updateCurrentPosition() {
        long currentPositionUs = this.audioSink.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.allowPositionDiscontinuity) {
                currentPositionUs = Math.max(this.currentPositionUs, currentPositionUs);
            }
            this.currentPositionUs = currentPositionUs;
            this.allowPositionDiscontinuity = false;
        }
    }

    protected DecoderReuseEvaluation canReuseDecoder(String str, Format format, Format format2) {
        return new DecoderReuseEvaluation(str, format, format2, 0, 1);
    }

    protected abstract T createDecoder(Format format, CryptoConfig cryptoConfig);

    protected b getChannelMapping(T t) {
        return null;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public long getDurationToProgressUs(long j2, long j3) {
        boolean z = false;
        if (this.audioSink.hasPendingData() && this.nextBufferToWritePresentationTimeUs != C.TIME_UNSET) {
            z = true;
        }
        if (!this.isStarted) {
            return (z || this.outputStreamEnded) ? 1000000L : 10000L;
        }
        long audioTrackBufferSizeUs = this.audioSink.getAudioTrackBufferSizeUs();
        if (this.hasReportedAudioPositionAdvancing && z && audioTrackBufferSizeUs != C.TIME_UNSET) {
            return Math.max(10000L, (long) ((Math.min(audioTrackBufferSizeUs, this.nextBufferToWritePresentationTimeUs - j2) / (getPlaybackParameters() != null ? getPlaybackParameters().speed : 1.0f)) / 2.0f));
        }
        return 10000L;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public MediaClock getMediaClock() {
        return this;
    }

    protected abstract Format getOutputFormat(T t);

    @Override // androidx.media3.exoplayer.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return this.audioSink.getPlaybackParameters();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public long getPositionUs() {
        if (getState() == 2) {
            updateCurrentPosition();
        }
        return this.currentPositionUs;
    }

    protected final int getSinkFormatSupport(Format format) {
        return this.audioSink.getFormatSupport(format);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i2, Object obj) {
        if (i2 == 2) {
            this.audioSink.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i2 == 3) {
            this.audioSink.setAudioAttributes((AudioAttributes) obj);
            return;
        }
        if (i2 == 6) {
            this.audioSink.setAuxEffectInfo((AuxEffectInfo) obj);
            return;
        }
        if (i2 == 19) {
            AudioSink audioSink = this.audioSink;
            an.B(obj);
            audioSink.setVirtualDeviceId(((Integer) obj).intValue());
        } else {
            if (i2 == 20) {
                AudioSink audioSink2 = this.audioSink;
                an.B(obj);
                audioSink2.setAudioOutputProvider((AudioOutputProvider) obj);
                return;
            }
            switch (i2) {
                case 9:
                    this.audioSink.setSkipSilenceEnabled(((Boolean) obj).booleanValue());
                    break;
                case 10:
                    this.audioSink.setAudioSessionId(((Integer) obj).intValue());
                    break;
                case 11:
                    this.wakeupListener = (Renderer.WakeupListener) obj;
                    break;
                case 12:
                    this.audioSink.setPreferredDevice((AudioDeviceInfo) obj);
                    break;
            }
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public boolean hasSkippedSilenceSinceLastCall() {
        boolean z = this.hasPendingReportedSkippedSilence;
        this.hasPendingReportedSkippedSilence = false;
        return z;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded && this.audioSink.isEnded();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        if (this.audioSink.hasPendingData()) {
            this.firstNotReadyTimeMs = C.TIME_UNSET;
            this.hasBeenReady = true;
            return true;
        }
        if (!this.hasBeenReady || !this.isStarted || !isSourceReady() || hasReadStreamToEnd()) {
            return false;
        }
        long jElapsedRealtime = getClock().elapsedRealtime();
        long j2 = this.firstNotReadyTimeMs;
        if (j2 != C.TIME_UNSET) {
            return jElapsedRealtime - j2 < READY_GRACE_PERIOD_MS;
        }
        this.firstNotReadyTimeMs = jElapsedRealtime;
        return true;
    }

    protected final boolean isReadyForDecoding() {
        if (this.inputFormat != null) {
            return isSourceReady() || this.outputBuffer != null;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        this.inputFormat = null;
        this.audioTrackNeedsConfigure = true;
        setOutputStreamOffsetUs(C.TIME_UNSET);
        this.hasPendingReportedSkippedSilence = false;
        this.hasReportedAudioPositionAdvancing = false;
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        try {
            setSourceDrmSession(null);
            releaseDecoder();
            this.audioSink.reset();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onEnabled(boolean z, boolean z2) {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.decoderCounters = decoderCounters;
        this.eventDispatcher.enabled(decoderCounters);
        boolean z3 = getConfiguration().tunneling;
        AudioSink audioSink = this.audioSink;
        if (z3) {
            audioSink.enableTunnelingV21();
        } else {
            audioSink.disableTunneling();
        }
        this.audioSink.setPlayerId(getPlayerId());
        this.audioSink.setClock(getClock());
        this.audioSink.setListener(new AudioSinkListener());
    }

    @Override // androidx.media3.decoder.Decoder.Callback
    public void onInputBufferAvailable() {
        Renderer.WakeupListener wakeupListener = this.wakeupListener;
        if (wakeupListener != null) {
            wakeupListener.onWakeup();
        }
    }

    @Override // androidx.media3.decoder.Decoder.Callback
    public void onOutputBufferAvailable() {
        Renderer.WakeupListener wakeupListener = this.wakeupListener;
        if (wakeupListener != null) {
            wakeupListener.onWakeup();
        }
    }

    protected void onPositionDiscontinuity() {
        this.allowPositionDiscontinuity = true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j2, boolean z, boolean z2) throws ExoPlaybackException {
        this.audioSink.flush();
        this.currentPositionUs = j2;
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        this.firstNotReadyTimeMs = C.TIME_UNSET;
        this.hasBeenReady = false;
        this.hasPendingReportedSkippedSilence = false;
        this.hasReportedAudioPositionAdvancing = false;
        this.allowPositionDiscontinuity = true;
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        if (this.decoder != null) {
            flushDecoder();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStarted() {
        this.audioSink.play();
        this.isStarted = true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStopped() {
        updateCurrentPosition();
        this.audioSink.pause();
        this.isStarted = false;
        this.hasReportedAudioPositionAdvancing = false;
        this.firstNotReadyTimeMs = C.TIME_UNSET;
        this.hasBeenReady = false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStreamChanged(Format[] formatArr, long j2, long j3, MediaSource.MediaPeriodId mediaPeriodId) {
        this.firstStreamSampleRead = false;
        if (this.outputStreamOffsetUs == C.TIME_UNSET) {
            setOutputStreamOffsetUs(j3);
            return;
        }
        int i2 = this.pendingOutputStreamOffsetCount;
        long[] jArr = this.pendingOutputStreamOffsetsUs;
        if (i2 == jArr.length) {
            Log.w(TAG, "Too many stream changes, so dropping offset: " + jArr[i2 - 1]);
        } else {
            this.pendingOutputStreamOffsetCount = i2 + 1;
        }
        this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1] = j3;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j2, long j3) throws ExoPlaybackException {
        if (this.outputStreamEnded) {
            try {
                this.audioSink.playToEndOfStream();
                this.nextBufferToWritePresentationTimeUs = this.lastBufferInStreamPresentationTimeUs;
                return;
            } catch (AudioSink.WriteException e2) {
                throw createRendererException(e2, e2.format, e2.isRecoverable, 5002);
            }
        }
        if (this.inputFormat == null) {
            FormatHolder formatHolder = getFormatHolder();
            this.flagsOnlyBuffer.clear();
            int source = readSource(formatHolder, this.flagsOnlyBuffer, 2);
            if (source != -5) {
                if (source == -4) {
                    an.u(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    try {
                        processEndOfStream();
                        return;
                    } catch (AudioSink.WriteException e3) {
                        throw createRendererException(e3, null, 5002);
                    }
                }
                return;
            }
            onInputFormatChanged(formatHolder);
        }
        maybeInitDecoder();
        if (this.decoder != null) {
            try {
                TraceUtil.beginSection("drainAndFeed");
                while (drainOutputBuffer()) {
                }
                while (feedInputBuffer()) {
                }
                TraceUtil.endSection();
                this.decoderCounters.ensureUpdated();
            } catch (DecoderException e4) {
                Log.e(TAG, "Audio codec error", e4);
                this.eventDispatcher.audioCodecError(e4);
                throw createRendererException(e4, this.inputFormat, PlaybackException.ERROR_CODE_DECODING_FAILED);
            } catch (AudioSink.ConfigurationException e5) {
                throw createRendererException(e5, e5.format, 5001);
            } catch (AudioSink.InitializationException e6) {
                throw createRendererException(e6, e6.format, e6.isRecoverable, 5001);
            } catch (AudioSink.WriteException e7) {
                throw createRendererException(e7, e7.format, e7.isRecoverable, 5002);
            }
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.audioSink.setPlaybackParameters(playbackParameters);
    }

    protected final boolean sinkSupportsFormat(Format format) {
        return this.audioSink.supportsFormat(format);
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int supportsFormat(Format format) {
        if (!MimeTypes.isAudio(format.sampleMimeType)) {
            return RendererCapabilities.CC.create(0);
        }
        int iSupportsFormatInternal = supportsFormatInternal(format);
        return iSupportsFormatInternal <= 2 ? RendererCapabilities.CC.create(iSupportsFormatInternal) : RendererCapabilities.CC.create(iSupportsFormatInternal, 8, 32);
    }

    protected abstract int supportsFormatInternal(Format format);

    public DecoderAudioRenderer(Handler handler, AudioRendererEventListener audioRendererEventListener, AudioCapabilities audioCapabilities, AudioProcessor... audioProcessorArr) {
        DefaultAudioSink.Builder builder = new DefaultAudioSink.Builder();
        builder.setAudioCapabilities((AudioCapabilities) an.I(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES));
        builder.setAudioProcessors(audioProcessorArr);
        this(handler, audioRendererEventListener, builder.build());
    }

    public DecoderAudioRenderer() {
        this((Handler) null, (AudioRendererEventListener) null, new AudioProcessor[0]);
    }

    public DecoderAudioRenderer(Handler handler, AudioRendererEventListener audioRendererEventListener, AudioProcessor... audioProcessorArr) {
        this(handler, audioRendererEventListener, null, audioProcessorArr);
    }
}
