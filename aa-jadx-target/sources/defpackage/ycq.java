package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ycq extends defpackage.ycm implements java.util.Set {
    final /* synthetic */ defpackage.ycs f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycq(defpackage.ycs ycsVar, java.lang.Object obj, java.util.Set set) {
        super(ycsVar, obj, set, null);
        this.f = ycsVar;
    }

    @Override // defpackage.ycm, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zW = defpackage.ysr.w((java.util.Set) this.b, collection);
        if (zW) {
            int size2 = this.b.size();
            this.f.b += size2 - size;
            c();
        }
        return zW;
    }
}
