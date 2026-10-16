package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ymo<T> extends defpackage.yms<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final defpackage.yms a;

    public ymo(defpackage.yms ymsVar) {
        this.a = ymsVar;
    }

    @Override // defpackage.yms
    public final defpackage.yms b() {
        return this.a.b();
    }

    @Override // defpackage.yms
    public final defpackage.yms c() {
        return this.a.c().b();
    }

    @Override // defpackage.yms, java.util.Comparator
    public final int compare(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return this.a.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ymo) {
            return this.a.equals(((defpackage.ymo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 957692532;
    }

    public final java.lang.String toString() {
        return this.a.toString().concat(".nullsFirst()");
    }

    @Override // defpackage.yms
    public final defpackage.yms a() {
        return this;
    }
}
