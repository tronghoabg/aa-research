package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ygq extends defpackage.yhx {
    private final transient java.util.EnumSet a;
    private transient int b;

    public ygq(java.util.EnumSet enumSet) {
        this.a = enumSet;
    }

    public static defpackage.yhx h(java.util.EnumSet enumSet) {
        int size = enumSet.size();
        if (size != 0) {
            return size != 1 ? new defpackage.ygq(enumSet) : new defpackage.ynu((java.lang.Enum) defpackage.ysr.Y(enumSet.iterator()));
        }
        return defpackage.ynd.a;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.ygm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        if (collection instanceof defpackage.ygq) {
            collection = ((defpackage.ygq) collection).a;
        }
        return this.a.containsAll(collection);
    }

    @Override // defpackage.yhx, defpackage.ygm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final defpackage.yot iterator() {
        return defpackage.ysr.X(this.a.iterator());
    }

    @Override // defpackage.yhx, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ygq) {
            obj = ((defpackage.ygq) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.ygm
    public final boolean f() {
        return false;
    }

    @Override // defpackage.yhx, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.a.hashCode();
        this.b = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.yhx
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return this.a.toString();
    }

    @Override // defpackage.yhx, defpackage.ygm
    public java.lang.Object writeReplace() {
        return new defpackage.ygp(this.a);
    }
}
