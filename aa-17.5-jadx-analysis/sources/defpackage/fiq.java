package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.StrictMode;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class fiq implements fip {
    public static final fiq b = new fiq();

    @Override // defpackage.fip
    public final Rect a(Activity activity) {
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        DisplayCutout displayCutoutM310m = null;
        try {
            try {
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                if (activity.isInMultiWindowMode()) {
                    Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                    objInvoke.getClass();
                    rect.set((Rect) objInvoke);
                } else {
                    Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                    objInvoke2.getClass();
                    rect.set((Rect) objInvoke2);
                }
            } catch (Exception e) {
                if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                    throw e;
                }
                Log.w(fio.b, e);
                activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
            }
            StrictMode.setVmPolicy(vmPolicy);
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (!activity.isInMultiWindowMode()) {
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                if (rect.bottom + dimensionPixelSize == point.y) {
                    rect.bottom += dimensionPixelSize;
                } else if (rect.right + dimensionPixelSize == point.x) {
                    rect.right += dimensionPixelSize;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
            if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
                defaultDisplay.getClass();
                vmPolicy = StrictMode.getVmPolicy();
                try {
                    try {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        Object objNewInstance = constructor.newInstance(null);
                        Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay, objNewInstance);
                        Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(objNewInstance);
                        if (hg$$ExternalSyntheticApiModelOutline0.m$1(obj2)) {
                            displayCutoutM310m = hg$$ExternalSyntheticApiModelOutline0.m310m(obj2);
                        }
                    } catch (Exception e2) {
                        if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                            throw e2;
                        }
                        Log.w(fio.b, e2);
                    }
                    if (displayCutoutM310m != null) {
                        if (rect.left == displayCutoutM310m.getSafeInsetLeft()) {
                            rect.left = 0;
                        }
                        if (point.x - rect.right == displayCutoutM310m.getSafeInsetRight()) {
                            rect.right += displayCutoutM310m.getSafeInsetRight();
                        }
                        if (rect.top == displayCutoutM310m.getSafeInsetTop()) {
                            rect.top = 0;
                        }
                        if (point.y - rect.bottom == displayCutoutM310m.getSafeInsetBottom()) {
                            rect.bottom += displayCutoutM310m.getSafeInsetBottom();
                        }
                    }
                } finally {
                }
            }
            return rect;
        } finally {
        }
    }
}
