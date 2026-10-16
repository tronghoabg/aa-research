package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adtm {
    public java.lang.String a = "unknown-authority";
    public defpackage.adjs b = defpackage.adjs.a;
    public java.lang.String c;
    public defpackage.adlf d;

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.adtm)) {
            return false;
        }
        defpackage.adtm adtmVar = (defpackage.adtm) obj;
        if (this.a.equals(adtmVar.a) && this.b.equals(adtmVar.b)) {
            java.lang.String str = adtmVar.c;
            if (j$.util.Objects.equals(null, null) && j$.util.Objects.equals(this.d, adtmVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b, null, this.d);
    }
}
