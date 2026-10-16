package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class agjt {
    public static final agjt INSTANCE = new agjt();

    private agjt() {
    }

    public final String constructorDesc(Constructor<?> constructor) {
        constructor.getClass();
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        for (Class<?> cls : parameterTypes) {
            cls.getClass();
            sb.append(agkc.getDesc(cls));
        }
        sb.append(")V");
        return sb.toString();
    }

    public final String fieldDesc(Field field) {
        field.getClass();
        Class<?> type = field.getType();
        type.getClass();
        return agkc.getDesc(type);
    }

    public final String methodDesc(Method method) {
        method.getClass();
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        for (Class<?> cls : parameterTypes) {
            cls.getClass();
            sb.append(agkc.getDesc(cls));
        }
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(agkc.getDesc(returnType));
        return sb.toString();
    }
}
