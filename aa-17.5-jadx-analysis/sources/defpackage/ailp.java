package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ailp extends ArrayList implements ailz {
    public ailp(int i) {
        super(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof aima) {
            return contains((aima) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof aima) {
            return indexOf((aima) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof aima) {
            return lastIndexOf((aima) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof aima) {
            return remove((aima) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(aima aimaVar) {
        return super.contains((Object) aimaVar);
    }

    public /* bridge */ int indexOf(aima aimaVar) {
        return super.indexOf((Object) aimaVar);
    }

    public /* bridge */ int lastIndexOf(aima aimaVar) {
        return super.lastIndexOf((Object) aimaVar);
    }

    public /* bridge */ boolean remove(aima aimaVar) {
        return super.remove((Object) aimaVar);
    }
}
