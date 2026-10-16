package androidx.camera.camera2.adapter;

import android.util.Range;
import android.util.Rational;
import androidx.camera.core.ExposureState;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class EvCompValue implements ExposureState {
    private final int index;
    private final Range<Integer> range;
    private final Rational step;
    private final boolean supported;

    public EvCompValue(boolean z, int i2, Range<Integer> range, Rational rational) {
        x.f(range, "range");
        x.f(rational, "step");
        this.supported = z;
        this.index = i2;
        this.range = range;
        this.step = rational;
    }

    private final boolean component1() {
        return this.supported;
    }

    private final int component2() {
        return this.index;
    }

    private final Range<Integer> component3() {
        return this.range;
    }

    private final Rational component4() {
        return this.step;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EvCompValue copy$default(EvCompValue evCompValue, boolean z, int i2, Range range, Rational rational, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = evCompValue.supported;
        }
        if ((i3 & 2) != 0) {
            i2 = evCompValue.index;
        }
        if ((i3 & 4) != 0) {
            range = evCompValue.range;
        }
        if ((i3 & 8) != 0) {
            rational = evCompValue.step;
        }
        return evCompValue.copy(z, i2, range, rational);
    }

    public final EvCompValue copy(boolean z, int i2, Range<Integer> range, Rational rational) {
        x.f(range, "range");
        x.f(rational, "step");
        return new EvCompValue(z, i2, range, rational);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvCompValue)) {
            return false;
        }
        EvCompValue evCompValue = (EvCompValue) obj;
        return this.supported == evCompValue.supported && this.index == evCompValue.index && x.n(this.range, evCompValue.range) && x.n(this.step, evCompValue.step);
    }

    @Override // androidx.camera.core.ExposureState
    public int getExposureCompensationIndex() {
        return this.index;
    }

    @Override // androidx.camera.core.ExposureState
    public Range<Integer> getExposureCompensationRange() {
        return this.range;
    }

    @Override // androidx.camera.core.ExposureState
    public Rational getExposureCompensationStep() {
        return this.step;
    }

    public int hashCode() {
        return (((((EvCompValue$$ExternalSyntheticBackport0.m(this.supported) * 31) + this.index) * 31) + this.range.hashCode()) * 31) + this.step.hashCode();
    }

    @Override // androidx.camera.core.ExposureState
    public boolean isExposureCompensationSupported() {
        return this.supported;
    }

    public String toString() {
        return "EvCompValue(supported=" + this.supported + ", index=" + this.index + ", range=" + this.range + ", step=" + this.step + ")";
    }

    public final EvCompValue updateIndex$camera_camera2(int i2) {
        return copy$default(this, false, i2, null, null, 13, null);
    }
}
