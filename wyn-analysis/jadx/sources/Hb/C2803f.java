package hb;

import com.qonversion.android.sdk.internal.Constants;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: hb.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2803f implements InterfaceC2814q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36322a;

    public /* synthetic */ C2803f(int i5) {
        this.f36322a = i5;
    }

    public static void b(Type type, Class cls) {
        Class<?> clsD = P.d(type);
        if (cls.isAssignableFrom(clsD)) {
            throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsD.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
        }
    }

    @Override // hb.InterfaceC2814q
    public final r a(Type type, Set set, K k) throws NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        int i5;
        P c2805h;
        Class cls;
        InterfaceC2812o interfaceC2812o;
        Class clsD;
        Type[] actualTypeArguments;
        char c10;
        r rVar;
        r rVarNullSafe;
        Class<?> cls2;
        Class<?> cls3;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        Type typeH = type;
        Class cls4 = Integer.TYPE;
        switch (this.f36322a) {
            case 0:
                Type genericComponentType = typeH instanceof GenericArrayType ? ((GenericArrayType) typeH).getGenericComponentType() : typeH instanceof Class ? ((Class) typeH).getComponentType() : null;
                if (genericComponentType != null && set.isEmpty()) {
                    return new C2804g(P.d(genericComponentType), k.b(genericComponentType)).nullSafe();
                }
                return null;
            case 1:
                if ((typeH instanceof Class) || (typeH instanceof ParameterizedType)) {
                    Class clsD2 = P.d(typeH);
                    if (!clsD2.isInterface() && !clsD2.isEnum() && set.isEmpty()) {
                        if (ib.f.d(clsD2)) {
                            b(typeH, List.class);
                            b(typeH, Set.class);
                            b(typeH, Map.class);
                            b(typeH, Collection.class);
                            String str = "Platform " + clsD2;
                            if (typeH instanceof ParameterizedType) {
                                str = str + " in " + typeH;
                            }
                            throw new IllegalArgumentException(N0.a.f(str, " requires explicit JsonAdapter to be registered"));
                        }
                        if (clsD2.isAnonymousClass()) {
                            throw new IllegalArgumentException("Cannot serialize anonymous class ".concat(clsD2.getName()));
                        }
                        if (clsD2.isLocalClass()) {
                            throw new IllegalArgumentException("Cannot serialize local class ".concat(clsD2.getName()));
                        }
                        if (clsD2.getEnclosingClass() != null && !Modifier.isStatic(clsD2.getModifiers())) {
                            throw new IllegalArgumentException("Cannot serialize non-static nested class ".concat(clsD2.getName()));
                        }
                        if (Modifier.isAbstract(clsD2.getModifiers())) {
                            throw new IllegalArgumentException("Cannot serialize abstract class ".concat(clsD2.getName()));
                        }
                        Class<? extends Annotation> cls5 = ib.f.f36942d;
                        if (cls5 != null && clsD2.isAnnotationPresent(cls5)) {
                            throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsD2.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                        }
                        try {
                            try {
                                try {
                                    try {
                                        Constructor declaredConstructor2 = clsD2.getDeclaredConstructor(new Class[0]);
                                        declaredConstructor2.setAccessible(true);
                                        c2805h = new C2805h(declaredConstructor2, clsD2);
                                    } catch (Exception unused) {
                                        throw new IllegalArgumentException("cannot construct instances of ".concat(clsD2.getName()));
                                    }
                                } catch (NoSuchMethodException unused2) {
                                    Class<?> cls6 = Class.forName("sun.misc.Unsafe");
                                    Field declaredField = cls6.getDeclaredField("theUnsafe");
                                    declaredField.setAccessible(true);
                                    c2805h = new C2806i(cls6.getMethod("allocateInstance", Class.class), declaredField.get(null), clsD2);
                                }
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                                declaredMethod.setAccessible(true);
                                int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, cls4);
                                declaredMethod2.setAccessible(true);
                                c2805h = new C2807j(declaredMethod2, clsD2, iIntValue);
                            } catch (IllegalAccessException unused4) {
                                throw new AssertionError();
                            }
                            i5 = 0;
                        } catch (IllegalAccessException unused5) {
                            throw new AssertionError();
                        } catch (NoSuchMethodException unused6) {
                            i5 = 0;
                            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                            declaredMethod3.setAccessible(true);
                            c2805h = new C2805h(declaredMethod3, clsD2);
                        } catch (InvocationTargetException e7) {
                            ib.f.i(e7);
                            throw null;
                        }
                        TreeMap treeMap = new TreeMap();
                        while (typeH != Object.class) {
                            Class clsD3 = P.d(typeH);
                            boolean zD = ib.f.d(clsD3);
                            Field[] declaredFields = clsD3.getDeclaredFields();
                            int length = declaredFields.length;
                            int i10 = i5;
                            while (i10 < length) {
                                Field field = declaredFields[i10];
                                int modifiers = field.getModifiers();
                                if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers) || (!(Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !zD) || ((interfaceC2812o = (InterfaceC2812o) field.getAnnotation(InterfaceC2812o.class)) != null && interfaceC2812o.ignore()))) {
                                    cls = clsD3;
                                } else {
                                    Type typeH2 = ib.f.h(typeH, clsD3, field.getGenericType(), new LinkedHashSet());
                                    Set setE = ib.f.e(field.getAnnotations());
                                    cls = clsD3;
                                    String name = field.getName();
                                    r rVarC = k.c(typeH2, setE, name);
                                    field.setAccessible(true);
                                    if (interfaceC2812o != null) {
                                        String strName = interfaceC2812o.name();
                                        if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(strName)) {
                                            name = strName;
                                        }
                                    }
                                    C2808k c2808k = (C2808k) treeMap.put(name, new C2808k(name, field, rVarC));
                                    if (c2808k != null) {
                                        throw new IllegalArgumentException("Conflicting fields:\n    " + c2808k.f36335b + "\n    " + field);
                                    }
                                }
                                i10++;
                                clsD3 = cls;
                            }
                            Class clsD4 = P.d(typeH);
                            typeH = ib.f.h(typeH, clsD4, clsD4.getGenericSuperclass(), new LinkedHashSet());
                        }
                        return new C2809l(c2805h, treeMap).nullSafe();
                    }
                }
                return null;
            case 2:
                Class clsD5 = P.d(typeH);
                if (set.isEmpty()) {
                    if (clsD5 == List.class || clsD5 == Collection.class) {
                        return new C2810m(k.b(P.a(typeH)), 0).nullSafe();
                    }
                    if (clsD5 == Set.class) {
                        return new C2810m(k.b(P.a(typeH)), 1).nullSafe();
                    }
                }
                return null;
            case 3:
                if (!set.isEmpty() || (clsD = P.d(typeH)) != Map.class) {
                    return null;
                }
                if (typeH == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (!Map.class.isAssignableFrom(clsD)) {
                        throw new IllegalArgumentException();
                    }
                    Type typeH3 = ib.f.h(typeH, clsD, ib.f.c(typeH, clsD, Map.class), new LinkedHashSet());
                    if (!(typeH3 instanceof ParameterizedType)) {
                        c10 = 0;
                        actualTypeArguments = new Type[]{Object.class, Object.class};
                        return new C2804g(k, actualTypeArguments[c10], actualTypeArguments[1]).nullSafe();
                    }
                    actualTypeArguments = ((ParameterizedType) typeH3).getActualTypeArguments();
                }
                c10 = 0;
                return new C2804g(k, actualTypeArguments[c10], actualTypeArguments[1]).nullSafe();
            case 4:
                return null;
            default:
                if (set.isEmpty()) {
                    M m10 = P.f36293b;
                    if (typeH == Boolean.TYPE) {
                        return m10;
                    }
                    M m11 = P.f36294c;
                    if (typeH == Byte.TYPE) {
                        return m11;
                    }
                    M m12 = P.f36295d;
                    if (typeH == Character.TYPE) {
                        return m12;
                    }
                    M m13 = P.f36296e;
                    if (typeH == Double.TYPE) {
                        return m13;
                    }
                    M m14 = P.f36297f;
                    if (typeH == Float.TYPE) {
                        return m14;
                    }
                    M m15 = P.f36298g;
                    if (typeH == cls4) {
                        return m15;
                    }
                    M m16 = P.f36299h;
                    rVar = null;
                    if (typeH == Long.TYPE) {
                        return m16;
                    }
                    M m17 = P.f36300i;
                    if (typeH == Short.TYPE) {
                        return m17;
                    }
                    if (typeH == Boolean.class) {
                        return m10.nullSafe();
                    }
                    if (typeH == Byte.class) {
                        return m11.nullSafe();
                    }
                    if (typeH == Character.class) {
                        return m12.nullSafe();
                    }
                    if (typeH == Double.class) {
                        return m13.nullSafe();
                    }
                    if (typeH == Float.class) {
                        return m14.nullSafe();
                    }
                    if (typeH == Integer.class) {
                        return m15.nullSafe();
                    }
                    if (typeH == Long.class) {
                        return m16.nullSafe();
                    }
                    if (typeH == Short.class) {
                        return m17.nullSafe();
                    }
                    if (typeH == String.class) {
                        return P.f36301j.nullSafe();
                    }
                    if (typeH == Object.class) {
                        return new O(k).nullSafe();
                    }
                    Class clsD6 = P.d(typeH);
                    Set set2 = ib.f.f36939a;
                    s sVar = (s) clsD6.getAnnotation(s.class);
                    if (sVar == null || !sVar.generateAdapter()) {
                        rVarNullSafe = null;
                    } else {
                        try {
                            try {
                                cls3 = Class.forName(clsD6.getName().replace("$", Constants.USER_ID_SEPARATOR) + "JsonAdapter", true, clsD6.getClassLoader());
                            } catch (NoSuchMethodException e10) {
                                e = e10;
                                cls2 = null;
                            }
                            try {
                                if (typeH instanceof ParameterizedType) {
                                    Type[] actualTypeArguments2 = ((ParameterizedType) typeH).getActualTypeArguments();
                                    try {
                                        declaredConstructor = cls3.getDeclaredConstructor(K.class, Type[].class);
                                        objArr = new Object[]{k, actualTypeArguments2};
                                    } catch (NoSuchMethodException unused7) {
                                        declaredConstructor = cls3.getDeclaredConstructor(Type[].class);
                                        objArr = new Object[]{actualTypeArguments2};
                                    }
                                } else {
                                    try {
                                        declaredConstructor = cls3.getDeclaredConstructor(K.class);
                                        objArr = new Object[]{k};
                                    } catch (NoSuchMethodException unused8) {
                                        declaredConstructor = cls3.getDeclaredConstructor(new Class[0]);
                                        objArr = new Object[0];
                                    }
                                }
                                declaredConstructor.setAccessible(true);
                                rVarNullSafe = ((r) declaredConstructor.newInstance(objArr)).nullSafe();
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                                cls2 = cls3;
                                if ((typeH instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
                                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + typeH, e);
                                }
                                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + typeH + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                            }
                        } catch (ClassNotFoundException e12) {
                            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + typeH, e12);
                        } catch (IllegalAccessException e13) {
                            throw new RuntimeException("Failed to access the generated JsonAdapter for " + typeH, e13);
                        } catch (InstantiationException e14) {
                            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + typeH, e14);
                        } catch (InvocationTargetException e15) {
                            ib.f.i(e15);
                            throw null;
                        }
                    }
                    if (rVarNullSafe != null) {
                        return rVarNullSafe;
                    }
                    if (clsD6.isEnum()) {
                        return new N(clsD6).nullSafe();
                    }
                } else {
                    rVar = null;
                }
                return rVar;
        }
    }
}
