package defpackage;

import java.io.Serializable;
import org.jni_zero.JniZero;

/* loaded from: classes2.dex */
public final class akee extends akcm implements Serializable {
    public static final akcm a = new akee();
    private static final long serialVersionUID = 2656707858124633367L;

    private akee() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.akcm
    public final long a(long j, int i) {
        return JniZero.b(j, i);
    }

    @Override // defpackage.akcm
    public final long b(long j, long j2) {
        return JniZero.b(j, j2);
    }

    @Override // defpackage.akcm
    public final long c() {
        return 1L;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long jC = ((akcm) obj).c();
        if (jC == 1) {
            return 0;
        }
        return jC > 1 ? -1 : 1;
    }

    @Override // defpackage.akcm
    public final akco d() {
        return akco.l;
    }

    @Override // defpackage.akcm
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akee)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.akcm
    public final boolean f() {
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "DurationField[millis]";
    }
}
