package defpackage;

/* loaded from: classes2.dex */
public class akdz extends akdx {
    public final akcf b;

    protected akdz(akcf akcfVar, akch akchVar) {
        super(akchVar);
        if (akcfVar == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!akcfVar.u()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.b = akcfVar;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public int a(long j) {
        throw null;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public int c() {
        throw null;
    }

    @Override // defpackage.akcf
    public int d() {
        throw null;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public long g(long j) {
        throw null;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public long h(long j, int i) {
        return this.b.h(j, i);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public akcm q() {
        return this.b.q();
    }

    @Override // defpackage.akcf
    public akcm s() {
        return this.b.s();
    }

    @Override // defpackage.akcf
    public final void v() {
    }
}
