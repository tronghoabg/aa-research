package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acd {
    public final defpackage.cfu a;
    public final defpackage.affc b;
    public final defpackage.afd c;
    public final boolean d = true;

    public acd(defpackage.cfu cfuVar, defpackage.affc affcVar, defpackage.afd afdVar) {
        this.a = cfuVar;
        this.b = affcVar;
        this.c = afdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.acd)) {
            return false;
        }
        defpackage.acd acdVar = (defpackage.acd) obj;
        if (!defpackage.afga.f(this.a, acdVar.a) || this.b != acdVar.b || !defpackage.afga.f(this.c, acdVar.c)) {
            return false;
        }
        boolean z = acdVar.d;
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + defpackage.a.e(true);
    }

    public final java.lang.String toString() {
        return "ChangeSizeConfig(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
