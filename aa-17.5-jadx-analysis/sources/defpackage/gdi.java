package defpackage;

/* loaded from: classes2.dex */
public final class gdi implements hju {
    public final gfk a;
    public final gfa b;
    public final gfa c;
    public final gbx d;

    public gdi(gfk gfkVar, gfa gfaVar, gfa gfaVar2, gbx gbxVar) {
        this.a = gfkVar;
        this.b = gfaVar;
        this.c = gfaVar2;
        this.d = gbxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdi)) {
            return false;
        }
        gdi gdiVar = (gdi) obj;
        return affa.f(this.a, gdiVar.a) && affa.f(this.b, gdiVar.b) && affa.f(this.c, gdiVar.c) && affa.f(this.d, gdiVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "CheckoutRowUiModel(painterProvider=" + this.a + ", primaryTextProvider=" + this.b + ", secondaryTextProvider=" + this.c + ", numberPickerUiModel=" + this.d + ")";
    }
}
