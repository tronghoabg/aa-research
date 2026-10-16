package com.google.d.c;

import java.util.AbstractQueue;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class s<K, V> extends AbstractQueue<be<K, V>> {

    /* renamed from: a, reason: collision with root package name */
    final be f7390a = new q(this);

    s() {
    }

    @Override // java.util.Queue
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final be peek() {
        be beVar = this.f7390a;
        be beVar2 = ((q) beVar).f7387a;
        if (beVar2 == beVar) {
            return null;
        }
        return beVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        be beVar = this.f7390a;
        q qVar = (q) beVar;
        be beVar2 = qVar.f7387a;
        while (beVar2 != beVar) {
            be beVarF = beVar2.f();
            bd.e(beVar2);
            beVar2 = beVarF;
        }
        qVar.f7387a = beVar;
        qVar.f7388b = beVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((be) obj).f() != ai.f7284a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        be beVar = this.f7390a;
        return ((q) beVar).f7387a == beVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<be<K, V>> iterator() {
        return new r(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        be beVar = (be) obj;
        bd.c(beVar.h(), beVar.f());
        be beVar2 = this.f7390a;
        bd.c(((q) beVar2).f7388b, beVar);
        bd.c(beVar, beVar2);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        be beVar = this.f7390a;
        be beVar2 = ((q) beVar).f7387a;
        if (beVar2 == beVar) {
            return null;
        }
        remove(beVar2);
        return beVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        be beVar = (be) obj;
        be beVarH = beVar.h();
        be beVarF = beVar.f();
        bd.c(beVarH, beVarF);
        bd.e(beVar);
        return beVarF != ai.f7284a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        be beVar = this.f7390a;
        int i2 = 0;
        for (be beVarF = ((q) beVar).f7387a; beVarF != beVar; beVarF = beVarF.f()) {
            i2++;
        }
        return i2;
    }
}
