package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class teh {
    public final int a;
    public final java.lang.String b;

    public teh(int i, java.lang.String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.teh)) {
            return false;
        }
        defpackage.teh tehVar = (defpackage.teh) obj;
        return this.a == tehVar.a && defpackage.afga.f(this.b, tehVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "PackageInfo(id=" + this.a + ", name=" + this.b + ")";
    }
}
