package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hxq {
    private final defpackage.hxp a = new defpackage.hxp(null);
    private final java.util.Map b = new java.util.HashMap();

    private static void d(defpackage.hxp hxpVar) {
        defpackage.hxp hxpVar2 = hxpVar.d;
        hxpVar2.c = hxpVar.c;
        hxpVar.c.d = hxpVar2;
    }

    private static void e(defpackage.hxp hxpVar) {
        hxpVar.c.d = hxpVar;
        hxpVar.d.c = hxpVar;
    }

    public final java.lang.Object a(defpackage.hxx hxxVar) {
        java.util.Map map = this.b;
        defpackage.hxp hxpVar = (defpackage.hxp) map.get(hxxVar);
        if (hxpVar == null) {
            hxpVar = new defpackage.hxp(hxxVar);
            map.put(hxxVar, hxpVar);
        } else {
            hxxVar.a();
        }
        d(hxpVar);
        defpackage.hxp hxpVar2 = this.a;
        hxpVar.d = hxpVar2;
        hxpVar.c = hxpVar2.c;
        e(hxpVar);
        return hxpVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [hxx, java.lang.Object] */
    public final java.lang.Object b() {
        defpackage.hxp hxpVar = this.a;
        for (defpackage.hxp hxpVar2 = hxpVar.d; !hxpVar2.equals(hxpVar); hxpVar2 = hxpVar2.d) {
            java.lang.Object objB = hxpVar2.b();
            if (objB != null) {
                return objB;
            }
            d(hxpVar2);
            java.util.Map map = this.b;
            ?? r3 = hxpVar2.a;
            map.remove(r3);
            r3.a();
        }
        return null;
    }

    public final void c(defpackage.hxx hxxVar, java.lang.Object obj) {
        java.util.Map map = this.b;
        defpackage.hxp hxpVar = (defpackage.hxp) map.get(hxxVar);
        if (hxpVar == null) {
            hxpVar = new defpackage.hxp(hxxVar);
            d(hxpVar);
            defpackage.hxp hxpVar2 = this.a;
            hxpVar.d = hxpVar2.d;
            hxpVar.c = hxpVar2;
            e(hxpVar);
            map.put(hxxVar, hxpVar);
        } else {
            hxxVar.a();
        }
        if (hxpVar.b == null) {
            hxpVar.b = new java.util.ArrayList();
        }
        hxpVar.b.add(obj);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GroupedLinkedMap( ");
        defpackage.hxp hxpVar = this.a;
        defpackage.hxp hxpVar2 = hxpVar.c;
        boolean z = false;
        while (!hxpVar2.equals(hxpVar)) {
            sb.append('{');
            sb.append(hxpVar2.a);
            sb.append(':');
            sb.append(hxpVar2.a());
            sb.append("}, ");
            hxpVar2 = hxpVar2.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
