package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akfi extends defpackage.akey {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long a;

    public akfi(defpackage.akdo akdoVar, long j) {
        super(akdoVar);
        this.a = j;
    }

    @Override // defpackage.akdm
    public final long a(long j, int i) {
        return org.jni_zero.JniZero.b(j, ((long) i) * this.a);
    }

    @Override // defpackage.akdm
    public final long b(long j, long j2) {
        long j3 = this.a;
        if (j2 != 1) {
            long j4 = 0;
            if (j2 != 0) {
                j4 = j2 * j3;
                if (j4 / j3 != j2) {
                    throw new java.lang.ArithmeticException("Multiplication overflows a long: " + j2 + " * " + j3);
                }
            }
            j3 = j4;
        }
        return org.jni_zero.JniZero.b(j, j3);
    }

    @Override // defpackage.akdm
    public final long c() {
        return this.a;
    }

    @Override // defpackage.akdm
    public final boolean e() {
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.akfi) {
            defpackage.akfi akfiVar = (defpackage.akfi) obj;
            if (this.d == akfiVar.d && this.a == akfiVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((int) this.a) + this.d.hashCode();
    }
}
