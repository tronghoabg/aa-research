package hb;

import Va.M6;
import cb.AbstractC1593a;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final C2803f f36292a = new C2803f(5);

    /* renamed from: b, reason: collision with root package name */
    public static final M f36293b = new M(1);

    /* renamed from: c, reason: collision with root package name */
    public static final M f36294c = new M(2);

    /* renamed from: d, reason: collision with root package name */
    public static final M f36295d = new M(3);

    /* renamed from: e, reason: collision with root package name */
    public static final M f36296e = new M(4);

    /* renamed from: f, reason: collision with root package name */
    public static final M f36297f = new M(5);

    /* renamed from: g, reason: collision with root package name */
    public static final M f36298g = new M(6);

    /* renamed from: h, reason: collision with root package name */
    public static final M f36299h = new M(7);

    /* renamed from: i, reason: collision with root package name */
    public static final M f36300i = new M(8);

    /* renamed from: j, reason: collision with root package name */
    public static final M f36301j = new M(0);

    public static Type a(Type type) {
        if (!Collection.class.isAssignableFrom(Collection.class)) {
            throw new IllegalArgumentException();
        }
        Type typeH = ib.f.h(type, Collection.class, ib.f.c(type, Collection.class, Collection.class), new LinkedHashSet());
        if (typeH instanceof WildcardType) {
            typeH = ((WildcardType) typeH).getUpperBounds()[0];
        }
        return typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments()[0] : Object.class;
    }

    public static boolean b(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? b(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return b(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof ib.d ? ((ib.d) parameterizedType).f36936c : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof ib.d ? ((ib.d) parameterizedType2).f36936c : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return b(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static String c(int i5, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder("$");
        for (int i10 = 0; i10 < i5; i10++) {
            int i11 = iArr[i10];
            if (i11 == 1 || i11 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i10]);
                sb2.append(']');
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                sb2.append('.');
                String str = strArr[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public static Class d(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) d(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return d(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static ib.d f(Class cls, Type... typeArr) {
        if (typeArr.length != 0) {
            return new ib.d(null, cls, typeArr);
        }
        throw new IllegalArgumentException(M6.n(cls, "Missing type arguments for "));
    }

    public static int g(w wVar, String str, int i5, int i10) {
        int iZ = wVar.z();
        if (iZ >= i5 && iZ <= i10) {
            return iZ;
        }
        String strI = wVar.i();
        StringBuilder sbK = AbstractC1593a.k(iZ, "Expected ", str, " but was ", " at path ");
        sbK.append(strI);
        throw new E5.Q(sbK.toString(), 11);
    }

    public abstract Object e();
}
