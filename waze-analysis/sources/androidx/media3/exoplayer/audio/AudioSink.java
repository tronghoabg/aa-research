package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.d.b.an;
import com.google.d.l.b;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface AudioSink {
    public static final long CURRENT_POSITION_NOT_SET = Long.MIN_VALUE;
    public static final int OFFLOAD_MODE_DISABLED = 0;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_NOT_REQUIRED = 2;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_REQUIRED = 1;
    public static final int SINK_FORMAT_SUPPORTED_DIRECTLY = 2;
    public static final int SINK_FORMAT_SUPPORTED_WITH_TRANSCODING = 1;
    public static final int SINK_FORMAT_UNSUPPORTED = 0;

    /* compiled from: WazeSource */
    public final class AudioTrackConfig {
        public final int bufferSize;
        public final int channelConfig;
        public final int encoding;
        public final boolean offload;
        public final int sampleRate;
        public final boolean tunneling;

        public AudioTrackConfig(int i2, int i3, int i4, boolean z, boolean z2, int i5) {
            this.encoding = i2;
            this.sampleRate = i3;
            this.channelConfig = i4;
            this.tunneling = z;
            this.offload = z2;
            this.bufferSize = i5;
        }
    }

    /* compiled from: WazeSource */
    public interface Listener {

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.exoplayer.audio.AudioSink$Listener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onAudioCapabilitiesChanged(Listener listener) {
            }

            public static void $default$onAudioSessionIdChanged(Listener listener, int i2) {
            }

            public static void $default$onAudioSinkError(Listener listener, Exception exc) {
            }

            public static void $default$onAudioTrackInitialized(Listener listener, AudioTrackConfig audioTrackConfig) {
            }

            public static void $default$onAudioTrackReleased(Listener listener, AudioTrackConfig audioTrackConfig) {
            }

            public static void $default$onOffloadBufferEmptying(Listener listener) {
            }

            public static void $default$onOffloadBufferFull(Listener listener) {
            }

            public static void $default$onPositionAdvancing(Listener listener, long j2) {
            }

            public static void $default$onSilenceSkipped(Listener listener) {
            }
        }

        void onAudioCapabilitiesChanged();

        void onAudioSessionIdChanged(int i2);

        void onAudioSinkError(Exception exc);

        void onAudioTrackInitialized(AudioTrackConfig audioTrackConfig);

        void onAudioTrackReleased(AudioTrackConfig audioTrackConfig);

        void onOffloadBufferEmptying();

        void onOffloadBufferFull();

        void onPositionAdvancing(long j2);

        void onPositionDiscontinuity();

        void onSilenceSkipped();

        void onSkipSilenceEnabledChanged(boolean z);

        void onUnderrun(int i2, long j2, long j3);
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SinkFormatSupport {
    }

    /* compiled from: WazeSource */
    public final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public UnexpectedDiscontinuityException(long j2, long j3) {
            super("Unexpected audio track timestamp discontinuity: expected " + j3 + ", got " + j2);
            this.actualPresentationTimeUs = j2;
            this.expectedPresentationTimeUs = j3;
        }
    }

    /* compiled from: WazeSource */
    public final class WriteException extends Exception {
        public final int errorCode;
        public final Format format;
        public final boolean isRecoverable;

        public WriteException(int i2, Format format, boolean z) {
            super("AudioTrack write failed: " + i2);
            this.isRecoverable = z;
            this.errorCode = i2;
            this.format = format;
        }
    }

    @Deprecated
    void configure(Format format, int i2, int[] iArr);

    void configure(AudioSinkConfig audioSinkConfig);

    void disableTunneling();

    void enableTunnelingV21();

    void flush();

    AudioAttributes getAudioAttributes();

    AudioCapabilities getAudioCapabilities();

    long getAudioTrackBufferSizeUs();

    long getCurrentPositionUs(boolean z);

    AudioOffloadSupport getFormatOffloadSupport(Format format);

    int getFormatSupport(Format format);

    PlaybackParameters getPlaybackParameters();

    boolean getSkipSilenceEnabled();

    boolean handleBuffer(ByteBuffer byteBuffer, long j2, int i2);

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream();

    void release();

    void reset();

    void setAudioAttributes(AudioAttributes audioAttributes);

    void setAudioOutputProvider(AudioOutputProvider audioOutputProvider);

    void setAudioSessionId(int i2);

    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    void setClock(Clock clock);

    void setListener(Listener listener);

    void setOffloadDelayPadding(int i2, int i3);

    void setOffloadMode(int i2);

    void setOutputStreamOffsetUs(long j2);

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    void setPlayerId(PlayerId playerId);

    void setPreferredDevice(AudioDeviceInfo audioDeviceInfo);

    void setSkipSilenceEnabled(boolean z);

    void setVirtualDeviceId(int i2);

    void setVolume(float f2);

    boolean supportsFormat(Format format);

    /* compiled from: WazeSource */
    public final class ConfigurationException extends Exception {
        public final Format format;

        public ConfigurationException(String str, Format format) {
            super(str);
            this.format = format;
        }

        public ConfigurationException(Throwable th, Format format) {
            super(th);
            this.format = format;
        }
    }

    /* compiled from: WazeSource */
    public final class AudioSinkConfig {
        public final Format format;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final b outputChannelMapping;

        @Deprecated
        public final int preferredBufferSizeOverride;
        public final Timeline timeline;

        private AudioSinkConfig(Builder builder) {
            this.format = builder.format;
            this.preferredBufferSizeOverride = builder.preferredBufferSizeOverride;
            this.outputChannelMapping = builder.outputChannelMapping;
            this.timeline = builder.timeline;
            this.mediaPeriodId = builder.mediaPeriodId;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioSinkConfig)) {
                return false;
            }
            AudioSinkConfig audioSinkConfig = (AudioSinkConfig) obj;
            return this.preferredBufferSizeOverride == audioSinkConfig.preferredBufferSizeOverride && this.format.equals(audioSinkConfig.format) && Objects.equals(this.outputChannelMapping, audioSinkConfig.outputChannelMapping) && this.timeline.equals(audioSinkConfig.timeline) && Objects.equals(this.mediaPeriodId, audioSinkConfig.mediaPeriodId);
        }

        public int hashCode() {
            int iHashCode = this.format.hashCode() * 31;
            b bVar = this.outputChannelMapping;
            int iHashCode2 = (((((iHashCode + this.preferredBufferSizeOverride) * 31) + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.timeline.hashCode()) * 31;
            MediaSource.MediaPeriodId mediaPeriodId = this.mediaPeriodId;
            return iHashCode2 + (mediaPeriodId != null ? mediaPeriodId.hashCode() : 0);
        }

        /* compiled from: WazeSource */
        public final class Builder {
            private final Format format;
            private MediaSource.MediaPeriodId mediaPeriodId;
            private b outputChannelMapping;
            private int preferredBufferSizeOverride;
            private Timeline timeline;

            private Builder(AudioSinkConfig audioSinkConfig) {
                this.format = audioSinkConfig.format;
                this.preferredBufferSizeOverride = audioSinkConfig.preferredBufferSizeOverride;
                this.outputChannelMapping = audioSinkConfig.outputChannelMapping;
                this.timeline = audioSinkConfig.timeline;
                this.mediaPeriodId = audioSinkConfig.mediaPeriodId;
            }

            public AudioSinkConfig build() {
                MediaSource.MediaPeriodId mediaPeriodId;
                if (!this.timeline.isEmpty() && (mediaPeriodId = this.mediaPeriodId) != null) {
                    an.l(this.timeline.getIndexOfPeriod(mediaPeriodId.periodUid) != -1);
                }
                return new AudioSinkConfig(this);
            }

            public Builder setMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
                this.mediaPeriodId = mediaPeriodId;
                return this;
            }

            public Builder setOutputChannelMapping(b bVar) {
                this.outputChannelMapping = bVar;
                return this;
            }

            @Deprecated
            public Builder setPreferredBufferSizeOverride(int i2) {
                this.preferredBufferSizeOverride = i2;
                return this;
            }

            public Builder setTimeline(Timeline timeline) {
                this.timeline = timeline;
                return this;
            }

            public Builder(Format format) {
                this.format = format;
                this.preferredBufferSizeOverride = 0;
                this.outputChannelMapping = null;
                this.timeline = Timeline.EMPTY;
                this.mediaPeriodId = null;
            }
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.exoplayer.audio.AudioSink$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        @Deprecated
        public static void $default$configure(AudioSink audioSink, Format format, int i2, int[] iArr) {
            AudioSinkConfig.Builder builder = new AudioSinkConfig.Builder(format);
            builder.setPreferredBufferSizeOverride(i2);
            builder.setOutputChannelMapping(iArr == null ? null : b.d(iArr));
            audioSink.configure(builder.build());
        }

        public static AudioCapabilities $default$getAudioCapabilities(AudioSink audioSink) {
            return null;
        }

        public static void $default$release(AudioSink audioSink) {
        }

        public static void $default$setAudioOutputProvider(AudioSink audioSink, AudioOutputProvider audioOutputProvider) {
            throw new UnsupportedOperationException("AudioSink doesn't support setAudioOutputProvider");
        }

        public static void $default$setClock(AudioSink audioSink, Clock clock) {
        }

        public static void $default$setOffloadDelayPadding(AudioSink audioSink, int i2, int i3) {
        }

        public static void $default$setOffloadMode(AudioSink audioSink, int i2) {
        }

        public static void $default$setOutputStreamOffsetUs(AudioSink audioSink, long j2) {
        }

        public static void $default$setPlayerId(AudioSink audioSink, PlayerId playerId) {
        }

        public static void $default$setPreferredDevice(AudioSink audioSink, AudioDeviceInfo audioDeviceInfo) {
        }

        public static void $default$setVirtualDeviceId(AudioSink audioSink, int i2) {
        }

        public static void $default$configure(AudioSink audioSink, AudioSinkConfig audioSinkConfig) {
            Format format = audioSinkConfig.format;
            int i2 = audioSinkConfig.preferredBufferSizeOverride;
            b bVar = audioSinkConfig.outputChannelMapping;
            audioSink.configure(format, i2, bVar == null ? null : bVar.g());
        }
    }

    /* compiled from: WazeSource */
    public final class InitializationException extends Exception {
        public final int audioTrackState;
        public final Format format;
        public final boolean isRecoverable;

        public InitializationException(int i2, int i3, int i4, int i5, int i6, Format format, boolean z, Exception exc) {
            String strValueOf = String.valueOf(format);
            StringBuilder sb = new StringBuilder("AudioTrack init failed ");
            sb.append(i2);
            sb.append(" Config(");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(", ");
            sb.append(i5);
            sb.append(", ");
            sb.append(i6);
            sb.append(") ");
            sb.append(strValueOf);
            sb.append(true != z ? "" : " (recoverable)");
            this(sb.toString(), i2, format, z, exc);
        }

        public InitializationException(String str, int i2, Format format, boolean z, Throwable th) {
            super(str, th);
            this.audioTrackState = i2;
            this.isRecoverable = z;
            this.format = format;
        }
    }
}
