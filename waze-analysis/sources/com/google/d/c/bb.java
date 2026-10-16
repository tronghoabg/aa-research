package com.google.d.c;

import java.util.AbstractQueue;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bb<K, V> extends AbstractQueue<be<K, V>> {

    /* renamed from: a, reason: collision with root package name */
    final be f7340a = new az(this);

    bb() {
    }

    @Override // java.util.Queue
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final be peek() {
        be beVar = this.f7340a;
        be beVar2 = ((az) beVar).f7337a;
        if (beVar2 == beVar) {
            return null;
        }
        return beVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        be beVar = this.f7340a;
        az azVar = (az) beVar;
        be beVar2 = azVar.f7337a;
        while (beVar2 != beVar) {
            be beVarG = beVar2.g();
            bd.f(beVar2);
            beVar2 = beVarG;
        }
        azVar.f7337a = beVar;
        azVar.f7338b = beVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((be) obj).g() != ai.f7284a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        be beVar = this.f7340a;
        return ((az) beVar).f7337a == beVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<be<K, V>> iterator() {
        return new ba(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        be beVar = (be) obj;
        bd.d(beVar.i(), beVar.g());
        be beVar2 = this.f7340a;
        bd.d(((az) beVar2).f7338b, beVar);
        bd.d(beVar, beVar2);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        be beVar = this.f7340a;
        be beVar2 = ((az) beVar).f7337a;
        if (beVar2 == beVar) {
            return null;
        }
        remove(beVar2);
        return beVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        be beVar = (be) obj;
        be beVarI = beVar.i();
        be beVarG = beVar.g();
        bd.d(beVarI, beVarG);
        bd.f(beVar);
        return beVarG != ai.f7284a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        be beVar = this.f7340a;
        int i2 = 0;
        for (be beVarG = ((az) beVar).f7337a; beVarG != beVar; beVarG = beVarG.g()) {
            i2++;
        }
        return i2;
    }
}
