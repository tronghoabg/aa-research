package defpackage;

/* loaded from: classes2.dex */
public final class hex implements hju {
    public final gcq a;
    public final gcq b;
    public final gcq c;
    public final gcq d;
    public final int e;
    public final afec f;
    private final boolean g = true;

    public hex(gcq gcqVar, gcq gcqVar2, gcq gcqVar3, gcq gcqVar4, int i, afec afecVar) {
        this.a = gcqVar;
        this.b = gcqVar2;
        this.c = gcqVar3;
        this.d = gcqVar4;
        this.e = i;
        this.f = afecVar;
        gzj.c(this, "input_box_tag");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hex)) {
            return false;
        }
        hex hexVar = (hex) obj;
        if (!affa.f(this.a, hexVar.a) || !affa.f(this.b, hexVar.b) || !affa.f(this.c, hexVar.c) || !affa.f(this.d, hexVar.d) || !a.Y(this.e, hexVar.e) || !affa.f(this.f, hexVar.f)) {
            return false;
        }
        boolean z = hexVar.g;
        return true;
    }

    public final int hashCode() {
        gcq gcqVar = this.a;
        int iHashCode = gcqVar == null ? 0 : gcqVar.hashCode();
        gcq gcqVar2 = this.b;
        int iHashCode2 = gcqVar2 == null ? 0 : gcqVar2.hashCode();
        int i = iHashCode * 31;
        gcq gcqVar3 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (gcqVar3 == null ? 0 : gcqVar3.hashCode())) * 31;
        gcq gcqVar4 = this.d;
        return ((((((iHashCode3 + (gcqVar4 != null ? gcqVar4.hashCode() : 0)) * 31) + this.e) * 31) + this.f.hashCode()) * 31) + 1231;
    }

    public final String toString() {
        return "InputSignInContentUiModel(instructions=" + this.a + ", hint=" + this.b + ", additionalText=" + this.c + ", errorMessage=" + this.d + ", keyboardType=" + djf.a(this.e) + ", submitText=" + this.f + ", showKeyboardByDefault=true)";
    }
}
