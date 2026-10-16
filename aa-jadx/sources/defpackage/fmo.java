package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fmo extends defpackage.flx {
    public final int a;

    public fmo(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.fmo) && this.a == ((defpackage.fmo) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "ConstraintsNotMet(reason=" + this.a + ")";
    }
}
