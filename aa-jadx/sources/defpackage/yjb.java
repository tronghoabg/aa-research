package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yjb extends java.util.AbstractSequentialList {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.yjl b;

    public yjb(defpackage.yjl yjlVar, java.lang.Object obj) {
        this.a = obj;
        this.b = yjlVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return new defpackage.yjk(this.b, this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        defpackage.yjh yjhVar = (defpackage.yjh) this.b.c.get(this.a);
        if (yjhVar == null) {
            return 0;
        }
        return yjhVar.a;
    }
}
