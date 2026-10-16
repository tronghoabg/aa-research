package defpackage;

import j$.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes3.dex */
final class aepg implements Comparator, aepf {
    final /* synthetic */ java.util.Comparator a;

    public aepg(java.util.Comparator comparator) {
        this.a = comparator;
    }

    @Override // defpackage.aepf
    public final int a(long j, long j2) {
        return this.a.compare(Long.valueOf(j), Long.valueOf(j2));
    }

    @Override // java.util.Comparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compare(Long l, Long l2) {
        return this.a.compare(l, l2);
    }

    @Override // defpackage.aepf
    public final /* synthetic */ aepf c(aepf aepfVar) {
        return new aepe(this, aepfVar);
    }

    @Override // j$.util.Comparator, java.util.Comparator
    public final /* synthetic */ java.util.Comparator reversed() {
        return aepk.a(this);
    }

    @Override // j$.util.Comparator, java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return adqq.ar(this, comparator);
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
