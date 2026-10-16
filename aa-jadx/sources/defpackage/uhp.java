package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class uhp {
    public final defpackage.ulk a;
    public final boolean b;
    public int c;
    public boolean d;
    defpackage.tpm e;

    public uhp(defpackage.ulk ulkVar, boolean z) {
        this(ulkVar, z, ulkVar.a, z, new defpackage.tpm());
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.a) + ", isLocalRequest=" + this.b + ", minZoomForAncestorTileFetch=" + this.c + ", ancestorsAreLocalRequests=" + this.d + ", viewportCenter=" + java.lang.String.valueOf(this.e);
    }

    public uhp(defpackage.ulk ulkVar, boolean z, int i, boolean z2, defpackage.tpm tpmVar) {
        this.a = ulkVar;
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = tpmVar;
    }
}
