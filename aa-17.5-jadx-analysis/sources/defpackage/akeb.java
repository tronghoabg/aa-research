package defpackage;

import org.jni_zero.JniZero;

/* loaded from: classes2.dex */
public final class akeb extends akdz {
    final int a;
    final akcm c;
    final akcm d;
    private final int e;
    private final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akeb(akcf akcfVar, akch akchVar) {
        super(akcfVar, akchVar);
        akcm akcmVarS = akcfVar.s();
        akcm akcmVarQ = akcfVar.q();
        if (akcmVarQ == null) {
            this.c = null;
        } else {
            this.c = new akek(akcmVarQ, ((akcg) akchVar).a);
        }
        this.d = akcmVarS;
        this.a = 100;
        int iD = akcfVar.d();
        int i = iD >= 0 ? iD / 100 : ((iD + 1) / 100) - 1;
        int iC = akcfVar.c();
        int i2 = iC >= 0 ? iC / 100 : ((iC + 1) / 100) - 1;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final int a(long j) {
        int iA = this.b.a(j);
        return iA >= 0 ? iA / 100 : ((iA + 1) / 100) - 1;
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final int c() {
        return this.f;
    }

    @Override // defpackage.akdz, defpackage.akcf
    public final int d() {
        return this.e;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long e(long j, int i) {
        return this.b.e(j, i * 100);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long f(long j) {
        return h(j, a(this.b.f(j)));
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final long g(long j) {
        int iA = a(j) * 100;
        akcf akcfVar = this.b;
        return akcfVar.g(akcfVar.h(j, iA));
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final long h(long j, int i) {
        JniZero.c(this, i, this.e, this.f);
        akcf akcfVar = this.b;
        int iA = akcfVar.a(j);
        return akcfVar.h(j, (i * 100) + (iA >= 0 ? iA % 100 : ((iA + 1) % 100) + 99));
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final akcm q() {
        return this.c;
    }

    @Override // defpackage.akdz, defpackage.akcf
    public final akcm s() {
        akcm akcmVar = this.d;
        return akcmVar != null ? akcmVar : super.s();
    }
}
