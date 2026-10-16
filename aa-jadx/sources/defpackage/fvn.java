package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fvn {
    public final java.lang.String a;

    public fvn(java.lang.String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.fvn) && defpackage.afga.f(this.a, ((defpackage.fvn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "AlphaJumpKey(label=" + this.a + ")";
    }
}
