package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qdu {
    public final int a;
    public final android.os.Bundle b;
    public final defpackage.qdw c;

    public qdu(int i, android.os.Bundle bundle, defpackage.qdw qdwVar) {
        this.a = i;
        this.b = bundle;
        this.c = qdwVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.qdu qduVar = (defpackage.qdu) obj;
            if (this.a == qduVar.a && this.b.equals(qduVar.b) && this.c.equals(qduVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(-4319067186032159575L, java.lang.Integer.valueOf(this.a), this.b, this.c);
    }
}
