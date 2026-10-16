package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface StaggeredGridCells {

    /* compiled from: WazeSource */
    public final class Fixed implements StaggeredGridCells {
        public static final int $stable = 0;
        private final int count;

        public Fixed(int i2) {
            this.count = i2;
            if (i2 > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("grid with no rows/columns");
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        public int[] calculateCrossAxisCellSizes(Density density, int i2, int i3) {
            return LazyStaggeredGridCellsKt.calculateCellsCrossAxisSizeImpl(i2, this.count, i3);
        }

        public boolean equals(Object obj) {
            return (obj instanceof Fixed) && this.count == ((Fixed) obj).count;
        }

        public int hashCode() {
            return -this.count;
        }
    }

    int[] calculateCrossAxisCellSizes(Density density, int i2, int i3);

    /* compiled from: WazeSource */
    public final class FixedSize implements StaggeredGridCells {
        public static final int $stable = 0;
        private final float size;

        private FixedSize(float f2) {
            this.size = f2;
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        public int[] calculateCrossAxisCellSizes(Density density, int i2, int i3) {
            int iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(this.size);
            int i4 = iMo2121roundToPx0680j_4 + i3;
            int i5 = i3 + i2;
            int i6 = 0;
            if (i4 >= i5) {
                int[] iArr = new int[1];
                while (i6 <= 0) {
                    iArr[i6] = i2;
                    i6++;
                }
                return iArr;
            }
            int i7 = i5 / i4;
            int[] iArr2 = new int[i7];
            while (i6 < i7) {
                iArr2[i6] = iMo2121roundToPx0680j_4;
                i6++;
            }
            return iArr2;
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

    /* compiled from: WazeSource */
    public final class Adaptive implements StaggeredGridCells {
        public static final int $stable = 0;
        private final float minSize;

        private Adaptive(float f2) {
            this.minSize = f2;
            if (Dp.m11163compareTo0680j_4(f2, 0.0f) > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("invalid minSize");
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        public int[] calculateCrossAxisCellSizes(Density density, int i2, int i3) {
            return LazyStaggeredGridCellsKt.calculateCellsCrossAxisSizeImpl(i2, Math.max((i2 + i3) / (density.mo2121roundToPx0680j_4(this.minSize) + i3), 1), i3);
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
}
