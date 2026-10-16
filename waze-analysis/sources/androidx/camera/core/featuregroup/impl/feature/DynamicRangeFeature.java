package androidx.camera.core.featuregroup.impl.feature;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.impl.CameraInfoInternal;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DynamicRangeFeature extends GroupableFeature {
    public static final Companion Companion = new Companion(null);
    public static final DynamicRange DEFAULT_DYNAMIC_RANGE;
    private static final String TAG = "DynamicRangeFeature";
    private final DynamicRange dynamicRange;
    private final FeatureTypeInternal featureTypeInternal;

    static {
        DynamicRange dynamicRange = DynamicRange.SDR;
        x.e(dynamicRange, "SDR");
        DEFAULT_DYNAMIC_RANGE = dynamicRange;
    }

    public DynamicRangeFeature(DynamicRange dynamicRange) {
        x.f(dynamicRange, "dynamicRange");
        this.dynamicRange = dynamicRange;
        this.featureTypeInternal = FeatureTypeInternal.DYNAMIC_RANGE;
    }

    public final DynamicRange getDynamicRange() {
        return this.dynamicRange;
    }

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    public FeatureTypeInternal getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    public boolean isSupportedIndividually(CameraInfoInternal cameraInfoInternal, SessionConfig sessionConfig) {
        x.f(cameraInfoInternal, "cameraInfoInternal");
        x.f(sessionConfig, "sessionConfig");
        Set<DynamicRange> supportedDynamicRanges = cameraInfoInternal.getSupportedDynamicRanges();
        x.e(supportedDynamicRanges, "getSupportedDynamicRanges(...)");
        Logger.d(TAG, "isSupportedIndividually: cameraInfoSupportedDynamicRanges = " + supportedDynamicRanges + ", this = " + this);
        if (!supportedDynamicRanges.contains(this.dynamicRange)) {
            return false;
        }
        for (UseCase useCase : sessionConfig.getUseCases()) {
            Set<DynamicRange> supportedDynamicRanges2 = useCase.getSupportedDynamicRanges(cameraInfoInternal);
            Logger.d(TAG, "isSupportedIndividually: useCaseSupportedDynamicRanges = " + supportedDynamicRanges2 + ", this = " + this + ", useCases = " + useCase);
            if (supportedDynamicRanges2 != null && !supportedDynamicRanges2.contains(this.dynamicRange)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.dynamicRange + ")";
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
