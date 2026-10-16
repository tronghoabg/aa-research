package defpackage;

/* loaded from: classes2.dex */
public final class grw implements hju {
    public final gab a;
    public final gfa b;
    public final fxz c;
    public final aiyk d;
    public final int e;
    private final boolean f;

    public /* synthetic */ grw(gab gabVar, gfa gfaVar, fxz fxzVar, aiyk aiykVar, int i, boolean z, int i2) {
        fxzVar = (i2 & 4) != 0 ? new fxz(null, false, 0, null, 15) : fxzVar;
        aiykVar = (i2 & 8) != 0 ? ajac.a(true) : aiykVar;
        i = (i2 & 16) != 0 ? 3 : i;
        gabVar = 1 == (i2 & 1) ? null : gabVar;
        boolean z2 = (i2 & 32) == 0;
        fxzVar.getClass();
        aiykVar.getClass();
        this.a = gabVar;
        this.b = gfaVar;
        this.c = fxzVar;
        this.d = aiykVar;
        this.e = i;
        this.f = z & z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grw)) {
            return false;
        }
        grw grwVar = (grw) obj;
        return affa.f(this.a, grwVar.a) && affa.f(this.b, grwVar.b) && affa.f(this.c, grwVar.c) && affa.f(this.d, grwVar.d) && a.Y(this.e, grwVar.e) && this.f == grwVar.f;
    }

    public final int hashCode() {
        gab gabVar = this.a;
        return ((((((((((gabVar == null ? 0 : gabVar.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e) * 31) + a.f(this.f);
    }

    public final String toString() {
        return "MessageContentUiModel(icon=" + this.a + ", messageProvider=" + this.b + ", rowActions=" + this.c + ", truncateMessage=" + this.d + ", messageTextAlign=" + dkt.a(this.e) + ", isRestrictMessage=" + this.f + ")";
    }
}
