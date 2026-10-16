package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vsd {
    public abstract defpackage.abpy a(java.lang.String str, java.lang.Object obj);

    public abstract defpackage.abpy b(defpackage.abpy abpyVar, defpackage.abpy abpyVar2);

    public abstract java.lang.String c(defpackage.abpy abpyVar);

    public final java.util.List e(java.util.Map map) {
        defpackage.abpy abpyVarA;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (abpyVarA = a((java.lang.String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(abpyVarA);
            }
        }
        return arrayList;
    }

    final java.util.List f(java.util.List list, java.util.List list2) {
        defpackage.abpy abpyVar;
        if (list.isEmpty()) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.abpy abpyVar2 = (defpackage.abpy) it.next();
            java.lang.String strC = c(abpyVar2);
            java.util.Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    abpyVar = null;
                    break;
                }
                abpyVar = (defpackage.abpy) it2.next();
            } while (!strC.equals(c(abpyVar)));
            defpackage.abpy abpyVarB = b(abpyVar2, abpyVar);
            if (abpyVarB != null) {
                arrayList.add(abpyVarB);
            }
        }
        return arrayList;
    }
}
