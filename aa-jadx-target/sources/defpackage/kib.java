package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kib extends defpackage.kxa {
    final /* synthetic */ java.lang.Long a;
    final /* synthetic */ defpackage.kic h;

    public kib(defpackage.kic kicVar, java.lang.Long l) {
        this.a = l;
        this.h = kicVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.kxa
    public final defpackage.eqp a() {
        defpackage.gmz gmzVarJ = this.h.h().j();
        java.util.HashMap map = new java.util.HashMap();
        ?? r0 = gmzVarJ.a;
        for (defpackage.qed qedVar : r0.keySet()) {
            java.lang.Long l = this.a;
            map.put(qedVar, ((kih) r0.get(qedVar)).b(l));
        }
        return defpackage.kic.g(defpackage.tan.g(qdw.b(map)));
    }

    @Override // defpackage.kxa
    public final defpackage.eqp b() {
        return defpackage.kic.g(defpackage.tan.g(this.h.h().b().b(this.a)));
    }
}
