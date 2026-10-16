package defpackage;

import j$.util.Comparator;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes3.dex */
public final class afcf implements Comparator, j$.util.Comparator {
    private final /* synthetic */ int c;
    public static final afcf b = new afcf(1);
    public static final afcf a = new afcf(0);

    private afcf(int i) {
        this.c = i;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        if (this.c != 0) {
            Comparable comparable = (Comparable) obj;
            Comparable comparable2 = (Comparable) obj2;
            comparable.getClass();
            comparable2.getClass();
            return comparable.compareTo(comparable2);
        }
        Comparable comparable3 = (Comparable) obj;
        Comparable comparable4 = (Comparable) obj2;
        comparable3.getClass();
        comparable4.getClass();
        return comparable4.compareTo(comparable3);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final Comparator reversed() {
        return this.c != 0 ? a : b;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return this.c != 0 ? Comparator.CC.$default$thenComparing(this, comparator) : Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return this.c != 0 ? Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction) : Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return this.c != 0 ? Comparator.CC.$default$thenComparingInt(this, toIntFunction) : Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return this.c != 0 ? Comparator.CC.$default$thenComparingLong(this, toLongFunction) : Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function) {
        return this.c != 0 ? Comparator.EL.thenComparing(this, Comparator.CC.comparing(function)) : Comparator.EL.thenComparing(this, Comparator.CC.comparing(function));
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return this.c != 0 ? Comparator.EL.thenComparing(this, Comparator.CC.comparing(function, comparator)) : Comparator.EL.thenComparing(this, Comparator.CC.comparing(function, comparator));
    }
}
