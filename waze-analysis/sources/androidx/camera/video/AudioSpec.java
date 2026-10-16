package androidx.camera.video;

import h.g.b.o;
import h.g.b.x;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AudioSpec {
    public static final int BITRATE_UNSPECIFIED = 0;
    public static final int CHANNEL_COUNT_MONO = 1;
    public static final int CHANNEL_COUNT_NONE = 0;
    public static final int CHANNEL_COUNT_STEREO = 2;
    public static final int CHANNEL_COUNT_UNSPECIFIED = -1;
    public static final Companion Companion;
    private static final AudioSpec DEFAULT;
    public static final int SAMPLE_RATE_UNSPECIFIED = 0;
    public static final int SOURCE_CAMCORDER = 5;
    public static final int SOURCE_DEFAULT = 0;
    public static final int SOURCE_FORMAT_PCM_16BIT = 2;
    public static final int SOURCE_FORMAT_UNSPECIFIED = -1;
    public static final int SOURCE_MIC = 1;
    public static final int SOURCE_UNPROCESSED = 9;
    public static final int SOURCE_UNSPECIFIED = -1;
    public static final int SOURCE_VOICE_COMMUNICATION = 7;
    public static final int SOURCE_VOICE_PERFORMANCE = 10;
    public static final int SOURCE_VOICE_RECOGNITION = 6;
    private final int bitrate;
    private final int channelCount;
    private final String mimeType;
    private final int sampleRate;
    private final int source;
    private final int sourceFormat;

    /* compiled from: WazeSource */
    public final class Builder {
        private int bitrate;
        private int sampleRate;
        private int sourceFormat = -1;
        private int source = -1;
        private int channelCount = -1;
        private String mimeType = MediaConstants.MIME_TYPE_UNSPECIFIED;

        public final AudioSpec build() {
            return new AudioSpec(this.bitrate, this.sourceFormat, this.source, this.sampleRate, this.channelCount, this.mimeType);
        }

        public final Builder setBitrate(int i2) {
            this.bitrate = i2;
            return this;
        }

        public final Builder setChannelCount(int i2) {
            this.channelCount = i2;
            return this;
        }

        public final Builder setMimeType(String str) {
            x.f(str, "mimeType");
            this.mimeType = str;
            return this;
        }

        public final Builder setSampleRate(int i2) {
            this.sampleRate = i2;
            return this;
        }

        public final Builder setSource(int i2) {
            this.source = i2;
            return this;
        }

        public final Builder setSourceFormat(int i2) {
            this.sourceFormat = i2;
            return this;
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ChannelCount {
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SourceFormat {
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        DEFAULT = companion.builder().build();
    }

    public /* synthetic */ AudioSpec(int i2, int i3, int i4, int i5, int i6, String str, int i7, o oVar) {
        this(1 == (i7 & 1) ? 0 : i2, (i7 & 2) != 0 ? -1 : i3, (i7 & 4) != 0 ? -1 : i4, (i7 & 8) != 0 ? 0 : i5, (i7 & 16) != 0 ? -1 : i6, (i7 & 32) != 0 ? MediaConstants.MIME_TYPE_UNSPECIFIED : str);
    }

    public static final Builder builder() {
        return Companion.builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioSpec)) {
            return false;
        }
        AudioSpec audioSpec = (AudioSpec) obj;
        return this.sourceFormat == audioSpec.sourceFormat && this.source == audioSpec.source && this.channelCount == audioSpec.channelCount && this.bitrate == audioSpec.bitrate && this.sampleRate == audioSpec.sampleRate && x.n(this.mimeType, audioSpec.mimeType);
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getChannelCount() {
        return this.channelCount;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }

    public final int getSource() {
        return this.source;
    }

    public final int getSourceFormat() {
        return this.sourceFormat;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.bitrate), Integer.valueOf(this.sourceFormat), Integer.valueOf(this.source), Integer.valueOf(this.sampleRate), Integer.valueOf(this.channelCount));
    }

    public final Builder toBuilder() {
        Builder sampleRate = new Builder().setSampleRate(this.sampleRate);
        sampleRate.setBitrate(this.bitrate);
        Builder source = sampleRate.setChannelCount(this.channelCount).setSource(this.source);
        source.setSourceFormat(this.sourceFormat);
        return source.setMimeType(this.mimeType);
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.bitrate + ", sourceFormat=" + this.sourceFormat + ", source=" + this.source + ", sampleRate=" + this.sampleRate + ", channelCount=" + this.channelCount + ", mimeType=" + this.mimeType + "}";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Builder builder() {
            return new Builder();
        }

        public final AudioSpec getDEFAULT() {
            return AudioSpec.DEFAULT;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public AudioSpec(int i2) {
        this(i2, 0, 0, 0, 0, null, 62, null);
    }

    public AudioSpec(int i2, int i3) {
        this(i2, i3, 0, 0, 0, null, 60, null);
    }

    public AudioSpec(int i2, int i3, int i4) {
        this(i2, i3, i4, 0, 0, null, 56, null);
    }

    public AudioSpec(int i2, int i3, int i4, int i5) {
        this(i2, i3, i4, i5, 0, null, 48, null);
    }

    public AudioSpec(int i2, int i3, int i4, int i5, int i6) {
        this(i2, i3, i4, i5, i6, null, 32, null);
    }

    public AudioSpec(int i2, int i3, int i4, int i5, int i6, String str) {
        x.f(str, "mimeType");
        this.bitrate = i2;
        this.sourceFormat = i3;
        this.source = i4;
        this.sampleRate = i5;
        this.channelCount = i6;
        this.mimeType = str;
    }

    public AudioSpec() {
        this(0, 0, 0, 0, 0, null, 63, null);
    }
}
