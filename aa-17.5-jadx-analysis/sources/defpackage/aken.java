package defpackage;

import org.jni_zero.JniZero;

/* loaded from: classes2.dex */
public final class aken extends akdz {
    public aken(akcf akcfVar, akch akchVar) {
        super(akcfVar, akchVar);
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final int a(long j) {
        int iA = this.b.a(j);
        return iA == 0 ? c() : iA;
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final int c() {
        return this.b.c() + 1;
    }

    @Override // defpackage.akdz, defpackage.akcf
    public final int d() {
        return 1;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long e(long j, int i) {
        return this.b.e(j, i);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final long g(long j) {
        return this.b.g(j);
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final long h(long j, int i) {
        int iC = c();
        JniZero.c(this, i, 1, iC);
        if (i == iC) {
            i = 0;
        }
        return this.b.h(j, i);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final akcm r() {
        return this.b.r();
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final boolean t(long j) {
        return this.b.t(j);
    }
}
