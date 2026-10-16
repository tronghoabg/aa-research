package defpackage;

/* loaded from: classes2.dex */
final class akdd extends akeh {
    private final akdc b;

    public akdd(akdc akdcVar, akcm akcmVar) {
        super(akch.i, akcmVar);
        this.b = akdcVar;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int a(long j) {
        akdc akdcVar = this.b;
        int iY = akdcVar.Y(j);
        return akdcVar.N(j, iY, akdcVar.T(j, iY));
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int c() {
        return 31;
    }

    @Override // defpackage.akeh, defpackage.akcf
    public final int d() {
        return 1;
    }

    @Override // defpackage.akcf
    public final akcm s() {
        return this.b.f;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final boolean t(long j) {
        return this.b.af(j);
    }

    @Override // defpackage.akdx
    public final int w(long j) {
        return this.b.Q(j);
    }

    @Override // defpackage.akeh
    protected final int x(long j, int i) {
        if (i > 28 || i <= 0) {
            return this.b.Q(j);
        }
        return 28;
    }
}
