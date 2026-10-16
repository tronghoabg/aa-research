package defpackage;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class afwd {
    public static final <T> T createAnnotationInstance(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        cls.getClass();
        map.getClass();
        list.getClass();
        aezr aezrVarDG = woy.dG(new afvz(map));
        T t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new afwb(cls, map, woy.dG(new afwa(cls, map)), aezrVarDG, list));
        t.getClass();
        return t;
    }

    public static /* synthetic */ Object createAnnotationInstance$default(Class cls, Map map, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(woy.bp(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return createAnnotationInstance(cls, map, list);
    }

    private static final <T> boolean createAnnotationInstance$equals(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean zF;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (!affa.f(annotation != null ? affa.h(affa.k(annotation)) : null, cls)) {
            return false;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (Method method : list) {
            Object obj2 = map.get(method.getName());
            Object objInvoke = method.invoke(obj, null);
            if (obj2 instanceof boolean[]) {
                objInvoke.getClass();
                zF = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
            } else if (obj2 instanceof char[]) {
                objInvoke.getClass();
                zF = Arrays.equals((char[]) obj2, (char[]) objInvoke);
            } else if (obj2 instanceof byte[]) {
                objInvoke.getClass();
                zF = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
            } else if (obj2 instanceof short[]) {
                objInvoke.getClass();
                zF = Arrays.equals((short[]) obj2, (short[]) objInvoke);
            } else if (obj2 instanceof int[]) {
                objInvoke.getClass();
                zF = Arrays.equals((int[]) obj2, (int[]) objInvoke);
            } else if (obj2 instanceof float[]) {
                objInvoke.getClass();
                zF = Arrays.equals((float[]) obj2, (float[]) objInvoke);
            } else if (obj2 instanceof long[]) {
                objInvoke.getClass();
                zF = Arrays.equals((long[]) obj2, (long[]) objInvoke);
            } else if (obj2 instanceof double[]) {
                objInvoke.getClass();
                zF = Arrays.equals((double[]) obj2, (double[]) objInvoke);
            } else if (obj2 instanceof Object[]) {
                objInvoke.getClass();
                zF = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
            } else {
                zF = affa.f(obj2, objInvoke);
            }
            if (!zF) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int createAnnotationInstance$lambda$2(Map map) {
        int iHashCode = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
        }
        return iHashCode;
    }

    private static final int createAnnotationInstance$lambda$3(aezr<Integer> aezrVar) {
        return ((Number) aezrVar.a()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createAnnotationInstance$lambda$4(Class cls, Map map) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        sb.append(cls.getCanonicalName());
        woy.ct(map.entrySet(), sb, ", ", "(", ")", -1, "...", afwc.INSTANCE);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence createAnnotationInstance$lambda$4$0$0(Map.Entry entry) {
        String string;
        entry.getClass();
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            string.getClass();
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            string.getClass();
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            string.getClass();
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            string.getClass();
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            string.getClass();
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            string.getClass();
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            string.getClass();
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            string.getClass();
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            string.getClass();
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }

    private static final String createAnnotationInstance$lambda$5(aezr<String> aezrVar) {
        return (String) aezrVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createAnnotationInstance$lambda$6(Class cls, Map map, aezr aezrVar, aezr aezrVar2, List list, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(createAnnotationInstance$lambda$3(aezrVar2));
                }
            } else if (name.equals("toString")) {
                return createAnnotationInstance$lambda$5(aezrVar);
            }
        }
        if (affa.f(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(createAnnotationInstance$equals(cls, list, map, woy.cY(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb = new StringBuilder("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb.append(woy.df(objArr));
        sb.append(')');
        throw new aftw(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void throwIllegalArgumentType(int i, String str, Class<?> cls) {
        String qualifiedName;
        afhe afheVarB = affa.f(cls, Class.class) ? affw.b(afhe.class) : (cls.isArray() && affa.f(cls.getComponentType(), Class.class)) ? affw.b(afhe[].class) : affa.l(cls);
        if (affa.f(afheVarB.getQualifiedName(), affw.b(Object[].class).getQualifiedName())) {
            StringBuilder sb = new StringBuilder();
            sb.append(afheVarB.getQualifiedName());
            sb.append('<');
            Class<?> componentType = affa.h(afheVarB).getComponentType();
            componentType.getClass();
            sb.append(affa.l(componentType).getQualifiedName());
            sb.append('>');
            qualifiedName = sb.toString();
        } else {
            qualifiedName = afheVarB.getQualifiedName();
        }
        throw new IllegalArgumentException("Argument #" + i + ' ' + str + " is not of the required type " + qualifiedName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object transformKotlinToJvm(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof afhe) {
            obj = affa.h((afhe) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof afhe[]) {
                obj.getClass();
                afhe[] afheVarArr = (afhe[]) obj;
                ArrayList arrayList = new ArrayList(afheVarArr.length);
                for (afhe afheVar : afheVarArr) {
                    arrayList.add(affa.h(afheVar));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
