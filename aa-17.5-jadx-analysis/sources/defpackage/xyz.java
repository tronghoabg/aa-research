package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class xyz<K, V> extends AbstractQueue<yao<K, V>> {
    final yao a = new xyx();

    @Override // java.util.Queue
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yao peek() {
        yao yaoVar = this.a;
        yao yaoVar2 = ((xyx) yaoVar).a;
        if (yaoVar2 == yaoVar) {
            return null;
        }
        return yaoVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        yao yaoVar = this.a;
        xyx xyxVar = (xyx) yaoVar;
        yao yaoVar2 = xyxVar.a;
        while (yaoVar2 != yaoVar) {
            yao yaoVarF = yaoVar2.f();
            yan.f(yaoVar2);
            yaoVar2 = yaoVarF;
        }
        xyxVar.a = yaoVar;
        xyxVar.b = yaoVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((yao) obj).f() != xzs.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        yao yaoVar = this.a;
        return ((xyx) yaoVar).a == yaoVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<yao<K, V>> iterator() {
        return new xyy(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        yao yaoVar = (yao) obj;
        yan.d(yaoVar.h(), yaoVar.f());
        yao yaoVar2 = this.a;
        yan.d(((xyx) yaoVar2).b, yaoVar);
        yan.d(yaoVar, yaoVar2);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        yao yaoVar = this.a;
        yao yaoVar2 = ((xyx) yaoVar).a;
        if (yaoVar2 == yaoVar) {
            return null;
        }
        remove(yaoVar2);
        return yaoVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        yao yaoVar = (yao) obj;
        yao yaoVarH = yaoVar.h();
        yao yaoVarF = yaoVar.f();
        yan.d(yaoVarH, yaoVarF);
        yan.f(yaoVar);
        return yaoVarF != xzs.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        yao yaoVar = this.a;
        int i = 0;
        for (yao yaoVarF = ((xyx) yaoVar).a; yaoVarF != yaoVar; yaoVarF = yaoVarF.f()) {
            i++;
        }
        return i;
    }
}
