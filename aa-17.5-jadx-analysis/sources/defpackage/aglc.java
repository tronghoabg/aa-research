package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class aglc extends aglb implements agzr {
    private final Method member;

    public aglc(Method method) {
        method.getClass();
        this.member = method;
    }

    @Override // defpackage.agzr
    public agzg getAnnotationParameterDefaultValue() {
        Object defaultValue = getMember().getDefaultValue();
        if (defaultValue != null) {
            return agkf.Factory.create(defaultValue, null);
        }
        return null;
    }

    @Override // defpackage.agzr
    public boolean getHasAnnotationParameterDefaultValue() {
        return getAnnotationParameterDefaultValue() != null;
    }

    @Override // defpackage.agzr
    public agli getReturnType() {
        aglh aglhVar = agli.Factory;
        Type genericReturnType = getMember().getGenericReturnType();
        genericReturnType.getClass();
        return aglhVar.create(genericReturnType);
    }

    @Override // defpackage.agzy
    public List<aglj> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = getMember().getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new aglj(typeVariable));
        }
        return arrayList;
    }

    @Override // defpackage.agzr
    public List<aglk> getValueParameters() {
        Type[] genericParameterTypes = getMember().getGenericParameterTypes();
        genericParameterTypes.getClass();
        Annotation[][] parameterAnnotations = getMember().getParameterAnnotations();
        parameterAnnotations.getClass();
        return getValueParameters(genericParameterTypes, parameterAnnotations, getMember().isVarArgs());
    }

    @Override // defpackage.agzr
    public boolean isNative() {
        return Modifier.isNative(getMember().getModifiers());
    }

    @Override // defpackage.aglb
    public Method getMember() {
        return this.member;
    }
}
