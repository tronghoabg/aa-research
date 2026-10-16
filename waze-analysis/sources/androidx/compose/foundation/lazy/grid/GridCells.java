package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface GridCells {

    /* compiled from: WazeSource */
    public final class Fixed implements GridCells {
        public static final int $stable = 0;
        private final int count;

        public Fixed(int i2) {
            this.count = i2;
            if (i2 > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Provided count should be larger than zero");
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List<Integer> calculateCrossAxisCellSizes(Density density, int i2, int i3) {
            return LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i2, this.count, i3);
        }

        public boolean equals(Object obj) {
            return (obj instanceof Fixed) && this.count == ((Fixed) obj).count;
        }

        public int hashCode() {
            return -this.count;
        }
    }

    List<Integer> calculateCrossAxisCellSizes(Density density, int i2, int i3);

    /* compiled from: WazeSource */
    public final class Adaptive implements GridCells {
        public static final int $stable = 0;
        private final float minSize;

        private Adaptive(float f2) {
            this.minSize = f2;
            if (Dp.m11163compareTo0680j_4(f2, 0.0f) > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Provided min size should be larger than zero.");
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List<Integer> calculateCrossAxisCellSizes(Density density, int i2, int i3) {
            return LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i2, Math.max((i2 + i3) / (density.mo2121roundToPx0680j_4(this.minSize) + i3), 1), i3);
        }

        public boolean equals(Object obj) {
            return (obj instanceof Adaptive) && Dp.m11169equalsimpl0(this.minSize, ((Adaptive) obj).minSize);
        }

        public int hashCode() {
            return Dp.m11170hashCodeimpl(this.minSize);
        }

        public /* synthetic */ Adaptive(float f2, o oVar) {
            this(f2);
        }
    }

    /* compiled from: WazeSource */
    public final class FixedSize implements GridCells {
        public static final int $stable = 0;
        private final float size;

        private FixedSize(float f2) {
            this.size = f2;
            if (Dp.m11163compareTo0680j_4(f2, 0.0f) > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Provided size should be larger than zero.");
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List<Integer> calculateCrossAxisCellSizes(Density density, int i2, int i3) {
            int iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(this.size);
            int i4 = iMo2121roundToPx0680j_4 + i3;
            int i5 = i3 + i2;
            int i6 = 0;
            if (i4 >= i5) {
                ArrayList arrayList = new ArrayList(1);
                while (i6 <= 0) {
                    arrayList.add(Integer.valueOf(i2));
                    i6++;
                }
                return arrayList;
            }
            int i7 = i5 / i4;
            ArrayList arrayList2 = new ArrayList(i7);
            while (i6 < i7) {
                arrayList2.add(Integer.valueOf(iMo2121roundToPx0680j_4));
                i6++;
            }
            return arrayList2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof FixedSize) && Dp.m11169equalsimpl0(this.size, ((FixedSize) obj).size);
        }

        public int hashCode() {
            return Dp.m11170hashCodeimpl(this.size);
        }

        public /* synthetic */ FixedSize(float f2, o oVar) {
            this(f2);
        }
    }
}
