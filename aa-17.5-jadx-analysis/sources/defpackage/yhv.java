package defpackage;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class yhv extends AbstractSequentialList {
    final /* synthetic */ Object a;
    final /* synthetic */ yif b;

    public yhv(yif yifVar, Object obj) {
        this.a = obj;
        this.b = yifVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new yie(this.b, this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        yib yibVar = (yib) this.b.c.get(this.a);
        if (yibVar == null) {
            return 0;
        }
        return yibVar.a;
    }
}
