package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class xq {
    private static final Map a;
    private static final Map b;

    static {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Boolean.class, "bool");
        arrayMap.put(Byte.class, "byte");
        arrayMap.put(Short.class, "short");
        arrayMap.put(Integer.class, "int");
        arrayMap.put(Long.class, "long");
        arrayMap.put(Double.class, "double");
        arrayMap.put(Float.class, "float");
        arrayMap.put(String.class, "string");
        arrayMap.put(Parcelable.class, "parcelable");
        arrayMap.put(Map.class, "map");
        arrayMap.put(List.class, "list");
        arrayMap.put(IconCompat.class, "image");
        a = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(1, "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        b = arrayMap2;
    }

    private xq() {
    }

    public static Bundle a(Object obj, String str, xo xoVar) throws xr {
        Bundle bundleA;
        if (obj != null) {
            Iterator it = xoVar.a.iterator();
            while (it.hasNext()) {
                if (((xn) it.next()).a == obj) {
                    throw new xm("Found cycle while bundling type ".concat(String.valueOf(obj.getClass().getSimpleName())), xoVar);
                }
            }
        }
        xo xoVarB = xo.b(obj, str, xoVar);
        try {
            if (obj == null) {
                throw new xp("Bundling of null object is not supported", xoVarB);
            }
            if (obj instanceof IconCompat) {
                bundleA = new Bundle(2);
                bundleA.putInt("tag_class_type", 6);
                bundleA.putBundle("tag_value", ((IconCompat) obj).g());
            } else {
                boolean z = obj instanceof Boolean;
                int i = 0;
                if (z || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof String) || (obj instanceof Parcelable)) {
                    Bundle bundle = new Bundle(2);
                    bundle.putInt("tag_class_type", 0);
                    if (z) {
                        bundle.putBoolean("tag_value", ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte("tag_value", ((Byte) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar("tag_value", ((Character) obj).charValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort("tag_value", ((Short) obj).shortValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt("tag_value", ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong("tag_value", ((Long) obj).longValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble("tag_value", ((Double) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat("tag_value", ((Float) obj).floatValue());
                    } else if (obj instanceof String) {
                        bundle.putString("tag_value", (String) obj);
                    } else {
                        if (!(obj instanceof Parcelable)) {
                            throw new xp("Unsupported primitive type: ".concat(String.valueOf(obj.getClass().getName())), xoVarB);
                        }
                        bundle.putParcelable("tag_value", (Parcelable) obj);
                    }
                    bundleA = bundle;
                } else if (obj instanceof IInterface) {
                    IInterface iInterface = (IInterface) obj;
                    bundleA = new Bundle(3);
                    String name = iInterface.getClass().getName();
                    bundleA.putInt("tag_class_type", 1);
                    bundleA.putBinder("tag_value", iInterface.asBinder());
                    bundleA.putString("tag_class_name", name);
                } else if (obj instanceof IBinder) {
                    bundleA = new Bundle(2);
                    bundleA.putInt("tag_class_type", 9);
                    bundleA.putBinder("tag_value", (IBinder) obj);
                } else if (obj instanceof Map) {
                    bundleA = new Bundle(2);
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        Bundle bundle2 = new Bundle(2);
                        bundle2.putBundle("tag_1", a(entry.getKey(), a.bn(i, "<key ", ">"), xoVarB));
                        if (entry.getValue() != null) {
                            bundle2.putBundle("tag_2", a(entry.getValue(), a.bn(i, "<value ", ">"), xoVarB));
                        }
                        i++;
                        arrayList.add(bundle2);
                    }
                    bundleA.putInt("tag_class_type", 2);
                    bundleA.putParcelableArrayList("tag_value", arrayList);
                } else if (obj instanceof List) {
                    bundleA = f((List) obj, xoVarB);
                    bundleA.putInt("tag_class_type", 4);
                } else if (obj instanceof Set) {
                    bundleA = f((Set) obj, xoVarB);
                    bundleA.putInt("tag_class_type", 3);
                } else if (obj.getClass().isEnum()) {
                    bundleA = g(obj, xoVarB);
                } else if (obj instanceof Class) {
                    bundleA = new Bundle(2);
                    bundleA.putInt("tag_class_type", 8);
                    bundleA.putString("tag_value", ((Class) obj).getName());
                } else {
                    if (obj.getClass().isArray()) {
                        throw new xp("Object serializing contains an array, use a list or a set instead", xoVarB);
                    }
                    if (obj instanceof duk) {
                        bundleA = ((duk) obj).a();
                        bundleA.putInt("tag_class_type", 10);
                    } else {
                        String name2 = obj.getClass().getName();
                        if (!obj.getClass().isAnnotationPresent(rb.class)) {
                            throw new xp("Invalid class not marked as CarProtocol: ".concat(String.valueOf(name2)), xoVarB);
                        }
                        try {
                            obj.getClass().getDeclaredConstructor(null);
                            List<Field> listM = m(obj.getClass());
                            Bundle bundle3 = new Bundle(listM.size() + 2);
                            bundle3.putInt("tag_class_type", 5);
                            bundle3.putString("tag_class_name", name2);
                            for (Field field : listM) {
                                field.setAccessible(true);
                                String strD = d(field);
                                try {
                                    Object obj2 = field.get(obj);
                                    if (obj2 != null) {
                                        bundle3.putParcelable(strD, a(obj2, field.getName(), xoVarB));
                                    }
                                } catch (IllegalAccessException e) {
                                    throw new xp("Field is not accessible: ".concat(strD), xoVarB, e);
                                }
                            }
                            bundleA = bundle3;
                        } catch (NoSuchMethodException e2) {
                            throw new xp("Class to deserialize is missing a no args constructor: ".concat(String.valueOf(name2)), xoVarB, e2);
                        }
                    }
                }
            }
            xoVarB.close();
            return bundleA;
        } catch (Throwable th) {
            try {
                xoVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static Object b(Bundle bundle) throws xr {
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", "Unbundling ".concat(c(bundle.getInt("tag_class_type"))));
        }
        return k(bundle, xo.a());
    }

    static String c(int i) {
        String str = (String) b.get(Integer.valueOf(i));
        return str == null ? "unknown" : str;
    }

    static String d(Field field) {
        return String.valueOf(field.getDeclaringClass().getName()).concat(String.valueOf(field.getName()));
    }

    public static String e(Class cls) {
        String str = (String) a.get(cls);
        if (str == null) {
            if (List.class.isAssignableFrom(cls)) {
                return "<List>";
            }
            if (Map.class.isAssignableFrom(cls)) {
                return "<Map>";
            }
            if (Set.class.isAssignableFrom(cls)) {
                return "<Set>";
            }
        }
        return str == null ? cls.getSimpleName() : str;
    }

    private static Bundle f(Collection collection, xo xoVar) throws xr {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(a(it.next(), a.bn(i, "<item ", ">"), xoVar));
            i++;
        }
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    private static Bundle g(Object obj, xo xoVar) throws xr {
        Bundle bundle = new Bundle(3);
        bundle.putInt("tag_class_type", 7);
        try {
            bundle.putString("tag_value", (String) l(obj.getClass(), "name", xoVar).invoke(obj, null));
            bundle.putString("tag_class_name", obj.getClass().getName());
            return bundle;
        } catch (ReflectiveOperationException e) {
            throw new xp("Enum missing name method", xoVar, e);
        }
    }

    private static Object h(Bundle bundle, xo xoVar) throws xr {
        String string = bundle.getString("tag_value");
        if (string == null) {
            throw new xp("Missing enum name [null]", xoVar);
        }
        String string2 = bundle.getString("tag_class_name");
        if (string2 == null) {
            throw new xp("Missing enum className [null]", xoVar);
        }
        try {
            return l(Class.forName(string2), "valueOf", xoVar).invoke(null, string);
        } catch (ClassNotFoundException e) {
            throw new xp(a.bq(string2, "Enum class [", "] not found"), xoVar, e);
        } catch (IllegalArgumentException e2) {
            throw new xp(a.bC(string2, string, "Enum value [", "] does not exist in enum class [", "]"), xoVar, e2);
        } catch (ReflectiveOperationException e3) {
            throw new xp(a.bq(string2, "Enum of class [", "] missing valueOf method"), xoVar, e3);
        }
    }

    private static Object i(Bundle bundle, xo xoVar) throws IllegalAccessException, xr, IllegalArgumentException, InvocationTargetException {
        IBinder binder = bundle.getBinder("tag_value");
        if (binder == null) {
            throw new xp("Bundle is missing the binder", xoVar);
        }
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new xp("Bundle is missing IInterface class name", xoVar);
        }
        try {
            Object objInvoke = l(Class.forName(string), "asInterface", xoVar).invoke(null, binder);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new xp("Failed to get interface from binder", xoVar);
        } catch (ClassNotFoundException e) {
            throw new xp("Binder for unknown IInterface: ".concat(string), xoVar, e);
        } catch (ReflectiveOperationException e2) {
            throw new xp("Method to create IInterface from a Binder is not accessible for interface: ".concat(string), xoVar, e2);
        }
    }

    private static Object j(Bundle bundle, xo xoVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, xr, IllegalArgumentException, InvocationTargetException {
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new xp("Bundle is missing the class name", xoVar);
        }
        try {
            Class<?> cls = Class.forName(string);
            if (!cls.isAnnotationPresent(rb.class)) {
                throw new xp(a.bz(string, "Invalid class not marked as CarProtocol: "), xoVar);
            }
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(null);
            for (Field field : m(cls)) {
                field.setAccessible(true);
                String strD = d(field);
                Object obj = bundle.get(strD);
                if (obj == null) {
                    obj = bundle.get(strD.replaceAll("androidx.core.graphics.drawable.IconCompat", "androidx.core.graphics.drawable.IconCompat"));
                }
                if (obj instanceof Bundle) {
                    field.set(objNewInstance, k((Bundle) obj, xoVar));
                } else if (obj == null && Log.isLoggable("CarApp.Bun", 3)) {
                    Log.d("CarApp.Bun", "Value is null for field: " + field);
                }
            }
            return objNewInstance;
        } catch (ClassNotFoundException e) {
            throw new xp("Object for unknown class: ".concat(string), xoVar, e);
        } catch (IllegalArgumentException e2) {
            throw new xp("Failed to deserialize class: ".concat(string), xoVar, e2);
        } catch (NoSuchMethodException e3) {
            throw new xp("Object missing no args constructor: ".concat(string), xoVar, e3);
        } catch (ReflectiveOperationException e4) {
            throw new xp("Constructor or field is not accessible: ".concat(string), xoVar, e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Collection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map] */
    private static Object k(Bundle bundle, xo xoVar) throws xr {
        Object objI;
        ?? map;
        ClassLoader classLoader = xq.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        int i = bundle.getInt("tag_class_type");
        xo xoVarB = xo.b(bundle, c(bundle.getInt("tag_class_type")), xoVar);
        try {
            switch (i) {
                case 0:
                    Object obj = bundle.get("tag_value");
                    if (obj == null) {
                        throw new xp("Bundle is missing the primitive value", xoVarB);
                    }
                    xoVarB.close();
                    return obj;
                case 1:
                    objI = i(bundle, xoVarB);
                    xoVarB.close();
                    return objI;
                case 2:
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
                    if (parcelableArrayList == null) {
                        throw new xp("Bundle is missing the map", xoVarB);
                    }
                    map = new HashMap();
                    int size = parcelableArrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Bundle bundle2 = (Bundle) ((Parcelable) parcelableArrayList.get(i2));
                        Bundle bundle3 = bundle2.getBundle("tag_1");
                        Bundle bundle4 = bundle2.getBundle("tag_2");
                        if (bundle3 == null) {
                            throw new xp("Bundle is missing key", xoVarB);
                        }
                        map.put(k(bundle3, xoVarB), bundle4 == null ? null : k(bundle4, xoVarB));
                    }
                    objI = map;
                    xoVarB.close();
                    return objI;
                case 3:
                    map = new HashSet();
                    n(bundle, map, xoVarB);
                    objI = map;
                    xoVarB.close();
                    return objI;
                case 4:
                    map = new ArrayList();
                    n(bundle, map, xoVarB);
                    objI = map;
                    xoVarB.close();
                    return objI;
                case 5:
                    objI = j(bundle, xoVarB);
                    xoVarB.close();
                    return objI;
                case 6:
                    Bundle bundle5 = bundle.getBundle("tag_value");
                    if (bundle5 == null) {
                        throw new xp("IconCompat bundle is null", xoVarB);
                    }
                    IconCompat iconCompatH = IconCompat.h(bundle5);
                    if (iconCompatH == null) {
                        throw new xp("Failed to create IconCompat from bundle", xoVarB);
                    }
                    xoVarB.close();
                    return iconCompatH;
                case 7:
                    objI = h(bundle, xoVarB);
                    xoVarB.close();
                    return objI;
                case 8:
                    String string = bundle.getString("tag_value");
                    if (string == null) {
                        throw new xp("Class is missing the class name", xoVarB);
                    }
                    try {
                        objI = Class.forName(string);
                        xoVarB.close();
                        return objI;
                    } catch (ClassNotFoundException e) {
                        throw new xp("Class name is unknown: ".concat(string), xoVarB, e);
                    }
                case 9:
                    IBinder binder = bundle.getBinder("tag_value");
                    if (binder == null) {
                        throw new xp("Bundle is missing the binder", xoVarB);
                    }
                    xoVarB.close();
                    return binder;
                case 10:
                    objI = duk.b(bundle);
                    xoVarB.close();
                    return objI;
                default:
                    throw new xp(a.bp(i, "Unsupported class type in bundle: "), xoVarB);
            }
        } catch (Throwable th) {
            try {
                xoVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static Method l(Class cls, String str, xo xoVar) throws xp, SecurityException {
        if (cls == null || cls == Object.class) {
            throw new xp(a.by(cls, str, "No method ", " in class "), xoVar);
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return l(cls.getSuperclass(), str, xoVar);
    }

    private static List m(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (cls != null && cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            arrayList.addAll(m(cls.getSuperclass()));
        }
        return arrayList;
    }

    private static void n(Bundle bundle, Collection collection, xo xoVar) throws xr {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new xp("Bundle is missing the collection", xoVar);
        }
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            collection.add(k((Bundle) ((Parcelable) parcelableArrayList.get(i)), xoVar));
        }
    }
}
