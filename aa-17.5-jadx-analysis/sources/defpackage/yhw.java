package defpackage;

import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class yhw extends AbstractSequentialList {
    final /* synthetic */ yif a;

    public yhw(yif yifVar) {
        this.a = yifVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<Map.Entry> listIterator(int i) {
        return new yid(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.d;
    }
}
