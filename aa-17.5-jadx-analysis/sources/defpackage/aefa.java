package defpackage;

import j$.util.Comparator;
import java.io.Serializable;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes3.dex */
public final /* synthetic */ class aefa implements Serializable, Comparator, aefb {
    public final /* synthetic */ aefb a;
    public final /* synthetic */ aefb b;

    public /* synthetic */ aefa(aefb aefbVar, aefb aefbVar2) {
        this.a = aefbVar;
        this.b = aefbVar2;
    }

    @Override // defpackage.aefb
    public final int a(byte b, byte b2) {
        int iA = this.a.a(b, b2);
        return iA == 0 ? this.b.a(b, b2) : iA;
    }

    @Override // defpackage.aefb
    /* renamed from: b */
    public final /* synthetic */ int compare(Byte b, Byte b2) {
        return adzo.g(this, b, b2);
    }

    @Override // defpackage.aefb
    public final /* synthetic */ aefb c(aefb aefbVar) {
        return new aefa(this, aefbVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return compare((Byte) obj, (Byte) obj2);
    }

    @Override // j$.util.Comparator, java.util.Comparator
    public final /* synthetic */ java.util.Comparator reversed() {
        return aefg.a(this);
    }

    @Override // j$.util.Comparator, java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return adzo.i(this, comparator);
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
