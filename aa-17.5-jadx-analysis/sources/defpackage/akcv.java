package defpackage;

import org.jni_zero.JniZero;

/* loaded from: classes2.dex */
public abstract class akcv implements akcu {
    protected akcv() {
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(akcu akcuVar) {
        if (this == akcuVar) {
            return 0;
        }
        long jA = akcuVar.a();
        long jA2 = a();
        if (jA2 == jA) {
            return 0;
        }
        return jA2 < jA ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akcu)) {
            return false;
        }
        akcu akcuVar = (akcu) obj;
        return a() == akcuVar.a() && JniZero.d(b(), akcuVar.b());
    }

    public final int hashCode() {
        return ((int) (a() ^ (a() >>> 32))) + b().hashCode();
    }

    public final String toString() {
        return akfk.a.a(this);
    }
}
