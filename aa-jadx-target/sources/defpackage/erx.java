package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class erx implements defpackage.erw {
    public static defpackage.erx c;

    @Override // defpackage.erw
    public defpackage.ers a(java.lang.Class cls) {
        return defpackage.ebl.k(cls);
    }

    @Override // defpackage.erw
    public defpackage.ers b(java.lang.Class cls, defpackage.esi esiVar) {
        return a(cls);
    }

    @Override // defpackage.erw
    public final defpackage.ers c(defpackage.afie afieVar, defpackage.esi esiVar) {
        java.lang.Class<?> jClass = ((defpackage.affr) afieVar).getJClass();
        jClass.getClass();
        return b(jClass, esiVar);
    }
}
