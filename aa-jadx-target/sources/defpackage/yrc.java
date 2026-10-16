package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yrc extends defpackage.yrf {
    private final java.util.Map a;
    private final java.util.Map b;
    private final defpackage.yre c;
    private final defpackage.yrd d;

    public yrc(defpackage.yrb yrbVar) {
        java.util.HashMap map = new java.util.HashMap();
        this.a = map;
        java.util.HashMap map2 = new java.util.HashMap();
        this.b = map2;
        map.putAll(yrbVar.a);
        map2.putAll(yrbVar.b);
        this.c = yrbVar.c;
        this.d = yrbVar.d;
    }

    @Override // defpackage.yrf
    protected final void a(defpackage.ypx ypxVar, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.yre yreVar = (defpackage.yre) this.a.get(ypxVar);
        if (yreVar != null) {
            yreVar.a(ypxVar, obj, obj2);
        } else {
            this.c.a(ypxVar, obj, obj2);
        }
    }

    @Override // defpackage.yrf
    protected final void b(defpackage.ypx ypxVar, java.util.Iterator it, java.lang.Object obj) {
        defpackage.yrd yrdVar = (defpackage.yrd) this.b.get(ypxVar);
        if (yrdVar != null) {
            yrdVar.a(ypxVar, it, obj);
            return;
        }
        defpackage.yrd yrdVar2 = this.d;
        if (yrdVar2 != null && !this.a.containsKey(ypxVar)) {
            yrdVar2.a(ypxVar, it, obj);
        } else {
            while (it.hasNext()) {
                a(ypxVar, it.next(), obj);
            }
        }
    }
}
