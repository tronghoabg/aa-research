package androidx.camera.camera2.adapter;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.ExposureState;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExposureStateAdapter implements ExposureState {
    private final CameraProperties cameraProperties;
    private final int exposureCompensation;

    public ExposureStateAdapter(CameraProperties cameraProperties, int i2) {
        x.f(cameraProperties, "cameraProperties");
        this.cameraProperties = cameraProperties;
        this.exposureCompensation = i2;
    }

    @Override // androidx.camera.core.ExposureState
    public int getExposureCompensationIndex() {
        return this.exposureCompensation;
    }

    @Override // androidx.camera.core.ExposureState
    public Range<Integer> getExposureCompensationRange() {
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
        x.e(key, "CONTROL_AE_COMPENSATION_RANGE");
        Range<Integer> range = (Range) metadata.get(key);
        return range == null ? ExposureStateAdapterKt.getEMPTY_RANGE() : range;
    }

    @Override // androidx.camera.core.ExposureState
    public Rational getExposureCompensationStep() {
        if (!isExposureCompensationSupported()) {
            Rational rational = Rational.ZERO;
            x.e(rational, "ZERO");
            return rational;
        }
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP;
        x.e(key, "CONTROL_AE_COMPENSATION_STEP");
        Object obj = metadata.get((CameraCharacteristics.Key<Object>) key);
        x.c(obj);
        return (Rational) obj;
    }

    @Override // androidx.camera.core.ExposureState
    public boolean isExposureCompensationSupported() {
        Range<Integer> exposureCompensationRange = getExposureCompensationRange();
        Integer num = (Integer) exposureCompensationRange.getLower();
        if (num != null && num.intValue() == 0) {
            return false;
        }
        Integer num2 = (Integer) exposureCompensationRange.getUpper();
        return num2 == null || num2.intValue() != 0;
    }
}
