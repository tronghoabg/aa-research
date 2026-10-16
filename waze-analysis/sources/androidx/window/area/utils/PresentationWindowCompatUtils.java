package androidx.window.area.utils;

import android.view.Window;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import h.g.b.x;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class PresentationWindowCompatUtils {
    public static final PresentationWindowCompatUtils INSTANCE = new PresentationWindowCompatUtils();

    private PresentationWindowCompatUtils() {
    }

    private final Method getWindowMethod(ExtensionWindowAreaPresentation extensionWindowAreaPresentation) throws SecurityException {
        Object obj;
        Method[] methods = extensionWindowAreaPresentation.getClass().getMethods();
        x.e(methods, "getMethods(...)");
        Method[] methodArr = methods;
        int length = methodArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Method method = methodArr[i2];
            Method method2 = method;
            if (x.n(method2 != null ? method2.getName() : null, "getWindow") && x.n(method2.getReturnType(), Window.class)) {
                obj = method;
                break;
            }
            i2++;
        }
        return (Method) obj;
    }

    public final Window getWindowBeforeVendorApiLevel4(ExtensionWindowAreaPresentation extensionWindowAreaPresentation) throws SecurityException {
        x.f(extensionWindowAreaPresentation, "extensionPresentation");
        Method windowMethod = getWindowMethod(extensionWindowAreaPresentation);
        if (windowMethod == null) {
            return null;
        }
        return (Window) windowMethod.invoke(extensionWindowAreaPresentation, null);
    }
}
