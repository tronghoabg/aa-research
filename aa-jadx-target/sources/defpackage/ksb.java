package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ksb {
    public final defpackage.acbc a;
    public final defpackage.acbc b;
    public final defpackage.acbc c;
    public final defpackage.acbc d;
    public final defpackage.acbc e;

    public ksb(defpackage.acbb acbbVar) {
        this(acbbVar.a, acbbVar.b, acbbVar.c, acbbVar.d, acbbVar.e);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ksb)) {
            return false;
        }
        defpackage.ksb ksbVar = (defpackage.ksb) obj;
        return defpackage.afga.f(this.a, ksbVar.a) && defpackage.afga.f(this.b, ksbVar.b) && defpackage.afga.f(this.c, ksbVar.c) && defpackage.afga.f(this.d, ksbVar.d) && defpackage.afga.f(this.e, ksbVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final java.lang.String toString() {
        return "ColorPalette(a1=" + this.a + ", a2=" + this.b + ", a3=" + this.c + ", n1=" + this.d + ", n2=" + this.e + ")";
    }

    public ksb(defpackage.acbc acbcVar, defpackage.acbc acbcVar2, defpackage.acbc acbcVar3, defpackage.acbc acbcVar4, defpackage.acbc acbcVar5) {
        this.a = acbcVar;
        this.b = acbcVar2;
        this.c = acbcVar3;
        this.d = acbcVar4;
        this.e = acbcVar5;
    }
}
