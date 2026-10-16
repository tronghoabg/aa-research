package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ala {
    public final defpackage.avv a;

    public ala(defpackage.avv avvVar) {
        this.a = avvVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!defpackage.afga.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return defpackage.afga.f(this.a, ((defpackage.ala) obj).a);
    }

    public final int hashCode() {
        return (-312056230) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "OverscrollConfiguration(glowColor=" + defpackage.ckd.g(-43234558140743680L) + ", drawPadding=" + this.a + ")";
    }
}
