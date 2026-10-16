package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
abstract class yhg extends defpackage.yhx {
    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // defpackage.ygm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object obj2 = h().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ygm
    public final boolean f() {
        return h().c();
    }

    public abstract defpackage.yhe h();

    @Override // defpackage.yhx, java.util.Collection, java.util.Set
    public final int hashCode() {
        return h().hashCode();
    }

    @Override // defpackage.yhx
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return h().size();
    }

    @Override // defpackage.yhx, defpackage.ygm
    public java.lang.Object writeReplace() {
        return new yhf(h());
    }
}
