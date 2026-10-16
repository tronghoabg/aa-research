package androidx.window;

import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.reflection.ReflectionUtils;
import androidx.window.reflection.WindowExtensionsConstants;
import h.g.a.a;
import h.g.b.x;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SafeWindowExtensionsProvider {
    private final ClassLoader loader;

    public SafeWindowExtensionsProvider(ClassLoader classLoader) {
        x.f(classLoader, "loader");
        this.loader = classLoader;
    }

    private final Class<?> getWindowExtensionsProviderClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.WINDOW_EXTENSIONS_PROVIDER_CLASS);
        x.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    private final boolean isWindowExtensionsPresent() {
        return ReflectionUtils.INSTANCE.checkIsPresent$window(new a() { // from class: androidx.window.SafeWindowExtensionsProvider$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return SafeWindowExtensionsProvider.isWindowExtensionsPresent$lambda$0(this.f$0);
            }
        });
    }

    static final Class isWindowExtensionsPresent$lambda$0(SafeWindowExtensionsProvider safeWindowExtensionsProvider) throws ClassNotFoundException {
        Class<?> clsLoadClass = safeWindowExtensionsProvider.loader.loadClass(WindowExtensionsConstants.WINDOW_EXTENSIONS_PROVIDER_CLASS);
        x.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    static final boolean isWindowExtensionsValid$lambda$0(SafeWindowExtensionsProvider safeWindowExtensionsProvider) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        Method declaredMethod = safeWindowExtensionsProvider.getWindowExtensionsProviderClass().getDeclaredMethod("getWindowExtensions", null);
        Class<?> windowExtensionsClass$window = safeWindowExtensionsProvider.getWindowExtensionsClass$window();
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(declaredMethod);
        return reflectionUtils.doesReturn$window(declaredMethod, windowExtensionsClass$window) && ReflectionUtils.INSTANCE.isPublic$window(declaredMethod);
    }

    public final WindowExtensions getWindowExtensions() {
        try {
            if (isWindowExtensionsPresent() && isWindowExtensionsValid$window()) {
                return WindowExtensionsProvider.getWindowExtensions();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final Class<?> getWindowExtensionsClass$window() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.WINDOW_EXTENSIONS_CLASS);
        x.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final boolean isWindowExtensionsValid$window() {
        return isWindowExtensionsPresent() && ReflectionUtils.validateReflection$window("WindowExtensionsProvider#getWindowExtensions is not valid", new a() { // from class: androidx.window.SafeWindowExtensionsProvider$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeWindowExtensionsProvider.isWindowExtensionsValid$lambda$0(this.f$0));
            }
        });
    }
}
