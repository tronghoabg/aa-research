package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class gzg implements defpackage.hew {
    public final java.util.Map a = new java.util.LinkedHashMap();

    public final java.lang.Object a(java.lang.Object obj, defpackage.gfa gfaVar) {
        defpackage.affg affgVar = (defpackage.affg) this.a.get(obj.getClass());
        java.lang.Object objInvoke = affgVar != null ? affgVar.invoke(obj, gfaVar) : null;
        if (objInvoke != null) {
            return objInvoke;
        }
        defpackage.gnm gnmVar = (defpackage.gnm) gfaVar.F(defpackage.gnm.class);
        ((defpackage.ype) ((defpackage.ype) defpackage.gnv.a.g().o(defpackage.yqn.a, "CarApp.H.Converter")).ai(58)).M("%s has no mapping for input type [%s]", gnmVar.b(getClass()), gnmVar.b(obj.getClass()));
        java.lang.Class<?> cls = getClass();
        java.lang.Class<?> cls2 = obj.getClass();
        throw new java.lang.IllegalArgumentException(cls.getSimpleName() + " has no mapping for input type " + cls2.getSimpleName());
    }

    public final void b(java.lang.Class cls, defpackage.affg affgVar) {
        this.a.put(cls, new defpackage.goh(affgVar, 9));
    }
}
