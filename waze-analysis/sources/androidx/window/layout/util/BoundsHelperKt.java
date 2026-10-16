package androidx.window.layout.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.StrictMode;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import com.waze.sound.fl$$ExternalSyntheticApiModelOutline0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class BoundsHelperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayCutout getCutoutForDisplay(Display display) {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        DisplayCutout displayCutoutM29256m = null;
        try {
            try {
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(display, objNewInstance);
                Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objNewInstance);
                if (fl$$ExternalSyntheticApiModelOutline0.m29261m(obj)) {
                    displayCutoutM29256m = fl$$ExternalSyntheticApiModelOutline0.m29256m(obj);
                }
            } catch (Exception e2) {
                if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                    throw e2;
                }
                Log.w(BoundsHelper.Companion.getTAG(), e2);
            }
            return displayCutoutM29256m;
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getNavigationBarHeight(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRectSizeFromDisplay(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
