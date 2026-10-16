package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dhx extends defpackage.dhl {
    public final java.lang.String c;
    public final defpackage.dil d;
    public final int e;

    public dhx(java.lang.String str, defpackage.dil dilVar, int i, defpackage.dij dijVar) {
        super(1, defpackage.diy.b, dijVar);
        this.c = str;
        this.d = dilVar;
        this.e = i;
    }

    @Override // defpackage.dhy
    public final int b() {
        return this.e;
    }

    @Override // defpackage.dhy
    public final defpackage.dil c() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dhx)) {
            return false;
        }
        defpackage.dhx dhxVar = (defpackage.dhx) obj;
        return defpackage.afga.f(this.c, dhxVar.c) && defpackage.afga.f(this.d, dhxVar.d) && this.e == dhxVar.e && defpackage.afga.f(this.b, dhxVar.b);
    }

    public final int hashCode() {
        return (((((this.c.hashCode() * 31) + this.d.o) * 31) + this.e) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Font(familyName=\"" + ("DeviceFontFamilyName(name=" + this.c + ")") + "\", weight=" + this.d + ", style=" + defpackage.die.a(this.e) + ")";
    }
}
