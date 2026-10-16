package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fnu {
    public final java.lang.String a;
    public final java.lang.Long b;

    public fnu(java.lang.String str, java.lang.Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.fnu)) {
            return false;
        }
        defpackage.fnu fnuVar = (defpackage.fnu) obj;
        return defpackage.afga.f(this.a, fnuVar.a) && defpackage.afga.f(this.b, fnuVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ")";
    }
}
