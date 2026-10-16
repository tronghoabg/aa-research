package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class ymi implements defpackage.ymg {
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ymg) {
            defpackage.ymg ymgVar = (defpackage.ymg) obj;
            if (a() == ymgVar.a() && j$.util.Objects.equals(b(), ymgVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object objB = b();
        return a() ^ (objB == null ? 0 : objB.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(b());
        int iA = a();
        if (iA == 1) {
            return strValueOf;
        }
        return strValueOf + " x " + iA;
    }
}
