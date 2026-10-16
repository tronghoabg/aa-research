package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afxd {
    public static final <T> T createAnnotationInstance(java.lang.Class<T> cls, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.List<java.lang.reflect.Method> list) {
        cls.getClass();
        map.getClass();
        list.getClass();
        defpackage.afar afarVarCA = defpackage.afga.cA(new defpackage.afwz(map));
        T t = (T) java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, new defpackage.afxb(cls, map, defpackage.afga.cA(new defpackage.afxa(cls, map)), afarVarCA, list));
        t.getClass();
        return t;
    }

    public static /* synthetic */ java.lang.Object createAnnotationInstance$default(java.lang.Class cls, java.util.Map map, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            java.util.Set setKeySet = map.keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(setKeySet, 10));
            java.util.Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((java.lang.String) it.next(), null));
            }
            list = arrayList;
        }
        return createAnnotationInstance(cls, map, list);
    }

    private static final <T> boolean createAnnotationInstance$equals(java.lang.Class<T> cls, java.util.List<java.lang.reflect.Method> list, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        boolean zF;
        java.lang.annotation.Annotation annotation = obj instanceof java.lang.annotation.Annotation ? (java.lang.annotation.Annotation) obj : null;
        if (!defpackage.afga.f(annotation != null ? defpackage.afga.h(defpackage.afga.k(annotation)) : null, cls)) {
            return false;
        }
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        for (java.lang.reflect.Method method : list) {
            java.lang.Object obj2 = map.get(method.getName());
            java.lang.Object objInvoke = method.invoke(obj, null);
            if (obj2 instanceof boolean[]) {
                objInvoke.getClass();
                zF = java.util.Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
            } else if (obj2 instanceof char[]) {
                objInvoke.getClass();
                zF = java.util.Arrays.equals((char[]) obj2, (char[]) objInvoke);
            } else if (obj2 instanceof byte[]) {
                objInvoke.getClass();
                zF = java.util.Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
            } else if (obj2 instanceof short[]) {
                objInvoke.getClass();
                zF = java.util.Arrays.equals((short[]) obj2, (short[]) objInvoke);
            } else if (obj2 instanceof int[]) {
                objInvoke.getClass();
                zF = java.util.Arrays.equals((int[]) obj2, (int[]) objInvoke);
            } else if (obj2 instanceof float[]) {
                objInvoke.getClass();
                zF = java.util.Arrays.equals((float[]) obj2, (float[]) objInvoke);
            } else if (obj2 instanceof long[]) {
                objInvoke.getClass();
                zF = java.util.Arrays.equals((long[]) obj2, (long[]) objInvoke);
            } else if (obj2 instanceof double[]) {
                objInvoke.getClass();
                zF = java.util.Arrays.equals((double[]) obj2, (double[]) objInvoke);
            } else if (obj2 instanceof java.lang.Object[]) {
                objInvoke.getClass();
                zF = java.util.Arrays.equals((java.lang.Object[]) obj2, (java.lang.Object[]) objInvoke);
            } else {
                zF = defpackage.afga.f(obj2, objInvoke);
            }
            if (!zF) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int createAnnotationInstance$lambda$2(java.util.Map map) {
        int iHashCode;
        int iHashCode2 = 0;
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value instanceof boolean[]) {
                iHashCode = java.util.Arrays.hashCode((boolean[]) value);
            } else if (value instanceof char[]) {
                iHashCode = java.util.Arrays.hashCode((char[]) value);
            } else if (value instanceof byte[]) {
                iHashCode = java.util.Arrays.hashCode((byte[]) value);
            } else if (value instanceof short[]) {
                iHashCode = java.util.Arrays.hashCode((short[]) value);
            } else if (value instanceof int[]) {
                iHashCode = java.util.Arrays.hashCode((int[]) value);
            } else if (value instanceof float[]) {
                iHashCode = java.util.Arrays.hashCode((float[]) value);
            } else if (value instanceof long[]) {
                iHashCode = java.util.Arrays.hashCode((long[]) value);
            } else if (value instanceof double[]) {
                iHashCode = java.util.Arrays.hashCode((double[]) value);
            } else {
                iHashCode = value instanceof java.lang.Object[] ? java.util.Arrays.hashCode((java.lang.Object[]) value) : value.hashCode();
            }
            iHashCode2 += iHashCode ^ (str.hashCode() * 127);
        }
        return iHashCode2;
    }

    private static final int createAnnotationInstance$lambda$3(defpackage.afar<java.lang.Integer> afarVar) {
        return ((java.lang.Number) afarVar.a()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String createAnnotationInstance$lambda$4(java.lang.Class cls, java.util.Map map) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('@');
        sb.append(cls.getCanonicalName());
        defpackage.afga.bn(map.entrySet(), sb, ", ", "(", ")", -1, "...", defpackage.afxc.INSTANCE);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence createAnnotationInstance$lambda$4$0$0(java.util.Map.Entry entry) {
        java.lang.String string;
        entry.getClass();
        java.lang.String str = (java.lang.String) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = java.util.Arrays.toString((boolean[]) value);
            string.getClass();
        } else if (value instanceof char[]) {
            string = java.util.Arrays.toString((char[]) value);
            string.getClass();
        } else if (value instanceof byte[]) {
            string = java.util.Arrays.toString((byte[]) value);
            string.getClass();
        } else if (value instanceof short[]) {
            string = java.util.Arrays.toString((short[]) value);
            string.getClass();
        } else if (value instanceof int[]) {
            string = java.util.Arrays.toString((int[]) value);
            string.getClass();
        } else if (value instanceof float[]) {
            string = java.util.Arrays.toString((float[]) value);
            string.getClass();
        } else if (value instanceof long[]) {
            string = java.util.Arrays.toString((long[]) value);
            string.getClass();
        } else if (value instanceof double[]) {
            string = java.util.Arrays.toString((double[]) value);
            string.getClass();
        } else if (value instanceof java.lang.Object[]) {
            string = java.util.Arrays.toString((java.lang.Object[]) value);
            string.getClass();
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }

    private static final java.lang.String createAnnotationInstance$lambda$5(defpackage.afar<java.lang.String> afarVar) {
        return (java.lang.String) afarVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object createAnnotationInstance$lambda$6(java.lang.Class cls, java.util.Map map, defpackage.afar afarVar, defpackage.afar afarVar2, java.util.List list, java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return java.lang.Integer.valueOf(createAnnotationInstance$lambda$3(afarVar2));
                }
            } else if (name.equals("toString")) {
                return createAnnotationInstance$lambda$5(afarVar);
            }
        }
        if (defpackage.afga.f(name, "equals") && objArr != null && objArr.length == 1) {
            return java.lang.Boolean.valueOf(createAnnotationInstance$equals(cls, list, map, defpackage.afga.bS(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new java.lang.Object[0];
        }
        sb.append(defpackage.afga.bZ(objArr));
        sb.append(')');
        throw new defpackage.afuw(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void throwIllegalArgumentType(int i, java.lang.String str, java.lang.Class<?> cls) {
        defpackage.afie afieVarB;
        java.lang.String qualifiedName;
        if (defpackage.afga.f(cls, java.lang.Class.class)) {
            afieVarB = defpackage.afgw.b(defpackage.afie.class);
        } else {
            afieVarB = (cls.isArray() && defpackage.afga.f(cls.getComponentType(), java.lang.Class.class)) ? defpackage.afgw.b(defpackage.afie[].class) : defpackage.afga.l(cls);
        }
        if (defpackage.afga.f(afieVarB.getQualifiedName(), defpackage.afgw.b(java.lang.Object[].class).getQualifiedName())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(afieVarB.getQualifiedName());
            sb.append('<');
            java.lang.Class<?> componentType = defpackage.afga.h(afieVarB).getComponentType();
            componentType.getClass();
            sb.append(defpackage.afga.l(componentType).getQualifiedName());
            sb.append('>');
            qualifiedName = sb.toString();
        } else {
            qualifiedName = afieVarB.getQualifiedName();
        }
        throw new java.lang.IllegalArgumentException("Argument #" + i + ' ' + str + " is not of the required type " + qualifiedName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object transformKotlinToJvm(java.lang.Object obj, java.lang.Class<?> cls) {
        if (obj instanceof java.lang.Class) {
            return null;
        }
        if (obj instanceof defpackage.afie) {
            obj = defpackage.afga.h((defpackage.afie) obj);
        } else if (obj instanceof java.lang.Object[]) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            if (objArr instanceof java.lang.Class[]) {
                return null;
            }
            if (objArr instanceof defpackage.afie[]) {
                obj.getClass();
                defpackage.afie[] afieVarArr = (defpackage.afie[]) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(afieVarArr.length);
                for (defpackage.afie afieVar : afieVarArr) {
                    arrayList.add(defpackage.afga.h(afieVar));
                }
                obj = arrayList.toArray(new java.lang.Class[0]);
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
