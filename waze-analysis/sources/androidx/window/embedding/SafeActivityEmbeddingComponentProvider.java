package androidx.window.embedding;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import androidx.window.SafeWindowExtensionsProvider;
import androidx.window.WindowSdkExtensions;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ExtensionsUtil$$ExternalSyntheticApiModelOutline0;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.core.util.function.Function;
import androidx.window.extensions.core.util.function.Predicate;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.ReflectionUtils;
import androidx.window.reflection.WindowExtensionsConstants;
import e.a.b.a.ap$$ExternalSyntheticApiModelOutline1;
import h.g.a.a;
import h.g.b.x;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SafeActivityEmbeddingComponentProvider {
    private final ConsumerAdapter consumerAdapter;
    private final ClassLoader loader;
    private final SafeWindowExtensionsProvider safeWindowExtensionsProvider;
    private final WindowExtensions windowExtensions;

    public SafeActivityEmbeddingComponentProvider(ClassLoader classLoader, ConsumerAdapter consumerAdapter, WindowExtensions windowExtensions) {
        x.f(classLoader, "loader");
        x.f(consumerAdapter, "consumerAdapter");
        x.f(windowExtensions, "windowExtensions");
        this.loader = classLoader;
        this.consumerAdapter = consumerAdapter;
        this.windowExtensions = windowExtensions;
        this.safeWindowExtensionsProvider = new SafeWindowExtensionsProvider(classLoader);
    }

    private final boolean canUseActivityEmbeddingComponent() {
        if (!isActivityEmbeddingComponentAccessible$window()) {
            return false;
        }
        int extensionVersion = WindowSdkExtensions.Companion.getInstance().getExtensionVersion();
        if (extensionVersion == 1) {
            return hasValidVendorApiLevel1$window();
        }
        if (extensionVersion == 2) {
            return hasValidVendorApiLevel2$window();
        }
        if (extensionVersion >= 3 && extensionVersion < 5) {
            return hasValidVendorApiLevel3$window();
        }
        if (extensionVersion == 5) {
            return hasValidVendorApiLevel5$window();
        }
        if (extensionVersion == 6) {
            return hasValidVendorApiLevel6$window();
        }
        if (extensionVersion == 7) {
            return hasValidVendorApiLevel7$window();
        }
        if (extensionVersion < 8) {
            return false;
        }
        return hasValidVendorApiLevel8$window();
    }

    private final Class<?> getActivityEmbeddingComponentClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        x.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    private final boolean isActivityEmbeddingComponentValid() {
        return ReflectionUtils.validateReflection$window("WindowExtensions#getActivityEmbeddingComponent is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda61
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isActivityEmbeddingComponentValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isActivityEmbeddingComponentValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        Method method = safeActivityEmbeddingComponentProvider.safeWindowExtensionsProvider.getWindowExtensionsClass$window().getMethod("getActivityEmbeddingComponent", null);
        Class<?> activityEmbeddingComponentClass = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass();
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, activityEmbeddingComponentClass);
    }

    private final boolean isActivityStackGetActivityStackTokenValid() {
        return ReflectionUtils.validateReflection$window("ActivityStack#getActivityToken is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda48
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isActivityStackGetActivityStackTokenValid$lambda$0());
            }
        });
    }

    static final boolean isActivityStackGetActivityStackTokenValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$3().getMethod("getActivityStackToken", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method)) {
            return ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$27());
        }
        return false;
    }

    private final boolean isActivityStackGetTagValid() {
        return ReflectionUtils.validateReflection$window("ActivityStack#getTag is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda35
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isActivityStackGetTagValid$lambda$0());
            }
        });
    }

    static final boolean isActivityStackGetTagValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$3().getMethod("getTag", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, String.class);
    }

    private final boolean isClassActivityRuleBuilderLevel1Valid() {
        return ReflectionUtils.validateReflection$window("Class ActivityRule.Builder is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda33
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassActivityRuleBuilderLevel1Valid$lambda$0());
            }
        });
    }

    static final boolean isClassActivityRuleBuilderLevel1Valid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13442m().getMethod("setShouldAlwaysExpand", Boolean.TYPE);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13442m());
    }

    private final boolean isClassActivityRuleBuilderLevel2Valid() {
        return ReflectionUtils.validateReflection$window("Class ActivityRule.Builder is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassActivityRuleBuilderLevel2Valid$lambda$0());
            }
        });
    }

    static final boolean isClassActivityRuleBuilderLevel2Valid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class clsM13442m = ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13442m();
        Constructor<?> declaredConstructor = clsM13442m.getDeclaredConstructor(Predicate.class, Predicate.class);
        Method method = clsM13442m.getMethod("setTag", String.class);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(declaredConstructor);
        if (reflectionUtils.isPublic$window(declaredConstructor)) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            x.c(method);
            if (reflectionUtils2.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13442m())) {
                return true;
            }
        }
        return false;
    }

    private final boolean isClassActivityRuleValid() {
        return ReflectionUtils.validateReflection$window("Class ActivityRule is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassActivityRuleValid$lambda$0());
            }
        });
    }

    static final boolean isClassActivityRuleValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$6().getMethod("shouldAlwaysExpand", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, Boolean.TYPE);
    }

    private final boolean isClassActivityStackAttributesBuilderValid() {
        return ReflectionUtils.validateReflection$window("Class ActivityStackAttributes.Builder is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda38
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassActivityStackAttributesBuilderValid$lambda$0());
            }
        });
    }

    static final boolean isClassActivityStackAttributesBuilderValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class clsM$7 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$7();
        Constructor<?> declaredConstructor = clsM$7.getDeclaredConstructor(null);
        Method method = clsM$7.getMethod("setRelativeBounds", Rect.class);
        Method method2 = clsM$7.getMethod("setWindowAttributes", EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$8());
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(declaredConstructor);
        if (reflectionUtils.isPublic$window(declaredConstructor)) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            x.c(method);
            if (reflectionUtils2.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$7())) {
                ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
                x.c(method2);
                if (reflectionUtils3.isPublic$window(method2) && ReflectionUtils.INSTANCE.doesReturn$window(method2, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$7())) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean isClassActivityStackAttributesCalculatorParamsValid() {
        return ReflectionUtils.validateReflection$window("Class ActivityStackAttributesCalculatorParams is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda21
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassActivityStackAttributesCalculatorParamsValid$lambda$0());
            }
        });
    }

    static final boolean isClassActivityStackAttributesCalculatorParamsValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class clsM$15 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$15();
        Method method = clsM$15.getMethod("getParentContainerInfo", null);
        Method method2 = clsM$15.getMethod("getActivityStackTag", null);
        Method method3 = clsM$15.getMethod("getLaunchOptions", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (!reflectionUtils.isPublic$window(method)) {
            return false;
        }
        if (!ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$26())) {
            return false;
        }
        ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
        x.c(method2);
        if (!reflectionUtils2.isPublic$window(method2) || !ReflectionUtils.INSTANCE.doesReturn$window(method2, String.class)) {
            return false;
        }
        ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
        x.c(method3);
        return reflectionUtils3.isPublic$window(method3) && ReflectionUtils.INSTANCE.doesReturn$window(method3, Bundle.class);
    }

    private final boolean isClassActivityStackAttributesValid() {
        return ReflectionUtils.validateReflection$window("Class ActivityStackAttributes is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda10
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassActivityStackAttributesValid$lambda$0());
            }
        });
    }

    static final boolean isClassActivityStackAttributesValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class clsM$16 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$16();
        Method method = clsM$16.getMethod("getRelativeBounds", null);
        Method method2 = clsM$16.getMethod("getWindowAttributes", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (!reflectionUtils.isPublic$window(method) || !ReflectionUtils.INSTANCE.doesReturn$window(method, Rect.class)) {
            return false;
        }
        ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
        x.c(method2);
        if (reflectionUtils2.isPublic$window(method2)) {
            return ReflectionUtils.INSTANCE.doesReturn$window(method2, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$8());
        }
        return false;
    }

    private final boolean isClassActivityStackTokenValid() {
        return ReflectionUtils.validateReflection$window("Class ActivityStack.Token is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda9
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassActivityStackTokenValid$lambda$0());
            }
        });
    }

    static final boolean isClassActivityStackTokenValid$lambda$0() throws NoSuchFieldException, NoSuchMethodException, SecurityException {
        Class<?> clsM$27 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$27();
        Method method = clsM$27.getMethod("toBundle", null);
        Method method2 = clsM$27.getMethod("readFromBundle", Bundle.class);
        Method method3 = clsM$27.getMethod("createFromBinder", IBinder.class);
        Field declaredField = clsM$27.getDeclaredField("INVALID_ACTIVITY_STACK_TOKEN");
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, Bundle.class)) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            x.c(method2);
            if (reflectionUtils2.isPublic$window(method2) && ReflectionUtils.INSTANCE.doesReturn$window(method2, clsM$27)) {
                ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
                x.c(method3);
                if (reflectionUtils3.isPublic$window(method3) && ReflectionUtils.INSTANCE.doesReturn$window(method3, clsM$27)) {
                    ReflectionUtils reflectionUtils4 = ReflectionUtils.INSTANCE;
                    x.c(declaredField);
                    if (reflectionUtils4.isPublic$window(declaredField)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean isClassAnimationBackgroundValid() {
        return ReflectionUtils.validateReflection$window("Class AnimationBackground is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda39
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassAnimationBackgroundValid$lambda$0());
            }
        });
    }

    static final boolean isClassAnimationBackgroundValid$lambda$0() throws NoSuchFieldException, NoSuchMethodException, SecurityException {
        Class<?>[] clsArr = {Integer.TYPE};
        Class<?> clsM$19 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$19();
        Method method = clsM$19.getMethod("createColorBackground", clsArr);
        Field declaredField = clsM$19.getDeclaredField("ANIMATION_BACKGROUND_DEFAULT");
        Class<?> clsM$20 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$20();
        Method method2 = clsM$20.getMethod("getColor", null);
        Method method3 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$21().getMethod("getAnimationBackground", null);
        Method method4 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$22().getMethod("setAnimationBackground", EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$19());
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, clsM$20)) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            x.c(declaredField);
            if (reflectionUtils2.isPublic$window(declaredField)) {
                ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
                x.c(method2);
                if (reflectionUtils3.isPublic$window(method2) && ReflectionUtils.INSTANCE.doesReturn$window(method2, Integer.TYPE)) {
                    ReflectionUtils reflectionUtils4 = ReflectionUtils.INSTANCE;
                    x.c(method3);
                    if (reflectionUtils4.isPublic$window(method3) && ReflectionUtils.INSTANCE.doesReturn$window(method3, clsM$19)) {
                        ReflectionUtils reflectionUtils5 = ReflectionUtils.INSTANCE;
                        x.c(method4);
                        if (reflectionUtils5.isPublic$window(method4) && ReflectionUtils.INSTANCE.doesReturn$window(method4, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$22())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean isClassAnimationParamsBuilderValid() {
        return ReflectionUtils.validateReflection$window("Class AnimationParams.Builder is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda37
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassAnimationParamsBuilderValid$lambda$0());
            }
        });
    }

    static final boolean isClassAnimationParamsBuilderValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class<?>[] clsArr = {EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$19()};
        Class clsM$9 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$9();
        Method method = clsM$9.getMethod("setAnimationBackground", clsArr);
        Method method2 = clsM$9.getMethod("setOpenAnimationResId", Integer.TYPE);
        Method method3 = clsM$9.getMethod("setCloseAnimationResId", Integer.TYPE);
        Method method4 = clsM$9.getMethod("setChangeAnimationResId", Integer.TYPE);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$9())) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            x.c(method2);
            if (reflectionUtils2.isPublic$window(method2) && ReflectionUtils.INSTANCE.doesReturn$window(method2, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$9())) {
                ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
                x.c(method3);
                if (reflectionUtils3.isPublic$window(method3) && ReflectionUtils.INSTANCE.doesReturn$window(method3, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$9())) {
                    ReflectionUtils reflectionUtils4 = ReflectionUtils.INSTANCE;
                    x.c(method4);
                    if (reflectionUtils4.isPublic$window(method4) && ReflectionUtils.INSTANCE.doesReturn$window(method4, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$9())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean isClassAnimationParamsValid() {
        return ReflectionUtils.validateReflection$window("Class AnimationParams is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda40
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassAnimationParamsValid$lambda$0());
            }
        });
    }

    static final boolean isClassAnimationParamsValid$lambda$0() throws NoSuchFieldException, NoSuchMethodException, SecurityException {
        Class clsM$10 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$10();
        Field declaredField = clsM$10.getDeclaredField("DEFAULT_ANIMATION_RESOURCES_ID");
        Method method = clsM$10.getMethod("getAnimationBackground", null);
        Method method2 = clsM$10.getMethod("getOpenAnimationResId", null);
        Method method3 = clsM$10.getMethod("getCloseAnimationResId", null);
        Method method4 = clsM$10.getMethod("getChangeAnimationResId", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(declaredField);
        if (!reflectionUtils.isPublic$window(declaredField)) {
            return false;
        }
        ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
        x.c(method);
        if (!reflectionUtils2.isPublic$window(method)) {
            return false;
        }
        if (!ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$19())) {
            return false;
        }
        ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
        x.c(method2);
        if (!reflectionUtils3.isPublic$window(method2) || !ReflectionUtils.INSTANCE.doesReturn$window(method2, Integer.TYPE)) {
            return false;
        }
        ReflectionUtils reflectionUtils4 = ReflectionUtils.INSTANCE;
        x.c(method3);
        if (!reflectionUtils4.isPublic$window(method3) || !ReflectionUtils.INSTANCE.doesReturn$window(method3, Integer.TYPE)) {
            return false;
        }
        ReflectionUtils reflectionUtils5 = ReflectionUtils.INSTANCE;
        x.c(method4);
        return reflectionUtils5.isPublic$window(method4) && ReflectionUtils.INSTANCE.doesReturn$window(method4, Integer.TYPE);
    }

    private final boolean isClassDividerAttributesBuilderValid() {
        return ReflectionUtils.validateReflection$window("Class DividerAttributes.Builder is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda34
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassDividerAttributesBuilderValid$lambda$0());
            }
        });
    }

    static final boolean isClassDividerAttributesBuilderValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class<?>[] clsArr = {Integer.TYPE};
        Class clsM$24 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$24();
        Constructor<?> declaredConstructor = clsM$24.getDeclaredConstructor(clsArr);
        Constructor<?> declaredConstructor2 = clsM$24.getDeclaredConstructor(EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$17());
        Method method = clsM$24.getMethod("setWidthDp", Integer.TYPE);
        Method method2 = clsM$24.getMethod("setPrimaryMinRatio", Float.TYPE);
        Method method3 = clsM$24.getMethod("setPrimaryMaxRatio", Float.TYPE);
        Method method4 = clsM$24.getMethod("setDividerColor", Integer.TYPE);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(declaredConstructor);
        if (reflectionUtils.isPublic$window(declaredConstructor)) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            x.c(declaredConstructor2);
            if (reflectionUtils2.isPublic$window(declaredConstructor2)) {
                ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
                x.c(method);
                if (reflectionUtils3.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$24())) {
                    ReflectionUtils reflectionUtils4 = ReflectionUtils.INSTANCE;
                    x.c(method2);
                    if (reflectionUtils4.isPublic$window(method2) && ReflectionUtils.INSTANCE.doesReturn$window(method2, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$24())) {
                        ReflectionUtils reflectionUtils5 = ReflectionUtils.INSTANCE;
                        x.c(method3);
                        if (reflectionUtils5.isPublic$window(method3) && ReflectionUtils.INSTANCE.doesReturn$window(method3, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$24())) {
                            ReflectionUtils reflectionUtils6 = ReflectionUtils.INSTANCE;
                            x.c(method4);
                            if (reflectionUtils6.isPublic$window(method4) && ReflectionUtils.INSTANCE.doesReturn$window(method4, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$24())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean isClassDividerAttributesValid() {
        return ReflectionUtils.validateReflection$window("Class DividerAttributes is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda56
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassDividerAttributesValid$lambda$0());
            }
        });
    }

    static final boolean isClassDividerAttributesValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class clsM$17 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$17();
        Method method = clsM$17.getMethod("getDividerType", null);
        Method method2 = clsM$17.getMethod("getWidthDp", null);
        Method method3 = clsM$17.getMethod("getPrimaryMinRatio", null);
        Method method4 = clsM$17.getMethod("getPrimaryMaxRatio", null);
        Method method5 = clsM$17.getMethod("getDividerColor", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (!reflectionUtils.isPublic$window(method) || !ReflectionUtils.INSTANCE.doesReturn$window(method, Integer.TYPE)) {
            return false;
        }
        ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
        x.c(method2);
        if (!reflectionUtils2.isPublic$window(method2) || !ReflectionUtils.INSTANCE.doesReturn$window(method2, Integer.TYPE)) {
            return false;
        }
        ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
        x.c(method3);
        if (!reflectionUtils3.isPublic$window(method3) || !ReflectionUtils.INSTANCE.doesReturn$window(method3, Float.TYPE)) {
            return false;
        }
        ReflectionUtils reflectionUtils4 = ReflectionUtils.INSTANCE;
        x.c(method4);
        if (!reflectionUtils4.isPublic$window(method4) || !ReflectionUtils.INSTANCE.doesReturn$window(method4, Float.TYPE)) {
            return false;
        }
        ReflectionUtils reflectionUtils5 = ReflectionUtils.INSTANCE;
        x.c(method5);
        return reflectionUtils5.isPublic$window(method5) && ReflectionUtils.INSTANCE.doesReturn$window(method5, Integer.TYPE);
    }

    private final boolean isClassEmbeddedActivityWindowInfoValid() {
        return ReflectionUtils.validateReflection$window("Class EmbeddedActivityWindowInfo is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda50
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassEmbeddedActivityWindowInfoValid$lambda$0());
            }
        });
    }

    static final boolean isClassEmbeddedActivityWindowInfoValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class clsM$23 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$23();
        Method method = clsM$23.getMethod("getActivity", null);
        Method method2 = clsM$23.getMethod("isEmbedded", null);
        Method method3 = clsM$23.getMethod("getTaskBounds", null);
        Method method4 = clsM$23.getMethod("getActivityStackBounds", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (!reflectionUtils.isPublic$window(method) || !ReflectionUtils.INSTANCE.doesReturn$window(method, Activity.class)) {
            return false;
        }
        ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
        x.c(method2);
        if (!reflectionUtils2.isPublic$window(method2) || !ReflectionUtils.INSTANCE.doesReturn$window(method2, Boolean.TYPE)) {
            return false;
        }
        ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
        x.c(method3);
        if (!reflectionUtils3.isPublic$window(method3) || !ReflectionUtils.INSTANCE.doesReturn$window(method3, Rect.class)) {
            return false;
        }
        ReflectionUtils reflectionUtils4 = ReflectionUtils.INSTANCE;
        x.c(method4);
        return reflectionUtils4.isPublic$window(method4) && ReflectionUtils.INSTANCE.doesReturn$window(method4, Rect.class);
    }

    private final boolean isClassEmbeddingRuleValid() {
        return ReflectionUtils.validateReflection$window("Class EmbeddingRule is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda17
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassEmbeddingRuleValid$lambda$0());
            }
        });
    }

    static final boolean isClassEmbeddingRuleValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingRule.class.getMethod("getTag", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, String.class);
    }

    private final boolean isClassParentContainerInfoValid() {
        return ReflectionUtils.validateReflection$window("ParentContainerInfo is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda52
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassParentContainerInfoValid$lambda$0());
            }
        });
    }

    static final boolean isClassParentContainerInfoValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class clsM$26 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$26();
        Method method = clsM$26.getMethod("getWindowMetrics", null);
        Method method2 = clsM$26.getMethod("getConfiguration", null);
        Method method3 = clsM$26.getMethod("getWindowLayoutInfo", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (!reflectionUtils.isPublic$window(method)) {
            return false;
        }
        if (!ReflectionUtils.INSTANCE.doesReturn$window(method, ap$$ExternalSyntheticApiModelOutline1.m29307m())) {
            return false;
        }
        ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
        x.c(method2);
        if (!reflectionUtils2.isPublic$window(method2) || !ReflectionUtils.INSTANCE.doesReturn$window(method2, Configuration.class)) {
            return false;
        }
        ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
        x.c(method3);
        return reflectionUtils3.isPublic$window(method3) && ReflectionUtils.INSTANCE.doesReturn$window(method3, WindowLayoutInfo.class);
    }

    private final boolean isClassSplitAttributesCalculatorParamsValid() {
        return ReflectionUtils.validateReflection$window("Class SplitAttributesCalculatorParams is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda28
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitAttributesCalculatorParamsValid$lambda$0());
            }
        });
    }

    static final boolean isClassSplitAttributesCalculatorParamsValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class clsM$11 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$11();
        Method method = clsM$11.getMethod("getParentWindowMetrics", null);
        Method method2 = clsM$11.getMethod("getParentConfiguration", null);
        Method method3 = clsM$11.getMethod("getDefaultSplitAttributes", null);
        Method method4 = clsM$11.getMethod("areDefaultConstraintsSatisfied", null);
        Method method5 = clsM$11.getMethod("getParentWindowLayoutInfo", null);
        Method method6 = clsM$11.getMethod("getSplitRuleTag", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (!reflectionUtils.isPublic$window(method)) {
            return false;
        }
        if (!ReflectionUtils.INSTANCE.doesReturn$window(method, ap$$ExternalSyntheticApiModelOutline1.m29307m())) {
            return false;
        }
        ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
        x.c(method2);
        if (!reflectionUtils2.isPublic$window(method2) || !ReflectionUtils.INSTANCE.doesReturn$window(method2, Configuration.class)) {
            return false;
        }
        ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
        x.c(method3);
        if (!reflectionUtils3.isPublic$window(method3)) {
            return false;
        }
        if (!ReflectionUtils.INSTANCE.doesReturn$window(method3, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$21())) {
            return false;
        }
        ReflectionUtils reflectionUtils4 = ReflectionUtils.INSTANCE;
        x.c(method4);
        if (!reflectionUtils4.isPublic$window(method4) || !ReflectionUtils.INSTANCE.doesReturn$window(method4, Boolean.TYPE)) {
            return false;
        }
        ReflectionUtils reflectionUtils5 = ReflectionUtils.INSTANCE;
        x.c(method5);
        if (!reflectionUtils5.isPublic$window(method5) || !ReflectionUtils.INSTANCE.doesReturn$window(method5, WindowLayoutInfo.class)) {
            return false;
        }
        ReflectionUtils reflectionUtils6 = ReflectionUtils.INSTANCE;
        x.c(method6);
        return reflectionUtils6.isPublic$window(method6) && ReflectionUtils.INSTANCE.doesReturn$window(method6, String.class);
    }

    private final boolean isClassSplitAttributesValid() {
        return ReflectionUtils.validateReflection$window("Class SplitAttributes is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda41
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitAttributesValid$lambda$0());
            }
        });
    }

    static final boolean isClassSplitAttributesValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class clsM$21 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$21();
        Method method = clsM$21.getMethod("getLayoutDirection", null);
        Method method2 = clsM$21.getMethod("getSplitType", null);
        Class<?>[] clsArr = {EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$30()};
        Class clsM$22 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$22();
        Method method3 = clsM$22.getMethod("setSplitType", clsArr);
        Method method4 = clsM$22.getMethod("setLayoutDirection", Integer.TYPE);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, Integer.TYPE)) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            x.c(method2);
            if (reflectionUtils2.isPublic$window(method2) && ReflectionUtils.INSTANCE.doesReturn$window(method2, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$30())) {
                ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
                x.c(method3);
                if (reflectionUtils3.isPublic$window(method3)) {
                    ReflectionUtils reflectionUtils4 = ReflectionUtils.INSTANCE;
                    x.c(method4);
                    if (reflectionUtils4.isPublic$window(method4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean isClassSplitInfoTokenValid() {
        return ReflectionUtils.validateReflection$window("SplitInfo.Token is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda31
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitInfoTokenValid$lambda$0());
            }
        });
    }

    static final boolean isClassSplitInfoTokenValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class<?> clsM$13 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$13();
        Method method = clsM$13.getMethod("createFromBinder", IBinder.class);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, clsM$13);
    }

    private final boolean isClassSplitInfoValid() {
        return ReflectionUtils.validateReflection$window("Class SplitInfo is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda26
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitInfoValid$lambda$0());
            }
        });
    }

    static final boolean isClassSplitInfoValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class clsM$29 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$29();
        Method method = clsM$29.getMethod("getPrimaryActivityStack", null);
        Method method2 = clsM$29.getMethod("getSecondaryActivityStack", null);
        Method method3 = clsM$29.getMethod("getSplitRatio", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (!reflectionUtils.isPublic$window(method)) {
            return false;
        }
        if (!ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$3())) {
            return false;
        }
        ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
        x.c(method2);
        if (!reflectionUtils2.isPublic$window(method2)) {
            return false;
        }
        if (!ReflectionUtils.INSTANCE.doesReturn$window(method2, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$3())) {
            return false;
        }
        ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
        x.c(method3);
        return reflectionUtils3.isPublic$window(method3) && ReflectionUtils.INSTANCE.doesReturn$window(method3, Float.TYPE);
    }

    private final boolean isClassSplitPairRuleBuilderLevel1Valid() {
        return ReflectionUtils.validateReflection$window("Class SplitPairRule.Builder is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda11
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitPairRuleBuilderLevel1Valid$lambda$0());
            }
        });
    }

    static final boolean isClassSplitPairRuleBuilderLevel1Valid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class<?>[] clsArr = {Float.TYPE};
        Class clsM = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m();
        Method method = clsM.getMethod("setSplitRatio", clsArr);
        Method method2 = clsM.getMethod("setLayoutDirection", Integer.TYPE);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m())) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            x.c(method2);
            if (reflectionUtils2.isPublic$window(method2) && ReflectionUtils.INSTANCE.doesReturn$window(method2, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m())) {
                return true;
            }
        }
        return false;
    }

    private final boolean isClassSplitPairRuleBuilderLevel2Valid() {
        return ReflectionUtils.validateReflection$window("Class SplitPairRule.Builder is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitPairRuleBuilderLevel2Valid$lambda$0());
            }
        });
    }

    static final boolean isClassSplitPairRuleBuilderLevel2Valid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class clsM = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m();
        Constructor<?> declaredConstructor = clsM.getDeclaredConstructor(Predicate.class, Predicate.class, Predicate.class);
        Method method = clsM.getMethod("setDefaultSplitAttributes", EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$21());
        Method method2 = clsM.getMethod("setTag", String.class);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(declaredConstructor);
        if (reflectionUtils.isPublic$window(declaredConstructor)) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            x.c(method);
            if (reflectionUtils2.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m())) {
                ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
                x.c(method2);
                if (reflectionUtils3.isPublic$window(method2) && ReflectionUtils.INSTANCE.doesReturn$window(method2, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m())) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean isClassSplitPairRuleValid() {
        return ReflectionUtils.validateReflection$window("Class SplitPairRule is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda6
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitPairRuleValid$lambda$0());
            }
        });
    }

    static final boolean isClassSplitPairRuleValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class clsM$12 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$12();
        Method method = clsM$12.getMethod("getFinishPrimaryWithSecondary", null);
        Method method2 = clsM$12.getMethod("getFinishSecondaryWithPrimary", null);
        Method method3 = clsM$12.getMethod("shouldClearTop", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (!reflectionUtils.isPublic$window(method) || !ReflectionUtils.INSTANCE.doesReturn$window(method, Integer.TYPE)) {
            return false;
        }
        ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
        x.c(method2);
        if (!reflectionUtils2.isPublic$window(method2) || !ReflectionUtils.INSTANCE.doesReturn$window(method2, Integer.TYPE)) {
            return false;
        }
        ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
        x.c(method3);
        return reflectionUtils3.isPublic$window(method3) && ReflectionUtils.INSTANCE.doesReturn$window(method3, Boolean.TYPE);
    }

    private final boolean isClassSplitPlaceholderRuleBuilderLevel1Valid() {
        return ReflectionUtils.validateReflection$window("Class SplitPlaceholderRule.Builder is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda22
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitPlaceholderRuleBuilderLevel1Valid$lambda$0());
            }
        });
    }

    static final boolean isClassSplitPlaceholderRuleBuilderLevel1Valid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class<?>[] clsArr = {Float.TYPE};
        Class clsM$1 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$1();
        Method method = clsM$1.getMethod("setSplitRatio", clsArr);
        Method method2 = clsM$1.getMethod("setLayoutDirection", Integer.TYPE);
        Method method3 = clsM$1.getMethod("setSticky", Boolean.TYPE);
        Method method4 = clsM$1.getMethod("setFinishPrimaryWithSecondary", Integer.TYPE);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$1())) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            x.c(method2);
            if (reflectionUtils2.isPublic$window(method2) && ReflectionUtils.INSTANCE.doesReturn$window(method2, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$1())) {
                ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
                x.c(method3);
                if (reflectionUtils3.isPublic$window(method3) && ReflectionUtils.INSTANCE.doesReturn$window(method3, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$1())) {
                    ReflectionUtils reflectionUtils4 = ReflectionUtils.INSTANCE;
                    x.c(method4);
                    if (reflectionUtils4.isPublic$window(method4) && ReflectionUtils.INSTANCE.doesReturn$window(method4, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$1())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean isClassSplitPlaceholderRuleBuilderLevel2Valid() {
        return ReflectionUtils.validateReflection$window("Class SplitPlaceholderRule.Builder is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda51
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitPlaceholderRuleBuilderLevel2Valid$lambda$0());
            }
        });
    }

    static final boolean isClassSplitPlaceholderRuleBuilderLevel2Valid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class clsM$1 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$1();
        Constructor<?> declaredConstructor = clsM$1.getDeclaredConstructor(Intent.class, Predicate.class, Predicate.class, Predicate.class);
        Method method = clsM$1.getMethod("setDefaultSplitAttributes", EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$21());
        Method method2 = clsM$1.getMethod("setFinishPrimaryWithPlaceholder", Integer.TYPE);
        Method method3 = clsM$1.getMethod("setTag", String.class);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(declaredConstructor);
        if (reflectionUtils.isPublic$window(declaredConstructor)) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            x.c(method);
            if (reflectionUtils2.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$1())) {
                ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
                x.c(method2);
                if (reflectionUtils3.isPublic$window(method2) && ReflectionUtils.INSTANCE.doesReturn$window(method2, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$1())) {
                    ReflectionUtils reflectionUtils4 = ReflectionUtils.INSTANCE;
                    x.c(method3);
                    if (reflectionUtils4.isPublic$window(method3) && ReflectionUtils.INSTANCE.doesReturn$window(method3, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$1())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean isClassSplitPlaceholderRuleValid() {
        return ReflectionUtils.validateReflection$window("Class SplitPlaceholderRule is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitPlaceholderRuleValid$lambda$0());
            }
        });
    }

    static final boolean isClassSplitPlaceholderRuleValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class clsM$18 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$18();
        Method method = clsM$18.getMethod("getPlaceholderIntent", null);
        Method method2 = clsM$18.getMethod("isSticky", null);
        Method method3 = clsM$18.getMethod("getFinishPrimaryWithSecondary", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (!reflectionUtils.isPublic$window(method) || !ReflectionUtils.INSTANCE.doesReturn$window(method, Intent.class)) {
            return false;
        }
        ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
        x.c(method2);
        if (!reflectionUtils2.isPublic$window(method2) || !ReflectionUtils.INSTANCE.doesReturn$window(method2, Boolean.TYPE)) {
            return false;
        }
        ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
        x.c(method3);
        return reflectionUtils3.isPublic$window(method3) && ReflectionUtils.INSTANCE.doesReturn$window(method3, Integer.TYPE);
    }

    private final boolean isClassSplitTypeValid() {
        return ReflectionUtils.validateReflection$window("Class SplitAttributes.SplitType is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda42
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitTypeValid$lambda$0());
            }
        });
    }

    static final boolean isClassSplitTypeValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class<?>[] clsArr = {Float.TYPE};
        Class clsM$28 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$28();
        Constructor<?> declaredConstructor = clsM$28.getDeclaredConstructor(clsArr);
        Method method = clsM$28.getMethod("getRatio", null);
        Method method2 = clsM$28.getMethod("splitEqually", null);
        Class<?>[] clsArr2 = {EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$30()};
        Class clsM$4 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$4();
        Constructor<?> declaredConstructor2 = clsM$4.getDeclaredConstructor(clsArr2);
        Method method3 = clsM$4.getMethod("getFallbackSplitType", null);
        Constructor<?> declaredConstructor3 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$5().getDeclaredConstructor(null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(declaredConstructor);
        if (reflectionUtils.isPublic$window(declaredConstructor)) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            x.c(method);
            if (reflectionUtils2.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, Float.TYPE)) {
                ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
                x.c(declaredConstructor2);
                if (reflectionUtils3.isPublic$window(declaredConstructor2)) {
                    ReflectionUtils reflectionUtils4 = ReflectionUtils.INSTANCE;
                    x.c(method2);
                    if (reflectionUtils4.isPublic$window(method2) && ReflectionUtils.INSTANCE.doesReturn$window(method2, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$28())) {
                        ReflectionUtils reflectionUtils5 = ReflectionUtils.INSTANCE;
                        x.c(method3);
                        if (reflectionUtils5.isPublic$window(method3) && ReflectionUtils.INSTANCE.doesReturn$window(method3, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$30())) {
                            ReflectionUtils reflectionUtils6 = ReflectionUtils.INSTANCE;
                            x.c(declaredConstructor3);
                            if (reflectionUtils6.isPublic$window(declaredConstructor3)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean isClassWindowAttributesValid() {
        return ReflectionUtils.validateReflection$window("Class WindowAttributes is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda30
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassWindowAttributesValid$lambda$0());
            }
        });
    }

    static final boolean isClassWindowAttributesValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Class<?> clsM$8 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$8();
        Method method = clsM$8.getMethod("getDimAreaBehavior", null);
        Method method2 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$21().getMethod("getWindowAttributes", null);
        Method method3 = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$22().getMethod("setWindowAttributes", EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$8());
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, Integer.TYPE)) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            x.c(method2);
            if (reflectionUtils2.isPublic$window(method2) && ReflectionUtils.INSTANCE.doesReturn$window(method2, clsM$8)) {
                ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
                x.c(method3);
                if (reflectionUtils3.isPublic$window(method3) && ReflectionUtils.INSTANCE.doesReturn$window(method3, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$22())) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean isMethodClearActivityStackAttributesCalculatorValid() {
        return ReflectionUtils.validateReflection$window("clearActivityStackAttributesCalculator is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda15
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodClearActivityStackAttributesCalculatorValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodClearActivityStackAttributesCalculatorValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("clearActivityStackAttributesCalculator", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method);
    }

    private final boolean isMethodClearEmbeddedActivityWindowInfoCallbackValid() {
        return ReflectionUtils.validateReflection$window("ActivityEmbeddingComponent#clearEmbeddedActivityWindowInfoCallback is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda16
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodClearEmbeddedActivityWindowInfoCallbackValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodClearEmbeddedActivityWindowInfoCallbackValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("clearEmbeddedActivityWindowInfoCallback", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method);
    }

    private final boolean isMethodClearSplitInfoCallbackValid() {
        return ReflectionUtils.validateReflection$window("ActivityEmbeddingComponent#clearSplitInfoCallback is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda29
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodClearSplitInfoCallbackValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodClearSplitInfoCallbackValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("clearSplitInfoCallback", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method);
    }

    private final boolean isMethodGetActivityStackTokenValid() {
        return ReflectionUtils.validateReflection$window("getActivityStackToken is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda58
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodGetActivityStackTokenValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodGetActivityStackTokenValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("getActivityStackToken", String.class);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$27());
    }

    private final boolean isMethodGetAnimationParamsValid() {
        return ReflectionUtils.validateReflection$window("SplitAttributes#getAnimationParams is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda23
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodGetAnimationParamsValid$lambda$0());
            }
        });
    }

    static final boolean isMethodGetAnimationParamsValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$21().getMethod("getAnimationParams", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method)) {
            return ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$10());
        }
        return false;
    }

    private final boolean isMethodGetDefaultSplitAttributesValid() {
        return ReflectionUtils.validateReflection$window("SplitRule#getDefaultSplitAttributes is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda45
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodGetDefaultSplitAttributesValid$lambda$0());
            }
        });
    }

    static final boolean isMethodGetDefaultSplitAttributesValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$14().getMethod("getDefaultSplitAttributes", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method)) {
            return ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$21());
        }
        return false;
    }

    private final boolean isMethodGetDividerAttributesValid() {
        return ReflectionUtils.validateReflection$window("SplitAttributes#getDividerAttributes is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda53
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodGetDividerAttributesValid$lambda$0());
            }
        });
    }

    static final boolean isMethodGetDividerAttributesValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$21().getMethod("getDividerAttributes", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method)) {
            return ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$17());
        }
        return false;
    }

    private final boolean isMethodGetEmbeddedActivityWindowInfoValid() {
        return ReflectionUtils.validateReflection$window("ActivityEmbeddingComponent#getEmbeddedActivityWindowInfo is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda27
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodGetEmbeddedActivityWindowInfoValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodGetEmbeddedActivityWindowInfoValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("getEmbeddedActivityWindowInfo", Activity.class);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$23());
    }

    private final boolean isMethodGetFinishPrimaryWithPlaceholderValid() {
        return ReflectionUtils.validateReflection$window("SplitPlaceholderRule#getFinishPrimaryWithPlaceholder is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda20
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodGetFinishPrimaryWithPlaceholderValid$lambda$0());
            }
        });
    }

    static final boolean isMethodGetFinishPrimaryWithPlaceholderValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$18().getMethod("getFinishPrimaryWithPlaceholder", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, Integer.TYPE);
    }

    private final boolean isMethodGetLayoutDirectionValid() {
        return ReflectionUtils.validateReflection$window("SplitRule#getLayoutDirection is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda55
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodGetLayoutDirectionValid$lambda$0());
            }
        });
    }

    static final boolean isMethodGetLayoutDirectionValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$14().getMethod("getLayoutDirection", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, Integer.TYPE);
    }

    private final boolean isMethodGetParentContainerInfoValid() {
        return ReflectionUtils.validateReflection$window("ActivityEmbeddingComponent#getParentContainerInfo is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda54
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodGetParentContainerInfoValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodGetParentContainerInfoValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("getParentContainerInfo", EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$27());
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$26());
    }

    private final boolean isMethodGetSplitAttributesValid() {
        return ReflectionUtils.validateReflection$window("SplitInfo#getSplitAttributes is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda7
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodGetSplitAttributesValid$lambda$0());
            }
        });
    }

    static final boolean isMethodGetSplitAttributesValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$29().getMethod("getSplitAttributes", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method)) {
            return ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$21());
        }
        return false;
    }

    private final boolean isMethodGetSplitInfoTokenValid() {
        return ReflectionUtils.validateReflection$window("SplitInfo#getSplitInfoToken is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda14
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodGetSplitInfoTokenValid$lambda$0());
            }
        });
    }

    static final boolean isMethodGetSplitInfoTokenValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$29().getMethod("getSplitInfoToken", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method)) {
            return ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$13());
        }
        return false;
    }

    private final boolean isMethodGetSplitRatioValid() {
        return ReflectionUtils.validateReflection$window("SplitRule#getSplitRatio is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda43
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodGetSplitRatioValid$lambda$0());
            }
        });
    }

    static final boolean isMethodGetSplitRatioValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$14().getMethod("getSplitRatio", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, Float.TYPE);
    }

    private final boolean isMethodInvalidateTopVisibleSplitAttributesValid() {
        return ReflectionUtils.validateReflection$window("#invalidateTopVisibleSplitAttributes is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda32
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodInvalidateTopVisibleSplitAttributesValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodInvalidateTopVisibleSplitAttributesValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("invalidateTopVisibleSplitAttributes", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method);
    }

    private final boolean isMethodIsActivityEmbeddedValid() {
        return ReflectionUtils.validateReflection$window("ActivityEmbeddingComponent#isActivityEmbedded is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda44
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodIsActivityEmbeddedValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodIsActivityEmbeddedValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("isActivityEmbedded", Activity.class);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, Boolean.TYPE);
    }

    private final boolean isMethodIsDraggingToFullscreenAllowedValid() {
        return ReflectionUtils.validateReflection$window("DividerAttributes#isDraggingToFullscreenAllowed is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda49
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodIsDraggingToFullscreenAllowedValid$lambda$0());
            }
        });
    }

    static final boolean isMethodIsDraggingToFullscreenAllowedValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$17().getMethod("isDraggingToFullscreenAllowed", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, Boolean.TYPE);
    }

    private final boolean isMethodPinUnpinTopActivityStackValid() {
        return ReflectionUtils.validateReflection$window("#pin(unPin)TopActivityStack is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda13
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodPinUnpinTopActivityStackValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodPinUnpinTopActivityStackValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$25().getMethod("isSticky", null);
        Method method2 = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("pinTopActivityStack", Integer.TYPE, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$25());
        Method method3 = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("unpinTopActivityStack", Integer.TYPE);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        if (reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, Boolean.TYPE)) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            x.c(method2);
            if (reflectionUtils2.isPublic$window(method2) && ReflectionUtils.INSTANCE.doesReturn$window(method2, Boolean.TYPE)) {
                ReflectionUtils reflectionUtils3 = ReflectionUtils.INSTANCE;
                x.c(method3);
                if (reflectionUtils3.isPublic$window(method3)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean isMethodRegisterActivityStackCallbackValid() {
        return ReflectionUtils.validateReflection$window("registerActivityStackCallback is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda5
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodRegisterActivityStackCallbackValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodRegisterActivityStackCallbackValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("registerActivityStackCallback", Executor.class, Consumer.class);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method);
    }

    private final boolean isMethodSetActivityStackAttributesCalculatorValid() {
        return ReflectionUtils.validateReflection$window("setActivityStackAttributesCalculator is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda25
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodSetActivityStackAttributesCalculatorValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodSetActivityStackAttributesCalculatorValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("setActivityStackAttributesCalculator", Function.class);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method);
    }

    private final boolean isMethodSetAnimationParamsValid() {
        return ReflectionUtils.validateReflection$window("SplitAttributes#setAnimationParams is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda62
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodSetAnimationParamsValid$lambda$0());
            }
        });
    }

    static final boolean isMethodSetAnimationParamsValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$22().getMethod("setAnimationParams", EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$10());
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$22());
    }

    private final boolean isMethodSetDividerAttributesValid() {
        return ReflectionUtils.validateReflection$window("SplitAttributes#setDividerAttributes is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda36
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodSetDividerAttributesValid$lambda$0());
            }
        });
    }

    static final boolean isMethodSetDividerAttributesValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$22().getMethod("setDividerAttributes", EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$17());
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$22());
    }

    private final boolean isMethodSetDraggingToFullscreenAllowedValid() {
        return ReflectionUtils.validateReflection$window("DividerAttributes.Builder#setDraggingToFullscreenAllowed is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda24
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodSetDraggingToFullscreenAllowedValid$lambda$0());
            }
        });
    }

    static final boolean isMethodSetDraggingToFullscreenAllowedValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$24().getMethod("setDraggingToFullscreenAllowed", Boolean.TYPE);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$24());
    }

    private final boolean isMethodSetEmbeddedActivityWindowInfoCallbackValid() {
        return ReflectionUtils.validateReflection$window("ActivityEmbeddingComponent#setEmbeddedActivityWindowInfoCallback is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda12
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("setEmbeddedActivityWindowInfoCallback", Executor.class, Consumer.class);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method);
    }

    private final boolean isMethodSetEmbeddingRulesValid() {
        return ReflectionUtils.validateReflection$window("ActivityEmbeddingComponent#setEmbeddingRules is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda57
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodSetEmbeddingRulesValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodSetEmbeddingRulesValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("setEmbeddingRules", Set.class);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method);
    }

    private final boolean isMethodSetSplitInfoCallbackJavaConsumerValid() {
        return ReflectionUtils.validateReflection$window("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda46
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodSetSplitInfoCallbackJavaConsumerValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodSetSplitInfoCallbackJavaConsumerValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Class<?> clsConsumerClassOrNull$window = safeActivityEmbeddingComponentProvider.consumerAdapter.consumerClassOrNull$window();
        if (clsConsumerClassOrNull$window == null) {
            return false;
        }
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("setSplitInfoCallback", clsConsumerClassOrNull$window);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method);
    }

    private final boolean isMethodSetSplitInfoCallbackWindowConsumerValid() {
        return ReflectionUtils.validateReflection$window("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda47
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodSetSplitInfoCallbackWindowConsumerValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodSetSplitInfoCallbackWindowConsumerValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("setSplitInfoCallback", Consumer.class);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method);
    }

    private final boolean isMethodSplitAttributesCalculatorValid() {
        return ReflectionUtils.validateReflection$window("ActivityEmbeddingComponent#setSplitAttributesCalculator is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda59
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodSplitAttributesCalculatorValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodSplitAttributesCalculatorValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("setSplitAttributesCalculator", Function.class);
        Method method2 = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("clearSplitAttributesCalculator", null);
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

    private final boolean isMethodSplitInfoGetTokenValid() {
        return ReflectionUtils.validateReflection$window("SplitInfo#getToken is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda19
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodSplitInfoGetTokenValid$lambda$0());
            }
        });
    }

    static final boolean isMethodSplitInfoGetTokenValid$lambda$0() throws NoSuchMethodException, SecurityException {
        Method method = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$29().getMethod("getToken", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method) && ReflectionUtils.INSTANCE.doesReturn$window(method, IBinder.class);
    }

    private final boolean isMethodUnregisterActivityStackCallbackValid() {
        return ReflectionUtils.validateReflection$window("unregisterActivityStackCallback is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda8
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodUnregisterActivityStackCallbackValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodUnregisterActivityStackCallbackValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("unregisterActivityStackCallback", Consumer.class);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method);
    }

    private final boolean isMethodUpdateActivityStackAttributesValid() {
        return ReflectionUtils.validateReflection$window("updateActivityStackAttributes is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda18
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodUpdateActivityStackAttributesValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodUpdateActivityStackAttributesValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("updateActivityStackAttributes", EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$27(), EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$16());
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method);
    }

    private final boolean isMethodUpdateSplitAttributesValid() {
        return ReflectionUtils.validateReflection$window("#updateSplitAttributes is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodUpdateSplitAttributesValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodUpdateSplitAttributesValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("updateSplitAttributes", IBinder.class, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$21());
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method);
    }

    private final boolean isMethodUpdateSplitAttributesWithTokenValid() {
        return ReflectionUtils.validateReflection$window("updateSplitAttributes is not valid", new a() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda60
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodUpdateSplitAttributesWithTokenValid$lambda$0(this.f$0));
            }
        });
    }

    static final boolean isMethodUpdateSplitAttributesWithTokenValid$lambda$0(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) throws NoSuchMethodException, SecurityException {
        Method method = safeActivityEmbeddingComponentProvider.getActivityEmbeddingComponentClass().getMethod("updateSplitAttributes", EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$13(), EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$21());
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        x.c(method);
        return reflectionUtils.isPublic$window(method);
    }

    private final boolean isOverlayFeatureValid() {
        return isActivityStackGetTagValid() && isMethodGetActivityStackTokenValid() && isClassParentContainerInfoValid() && isMethodGetParentContainerInfoValid() && isMethodSetActivityStackAttributesCalculatorValid() && isMethodClearActivityStackAttributesCalculatorValid() && isMethodUpdateActivityStackAttributesValid() && isClassActivityStackAttributesValid() && isClassActivityStackAttributesBuilderValid() && isClassActivityStackAttributesCalculatorParamsValid();
    }

    public final ActivityEmbeddingComponent getActivityEmbeddingComponent() {
        if (canUseActivityEmbeddingComponent()) {
            try {
                return this.windowExtensions.getActivityEmbeddingComponent();
            } catch (UnsupportedOperationException unused) {
            }
        }
        return null;
    }

    public final boolean hasValidVendorApiLevel1$window() {
        return isMethodSetEmbeddingRulesValid() && isMethodIsActivityEmbeddedValid() && isMethodSetSplitInfoCallbackJavaConsumerValid() && isMethodGetSplitRatioValid() && isMethodGetLayoutDirectionValid() && isClassActivityRuleValid() && isClassActivityRuleBuilderLevel1Valid() && isClassSplitInfoValid() && isClassSplitPairRuleValid() && isClassSplitPairRuleBuilderLevel1Valid() && isClassSplitPlaceholderRuleValid() && isClassSplitPlaceholderRuleBuilderLevel1Valid();
    }

    public final boolean hasValidVendorApiLevel2$window() {
        return hasValidVendorApiLevel1$window() && isMethodSetSplitInfoCallbackWindowConsumerValid() && isMethodClearSplitInfoCallbackValid() && isMethodSplitAttributesCalculatorValid() && isMethodGetSplitAttributesValid() && isMethodGetFinishPrimaryWithPlaceholderValid() && isMethodGetDefaultSplitAttributesValid() && isClassActivityRuleBuilderLevel2Valid() && isClassEmbeddingRuleValid() && isClassSplitAttributesValid() && isClassSplitAttributesCalculatorParamsValid() && isClassSplitTypeValid() && isClassSplitPairRuleBuilderLevel2Valid() && isClassSplitPlaceholderRuleBuilderLevel2Valid();
    }

    public final boolean hasValidVendorApiLevel3$window() {
        return hasValidVendorApiLevel2$window() && isMethodInvalidateTopVisibleSplitAttributesValid() && isMethodUpdateSplitAttributesValid() && isMethodSplitInfoGetTokenValid();
    }

    public final boolean hasValidVendorApiLevel5$window() {
        return hasValidVendorApiLevel3$window() && isActivityStackGetActivityStackTokenValid() && isMethodRegisterActivityStackCallbackValid() && isMethodUnregisterActivityStackCallbackValid() && isMethodPinUnpinTopActivityStackValid() && isMethodUpdateSplitAttributesWithTokenValid() && isMethodGetSplitInfoTokenValid() && isClassAnimationBackgroundValid() && isClassActivityStackTokenValid() && isClassWindowAttributesValid() && isClassSplitInfoTokenValid();
    }

    public final boolean hasValidVendorApiLevel6$window() {
        return hasValidVendorApiLevel5$window() && isMethodGetEmbeddedActivityWindowInfoValid() && isMethodSetEmbeddedActivityWindowInfoCallbackValid() && isMethodClearEmbeddedActivityWindowInfoCallbackValid() && isMethodGetDividerAttributesValid() && isMethodSetDividerAttributesValid() && isClassEmbeddedActivityWindowInfoValid() && isClassDividerAttributesValid() && isClassDividerAttributesBuilderValid();
    }

    public final boolean hasValidVendorApiLevel7$window() {
        return hasValidVendorApiLevel6$window() && isMethodGetAnimationParamsValid() && isMethodSetAnimationParamsValid() && isMethodIsDraggingToFullscreenAllowedValid() && isMethodSetDraggingToFullscreenAllowedValid() && isClassAnimationParamsValid() && isClassAnimationParamsBuilderValid();
    }

    public final boolean hasValidVendorApiLevel8$window() {
        return hasValidVendorApiLevel7$window();
    }

    public final boolean isActivityEmbeddingComponentAccessible$window() {
        return this.safeWindowExtensionsProvider.isWindowExtensionsValid$window() && isActivityEmbeddingComponentValid();
    }
}
