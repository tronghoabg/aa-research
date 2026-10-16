package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface IntervalList<T> {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.layout.IntervalList$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void forEach$default(IntervalList intervalList, int i2, int i3, l lVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
            }
            if (1 == (i4 & 1)) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = intervalList.getSize() - 1;
            }
            intervalList.forEach(i2, i3, lVar);
        }
    }

    /* compiled from: WazeSource */
    public final class Interval<T> {
        public static final int $stable = 0;
        private final int size;
        private final int startIndex;
        private final T value;

        public Interval(int i2, int i3, T t) {
            this.startIndex = i2;
            this.size = i3;
            this.value = t;
            if (i2 < 0) {
                InlineClassHelperKt.throwIllegalArgumentException("startIndex should be >= 0");
            }
            if (i3 > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("size should be > 0");
        }

        public final int getSize() {
            return this.size;
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public final T getValue() {
            return this.value;
        }
    }

    void forEach(int i2, int i3, l<? super Interval<? extends T>, ab> lVar);

    Interval<T> get(int i2);

    int getSize();
}
