package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bpi {
    public final long a;
    public final defpackage.bmb b;
    private final bph c = null;

    public bpi(long j, defpackage.bmb bmbVar) {
        this.a = j;
        this.b = bmbVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bpi)) {
            return false;
        }
        defpackage.bpi bpiVar = (defpackage.bpi) obj;
        if (!defpackage.a.i(this.a, bpiVar.a)) {
            return false;
        }
        bph bphVar = bpiVar.c;
        return defpackage.afga.f(null, null) && defpackage.afga.f(this.b, bpiVar.b);
    }

    public final int hashCode() {
        defpackage.bmb bmbVar = this.b;
        return (defpackage.a.f(this.a) * 961) + (bmbVar != null ? bmbVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "RippleConfiguration(color=" + defpackage.ckd.g(this.a) + ", focus=null, rippleAlpha=" + this.b + ")";
    }
}
