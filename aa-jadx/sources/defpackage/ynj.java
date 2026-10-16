package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ynj<T> extends defpackage.yms<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final defpackage.yms a;

    public ynj(defpackage.yms ymsVar) {
        this.a = ymsVar;
    }

    @Override // defpackage.yms
    public final defpackage.yms c() {
        return this.a;
    }

    @Override // defpackage.yms, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.a.compare(t2, t);
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ynj) {
            return this.a.equals(((defpackage.ynj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
