package androidx.camera.video;

import androidx.camera.video.AudioSpec;
import androidx.camera.video.VideoSpec;
import androidx.core.util.Consumer;
import h.g.b.o;
import h.g.b.x;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MediaSpec {
    public static final Companion Companion = new Companion(null);
    public static final int OUTPUT_FORMAT_MPEG_4 = 0;
    public static final int OUTPUT_FORMAT_UNSPECIFIED = -1;
    public static final int OUTPUT_FORMAT_WEBM = 1;
    private final AudioSpec audioSpec;
    private final int outputFormat;
    private final VideoSpec videoSpec;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputFormat {
    }

    public /* synthetic */ MediaSpec(VideoSpec videoSpec, AudioSpec audioSpec, int i2, int i3, o oVar) {
        this((i3 & 1) != 0 ? VideoSpec.Companion.getDEFAULT() : videoSpec, (i3 & 2) != 0 ? AudioSpec.Companion.getDEFAULT() : audioSpec, (i3 & 4) != 0 ? -1 : i2);
    }

    public static final Builder builder() {
        return Companion.builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSpec)) {
            return false;
        }
        MediaSpec mediaSpec = (MediaSpec) obj;
        return x.n(this.videoSpec, mediaSpec.videoSpec) && x.n(this.audioSpec, mediaSpec.audioSpec) && this.outputFormat == mediaSpec.outputFormat;
    }

    public final AudioSpec getAudioSpec() {
        return this.audioSpec;
    }

    public final int getOutputFormat() {
        return this.outputFormat;
    }

    public final VideoSpec getVideoSpec() {
        return this.videoSpec;
    }

    public int hashCode() {
        return Objects.hash(this.videoSpec, this.audioSpec, Integer.valueOf(this.outputFormat));
    }

    public final Builder toBuilder() {
        return new Builder().setVideoSpec(this.videoSpec).setAudioSpec(this.audioSpec).setOutputFormat(this.outputFormat);
    }

    public String toString() {
        return "MediaSpec{videoSpec=" + this.videoSpec + ", audioSpec=" + this.audioSpec + ", outputFormat=" + this.outputFormat + "}";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Builder builder() {
            return new Builder();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private AudioSpec audioSpec = AudioSpec.Companion.getDEFAULT();
        private VideoSpec videoSpec = VideoSpec.Companion.getDEFAULT();
        private int outputFormat = -1;

        public final MediaSpec build() {
            return new MediaSpec(this.videoSpec, this.audioSpec, this.outputFormat);
        }

        public final Builder configureAudio(Consumer<AudioSpec.Builder> consumer) {
            x.f(consumer, "configBlock");
            AudioSpec.Builder builder = this.audioSpec.toBuilder();
            consumer.accept(builder);
            this.audioSpec = builder.build();
            return this;
        }

        public final Builder configureVideo(Consumer<VideoSpec.Builder> consumer) {
            x.f(consumer, "configBlock");
            VideoSpec.Builder builder = this.videoSpec.toBuilder();
            consumer.accept(builder);
            this.videoSpec = builder.build();
            return this;
        }

        public final Builder setAudioSpec(AudioSpec audioSpec) {
            x.f(audioSpec, "audioSpec");
            this.audioSpec = audioSpec;
            return this;
        }

        public final Builder setOutputFormat(int i2) {
            this.outputFormat = i2;
            return this;
        }

        public final Builder setVideoSpec(VideoSpec videoSpec) {
            x.f(videoSpec, "videoSpec");
            this.videoSpec = videoSpec;
            return this;
        }

        private static /* synthetic */ void getOutputFormat$annotations() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSpec(VideoSpec videoSpec) {
        this(videoSpec, null, 0, 6, null);
        x.f(videoSpec, "videoSpec");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSpec(VideoSpec videoSpec, AudioSpec audioSpec) {
        this(videoSpec, audioSpec, 0, 4, null);
        x.f(videoSpec, "videoSpec");
        x.f(audioSpec, "audioSpec");
    }

    public MediaSpec(VideoSpec videoSpec, AudioSpec audioSpec, int i2) {
        x.f(videoSpec, "videoSpec");
        x.f(audioSpec, "audioSpec");
        this.videoSpec = videoSpec;
        this.audioSpec = audioSpec;
        this.outputFormat = i2;
    }

    public MediaSpec() {
        this(null, null, 0, 7, null);
    }
}
