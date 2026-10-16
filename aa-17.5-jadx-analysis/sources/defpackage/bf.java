package defpackage;

import android.support.v4.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class bf {
    public static final /* synthetic */ int a = 0;
    private static final aat b = new aat(0);

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        aat aatVar = b;
        aat aatVar2 = (aat) aatVar.get(classLoader);
        if (aatVar2 == null) {
            aatVar2 = new aat(0);
            aatVar.put(classLoader, aatVar2);
        }
        Class cls = (Class) aatVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        aatVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new ay(a.bq(str, "Unable to instantiate fragment ", ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new ay(a.bq(str, "Unable to instantiate fragment ", ": make sure class name exists"), e2);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        try {
            return (Fragment) c(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new ay(a.bq(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new ay(a.bq(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new ay(a.bq(str, "Unable to instantiate fragment ", ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new ay(a.bq(str, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
