package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yeh<T> extends defpackage.yms<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.util.Comparator a;

    public yeh(java.util.Comparator comparator) {
        comparator.getClass();
        this.a = comparator;
    }

    @Override // defpackage.yms, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.a.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yeh) {
            return this.a.equals(((defpackage.yeh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
