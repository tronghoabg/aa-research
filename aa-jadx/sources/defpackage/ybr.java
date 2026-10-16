package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ybr<K, V> extends java.util.AbstractQueue<defpackage.ybu<K, V>> {
    final defpackage.ybu a = new defpackage.ybp();

    @Override // java.util.Queue
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.ybu peek() {
        defpackage.ybu ybuVar = this.a;
        defpackage.ybu ybuVar2 = ((defpackage.ybp) ybuVar).a;
        if (ybuVar2 == ybuVar) {
            return null;
        }
        return ybuVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        defpackage.ybu ybuVar = this.a;
        defpackage.ybp ybpVar = (defpackage.ybp) ybuVar;
        defpackage.ybu ybuVar2 = ybpVar.a;
        while (ybuVar2 != ybuVar) {
            defpackage.ybu ybuVarG = ybuVar2.g();
            defpackage.ybt.g(ybuVar2);
            ybuVar2 = ybuVarG;
        }
        ybpVar.a = ybuVar;
        ybpVar.b = ybuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return ((defpackage.ybu) obj).g() != defpackage.yay.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        defpackage.ybu ybuVar = this.a;
        return ((defpackage.ybp) ybuVar).a == ybuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<defpackage.ybu<K, V>> iterator() {
        return new defpackage.ybq(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(java.lang.Object obj) {
        defpackage.ybu ybuVar = (defpackage.ybu) obj;
        defpackage.ybt.e(ybuVar.i(), ybuVar.g());
        defpackage.ybu ybuVar2 = this.a;
        defpackage.ybt.e(((defpackage.ybp) ybuVar2).b, ybuVar);
        defpackage.ybt.e(ybuVar, ybuVar2);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ java.lang.Object poll() {
        defpackage.ybu ybuVar = this.a;
        defpackage.ybu ybuVar2 = ((defpackage.ybp) ybuVar).a;
        if (ybuVar2 == ybuVar) {
            return null;
        }
        remove(ybuVar2);
        return ybuVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        defpackage.ybu ybuVar = (defpackage.ybu) obj;
        defpackage.ybu ybuVarI = ybuVar.i();
        defpackage.ybu ybuVarG = ybuVar.g();
        defpackage.ybt.e(ybuVarI, ybuVarG);
        defpackage.ybt.g(ybuVar);
        return ybuVarG != defpackage.yay.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        defpackage.ybu ybuVar = this.a;
        int i = 0;
        for (defpackage.ybu ybuVarG = ((defpackage.ybp) ybuVar).a; ybuVarG != ybuVar; ybuVarG = ybuVarG.g()) {
            i++;
        }
        return i;
    }
}
