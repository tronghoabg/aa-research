package androidx.window.reflection;

import android.util.Log;
import androidx.media3.exoplayer.offline.DownloadService;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ReflectionUtils {
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean validateImplementation$lambda$0$0(Class cls, Method method) throws NoSuchMethodException, SecurityException {
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Method method2 = cls.getMethod(name, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        ReflectionUtils reflectionUtils = INSTANCE;
        x.c(method2);
        if (!reflectionUtils.isPublic$window(method2)) {
            return false;
        }
        Class<?> returnType = method.getReturnType();
        x.e(returnType, "getReturnType(...)");
        return reflectionUtils.doesReturn$window(method2, returnType);
    }

    public static final boolean validateReflection$window(String str, a<Boolean> aVar) {
        x.f(str, "errorMessage");
        x.f(aVar, "block");
        try {
            boolean zBooleanValue = aVar.invoke().booleanValue();
            if (!zBooleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(String.valueOf(str)));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(String.valueOf(str)));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(String.valueOf(str)));
            return false;
        }
    }

    public final boolean checkIsPresent$window(a<? extends Class<?>> aVar) {
        x.f(aVar, "classLoader");
        try {
            aVar.invoke();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean doesReturn$window(Method method, Class<?> cls) {
        x.f(method, "<this>");
        x.f(cls, "clazz");
        return method.getReturnType().equals(cls);
    }

    public final boolean isPublic$window(Constructor<?> constructor) {
        x.f(constructor, "<this>");
        return Modifier.isPublic(constructor.getModifiers());
    }

    public final boolean validateImplementation$window(final Class<?> cls, Class<?> cls2) throws SecurityException {
        x.f(cls, "implementation");
        x.f(cls2, DownloadService.KEY_REQUIREMENTS);
        Method[] methods = cls2.getMethods();
        x.e(methods, "getMethods(...)");
        for (final Method method : methods) {
            if (!validateReflection$window(cls.getName() + "#" + method.getName() + " is not valid", new a() { // from class: androidx.window.reflection.ReflectionUtils$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return Boolean.valueOf(ReflectionUtils.validateImplementation$lambda$0$0(cls, method));
                }
            })) {
                return false;
            }
        }
        return true;
    }

    public final boolean isPublic$window(Field field) {
        x.f(field, "<this>");
        return Modifier.isPublic(field.getModifiers());
    }

    public final boolean isPublic$window(Method method) {
        x.f(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }

    public final boolean doesReturn$window(Method method, c<?> cVar) {
        x.f(method, "<this>");
        x.f(cVar, "clazz");
        return doesReturn$window(method, o.w(cVar));
    }
}
