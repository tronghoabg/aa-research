package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afwj {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence _get_jvmSignature_$lambda$0(java.lang.Class cls) {
        cls.getClass();
        return defpackage.aglc.getDesc(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence _get_jvmSignature_$lambda$1(java.lang.Class cls) {
        cls.getClass();
        return defpackage.aglc.getDesc(cls);
    }

    public static final java.lang.String getJvmSignature(java.lang.reflect.Method method) {
        method.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(method.getName());
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(defpackage.afga.cs(parameterTypes, "", "(", ")", defpackage.afwi.INSTANCE, 24));
        java.lang.Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(defpackage.aglc.getDesc(returnType));
        return sb.toString();
    }

    public static final java.lang.String getJvmSignature(java.lang.reflect.Field field) {
        field.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String name = field.getName();
        name.getClass();
        sb.append(defpackage.aguh.getterName(name));
        sb.append("()");
        java.lang.Class<?> type = field.getType();
        type.getClass();
        sb.append(defpackage.aglc.getDesc(type));
        return sb.toString();
    }

    public static final java.lang.String getJvmSignature(java.lang.reflect.Constructor<?> constructor) {
        constructor.getClass();
        java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        return defpackage.afga.cs(parameterTypes, "", "<init>(", ")V", defpackage.afwh.INSTANCE, 24);
    }
}
