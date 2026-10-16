package defpackage;

import j$.util.Comparator;
import java.io.Serializable;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes3.dex */
public final /* synthetic */ class aepe implements Serializable, Comparator, aepf {
    public final /* synthetic */ aepf a;
    public final /* synthetic */ aepf b;

    public /* synthetic */ aepe(aepf aepfVar, aepf aepfVar2) {
        this.a = aepfVar;
        this.b = aepfVar2;
    }

    @Override // defpackage.aepf
    public final int a(long j, long j2) {
        int iA = this.a.a(j, j2);
        return iA == 0 ? this.b.a(j, j2) : iA;
    }

    @Override // defpackage.aepf
    /* renamed from: b */
    public final /* synthetic */ int compare(Long l, Long l2) {
        return adqq.ap(this, l, l2);
    }

    @Override // defpackage.aepf
    public final /* synthetic */ aepf c(aepf aepfVar) {
        return new aepe(this, aepfVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return compare((Long) obj, (Long) obj2);
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
