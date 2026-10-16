package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aglw extends defpackage.agmb implements defpackage.aham {
    private final java.lang.reflect.Constructor<?> member;

    public aglw(java.lang.reflect.Constructor<?> constructor) {
        constructor.getClass();
        this.member = constructor;
    }

    @Override // defpackage.ahay
    public java.util.List<defpackage.agmj> getTypeParameters() {
        java.lang.reflect.TypeVariable<java.lang.reflect.Constructor<?>>[] typeParameters = getMember().getTypeParameters();
        typeParameters.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable<java.lang.reflect.Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new defpackage.agmj(typeVariable));
        }
        return arrayList;
    }

    @Override // defpackage.aham
    public java.util.List<defpackage.agmk> getValueParameters() {
        java.lang.reflect.Type[] genericParameterTypes = getMember().getGenericParameterTypes();
        genericParameterTypes.getClass();
        int length = genericParameterTypes.length;
        if (length == 0) {
            return defpackage.afce.a;
        }
        java.lang.Class<?> declaringClass = getMember().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !java.lang.reflect.Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (java.lang.reflect.Type[]) defpackage.afga.bC(genericParameterTypes, 1, length);
        }
        java.lang.annotation.Annotation[][] parameterAnnotations = getMember().getParameterAnnotations();
        int length2 = parameterAnnotations.length;
        int length3 = genericParameterTypes.length;
        if (length2 < length3) {
            java.lang.reflect.Constructor<?> member = getMember();
            java.util.Objects.toString(member);
            throw new java.lang.IllegalStateException("Illegal generic signature: ".concat(java.lang.String.valueOf(member)));
        }
        if (length2 > length3) {
            parameterAnnotations.getClass();
            parameterAnnotations = (java.lang.annotation.Annotation[][]) defpackage.afga.bC(parameterAnnotations, length2 - length3, length2);
        }
        parameterAnnotations.getClass();
        return getValueParameters(genericParameterTypes, parameterAnnotations, getMember().isVarArgs());
    }

    @Override // defpackage.agmb
    public java.lang.reflect.Constructor<?> getMember() {
        return this.member;
    }
}
