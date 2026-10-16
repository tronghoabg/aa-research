package androidx.window.layout.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.StrictMode;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import h.g.b.x;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class BoundsHelperApi28Impl implements BoundsHelper {
    public static final BoundsHelperApi28Impl INSTANCE = new BoundsHelperApi28Impl();

    private BoundsHelperApi28Impl() {
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public Rect currentWindowBounds(Activity activity) {
        x.f(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        try {
            try {
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                if (ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
                    Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                    x.d(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                    rect.set((Rect) objInvoke);
                } else {
                    Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                    x.d(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                    rect.set((Rect) objInvoke2);
                }
            } catch (Exception e2) {
                if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                    throw e2;
                }
                Log.w(BoundsHelper.Companion.getTAG(), e2);
                BoundsHelperKt.getRectSizeFromDisplay(activity, rect);
            }
            StrictMode.setVmPolicy(vmPolicy);
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
                int navigationBarHeight = BoundsHelperKt.getNavigationBarHeight(activity);
                if (rect.bottom + navigationBarHeight == point.y) {
                    rect.bottom += navigationBarHeight;
                } else if (rect.right + navigationBarHeight == point.x) {
                    rect.right += navigationBarHeight;
                } else if (rect.left == navigationBarHeight) {
                    rect.left = 0;
                }
            }
            if ((rect.width() < point.x || rect.height() < point.y) && !ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
                x.c(defaultDisplay);
                DisplayCutout cutoutForDisplay = BoundsHelperKt.getCutoutForDisplay(defaultDisplay);
                if (cutoutForDisplay != null) {
                    if (rect.left == DisplayCompatHelperApi28.INSTANCE.safeInsetLeft(cutoutForDisplay)) {
                        rect.left = 0;
                    }
                    if (point.x - rect.right == DisplayCompatHelperApi28.INSTANCE.safeInsetRight(cutoutForDisplay)) {
                        rect.right += DisplayCompatHelperApi28.INSTANCE.safeInsetRight(cutoutForDisplay);
                    }
                    if (rect.top == DisplayCompatHelperApi28.INSTANCE.safeInsetTop(cutoutForDisplay)) {
                        rect.top = 0;
                    }
                    if (point.y - rect.bottom == DisplayCompatHelperApi28.INSTANCE.safeInsetBottom(cutoutForDisplay)) {
                        rect.bottom += DisplayCompatHelperApi28.INSTANCE.safeInsetBottom(cutoutForDisplay);
                    }
                }
            }
            return rect;
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public Rect maximumWindowBounds(Context context) {
        x.f(context, "context");
        return BoundsHelperApi24Impl.INSTANCE.maximumWindowBounds(context);
    }
}
