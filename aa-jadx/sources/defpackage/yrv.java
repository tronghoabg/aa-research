package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yrv {
    public final defpackage.ytg a;
    public final java.lang.String b;

    public yrv(defpackage.ytg ytgVar, java.lang.String str) {
        ytgVar.getClass();
        this.a = ytgVar;
        str.getClass();
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.yrv) {
            defpackage.yrv yrvVar = (defpackage.yrv) obj;
            if (this.a.equals(yrvVar.a) && this.b.equals(yrvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
