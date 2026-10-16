package androidx.window.area;

import androidx.window.SafeWindowExtensionsProvider;
import androidx.window.area.reflectionguard.WindowAreaComponentValidator;
import androidx.window.core.ExtensionsUtil;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.reflection.ReflectionUtils;
import androidx.window.reflection.WindowExtensionsConstants;
import h.g.a.a;
import h.g.b.x;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SafeWindowAreaComponentProvider {
    private final ClassLoader loader;
    private final WindowExtensions windowExtensions;

    public SafeWindowAreaComponentProvider(ClassLoader classLoader) {
        x.f(classLoader, "loader");
        this.loader = classLoader;
        this.windowExtensions = new SafeWindowExtensionsProvider(classLoader).getWindowExtensions();
    }

    private final Class<?> getExtensionWindowAreaPresentationClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.EXTENSION_WINDOW_AREA_PRESENTATION_CLASS);
        x.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    private final Class<?> getExtensionWindowAreaStatusClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.EXTENSION_WINDOW_AREA_STATUS_CLASS);
        x.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    private final Class<?> getWindowAreaComponentClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.WINDOW_AREA_COMPONENT_CLASS);
        x.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    private final boolean isWindowAreaProviderValid(final Object obj) {
        return ReflectionUtils.validateReflection$window("WindowExtensions#getWindowAreaComponent is not valid", new a() { // from class: androidx.window.area.SafeWindowAreaComponentProvider$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeWindowAreaComponentProvider.isWindowAreaProviderValid$lambda$0(obj, this));
            }
        });
    }

    static final boolean isWindowAreaProviderValid$lambda$0(Object obj, SafeWindowAreaComponentProvider safeWindowAreaComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = obj.getClass().getMethod("getWindowAreaComponent", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, safeWindowAreaComponentProvider.getWindowAreaComponentClass());
    }

    public final WindowAreaComponent getWindowAreaComponent() {
        try {
            WindowExtensions windowExtensions = this.windowExtensions;
            if (windowExtensions != null && isWindowAreaProviderValid(windowExtensions) && WindowAreaComponentValidator.INSTANCE.isWindowAreaComponentValid$window(getWindowAreaComponentClass(), ExtensionsUtil.INSTANCE.getSafeVendorApiLevel()) && WindowAreaComponentValidator.INSTANCE.isExtensionWindowAreaStatusValid$window(getExtensionWindowAreaStatusClass(), ExtensionsUtil.INSTANCE.getSafeVendorApiLevel()) && WindowAreaComponentValidator.INSTANCE.isExtensionWindowAreaPresentationValid$window(getExtensionWindowAreaPresentationClass(), ExtensionsUtil.INSTANCE.getSafeVendorApiLevel())) {
                return this.windowExtensions.getWindowAreaComponent();
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
