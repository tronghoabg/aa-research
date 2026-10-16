package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class akdv implements defpackage.akdu {
    protected akdv() {
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.akdu akduVar) {
        if (this == akduVar) {
            return 0;
        }
        long jA = akduVar.a();
        long jA2 = a();
        if (jA2 == jA) {
            return 0;
        }
        return jA2 < jA ? -1 : 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.akdu)) {
            return false;
        }
        defpackage.akdu akduVar = (defpackage.akdu) obj;
        return a() == akduVar.a() && org.jni_zero.JniZero.d(b(), akduVar.b());
    }

    public final int hashCode() {
        return ((int) (a() ^ (a() >>> 32))) + b().hashCode();
    }

    public final java.lang.String toString() {
        return defpackage.akgk.a.a(this);
    }
}
