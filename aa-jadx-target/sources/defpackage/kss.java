package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kss {
    public final int a;
    public final defpackage.ksl b;
    public final int c;
    public final defpackage.ksl d;

    public kss(int i, defpackage.ksl kslVar, int i2, defpackage.ksl kslVar2) {
        this.a = i;
        this.b = kslVar;
        this.c = i2;
        this.d = kslVar2;
    }

    public final int a(defpackage.ksb ksbVar) {
        ksbVar.getClass();
        defpackage.kss kssVar = defpackage.krz.a;
        return ((defpackage.acbc) this.b.j.invoke(ksbVar)).a(this.a);
    }

    public final int b(defpackage.ksb ksbVar) {
        ksbVar.getClass();
        defpackage.kss kssVar = defpackage.krz.a;
        return ((defpackage.acbc) this.d.j.invoke(ksbVar)).a(this.c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.kss)) {
            return false;
        }
        defpackage.kss kssVar = (defpackage.kss) obj;
        return this.a == kssVar.a && this.b == kssVar.b && this.c == kssVar.c && this.d == kssVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "TokenValue(darkTone=" + this.a + ", darkColor=" + this.b + ", lightTone=" + this.c + ", lightColor=" + this.d + ")";
    }
}
