package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class yea extends yeb {
    final /* synthetic */ Iterable[] a;

    public yea(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable[] iterableArr = this.a;
        return new yhr(new ydz(iterableArr.length, iterableArr));
    }
}
