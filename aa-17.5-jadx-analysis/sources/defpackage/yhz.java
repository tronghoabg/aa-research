package defpackage;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* loaded from: classes3.dex */
final class yhz extends AbstractSequentialList {
    final /* synthetic */ yif a;

    public yhz(yif yifVar) {
        this.a = yifVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        yid yidVar = new yid(this.a, i);
        return new yhy(yidVar, yidVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.d;
    }
}
