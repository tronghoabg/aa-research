package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ero {
    public static final java.util.List a = defpackage.afga.ac(android.app.Application.class, defpackage.erh.class);
    public static final java.util.List b = defpackage.afga.aa(defpackage.erh.class);

    public static final defpackage.ers a(java.lang.Class cls, java.lang.reflect.Constructor constructor, java.lang.Object... objArr) {
        try {
            return (defpackage.ers) constructor.newInstance(java.util.Arrays.copyOf(objArr, objArr.length));
        } catch (java.lang.IllegalAccessException e) {
            java.util.Objects.toString(cls);
            throw new java.lang.RuntimeException("Failed to access ".concat(cls.toString()), e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException(defpackage.a.bl(cls, "A ", " cannot be instantiated."), e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            java.util.Objects.toString(cls);
            throw new java.lang.RuntimeException("An exception happened in constructor of ".concat(cls.toString()), e3.getCause());
        }
    }

    public static final java.lang.reflect.Constructor b(java.lang.Class cls, java.util.List list) {
        list.getClass();
        java.lang.reflect.Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (java.lang.reflect.Constructor<?> constructor : constructors) {
            java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            java.util.List listBZ = defpackage.afga.bZ(parameterTypes);
            if (defpackage.afga.f(list, listBZ)) {
                constructor.getClass();
                return constructor;
            }
            if (list.size() == listBZ.size() && listBZ.containsAll(list)) {
                throw new java.lang.UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
