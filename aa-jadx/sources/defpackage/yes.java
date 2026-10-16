package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yes extends defpackage.yet {
    public static final defpackage.yes a = new defpackage.yes();
    private static final long serialVersionUID = 0;

    private yes() {
    }

    private java.lang.Object readResolve() {
        return a;
    }

    @Override // defpackage.yet
    /* JADX INFO: renamed from: a */
    public final int compareTo(defpackage.yet yetVar) {
        return yetVar == this ? 0 : -1;
    }

    @Override // defpackage.yet, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return compareTo((defpackage.yet) obj);
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this);
    }

    public final java.lang.String toString() {
        return "-∞";
    }
}
