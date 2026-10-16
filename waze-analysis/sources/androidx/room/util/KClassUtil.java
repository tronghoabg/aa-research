package androidx.room.util;

import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class KClassUtil {
    public static final <T, C> T findAndInstantiateDatabaseImpl(Class<C> cls, String str) throws ClassNotFoundException {
        String name;
        String str2;
        x.f(cls, "klass");
        x.f(str, "suffix");
        Package r0 = cls.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = cls.getCanonicalName();
        x.c(canonicalName);
        String str3 = name;
        if (str3.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            x.e(canonicalName, "substring(...)");
        }
        String strConcat = String.valueOf(o.ad(canonicalName, '.', '_')).concat(String.valueOf(str));
        try {
            if (str3.length() == 0) {
                str2 = strConcat;
            } else {
                str2 = name + '.' + strConcat;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            x.d(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            return (T) cls2.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Cannot access the constructor ".concat(String.valueOf(cls.getCanonicalName())), e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("Failed to create an instance of ".concat(String.valueOf(cls.getCanonicalName())), e4);
        }
    }

    public static /* synthetic */ Object findAndInstantiateDatabaseImpl$default(Class cls, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "_Impl";
        }
        return findAndInstantiateDatabaseImpl(cls, str);
    }
}
