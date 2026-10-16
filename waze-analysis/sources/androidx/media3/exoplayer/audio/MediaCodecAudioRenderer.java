package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.MediaClock;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.extractor.VorbisUtil;
import com.google.d.b.an;
import com.google.d.d.bn;
import com.google.d.l.b;
import com.google.d.l.c;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class MediaCodecAudioRenderer extends MediaCodecRenderer implements MediaClock {
    private static final long READY_GRACE_PERIOD_MS = 100;
    private static final String TAG = "MediaCodecAudioRenderer";
    private static final String VIVO_BITS_PER_SAMPLE_KEY = "v-bits-per-sample";
    private boolean allowPositionDiscontinuity;
    private final AudioSink audioSink;
    private boolean audioSinkNeedsReset;
    private int codecMaxInputSize;
    private boolean codecNeedsDiscardChannelsWorkaround;
    private boolean codecNeedsVorbisToAndroidChannelMappingWorkaround;
    private final Context context;
    private long currentPositionUs;
    private Format decryptOnlyCodecFormat;
    private final AudioRendererEventListener.EventDispatcher eventDispatcher;
    private long firstNotReadyTimeMs;
    private boolean hasBeenReady;
    private boolean hasPendingReportedSkippedSilence;
    private boolean hasReportedAudioPositionAdvancing;
    private Format inputFormat;
    private boolean isStarted;
    private final LoudnessCodecController loudnessCodecController;
    private long nextBufferToWritePresentationTimeUs;
    private int rendererPriority;

    /* compiled from: WazeSource */
    final class AudioSinkListener implements AudioSink.Listener {
        final /* synthetic */ MediaCodecAudioRenderer this$0;

        private AudioSinkListener(MediaCodecAudioRenderer mediaCodecAudioRenderer) {
            Objects.requireNonNull(mediaCodecAudioRenderer);
            this.this$0 = mediaCodecAudioRenderer;
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioCapabilitiesChanged() {
            this.this$0.onRendererCapabilitiesChanged();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioSessionIdChanged(int i2) {
            if (Build.VERSION.SDK_INT >= 35 && this.this$0.loudnessCodecController != null) {
                this.this$0.loudnessCodecController.setAudioSessionId(i2);
            }
            this.this$0.eventDispatcher.audioSessionIdChanged(i2);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioSinkError(Exception exc) {
            Log.e(MediaCodecAudioRenderer.TAG, "Audio sink error", exc);
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
        public void onOffloadBufferEmptying() {
            Renderer.WakeupListener wakeupListener = this.this$0.getWakeupListener();
            if (wakeupListener != null) {
                wakeupListener.onWakeup();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onOffloadBufferFull() {
            Renderer.WakeupListener wakeupListener = this.this$0.getWakeupListener();
            if (wakeupListener != null) {
                wakeupListener.onSleep();
            }
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

    public MediaCodecAudioRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, boolean z, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioSink audioSink, LoudnessCodecController loudnessCodecController) {
        super(context.getApplicationContext(), 1, factory, mediaCodecSelector, z, 0.0f);
        this.context = context.getApplicationContext();
        this.audioSink = audioSink;
        this.loudnessCodecController = loudnessCodecController;
        this.rendererPriority = -1000;
        this.eventDispatcher = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        this.firstNotReadyTimeMs = C.TIME_UNSET;
        this.hasBeenReady = false;
    }

    private static boolean codecNeedsDiscardChannelsWorkaround(String str) {
        String str2 = MediaLibraryInfo.TAG;
        return false;
    }

    private static boolean codecNeedsVorbisToAndroidChannelMappingWorkaround(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    private static boolean deviceDoesntSupportOperatingRate() {
        String str = MediaLibraryInfo.TAG;
        return false;
    }

    private int getAudioOffloadSupport(Format format) {
        AudioOffloadSupport formatOffloadSupport = this.audioSink.getFormatOffloadSupport(format);
        if (!formatOffloadSupport.isFormatSupported) {
            return 0;
        }
        int i2 = true != formatOffloadSupport.isGaplessSupported ? 512 : DisplayStrings.DS_MAP_POPUP_START_POINT_TITLE;
        return formatOffloadSupport.isSpeedChangeSupported ? i2 | 2048 : i2;
    }

    private static List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z, AudioSink audioSink) {
        MediaCodecInfo decryptOnlyDecoderInfo;
        return format.sampleMimeType == null ? bn.p() : (!audioSink.supportsFormat(format) || (decryptOnlyDecoderInfo = MediaCodecUtil.getDecryptOnlyDecoderInfo()) == null) ? MediaCodecUtil.getDecoderInfosSoftMatch(mediaCodecSelector, format, z, false) : bn.q(decryptOnlyDecoderInfo);
    }

    private void setAudioSessionId(int i2) {
        LoudnessCodecController loudnessCodecController;
        this.audioSink.setAudioSessionId(i2);
        if (Build.VERSION.SDK_INT < 35 || (loudnessCodecController = this.loudnessCodecController) == null) {
            return;
        }
        loudnessCodecController.setAudioSessionId(i2);
    }

    private void updateCodecImportance() {
        MediaCodecAdapter codec = getCodec();
        if (codec != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.rendererPriority));
            codec.setParameters(bundle);
        }
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

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format, Format format2, boolean z) {
        int i2;
        int i3;
        DecoderReuseEvaluation decoderReuseEvaluationCanReuseCodec = mediaCodecInfo.canReuseCodec(format, format2);
        int i4 = decoderReuseEvaluationCanReuseCodec.discardReasons;
        if (isBypassPossible(format2)) {
            i4 |= 32768;
        }
        if (getCodecMaxInputSize(mediaCodecInfo, format2) > this.codecMaxInputSize) {
            i4 |= 64;
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

    protected int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) {
        int codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length != 1) {
            for (Format format2 : formatArr) {
                if (mediaCodecInfo.canReuseCodec(format, format2).result != 0) {
                    codecMaxInputSize = Math.max(codecMaxInputSize, getCodecMaxInputSize(mediaCodecInfo, format2));
                }
            }
        }
        return codecMaxInputSize;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float getCodecOperatingRateV23(float f2, Format format, Format[] formatArr) {
        int integer = -1;
        for (Format format2 : formatArr) {
            int i2 = format2.sampleRate;
            if (i2 != -1) {
                integer = Math.max(integer, i2);
            }
        }
        if (integer == -1) {
            MediaFormat codecOutputMediaFormat = getCodecOutputMediaFormat();
            integer = (codecOutputMediaFormat == null || !codecOutputMediaFormat.containsKey("sample-rate")) ? -1 : codecOutputMediaFormat.getInteger("sample-rate");
        }
        if (integer == -1) {
            return -1.0f;
        }
        return integer * f2;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected long getDurationToProgressUs(long j2, long j3, boolean z) {
        boolean z2 = false;
        if (this.audioSink.hasPendingData() && this.nextBufferToWritePresentationTimeUs != C.TIME_UNSET) {
            z2 = true;
        }
        if (!this.isStarted) {
            return (z2 || super.isEnded()) ? 1000000L : 10000L;
        }
        long audioTrackBufferSizeUs = this.audioSink.getAudioTrackBufferSizeUs();
        if (this.hasReportedAudioPositionAdvancing && z2 && audioTrackBufferSizeUs != C.TIME_UNSET) {
            return Math.max(10000L, (long) ((Math.min(audioTrackBufferSizeUs, this.nextBufferToWritePresentationTimeUs - j2) / (getPlaybackParameters() != null ? getPlaybackParameters().speed : 1.0f)) / 2.0f));
        }
        return 10000L;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public MediaClock getMediaClock() {
        return this;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format, MediaCrypto mediaCrypto, float f2) {
        this.codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format, getStreamFormats());
        codecNeedsDiscardChannelsWorkaround(mediaCodecInfo.name);
        this.codecNeedsDiscardChannelsWorkaround = false;
        this.codecNeedsVorbisToAndroidChannelMappingWorkaround = codecNeedsVorbisToAndroidChannelMappingWorkaround(mediaCodecInfo.name);
        MediaFormat mediaFormat = getMediaFormat(format, mediaCodecInfo.codecMimeType, this.codecMaxInputSize, f2);
        Format format2 = null;
        if (MimeTypes.AUDIO_RAW.equals(mediaCodecInfo.mimeType) && !MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
            format2 = format;
        }
        this.decryptOnlyCodecFormat = format2;
        return MediaCodecAdapter.Configuration.createForAudioDecoding(mediaCodecInfo, mediaFormat, format, mediaCrypto, this.loudnessCodecController);
    }

    protected MediaFormat getMediaFormat(Format format, String str, int i2, float f2) {
        Pair<Integer, Integer> codecProfileAndLevel;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.channelCount);
        mediaFormat.setInteger("sample-rate", format.sampleRate);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", i2);
        mediaFormat.setInteger("priority", 0);
        if (f2 != -1.0f) {
            deviceDoesntSupportOperatingRate();
            mediaFormat.setFloat("operating-rate", f2);
        }
        if (MimeTypes.AUDIO_AC4.equals(format.sampleMimeType) && (codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format)) != null) {
            MediaFormatUtil.maybeSetInteger(mediaFormat, "profile", ((Integer) codecProfileAndLevel.first).intValue());
            MediaFormatUtil.maybeSetInteger(mediaFormat, "level", ((Integer) codecProfileAndLevel.second).intValue());
        }
        if (this.audioSink.getFormatSupport(Util.getPcmFormat(4, format.channelCount, format.sampleRate)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (Build.VERSION.SDK_INT >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.rendererPriority));
        }
        if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_IAMF)) {
            AudioCapabilities audioCapabilities = this.audioSink.getAudioCapabilities();
            if (audioCapabilities == null) {
                Log.w(TAG, "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                int outputChannelMaskForCurrentConfiguration = IamfUtil.getOutputChannelMaskForCurrentConfiguration(audioCapabilities);
                int iBitCount = Integer.bitCount(outputChannelMaskForCurrentConfiguration);
                mediaFormat.setInteger("channel-mask", outputChannelMaskForCurrentConfiguration);
                mediaFormat.setInteger("max-output-channel-count", iBitCount);
            }
        }
        applyCodecParametersToMediaFormat(mediaFormat);
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public String getName() {
        return TAG;
    }

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

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) {
        Format format = decoderInputBuffer.format;
        if (format != null && Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_OPUS) && isBypassEnabled()) {
            ByteBuffer byteBuffer = decoderInputBuffer.supplementalData;
            an.B(byteBuffer);
            Format format2 = decoderInputBuffer.format;
            an.B(format2);
            int i2 = format2.encoderDelay;
            if (byteBuffer.remaining() == 8) {
                this.audioSink.setOffloadDelayPadding(i2, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / C.NANOS_PER_SECOND));
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i2, Object obj) {
        if (i2 == 2) {
            AudioSink audioSink = this.audioSink;
            an.B(obj);
            audioSink.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i2 == 3) {
            AudioAttributes audioAttributes = (AudioAttributes) obj;
            AudioSink audioSink2 = this.audioSink;
            an.B(audioAttributes);
            audioSink2.setAudioAttributes(audioAttributes);
            return;
        }
        if (i2 == 6) {
            AuxEffectInfo auxEffectInfo = (AuxEffectInfo) obj;
            AudioSink audioSink3 = this.audioSink;
            an.B(auxEffectInfo);
            audioSink3.setAuxEffectInfo(auxEffectInfo);
            return;
        }
        if (i2 == 12) {
            this.audioSink.setPreferredDevice((AudioDeviceInfo) obj);
            return;
        }
        if (i2 == 16) {
            an.B(obj);
            this.rendererPriority = ((Integer) obj).intValue();
            updateCodecImportance();
            return;
        }
        if (i2 == 9) {
            AudioSink audioSink4 = this.audioSink;
            an.B(obj);
            audioSink4.setSkipSilenceEnabled(((Boolean) obj).booleanValue());
            return;
        }
        if (i2 == 10) {
            an.B(obj);
            setAudioSessionId(((Integer) obj).intValue());
            return;
        }
        if (i2 == 19) {
            AudioSink audioSink5 = this.audioSink;
            an.B(obj);
            audioSink5.setVirtualDeviceId(((Integer) obj).intValue());
        } else {
            if (i2 != 20) {
                super.handleMessage(i2, obj);
                return;
            }
            AudioSink audioSink6 = this.audioSink;
            an.B(obj);
            audioSink6.setAudioOutputProvider((AudioOutputProvider) obj);
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public boolean hasSkippedSilenceSinceLastCall() {
        boolean z = this.hasPendingReportedSkippedSilence;
        this.hasPendingReportedSkippedSilence = false;
        return z;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return super.isEnded() && this.audioSink.isEnded();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
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

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onCodecError(Exception exc) {
        Log.e(TAG, "Audio codec error", exc);
        this.eventDispatcher.audioCodecError(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j2, long j3) {
        this.eventDispatcher.decoderInitialized(str, j2, j3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onCodecParametersChanged(CodecParameters codecParameters) {
        this.eventDispatcher.audioCodecParametersChanged(codecParameters);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onCodecReleased(String str) {
        this.eventDispatcher.decoderReleased(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        this.audioSinkNeedsReset = true;
        this.inputFormat = null;
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        this.hasReportedAudioPositionAdvancing = false;
        try {
            this.audioSink.flush();
            super.onDisabled();
        } catch (Throwable th) {
            super.onDisabled();
            throw th;
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onEnabled(boolean z, boolean z2) {
        super.onEnabled(z, z2);
        this.eventDispatcher.enabled(this.decoderCounters);
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

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) {
        Format format = formatHolder.format;
        an.B(format);
        this.inputFormat = format;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.eventDispatcher;
        DecoderReuseEvaluation decoderReuseEvaluationOnInputFormatChanged = super.onInputFormatChanged(formatHolder);
        eventDispatcher.inputFormatChanged(format, decoderReuseEvaluationOnInputFormatChanged);
        return decoderReuseEvaluationOnInputFormatChanged;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onOutputFormatChanged(Format format, MediaFormat mediaFormat) throws ExoPlaybackException {
        int i2;
        int integer;
        Format format2 = this.decryptOnlyCodecFormat;
        b vorbisToAndroidChannelLayoutMapping = null;
        if (format2 != null) {
            format = format2;
        } else if (getCodec() != null) {
            an.B(mediaFormat);
            int integer2 = MimeTypes.AUDIO_RAW.equals(format.sampleMimeType) ? format.pcmEncoding : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey(VIVO_BITS_PER_SAMPLE_KEY) ? Util.getPcmEncoding(mediaFormat.getInteger(VIVO_BITS_PER_SAMPLE_KEY)) : 2;
            int integer3 = mediaFormat.getInteger("channel-count");
            int i3 = format.channelMask;
            if (i3 == -1 || format.channelCount != integer3) {
                i3 = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer3) {
                i3 = integer;
            }
            Format.Builder builder = new Format.Builder();
            builder.setSampleMimeType(MimeTypes.AUDIO_RAW);
            builder.setPcmEncoding(integer2);
            builder.setEncoderDelay(format.encoderDelay);
            builder.setEncoderPadding(format.encoderPadding);
            builder.setMetadata(format.metadata);
            builder.setCustomData(format.customData);
            builder.setId(format.id);
            builder.setLabel(format.label);
            builder.setLabels(format.labels);
            builder.setLanguage(format.language);
            builder.setSelectionFlags(format.selectionFlags);
            builder.setRoleFlags(format.roleFlags);
            builder.setChannelCount(integer3);
            builder.setChannelMask(i3);
            builder.setSampleRate(mediaFormat.getInteger("sample-rate"));
            Format formatBuild = builder.build();
            if (this.codecNeedsDiscardChannelsWorkaround && formatBuild.channelCount == 6 && (i2 = format.channelCount) < 6) {
                c cVarL = b.l(i2);
                for (int i4 = 0; i4 < format.channelCount; i4++) {
                    cVarL.d(i4);
                }
                vorbisToAndroidChannelLayoutMapping = cVarL.c();
            } else if (this.codecNeedsVorbisToAndroidChannelMappingWorkaround) {
                vorbisToAndroidChannelLayoutMapping = VorbisUtil.getVorbisToAndroidChannelLayoutMapping(formatBuild.channelCount);
            }
            format = formatBuild;
        }
        try {
            if (!isBypassEnabled() || getConfiguration().offloadModePreferred == 0) {
                this.audioSink.setOffloadMode(0);
            } else {
                this.audioSink.setOffloadMode(getConfiguration().offloadModePreferred);
            }
            AudioSink audioSink = this.audioSink;
            AudioSink.AudioSinkConfig.Builder builder2 = new AudioSink.AudioSinkConfig.Builder(format);
            builder2.setOutputChannelMapping(vorbisToAndroidChannelLayoutMapping);
            builder2.setTimeline(getTimeline());
            builder2.setMediaPeriodId(getMediaPeriodId());
            audioSink.configure(builder2.build());
            updateCodecOperatingRate();
        } catch (AudioSink.ConfigurationException e2) {
            throw createRendererException(e2, e2.format, 5001);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onOutputStreamOffsetUsChanged(long j2) {
        this.audioSink.setOutputStreamOffsetUs(j2);
    }

    protected void onPositionDiscontinuity() {
        this.allowPositionDiscontinuity = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j2, boolean z, boolean z2) {
        super.onPositionReset(j2, z, z2);
        this.audioSink.flush();
        this.currentPositionUs = j2;
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        this.firstNotReadyTimeMs = C.TIME_UNSET;
        this.hasBeenReady = false;
        this.hasPendingReportedSkippedSilence = false;
        this.hasReportedAudioPositionAdvancing = false;
        this.allowPositionDiscontinuity = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onProcessedStreamChange() {
        this.audioSink.handleDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onRelease() {
        LoudnessCodecController loudnessCodecController;
        this.audioSink.release();
        if (Build.VERSION.SDK_INT < 35 || (loudnessCodecController = this.loudnessCodecController) == null) {
            return;
        }
        loudnessCodecController.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onReset() {
        this.hasPendingReportedSkippedSilence = false;
        this.hasReportedAudioPositionAdvancing = false;
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        try {
            super.onReset();
            if (this.audioSinkNeedsReset) {
                this.audioSinkNeedsReset = false;
                this.audioSink.reset();
            }
        } catch (Throwable th) {
            if (this.audioSinkNeedsReset) {
                this.audioSinkNeedsReset = false;
                this.audioSink.reset();
            }
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onStarted() {
        this.audioSink.play();
        this.isStarted = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onStopped() {
        updateCurrentPosition();
        this.isStarted = false;
        this.audioSink.pause();
        this.hasReportedAudioPositionAdvancing = false;
        this.firstNotReadyTimeMs = C.TIME_UNSET;
        this.hasBeenReady = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean processOutputBuffer(long j2, long j3, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, Format format) throws ExoPlaybackException {
        an.B(byteBuffer);
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        if (this.decryptOnlyCodecFormat != null && (i3 & 2) != 0) {
            an.B(mediaCodecAdapter);
            mediaCodecAdapter.releaseOutputBuffer(i2, false);
            return true;
        }
        if (z) {
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.releaseOutputBuffer(i2, false);
            }
            this.decoderCounters.skippedOutputBufferCount += i4;
            this.audioSink.handleDiscontinuity();
            return true;
        }
        try {
            if (!this.audioSink.handleBuffer(byteBuffer, j4, i4)) {
                this.nextBufferToWritePresentationTimeUs = j4;
                return false;
            }
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.releaseOutputBuffer(i2, false);
            }
            this.decoderCounters.renderedOutputBufferCount += i4;
            return true;
        } catch (AudioSink.InitializationException e2) {
            Format format2 = this.inputFormat;
            int i5 = 5001;
            if (isBypassEnabled() && getConfiguration().offloadModePreferred != 0) {
                i5 = 5004;
            }
            throw createRendererException(e2, format2, e2.isRecoverable, i5);
        } catch (AudioSink.WriteException e3) {
            int i6 = 5002;
            if (isBypassEnabled() && getConfiguration().offloadModePreferred != 0) {
                i6 = 5003;
            }
            throw createRendererException(e3, format, e3.isRecoverable, i6);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void renderToEndOfStream() throws ExoPlaybackException {
        try {
            this.audioSink.playToEndOfStream();
            if (getLastBufferInStreamPresentationTimeUs() != C.TIME_UNSET) {
                this.nextBufferToWritePresentationTimeUs = getLastBufferInStreamPresentationTimeUs();
            }
        } catch (AudioSink.WriteException e2) {
            throw createRendererException(e2, e2.format, e2.isRecoverable, true != isBypassEnabled() ? 5002 : 5003);
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.audioSink.setPlaybackParameters(playbackParameters);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean shouldUseBypass(Format format) {
        if (getConfiguration().offloadModePreferred != 0) {
            int audioOffloadSupport = getAudioOffloadSupport(format);
            if ((audioOffloadSupport & 512) != 0) {
                if (getConfiguration().offloadModePreferred == 2 || (audioOffloadSupport & 1024) != 0) {
                    return true;
                }
                if (format.encoderDelay == 0 && format.encoderPadding == 0) {
                    return true;
                }
            }
        }
        return this.audioSink.supportsFormat(format);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected int supportsFormat(androidx.media3.exoplayer.mediacodec.MediaCodecSelector r11, androidx.media3.common.Format r12) {
        /*
            r10 = this;
            java.lang.String r0 = r12.sampleMimeType
            boolean r0 = androidx.media3.common.MimeTypes.isAudio(r0)
            r1 = 0
            if (r0 != 0) goto La
            goto L6a
        La:
            int r0 = r12.cryptoType
            boolean r2 = supportsFormatDrm(r12)
            r3 = 4
            r4 = 8
            if (r2 == 0) goto L32
            if (r0 == 0) goto L1d
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo r0 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecryptOnlyDecoderInfo()
            if (r0 == 0) goto L32
        L1d:
            int r0 = r10.getAudioOffloadSupport(r12)
            androidx.media3.exoplayer.audio.AudioSink r5 = r10.audioSink
            boolean r5 = r5.supportsFormat(r12)
            if (r5 != 0) goto L2b
            r5 = r0
            goto L33
        L2b:
            r10 = 32
            int r10 = androidx.media3.exoplayer.RendererCapabilities.CC.create(r3, r4, r10, r0)
            return r10
        L32:
            r5 = r1
        L33:
            java.lang.String r0 = r12.sampleMimeType
            java.lang.String r6 = "audio/raw"
            boolean r0 = r6.equals(r0)
            r6 = 1
            if (r0 == 0) goto L47
            androidx.media3.exoplayer.audio.AudioSink r0 = r10.audioSink
            boolean r0 = r0.supportsFormat(r12)
            if (r0 != 0) goto L47
            goto L58
        L47:
            androidx.media3.exoplayer.audio.AudioSink r0 = r10.audioSink
            int r7 = r12.channelCount
            int r8 = r12.sampleRate
            r9 = 2
            androidx.media3.common.Format r7 = androidx.media3.common.util.Util.getPcmFormat(r9, r7, r8)
            boolean r0 = r0.supportsFormat(r7)
            if (r0 != 0) goto L5a
        L58:
            r1 = r6
            goto L6a
        L5a:
            androidx.media3.exoplayer.audio.AudioSink r0 = r10.audioSink
            java.util.List r11 = getDecoderInfos(r11, r12, r1, r0)
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L67
            goto L58
        L67:
            if (r2 != 0) goto L6f
            r1 = r9
        L6a:
            int r10 = androidx.media3.exoplayer.RendererCapabilities.CC.create(r1)
            return r10
        L6f:
            java.lang.Object r0 = r11.get(r1)
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo r0 = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) r0
            android.content.Context r2 = r10.context
            boolean r2 = r0.isFormatSupported(r2, r12)
            if (r2 != 0) goto L99
            r7 = r6
        L7e:
            int r8 = r11.size()
            if (r7 >= r8) goto L99
            java.lang.Object r8 = r11.get(r7)
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo r8 = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) r8
            android.content.Context r9 = r10.context
            boolean r9 = r8.isFormatSupported(r9, r12)
            if (r9 == 0) goto L96
            r10 = r1
            r2 = r6
            r0 = r8
            goto L9a
        L96:
            int r7 = r7 + 1
            goto L7e
        L99:
            r10 = r6
        L9a:
            if (r6 == r2) goto L9d
            r3 = 3
        L9d:
            if (r2 == 0) goto La7
            boolean r11 = r0.isSeamlessAdaptationSupported(r12)
            if (r11 == 0) goto La7
            r4 = 16
        La7:
            boolean r11 = r0.hardwareAccelerated
            if (r6 == r11) goto Lad
            r11 = r1
            goto Laf
        Lad:
            r11 = 64
        Laf:
            if (r6 == r10) goto Lb2
            goto Lb4
        Lb2:
            r1 = 128(0x80, float:1.8E-43)
        Lb4:
            r2 = 32
            r0 = r4
            r4 = r1
            r1 = r0
            r0 = r3
            r3 = r11
            int r10 = androidx.media3.exoplayer.RendererCapabilities.CC.create(r0, r1, r2, r3, r4, r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.supportsFormat(androidx.media3.exoplayer.mediacodec.MediaCodecSelector, androidx.media3.common.Format):int");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z) {
        return MediaCodecUtil.getDecoderInfosSortedByFormatSupport(this.context, getDecoderInfos(mediaCodecSelector, format, z, this.audioSink), format);
    }

    private int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        String str = mediaCodecInfo.name;
        return format.maxInputSize;
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, boolean z, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        this(context, factory, mediaCodecSelector, z, handler, audioRendererEventListener, audioSink, Build.VERSION.SDK_INT >= 35 ? new LoudnessCodecController() : null);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, null, null);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, Handler handler, AudioRendererEventListener audioRendererEventListener) {
        this(context, mediaCodecSelector, handler, audioRendererEventListener, new DefaultAudioSink.Builder(context).build());
    }

    @Deprecated
    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioCapabilities audioCapabilities, AudioProcessor... audioProcessorArr) {
        DefaultAudioSink.Builder builder = new DefaultAudioSink.Builder();
        builder.setAudioCapabilities((AudioCapabilities) an.I(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES));
        builder.setAudioProcessors(audioProcessorArr);
        this(context, mediaCodecSelector, handler, audioRendererEventListener, builder.build());
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        this(context, MediaCodecAdapter.Factory.CC.getDefault(context), mediaCodecSelector, false, handler, audioRendererEventListener, audioSink);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, boolean z, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        this(context, MediaCodecAdapter.Factory.CC.getDefault(context), mediaCodecSelector, z, handler, audioRendererEventListener, audioSink);
    }
}
