package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hzk implements defpackage.hzh {
    public final java.util.Map b;
    public volatile java.util.Map c;

    public hzk(java.util.Map map) {
        this.b = j$.util.DesugarCollections.unmodifiableMap(map);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.hzk) {
            return this.b.equals(((defpackage.hzk) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "LazyHeaders{headers=" + java.lang.String.valueOf(this.b) + "}";
    }
}
