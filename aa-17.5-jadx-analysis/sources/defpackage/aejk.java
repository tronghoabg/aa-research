package defpackage;

import j$.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes3.dex */
final class aejk implements Comparator, aejj {
    final /* synthetic */ java.util.Comparator a;

    public aejk(java.util.Comparator comparator) {
        this.a = comparator;
    }

    @Override // defpackage.aejj
    public final int a(int i, int i2) {
        return this.a.compare(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // java.util.Comparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compare(Integer num, Integer num2) {
        return this.a.compare(num, num2);
    }

    @Override // defpackage.aejj
    public final /* synthetic */ aejj c(aejj aejjVar) {
        return new aeji(this, aejjVar);
    }

    @Override // j$.util.Comparator, java.util.Comparator
    public final /* synthetic */ java.util.Comparator reversed() {
        return aejo.a(this);
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
