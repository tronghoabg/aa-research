package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yrb {
    private static final defpackage.yre e = new defpackage.yqz();
    private static final defpackage.yrd f = new defpackage.yra();
    public final defpackage.yre c;
    public final java.util.Map a = new java.util.HashMap();
    public final java.util.Map b = new java.util.HashMap();
    public defpackage.yrd d = null;

    public yrb(defpackage.yre yreVar) {
        this.c = yreVar;
    }

    public final void a(java.lang.Iterable iterable) {
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            defpackage.ypx ypxVar = (defpackage.ypx) it.next();
            ypxVar.getClass();
            if (ypxVar.b) {
                java.util.Map map = this.a;
                defpackage.yrd yrdVar = f;
                map.remove(ypxVar);
                this.b.put(ypxVar, yrdVar);
            } else {
                java.util.Map map2 = this.b;
                defpackage.yre yreVar = e;
                map2.remove(ypxVar);
                this.a.put(ypxVar, yreVar);
            }
        }
    }
}
