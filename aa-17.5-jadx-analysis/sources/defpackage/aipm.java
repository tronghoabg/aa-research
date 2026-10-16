package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class aipm {
    public static final Object a(aiyl aiylVar, aiyk[] aiykVarArr, afdr afdrVar, afeh afehVar, afck afckVar) {
        Object objA = aipn.a(new ajav(aiykVarArr, afdrVar, afehVar, aiylVar, null), afckVar);
        return objA == afcr.a ? objA : afak.a;
    }

    public static final Type[] getGenericParameterTypesWithEnclosingThis(Constructor<?> constructor) {
        constructor.getClass();
        Type outerClassForInnerClassConstructor = getOuterClassForInnerClassConstructor(constructor);
        if (outerClassForInnerClassConstructor == null) {
            return getGenericParameterTypesWithoutEnclosingThis(constructor);
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(outerClassForInnerClassConstructor);
        affx.a(getGenericParameterTypesWithoutEnclosingThis(constructor), arrayList);
        return (Type[]) arrayList.toArray(new Type[arrayList.size()]);
    }

    private static final Type[] getGenericParameterTypesWithoutEnclosingThis(Constructor<?> constructor) {
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = genericParameterTypes.length;
        if (length != parameterTypes.length) {
            genericParameterTypes.getClass();
            return genericParameterTypes;
        }
        Class<?> declaringClass = constructor.getDeclaringClass();
        if (Modifier.isStatic(declaringClass.getModifiers()) || declaringClass.getDeclaringClass() == null) {
            genericParameterTypes.getClass();
            return genericParameterTypes;
        }
        genericParameterTypes.getClass();
        int i = length - 1;
        int iE = afpt.e(i, 0);
        if (iE >= 0) {
            return (Type[]) (iE == 0 ? afbe.a : iE >= length ? woy.df(genericParameterTypes) : iE == 1 ? woy.bg(genericParameterTypes[i]) : woy.cD(woy.cI(genericParameterTypes, length - iE, length))).toArray(new Type[0]);
        }
        throw new IllegalArgumentException(a.bn(iE, "Requested element count ", " is less than zero."));
    }

    private static final Type getOuterClassForInnerClassConstructor(Constructor<?> constructor) {
        Class<?> declaringClass = constructor.getDeclaringClass();
        Class<?> declaringClass2 = declaringClass.getDeclaringClass();
        if (declaringClass2 == null || Modifier.isStatic(declaringClass.getModifiers())) {
            return null;
        }
        return declaringClass2;
    }
}
