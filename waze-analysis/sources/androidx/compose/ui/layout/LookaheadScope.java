package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Placeable;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LookaheadScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.LookaheadScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: localLookaheadPositionOf-au-aQtc$default, reason: not valid java name */
        public static /* synthetic */ long m9777localLookaheadPositionOfauaQtc$default(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j2, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-au-aQtc");
            }
            if ((i2 & 2) != 0) {
                j2 = Offset.Companion.m7996getZeroF1C5BW0();
            }
            return lookaheadScope.mo1828localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2, j2, (!((i2 & 4) == 0)) | z);
        }
    }

    LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope);

    /* renamed from: localLookaheadPositionOf-au-aQtc */
    long mo1828localLookaheadPositionOfauaQtc(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j2, boolean z);

    LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates);
}
