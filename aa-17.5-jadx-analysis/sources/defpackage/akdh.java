package defpackage;

/* loaded from: classes2.dex */
final class akdh extends akeh {
    private final akdc b;

    public akdh(akdc akdcVar, akcm akcmVar) {
        super(akch.l, akcmVar);
        this.b = akdcVar;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int a(long j) {
        return this.b.U(j);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int c() {
        return 53;
    }

    @Override // defpackage.akeh, defpackage.akcf
    public final int d() {
        return 1;
    }

    @Override // defpackage.akeh, defpackage.akdx, defpackage.akcf
    public final long f(long j) {
        return super.f(j + 259200000);
    }

    @Override // defpackage.akeh, defpackage.akdx, defpackage.akcf
    public final long g(long j) {
        return super.g(j + 259200000) - 259200000;
    }

    @Override // defpackage.akcf
    public final akcm s() {
        return this.b.e;
    }

    @Override // defpackage.akdx
    public final int w(long j) {
        akdc akdcVar = this.b;
        return akdcVar.W(akdcVar.X(j));
    }

    @Override // defpackage.akeh
    protected final int x(long j, int i) {
        if (i > 52) {
            return w(j);
        }
        return 52;
    }
}
