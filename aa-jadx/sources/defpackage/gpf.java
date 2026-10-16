package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gpf implements defpackage.gnd {
    public final defpackage.hbh a;
    public final defpackage.fwl b;

    public gpf(defpackage.hbh hbhVar, defpackage.fwl fwlVar) {
        this.a = hbhVar;
        this.b = fwlVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.gpf)) {
            return false;
        }
        defpackage.gpf gpfVar = (defpackage.gpf) obj;
        return defpackage.afga.f(this.a, gpfVar.a) && defpackage.afga.f(this.b, gpfVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "RoutePreviewContentInternal(contentInternal=" + this.a + ", navigateAction=" + this.b + ")";
    }
}
