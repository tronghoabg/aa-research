package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dkg {
    public final defpackage.dfb a;
    public final defpackage.djv b;

    public dkg(defpackage.dfb dfbVar, defpackage.djv djvVar) {
        this.a = dfbVar;
        this.b = djvVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dkg)) {
            return false;
        }
        defpackage.dkg dkgVar = (defpackage.dkg) obj;
        return defpackage.afga.f(this.a, dkgVar.a) && defpackage.afga.f(this.b, dkgVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "TransformedText(text=" + ((java.lang.Object) this.a) + ", offsetMapping=" + this.b + ")";
    }
}
