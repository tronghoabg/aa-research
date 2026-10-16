package defpackage;

/* loaded from: classes2.dex */
public final class gde implements hju {
    public final aiyk a;
    public final fwm b;
    public final afdr c;
    public final afdr d;
    public final gbg e;

    public gde(aiyk aiykVar, fwm fwmVar, afdr afdrVar, afdr afdrVar2, gbg gbgVar) {
        this.a = aiykVar;
        this.b = fwmVar;
        this.c = afdrVar;
        this.d = afdrVar2;
        this.e = gbgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gde)) {
            return false;
        }
        gde gdeVar = (gde) obj;
        return affa.f(this.a, gdeVar.a) && affa.f(this.b, gdeVar.b) && affa.f(this.c, gdeVar.c) && affa.f(this.d, gdeVar.d) && affa.f(this.e, gdeVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "TelephoneControlsUiModel(formattedPhoneNumber=" + this.a + ", primaryAction=" + this.b + ", deleteButtonOnPress=" + this.c + ", deleteButtonOnLongPress=" + this.d + ", deleteActionIcon=" + this.e + ")";
    }
}
