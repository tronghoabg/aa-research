package h.b;

import androidx.media3.exoplayer.upstream.CmcdData;
import h.g.b.x;
import j$.util.Comparator;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements Comparator, j$.util.Comparator {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f48037c;

    /* renamed from: b, reason: collision with root package name */
    public static final b f48036b = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public static final b f48035a = new b(0);

    private b(int i2) {
        this.f48037c = i2;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        if (this.f48037c != 0) {
            Comparable comparable = (Comparable) obj;
            Comparable comparable2 = (Comparable) obj2;
            x.f(comparable, CmcdData.OBJECT_TYPE_AUDIO_ONLY);
            x.f(comparable2, "b");
            return comparable.compareTo(comparable2);
        }
        Comparable comparable3 = (Comparable) obj;
        Comparable comparable4 = (Comparable) obj2;
        x.f(comparable3, CmcdData.OBJECT_TYPE_AUDIO_ONLY);
        x.f(comparable4, "b");
        return comparable4.compareTo(comparable3);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final Comparator reversed() {
        return this.f48037c != 0 ? f48035a : f48036b;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return this.f48037c != 0 ? Comparator.CC.$default$thenComparing(this, comparator) : Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return this.f48037c != 0 ? Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction) : Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return this.f48037c != 0 ? Comparator.EL.a(this, Comparator.CC.comparingInt(toIntFunction)) : Comparator.EL.a(this, Comparator.CC.comparingInt(toIntFunction));
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return this.f48037c != 0 ? Comparator.CC.$default$thenComparingLong(this, toLongFunction) : Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function) {
        return this.f48037c != 0 ? Comparator.EL.a(this, Comparator.CC.comparing(function)) : Comparator.EL.a(this, Comparator.CC.comparing(function));
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return this.f48037c != 0 ? Comparator.CC.$default$thenComparing(this, function, comparator) : Comparator.CC.$default$thenComparing(this, function, comparator);
    }
}
