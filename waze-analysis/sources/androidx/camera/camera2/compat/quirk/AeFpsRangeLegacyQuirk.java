package androidx.camera.camera2.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AeFpsRangeLegacyQuirk implements AeFpsRangeQuirk {
    public static final Companion Companion = new Companion(null);
    private final f range$delegate;

    public AeFpsRangeLegacyQuirk(final CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "cameraMetadata");
        this.range$delegate = g.a(new a() { // from class: androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return AeFpsRangeLegacyQuirk.range_delegate$lambda$0(cameraMetadata, this);
            }
        });
    }

    private final Range<Integer> getCorrectedFpsRange(Range<Integer> range) {
        Integer numValueOf = (Integer) range.getUpper();
        Integer numValueOf2 = (Integer) range.getLower();
        if (((Number) range.getUpper()).intValue() >= 1000) {
            numValueOf = Integer.valueOf(((Number) range.getUpper()).intValue() / 1000);
        }
        if (((Number) range.getLower()).intValue() >= 1000) {
            numValueOf2 = Integer.valueOf(((Number) range.getLower()).intValue() / 1000);
        }
        return new Range<>(numValueOf2, numValueOf);
    }

    private final Range<Integer> getRange() {
        return (Range) this.range$delegate.getValue();
    }

    private final Range<Integer> pickSuitableFpsRange(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (rangeArr != null && (rangeArr.length) != 0) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> correctedFpsRange = getCorrectedFpsRange(range2);
                Integer num = (Integer) correctedFpsRange.getUpper();
                if (num != null && num.intValue() == 30 && (range == null || ((Number) correctedFpsRange.getLower()).intValue() < ((Number) range.getLower()).intValue())) {
                    range = correctedFpsRange;
                }
            }
        }
        return range;
    }

    static final Range range_delegate$lambda$0(CameraMetadata cameraMetadata, AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk) {
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
        x.e(key, "CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES");
        return aeFpsRangeLegacyQuirk.pickSuitableFpsRange((Range[]) cameraMetadata.get(key));
    }

    @Override // androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk
    public Range<Integer> getTargetAeFpsRange() {
        Range<Integer> range = getRange();
        if (range != null) {
            return range;
        }
        Range<Integer> range2 = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        x.e(range2, "FRAME_RATE_RANGE_UNSPECIFIED");
        return range2;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "cameraMetadata");
            return CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
