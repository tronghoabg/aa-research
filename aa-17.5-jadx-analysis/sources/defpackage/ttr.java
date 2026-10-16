package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ttr {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/camera/prefstorage/Serializer");
    public static final pyk c = c("lat");
    public static final pyk d = c("lng");
    public static final pyk e = c("zoom");
    public static final pyk f = c("tilt");
    public static final pyk g = c("bearing");
    public static final pyk h = new pyk("Camera_tracking");
    public static final pyk i = new pyk("Camera_timestamp");
    public final pyh b;

    public ttr(pyh pyhVar) {
        this.b = pyhVar;
    }

    public static final Object b(pyk pykVar, Class cls, Map map) {
        String string = pykVar.toString();
        if (!map.containsKey(string)) {
            throw new IllegalArgumentException("Missing key: ".concat(String.valueOf(String.valueOf(pykVar))));
        }
        Object obj = map.get(string);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        throw new ClassCastException("Incompatible value: " + String.valueOf(obj) + "[" + String.valueOf(obj.getClass()) + "]  for " + String.valueOf(pykVar) + "  " + cls.toString());
    }

    private static pyk c(String str) {
        return new pyk("Camera_".concat(str));
    }

    public final boolean a() {
        pyh pyhVar = this.b;
        return pyhVar.f(c) || pyhVar.f(d) || pyhVar.f(e) || pyhVar.f(f) || pyhVar.f(g) || pyhVar.f(h) || pyhVar.f(i);
    }
}
