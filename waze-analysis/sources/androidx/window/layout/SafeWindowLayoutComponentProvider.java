package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.SafeWindowExtensionsProvider;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ExtensionsUtil;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.reflection.ReflectionUtils;
import androidx.window.reflection.WindowExtensionsConstants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import h.g.a.a;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SafeWindowLayoutComponentProvider {
    private final ConsumerAdapter consumerAdapter;
    private final ClassLoader loader;
    private final SafeWindowExtensionsProvider safeWindowExtensionsProvider;

    public SafeWindowLayoutComponentProvider(ClassLoader classLoader, ConsumerAdapter consumerAdapter) {
        x.f(classLoader, "loader");
        x.f(consumerAdapter, "consumerAdapter");
        this.loader = classLoader;
        this.consumerAdapter = consumerAdapter;
        this.safeWindowExtensionsProvider = new SafeWindowExtensionsProvider(classLoader);
    }

    private final boolean canUseWindowLayoutComponent() {
        int safeVendorApiLevel;
        if (isWindowLayoutComponentAccessible$window() && (safeVendorApiLevel = ExtensionsUtil.INSTANCE.getSafeVendorApiLevel()) > 0) {
            return safeVendorApiLevel == 1 ? hasValidVendorApiLevel1$window() : safeVendorApiLevel < 5 ? hasValidVendorApiLevel2$window() : safeVendorApiLevel < 10 ? hasValidVendorApiLevel6$window() : hasValidVendorApiLevel10$window();
        }
        return false;
    }

    private final Class<?> getDisplayFoldFeatureClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.DISPLAY_FOLD_FEATURE_CLASS);
        x.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    private final Class<?> getFoldingFeatureClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.FOLDING_FEATURE_CLASS);
        x.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    private final Class<?> getSupportedWindowFeaturesClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.SUPPORTED_WINDOW_FEATURES_CLASS);
        x.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    private final Class<?> getWindowLayoutComponentClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.WINDOW_LAYOUT_COMPONENT_CLASS);
        x.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    private final Class<?> getWindowLayoutInfoBuilderClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass("androidx.window.extensions.layout.WindowLayoutInfo$Builder");
        x.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    private final Class<?> getWindowLayoutInfoClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.WINDOW_LAYOUT_CLASS);
        x.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    private final boolean isDisplayFoldFeatureValid() {
        return ReflectionUtils.validateReflection$window("DisplayFoldFeature is not valid", new a() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeWindowLayoutComponentProvider.isDisplayFoldFeatureValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isDisplayFoldFeatureValid$lambda$0(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> displayFoldFeatureClass = safeWindowLayoutComponentProvider.getDisplayFoldFeatureClass();
        Method method = displayFoldFeatureClass.getMethod("getType", null);
        Method method2 = displayFoldFeatureClass.getMethod("hasProperty", Integer.TYPE);
        Method method3 = displayFoldFeatureClass.getMethod("hasProperties", int[].class);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, Integer.TYPE)) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            x.c(method2);
            if (reflectionUtils2.isPublic$window(method2) && ReflectionUtils.INSTANCE.doesReturn$window(method2, Boolean.TYPE)) {
                ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
                x.c(method3);
                if (reflectionUtils3.isPublic$window(method3) && ReflectionUtils.INSTANCE.doesReturn$window(method3, Boolean.TYPE)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean isEngagementModeValid() {
        return ReflectionUtils.validateReflection$window("WindowLayoutInfo#engagementMode is not valid", new a() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$$ExternalSyntheticLambda6
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeWindowLayoutComponentProvider.isEngagementModeValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isEngagementModeValid$lambda$0(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> windowLayoutInfoClass = safeWindowLayoutComponentProvider.getWindowLayoutInfoClass();
        Method method = windowLayoutInfoClass.getMethod("getEngagementModeFlags", null);
        Method method2 = windowLayoutInfoClass.getMethod("hasEngagementModeFlag", Integer.TYPE);
        Class<?> windowLayoutInfoBuilderClass = safeWindowLayoutComponentProvider.getWindowLayoutInfoBuilderClass();
        Method method3 = windowLayoutInfoBuilderClass.getMethod("setEngagementModeFlags", Integer.TYPE);
        Method method4 = windowLayoutInfoBuilderClass.getMethod(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method)) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            Class cls = Integer.TYPE;
            int i2 = ar.f48106a;
            if (reflectionUtils2.doesReturn$window(method, new m(cls))) {
                ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
                x.c(method2);
                if (reflectionUtils3.isPublic$window(method2) && ReflectionUtils.INSTANCE.doesReturn$window(method2, new m(Boolean.TYPE))) {
                    ReflectionUtils reflectionUtils4 = ReflectionUtils.INSTANCE;
                    x.c(method3);
                    if (reflectionUtils4.isPublic$window(method3)) {
                        ReflectionUtils reflectionUtils5 = ReflectionUtils.INSTANCE;
                        x.c(method4);
                        if (reflectionUtils5.isPublic$window(method4) && ReflectionUtils.INSTANCE.doesReturn$window(method4, windowLayoutInfoClass)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean isFoldingFeatureValid() {
        return ReflectionUtils.validateReflection$window("FoldingFeature class is not valid", new a() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeWindowLayoutComponentProvider.isFoldingFeatureValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isFoldingFeatureValid$lambda$0(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> foldingFeatureClass = safeWindowLayoutComponentProvider.getFoldingFeatureClass();
        Method method = foldingFeatureClass.getMethod("getBounds", null);
        Method method2 = foldingFeatureClass.getMethod("getType", null);
        Method method3 = foldingFeatureClass.getMethod("getState", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        int i2 = ar.f48106a;
        if (!reflectionUtils.doesReturn$window(method, new m(Rect.class)) || !ReflectionUtils.INSTANCE.isPublic$window(method)) {
            return false;
        }
        ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
        x.c(method2);
        if (!reflectionUtils2.doesReturn$window(method2, new m(Integer.TYPE)) || !ReflectionUtils.INSTANCE.isPublic$window(method2)) {
            return false;
        }
        ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
        x.c(method3);
        return reflectionUtils3.doesReturn$window(method3, new m(Integer.TYPE)) && ReflectionUtils.INSTANCE.isPublic$window(method3);
    }

    private final boolean isGetSupportedWindowFeaturesValid() {
        return ReflectionUtils.validateReflection$window("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new a() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeWindowLayoutComponentProvider.isGetSupportedWindowFeaturesValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isGetSupportedWindowFeaturesValid$lambda$0(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeWindowLayoutComponentProvider.getWindowLayoutComponentClass().getMethod("getSupportedWindowFeatures", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, safeWindowLayoutComponentProvider.getSupportedWindowFeaturesClass());
    }

    private final boolean isMethodWindowLayoutInfoListenerJavaConsumerValid() {
        return ReflectionUtils.validateReflection$window("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new a() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$$ExternalSyntheticLambda5
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeWindowLayoutComponentProvider.isMethodWindowLayoutInfoListenerJavaConsumerValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodWindowLayoutInfoListenerJavaConsumerValid$lambda$0(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> clsConsumerClassOrNull$window = safeWindowLayoutComponentProvider.consumerAdapter.consumerClassOrNull$window();
        if (clsConsumerClassOrNull$window == null) {
            return false;
        }
        Class<?> windowLayoutComponentClass = safeWindowLayoutComponentProvider.getWindowLayoutComponentClass();
        Method method = windowLayoutComponentClass.getMethod("addWindowLayoutInfoListener", Activity.class, clsConsumerClassOrNull$window);
        Method method2 = windowLayoutComponentClass.getMethod("removeWindowLayoutInfoListener", clsConsumerClassOrNull$window);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method)) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            x.c(method2);
            if (reflectionUtils2.isPublic$window(method2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isMethodWindowLayoutInfoListenerWindowConsumerValid() {
        return ReflectionUtils.validateReflection$window("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new a() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$$ExternalSyntheticLambda7
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeWindowLayoutComponentProvider.isMethodWindowLayoutInfoListenerWindowConsumerValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodWindowLayoutInfoListenerWindowConsumerValid$lambda$0(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> windowLayoutComponentClass = safeWindowLayoutComponentProvider.getWindowLayoutComponentClass();
        Method method = windowLayoutComponentClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = windowLayoutComponentClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method)) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            x.c(method2);
            if (reflectionUtils2.isPublic$window(method2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isSupportedWindowFeaturesValid() {
        return ReflectionUtils.validateReflection$window("SupportedWindowFeatures is not valid", new a() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeWindowLayoutComponentProvider.isSupportedWindowFeaturesValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isSupportedWindowFeaturesValid$lambda$0(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeWindowLayoutComponentProvider.getSupportedWindowFeaturesClass().getMethod("getDisplayFoldFeatures", null);
        Type genericReturnType = method.getGenericReturnType();
        x.d(genericReturnType, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
        x.d(type, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls = (Class) type;
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, List.class) && x.n(cls, safeWindowLayoutComponentProvider.getDisplayFoldFeatureClass());
    }

    private final boolean isWindowLayoutProviderValid() {
        return ReflectionUtils.validateReflection$window("WindowExtensions#getWindowLayoutComponent is not valid", new a() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeWindowLayoutComponentProvider.isWindowLayoutProviderValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isWindowLayoutProviderValid$lambda$0(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        Method method = safeWindowLayoutComponentProvider.safeWindowExtensionsProvider.getWindowExtensionsClass$window().getMethod("getWindowLayoutComponent", null);
        Class<?> windowLayoutComponentClass = safeWindowLayoutComponentProvider.getWindowLayoutComponentClass();
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, windowLayoutComponentClass);
    }

    public final WindowLayoutComponent getWindowLayoutComponent() {
        if (canUseWindowLayoutComponent()) {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
            }
        }
        return null;
    }

    public final boolean hasValidVendorApiLevel1$window() {
        return isMethodWindowLayoutInfoListenerJavaConsumerValid();
    }

    public final boolean hasValidVendorApiLevel10$window() {
        return hasValidVendorApiLevel6$window() && isEngagementModeValid();
    }

    public final boolean hasValidVendorApiLevel2$window() {
        return hasValidVendorApiLevel1$window() && isMethodWindowLayoutInfoListenerWindowConsumerValid();
    }

    public final boolean hasValidVendorApiLevel6$window() {
        return hasValidVendorApiLevel2$window() && isDisplayFoldFeatureValid() && isSupportedWindowFeaturesValid() && isGetSupportedWindowFeaturesValid();
    }

    public final boolean isWindowLayoutComponentAccessible$window() {
        return this.safeWindowExtensionsProvider.isWindowExtensionsValid$window() && isWindowLayoutProviderValid() && isFoldingFeatureValid();
    }
}
