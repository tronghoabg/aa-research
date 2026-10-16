package androidx.camera.video;

import android.util.Range;
import androidx.camera.core.Preview;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class HighSpeedVideoSessionConfig extends SessionConfig {
    private static final Companion Companion = new Companion(null);
    private static final int SLOW_MOTION_ENCODE_FRAME_RATE = 30;
    private final boolean isSlowMotionEnabled;
    private final Preview preview;
    private final VideoCapture<?> videoCapture;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighSpeedVideoSessionConfig(VideoCapture<?> videoCapture, Preview preview, Range<Integer> range, boolean z, boolean z2) {
        super(i.k(videoCapture, preview), null, null, range, null, null, z2, false, 1, false, null, DisplayStrings.DS_NOTIFICATIONS_SETTINGS_MENU_ITEM, null);
        x.f(videoCapture, "videoCapture");
        x.f(range, "frameRateRange");
        this.videoCapture = videoCapture;
        this.preview = preview;
        this.isSlowMotionEnabled = z;
        validateSettingsOrThrow(videoCapture, preview);
        if (z) {
            VideoOutput output = videoCapture.getOutput();
            x.d(output, "null cannot be cast to non-null type androidx.camera.video.Recorder");
            ((Recorder) output).setVideoEncodingFrameRate(30);
        }
    }

    private final void validateSettingsOrThrow(VideoCapture<?> videoCapture, Preview preview) {
        if (videoCapture.getMirrorMode() != 0) {
            throw new IllegalArgumentException("VideoCapture.Builder.setMirrorMode() is not allowed for high-speed video.");
        }
        if (!x.n(videoCapture.getTargetFrameRate(), StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            throw new IllegalArgumentException("VideoCapture.Builder.setTargetFrameRate() is not allowed for high-speed video.");
        }
        if (preview != null) {
            if (!x.n(preview.getTargetFrameRate(), StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                throw new IllegalArgumentException("Preview.Builder.setTargetFrameRate() is not allowed for high-speed video.");
            }
            UseCaseConfig<?> currentConfig = preview.getCurrentConfig();
            x.d(currentConfig, "null cannot be cast to non-null type androidx.camera.core.impl.ImageOutputConfig");
            ImageOutputConfig imageOutputConfig = (ImageOutputConfig) currentConfig;
            if (imageOutputConfig.getResolutionSelector(null) != null) {
                throw new IllegalArgumentException("Preview.Builder.setResolutionSelector() is not allowed for high-speed video.");
            }
            if (imageOutputConfig.getTargetResolution(null) != null) {
                throw new IllegalArgumentException("Preview.Builder.setTargetResolution() is not allowed for high-speed video.");
            }
            if (imageOutputConfig.hasTargetAspectRatio()) {
                throw new IllegalArgumentException("Preview.Builder.setTargetAspectRatio() is not allowed for high-speed video.");
            }
        }
    }

    public final Preview getPreview() {
        return this.preview;
    }

    public final VideoCapture<?> getVideoCapture() {
        return this.videoCapture;
    }

    public final boolean isSlowMotionEnabled() {
        return this.isSlowMotionEnabled;
    }

    @Override // androidx.camera.core.SessionConfig
    public String toString() {
        return "HighSpeedVideoSessionConfig@" + Integer.toHexString(System.identityHashCode(this)) + " {videoCapture=" + this.videoCapture + ", preview=" + this.preview + ", frameRateRange=" + getFrameRateRange() + ", isSlowMotionEnabled=" + this.isSlowMotionEnabled + ", isAutoRotationEnabled=" + isAutoRotationEnabled() + "}";
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private Range<Integer> _frameRateRange;
        private boolean _isAutoRotationEnabled;
        private boolean _isSlowMotionEnabled;
        private Preview _preview;
        private final VideoCapture<?> videoCapture;

        public Builder(VideoCapture<?> videoCapture) {
            x.f(videoCapture, "videoCapture");
            this.videoCapture = videoCapture;
            Range<Integer> range = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            x.e(range, "FRAME_RATE_RANGE_UNSPECIFIED");
            this._frameRateRange = range;
        }

        public final HighSpeedVideoSessionConfig build() {
            return new HighSpeedVideoSessionConfig(this.videoCapture, this._preview, this._frameRateRange, this._isSlowMotionEnabled, this._isAutoRotationEnabled);
        }

        public final /* synthetic */ Range getFrameRateRange() {
            return this._frameRateRange;
        }

        public final /* synthetic */ Preview getPreview() {
            return this._preview;
        }

        public final /* synthetic */ boolean isAutoRotationEnabled() {
            return this._isAutoRotationEnabled;
        }

        public final /* synthetic */ boolean isSlowMotionEnabled() {
            return this._isSlowMotionEnabled;
        }

        public final Builder setAutoRotationEnabled(boolean z) {
            this._isAutoRotationEnabled = z;
            return this;
        }

        public final Builder setFrameRateRange(Range<Integer> range) {
            x.f(range, "frameRateRange");
            this._frameRateRange = range;
            return this;
        }

        public final Builder setPreview(Preview preview) {
            this._preview = preview;
            return this;
        }

        public final Builder setSlowMotionEnabled(boolean z) {
            this._isSlowMotionEnabled = z;
            return this;
        }

        /* renamed from: setAutoRotationEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m1427setAutoRotationEnabled(boolean z) {
            this._isAutoRotationEnabled = z;
        }

        /* renamed from: setPreview, reason: collision with other method in class */
        public final /* synthetic */ void m1429setPreview(Preview preview) {
            this._preview = preview;
        }

        /* renamed from: setSlowMotionEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m1430setSlowMotionEnabled(boolean z) {
            this._isSlowMotionEnabled = z;
        }

        /* renamed from: setFrameRateRange, reason: collision with other method in class */
        public final /* synthetic */ void m1428setFrameRateRange(Range range) {
            x.f(range, "value");
            this._frameRateRange = range;
        }
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HighSpeedVideoSessionConfig(VideoCapture<?> videoCapture, Preview preview) {
        this(videoCapture, preview, null, false, 12, null);
        x.f(videoCapture, "videoCapture");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HighSpeedVideoSessionConfig(VideoCapture<?> videoCapture, Preview preview, Range<Integer> range) {
        this(videoCapture, preview, range, false, 8, null);
        x.f(videoCapture, "videoCapture");
        x.f(range, "frameRateRange");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HighSpeedVideoSessionConfig(VideoCapture<?> videoCapture, Preview preview, Range<Integer> range, boolean z) {
        this(videoCapture, preview, range, z, false);
        x.f(videoCapture, "videoCapture");
        x.f(range, "frameRateRange");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HighSpeedVideoSessionConfig(VideoCapture videoCapture, Preview preview, Range range, boolean z, int i2, o oVar) {
        if ((i2 & 4) != 0) {
            range = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            x.e(range, "FRAME_RATE_RANGE_UNSPECIFIED");
        }
        this(videoCapture, (i2 & 2) != 0 ? null : preview, range, z & ((i2 & 8) == 0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HighSpeedVideoSessionConfig(VideoCapture<?> videoCapture) {
        this(videoCapture, null, null, false, 14, null);
        x.f(videoCapture, "videoCapture");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HighSpeedVideoSessionConfig(VideoCapture videoCapture, Preview preview, Range range, boolean z, boolean z2, int i2, o oVar) {
        if ((i2 & 4) != 0) {
            range = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            x.e(range, "FRAME_RATE_RANGE_UNSPECIFIED");
        }
        this(videoCapture, (i2 & 2) != 0 ? null : preview, range, ((i2 & 8) == 0) & z, ((i2 & 16) == 0) & z2);
    }
}
