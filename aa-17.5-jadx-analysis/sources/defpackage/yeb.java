package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class yeb implements Iterable {
    private final Iterable a;

    public yeb(Iterable iterable) {
        iterable.getClass();
        this.a = iterable;
    }

    public static yeb a(Iterable iterable, Iterable iterable2) {
        return i(iterable, iterable2);
    }

    public static yeb b(Iterable iterable, Iterable iterable2, Iterable iterable3, Iterable iterable4) {
        return i(iterable, iterable2, iterable3, iterable4);
    }

    public static yeb d(Iterable iterable) {
        return iterable instanceof yeb ? (yeb) iterable : new ydy(iterable, iterable);
    }

    private static yeb i(Iterable... iterableArr) {
        for (Iterable iterable : iterableArr) {
            iterable.getClass();
        }
        return new yea(iterableArr);
    }

    public final yeb c(xxj xxjVar) {
        return d(yrm.aj(h(), xxjVar));
    }

    public final yeb e(xwx xwxVar) {
        return d(yrm.am(h(), xwxVar));
    }

    public final yfq f() {
        return yfq.n(h());
    }

    public final yfy g(xwx xwxVar) {
        Iterable iterableH = h();
        return ((iterableH instanceof List) || (iterableH instanceof yfg)) ? yrm.H(iterableH.iterator(), xwxVar, yfy.h(((Collection) iterableH).size())) : yrm.H(iterableH.iterator(), xwxVar, new yfu(4));
    }

    public final Iterable h() {
        Iterable iterable = this.a;
        return iterable != null ? iterable : this;
    }

    public final String toString() {
        return yrm.aa(h().iterator());
    }

    protected yeb() {
        this.a = null;
    }
}
