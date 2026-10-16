package androidx.camera.core.featuregroup;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.featuregroup.impl.feature.DynamicRangeFeature;
import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;
import androidx.camera.core.featuregroup.impl.feature.FpsRangeFeature;
import androidx.camera.core.featuregroup.impl.feature.ImageFormatFeature;
import androidx.camera.core.featuregroup.impl.feature.VideoStabilizationFeature;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import h.i;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class GroupableFeature {
    public static final Companion Companion = new Companion(null);
    public static final int FEATURE_TYPE_DYNAMIC_RANGE = 0;
    public static final int FEATURE_TYPE_FPS_RANGE = 1;
    public static final int FEATURE_TYPE_IMAGE_FORMAT = 3;
    public static final int FEATURE_TYPE_RECORDING_QUALITY = 4;
    public static final int FEATURE_TYPE_VIDEO_STABILIZATION = 2;
    public static final GroupableFeature FPS_60;
    public static final GroupableFeature HDR_HLG10;
    public static final GroupableFeature IMAGE_ULTRA_HDR;
    public static final GroupableFeature PREVIEW_STABILIZATION;
    private final f featureType$delegate = g.a(new a() { // from class: androidx.camera.core.featuregroup.GroupableFeature$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            GroupableFeature groupableFeature = this.f$0;
            return Integer.valueOf(groupableFeature.toFeatureType(groupableFeature.getFeatureTypeInternal()));
        }
    });

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FeatureType {
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeatureTypeInternal.values().length];
            try {
                iArr[FeatureTypeInternal.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeatureTypeInternal.FPS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FeatureTypeInternal.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FeatureTypeInternal.IMAGE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FeatureTypeInternal.RECORDING_QUALITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        DynamicRange dynamicRange = DynamicRange.HLG_10_BIT;
        x.e(dynamicRange, "HLG_10_BIT");
        HDR_HLG10 = new DynamicRangeFeature(dynamicRange);
        FPS_60 = new FpsRangeFeature(60, 60);
        PREVIEW_STABILIZATION = new VideoStabilizationFeature(VideoStabilization.PREVIEW);
        IMAGE_ULTRA_HDR = new ImageFormatFeature(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toFeatureType(FeatureTypeInternal featureTypeInternal) {
        FeatureTypeInternal featureTypeInternal2 = FeatureTypeInternal.DYNAMIC_RANGE;
        int iOrdinal = featureTypeInternal.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i2 = 1;
        if (iOrdinal != 1) {
            i2 = 2;
            if (iOrdinal != 2) {
                i2 = 3;
                if (iOrdinal != 3) {
                    if (iOrdinal == 4) {
                        return 4;
                    }
                    throw new i();
                }
            }
        }
        return i2;
    }

    public final int getFeatureType() {
        return ((Number) this.featureType$delegate.getValue()).intValue();
    }

    public abstract FeatureTypeInternal getFeatureTypeInternal();

    public boolean isSupportedIndividually(CameraInfoInternal cameraInfoInternal, SessionConfig sessionConfig) {
        x.f(cameraInfoInternal, "cameraInfoInternal");
        x.f(sessionConfig, "sessionConfig");
        return true;
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
