package defpackage;

import org.jni_zero.JniZero;

/* loaded from: classes2.dex */
public final class akej extends akdz {
    final akcm a;
    final akcm c;

    public akej(akeb akebVar, akcm akcmVar, akch akchVar) {
        super(akebVar.b, akchVar);
        int i = akebVar.a;
        this.a = akcmVar;
        this.c = akebVar.c;
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final int a(long j) {
        int iA = this.b.a(j);
        return iA >= 0 ? iA % 100 : ((iA + 1) % 100) + 99;
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final int c() {
        return 99;
    }

    @Override // defpackage.akdz, defpackage.akcf
    public final int d() {
        return 0;
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
        JniZero.c(this, i, 0, 99);
        akcf akcfVar = this.b;
        int iA = akcfVar.a(j);
        return akcfVar.h(j, ((iA >= 0 ? iA / 100 : ((iA + 1) / 100) - 1) * 100) + i);
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final akcm q() {
        return this.a;
    }

    @Override // defpackage.akdz, defpackage.akcf
    public final akcm s() {
        return this.c;
    }

    public akej(akeb akebVar, akch akchVar) {
        this(akebVar, akebVar.b.q(), akchVar);
    }

    public akej(akcf akcfVar, akcm akcmVar, akch akchVar) {
        super(akcfVar, akchVar);
        this.c = akcmVar;
        this.a = akcfVar.q();
    }
}
