package androidx.compose.foundation.layout;

import androidx.collection.MutableObjectList;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ResolvedGridItemIndicesResult {
    private final MutableObjectList<GridItem> gridItems;
    private final long gridSize;

    private ResolvedGridItemIndicesResult(MutableObjectList<GridItem> mutableObjectList, long j2) {
        this.gridItems = mutableObjectList;
        this.gridSize = j2;
    }

    public final MutableObjectList<GridItem> getGridItems() {
        return this.gridItems;
    }

    /* renamed from: getGridSize-YbymL2g, reason: not valid java name */
    public final long m2800getGridSizeYbymL2g() {
        return this.gridSize;
    }

    public /* synthetic */ ResolvedGridItemIndicesResult(MutableObjectList mutableObjectList, long j2, o oVar) {
        this(mutableObjectList, j2);
    }
}
