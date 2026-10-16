package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public class k implements java.util.Map.Entry {
    public final int a;
    public final java.lang.Object b;
    public volatile java.lang.Object c;
    public volatile j$.util.concurrent.k d;

    public k(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public j$.util.concurrent.k a(int i, java.lang.Object obj) {
        java.lang.Object obj2;
        do {
            if (this.a == i && ((obj2 = this.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return this;
            }
            this = this.d;
        } while (this != null);
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        java.util.Map.Entry entry;
        java.lang.Object key;
        java.lang.Object value;
        if (!(obj instanceof java.util.Map.Entry) || (key = (entry = (java.util.Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        java.lang.Object obj2 = this.b;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        java.lang.Object obj3 = this.c;
        return value == obj3 || value.equals(obj3);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.c.hashCode() ^ this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.lang.String toString() {
        return j$.desugar.sun.nio.fs.g.J(this.b, this.c);
    }

    public k(int i, java.lang.Object obj, java.lang.Object obj2, j$.util.concurrent.k kVar) {
        this(i, obj, obj2);
        this.d = kVar;
    }
}
