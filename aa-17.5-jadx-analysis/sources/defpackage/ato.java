package defpackage;

/* loaded from: classes.dex */
public final class ato implements atm {
    private final /* synthetic */ atn a = atn.a;
    private final dlg b;
    private final long c;

    public ato(dlg dlgVar, long j) {
        this.b = dlgVar;
        this.c = j;
    }

    @Override // defpackage.atm
    public final cfy a(cfy cfyVar, cfn cfnVar) {
        return this.a.a(cfyVar, cfnVar);
    }

    @Override // defpackage.atm
    public final cfy b(cfy cfyVar) {
        return this.a.b(cfyVar);
    }

    public final float c() {
        long j = this.c;
        if (dle.g(j)) {
            return this.b.ey(dle.a(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final float d() {
        long j = this.c;
        if (dle.h(j)) {
            return this.b.ey(dle.b(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ato)) {
            return false;
        }
        ato atoVar = (ato) obj;
        return affa.f(this.b, atoVar.b) && this.c == atoVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        long j = this.c;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.b + ", constraints=" + dle.e(this.c) + ")";
    }
}
