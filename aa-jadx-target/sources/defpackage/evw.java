package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class evw {
    public static final java.util.Map a = new java.util.LinkedHashMap();
    private final java.util.Map b = new java.util.LinkedHashMap();

    public final defpackage.evv a(java.lang.String str) {
        str.getClass();
        if (!defpackage.ebo.j(str)) {
            throw new java.lang.IllegalArgumentException("navigator name cannot be an empty string");
        }
        defpackage.evv evvVar = (defpackage.evv) this.b.get(str);
        if (evvVar != null) {
            return evvVar;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bp(str, "Could not find Navigator with name \"", "\". You must call NavController.addNavigator() for each navigation type."));
    }

    public final java.util.Map b() {
        return defpackage.afga.X(this.b);
    }

    public final void c(defpackage.evv evvVar) {
        java.lang.String strK = defpackage.ebo.k(evvVar.getClass());
        if (!defpackage.ebo.j(strK)) {
            throw new java.lang.IllegalArgumentException("navigator name cannot be an empty string");
        }
        java.util.Map map = this.b;
        defpackage.evv evvVar2 = (defpackage.evv) map.get(strK);
        if (defpackage.afga.f(evvVar2, evvVar)) {
            return;
        }
        if (evvVar2 != null && evvVar2.a) {
            throw new java.lang.IllegalStateException(defpackage.a.bs(evvVar2, evvVar, "Navigator ", " is replacing an already attached "));
        }
        if (evvVar.a) {
            throw new java.lang.IllegalStateException(defpackage.a.bl(evvVar, "Navigator ", " is already attached to another NavController"));
        }
    }
}
