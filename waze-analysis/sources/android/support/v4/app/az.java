package android.support.v4.app;

import androidx.collection.SimpleArrayMap;
import java.lang.reflect.InvocationTargetException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class az {

    /* renamed from: a, reason: collision with root package name */
    private static final SimpleArrayMap f149a = new SimpleArrayMap();

    public static Class b(ClassLoader classLoader, String str) {
        try {
            return d(classLoader, str);
        } catch (ClassCastException e2) {
            throw new an(k.g(str, "Unable to instantiate fragment ", ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e3) {
            throw new an(k.g(str, "Unable to instantiate fragment ", ": make sure class name exists"), e3);
        }
    }

    static boolean c(ClassLoader classLoader, String str) {
        try {
            return ar.class.isAssignableFrom(d(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class d(ClassLoader classLoader, String str) throws ClassNotFoundException {
        SimpleArrayMap simpleArrayMap = f149a;
        SimpleArrayMap simpleArrayMap2 = (SimpleArrayMap) simpleArrayMap.get(classLoader);
        if (simpleArrayMap2 == null) {
            simpleArrayMap2 = new SimpleArrayMap();
            simpleArrayMap.put(classLoader, simpleArrayMap2);
        }
        Class cls = (Class) simpleArrayMap2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        simpleArrayMap2.put(str, cls2);
        return cls2;
    }

    public ar a(ClassLoader classLoader, String str) {
        try {
            return (ar) b(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new an(k.g(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e3) {
            throw new an(k.g(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new an(k.g(str, "Unable to instantiate fragment ", ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new an(k.g(str, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), e5);
        }
    }
}
