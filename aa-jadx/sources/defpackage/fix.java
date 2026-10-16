package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fix implements defpackage.fiw {
    public static final defpackage.fix b = new defpackage.fix();

    @Override // defpackage.fiw
    public final android.graphics.Rect a(android.app.Activity activity) {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.content.res.Configuration configuration = activity.getResources().getConfiguration();
        android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
        android.view.DisplayCutout displayCutoutM311m = null;
        try {
            try {
                android.os.StrictMode.setVmPolicy(android.os.StrictMode.VmPolicy.LAX);
                java.lang.reflect.Field declaredField = android.content.res.Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                java.lang.Object obj = declaredField.get(configuration);
                if (activity.isInMultiWindowMode()) {
                    java.lang.Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                    objInvoke.getClass();
                    rect.set((android.graphics.Rect) objInvoke);
                } else {
                    java.lang.Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                    objInvoke2.getClass();
                    rect.set((android.graphics.Rect) objInvoke2);
                }
            } catch (java.lang.Exception e) {
                if (!(e instanceof java.lang.NoSuchFieldException) && !(e instanceof java.lang.NoSuchMethodException) && !(e instanceof java.lang.IllegalAccessException) && !(e instanceof java.lang.reflect.InvocationTargetException)) {
                    throw e;
                }
                android.util.Log.w(defpackage.fiv.b, e);
                activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
            }
            android.os.StrictMode.setVmPolicy(vmPolicy);
            android.view.Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getRealSize(point);
            if (!activity.isInMultiWindowMode()) {
                android.content.res.Resources resources = activity.getResources();
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
                android.os.StrictMode.VmPolicy vmPolicy2 = android.os.StrictMode.getVmPolicy();
                try {
                    try {
                        android.os.StrictMode.setVmPolicy(android.os.StrictMode.VmPolicy.LAX);
                        java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        java.lang.Object objNewInstance = constructor.newInstance(null);
                        java.lang.reflect.Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay, objNewInstance);
                        java.lang.reflect.Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        java.lang.Object obj2 = declaredField2.get(objNewInstance);
                        if (defpackage.hh$$ExternalSyntheticApiModelOutline0.m$1(obj2)) {
                            displayCutoutM311m = defpackage.hh$$ExternalSyntheticApiModelOutline0.m311m(obj2);
                        }
                    } catch (java.lang.Exception e2) {
                        if (!(e2 instanceof java.lang.ClassNotFoundException) && !(e2 instanceof java.lang.NoSuchMethodException) && !(e2 instanceof java.lang.NoSuchFieldException) && !(e2 instanceof java.lang.IllegalAccessException) && !(e2 instanceof java.lang.reflect.InvocationTargetException) && !(e2 instanceof java.lang.InstantiationException)) {
                            throw e2;
                        }
                        android.util.Log.w(defpackage.fiv.b, e2);
                    }
                    android.os.StrictMode.setVmPolicy(vmPolicy2);
                    if (displayCutoutM311m != null) {
                        if (rect.left == displayCutoutM311m.getSafeInsetLeft()) {
                            rect.left = 0;
                        }
                        if (point.x - rect.right == displayCutoutM311m.getSafeInsetRight()) {
                            rect.right += displayCutoutM311m.getSafeInsetRight();
                        }
                        if (rect.top == displayCutoutM311m.getSafeInsetTop()) {
                            rect.top = 0;
                        }
                        if (point.y - rect.bottom == displayCutoutM311m.getSafeInsetBottom()) {
                            rect.bottom += displayCutoutM311m.getSafeInsetBottom();
                        }
                    }
                } catch (java.lang.Throwable th) {
                    android.os.StrictMode.setVmPolicy(vmPolicy2);
                    throw th;
                }
            }
            return rect;
        } catch (java.lang.Throwable th2) {
            android.os.StrictMode.setVmPolicy(vmPolicy);
            throw th2;
        }
    }
}
