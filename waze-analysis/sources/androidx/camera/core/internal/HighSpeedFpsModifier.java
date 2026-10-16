package androidx.camera.core.internal;

import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import h.g.b.o;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class HighSpeedFpsModifier {
    private static final Companion Companion = new Companion(null);
    private static final int PREVIEW_ONLY_FPS_LOWER = 30;
    private static final String TAG = "HighSpeedFpsModifier";

    private final boolean hasVideoSurface(CaptureConfig.Builder builder) {
        Set<DeferrableSurface> surfaces = builder.getSurfaces();
        x.e(surfaces, "getSurfaces(...)");
        Set<DeferrableSurface> set = surfaces;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (DeferrableSurface deferrableSurface : set) {
            x.c(deferrableSurface);
            if (isVideoSurface(deferrableSurface)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isHighSpeedFixedFps(Range<Integer> range) {
        return ((Number) range.getUpper()).intValue() >= 120 && x.n(range.getLower(), range.getUpper());
    }

    private final boolean isVideoSurface(DeferrableSurface deferrableSurface) {
        return x.n(deferrableSurface.getContainerClass(), MediaCodec.class);
    }

    private final Range<Integer> toPreviewOnlyRange(Range<Integer> range) {
        Range<Integer> range2 = new Range<>((Comparable) 30, range.getUpper());
        Logger.d(TAG, "Modified high-speed FPS range from " + range + " to " + range2);
        return range2;
    }

    public final void modifyFpsForPreviewOnlyRepeating(Collection<? extends SessionConfig.OutputConfig> collection, CaptureConfig.Builder builder) {
        Range<Integer> expectedFrameRateRange;
        x.f(collection, "outputConfigs");
        x.f(builder, "repeatingConfigBuilder");
        if (collection.size() != 2 || !hasVideoSurface(collection) || hasVideoSurface(builder) || (expectedFrameRateRange = builder.getExpectedFrameRateRange()) == null) {
            return;
        }
        if (true != isHighSpeedFixedFps(expectedFrameRateRange)) {
            expectedFrameRateRange = null;
        }
        if (expectedFrameRateRange != null) {
            builder.setExpectedFrameRateRange(toPreviewOnlyRange(expectedFrameRateRange));
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

    private final boolean hasVideoSurface(Collection<? extends SessionConfig.OutputConfig> collection) {
        Collection<? extends SessionConfig.OutputConfig> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            DeferrableSurface surface = ((SessionConfig.OutputConfig) it.next()).getSurface();
            x.e(surface, "getSurface(...)");
            if (isVideoSurface(surface)) {
                return true;
            }
        }
        return false;
    }
}
