package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ywk extends defpackage.ywh {
    protected ywk(defpackage.ywg ywgVar, double d) {
        super(ywgVar, d);
    }

    public final double c() {
        return a(this.a, this.b, defpackage.ywi.c);
    }

    @Override // defpackage.ywh
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ywk) && this.a == b((defpackage.ywk) obj);
    }

    @Override // defpackage.ywh
    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Double.valueOf(c()));
    }

    @Override // defpackage.ywh
    public final java.lang.String toString() {
        return c() + "C";
    }
}
