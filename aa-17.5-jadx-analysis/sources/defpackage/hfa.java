package defpackage;

/* loaded from: classes2.dex */
public final class hfa implements hju {
    public final String a;
    public final gcq b;
    public final gcq c;

    public hfa(String str, gcq gcqVar, gcq gcqVar2) {
        this.a = str;
        this.b = gcqVar;
        this.c = gcqVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfa)) {
            return false;
        }
        hfa hfaVar = (hfa) obj;
        return affa.f(this.a, hfaVar.a) && affa.f(this.b, hfaVar.b) && affa.f(this.c, hfaVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gcq gcqVar = this.b;
        int iHashCode2 = (iHashCode + (gcqVar == null ? 0 : gcqVar.hashCode())) * 31;
        gcq gcqVar2 = this.c;
        return iHashCode2 + (gcqVar2 != null ? gcqVar2.hashCode() : 0);
    }

    public final String toString() {
        return "QrCodeSignInContentUiModel(qrCodeUrl=" + this.a + ", instructions=" + this.b + ", additionalText=" + this.c + ")";
    }
}
