package defpackage;

/* loaded from: classes.dex */
final class aja {
    public cju a;
    public cmb b;
    public cjj c;
    private cjm d;

    public aja(byte[] bArr) {
        this.c = null;
        this.a = null;
        this.b = null;
        this.d = null;
    }

    public final cjm a() {
        cjm cjmVar = this.d;
        if (cjmVar != null) {
            return cjmVar;
        }
        cjm cjmVar2 = new cjm((byte[]) null);
        this.d = cjmVar2;
        return cjmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aja)) {
            return false;
        }
        aja ajaVar = (aja) obj;
        return affa.f(this.c, ajaVar.c) && affa.f(this.a, ajaVar.a) && affa.f(this.b, ajaVar.b) && affa.f(this.d, ajaVar.d);
    }

    public final int hashCode() {
        cjj cjjVar = this.c;
        int iHashCode = cjjVar == null ? 0 : cjjVar.hashCode();
        cju cjuVar = this.a;
        int iHashCode2 = cjuVar == null ? 0 : cjuVar.hashCode();
        int i = iHashCode * 31;
        cmb cmbVar = this.b;
        int iHashCode3 = (((i + iHashCode2) * 31) + (cmbVar == null ? 0 : cmbVar.hashCode())) * 31;
        cjm cjmVar = this.d;
        return iHashCode3 + (cjmVar != null ? cjmVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.c + ", canvas=" + this.a + ", canvasDrawScope=" + this.b + ", borderPath=" + this.d + ")";
    }

    public aja() {
        this(null);
    }
}
