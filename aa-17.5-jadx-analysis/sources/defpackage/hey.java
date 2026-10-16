package defpackage;

/* loaded from: classes2.dex */
public final class hey implements hju {
    public final gcq a;
    public final gcq b;
    public final gcq c;

    public hey(gcq gcqVar, gcq gcqVar2, gcq gcqVar3) {
        this.a = gcqVar;
        this.b = gcqVar2;
        this.c = gcqVar3;
        gzj.c(this, "pin_text_tag");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hey)) {
            return false;
        }
        hey heyVar = (hey) obj;
        return affa.f(this.a, heyVar.a) && affa.f(this.b, heyVar.b) && affa.f(this.c, heyVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gcq gcqVar = this.b;
        int iHashCode2 = (iHashCode + (gcqVar == null ? 0 : gcqVar.hashCode())) * 31;
        gcq gcqVar2 = this.c;
        return iHashCode2 + (gcqVar2 != null ? gcqVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PinSignInContentUiModel(pinText=" + this.a + ", instructions=" + this.b + ", additionalText=" + this.c + ")";
    }
}
