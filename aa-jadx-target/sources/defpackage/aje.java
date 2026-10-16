package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aje {
    public defpackage.ckc a;
    public defpackage.cmj b;
    public defpackage.cjr c;
    private defpackage.cju d;

    public aje(byte[] bArr) {
        this.c = null;
        this.a = null;
        this.b = null;
        this.d = null;
    }

    public final defpackage.cju a() {
        defpackage.cju cjuVar = this.d;
        if (cjuVar != null) {
            return cjuVar;
        }
        defpackage.cju cjuVar2 = new defpackage.cju((byte[]) null);
        this.d = cjuVar2;
        return cjuVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.aje)) {
            return false;
        }
        defpackage.aje ajeVar = (defpackage.aje) obj;
        return defpackage.afga.f(this.c, ajeVar.c) && defpackage.afga.f(this.a, ajeVar.a) && defpackage.afga.f(this.b, ajeVar.b) && defpackage.afga.f(this.d, ajeVar.d);
    }

    public final int hashCode() {
        defpackage.cjr cjrVar = this.c;
        int iHashCode = cjrVar == null ? 0 : cjrVar.hashCode();
        defpackage.ckc ckcVar = this.a;
        int iHashCode2 = ckcVar == null ? 0 : ckcVar.hashCode();
        int i = iHashCode * 31;
        defpackage.cmj cmjVar = this.b;
        int iHashCode3 = (((i + iHashCode2) * 31) + (cmjVar == null ? 0 : cmjVar.hashCode())) * 31;
        defpackage.cju cjuVar = this.d;
        return iHashCode3 + (cjuVar != null ? cjuVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "BorderCache(imageBitmap=" + this.c + ", canvas=" + this.a + ", canvasDrawScope=" + this.b + ", borderPath=" + this.d + ")";
    }

    public aje() {
        this(null);
    }
}
