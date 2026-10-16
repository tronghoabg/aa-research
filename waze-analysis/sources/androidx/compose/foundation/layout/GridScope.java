package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import h.k.j;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes.dex */
public interface GridScope {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int GridIndexUnspecified = 0;
    public static final int MaxGridIndex = 1000;

    Modifier gridItem(Modifier modifier, int i2, int i3, int i4, int i5, Alignment alignment);

    Modifier gridItem(Modifier modifier, j jVar, j jVar2, Alignment alignment);

    /* compiled from: WazeSource */
    public final class DefaultImpls {
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int GridIndexUnspecified = 0;
        public static final int MaxGridIndex = 1000;

        private Companion() {
        }

        public static /* synthetic */ void getGridIndexUnspecified$annotations() {
        }

        public static /* synthetic */ void getMaxGridIndex$annotations() {
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.layout.GridScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Modifier gridItem$default(GridScope gridScope, Modifier modifier, int i2, int i3, int i4, int i5, Alignment alignment, int i6, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gridItem");
            }
            if (1 == (i6 & 1)) {
                i2 = 0;
            }
            if ((i6 & 2) != 0) {
                i3 = 0;
            }
            if ((i6 & 4) != 0) {
                i4 = 1;
            }
            if ((i6 & 8) != 0) {
                i5 = 1;
            }
            if ((i6 & 16) != 0) {
                alignment = Alignment.Companion.getTopStart();
            }
            return gridScope.gridItem(modifier, i2, i3, i4, i5, alignment);
        }

        public static /* synthetic */ Modifier gridItem$default(GridScope gridScope, Modifier modifier, j jVar, j jVar2, Alignment alignment, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gridItem");
            }
            if ((i2 & 4) != 0) {
                alignment = Alignment.Companion.getTopStart();
            }
            return gridScope.gridItem(modifier, jVar, jVar2, alignment);
        }
    }
}
