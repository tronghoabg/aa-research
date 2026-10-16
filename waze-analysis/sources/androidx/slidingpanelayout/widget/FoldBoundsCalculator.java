package androidx.slidingpanelayout.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.window.layout.FoldingFeature;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class FoldBoundsCalculator {
    private final int[] tmpIntArray = new int[2];
    private final Rect splitViewPositionsTmpRect = new Rect();
    private final Rect getFoldBoundsInViewTmpRect = new Rect();

    private final boolean getFoldBoundsInView(FoldingFeature foldingFeature, View view, Rect rect) {
        int[] iArr = this.tmpIntArray;
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        int width = view.getWidth() + i2;
        int width2 = view.getWidth() + i3;
        Rect rect2 = this.getFoldBoundsInViewTmpRect;
        rect2.set(i2, i3, width, width2);
        rect.set(foldingFeature.getBounds());
        boolean zIntersect = rect.intersect(rect2);
        if ((rect.width() == 0 && rect.height() == 0) || !zIntersect) {
            return false;
        }
        rect.offset(-i2, -i3);
        return true;
    }

    public final boolean splitViewPositions(FoldingFeature foldingFeature, SlidingPaneLayout slidingPaneLayout, Rect rect, Rect rect2) {
        x.f(slidingPaneLayout, "parentView");
        x.f(rect, "outLeftRect");
        x.f(rect2, "outRightRect");
        if (foldingFeature == null || !foldingFeature.isSeparating() || foldingFeature.getBounds().left == 0) {
            return false;
        }
        Rect rect3 = this.splitViewPositionsTmpRect;
        if (foldingFeature.getBounds().top != 0 || !getFoldBoundsInView(foldingFeature, slidingPaneLayout, rect3)) {
            return false;
        }
        int paneSpacing = slidingPaneLayout.getPaneSpacing();
        rect.set(slidingPaneLayout.getPaddingLeft(), slidingPaneLayout.getPaddingTop(), Math.max(slidingPaneLayout.getPaddingLeft(), rect3.left - (paneSpacing / 2)), slidingPaneLayout.getHeight() - slidingPaneLayout.getPaddingBottom());
        int width = slidingPaneLayout.getWidth() - slidingPaneLayout.getPaddingRight();
        rect2.set(Math.min(width, rect3.right + ((paneSpacing + 1) / 2)), slidingPaneLayout.getPaddingTop(), width, slidingPaneLayout.getHeight() - slidingPaneLayout.getPaddingBottom());
        return true;
    }
}
