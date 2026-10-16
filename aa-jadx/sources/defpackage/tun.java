package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tun {
    public static final defpackage.ypg a = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/internal/camera/prefstorage/Serializer");
    public static final defpackage.pzf c = c("lat");
    public static final defpackage.pzf d = c("lng");
    public static final defpackage.pzf e = c("zoom");
    public static final defpackage.pzf f = c("tilt");
    public static final defpackage.pzf g = c("bearing");
    public static final defpackage.pzf h = new defpackage.pzf("Camera_tracking");
    public static final defpackage.pzf i = new defpackage.pzf("Camera_timestamp");
    public final defpackage.pzc b;

    public tun(defpackage.pzc pzcVar) {
        this.b = pzcVar;
    }

    public static final java.lang.Object b(defpackage.pzf pzfVar, java.lang.Class cls, java.util.Map map) {
        java.lang.String string = pzfVar.toString();
        if (!map.containsKey(string)) {
            throw new java.lang.IllegalArgumentException("Missing key: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(pzfVar))));
        }
        java.lang.Object obj = map.get(string);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        throw new java.lang.ClassCastException("Incompatible value: " + java.lang.String.valueOf(obj) + "[" + java.lang.String.valueOf(obj.getClass()) + "]  for " + java.lang.String.valueOf(pzfVar) + "  " + cls.toString());
    }

    private static defpackage.pzf c(java.lang.String str) {
        return new defpackage.pzf("Camera_".concat(str));
    }

    public final boolean a() {
        defpackage.pzc pzcVar = this.b;
        return pzcVar.f(c) || pzcVar.f(d) || pzcVar.f(e) || pzcVar.f(f) || pzcVar.f(g) || pzcVar.f(h) || pzcVar.f(i);
    }
}
