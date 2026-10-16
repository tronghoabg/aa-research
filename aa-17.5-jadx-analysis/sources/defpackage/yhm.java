package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class yhm extends yno {
    final /* synthetic */ Iterator a;

    public yhm(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.next();
    }
}
