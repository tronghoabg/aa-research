package defpackage;

/* loaded from: classes3.dex */
public abstract class ahvp implements Comparable {
    @Override // java.lang.Comparable
    public int compareTo(ahvp ahvpVar) {
        ahvpVar.getClass();
        int iCompareTo = getDeprecationLevel().compareTo(ahvpVar.getDeprecationLevel());
        if (iCompareTo == 0) {
            iCompareTo = 0;
            if (!getPropagatesToOverrides()) {
                return !ahvpVar.getPropagatesToOverrides() ? 0 : 1;
            }
        }
        return iCompareTo;
    }

    public abstract ahvq getDeprecationLevel();

    public abstract boolean getPropagatesToOverrides();
}
