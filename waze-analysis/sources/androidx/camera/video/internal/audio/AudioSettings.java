package androidx.camera.video.internal.audio;

import androidx.camera.video.internal.audio.AutoValue_AudioSettings;
import androidx.media3.container.OpusUtil;
import androidx.media3.extractor.DtsUtil;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class AudioSettings {
    public static final List<Integer> COMMON_SAMPLE_RATES = DesugarCollections.unmodifiableList(Arrays.asList(Integer.valueOf(DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND), Integer.valueOf(OpusUtil.SAMPLE_RATE), 44100, 24000, 22050, 16000, 12000, 11025, 8000, 4800));

    /* compiled from: WazeSource */
    public abstract class Builder {
        Builder() {
        }

        abstract AudioSettings autoBuild();

        public final AudioSettings build() {
            AudioSettings audioSettingsAutoBuild = autoBuild();
            int audioSource = audioSettingsAutoBuild.getAudioSource();
            int captureSampleRate = audioSettingsAutoBuild.getCaptureSampleRate();
            String strConcat = audioSource == -1 ? " audioSource" : "";
            if (captureSampleRate <= 0) {
                strConcat = strConcat.concat(" captureSampleRate");
            }
            if (audioSettingsAutoBuild.getEncodeSampleRate() <= 0) {
                strConcat = strConcat.concat(" encodeSampleRate");
            }
            if (audioSettingsAutoBuild.getChannelCount() <= 0) {
                strConcat = strConcat.concat(" channelCount");
            }
            if (audioSettingsAutoBuild.getAudioFormat() == -1) {
                strConcat = strConcat.concat(" audioFormat");
            }
            if (strConcat.isEmpty()) {
                return audioSettingsAutoBuild;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:".concat(strConcat));
        }

        public abstract Builder setAudioFormat(int i2);

        public abstract Builder setAudioSource(int i2);

        public abstract Builder setCaptureSampleRate(int i2);

        public abstract Builder setChannelCount(int i2);

        public abstract Builder setEncodeSampleRate(int i2);
    }

    AudioSettings() {
    }

    public static Builder builder() {
        AutoValue_AudioSettings.Builder builder = new AutoValue_AudioSettings.Builder();
        builder.setAudioSource(-1);
        builder.setCaptureSampleRate(-1);
        builder.setEncodeSampleRate(-1);
        builder.setChannelCount(-1);
        builder.setAudioFormat(-1);
        return builder;
    }

    public abstract int getAudioFormat();

    public abstract int getAudioSource();

    public int getBytesPerFrame() {
        return AudioUtils.getBytesPerFrame(getAudioFormat(), getChannelCount());
    }

    public abstract int getCaptureSampleRate();

    public abstract int getChannelCount();

    public abstract int getEncodeSampleRate();

    public abstract Builder toBuilder();
}
