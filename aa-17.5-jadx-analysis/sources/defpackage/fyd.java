package defpackage;

/* loaded from: classes2.dex */
public final class fyd extends fwi {
    public final gfa a;
    public final gfk b;
    public final afdr c;
    public final fwe d;
    public final long e;
    public final long f;
    public final afdr g;
    public final boolean h;
    public final int i;
    private final boolean j;
    private final boolean k;

    public fyd(gfa gfaVar, gfk gfkVar, afdr afdrVar, boolean z, fwe fweVar, long j, long j2, afdr afdrVar2, int i, boolean z2, boolean z3) {
        this.a = gfaVar;
        this.b = gfkVar;
        this.c = afdrVar;
        this.j = z;
        this.d = fweVar;
        this.e = j;
        this.f = j2;
        this.g = afdrVar2;
        this.i = i;
        this.h = z2;
        this.k = z3;
    }

    @Override // defpackage.fwi
    public final fwe a() {
        return this.d;
    }

    @Override // defpackage.fwi
    public final gfa b() {
        return this.a;
    }

    @Override // defpackage.fwi
    public final afdr c() {
        return this.c;
    }

    @Override // defpackage.fwi
    public final boolean d() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyd)) {
            return false;
        }
        fyd fydVar = (fyd) obj;
        if (!affa.f(this.a, fydVar.a) || !affa.f(this.b, fydVar.b) || !affa.f(this.c, fydVar.c) || this.j != fydVar.j || !affa.f(this.d, fydVar.d)) {
            return false;
        }
        long j = this.e;
        long j2 = fydVar.e;
        long j3 = aisq.a;
        return a.j(j, j2) && a.j(this.f, fydVar.f) && affa.f(this.g, fydVar.g) && this.i == fydVar.i && this.h == fydVar.h && this.k == fydVar.k;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        afdr afdrVar = this.c;
        int iHashCode2 = ((((iHashCode * 31) + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31) + a.f(this.j)) * 31;
        fwe fweVar = this.d;
        int iHashCode3 = fweVar == null ? 0 : fweVar.hashCode();
        long j = this.e;
        long j2 = aisq.a;
        int iG = (((((iHashCode2 + iHashCode3) * 31) + a.g(j)) * 31) + a.g(this.f)) * 31;
        afdr afdrVar2 = this.g;
        return ((((((iG + (afdrVar2 != null ? afdrVar2.hashCode() : 0)) * 31) + this.i) * 31) + a.f(this.h)) * 31) + a.f(this.k);
    }

    public final String toString() {
        long j = this.f;
        String strK = aisq.k(this.e);
        String strK2 = aisq.k(j);
        StringBuilder sb = new StringBuilder("TimedActionButtonUiModel(annotatedStringProvider=");
        sb.append(this.a);
        sb.append(", painterProvider=");
        sb.append(this.b);
        sb.append(", onClick=");
        sb.append(this.c);
        sb.append(", enabled=");
        sb.append(this.j);
        sb.append(", buttonColors=");
        sb.append(this.d);
        sb.append(", duration=");
        sb.append(strK);
        sb.append(", initialDuration=");
        sb.append(strK2);
        sb.append(", onTimeout=");
        sb.append(this.g);
        sb.append(", progressFillType=");
        sb.append((Object) (this.i != 1 ? "SECONDARY" : "PRIMARY"));
        sb.append(", isNightMode=");
        sb.append(this.h);
        sb.append(", showInteractions=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
