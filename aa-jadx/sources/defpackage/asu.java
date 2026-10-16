package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class asu extends defpackage.asv {
    private final defpackage.csf a;

    public asu(defpackage.csf csfVar) {
        this.a = csfVar;
    }

    @Override // defpackage.asv
    public final int a(defpackage.cux cuxVar) {
        return cuxVar.dJ(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.asu) && defpackage.afga.f(this.a, ((defpackage.asu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Value(alignmentLine=" + this.a + ")";
    }
}
