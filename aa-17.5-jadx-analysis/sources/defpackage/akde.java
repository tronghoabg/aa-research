package defpackage;

/* loaded from: classes2.dex */
final class akde extends akeh {
    private final akdc b;

    public akde(akdc akdcVar, akcm akcmVar) {
        super(akch.g, akcmVar);
        this.b = akdcVar;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int a(long j) {
        akdc akdcVar = this.b;
        return akdcVar.P(j, akdcVar.Y(j));
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int c() {
        return 366;
    }

    @Override // defpackage.akeh, defpackage.akcf
    public final int d() {
        return 1;
    }

    @Override // defpackage.akcf
    public final akcm s() {
        return this.b.g;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final boolean t(long j) {
        return this.b.af(j);
    }

    @Override // defpackage.akdx
    public final int w(long j) {
        akdc akdcVar = this.b;
        return akdcVar.ag(akdcVar.Y(j)) ? 366 : 365;
    }

    @Override // defpackage.akeh
    protected final int x(long j, int i) {
        if (i > 365 || i <= 0) {
            return w(j);
        }
        return 365;
    }
}
