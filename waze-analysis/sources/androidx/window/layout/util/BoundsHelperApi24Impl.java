package androidx.window.layout.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class BoundsHelperApi24Impl implements BoundsHelper {
    public static final BoundsHelperApi24Impl INSTANCE = new BoundsHelperApi24Impl();

    private BoundsHelperApi24Impl() {
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public Rect currentWindowBounds(Activity activity) {
        x.f(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            DisplayHelper displayHelper = DisplayHelper.INSTANCE;
            x.c(defaultDisplay);
            Point realSizeForDisplay = displayHelper.getRealSizeForDisplay(defaultDisplay);
            int navigationBarHeight = BoundsHelperKt.getNavigationBarHeight(activity);
            if (rect.bottom + navigationBarHeight == realSizeForDisplay.y) {
                rect.bottom += navigationBarHeight;
                return rect;
            }
            if (rect.right + navigationBarHeight == realSizeForDisplay.x) {
                rect.right += navigationBarHeight;
            }
        }
        return rect;
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public Rect maximumWindowBounds(Context context) {
        x.f(context, "context");
        return BoundsHelperApi16Impl.INSTANCE.maximumWindowBounds(context);
    }
}
