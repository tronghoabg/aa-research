package androidx.camera.core.featuregroup.impl.feature;

import android.util.Range;
import androidx.camera.core.featuregroup.GroupableFeature;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FpsRangeFeature extends GroupableFeature {
    public static final Companion Companion = new Companion(null);
    public static final Range<Integer> DEFAULT_FPS_RANGE;
    private final FeatureTypeInternal featureTypeInternal = FeatureTypeInternal.FPS_RANGE;
    private final int maxFps;
    private final int minFps;

    static {
        Integer num = (Comparable) 30;
        DEFAULT_FPS_RANGE = new Range<>(num, num);
    }

    public FpsRangeFeature(int i2, int i3) {
        this.minFps = i2;
        this.maxFps = i3;
    }

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    public FeatureTypeInternal getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    public final int getMaxFps() {
        return this.maxFps;
    }

    public final int getMinFps() {
        return this.minFps;
    }

    public String toString() {
        return "FpsRangeFeature(minFps=" + this.minFps + ", maxFps=" + this.maxFps + ")";
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
