package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akfn extends defpackage.akez {
    public akfn(defpackage.akdf akdfVar, defpackage.akdh akdhVar) {
        super(akdfVar, akdhVar);
    }

    @Override // defpackage.akez, defpackage.akex, defpackage.akdf
    public final int a(long j) {
        int iA = this.b.a(j);
        return iA == 0 ? c() : iA;
    }

    @Override // defpackage.akez, defpackage.akex, defpackage.akdf
    public final int c() {
        return this.b.c() + 1;
    }

    @Override // defpackage.akez, defpackage.akdf
    public final int d() {
        return 1;
    }

    @Override // defpackage.akex, defpackage.akdf
    public final long e(long j, int i) {
        return this.b.e(j, i);
    }

    @Override // defpackage.akex, defpackage.akdf
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.akez, defpackage.akex, defpackage.akdf
    public final long g(long j) {
        return this.b.g(j);
    }

    @Override // defpackage.akez, defpackage.akex, defpackage.akdf
    public final long h(long j, int i) {
        int iC = c();
        org.jni_zero.JniZero.c(this, i, 1, iC);
        if (i == iC) {
            i = 0;
        }
        return this.b.h(j, i);
    }

    @Override // defpackage.akex, defpackage.akdf
    public final defpackage.akdm r() {
        return this.b.r();
    }

    @Override // defpackage.akex, defpackage.akdf
    public final boolean t(long j) {
        return this.b.t(j);
    }
}
