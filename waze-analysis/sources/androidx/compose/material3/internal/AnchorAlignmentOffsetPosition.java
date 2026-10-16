package androidx.compose.material3.internal;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AnchorAlignmentOffsetPosition {
    public static final int $stable = 0;
    public static final AnchorAlignmentOffsetPosition INSTANCE = new AnchorAlignmentOffsetPosition();

    /* compiled from: WazeSource */
    public final class Horizontal implements MenuPosition.Horizontal {
        public static final int $stable = 0;
        private final Alignment.Horizontal anchorAlignment;
        private final Alignment.Horizontal menuAlignment;
        private final int offset;

        public Horizontal(Alignment.Horizontal horizontal, Alignment.Horizontal horizontal2, int i2) {
            this.menuAlignment = horizontal;
            this.anchorAlignment = horizontal2;
            this.offset = i2;
        }

        private final Alignment.Horizontal component1() {
            return this.menuAlignment;
        }

        private final Alignment.Horizontal component2() {
            return this.anchorAlignment;
        }

        private final int component3() {
            return this.offset;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, Alignment.Horizontal horizontal2, Alignment.Horizontal horizontal3, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                horizontal2 = horizontal.menuAlignment;
            }
            if ((i3 & 2) != 0) {
                horizontal3 = horizontal.anchorAlignment;
            }
            if ((i3 & 4) != 0) {
                i2 = horizontal.offset;
            }
            return horizontal.copy(horizontal2, horizontal3, i2);
        }

        public final Horizontal copy(Alignment.Horizontal horizontal, Alignment.Horizontal horizontal2, int i2) {
            return new Horizontal(horizontal, horizontal2, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Horizontal)) {
                return false;
            }
            Horizontal horizontal = (Horizontal) obj;
            return x.n(this.menuAlignment, horizontal.menuAlignment) && x.n(this.anchorAlignment, horizontal.anchorAlignment) && this.offset == horizontal.offset;
        }

        public int hashCode() {
            return (((this.menuAlignment.hashCode() * 31) + this.anchorAlignment.hashCode()) * 31) + this.offset;
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Horizontal
        /* renamed from: position-95KtPRI, reason: not valid java name */
        public int mo6179position95KtPRI(IntRect intRect, long j2, int i2, LayoutDirection layoutDirection) {
            int iAlign = this.anchorAlignment.align(0, intRect.getWidth(), layoutDirection);
            int i3 = -this.menuAlignment.align(0, i2, layoutDirection);
            LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
            int i4 = this.offset;
            if (layoutDirection != layoutDirection2) {
                i4 = -i4;
            }
            return intRect.getLeft() + iAlign + i3 + i4;
        }

        public String toString() {
            return "Horizontal(menuAlignment=" + this.menuAlignment + ", anchorAlignment=" + this.anchorAlignment + ", offset=" + this.offset + ')';
        }
    }

    /* compiled from: WazeSource */
    public final class Vertical implements MenuPosition.Vertical {
        public static final int $stable = 0;
        private final Alignment.Vertical anchorAlignment;
        private final Alignment.Vertical menuAlignment;
        private final int offset;

        public Vertical(Alignment.Vertical vertical, Alignment.Vertical vertical2, int i2) {
            this.menuAlignment = vertical;
            this.anchorAlignment = vertical2;
            this.offset = i2;
        }

        private final Alignment.Vertical component1() {
            return this.menuAlignment;
        }

        private final Alignment.Vertical component2() {
            return this.anchorAlignment;
        }

        private final int component3() {
            return this.offset;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, Alignment.Vertical vertical2, Alignment.Vertical vertical3, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                vertical2 = vertical.menuAlignment;
            }
            if ((i3 & 2) != 0) {
                vertical3 = vertical.anchorAlignment;
            }
            if ((i3 & 4) != 0) {
                i2 = vertical.offset;
            }
            return vertical.copy(vertical2, vertical3, i2);
        }

        public final Vertical copy(Alignment.Vertical vertical, Alignment.Vertical vertical2, int i2) {
            return new Vertical(vertical, vertical2, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vertical)) {
                return false;
            }
            Vertical vertical = (Vertical) obj;
            return x.n(this.menuAlignment, vertical.menuAlignment) && x.n(this.anchorAlignment, vertical.anchorAlignment) && this.offset == vertical.offset;
        }

        public int hashCode() {
            return (((this.menuAlignment.hashCode() * 31) + this.anchorAlignment.hashCode()) * 31) + this.offset;
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Vertical
        /* renamed from: position-JVtK1S4, reason: not valid java name */
        public int mo6180positionJVtK1S4(IntRect intRect, long j2, int i2) {
            int iAlign = this.anchorAlignment.align(0, intRect.getHeight());
            return intRect.getTop() + iAlign + (-this.menuAlignment.align(0, i2)) + this.offset;
        }

        public String toString() {
            return "Vertical(menuAlignment=" + this.menuAlignment + ", anchorAlignment=" + this.anchorAlignment + ", offset=" + this.offset + ')';
        }
    }

    private AnchorAlignmentOffsetPosition() {
    }
}
