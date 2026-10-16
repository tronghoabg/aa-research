package w9;

import A7.AbstractC0279p0;
import R8.v;
import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m9.AbstractC3524x;
import m9.C3508g;
import m9.C3514m;
import m9.J;
import m9.g0;
import s8.q;

/* renamed from: w9.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4391j {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f47443a = new ConcurrentHashMap();

    public static void a(String str, boolean z2) {
        if (!z2) {
            throw new RuntimeException("Hard assert failed: ".concat(str));
        }
    }

    public static Object b(Object obj, C4390i c4390i) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        int i5 = c4390i.f47440a;
        if (i5 > 500) {
            throw c(c4390i, "Exceeded maximum depth of 500, which likely indicates there's an object cycle");
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Float)) {
                return obj;
            }
            throw c(c4390i, "Numbers of type " + obj.getClass().getSimpleName() + " are not supported, please use an int, long, float or double");
        }
        if ((obj instanceof String) || (obj instanceof Boolean)) {
            return obj;
        }
        if (obj instanceof Character) {
            throw c(c4390i, "Characters are not supported, please use Strings");
        }
        if (obj instanceof Map) {
            HashMap map = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw c(c4390i, "Maps with non-string keys are not supported");
                }
                String str = (String) key;
                map.put(str, b(entry.getValue(), new C4390i(c4390i, str, i5 + 1)));
            }
            return map;
        }
        if (obj instanceof Collection) {
            if (!(obj instanceof List)) {
                throw c(c4390i, "Serializing Collections is not supported, please use Lists instead");
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                arrayList.add(b(list.get(i10), new C4390i(c4390i, AbstractC0279p0.i(i10, "[", "]"), i5 + 1)));
            }
            return arrayList;
        }
        if (obj.getClass().isArray()) {
            throw c(c4390i, "Serializing Arrays is not supported, please use Lists instead");
        }
        if (obj instanceof Enum) {
            String strName = ((Enum) obj).name();
            try {
                Field field = obj.getClass().getField(strName);
                String strB = C4389h.b(field);
                return strB != null ? strB : field.getName();
            } catch (NoSuchFieldException unused) {
                return strName;
            }
        }
        if ((obj instanceof Date) || (obj instanceof q) || (obj instanceof J) || (obj instanceof C3508g) || (obj instanceof C3514m) || (obj instanceof AbstractC3524x) || (obj instanceof g0)) {
            return obj;
        }
        if ((obj instanceof Uri) || (obj instanceof URI) || (obj instanceof URL)) {
            return obj.toString();
        }
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = f47443a;
        C4389h c4389h = (C4389h) concurrentHashMap.get(cls);
        if (c4389h == null) {
            c4389h = new C4389h(cls);
            concurrentHashMap.put(cls, c4389h);
        }
        Class<?> cls2 = obj.getClass();
        Class cls3 = c4389h.f47432a;
        if (!cls3.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException("Can't serialize object of class " + obj.getClass() + " with BeanMapper for class " + cls3);
        }
        HashMap map2 = new HashMap();
        for (String str2 : c4389h.f47433b.values()) {
            if (!c4389h.f47438g.contains(str2)) {
                HashMap map3 = c4389h.f47434c;
                if (map3.containsKey(str2)) {
                    try {
                        objInvoke = ((Method) map3.get(str2)).invoke(obj, new Object[0]);
                    } catch (IllegalAccessException e7) {
                        throw new RuntimeException(e7);
                    } catch (InvocationTargetException e10) {
                        throw new RuntimeException(e10);
                    }
                } else {
                    Field field2 = (Field) c4389h.f47436e.get(str2);
                    if (field2 == null) {
                        throw new IllegalStateException(v.f("Bean property without field or getter: ", str2));
                    }
                    try {
                        objInvoke = field2.get(obj);
                    } catch (IllegalAccessException e11) {
                        throw new RuntimeException(e11);
                    }
                }
                map2.put(str2, (c4389h.f47437f.contains(str2) && objInvoke == null) ? AbstractC3524x.f40513b : b(objInvoke, new C4390i(c4390i, str2, i5 + 1)));
            }
        }
        return map2;
    }

    public static IllegalArgumentException c(C4390i c4390i, String str) {
        String strConcat = "Could not serialize object. ".concat(str);
        if (c4390i.f47440a > 0) {
            StringBuilder sbQ = AbstractC0279p0.q(strConcat, " (found in field '");
            sbQ.append(c4390i.toString());
            sbQ.append("')");
            strConcat = sbQ.toString();
        }
        return new IllegalArgumentException(strConcat);
    }
}
