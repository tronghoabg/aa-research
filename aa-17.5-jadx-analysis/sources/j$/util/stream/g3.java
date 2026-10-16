package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class g3 extends v2 {
    public final Comparator m;

    public g3(w2 w2Var, Comparator comparator) {
        super(w2Var, u3.p | u3.o, (byte) 0);
        comparator.getClass();
        this.m = comparator;
    }

    @Override // j$.util.stream.a
    public final j0 l(a aVar, Spliterator spliterator, IntFunction intFunction) {
        u3.SORTED.p(aVar.f);
        Object[] objArrK = aVar.c(spliterator, true, intFunction).k(intFunction);
        Arrays.sort(objArrK, this.m);
        return new m0(objArrK);
    }

    @Override // j$.util.stream.a
    public final z2 o(int i, z2 z2Var) {
        z2Var.getClass();
        u3.SORTED.p(i);
        boolean zP = u3.SIZED.p(i);
        Comparator comparator = this.m;
        return zP ? new i3(z2Var, comparator) : new h3(z2Var, comparator);
    }
}
