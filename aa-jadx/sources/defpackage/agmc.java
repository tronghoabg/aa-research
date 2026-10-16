package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agmc extends defpackage.agmb implements defpackage.ahar {
    private final java.lang.reflect.Method member;

    public agmc(java.lang.reflect.Method method) {
        method.getClass();
        this.member = method;
    }

    @Override // defpackage.ahar
    public defpackage.ahag getAnnotationParameterDefaultValue() {
        java.lang.Object defaultValue = getMember().getDefaultValue();
        if (defaultValue != null) {
            return defpackage.aglf.Factory.create(defaultValue, null);
        }
        return null;
    }

    @Override // defpackage.ahar
    public boolean getHasAnnotationParameterDefaultValue() {
        return getAnnotationParameterDefaultValue() != null;
    }

    @Override // defpackage.ahar
    public defpackage.agmi getReturnType() {
        defpackage.agmh agmhVar = defpackage.agmi.Factory;
        java.lang.reflect.Type genericReturnType = getMember().getGenericReturnType();
        genericReturnType.getClass();
        return agmhVar.create(genericReturnType);
    }

    @Override // defpackage.ahay
    public java.util.List<defpackage.agmj> getTypeParameters() {
        java.lang.reflect.TypeVariable<java.lang.reflect.Method>[] typeParameters = getMember().getTypeParameters();
        typeParameters.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable<java.lang.reflect.Method> typeVariable : typeParameters) {
            arrayList.add(new defpackage.agmj(typeVariable));
        }
        return arrayList;
    }

    @Override // defpackage.ahar
    public java.util.List<defpackage.agmk> getValueParameters() {
        java.lang.reflect.Type[] genericParameterTypes = getMember().getGenericParameterTypes();
        genericParameterTypes.getClass();
        java.lang.annotation.Annotation[][] parameterAnnotations = getMember().getParameterAnnotations();
        parameterAnnotations.getClass();
        return getValueParameters(genericParameterTypes, parameterAnnotations, getMember().isVarArgs());
    }

    @Override // defpackage.ahar
    public boolean isNative() {
        return java.lang.reflect.Modifier.isNative(getMember().getModifiers());
    }

    @Override // defpackage.agmb
    public java.lang.reflect.Method getMember() {
        return this.member;
    }
}
