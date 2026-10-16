package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class yal<K, V> extends AbstractQueue<yao<K, V>> {
    final yao a = new yaj();

    @Override // java.util.Queue
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yao peek() {
        yao yaoVar = this.a;
        yao yaoVar2 = ((yaj) yaoVar).a;
        if (yaoVar2 == yaoVar) {
            return null;
        }
        return yaoVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        yao yaoVar = this.a;
        yaj yajVar = (yaj) yaoVar;
        yao yaoVar2 = yajVar.a;
        while (yaoVar2 != yaoVar) {
            yao yaoVarG = yaoVar2.g();
            yan.g(yaoVar2);
            yaoVar2 = yaoVarG;
        }
        yajVar.a = yaoVar;
        yajVar.b = yaoVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((yao) obj).g() != xzs.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        yao yaoVar = this.a;
        return ((yaj) yaoVar).a == yaoVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<yao<K, V>> iterator() {
        return new yak(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        yao yaoVar = (yao) obj;
        yan.e(yaoVar.i(), yaoVar.g());
        yao yaoVar2 = this.a;
        yan.e(((yaj) yaoVar2).b, yaoVar);
        yan.e(yaoVar, yaoVar2);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        yao yaoVar = this.a;
        yao yaoVar2 = ((yaj) yaoVar).a;
        if (yaoVar2 == yaoVar) {
            return null;
        }
        remove(yaoVar2);
        return yaoVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        yao yaoVar = (yao) obj;
        yao yaoVarI = yaoVar.i();
        yao yaoVarG = yaoVar.g();
        yan.e(yaoVarI, yaoVarG);
        yan.g(yaoVar);
        return yaoVarG != xzs.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        yao yaoVar = this.a;
        int i = 0;
        for (yao yaoVarG = ((yaj) yaoVar).a; yaoVarG != yaoVar; yaoVarG = yaoVarG.g()) {
            i++;
        }
        return i;
    }
}
