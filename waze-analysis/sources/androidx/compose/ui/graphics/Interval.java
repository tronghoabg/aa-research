package androidx.compose.ui.graphics;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class Interval<T> {
    public static final int $stable = 0;
    private final T data;
    private final float end;
    private final float start;

    public Interval(float f2, float f3, T t) {
        this.start = f2;
        this.end = f3;
        this.data = t;
    }

    public final boolean contains(float f2) {
        return f2 <= this.end && this.start <= f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Interval interval = (Interval) obj;
            return this.start == interval.start && this.end == interval.end && x.n(this.data, interval.data);
        }
        return false;
    }

    public final T getData() {
        return this.data;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getStart() {
        return this.start;
    }

    public int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.start) * 31) + Float.floatToIntBits(this.end);
        T t = this.data;
        return (iFloatToIntBits * 31) + (t != null ? t.hashCode() : 0);
    }

    public final boolean overlaps(Interval<T> interval) {
        return this.start <= interval.end && this.end >= interval.start;
    }

    public String toString() {
        return "Interval(start=" + this.start + ", end=" + this.end + ", data=" + this.data + ')';
    }

    public /* synthetic */ Interval(float f2, float f3, Object obj, int i2, o oVar) {
        this(f2, f3, (i2 & 4) != 0 ? null : obj);
    }

    public final boolean overlaps(float f2, float f3) {
        return this.start <= f3 && this.end >= f2;
    }
}
