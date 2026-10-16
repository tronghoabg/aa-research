package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class flx {
    public static java.util.List a(defpackage.fnr fnrVar, java.lang.String str) {
        fnrVar.getClass();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.List listBb = defpackage.afga.bb(fnrVar.a(str));
        while (!listBb.isEmpty()) {
            java.lang.String str2 = (java.lang.String) defpackage.afga.ao(listBb);
            linkedHashSet.add(str2);
            listBb.addAll(fnrVar.a(str2));
        }
        return defpackage.afga.aZ(linkedHashSet);
    }
}
