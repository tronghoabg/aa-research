package D3;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k1.h0;
import k1.i0;
import k1.j0;
import k1.k0;
import k1.v0;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2321b = 0;

    static {
        AbstractC3935e.i(1, 2, 4, 8, 16, 32, 64, 128);
    }

    public static l a(Activity activity) throws Exception {
        Rect rect;
        int i5;
        v0 v0VarB;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            rect = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
            AbstractC3340k.d(rect, "wm.currentWindowMetrics.bounds");
        } else {
            if (i10 >= 29) {
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                    AbstractC3340k.c(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                    rect = new Rect((Rect) objInvoke);
                } catch (IllegalAccessException e7) {
                    Log.w("o", e7);
                    rect = b(activity);
                } catch (NoSuchFieldException e10) {
                    Log.w("o", e10);
                    rect = b(activity);
                } catch (NoSuchMethodException e11) {
                    Log.w("o", e11);
                    rect = b(activity);
                } catch (InvocationTargetException e12) {
                    Log.w("o", e12);
                    rect = b(activity);
                }
            } else if (i10 >= 28) {
                rect = b(activity);
            } else if (i10 >= 24) {
                rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i11 = rect.bottom + dimensionPixelSize;
                    if (i11 == point.y) {
                        rect.bottom = i11;
                    } else {
                        int i12 = rect.right + dimensionPixelSize;
                        if (i12 == point.x) {
                            rect.right = i12;
                        }
                    }
                }
            } else {
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                AbstractC3340k.d(defaultDisplay2, "defaultDisplay");
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                Rect rect2 = new Rect();
                int i13 = point2.x;
                if (i13 == 0 || (i5 = point2.y) == 0) {
                    defaultDisplay2.getRectSize(rect2);
                } else {
                    rect2.right = i13;
                    rect2.bottom = i5;
                }
                rect = rect2;
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 < 30) {
            v0VarB = (i14 >= 34 ? new k0() : i14 >= 30 ? new j0() : i14 >= 29 ? new i0() : new h0()).b();
            AbstractC3340k.d(v0VarB, "{\n            WindowInse…ilder().build()\n        }");
        } else {
            if (i14 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            v0VarB = H3.a.f4883a.a(activity);
        }
        return new l(new A3.b(rect), v0VarB);
    }

    public static Rect b(Activity activity) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object obj;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj2.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj2, new Object[0]);
                AbstractC3340k.c(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj2.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj2, new Object[0]);
                AbstractC3340k.c(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e7) {
            Log.w("o", e7);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e10) {
            Log.w("o", e10);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e11) {
            Log.w("o", e11);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e12) {
            Log.w("o", e12);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        AbstractC3340k.d(currentDisplay, "currentDisplay");
        currentDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i5 = rect.bottom + dimensionPixelSize;
            if (i5 == point.y) {
                rect.bottom = i5;
            } else {
                int i10 = rect.right + dimensionPixelSize;
                if (i10 == point.x) {
                    rect.right = i10;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(new Object[0]);
                Method declaredMethod = currentDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(currentDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                obj = declaredField2.get(objNewInstance);
            } catch (ClassNotFoundException e13) {
                Log.w("o", e13);
            } catch (IllegalAccessException e14) {
                Log.w("o", e14);
            } catch (InstantiationException e15) {
                Log.w("o", e15);
            } catch (NoSuchFieldException e16) {
                Log.w("o", e16);
            } catch (NoSuchMethodException e17) {
                Log.w("o", e17);
            } catch (InvocationTargetException e18) {
                Log.w("o", e18);
            }
            DisplayCutout displayCutoutM = A0.j.y(obj) ? A0.j.m(obj) : null;
            if (displayCutoutM != null) {
                if (rect.left == displayCutoutM.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutoutM.getSafeInsetRight()) {
                    rect.right = displayCutoutM.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutoutM.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutoutM.getSafeInsetBottom()) {
                    rect.bottom = displayCutoutM.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }
}
