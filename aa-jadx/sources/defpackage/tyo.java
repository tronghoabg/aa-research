package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tyo {
    public final defpackage.umu a;
    public final int b;

    public tyo(defpackage.umu umuVar, int i) {
        this.a = umuVar;
        this.b = i;
    }

    public final defpackage.ukf a() {
        return this.a.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tyo) {
            defpackage.tyo tyoVar = (defpackage.tyo) obj;
            if (this.a.equals(tyoVar.a) && this.b == tyoVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final java.lang.String toString() {
        return "{" + java.lang.String.valueOf(this.a) + ", " + this.b + "}";
    }

    public tyo() {
        throw null;
    }
}
