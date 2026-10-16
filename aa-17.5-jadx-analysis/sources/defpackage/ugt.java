package defpackage;

/* loaded from: classes3.dex */
final class ugt {
    public final ukp a;
    public final boolean b;
    public int c;
    public boolean d;
    too e;

    public ugt(ukp ukpVar, boolean z) {
        this(ukpVar, z, ukpVar.a, z, new too());
    }

    public final String toString() {
        return String.valueOf(this.a) + ", isLocalRequest=" + this.b + ", minZoomForAncestorTileFetch=" + this.c + ", ancestorsAreLocalRequests=" + this.d + ", viewportCenter=" + String.valueOf(this.e);
    }

    public ugt(ukp ukpVar, boolean z, int i, boolean z2, too tooVar) {
        this.a = ukpVar;
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = tooVar;
    }
}
