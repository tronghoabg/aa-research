package defpackage;

/* loaded from: classes2.dex */
public final class gsk extends hjt {
    public final gva a;
    public final hga b;
    public final hge c;
    public final afdr d;
    public final gbg e;
    public final boolean f;

    public gsk(gva gvaVar, hga hgaVar, hge hgeVar, afdr afdrVar, gbg gbgVar, boolean z) {
        super(true, false);
        this.a = gvaVar;
        this.b = hgaVar;
        this.c = hgeVar;
        this.d = afdrVar;
        this.e = gbgVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsk)) {
            return false;
        }
        gsk gskVar = (gsk) obj;
        return affa.f(this.a, gskVar.a) && affa.f(this.b, gskVar.b) && affa.f(this.c, gskVar.c) && affa.f(this.d, gskVar.d) && affa.f(this.e, gskVar.e) && this.f == gskVar.f;
    }

    public final int hashCode() {
        gva gvaVar = this.a;
        return ((((((((((gvaVar == null ? 0 : gvaVar.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + a.f(this.f);
    }

    public final String toString() {
        return "MinimizedStateTemplateWrapperUiModel(turnCardUiModel=" + this.a + ", surfaceCallbacks=" + this.b + ", surfaceAreaParams=" + this.c + ", buttonOnclick=" + this.d + ", buttonIcon=" + this.e + ", hasTemplateChanged=" + this.f + ")";
    }
}
