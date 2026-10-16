package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class yhl extends yeb {
    final /* synthetic */ Iterable a;
    final /* synthetic */ int b;

    public yhl(Iterable iterable, int i) {
        this.a = iterable;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        int i = this.b;
        woy.O(i >= 0, "limit is negative");
        return new yhp(i, it);
    }
}
