package androidx.camera.video;

import h.g.b.o;
import h.g.b.x;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class VideoSpec {
    public static final int BITRATE_UNSPECIFIED = 0;
    public static final Companion Companion;
    private static final VideoSpec DEFAULT;
    public static final int ENCODE_FRAME_RATE_UNSPECIFIED = 0;
    private static final QualitySelector QUALITY_SELECTOR_UNSPECIFIED;
    private final int aspectRatio;
    private final int bitrate;
    private final int encodeFrameRate;
    private final String mimeType;
    private final QualitySelector qualitySelector;

    /* compiled from: WazeSource */
    public final class Builder {
        private int bitrate;
        private int encodeFrameRate;
        private QualitySelector qualitySelector = VideoSpec.Companion.getQUALITY_SELECTOR_UNSPECIFIED();
        private int aspectRatio = -1;
        private String mimeType = MediaConstants.MIME_TYPE_UNSPECIFIED;

        public final VideoSpec build() {
            return new VideoSpec(this.qualitySelector, this.encodeFrameRate, this.bitrate, this.aspectRatio, this.mimeType);
        }

        public final Builder setAspectRatio(int i2) {
            this.aspectRatio = i2;
            return this;
        }

        public final Builder setBitrate(int i2) {
            this.bitrate = i2;
            return this;
        }

        public final Builder setEncodeFrameRate(int i2) {
            this.encodeFrameRate = i2;
            return this;
        }

        public final Builder setMimeType(String str) {
            x.f(str, "mimeType");
            this.mimeType = str;
            return this;
        }

        public final Builder setQualitySelector(QualitySelector qualitySelector) {
            x.f(qualitySelector, "qualitySelector");
            this.qualitySelector = qualitySelector;
            return this;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        QualitySelector qualitySelector = QualitySelector.NONE;
        x.e(qualitySelector, "NONE");
        QUALITY_SELECTOR_UNSPECIFIED = qualitySelector;
        DEFAULT = companion.builder().build();
    }

    public /* synthetic */ VideoSpec(QualitySelector qualitySelector, int i2, int i3, int i4, String str, int i5, o oVar) {
        this((i5 & 1) != 0 ? QUALITY_SELECTOR_UNSPECIFIED : qualitySelector, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? -1 : i4, (i5 & 16) != 0 ? MediaConstants.MIME_TYPE_UNSPECIFIED : str);
    }

    public static final Builder builder() {
        return Companion.builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSpec)) {
            return false;
        }
        VideoSpec videoSpec = (VideoSpec) obj;
        return x.n(this.qualitySelector, videoSpec.qualitySelector) && this.encodeFrameRate == videoSpec.encodeFrameRate && this.bitrate == videoSpec.bitrate && this.aspectRatio == videoSpec.aspectRatio && x.n(this.mimeType, videoSpec.mimeType);
    }

    public final int getAspectRatio() {
        return this.aspectRatio;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getEncodeFrameRate() {
        return this.encodeFrameRate;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final QualitySelector getQualitySelector() {
        return this.qualitySelector;
    }

    public int hashCode() {
        return Objects.hash(this.qualitySelector, Integer.valueOf(this.encodeFrameRate), Integer.valueOf(this.bitrate), Integer.valueOf(this.aspectRatio), this.mimeType);
    }

    public final Builder toBuilder() {
        return new Builder().setQualitySelector(this.qualitySelector).setEncodeFrameRate(this.encodeFrameRate).setBitrate(this.bitrate).setAspectRatio(this.aspectRatio).setMimeType(this.mimeType);
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.qualitySelector + ", encodeFrameRate=" + this.encodeFrameRate + ", bitrate=" + this.bitrate + ", aspectRatio=" + this.aspectRatio + ", mimeType=" + this.mimeType + "}";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Builder builder() {
            return new Builder();
        }

        public final VideoSpec getDEFAULT() {
            return VideoSpec.DEFAULT;
        }

        public final QualitySelector getQUALITY_SELECTOR_UNSPECIFIED() {
            return VideoSpec.QUALITY_SELECTOR_UNSPECIFIED;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSpec(QualitySelector qualitySelector) {
        this(qualitySelector, 0, 0, 0, null, 30, null);
        x.f(qualitySelector, "qualitySelector");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSpec(QualitySelector qualitySelector, int i2) {
        this(qualitySelector, i2, 0, 0, null, 28, null);
        x.f(qualitySelector, "qualitySelector");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSpec(QualitySelector qualitySelector, int i2, int i3) {
        this(qualitySelector, i2, i3, 0, null, 24, null);
        x.f(qualitySelector, "qualitySelector");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSpec(QualitySelector qualitySelector, int i2, int i3, int i4) {
        this(qualitySelector, i2, i3, i4, null, 16, null);
        x.f(qualitySelector, "qualitySelector");
    }

    public VideoSpec(QualitySelector qualitySelector, int i2, int i3, int i4, String str) {
        x.f(qualitySelector, "qualitySelector");
        x.f(str, "mimeType");
        this.qualitySelector = qualitySelector;
        this.encodeFrameRate = i2;
        this.bitrate = i3;
        this.aspectRatio = i4;
        this.mimeType = str;
    }

    public VideoSpec() {
        this(null, 0, 0, 0, null, 31, null);
    }
}
