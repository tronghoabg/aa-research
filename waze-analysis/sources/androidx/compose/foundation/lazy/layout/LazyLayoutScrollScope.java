package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.ScrollScope;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LazyLayoutScrollScope extends ScrollScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ int calculateDistanceTo$default(LazyLayoutScrollScope lazyLayoutScrollScope, int i2, int i3, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateDistanceTo");
            }
            if ((i4 & 2) != 0) {
                i3 = 0;
            }
            return lazyLayoutScrollScope.calculateDistanceTo(i2, i3);
        }

        public static /* synthetic */ void snapToItem$default(LazyLayoutScrollScope lazyLayoutScrollScope, int i2, int i3, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapToItem");
            }
            if ((i4 & 2) != 0) {
                i3 = 0;
            }
            lazyLayoutScrollScope.snapToItem(i2, i3);
        }
    }

    int calculateDistanceTo(int i2, int i3);

    int getFirstVisibleItemIndex();

    int getFirstVisibleItemScrollOffset();

    int getItemCount();

    int getLastVisibleItemIndex();

    void snapToItem(int i2, int i3);
}
