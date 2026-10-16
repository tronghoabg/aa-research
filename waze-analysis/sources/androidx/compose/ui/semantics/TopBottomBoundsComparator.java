package androidx.compose.ui.semantics;

import androidx.compose.ui.geometry.Rect;
import h.k;
import java.util.Comparator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class TopBottomBoundsComparator implements Comparator<k<? extends Rect, ? extends List<SemanticsNode>>> {
    public static final TopBottomBoundsComparator INSTANCE = new TopBottomBoundsComparator();

    private TopBottomBoundsComparator() {
    }

    /* renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(k<Rect, ? extends List<SemanticsNode>> kVar, k<Rect, ? extends List<SemanticsNode>> kVar2) {
        int iCompare = Float.compare(((Rect) kVar.c()).getTop(), ((Rect) kVar2.c()).getTop());
        return iCompare != 0 ? iCompare : Float.compare(((Rect) kVar.c()).getBottom(), ((Rect) kVar2.c()).getBottom());
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(k<? extends Rect, ? extends List<SemanticsNode>> kVar, k<? extends Rect, ? extends List<SemanticsNode>> kVar2) {
        return compare2((k<Rect, ? extends List<SemanticsNode>>) kVar, (k<Rect, ? extends List<SemanticsNode>>) kVar2);
    }
}
