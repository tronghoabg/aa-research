package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lgq {
    public final java.lang.String a;
    public final java.lang.String b;

    public lgq(java.lang.String str, java.lang.String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.lgq)) {
            return false;
        }
        defpackage.lgq lgqVar = (defpackage.lgq) obj;
        return defpackage.afga.f(this.a, lgqVar.a) && defpackage.afga.f(this.b, lgqVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "HeadUnitUpdateEntry(carInfo=" + this.a + ", url=" + this.b + ")";
    }
}
