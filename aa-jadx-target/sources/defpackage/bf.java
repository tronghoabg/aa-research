package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class bf {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.aba b = new defpackage.aba(0);

    public static java.lang.Class b(java.lang.ClassLoader classLoader, java.lang.String str) throws java.lang.ClassNotFoundException {
        defpackage.aba abaVar = b;
        defpackage.aba abaVar2 = (defpackage.aba) abaVar.get(classLoader);
        if (abaVar2 == null) {
            abaVar2 = new defpackage.aba(0);
            abaVar.put(classLoader, abaVar2);
        }
        java.lang.Class cls = (java.lang.Class) abaVar2.get(str);
        if (cls != null) {
            return cls;
        }
        java.lang.Class<?> cls2 = java.lang.Class.forName(str, false, classLoader);
        abaVar2.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ay */
    public static java.lang.Class c(java.lang.ClassLoader classLoader, java.lang.String str) throws ay {
        try {
            return b(classLoader, str);
        } catch (java.lang.ClassCastException e) {
            throw new ay(defpackage.a.bp(str, "Unable to instantiate fragment ", ": make sure class is a valid subclass of Fragment"), e);
        } catch (java.lang.ClassNotFoundException e2) {
            throw new ay(defpackage.a.bp(str, "Unable to instantiate fragment ", ": make sure class name exists"), e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ay */
    public android.support.v4.app.Fragment a(java.lang.ClassLoader classLoader, java.lang.String str) throws ay {
        try {
            return (android.support.v4.app.Fragment) c(classLoader, str).getConstructor(null).newInstance(null);
        } catch (java.lang.IllegalAccessException e) {
            throw new ay(defpackage.a.bp(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (java.lang.InstantiationException e2) {
            throw new ay(defpackage.a.bp(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new ay(defpackage.a.bp(str, "Unable to instantiate fragment ", ": could not find Fragment constructor"), e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            throw new ay(defpackage.a.bp(str, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
