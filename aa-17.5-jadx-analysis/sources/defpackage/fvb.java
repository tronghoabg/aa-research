package defpackage;

/* loaded from: classes2.dex */
public final class fvb implements hju {
    public final String a;
    public final boolean b;
    public final afdr c;

    public fvb(String str, boolean z, afdr afdrVar) {
        this.a = str;
        this.b = z;
        this.c = afdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvb)) {
            return false;
        }
        fvb fvbVar = (fvb) obj;
        return affa.f(this.a, fvbVar.a) && this.b == fvbVar.b && affa.f(this.c, fvbVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.f(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "AlphaJumpKeyUiModel(label=" + this.a + ", enabled=" + this.b + ", onClick=" + this.c + ")";
    }
}
