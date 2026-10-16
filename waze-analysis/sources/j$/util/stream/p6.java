package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class p6 extends k5 {
    public final boolean m;
    public final Comparator n;

    public p6(l5 l5Var, Comparator comparator) {
        super(l5Var, j7.q | j7.p, 0);
        this.m = false;
        this.n = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.a
    public final m2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        if (j7.SORTED.k(aVar.f50316f) && this.m) {
            return aVar.j(spliterator, false, intFunction);
        }
        Object[] objArrK = aVar.j(spliterator, true, intFunction).k(intFunction);
        Arrays.sort(objArrK, this.n);
        return new p2(objArrK);
    }

    @Override // j$.util.stream.a
    public final t5 M(int i2, t5 t5Var) {
        Objects.requireNonNull(t5Var);
        if (j7.SORTED.k(i2) && this.m) {
            return t5Var;
        }
        boolean zK = j7.SIZED.k(i2);
        Comparator comparator = this.n;
        return zK ? new u6(t5Var, comparator) : new q6(t5Var, comparator);
    }

    public p6(l5 l5Var) {
        super(l5Var, j7.q | j7.o, 0);
        this.m = true;
        this.n = j$.util.d.INSTANCE;
    }
}
