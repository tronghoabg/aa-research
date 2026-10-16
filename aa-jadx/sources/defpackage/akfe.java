package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akfe extends defpackage.akdm implements java.io.Serializable {
    public static final defpackage.akdm a = new defpackage.akfe();
    private static final long serialVersionUID = 2656707858124633367L;

    private akfe() {
    }

    private java.lang.Object readResolve() {
        return a;
    }

    @Override // defpackage.akdm
    public final long a(long j, int i) {
        return org.jni_zero.JniZero.b(j, i);
    }

    @Override // defpackage.akdm
    public final long b(long j, long j2) {
        return org.jni_zero.JniZero.b(j, j2);
    }

    @Override // defpackage.akdm
    public final long c() {
        return 1L;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        long jC = ((defpackage.akdm) obj).c();
        if (jC == 1) {
            return 0;
        }
        return jC > 1 ? -1 : 1;
    }

    @Override // defpackage.akdm
    public final defpackage.akdo d() {
        return defpackage.akdo.l;
    }

    @Override // defpackage.akdm
    public final boolean e() {
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.akfe)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.akdm
    public final boolean f() {
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final java.lang.String toString() {
        return "DurationField[millis]";
    }
}
