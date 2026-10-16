package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class hjb {
    public final defpackage.wog a;
    public final defpackage.wog b;
    public final defpackage.wog c;
    public final defpackage.wog d;
    public final defpackage.wog e;

    public hjb(defpackage.wog wogVar, defpackage.wog wogVar2, defpackage.wog wogVar3, defpackage.wog wogVar4, defpackage.wog wogVar5) {
        this.a = wogVar;
        this.b = wogVar2;
        this.c = wogVar3;
        this.d = wogVar4;
        this.e = wogVar5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hjb)) {
            return false;
        }
        defpackage.hjb hjbVar = (defpackage.hjb) obj;
        return defpackage.afga.f(this.a, hjbVar.a) && defpackage.afga.f(this.b, hjbVar.b) && defpackage.afga.f(this.c, hjbVar.c) && defpackage.afga.f(this.d, hjbVar.d) && defpackage.afga.f(this.e, hjbVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final java.lang.String toString() {
        return "TemplateColorPalette(a1=" + this.a + ", a2=" + this.b + ", a3=" + this.c + ", n1=" + this.d + ", n2=" + this.e + ")";
    }
}
