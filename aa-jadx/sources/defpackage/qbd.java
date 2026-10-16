package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qbd {
    public final defpackage.yxk a;

    public qbd(defpackage.yxk yxkVar) {
        this.a = yxkVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof defpackage.qbd) && this.a.equals(((defpackage.qbd) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 474194425;
    }

    public final java.lang.String toString() {
        return "{" + java.lang.String.valueOf(this.a) + ", null, null, null, null, null, null, null, null, null, null, null, null, null, null}";
    }

    public qbd() {
        throw null;
    }
}
