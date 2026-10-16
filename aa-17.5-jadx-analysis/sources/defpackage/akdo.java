package defpackage;

import org.jni_zero.JniZero;

/* loaded from: classes2.dex */
final class akdo extends akdz {
    private final akdc a;

    public akdo(akcf akcfVar, akdc akdcVar) {
        super(akcfVar, akch.c);
        this.a = akdcVar;
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final int a(long j) {
        int iA = this.b.a(j);
        return iA <= 0 ? 1 - iA : iA;
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final int c() {
        return this.b.c();
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
        JniZero.c(this, i, 1, c());
        if (this.a.Y(j) <= 0) {
            i = 1 - i;
        }
        return super.h(j, i);
    }

    @Override // defpackage.akdz, defpackage.akcf
    public final akcm s() {
        return this.a.h;
    }
}
