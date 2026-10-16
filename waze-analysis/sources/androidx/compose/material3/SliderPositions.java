package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import h.g.b.o;
import h.g.b.x;
import h.k.e;
import h.k.n;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SliderPositions {
    public static final int $stable = 0;
    private final MutableState activeRange$delegate;
    private final MutableState tickFractions$delegate;

    public /* synthetic */ SliderPositions(e eVar, float[] fArr, int i2, o oVar) {
        this((i2 & 1) != 0 ? n.b(0.0f, 1.0f) : eVar, (i2 & 2) != 0 ? new float[0] : fArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SliderPositions)) {
            return false;
        }
        SliderPositions sliderPositions = (SliderPositions) obj;
        return x.n(getActiveRange(), sliderPositions.getActiveRange()) && Arrays.equals(getTickFractions(), sliderPositions.getTickFractions());
    }

    public final e<Float> getActiveRange() {
        return (e) this.activeRange$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float[] getTickFractions() {
        return (float[]) this.tickFractions$delegate.getValue();
    }

    public int hashCode() {
        return (getActiveRange().hashCode() * 31) + Arrays.hashCode(getTickFractions());
    }

    public final void setActiveRange$material3(e<Float> eVar) {
        this.activeRange$delegate.setValue(eVar);
    }

    public final void setTickFractions$material3(float[] fArr) {
        this.tickFractions$delegate.setValue(fArr);
    }

    public SliderPositions(e<Float> eVar, float[] fArr) {
        this.activeRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(eVar, null, 2, null);
        this.tickFractions$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fArr, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SliderPositions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
