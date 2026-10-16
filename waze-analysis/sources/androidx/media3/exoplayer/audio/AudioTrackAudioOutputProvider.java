package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import com.google.d.b.aj;
import com.google.d.b.an;
import j$.util.Objects;
import java.util.function.BiConsumer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AudioTrackAudioOutputProvider implements AudioOutputProvider {
    private static final aj<Boolean> COMPRESSED_OFFLOAD_EXPLICIT_AAC_ENABLED = an.a(new aj() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutputProvider$$ExternalSyntheticLambda2
        @Override // com.google.d.b.aj
        /* renamed from: get */
        public final Object get2() {
            return Boolean.valueOf(AudioTrackAudioOutputProvider.isCompressedOffloadExplicitAacEnabled());
        }
    });
    private static final String TAG = "ATAudioOutputProvider";
    private AudioCapabilities audioCapabilities;
    private AudioCapabilitiesReceiver audioCapabilitiesReceiver;
    private final DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider;
    private final DefaultAudioSink.AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
    private final DefaultAudioSink.AudioTrackProvider audioTrackProvider;
    private final BiConsumer<AudioTrack.Builder, AudioOutputProvider.OutputConfig> builderModifier;
    private final CapabilityChangeListener capabilityChangeListener;
    private Clock clock;
    private final Context context;
    private Context contextWithDeviceId;
    private ListenerSet<AudioOutputProvider.Listener> listeners;
    private final float maxPlaybackSpeed;
    private Looper playbackLooper;

    /* compiled from: WazeSource */
    public final class Builder {
        private AudioCapabilities audioCapabilities;
        private DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider;
        private BiConsumer<AudioTrack.Builder, AudioOutputProvider.OutputConfig> audioTrackBuilderModifier;
        private DefaultAudioSink.AudioTrackProvider audioTrackProvider;
        private DefaultAudioSink.AudioTrackBufferSizeProvider bufferSizeProvider;
        private final Context context;
        private float maxPlaybackSpeed;

        public Builder(Context context) {
            this.context = context != null ? context.getApplicationContext() : null;
            this.bufferSizeProvider = DefaultAudioSink.AudioTrackBufferSizeProvider.DEFAULT;
            if (context == null) {
                this.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
            }
            this.maxPlaybackSpeed = 8.0f;
        }

        public AudioTrackAudioOutputProvider build() {
            if (this.audioOffloadSupportProvider == null) {
                this.audioOffloadSupportProvider = new DefaultAudioOffloadSupportProvider(this.context);
            }
            return new AudioTrackAudioOutputProvider(this);
        }

        Builder setAudioCapabilities(AudioCapabilities audioCapabilities) {
            if (this.context == null) {
                this.audioCapabilities = audioCapabilities;
            }
            return this;
        }

        public Builder setAudioOffloadSupportProvider(DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider) {
            this.audioOffloadSupportProvider = audioOffloadSupportProvider;
            return this;
        }

        public Builder setAudioTrackBufferSizeProvider(DefaultAudioSink.AudioTrackBufferSizeProvider audioTrackBufferSizeProvider) {
            this.bufferSizeProvider = audioTrackBufferSizeProvider;
            return this;
        }

        public Builder setAudioTrackBuilderModifier(BiConsumer<AudioTrack.Builder, AudioOutputProvider.OutputConfig> biConsumer) {
            this.audioTrackBuilderModifier = biConsumer;
            return this;
        }

        Builder setAudioTrackProvider(DefaultAudioSink.AudioTrackProvider audioTrackProvider) {
            this.audioTrackProvider = audioTrackProvider;
            return this;
        }

        public Builder setMaxPlaybackSpeed(float f2) {
            an.l(f2 >= 1.0f);
            this.maxPlaybackSpeed = f2;
            return this;
        }
    }

    /* compiled from: WazeSource */
    final class CapabilityChangeListener implements AudioTrackAudioOutput.CapabilityChangeListener {
        final /* synthetic */ AudioTrackAudioOutputProvider this$0;

        private CapabilityChangeListener(AudioTrackAudioOutputProvider audioTrackAudioOutputProvider) {
            Objects.requireNonNull(audioTrackAudioOutputProvider);
            this.this$0 = audioTrackAudioOutputProvider;
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackAudioOutput.CapabilityChangeListener
        public void onRecoverableWriteError() {
            if (this.this$0.audioCapabilitiesReceiver != null) {
                this.this$0.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
                this.this$0.audioCapabilitiesReceiver.overrideCapabilities(AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES);
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackAudioOutput.CapabilityChangeListener
        public void onRoutedDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
            if (this.this$0.audioCapabilitiesReceiver != null) {
                this.this$0.audioCapabilitiesReceiver.setRoutedDevice(audioDeviceInfo);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AudioTrackAudioOutputProvider(Builder builder) {
        this.context = builder.context;
        this.builderModifier = builder.audioTrackBuilderModifier;
        DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider = builder.audioOffloadSupportProvider;
        an.B(audioOffloadSupportProvider);
        this.audioOffloadSupportProvider = audioOffloadSupportProvider;
        this.audioTrackBufferSizeProvider = builder.bufferSizeProvider;
        this.audioCapabilities = builder.audioCapabilities;
        this.audioTrackProvider = builder.audioTrackProvider;
        this.capabilityChangeListener = builder.context != null ? new CapabilityChangeListener() : null;
        this.maxPlaybackSpeed = builder.maxPlaybackSpeed;
        this.clock = Clock.DEFAULT;
    }

    private int getAudioOutputChannelConfig(Format format) {
        DefaultAudioSink.AudioTrackProvider audioTrackProvider = this.audioTrackProvider;
        return audioTrackProvider != null ? audioTrackProvider.getAudioTrackChannelConfig(format.channelCount) : Util.getAudioTrackChannelConfig(format);
    }

    private AudioAttributes getAudioTrackAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
        return z ? getAudioTrackTunnelingAttributes() : audioAttributes.getPlatformAudioAttributes();
    }

    private AudioSink.AudioTrackConfig getAudioTrackConfig(AudioOutputProvider.OutputConfig outputConfig) {
        return new AudioSink.AudioTrackConfig(outputConfig.encoding, outputConfig.sampleRate, outputConfig.channelMask, outputConfig.isTunneling, outputConfig.isOffload, outputConfig.bufferSize);
    }

    private int getAudioTrackMinBufferSize(int i2, int i3, int i4) {
        int minBufferSize = AudioTrack.getMinBufferSize(i2, i3, i4);
        an.u(minBufferSize != -2);
        return minBufferSize;
    }

    private AudioAttributes getAudioTrackTunnelingAttributes() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    private int getFormatSupportLevel(AudioOutputProvider.FormatConfig formatConfig) {
        Format format = formatConfig.format;
        if (!Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_RAW)) {
            return this.audioCapabilities.isPassthroughPlaybackSupported(format, formatConfig.audioAttributes) ? 2 : 0;
        }
        int i2 = format.pcmEncoding;
        if (i2 == 2) {
            return 2;
        }
        if (!formatConfig.enableHighResolutionPcmOutput) {
            return 0;
        }
        if (Util.isEncodingLinearPcm(i2)) {
            return Build.VERSION.SDK_INT < Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(format.pcmEncoding) ? 0 : 2;
        }
        Log.w(TAG, "Invalid PCM encoding: " + format.pcmEncoding);
        return 0;
    }

    private static String getLooperThreadName(Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isCompressedOffloadExplicitAacEnabled() {
        return Build.VERSION.SDK_INT > 37 && Objects.equals(Util.getSystemProperty("persist.audio.compressed_offload_implicit_aac"), CredentialEntry.FALSE_STRING);
    }

    private void updateAudioCapabilitiesReceiver(AudioOutputProvider.FormatConfig formatConfig) {
        Context context;
        verifySinglePlaybackLooper();
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver == null && (context = this.context) != null) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver2 = new AudioCapabilitiesReceiver(context, new AudioCapabilitiesReceiver.Listener() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutputProvider$$ExternalSyntheticLambda0
                @Override // androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener
                public final void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities) {
                    this.f$0.onAudioCapabilitiesChanged(audioCapabilities);
                }
            }, formatConfig.audioAttributes, formatConfig.preferredDevice);
            this.audioCapabilitiesReceiver = audioCapabilitiesReceiver2;
            this.audioCapabilities = audioCapabilitiesReceiver2.register();
        } else if (audioCapabilitiesReceiver != null) {
            AudioDeviceInfo audioDeviceInfo = formatConfig.preferredDevice;
            if (audioDeviceInfo != null) {
                audioCapabilitiesReceiver.setRoutedDevice(audioDeviceInfo);
            }
            this.audioCapabilitiesReceiver.setAudioAttributes(formatConfig.audioAttributes);
        }
        an.B(this.audioCapabilities);
    }

    private void verifySinglePlaybackLooper() {
        if (this.context == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.playbackLooper;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        an.z(z, "AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", getLooperThreadName(looper), getLooperThreadName(looperMyLooper));
        this.playbackLooper = looperMyLooper;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void addListener(AudioOutputProvider.Listener listener) {
        verifySinglePlaybackLooper();
        ListenerSet<AudioOutputProvider.Listener> listenerSet = this.listeners;
        if (listenerSet == null) {
            listenerSet = new ListenerSet<>(Thread.currentThread());
            this.listeners = listenerSet;
        }
        listenerSet.add(listener);
    }

    public AudioCapabilities getAudioCapabilities() {
        return this.audioCapabilities;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public AudioTrackAudioOutput getAudioOutput(AudioOutputProvider.OutputConfig outputConfig) throws AudioOutputProvider.InitializationException, UnsupportedOperationException, IllegalArgumentException {
        AudioTrack audioTrackBuild;
        try {
            int i2 = outputConfig.audioSessionId;
            Context context = null;
            if (outputConfig.virtualDeviceId != -1 && this.context != null && Build.VERSION.SDK_INT >= 34) {
                Context context2 = this.contextWithDeviceId;
                if (context2 == null || context2.getDeviceId() != outputConfig.virtualDeviceId) {
                    this.contextWithDeviceId = this.context.createDeviceContext(outputConfig.virtualDeviceId);
                }
                context = this.contextWithDeviceId;
                i2 = 0;
            }
            if (this.audioTrackProvider != null) {
                audioTrackBuild = this.audioTrackProvider.getAudioTrack(getAudioTrackConfig(outputConfig), outputConfig.audioAttributes, i2, context);
            } else {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(getAudioTrackAttributes(outputConfig.audioAttributes, outputConfig.isTunneling)).setAudioFormat(new AudioFormat.Builder().setSampleRate(outputConfig.sampleRate).setChannelMask(outputConfig.channelMask).setEncoding(outputConfig.encoding).build()).setTransferMode(1).setBufferSizeInBytes(outputConfig.bufferSize).setSessionId(i2);
                sessionId.setOffloadedPlayback(outputConfig.isOffload);
                if (Build.VERSION.SDK_INT >= 34 && context != null) {
                    sessionId.setContext(context);
                }
                BiConsumer<AudioTrack.Builder, AudioOutputProvider.OutputConfig> biConsumer = this.builderModifier;
                if (biConsumer != null) {
                    biConsumer.accept(sessionId, outputConfig);
                }
                audioTrackBuild = sessionId.build();
            }
            AudioTrack audioTrack = audioTrackBuild;
            if (audioTrack.getState() == 1) {
                return new AudioTrackAudioOutput(audioTrack, outputConfig, this.capabilityChangeListener, this.maxPlaybackSpeed, this.clock);
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new AudioOutputProvider.InitializationException();
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            throw new AudioOutputProvider.InitializationException(e2);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public AudioOutputProvider.FormatSupport getFormatSupport(AudioOutputProvider.FormatConfig formatConfig) {
        updateAudioCapabilitiesReceiver(formatConfig);
        AudioOffloadSupport audioOffloadSupport = this.audioOffloadSupportProvider.getAudioOffloadSupport(formatConfig.format, formatConfig.audioAttributes);
        AudioOutputProvider.FormatSupport.Builder builder = new AudioOutputProvider.FormatSupport.Builder();
        builder.setFormatSupportLevel(getFormatSupportLevel(formatConfig));
        builder.setIsFormatSupportedForOffload(audioOffloadSupport.isFormatSupported);
        builder.setIsGaplessSupportedForOffload(audioOffloadSupport.isGaplessSupported);
        builder.setIsSpeedChangeSupportedForOffload(audioOffloadSupport.isSpeedChangeSupported);
        return builder.build();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public AudioOutputProvider.OutputConfig getOutputConfig(AudioOutputProvider.FormatConfig formatConfig) throws AudioOutputProvider.ConfigurationException {
        int i2;
        boolean z;
        int i3;
        int i4;
        int audioOutputChannelConfig;
        int pcmFrameSize;
        boolean z2;
        Format format = formatConfig.format;
        updateAudioCapabilitiesReceiver(formatConfig);
        if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_RAW)) {
            an.l(Util.isEncodingLinearPcm(format.pcmEncoding));
            int i5 = format.pcmEncoding;
            i2 = format.sampleRate;
            audioOutputChannelConfig = getAudioOutputChannelConfig(format);
            pcmFrameSize = Util.getPcmFrameSize(i5, format.channelCount);
            z = formatConfig.enablePlaybackParameters;
            i3 = i5;
            z2 = false;
            i4 = 0;
        } else {
            i2 = format.sampleRate;
            AudioOffloadSupport audioOffloadSupport = formatConfig.enableOffload ? this.audioOffloadSupportProvider.getAudioOffloadSupport(format, formatConfig.audioAttributes) : AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            if (formatConfig.enableOffload && audioOffloadSupport.isFormatSupported) {
                String str = format.sampleMimeType;
                an.B(str);
                int encoding = MimeTypes.getEncoding(str, format.codecs);
                int audioOutputChannelConfig2 = getAudioOutputChannelConfig(format);
                if (encoding == 11) {
                    if (i2 >= 16000 && !COMPRESSED_OFFLOAD_EXPLICIT_AAC_ENABLED.get2().booleanValue()) {
                        if (encoding == 12 && format.channelCount == 2) {
                            audioOutputChannelConfig2 = 4;
                        }
                        i2 >>= 1;
                        encoding = 10;
                    }
                    z2 = audioOffloadSupport.isGaplessSupported;
                    pcmFrameSize = -1;
                    i4 = 1;
                    i3 = encoding;
                    audioOutputChannelConfig = audioOutputChannelConfig2;
                    z = true;
                } else {
                    if (encoding == 12) {
                        encoding = 12;
                        if (i2 >= 16000) {
                            if (encoding == 12) {
                                audioOutputChannelConfig2 = 4;
                            }
                            i2 >>= 1;
                            encoding = 10;
                        }
                    }
                    z2 = audioOffloadSupport.isGaplessSupported;
                    pcmFrameSize = -1;
                    i4 = 1;
                    i3 = encoding;
                    audioOutputChannelConfig = audioOutputChannelConfig2;
                    z = true;
                }
            } else {
                Pair<Integer, Integer> encodingAndChannelConfigForPassthrough = this.audioCapabilities.getEncodingAndChannelConfigForPassthrough(format, formatConfig.audioAttributes);
                if (encodingAndChannelConfigForPassthrough == null) {
                    throw new AudioOutputProvider.ConfigurationException("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(format))));
                }
                int iIntValue = ((Integer) encodingAndChannelConfigForPassthrough.first).intValue();
                int iIntValue2 = ((Integer) encodingAndChannelConfigForPassthrough.second).intValue();
                z = formatConfig.enablePlaybackParameters;
                i3 = iIntValue;
                i4 = 2;
                audioOutputChannelConfig = iIntValue2;
                pcmFrameSize = -1;
                z2 = false;
            }
        }
        int i6 = format.bitrate;
        if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_DTS_EXPRESS) && i6 == -1) {
            i6 = 768000;
        }
        int i7 = i6;
        int bufferSizeInBytes = formatConfig.preferredBufferSize;
        if (bufferSizeInBytes == -1) {
            int i8 = i2;
            bufferSizeInBytes = this.audioTrackBufferSizeProvider.getBufferSizeInBytes(getAudioTrackMinBufferSize(i2, audioOutputChannelConfig, i3), i3, i4, pcmFrameSize == -1 ? 1 : pcmFrameSize, i8, i7, z ? this.maxPlaybackSpeed : 1.0d);
            i2 = i8;
        }
        AudioOutputProvider.OutputConfig.Builder builder = new AudioOutputProvider.OutputConfig.Builder();
        builder.setSampleRate(i2);
        builder.setChannelMask(audioOutputChannelConfig);
        builder.setEncoding(i3);
        builder.setBufferSize(bufferSizeInBytes);
        builder.setAudioSessionId(formatConfig.audioSessionId);
        builder.setAudioAttributes(formatConfig.audioAttributes);
        builder.setIsOffload(i4 == 1);
        builder.setIsTunneling(formatConfig.enableTunneling);
        builder.setUsePlaybackParameters(z);
        builder.setUseOffloadGapless(z2);
        builder.setVirtualDeviceId(formatConfig.virtualDeviceId);
        return builder.build();
    }

    void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities) {
        verifySinglePlaybackLooper();
        AudioCapabilities audioCapabilities2 = this.audioCapabilities;
        if (audioCapabilities2 == null || audioCapabilities.equals(audioCapabilities2)) {
            return;
        }
        this.audioCapabilities = audioCapabilities;
        ListenerSet<AudioOutputProvider.Listener> listenerSet = this.listeners;
        if (listenerSet != null) {
            listenerSet.sendEvent(new ListenerSet.Event() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutputProvider$$ExternalSyntheticLambda1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((AudioOutputProvider.Listener) obj).onFormatSupportChanged();
                }
            });
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void release() {
        ListenerSet<AudioOutputProvider.Listener> listenerSet = this.listeners;
        if (listenerSet != null) {
            listenerSet.release();
        }
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.unregister();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void removeListener(AudioOutputProvider.Listener listener) {
        ListenerSet<AudioOutputProvider.Listener> listenerSet = this.listeners;
        if (listenerSet != null) {
            listenerSet.remove(listener);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void setClock(Clock clock) {
        this.clock = clock;
    }
}
