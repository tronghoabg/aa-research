package androidx.compose.material3.internal;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class WindowAlignmentMarginPosition {
    public static final int $stable = 0;
    public static final WindowAlignmentMarginPosition INSTANCE = new WindowAlignmentMarginPosition();

    /* compiled from: WazeSource */
    public final class Horizontal implements MenuPosition.Horizontal {
        public static final int $stable = 0;
        private final Alignment.Horizontal alignment;
        private final int margin;

        public Horizontal(Alignment.Horizontal horizontal, int i2) {
            this.alignment = horizontal;
            this.margin = i2;
        }

        private final Alignment.Horizontal component1() {
            return this.alignment;
        }

        private final int component2() {
            return this.margin;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, Alignment.Horizontal horizontal2, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                horizontal2 = horizontal.alignment;
            }
            if ((i3 & 2) != 0) {
                i2 = horizontal.margin;
            }
            return horizontal.copy(horizontal2, i2);
        }

        public final Horizontal copy(Alignment.Horizontal horizontal, int i2) {
            return new Horizontal(horizontal, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Horizontal)) {
                return false;
            }
            Horizontal horizontal = (Horizontal) obj;
            return x.n(this.alignment, horizontal.alignment) && this.margin == horizontal.margin;
        }

        public int hashCode() {
            return (this.alignment.hashCode() * 31) + this.margin;
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Horizontal
        /* renamed from: position-95KtPRI */
        public int mo6179position95KtPRI(IntRect intRect, long j2, int i2, LayoutDirection layoutDirection) {
            int i3 = this.margin;
            int i4 = (int) (j2 >> 32);
            if (i2 >= i4 - (i3 + i3)) {
                return Alignment.Companion.getCenterHorizontally().align(i2, i4, layoutDirection);
            }
            int iAlign = this.alignment.align(i2, i4, layoutDirection);
            int i5 = this.margin;
            return n.j(iAlign, i5, (i4 - i5) - i2);
        }

        public String toString() {
            return "Horizontal(alignment=" + this.alignment + ", margin=" + this.margin + ')';
        }
    }

    /* compiled from: WazeSource */
    public final class Vertical implements MenuPosition.Vertical {
        public static final int $stable = 0;
        private final Alignment.Vertical alignment;
        private final int margin;

        public Vertical(Alignment.Vertical vertical, int i2) {
            this.alignment = vertical;
            this.margin = i2;
        }

        private final Alignment.Vertical component1() {
            return this.alignment;
        }

        private final int component2() {
            return this.margin;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, Alignment.Vertical vertical2, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                vertical2 = vertical.alignment;
            }
            if ((i3 & 2) != 0) {
                i2 = vertical.margin;
            }
            return vertical.copy(vertical2, i2);
        }

        public final Vertical copy(Alignment.Vertical vertical, int i2) {
            return new Vertical(vertical, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vertical)) {
                return false;
            }
            Vertical vertical = (Vertical) obj;
            return x.n(this.alignment, vertical.alignment) && this.margin == vertical.margin;
        }

        public int hashCode() {
            return (this.alignment.hashCode() * 31) + this.margin;
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Vertical
        /* renamed from: position-JVtK1S4 */
        public int mo6180positionJVtK1S4(IntRect intRect, long j2, int i2) {
            int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            int i4 = this.margin;
            return i2 >= i3 - (i4 + i4) ? Alignment.Companion.getCenterVertically().align(i2, i3) : n.j(this.alignment.align(i2, i3), i4, (i3 - i4) - i2);
        }

        public String toString() {
            return "Vertical(alignment=" + this.alignment + ", margin=" + this.margin + ')';
        }
    }

    private WindowAlignmentMarginPosition() {
    }
}
