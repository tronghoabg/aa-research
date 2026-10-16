package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mcj implements defpackage.lhn {
    public final java.util.Map a = new java.util.HashMap();
    public final defpackage.mci b = new defpackage.mci();
    private final defpackage.nuy c = new defpackage.nec(this, 1);

    public static defpackage.mcj b() {
        return (defpackage.mcj) defpackage.mkp.a.b(defpackage.mcj.class, new defpackage.mbf(2));
    }

    public final defpackage.mci a(java.lang.String str) {
        java.util.Map map = this.a;
        if (map.containsKey(str)) {
            return (defpackage.mci) map.get(str);
        }
        defpackage.mci mciVar = new defpackage.mci();
        mciVar.eQ();
        map.put(str, mciVar);
        return mciVar;
    }

    @Override // defpackage.lhn
    public final void d() {
        defpackage.nuz.b().k(this.c);
        java.util.Map map = this.a;
        java.util.Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((defpackage.mci) it.next()).d();
        }
        map.clear();
    }

    @Override // defpackage.lhn
    public final void eQ() {
        defpackage.nuz.b().f(this.c);
    }
}
