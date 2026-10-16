package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yni extends defpackage.yms implements java.io.Serializable {
    public static final defpackage.yni a = new defpackage.yni();
    private static final long serialVersionUID = 0;

    private yni() {
    }

    private java.lang.Object readResolve() {
        return a;
    }

    @Override // defpackage.yms
    public final defpackage.yms c() {
        return defpackage.ymn.a;
    }

    @Override // defpackage.yms, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        java.lang.Comparable comparable2 = (java.lang.Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final java.lang.String toString() {
        return "Ordering.natural().reverse()";
    }
}
