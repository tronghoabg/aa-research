package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class afvj {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _get_jvmSignature_$lambda$0(Class cls) {
        cls.getClass();
        return agkc.getDesc(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _get_jvmSignature_$lambda$1(Class cls) {
        cls.getClass();
        return agkc.getDesc(cls);
    }

    public static final String getJvmSignature(Method method) {
        method.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(woy.dy(parameterTypes, "", "(", ")", afvi.INSTANCE, 24));
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(agkc.getDesc(returnType));
        return sb.toString();
    }

    public static final String getJvmSignature(Field field) {
        field.getClass();
        StringBuilder sb = new StringBuilder();
        String name = field.getName();
        name.getClass();
        sb.append(agth.getterName(name));
        sb.append("()");
        Class<?> type = field.getType();
        type.getClass();
        sb.append(agkc.getDesc(type));
        return sb.toString();
    }

    public static final String getJvmSignature(Constructor<?> constructor) {
        constructor.getClass();
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        return woy.dy(parameterTypes, "", "<init>(", ")V", afvh.INSTANCE, 24);
    }
}
