package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yjc extends java.util.AbstractSequentialList {
    final /* synthetic */ defpackage.yjl a;

    public yjc(defpackage.yjl yjlVar) {
        this.a = yjlVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final java.util.ListIterator<java.util.Map.Entry> listIterator(int i) {
        return new defpackage.yjj(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.d;
    }
}
