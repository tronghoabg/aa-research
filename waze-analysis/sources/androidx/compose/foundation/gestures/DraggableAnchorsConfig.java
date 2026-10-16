package androidx.compose.foundation.gestures;

import h.a.c;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;
    private final List<T> keys = new ArrayList();
    private float[] positions;

    public DraggableAnchorsConfig() {
        float[] fArr = new float[5];
        for (int i2 = 0; i2 < 5; i2++) {
            fArr[i2] = Float.NaN;
        }
        this.positions = fArr;
    }

    private final void expandPositions() {
        float[] fArrCopyOf = Arrays.copyOf(this.positions, this.keys.size() + 2);
        x.e(fArrCopyOf, "copyOf(...)");
        this.positions = fArrCopyOf;
    }

    public final void at(T t, float f2) {
        this.keys.add(t);
        if (this.positions.length < this.keys.size()) {
            expandPositions();
        }
        this.positions[this.keys.size() - 1] = f2;
    }

    public final List<T> buildKeys$foundation() {
        return this.keys;
    }

    public final float[] buildPositions$foundation() {
        return c.n(this.positions, 0, this.keys.size());
    }

    public final List<T> getKeys$foundation() {
        return this.keys;
    }

    public final float[] getPositions$foundation() {
        return this.positions;
    }

    public final void setPositions$foundation(float[] fArr) {
        this.positions = fArr;
    }
}
