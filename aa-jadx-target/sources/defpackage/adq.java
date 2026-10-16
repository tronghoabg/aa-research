package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adq {
    public final defpackage.affc a;
    public final defpackage.afd b;

    public adq(defpackage.affc affcVar, defpackage.afd afdVar) {
        this.a = affcVar;
        this.b = afdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.adq)) {
            return false;
        }
        defpackage.adq adqVar = (defpackage.adq) obj;
        return this.a == adqVar.a && defpackage.afga.f(this.b, adqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "SlideConfig(slideOffset=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
