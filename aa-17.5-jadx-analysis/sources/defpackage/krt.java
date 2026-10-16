package defpackage;

/* loaded from: classes.dex */
public final class krt {
    public final abzz a;
    public final abzz b;
    public final abzz c;
    public final abzz d;
    public final abzz e;

    public krt(abzy abzyVar) {
        this(abzyVar.a, abzyVar.b, abzyVar.c, abzyVar.d, abzyVar.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krt)) {
            return false;
        }
        krt krtVar = (krt) obj;
        return affa.f(this.a, krtVar.a) && affa.f(this.b, krtVar.b) && affa.f(this.c, krtVar.c) && affa.f(this.d, krtVar.d) && affa.f(this.e, krtVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "ColorPalette(a1=" + this.a + ", a2=" + this.b + ", a3=" + this.c + ", n1=" + this.d + ", n2=" + this.e + ")";
    }

    public krt(abzz abzzVar, abzz abzzVar2, abzz abzzVar3, abzz abzzVar4, abzz abzzVar5) {
        this.a = abzzVar;
        this.b = abzzVar2;
        this.c = abzzVar3;
        this.d = abzzVar4;
        this.e = abzzVar5;
    }
}
