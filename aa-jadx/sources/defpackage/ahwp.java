package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ahwp implements java.lang.Comparable {
    @Override // java.lang.Comparable
    public int compareTo(defpackage.ahwp ahwpVar) {
        ahwpVar.getClass();
        int iCompareTo = getDeprecationLevel().compareTo(ahwpVar.getDeprecationLevel());
        if (iCompareTo == 0) {
            iCompareTo = 0;
            if (!getPropagatesToOverrides()) {
                return !ahwpVar.getPropagatesToOverrides() ? 0 : 1;
            }
        }
        return iCompareTo;
    }

    public abstract defpackage.ahwq getDeprecationLevel();

    public abstract boolean getPropagatesToOverrides();
}
