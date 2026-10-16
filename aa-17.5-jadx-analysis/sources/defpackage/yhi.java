package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class yhi extends yeb {
    final /* synthetic */ Iterable a;
    final /* synthetic */ xwx b;

    public yhi(Iterable iterable, xwx xwxVar) {
        this.a = iterable;
        this.b = xwxVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new yho(this.a.iterator(), this.b);
    }
}
