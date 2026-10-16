package androidx.window.area.reflectionguard;

import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.reflection.ReflectionUtils;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowAreaComponentValidator {
    public static final WindowAreaComponentValidator INSTANCE = new WindowAreaComponentValidator();

    private WindowAreaComponentValidator() {
    }

    public final boolean isExtensionWindowAreaPresentationValid$window(Class<?> cls, int i2) {
        x.f(cls, "extensionWindowAreaPresentation");
        if (i2 <= 2) {
            return false;
        }
        return ReflectionUtils.INSTANCE.validateImplementation$window(cls, ExtensionWindowAreaPresentation.class);
    }

    public final boolean isExtensionWindowAreaStatusValid$window(Class<?> cls, int i2) {
        x.f(cls, "extensionWindowAreaStatus");
        if (i2 <= 2) {
            return false;
        }
        return ReflectionUtils.INSTANCE.validateImplementation$window(cls, ExtensionWindowAreaStatusRequirements.class);
    }

    public final boolean isWindowAreaComponentValid$window(Class<?> cls, int i2) {
        x.f(cls, "windowAreaComponent");
        if (i2 <= 2) {
            return false;
        }
        return ReflectionUtils.INSTANCE.validateImplementation$window(cls, WindowAreaComponentApi3Requirements.class);
    }
}
