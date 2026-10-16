package androidx.camera.video.internal.audio;

import androidx.camera.video.internal.audio.AudioSettings;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class AutoValue_AudioSettings extends AudioSettings {
    private final int audioFormat;
    private final int audioSource;
    private final int captureSampleRate;
    private final int channelCount;
    private final int encodeSampleRate;

    private AutoValue_AudioSettings(int i2, int i3, int i4, int i5, int i6) {
        this.audioSource = i2;
        this.captureSampleRate = i3;
        this.encodeSampleRate = i4;
        this.channelCount = i5;
        this.audioFormat = i6;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioSettings) {
            AudioSettings audioSettings = (AudioSettings) obj;
            if (this.audioSource == audioSettings.getAudioSource() && this.captureSampleRate == audioSettings.getCaptureSampleRate() && this.encodeSampleRate == audioSettings.getEncodeSampleRate() && this.channelCount == audioSettings.getChannelCount() && this.audioFormat == audioSettings.getAudioFormat()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getAudioFormat() {
        return this.audioFormat;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getAudioSource() {
        return this.audioSource;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getCaptureSampleRate() {
        return this.captureSampleRate;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getChannelCount() {
        return this.channelCount;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getEncodeSampleRate() {
        return this.encodeSampleRate;
    }

    public int hashCode() {
        return this.audioFormat ^ ((((((((this.audioSource ^ 1000003) * 1000003) ^ this.captureSampleRate) * 1000003) ^ this.encodeSampleRate) * 1000003) ^ this.channelCount) * 1000003);
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public AudioSettings.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "AudioSettings{audioSource=" + this.audioSource + ", captureSampleRate=" + this.captureSampleRate + ", encodeSampleRate=" + this.encodeSampleRate + ", channelCount=" + this.channelCount + ", audioFormat=" + this.audioFormat + "}";
    }

    /* compiled from: WazeSource */
    final class Builder extends AudioSettings.Builder {
        private Integer audioFormat;
        private Integer audioSource;
        private Integer captureSampleRate;
        private Integer channelCount;
        private Integer encodeSampleRate;

        private Builder(AudioSettings audioSettings) {
            this.audioSource = Integer.valueOf(audioSettings.getAudioSource());
            this.captureSampleRate = Integer.valueOf(audioSettings.getCaptureSampleRate());
            this.encodeSampleRate = Integer.valueOf(audioSettings.getEncodeSampleRate());
            this.channelCount = Integer.valueOf(audioSettings.getChannelCount());
            this.audioFormat = Integer.valueOf(audioSettings.getAudioFormat());
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        AudioSettings autoBuild() {
            Integer num = this.audioSource;
            Integer num2 = this.captureSampleRate;
            String strConcat = num == null ? " audioSource" : "";
            if (num2 == null) {
                strConcat = strConcat.concat(" captureSampleRate");
            }
            if (this.encodeSampleRate == null) {
                strConcat = strConcat.concat(" encodeSampleRate");
            }
            if (this.channelCount == null) {
                strConcat = strConcat.concat(" channelCount");
            }
            if (this.audioFormat == null) {
                strConcat = strConcat.concat(" audioFormat");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_AudioSettings(this.audioSource.intValue(), this.captureSampleRate.intValue(), this.encodeSampleRate.intValue(), this.channelCount.intValue(), this.audioFormat.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setAudioFormat(int i2) {
            this.audioFormat = Integer.valueOf(i2);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setAudioSource(int i2) {
            this.audioSource = Integer.valueOf(i2);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setCaptureSampleRate(int i2) {
            this.captureSampleRate = Integer.valueOf(i2);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setChannelCount(int i2) {
            this.channelCount = Integer.valueOf(i2);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setEncodeSampleRate(int i2) {
            this.encodeSampleRate = Integer.valueOf(i2);
            return this;
        }

        Builder() {
        }
    }
}
