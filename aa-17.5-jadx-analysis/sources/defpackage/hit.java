package defpackage;

/* loaded from: classes.dex */
public final class hit {
    public final wnj a;
    public final wnj b;
    public final wnj c;
    public final wnj d;
    public final wnj e;

    public hit(wnj wnjVar, wnj wnjVar2, wnj wnjVar3, wnj wnjVar4, wnj wnjVar5) {
        this.a = wnjVar;
        this.b = wnjVar2;
        this.c = wnjVar3;
        this.d = wnjVar4;
        this.e = wnjVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hit)) {
            return false;
        }
        hit hitVar = (hit) obj;
        return affa.f(this.a, hitVar.a) && affa.f(this.b, hitVar.b) && affa.f(this.c, hitVar.c) && affa.f(this.d, hitVar.d) && affa.f(this.e, hitVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "TemplateColorPalette(a1=" + this.a + ", a2=" + this.b + ", a3=" + this.c + ", n1=" + this.d + ", n2=" + this.e + ")";
    }
}
