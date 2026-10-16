package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bsd {
    public final defpackage.cld a;
    public final defpackage.cld b;
    public final defpackage.cld c;

    public bsd(defpackage.cld cldVar, defpackage.cld cldVar2, defpackage.cld cldVar3) {
        this.a = cldVar;
        this.b = cldVar2;
        this.c = cldVar3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.bsd)) {
            return false;
        }
        defpackage.bsd bsdVar = (defpackage.bsd) obj;
        return defpackage.afga.f(this.a, bsdVar.a) && defpackage.afga.f(this.b, bsdVar.b) && defpackage.afga.f(this.c, bsdVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
