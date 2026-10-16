package hf;

import j$.util.Comparator;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: hf.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2819a implements Comparator, j$.util.Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final C2819a f36430b = new C2819a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C2819a f36431c = new C2819a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36432a;

    public /* synthetic */ C2819a(int i5) {
        this.f36432a = i5;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f36432a) {
            case 0:
                Comparable a5 = (Comparable) obj;
                Comparable b5 = (Comparable) obj2;
                AbstractC3340k.e(a5, "a");
                AbstractC3340k.e(b5, "b");
                return a5.compareTo(b5);
            default:
                Comparable a10 = (Comparable) obj;
                Comparable b10 = (Comparable) obj2;
                AbstractC3340k.e(a10, "a");
                AbstractC3340k.e(b10, "b");
                return b10.compareTo(a10);
        }
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final Comparator reversed() {
        switch (this.f36432a) {
            case 0:
                return f36431c;
            default:
                return f36430b;
        }
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        int i5 = this.f36432a;
        return Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        int i5 = this.f36432a;
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        int i5 = this.f36432a;
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        int i5 = this.f36432a;
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function) {
        int i5 = this.f36432a;
        return Comparator.EL.a(this, Comparator.CC.comparing(function));
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        int i5 = this.f36432a;
        return Comparator.EL.a(this, Comparator.CC.comparing(function, comparator));
    }
}
