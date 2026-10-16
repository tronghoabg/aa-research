package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yjf extends java.util.AbstractSequentialList {
    final /* synthetic */ defpackage.yjl a;

    public yjf(defpackage.yjl yjlVar) {
        this.a = yjlVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        defpackage.yjj yjjVar = new defpackage.yjj(this.a, i);
        return new defpackage.yje(yjjVar, yjjVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.d;
    }
}
