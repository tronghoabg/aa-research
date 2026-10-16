package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xx {
    private static final java.util.Map a;
    private static final java.util.Map b;
    private static final java.util.Map c;

    static {
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        arrayMap.put(java.lang.Boolean.class, "bool");
        arrayMap.put(java.lang.Byte.class, "byte");
        arrayMap.put(java.lang.Short.class, "short");
        arrayMap.put(java.lang.Integer.class, "int");
        arrayMap.put(java.lang.Long.class, "long");
        arrayMap.put(java.lang.Double.class, "double");
        arrayMap.put(java.lang.Float.class, "float");
        arrayMap.put(java.lang.String.class, "string");
        arrayMap.put(android.os.Parcelable.class, "parcelable");
        arrayMap.put(java.util.Map.class, "map");
        arrayMap.put(java.util.List.class, "list");
        arrayMap.put(androidx.core.graphics.drawable.IconCompat.class, "image");
        a = arrayMap;
        android.util.ArrayMap arrayMap2 = new android.util.ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(1, "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        b = arrayMap2;
        c = new java.util.HashMap();
    }

    private xx() {
    }

    public static android.os.Bundle a(java.lang.Object obj, java.lang.String str, defpackage.xv xvVar) throws defpackage.xy {
        android.os.Bundle bundleA;
        if (obj != null) {
            java.util.Iterator it = xvVar.a.iterator();
            while (it.hasNext()) {
                if (((defpackage.xu) it.next()).a == obj) {
                    throw new defpackage.xt("Found cycle while bundling type ".concat(java.lang.String.valueOf(obj.getClass().getSimpleName())), xvVar);
                }
            }
        }
        defpackage.xv xvVarB = defpackage.xv.b(obj, str, xvVar);
        try {
            if (obj == null) {
                throw new defpackage.xw("Bundling of null object is not supported", xvVarB);
            }
            if (obj instanceof androidx.core.graphics.drawable.IconCompat) {
                bundleA = new android.os.Bundle(2);
                bundleA.putInt("tag_class_type", 6);
                bundleA.putBundle("tag_value", ((androidx.core.graphics.drawable.IconCompat) obj).g());
            } else {
                boolean z = obj instanceof java.lang.Boolean;
                int i = 0;
                if (z || (obj instanceof java.lang.Byte) || (obj instanceof java.lang.Character) || (obj instanceof java.lang.Short) || (obj instanceof java.lang.Integer) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.Double) || (obj instanceof java.lang.Float) || (obj instanceof java.lang.String) || (obj instanceof android.os.Parcelable)) {
                    android.os.Bundle bundle = new android.os.Bundle(2);
                    bundle.putInt("tag_class_type", 0);
                    if (z) {
                        bundle.putBoolean("tag_value", ((java.lang.Boolean) obj).booleanValue());
                    } else if (obj instanceof java.lang.Byte) {
                        bundle.putByte("tag_value", ((java.lang.Byte) obj).byteValue());
                    } else if (obj instanceof java.lang.Character) {
                        bundle.putChar("tag_value", ((java.lang.Character) obj).charValue());
                    } else if (obj instanceof java.lang.Short) {
                        bundle.putShort("tag_value", ((java.lang.Short) obj).shortValue());
                    } else if (obj instanceof java.lang.Integer) {
                        bundle.putInt("tag_value", ((java.lang.Integer) obj).intValue());
                    } else if (obj instanceof java.lang.Long) {
                        bundle.putLong("tag_value", ((java.lang.Long) obj).longValue());
                    } else if (obj instanceof java.lang.Double) {
                        bundle.putDouble("tag_value", ((java.lang.Double) obj).doubleValue());
                    } else if (obj instanceof java.lang.Float) {
                        bundle.putFloat("tag_value", ((java.lang.Float) obj).floatValue());
                    } else if (obj instanceof java.lang.String) {
                        bundle.putString("tag_value", (java.lang.String) obj);
                    } else {
                        if (!(obj instanceof android.os.Parcelable)) {
                            throw new defpackage.xw("Unsupported primitive type: ".concat(java.lang.String.valueOf(obj.getClass().getName())), xvVarB);
                        }
                        bundle.putParcelable("tag_value", (android.os.Parcelable) obj);
                    }
                    bundleA = bundle;
                } else if (obj instanceof android.os.IInterface) {
                    android.os.IInterface iInterface = (android.os.IInterface) obj;
                    bundleA = new android.os.Bundle(3);
                    java.lang.String name = iInterface.getClass().getName();
                    bundleA.putInt("tag_class_type", 1);
                    bundleA.putBinder("tag_value", iInterface.asBinder());
                    bundleA.putString("tag_class_name", name);
                } else if (obj instanceof android.os.IBinder) {
                    bundleA = new android.os.Bundle(2);
                    bundleA.putInt("tag_class_type", 9);
                    bundleA.putBinder("tag_value", (android.os.IBinder) obj);
                } else if (obj instanceof java.util.Map) {
                    bundleA = new android.os.Bundle(2);
                    java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
                    for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                        android.os.Bundle bundle2 = new android.os.Bundle(2);
                        bundle2.putBundle("tag_1", a(entry.getKey(), defpackage.a.bm(i, "<key ", ">"), xvVarB));
                        if (entry.getValue() != null) {
                            bundle2.putBundle("tag_2", a(entry.getValue(), defpackage.a.bm(i, "<value ", ">"), xvVarB));
                        }
                        i++;
                        arrayList.add(bundle2);
                    }
                    bundleA.putInt("tag_class_type", 2);
                    bundleA.putParcelableArrayList("tag_value", arrayList);
                } else if (obj instanceof java.util.List) {
                    bundleA = f((java.util.List) obj, xvVarB);
                    bundleA.putInt("tag_class_type", 4);
                } else if (obj instanceof java.util.Set) {
                    bundleA = f((java.util.Set) obj, xvVarB);
                    bundleA.putInt("tag_class_type", 3);
                } else if (obj.getClass().isEnum()) {
                    bundleA = g(obj, xvVarB);
                } else if (obj instanceof java.lang.Class) {
                    bundleA = new android.os.Bundle(2);
                    bundleA.putInt("tag_class_type", 8);
                    bundleA.putString("tag_value", ((java.lang.Class) obj).getName());
                } else {
                    if (obj.getClass().isArray()) {
                        throw new defpackage.xw("Object serializing contains an array, use a list or a set instead", xvVarB);
                    }
                    if (obj instanceof defpackage.dur) {
                        bundleA = ((defpackage.dur) obj).a();
                        bundleA.putInt("tag_class_type", 10);
                    } else {
                        java.lang.String name2 = obj.getClass().getName();
                        if (!obj.getClass().isAnnotationPresent(defpackage.rg.class)) {
                            throw new defpackage.xw("Invalid class not marked as CarProtocol: ".concat(java.lang.String.valueOf(name2)), xvVarB);
                        }
                        try {
                            obj.getClass().getDeclaredConstructor(null);
                            java.util.List<java.lang.reflect.Field> listN = n(obj.getClass());
                            android.os.Bundle bundle3 = new android.os.Bundle(listN.size() + 2);
                            bundle3.putInt("tag_class_type", 5);
                            bundle3.putString("tag_class_name", name2);
                            for (java.lang.reflect.Field field : listN) {
                                field.setAccessible(true);
                                java.lang.String strD = d(field);
                                try {
                                    java.lang.Object obj2 = field.get(obj);
                                    if (obj2 != null) {
                                        bundle3.putParcelable(strD, a(obj2, field.getName(), xvVarB));
                                    }
                                } catch (java.lang.IllegalAccessException e) {
                                    throw new defpackage.xw("Field is not accessible: ".concat(strD), xvVarB, e);
                                }
                            }
                            bundleA = bundle3;
                        } catch (java.lang.NoSuchMethodException e2) {
                            throw new defpackage.xw("Class to deserialize is missing a no args constructor: ".concat(java.lang.String.valueOf(name2)), xvVarB, e2);
                        }
                    }
                }
            }
            xvVarB.close();
            return bundleA;
        } catch (java.lang.Throwable th) {
            try {
                xvVarB.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static java.lang.Object b(android.os.Bundle bundle) throws defpackage.xy {
        if (android.util.Log.isLoggable("CarApp.Bun", 3)) {
            android.util.Log.d("CarApp.Bun", "Unbundling ".concat(c(bundle.getInt("tag_class_type"))));
        }
        return l(bundle, defpackage.xv.a());
    }

    static java.lang.String c(int i) {
        java.lang.String str = (java.lang.String) b.get(java.lang.Integer.valueOf(i));
        return str == null ? "unknown" : str;
    }

    static java.lang.String d(java.lang.reflect.Field field) {
        return java.lang.String.valueOf(field.getDeclaringClass().getName()).concat(java.lang.String.valueOf(field.getName()));
    }

    public static java.lang.String e(java.lang.Class cls) {
        java.lang.String str = (java.lang.String) a.get(cls);
        if (str == null) {
            if (java.util.List.class.isAssignableFrom(cls)) {
                return "<List>";
            }
            if (java.util.Map.class.isAssignableFrom(cls)) {
                return "<Map>";
            }
            if (java.util.Set.class.isAssignableFrom(cls)) {
                return "<Set>";
            }
        }
        return str == null ? cls.getSimpleName() : str;
    }

    private static android.os.Bundle f(java.util.Collection collection, defpackage.xv xvVar) throws defpackage.xy {
        android.os.Bundle bundle = new android.os.Bundle(2);
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        java.util.Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(a(it.next(), defpackage.a.bm(i, "<item ", ">"), xvVar));
            i++;
        }
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    private static android.os.Bundle g(java.lang.Object obj, defpackage.xv xvVar) throws defpackage.xy {
        android.os.Bundle bundle = new android.os.Bundle(3);
        bundle.putInt("tag_class_type", 7);
        try {
            bundle.putString("tag_value", (java.lang.String) m(obj.getClass(), "name", xvVar).invoke(obj, null));
            bundle.putString("tag_class_name", obj.getClass().getName());
            return bundle;
        } catch (java.lang.ReflectiveOperationException e) {
            throw new defpackage.xw("Enum missing name method", xvVar, e);
        }
    }

    private static java.lang.Class h(java.lang.String str) throws java.lang.ClassNotFoundException {
        java.lang.Class<?> cls;
        java.util.Map map = c;
        synchronized (map) {
            cls = (java.lang.Class) map.get(str);
            if (cls == null) {
                cls = java.lang.Class.forName(str, false, defpackage.xx.class.getClassLoader());
                map.put(str, cls);
            }
        }
        return cls;
    }

    private static java.lang.Object i(android.os.Bundle bundle, defpackage.xv xvVar) throws defpackage.xy {
        java.lang.String string = bundle.getString("tag_value");
        if (string == null) {
            throw new defpackage.xw("Missing enum name [null]", xvVar);
        }
        java.lang.String string2 = bundle.getString("tag_class_name");
        if (string2 == null) {
            throw new defpackage.xw("Missing enum className [null]", xvVar);
        }
        try {
            java.lang.Class clsH = h(string2);
            if (clsH.isEnum()) {
                return m(clsH, "valueOf", xvVar).invoke(null, string);
            }
            throw new defpackage.xw(defpackage.a.bp(string2, "Class ", " is not an enum"), xvVar);
        } catch (java.lang.ClassNotFoundException e) {
            throw new defpackage.xw(defpackage.a.bp(string2, "Enum class [", "] not found"), xvVar, e);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new defpackage.xw(defpackage.a.bB(string2, string, "Enum value [", "] does not exist in enum class [", "]"), xvVar, e2);
        } catch (java.lang.ReflectiveOperationException e3) {
            throw new defpackage.xw(defpackage.a.bp(string2, "Enum of class [", "] missing valueOf method"), xvVar, e3);
        }
    }

    private static java.lang.Object j(android.os.Bundle bundle, defpackage.xv xvVar) throws defpackage.xy {
        android.os.IBinder binder = bundle.getBinder("tag_value");
        if (binder == null) {
            throw new defpackage.xw("Bundle is missing the binder", xvVar);
        }
        java.lang.String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new defpackage.xw("Bundle is missing IInterface class name", xvVar);
        }
        try {
            java.lang.Class clsH = h(string);
            if (!android.os.IInterface.class.isAssignableFrom(clsH)) {
                throw new defpackage.xw(defpackage.a.bp(string, "Interface class ", " does not implement IInterface"), xvVar);
            }
            java.lang.Object objInvoke = m(clsH, "asInterface", xvVar).invoke(null, binder);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new defpackage.xw("Failed to get interface from binder", xvVar);
        } catch (java.lang.ClassNotFoundException e) {
            throw new defpackage.xw("Binder for unknown IInterface: ".concat(string), xvVar, e);
        } catch (java.lang.ReflectiveOperationException e2) {
            throw new defpackage.xw("Method to create IInterface from a Binder is not accessible for interface: ".concat(string), xvVar, e2);
        }
    }

    private static java.lang.Object k(android.os.Bundle bundle, defpackage.xv xvVar) throws defpackage.xy {
        java.lang.String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new defpackage.xw("Bundle is missing the class name", xvVar);
        }
        try {
            java.lang.Class clsH = h(string);
            if (!clsH.isAnnotationPresent(defpackage.rg.class)) {
                throw new defpackage.xw(defpackage.a.bA(string, "Invalid class not marked as CarProtocol: "), xvVar);
            }
            java.lang.reflect.Constructor declaredConstructor = clsH.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
            for (java.lang.reflect.Field field : n(clsH)) {
                field.setAccessible(true);
                java.lang.String strD = d(field);
                java.lang.Object obj = bundle.get(strD);
                if (obj == null) {
                    obj = bundle.get(strD.replaceAll("androidx.core.graphics.drawable.IconCompat", "androidx.core.graphics.drawable.IconCompat"));
                }
                if (obj instanceof android.os.Bundle) {
                    field.set(objNewInstance, l((android.os.Bundle) obj, xvVar));
                } else if (obj == null && android.util.Log.isLoggable("CarApp.Bun", 3)) {
                    android.util.Log.d("CarApp.Bun", "Value is null for field: " + field);
                }
            }
            return objNewInstance;
        } catch (java.lang.ClassNotFoundException e) {
            throw new defpackage.xw("Object for unknown class: ".concat(string), xvVar, e);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new defpackage.xw("Failed to deserialize class: ".concat(string), xvVar, e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new defpackage.xw("Object missing no args constructor: ".concat(string), xvVar, e3);
        } catch (java.lang.ReflectiveOperationException e4) {
            throw new defpackage.xw("Constructor or field is not accessible: ".concat(string), xvVar, e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Collection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v8 */
    private static java.lang.Object l(android.os.Bundle bundle, defpackage.xv xvVar) throws defpackage.xy {
        ?? map;
        ?? J;
        java.lang.ClassLoader classLoader = defpackage.xx.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        int i = bundle.getInt("tag_class_type");
        defpackage.xv xvVarB = defpackage.xv.b(bundle, c(bundle.getInt("tag_class_type")), xvVar);
        try {
            switch (i) {
                case 0:
                    java.lang.Object obj = bundle.get("tag_value");
                    if (obj == null) {
                        throw new defpackage.xw("Bundle is missing the primitive value", xvVarB);
                    }
                    xvVarB.close();
                    return obj;
                case 1:
                    J = j(bundle, xvVarB);
                    xvVarB.close();
                    return J;
                case 2:
                    java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
                    if (parcelableArrayList == null) {
                        throw new defpackage.xw("Bundle is missing the map", xvVarB);
                    }
                    map = new java.util.HashMap();
                    int size = parcelableArrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        android.os.Bundle bundle2 = (android.os.Bundle) ((android.os.Parcelable) parcelableArrayList.get(i2));
                        android.os.Bundle bundle3 = bundle2.getBundle("tag_1");
                        android.os.Bundle bundle4 = bundle2.getBundle("tag_2");
                        if (bundle3 == null) {
                            throw new defpackage.xw("Bundle is missing key", xvVarB);
                        }
                        map.put(l(bundle3, xvVarB), bundle4 == null ? null : l(bundle4, xvVarB));
                    }
                    J = map;
                    xvVarB.close();
                    return J;
                case 3:
                    map = new java.util.HashSet();
                    o(bundle, map, xvVarB);
                    J = map;
                    xvVarB.close();
                    return J;
                case 4:
                    map = new java.util.ArrayList();
                    o(bundle, map, xvVarB);
                    J = map;
                    xvVarB.close();
                    return J;
                case 5:
                    J = k(bundle, xvVarB);
                    xvVarB.close();
                    return J;
                case 6:
                    android.os.Bundle bundle5 = bundle.getBundle("tag_value");
                    if (bundle5 == null) {
                        throw new defpackage.xw("IconCompat bundle is null", xvVarB);
                    }
                    androidx.core.graphics.drawable.IconCompat iconCompatH = androidx.core.graphics.drawable.IconCompat.h(bundle5);
                    if (iconCompatH == null) {
                        throw new defpackage.xw("Failed to create IconCompat from bundle", xvVarB);
                    }
                    xvVarB.close();
                    return iconCompatH;
                case 7:
                    J = i(bundle, xvVarB);
                    xvVarB.close();
                    return J;
                case 8:
                    java.lang.String string = bundle.getString("tag_value");
                    if (string == null) {
                        throw new defpackage.xw("Class is missing the class name", xvVarB);
                    }
                    try {
                        J = h(string);
                        xvVarB.close();
                        return J;
                    } catch (java.lang.ClassNotFoundException e) {
                        throw new defpackage.xw("Class name is unknown: ".concat(string), xvVarB, e);
                    }
                case 9:
                    android.os.IBinder binder = bundle.getBinder("tag_value");
                    if (binder == null) {
                        throw new defpackage.xw("Bundle is missing the binder", xvVarB);
                    }
                    xvVarB.close();
                    return binder;
                case 10:
                    J = defpackage.dur.b(bundle);
                    xvVarB.close();
                    return J;
                default:
                    throw new defpackage.xw(defpackage.a.bo(i, "Unsupported class type in bundle: "), xvVarB);
            }
        } catch (java.lang.Throwable th) {
            try {
                xvVarB.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static java.lang.reflect.Method m(java.lang.Class cls, java.lang.String str, defpackage.xv xvVar) throws defpackage.xw {
        if (cls == null || cls == java.lang.Object.class) {
            throw new defpackage.xw(defpackage.a.bx(cls, str, "No method ", " in class "), xvVar);
        }
        for (java.lang.reflect.Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return m(cls.getSuperclass(), str, xvVar);
    }

    private static java.util.List n(java.lang.Class cls) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (cls != null && cls != java.lang.Object.class) {
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            arrayList.addAll(n(cls.getSuperclass()));
        }
        return arrayList;
    }

    private static void o(android.os.Bundle bundle, java.util.Collection collection, defpackage.xv xvVar) throws defpackage.xy {
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new defpackage.xw("Bundle is missing the collection", xvVar);
        }
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            collection.add(l((android.os.Bundle) ((android.os.Parcelable) parcelableArrayList.get(i)), xvVar));
        }
    }
}
