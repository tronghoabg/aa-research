package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class yhh extends yeb {
    final /* synthetic */ Iterable a;
    final /* synthetic */ xxj b;

    public yhh(Iterable iterable, xxj xxjVar) {
        this.a = iterable;
        this.b = xxjVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        return new yhn(it, this.b);
    }
}
