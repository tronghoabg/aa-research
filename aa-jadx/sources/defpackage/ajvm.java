package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajvm implements java.io.Serializable, java.util.Comparator {
    public static final defpackage.ajvm a = new defpackage.ajvm();
    private static final long serialVersionUID = 7523645369616405818L;

    private static final java.lang.String a(defpackage.ajvi ajviVar) {
        java.lang.String strD = ajviVar.d();
        if (strD == null) {
            strD = "/";
        }
        return !strD.endsWith("/") ? strD.concat("/") : strD;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String strA = a((defpackage.ajvi) obj);
        java.lang.String strA2 = a((defpackage.ajvi) obj2);
        if (strA.equals(strA2)) {
            return 0;
        }
        if (strA.startsWith(strA2)) {
            return -1;
        }
        return strA2.startsWith(strA) ? 1 : 0;
    }
}
