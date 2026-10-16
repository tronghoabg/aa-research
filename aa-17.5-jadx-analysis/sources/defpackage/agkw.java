package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class agkw extends aglb implements agzm {
    private final Constructor<?> member;

    public agkw(Constructor<?> constructor) {
        constructor.getClass();
        this.member = constructor;
    }

    @Override // defpackage.agzy
    public List<aglj> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = getMember().getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new aglj(typeVariable));
        }
        return arrayList;
    }

    @Override // defpackage.agzm
    public List<aglk> getValueParameters() {
        Type[] genericParameterTypes = getMember().getGenericParameterTypes();
        genericParameterTypes.getClass();
        int length = genericParameterTypes.length;
        if (length == 0) {
            return afbe.a;
        }
        Class<?> declaringClass = getMember().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) woy.cI(genericParameterTypes, 1, length);
        }
        Annotation[][] parameterAnnotations = getMember().getParameterAnnotations();
        int length2 = parameterAnnotations.length;
        int length3 = genericParameterTypes.length;
        if (length2 < length3) {
            Constructor<?> member = getMember();
            Objects.toString(member);
            throw new IllegalStateException("Illegal generic signature: ".concat(String.valueOf(member)));
        }
        if (length2 > length3) {
            parameterAnnotations.getClass();
            parameterAnnotations = (Annotation[][]) woy.cI(parameterAnnotations, length2 - length3, length2);
        }
        parameterAnnotations.getClass();
        return getValueParameters(genericParameterTypes, parameterAnnotations, getMember().isVarArgs());
    }

    @Override // defpackage.aglb
    public Constructor<?> getMember() {
        return this.member;
    }
}
