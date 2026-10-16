package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qmo extends defpackage.qlz {
    public final java.util.List a = new java.util.ArrayList();
    public final java.util.List b = new java.util.ArrayList();
    public final java.util.Map c = new java.util.HashMap();

    @Override // defpackage.qlz
    public final /* bridge */ /* synthetic */ void b(defpackage.qlz qlzVar) {
        defpackage.qmo qmoVar = (defpackage.qmo) qlzVar;
        qmoVar.a.addAll(this.a);
        qmoVar.b.addAll(this.b);
        for (java.util.Map.Entry entry : this.c.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            for (defpackage.qmv qmvVar : (java.util.List) entry.getValue()) {
                if (qmvVar != null) {
                    java.lang.String str2 = str == null ? "" : str;
                    java.util.Map map = qmoVar.c;
                    if (!map.containsKey(str2)) {
                        map.put(str2, new java.util.ArrayList());
                    }
                    ((java.util.List) map.get(str2)).add(qmvVar);
                }
            }
        }
    }

    public final java.lang.String toString() {
        java.util.HashMap map = new java.util.HashMap();
        java.util.List list = this.a;
        if (!list.isEmpty()) {
            map.put("products", list);
        }
        java.util.List list2 = this.b;
        if (!list2.isEmpty()) {
            map.put("promotions", list2);
        }
        java.util.Map map2 = this.c;
        if (!map2.isEmpty()) {
            map.put("impressions", map2);
        }
        map.put("productAction", null);
        return defpackage.qlz.a(map, 0);
    }
}
