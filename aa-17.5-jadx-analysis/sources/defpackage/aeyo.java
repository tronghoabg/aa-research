package defpackage;

import j$.util.Comparator;
import java.io.Serializable;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes3.dex */
public final class aeyo implements Serializable, Comparator, aeyk {
    private static final long serialVersionUID = 1;

    protected aeyo() {
    }

    private Object readResolve() {
        return aeyp.b;
    }

    @Override // defpackage.aeyk
    public final /* synthetic */ int a(Short sh, Short sh2) {
        return adqs.W(this, sh, sh2);
    }

    @Override // defpackage.aeyk
    public final int b(short s, short s2) {
        return -Short.compare(s, s2);
    }

    @Override // defpackage.aeyk
    public final /* synthetic */ aeyk c(aeyk aeykVar) {
        return new aeyj(this, aeykVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return a((Short) obj, (Short) obj2);
    }

    @Override // j$.util.Comparator, java.util.Comparator
    public final /* synthetic */ java.util.Comparator reversed() {
        return aeyp.a;
    }

    @Override // j$.util.Comparator, java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return adqs.X(this, comparator);
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
