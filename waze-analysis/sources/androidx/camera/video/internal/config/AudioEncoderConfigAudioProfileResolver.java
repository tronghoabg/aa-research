package androidx.camera.video.internal.config;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import androidx.core.util.Supplier;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AudioEncoderConfigAudioProfileResolver implements Supplier<AudioEncoderConfig> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AudioEncAdPrflRslvr";
    private final int audioProfile;
    private final EncoderProfilesProxy.AudioProfileProxy audioProfileProxy;
    private final AudioSettings audioSettings;
    private final AudioSpec audioSpec;
    private final Timebase inputTimebase;
    private final String mimeType;

    public AudioEncoderConfigAudioProfileResolver(String str, int i2, Timebase timebase, AudioSpec audioSpec, AudioSettings audioSettings, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        x.f(str, "mimeType");
        x.f(timebase, "inputTimebase");
        x.f(audioSpec, "audioSpec");
        x.f(audioSettings, "audioSettings");
        x.f(audioProfileProxy, "audioProfileProxy");
        this.mimeType = str;
        this.audioProfile = i2;
        this.inputTimebase = timebase;
        this.audioSpec = audioSpec;
        this.audioSettings = audioSettings;
        this.audioProfileProxy = audioProfileProxy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public AudioEncoderConfig get() {
        int bitrate = this.audioSpec.getBitrate();
        if (bitrate == 0) {
            Logger.d(TAG, "Using resolved AUDIO bitrate from AudioProfile");
            EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.audioProfileProxy;
            AudioSettings audioSettings = this.audioSettings;
            bitrate = AudioConfigUtil.INSTANCE.scaleBitrate(audioProfileProxy.getBitrate(), audioSettings.getChannelCount(), audioProfileProxy.getChannels(), audioSettings.getEncodeSampleRate(), audioProfileProxy.getSampleRate());
        }
        String str = this.mimeType;
        AudioEncoderConfig.Builder builder = AudioEncoderConfig.builder();
        builder.setMimeType(str);
        builder.setProfile(this.audioProfile);
        builder.setInputTimebase(this.inputTimebase);
        builder.setChannelCount(this.audioSettings.getChannelCount());
        builder.setCaptureSampleRate(this.audioSettings.getCaptureSampleRate());
        builder.setEncodeSampleRate(this.audioSettings.getEncodeSampleRate());
        builder.setBitrate(bitrate);
        AudioEncoderConfig audioEncoderConfigBuild = builder.build();
        x.e(audioEncoderConfigBuild, "build(...)");
        return audioEncoderConfigBuild;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
