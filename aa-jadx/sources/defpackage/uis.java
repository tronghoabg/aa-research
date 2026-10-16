package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uis {
    public static final int a = defpackage.uuy.a().b;
    public final java.util.List b = new java.util.ArrayList();
    public final java.util.Map c = new java.util.HashMap();

    public final short a(defpackage.uiy uiyVar) {
        java.util.Map map = this.c;
        if (map.containsKey(uiyVar)) {
            return ((java.lang.Short) map.get(uiyVar)).shortValue();
        }
        return (short) 0;
    }

    public final boolean b(defpackage.uiy uiyVar) {
        return this.c.containsKey(uiyVar);
    }

    final synchronized void c(defpackage.uiy uiyVar) {
        java.util.Map map = this.c;
        if (map.containsKey(uiyVar)) {
            ((java.lang.Short) map.get(uiyVar)).shortValue();
        } else {
            if (map.size() >= a) {
                return;
            }
            this.b.add(uiyVar);
            map.put(uiyVar, java.lang.Short.valueOf((short) map.size()));
        }
    }
}
