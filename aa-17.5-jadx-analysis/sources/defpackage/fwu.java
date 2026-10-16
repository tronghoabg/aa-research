package defpackage;

/* loaded from: classes2.dex */
public final class fwu implements fxo {
    public static final int a;
    public final fwy b;
    public final long c;
    public final long d;
    public final afdr e;

    static {
        hjw hjwVar = hjw.a;
        a = 8;
    }

    public fwu(fwy fwyVar, long j, long j2, afdr afdrVar) {
        this.b = fwyVar;
        this.c = j;
        this.d = j2;
        this.e = afdrVar;
    }

    @Override // defpackage.fxo
    public final gcq a() {
        return this.b.b;
    }

    @Override // defpackage.fxo
    public final afdr b() {
        return this.b.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwu)) {
            return false;
        }
        fwu fwuVar = (fwu) obj;
        if (!affa.f(this.b, fwuVar.b)) {
            return false;
        }
        long j = this.c;
        long j2 = fwuVar.c;
        long j3 = aisq.a;
        return a.j(j, j2) && a.j(this.d, fwuVar.d) && affa.f(this.e, fwuVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        long j = aisq.a;
        afdr afdrVar = this.e;
        return ((((iHashCode + a.g(this.c)) * 31) + a.g(this.d)) * 31) + (afdrVar == null ? 0 : afdrVar.hashCode());
    }

    public final String toString() {
        long j = this.d;
        return "ApphostTimedButtonUiModel(carActionButtonUiModel=" + this.b + ", timeoutDuration=" + aisq.k(this.c) + ", initialTimeout=" + aisq.k(j) + ", onTimeout=" + this.e + ")";
    }
}
