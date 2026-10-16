package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class akfh extends defpackage.akex {
    final long a;
    private final defpackage.akdm b;

    public akfh(defpackage.akdh akdhVar, defpackage.akdm akdmVar) {
        super(akdhVar);
        if (!akdmVar.e()) {
            throw new java.lang.IllegalArgumentException("Unit duration field must be precise");
        }
        long jC = akdmVar.c();
        this.a = jC;
        if (jC < 1) {
            throw new java.lang.IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        this.b = akdmVar;
    }

    @Override // defpackage.akdf
    public int d() {
        return 0;
    }

    @Override // defpackage.akex, defpackage.akdf
    public long f(long j) {
        long j2 = this.a;
        return j >= 0 ? j % j2 : (((j + 1) % j2) + j2) - 1;
    }

    @Override // defpackage.akex, defpackage.akdf
    public long g(long j) {
        long j2 = this.a;
        if (j >= 0) {
            return j - (j % j2);
        }
        long j3 = j + 1;
        return (j3 - (j3 % j2)) - j2;
    }

    @Override // defpackage.akex, defpackage.akdf
    public long h(long j, int i) {
        org.jni_zero.JniZero.c(this, i, d(), x(j, i));
        return j + (((long) (i - a(j))) * this.a);
    }

    @Override // defpackage.akex, defpackage.akdf
    public final defpackage.akdm q() {
        return this.b;
    }

    protected int x(long j, int i) {
        return w(j);
    }

    @Override // defpackage.akdf
    public final void v() {
    }
}
