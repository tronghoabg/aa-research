package defpackage;

/* loaded from: classes2.dex */
public final class gdh implements hju {
    public final hju a;
    public final gde b;
    public final gdd c;

    public gdh(hju hjuVar, gde gdeVar, gdd gddVar) {
        this.a = hjuVar;
        this.b = gdeVar;
        this.c = gddVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdh)) {
            return false;
        }
        gdh gdhVar = (gdh) obj;
        return affa.f(this.a, gdhVar.a) && affa.f(this.b, gdhVar.b) && affa.f(this.c, gdhVar.c);
    }

    public final int hashCode() {
        hju hjuVar = this.a;
        return ((((hjuVar == null ? 0 : hjuVar.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TelephoneKeypadUiModel(header=" + this.a + ", telephoneControlsUiModel=" + this.b + ", keyPadUiModel=" + this.c + ")";
    }
}
