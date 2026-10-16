package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class nbw {
    public final java.util.List a;
    public final lph b;
    public final boolean c;

    public nbw(java.util.List list, lph lphVar, boolean z) {
        list.getClass();
        this.a = list;
        this.b = lphVar;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nbw)) {
            return false;
        }
        defpackage.nbw nbwVar = (defpackage.nbw) obj;
        return defpackage.afga.f(this.a, nbwVar.a) && defpackage.afga.f(this.b, nbwVar.b) && this.c == nbwVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        lph lphVar = this.b;
        return ((iHashCode + (lphVar == null ? 0 : lphVar.hashCode())) * 31) + defpackage.a.e(this.c);
    }

    public final java.lang.String toString() {
        return "SwitcherContext(liveItems=" + this.a + ", nowPlayingSession=" + this.b + ", loopingEnabled=" + this.c + ")";
    }
}
