package androidx.camera.video.internal.config;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import androidx.core.util.Supplier;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AudioEncoderConfigDefaultResolver implements Supplier<AudioEncoderConfig> {
    private static final int AUDIO_BITRATE_BASE = 156000;
    private static final int AUDIO_CHANNEL_COUNT_BASE = 2;
    private static final int AUDIO_SAMPLE_RATE_BASE = 48000;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AudioEncCfgDefaultRslvr";
    private final int audioProfile;
    private final AudioSettings audioSettings;
    private final AudioSpec audioSpec;
    private final Timebase inputTimeBase;
    private final String mimeType;

    public AudioEncoderConfigDefaultResolver(String str, int i2, Timebase timebase, AudioSpec audioSpec, AudioSettings audioSettings) {
        x.f(str, "mimeType");
        x.f(timebase, "inputTimeBase");
        x.f(audioSpec, "audioSpec");
        x.f(audioSettings, "audioSettings");
        this.mimeType = str;
        this.audioProfile = i2;
        this.inputTimeBase = timebase;
        this.audioSpec = audioSpec;
        this.audioSettings = audioSettings;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public AudioEncoderConfig get() {
        int bitrate = this.audioSpec.getBitrate();
        if (bitrate == 0) {
            Logger.d(TAG, "Using fallback AUDIO bitrate");
            AudioSettings audioSettings = this.audioSettings;
            bitrate = AudioConfigUtil.INSTANCE.scaleBitrate(AUDIO_BITRATE_BASE, audioSettings.getChannelCount(), 2, audioSettings.getEncodeSampleRate(), 48000);
        }
        String str = this.mimeType;
        AudioEncoderConfig.Builder builder = AudioEncoderConfig.builder();
        builder.setMimeType(str);
        builder.setProfile(this.audioProfile);
        builder.setInputTimebase(this.inputTimeBase);
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
