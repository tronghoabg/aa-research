package androidx.lifecycle;

import android.app.Application;
import h.a.c;
import h.a.i;
import h.g.b.x;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SavedStateViewModelFactory_androidKt {
    private static final List<Class<? extends Object>> ANDROID_VIEWMODEL_SIGNATURE = i.i(Application.class, SavedStateHandle.class);
    private static final List<Class<?>> VIEWMODEL_SIGNATURE = i.d(SavedStateHandle.class);

    public static final <T> Constructor<T> findMatchingConstructor(Class<T> cls, List<? extends Class> list) throws SecurityException {
        x.f(cls, "modelClass");
        x.f(list, "signature");
        Object[] constructors = cls.getConstructors();
        x.e(constructors, "getConstructors(...)");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            x.e(parameterTypes, "getParameterTypes(...)");
            List listX = c.X(parameterTypes);
            if (x.n(list, listX)) {
                x.d(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactory_androidKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == listX.size() && listX.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        x.f(cls, "modelClass");
        x.f(constructor, "constructor");
        x.f(objArr, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e2) {
            Objects.toString(cls);
            throw new RuntimeException("Failed to access ".concat(String.valueOf(cls)), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
        } catch (InvocationTargetException e4) {
            Objects.toString(cls);
            throw new RuntimeException("An exception happened in constructor of ".concat(String.valueOf(cls)), e4.getCause());
        }
    }
}
