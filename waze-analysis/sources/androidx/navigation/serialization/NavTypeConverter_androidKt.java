package androidx.navigation.serialization;

import androidx.navigation.NavType;
import androidx.navigation.serialization.InternalAndroidNavType;
import h.g.b.x;
import h.n.l;
import h.n.o;
import kotlinx.b.a.q;
import kotlinx.b.a.w;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavTypeConverter_androidKt {
    private static final Class<?> getClass(q qVar) throws ClassNotFoundException {
        String strAc = o.ac(qVar.d(), "?", "");
        try {
            Class<?> cls = Class.forName(strAc);
            x.e(cls, "forName(...)");
            return cls;
        } catch (ClassNotFoundException unused) {
            String str = strAc;
            if (o.F(str, ".", false)) {
                Class<?> cls2 = Class.forName(new l("(\\.+)(?!.*\\.)").b(str, "\\$"));
                x.e(cls2, "forName(...)");
                return cls2;
            }
            String strConcat = "Cannot find class with name \"" + qVar.d() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (qVar.h() instanceof w) {
                strConcat = strConcat.concat(".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
            }
            throw new IllegalArgumentException(strConcat);
        }
    }

    public static final NavType<?> parseEnum(q qVar) {
        x.f(qVar, "<this>");
        NavType<?> serializableOrParcelableType$navigation_common = NavType.Companion.parseSerializableOrParcelableType$navigation_common(getClass(qVar), false);
        return serializableOrParcelableType$navigation_common == null ? UNKNOWN.INSTANCE : serializableOrParcelableType$navigation_common;
    }

    public static final NavType<?> parseEnumList(q qVar) throws ClassNotFoundException {
        x.f(qVar, "<this>");
        Class<?> cls = getClass(qVar.g(0));
        x.d(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
        return new InternalAndroidNavType.EnumListType(cls);
    }

    public static final NavType<?> parseNullableEnum(q qVar) throws ClassNotFoundException {
        x.f(qVar, "<this>");
        Class<?> cls = getClass(qVar);
        if (!Enum.class.isAssignableFrom(cls)) {
            return UNKNOWN.INSTANCE;
        }
        x.d(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>?>");
        return new InternalAndroidNavType.EnumNullableType(cls);
    }
}
