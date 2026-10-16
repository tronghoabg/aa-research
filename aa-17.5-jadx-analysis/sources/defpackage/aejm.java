package defpackage;

import j$.util.Comparator;
import java.io.Serializable;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes3.dex */
public final class aejm implements Serializable, Comparator, aejj {
    private static final long serialVersionUID = 1;
    final aejj a;

    protected aejm(aejj aejjVar) {
        this.a = aejjVar;
    }

    @Override // defpackage.aejj
    public final int a(int i, int i2) {
        return this.a.a(i2, i);
    }

    @Override // defpackage.aejj
    public final /* synthetic */ int b(Integer num, Integer num2) {
        return adzo.n(this, num, num2);
    }

    @Override // defpackage.aejj
    public final /* synthetic */ aejj c(aejj aejjVar) {
        return new aeji(this, aejjVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return b((Integer) obj, (Integer) obj2);
    }

    @Override // j$.util.Comparator, java.util.Comparator
    public final /* synthetic */ java.util.Comparator reversed() {
        return this.a;
    }

    @Override // j$.util.Comparator, java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return adzo.p(this, comparator);
    }

    @Override // j$.util.Comparator, java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // j$.util.Comparator, java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // j$.util.Comparator, java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // j$.util.Comparator, java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function) {
        return Comparator.EL.thenComparing(this, Comparator.CC.comparing(function));
    }

    @Override // j$.util.Comparator, java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return Comparator.EL.thenComparing(this, Comparator.CC.comparing(function, comparator));
    }
}
