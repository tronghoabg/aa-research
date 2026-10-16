package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajvk implements java.io.Serializable, java.util.Comparator {
    private static final long serialVersionUID = 4466565437490631532L;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ajvi ajviVar = (defpackage.ajvi) obj;
        defpackage.ajvi ajviVar2 = (defpackage.ajvi) obj2;
        int iCompareTo = ajviVar.c().compareTo(ajviVar2.c());
        if (iCompareTo == 0) {
            java.lang.String strB = ajviVar.b();
            java.lang.String strConcat = "";
            if (strB == null) {
                strB = "";
            } else if (strB.indexOf(46) == -1) {
                strB = strB.concat(".local");
            }
            java.lang.String strB2 = ajviVar2.b();
            if (strB2 != null) {
                strConcat = strB2.indexOf(46) == -1 ? strB2.concat(".local") : strB2;
            }
            iCompareTo = strB.compareToIgnoreCase(strConcat);
        }
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        java.lang.String strD = ajviVar.d();
        if (strD == null) {
            strD = "/";
        }
        java.lang.String strD2 = ajviVar2.d();
        return strD.compareTo(strD2 != null ? strD2 : "/");
    }
}
