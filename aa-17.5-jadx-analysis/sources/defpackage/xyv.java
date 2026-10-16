package defpackage;

import java.util.AbstractSet;

/* loaded from: classes3.dex */
abstract class xyv extends AbstractSet {
    final /* synthetic */ yan a;

    public xyv(yan yanVar) {
        this.a = yanVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
