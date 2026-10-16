package androidx.lifecycle;

import Va.M6;
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    public static final List f18649a = AbstractC3935e.D(Application.class, T.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f18650b = AbstractC3935e.C(T.class);

    public static final Constructor a(Class cls, List signature) throws SecurityException {
        AbstractC3340k.e(signature, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        AbstractC3340k.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC3340k.d(parameterTypes, "constructor.parameterTypes");
            List listL0 = ff.m.L0(parameterTypes);
            if (signature.equals(listL0)) {
                return constructor;
            }
            if (signature.size() == listL0.size() && listL0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final b0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (b0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(M6.n(cls, "Failed to access "), e7);
        } catch (InstantiationException e10) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(M6.n(cls, "An exception happened in constructor of "), e11.getCause());
        }
    }
}
