package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yaf<K, V> extends java.util.AbstractQueue<defpackage.ybu<K, V>> {
    final defpackage.ybu a = new defpackage.yad();

    @Override // java.util.Queue
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.ybu peek() {
        defpackage.ybu ybuVar = this.a;
        defpackage.ybu ybuVar2 = ((defpackage.yad) ybuVar).a;
        if (ybuVar2 == ybuVar) {
            return null;
        }
        return ybuVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        defpackage.ybu ybuVar = this.a;
        defpackage.yad yadVar = (defpackage.yad) ybuVar;
        defpackage.ybu ybuVar2 = yadVar.a;
        while (ybuVar2 != ybuVar) {
            defpackage.ybu ybuVarF = ybuVar2.f();
            defpackage.ybt.f(ybuVar2);
            ybuVar2 = ybuVarF;
        }
        yadVar.a = ybuVar;
        yadVar.b = ybuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return ((defpackage.ybu) obj).f() != defpackage.yay.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        defpackage.ybu ybuVar = this.a;
        return ((defpackage.yad) ybuVar).a == ybuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<defpackage.ybu<K, V>> iterator() {
        return new defpackage.yae(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(java.lang.Object obj) {
        defpackage.ybu ybuVar = (defpackage.ybu) obj;
        defpackage.ybt.d(ybuVar.h(), ybuVar.f());
        defpackage.ybu ybuVar2 = this.a;
        defpackage.ybt.d(((defpackage.yad) ybuVar2).b, ybuVar);
        defpackage.ybt.d(ybuVar, ybuVar2);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ java.lang.Object poll() {
        defpackage.ybu ybuVar = this.a;
        defpackage.ybu ybuVar2 = ((defpackage.yad) ybuVar).a;
        if (ybuVar2 == ybuVar) {
            return null;
        }
        remove(ybuVar2);
        return ybuVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        defpackage.ybu ybuVar = (defpackage.ybu) obj;
        defpackage.ybu ybuVarH = ybuVar.h();
        defpackage.ybu ybuVarF = ybuVar.f();
        defpackage.ybt.d(ybuVarH, ybuVarF);
        defpackage.ybt.f(ybuVar);
        return ybuVarF != defpackage.yay.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        defpackage.ybu ybuVar = this.a;
        int i = 0;
        for (defpackage.ybu ybuVarF = ((defpackage.yad) ybuVar).a; ybuVarF != ybuVar; ybuVarF = ybuVarF.f()) {
            i++;
        }
        return i;
    }
}
