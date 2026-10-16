package defpackage;

import org.jni_zero.JniZero;

/* loaded from: classes2.dex */
public final class akei extends akdy {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long a;

    public akei(akco akcoVar, long j) {
        super(akcoVar);
        this.a = j;
    }

    @Override // defpackage.akcm
    public final long a(long j, int i) {
        return JniZero.b(j, i * this.a);
    }

    @Override // defpackage.akcm
    public final long b(long j, long j2) {
        long j3 = this.a;
        if (j2 != 1) {
            long j4 = 0;
            if (j2 != 0) {
                j4 = j2 * j3;
                if (j4 / j3 != j2) {
                    throw new ArithmeticException("Multiplication overflows a long: " + j2 + " * " + j3);
                }
            }
            j3 = j4;
        }
        return JniZero.b(j, j3);
    }

    @Override // defpackage.akcm
    public final long c() {
        return this.a;
    }

    @Override // defpackage.akcm
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akei) {
            akei akeiVar = (akei) obj;
            if (this.d == akeiVar.d && this.a == akeiVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((int) this.a) + this.d.hashCode();
    }
}
