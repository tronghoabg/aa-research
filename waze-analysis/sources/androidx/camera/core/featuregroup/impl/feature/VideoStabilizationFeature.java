package androidx.camera.core.featuregroup.impl.feature;

import androidx.camera.core.SessionConfig;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import h.g.b.o;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class VideoStabilizationFeature extends GroupableFeature {
    public static final Companion Companion = new Companion(null);
    public static final VideoStabilization DEFAULT_STABILIZATION = VideoStabilization.OFF;
    private final FeatureTypeInternal featureTypeInternal;
    private final VideoStabilization videoStabilization;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoStabilization.values().length];
            try {
                iArr[VideoStabilization.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoStabilization.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoStabilization.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoStabilization.UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoStabilizationFeature(VideoStabilization videoStabilization) {
        x.f(videoStabilization, "videoStabilization");
        this.videoStabilization = videoStabilization;
        this.featureTypeInternal = FeatureTypeInternal.VIDEO_STABILIZATION;
    }

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    public FeatureTypeInternal getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    public final VideoStabilization getVideoStabilization() {
        return this.videoStabilization;
    }

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    public boolean isSupportedIndividually(CameraInfoInternal cameraInfoInternal, SessionConfig sessionConfig) {
        x.f(cameraInfoInternal, "cameraInfoInternal");
        x.f(sessionConfig, "sessionConfig");
        VideoStabilization.Companion companion = VideoStabilization.Companion;
        int iOrdinal = this.videoStabilization.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return true;
        }
        if (iOrdinal == 2) {
            return cameraInfoInternal.isVideoStabilizationSupported();
        }
        if (iOrdinal == 3) {
            return cameraInfoInternal.isPreviewStabilizationSupported();
        }
        throw new i();
    }

    public String toString() {
        return "VideoStabilizationFeature(mode=" + this.videoStabilization.name() + ")";
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
