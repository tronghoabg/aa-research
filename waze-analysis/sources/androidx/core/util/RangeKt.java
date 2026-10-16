package androidx.core.util;

import android.util.Range;
import h.g.b.au;
import h.g.b.x;
import h.k.f;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class RangeKt {
    public static final <T extends Comparable<? super T>> Range<T> and(Range<T> range, Range<T> range2) {
        x.f(range, "<this>");
        x.f(range2, "other");
        Range<T> rangeIntersect = range.intersect(range2);
        x.e(rangeIntersect, "intersect(...)");
        return rangeIntersect;
    }

    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, Range<T> range2) {
        x.f(range, "<this>");
        x.f(range2, "other");
        Range<T> rangeExtend = range.extend(range2);
        x.e(rangeExtend, "extend(...)");
        return rangeExtend;
    }

    public static final <T extends Comparable<? super T>> Range<T> rangeTo(T t, T t2) {
        x.f(t, "<this>");
        x.f(t2, "that");
        return new Range<>(t, t2);
    }

    public static final <T extends Comparable<? super T>> f<T> toClosedRange(final Range<T> range) {
        x.f(range, "<this>");
        return new f() { // from class: androidx.core.util.RangeKt.toClosedRange.1
            public /* bridge */ boolean contains(Comparable comparable) {
                x.f(comparable, "value");
                return comparable.compareTo(getStart()) >= 0 && comparable.compareTo(getEndInclusive()) <= 0;
            }

            @Override // h.k.f
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            @Override // h.k.f
            public Comparable getStart() {
                return range.getLower();
            }

            @Override // h.k.f
            public /* bridge */ boolean isEmpty() {
                return au.i(this);
            }
        };
    }

    public static final <T extends Comparable<? super T>> Range<T> toRange(f<T> fVar) {
        x.f(fVar, "<this>");
        return new Range<>(fVar.getStart(), fVar.getEndInclusive());
    }

    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, T t) {
        x.f(range, "<this>");
        x.f(t, "value");
        Range<T> rangeExtend = range.extend((Range<T>) t);
        x.e(rangeExtend, "extend(...)");
        return rangeExtend;
    }
}
