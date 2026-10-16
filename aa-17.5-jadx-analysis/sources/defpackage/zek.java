package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class zek {
    public static final xxd a;
    public static final xxd b;

    static {
        xxd xxdVar = new xxd(", ");
        a = new xxa(xxdVar, xxdVar, "null");
        b = new xxd(" & ");
    }

    static Class a(Class cls) {
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    static String b(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type c(Type type) {
        if (!(type instanceof WildcardType)) {
            return zee.e.c(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        int length = lowerBounds.length;
        woy.O(length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (length == 1) {
            return new zej(new Type[]{c(lowerBounds[0])}, new Type[]{Object.class});
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        woy.O(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return new zej(new Type[0], new Type[]{c(upperBounds[0])});
    }

    static TypeVariable d(GenericDeclaration genericDeclaration, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        zei zeiVar = new zei(new zeh(genericDeclaration, str, typeArr));
        woy.S(TypeVariable.class.isInterface(), "%s is not an interface", TypeVariable.class);
        return (TypeVariable) TypeVariable.class.cast(Proxy.newProxyInstance(TypeVariable.class.getClassLoader(), new Class[]{TypeVariable.class}, zeiVar));
    }

    public static void e(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                woy.W(!r1.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, str);
            }
        }
    }

    public static Type[] f(Collection collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }
}
