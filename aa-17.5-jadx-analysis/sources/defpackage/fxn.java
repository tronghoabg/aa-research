package defpackage;

/* loaded from: classes2.dex */
public final class fxn extends fwi {
    public final gfk a;
    public final afdr b;
    public final fwe c;
    public final boolean d;
    public boolean e;
    public final int f;
    private gfa g;

    public /* synthetic */ fxn(gfk gfkVar, afdr afdrVar, fwe fweVar, int i, boolean z, int i2) {
        gfkVar = (i2 & 1) != 0 ? new gfq() : gfkVar;
        afdrVar = (i2 & 2) != 0 ? null : afdrVar;
        fweVar = (i2 & 4) != 0 ? null : fweVar;
        i = (i2 & 8) != 0 ? 1 : i;
        boolean z2 = z | (!((i2 & 16) == 0));
        gfkVar.getClass();
        if (i == 0) {
            throw null;
        }
        this.a = gfkVar;
        this.b = afdrVar;
        this.c = fweVar;
        this.f = i;
        this.d = z2;
        this.e = true;
        this.g = gey.b;
    }

    @Override // defpackage.fwi
    public final fwe a() {
        return this.c;
    }

    @Override // defpackage.fwi
    public final gfa b() {
        return this.g;
    }

    @Override // defpackage.fwi
    public final afdr c() {
        return this.b;
    }

    @Override // defpackage.fwi
    public final boolean d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxn)) {
            return false;
        }
        fxn fxnVar = (fxn) obj;
        return affa.f(this.a, fxnVar.a) && affa.f(this.b, fxnVar.b) && affa.f(this.c, fxnVar.c) && this.f == fxnVar.f && this.d == fxnVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        afdr afdrVar = this.b;
        int iHashCode2 = (iHashCode + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31;
        fwe fweVar = this.c;
        return ((((iHashCode2 + (fweVar != null ? fweVar.hashCode() : 0)) * 31) + this.f) * 31) + a.f(this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FloatingActionButtonUiModel(painterProvider=");
        sb.append(this.a);
        sb.append(", onClick=");
        sb.append(this.b);
        sb.append(", buttonColors=");
        sb.append(this.c);
        sb.append(", type=");
        int i = this.f;
        sb.append((Object) (i != 1 ? i != 2 ? "MAP_MINIMIZED" : "MAP" : "DEFAULT"));
        sb.append(", isNightMode=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    public fxn() {
        this(null, null, null, 0, false, 31);
    }
}
