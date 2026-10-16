package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class yet implements java.lang.Comparable, java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.lang.Comparable b = "";

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(defpackage.yet yetVar) {
        if (yetVar == defpackage.yes.a) {
            return 1;
        }
        if (yetVar == defpackage.yeq.a) {
            return -1;
        }
        java.lang.Comparable comparable = yetVar.b;
        defpackage.ymu ymuVar = defpackage.ymu.a;
        int iCompareTo = "".compareTo("");
        return iCompareTo != 0 ? iCompareTo : java.lang.Boolean.compare(this instanceof defpackage.yer, yetVar instanceof defpackage.yer);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.yet) {
            try {
                if (compareTo((defpackage.yet) obj) == 0) {
                    return true;
                }
            } catch (java.lang.ClassCastException unused) {
            }
        }
        return false;
    }
}
