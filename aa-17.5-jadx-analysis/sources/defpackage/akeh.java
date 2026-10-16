package defpackage;

import org.jni_zero.JniZero;

/* loaded from: classes2.dex */
public abstract class akeh extends akdx {
    final long a;
    private final akcm b;

    public akeh(akch akchVar, akcm akcmVar) {
        super(akchVar);
        if (!akcmVar.e()) {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        long jC = akcmVar.c();
        this.a = jC;
        if (jC < 1) {
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        this.b = akcmVar;
    }

    @Override // defpackage.akcf
    public int d() {
        return 0;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public long f(long j) {
        return j >= 0 ? j % this.a : (((j + 1) % r1) + r1) - 1;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public long g(long j) {
        long j2 = this.a;
        if (j >= 0) {
            return j - (j % j2);
        }
        long j3 = j + 1;
        return (j3 - (j3 % j2)) - j2;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public long h(long j, int i) {
        JniZero.c(this, i, d(), x(j, i));
        return j + ((i - a(j)) * this.a);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final akcm q() {
        return this.b;
    }

    protected int x(long j, int i) {
        return w(j);
    }

    @Override // defpackage.akcf
    public final void v() {
    }
}
