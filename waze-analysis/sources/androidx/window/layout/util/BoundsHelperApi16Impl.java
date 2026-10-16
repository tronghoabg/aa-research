package androidx.window.layout.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.WindowManager;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class BoundsHelperApi16Impl implements BoundsHelper {
    public static final BoundsHelperApi16Impl INSTANCE = new BoundsHelperApi16Impl();

    private BoundsHelperApi16Impl() {
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public Rect currentWindowBounds(Activity activity) {
        x.f(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayHelper displayHelper = DisplayHelper.INSTANCE;
        x.c(defaultDisplay);
        Point realSizeForDisplay = displayHelper.getRealSizeForDisplay(defaultDisplay);
        Rect rect = new Rect();
        if (realSizeForDisplay.x == 0 || realSizeForDisplay.y == 0) {
            defaultDisplay.getRectSize(rect);
            return rect;
        }
        rect.right = realSizeForDisplay.x;
        rect.bottom = realSizeForDisplay.y;
        return rect;
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public Rect maximumWindowBounds(Context context) {
        x.f(context, "context");
        Object systemService = context.getSystemService("window");
        x.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayHelper displayHelper = DisplayHelper.INSTANCE;
        x.c(defaultDisplay);
        Point realSizeForDisplay = displayHelper.getRealSizeForDisplay(defaultDisplay);
        return new Rect(0, 0, realSizeForDisplay.x, realSizeForDisplay.y);
    }
}
