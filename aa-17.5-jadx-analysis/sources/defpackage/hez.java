package defpackage;

/* loaded from: classes2.dex */
public final class hez implements hju {
    public final fwm a;
    public final gcq b;
    public final gcq c;

    public hez(fwm fwmVar, gcq gcqVar, gcq gcqVar2) {
        this.a = fwmVar;
        this.b = gcqVar;
        this.c = gcqVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hez)) {
            return false;
        }
        hez hezVar = (hez) obj;
        return affa.f(this.a, hezVar.a) && affa.f(this.b, hezVar.b) && affa.f(this.c, hezVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gcq gcqVar = this.b;
        int iHashCode2 = (iHashCode + (gcqVar == null ? 0 : gcqVar.hashCode())) * 31;
        gcq gcqVar2 = this.c;
        return iHashCode2 + (gcqVar2 != null ? gcqVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ProviderSignInContentUiModel(actionButton=" + this.a + ", instructions=" + this.b + ", additionalText=" + this.c + ")";
    }
}
