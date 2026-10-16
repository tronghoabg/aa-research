package androidx.compose.material3.internal;

import androidx.compose.material3.internal.AnchorAlignmentOffsetPosition;
import androidx.compose.material3.internal.WindowAlignmentMarginPosition;
import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MenuPosition {
    public static final int $stable = 0;
    public static final MenuPosition INSTANCE = new MenuPosition();

    /* compiled from: WazeSource */
    public interface Horizontal {
        /* renamed from: position-95KtPRI */
        int mo6179position95KtPRI(IntRect intRect, long j2, int i2, LayoutDirection layoutDirection);
    }

    /* compiled from: WazeSource */
    public interface Vertical {
        /* renamed from: position-JVtK1S4 */
        int mo6180positionJVtK1S4(IntRect intRect, long j2, int i2);
    }

    private MenuPosition() {
    }

    public static /* synthetic */ Vertical bottomToAnchorBottom$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        return menuPosition.bottomToAnchorBottom(i2);
    }

    public static /* synthetic */ Vertical bottomToAnchorTop$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        return menuPosition.bottomToAnchorTop(i2);
    }

    public static /* synthetic */ Vertical bottomToWindowBottom$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        return menuPosition.bottomToWindowBottom(i2);
    }

    public static /* synthetic */ Vertical centerToAnchorTop$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        return menuPosition.centerToAnchorTop(i2);
    }

    public static /* synthetic */ Horizontal endToAnchorEnd$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        return menuPosition.endToAnchorEnd(i2);
    }

    public static /* synthetic */ Horizontal endToAnchorStart$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        return menuPosition.endToAnchorStart(i2);
    }

    public static /* synthetic */ Horizontal leftToWindowLeft$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        return menuPosition.leftToWindowLeft(i2);
    }

    public static /* synthetic */ Horizontal rightToWindowRight$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        return menuPosition.rightToWindowRight(i2);
    }

    public static /* synthetic */ Horizontal startToAnchorEnd$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        return menuPosition.startToAnchorEnd(i2);
    }

    public static /* synthetic */ Horizontal startToAnchorStart$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        return menuPosition.startToAnchorStart(i2);
    }

    public static /* synthetic */ Vertical topToAnchorBottom$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        return menuPosition.topToAnchorBottom(i2);
    }

    public static /* synthetic */ Vertical topToAnchorTop$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        return menuPosition.topToAnchorTop(i2);
    }

    public static /* synthetic */ Vertical topToWindowTop$default(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        return menuPosition.topToWindowTop(i2);
    }

    public final Vertical bottomToAnchorBottom(int i2) {
        return new AnchorAlignmentOffsetPosition.Vertical(Alignment.Companion.getBottom(), Alignment.Companion.getBottom(), i2);
    }

    public final Vertical bottomToAnchorTop(int i2) {
        return new AnchorAlignmentOffsetPosition.Vertical(Alignment.Companion.getBottom(), Alignment.Companion.getTop(), i2);
    }

    public final Vertical bottomToWindowBottom(int i2) {
        return new WindowAlignmentMarginPosition.Vertical(Alignment.Companion.getBottom(), i2);
    }

    public final Vertical centerToAnchorTop(int i2) {
        return new AnchorAlignmentOffsetPosition.Vertical(Alignment.Companion.getCenterVertically(), Alignment.Companion.getTop(), i2);
    }

    public final Horizontal endToAnchorEnd(int i2) {
        return new AnchorAlignmentOffsetPosition.Horizontal(Alignment.Companion.getEnd(), Alignment.Companion.getEnd(), i2);
    }

    public final Horizontal endToAnchorStart(int i2) {
        return new AnchorAlignmentOffsetPosition.Horizontal(Alignment.Companion.getEnd(), Alignment.Companion.getStart(), i2);
    }

    public final Horizontal leftToWindowLeft(int i2) {
        return new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.INSTANCE.getLeft(), i2);
    }

    public final Horizontal rightToWindowRight(int i2) {
        return new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.INSTANCE.getRight(), i2);
    }

    public final Horizontal startToAnchorEnd(int i2) {
        return new AnchorAlignmentOffsetPosition.Horizontal(Alignment.Companion.getStart(), Alignment.Companion.getEnd(), i2);
    }

    public final Horizontal startToAnchorStart(int i2) {
        return new AnchorAlignmentOffsetPosition.Horizontal(Alignment.Companion.getStart(), Alignment.Companion.getStart(), i2);
    }

    public final Vertical topToAnchorBottom(int i2) {
        return new AnchorAlignmentOffsetPosition.Vertical(Alignment.Companion.getTop(), Alignment.Companion.getBottom(), i2);
    }

    public final Vertical topToAnchorTop(int i2) {
        return new AnchorAlignmentOffsetPosition.Vertical(Alignment.Companion.getTop(), Alignment.Companion.getTop(), i2);
    }

    public final Vertical topToWindowTop(int i2) {
        return new WindowAlignmentMarginPosition.Vertical(Alignment.Companion.getTop(), i2);
    }
}
