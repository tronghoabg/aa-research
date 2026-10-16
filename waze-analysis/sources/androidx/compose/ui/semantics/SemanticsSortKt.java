package androidx.compose.ui.semantics;

import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import h.a.i;
import h.b.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.g.b.y;
import h.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SemanticsSortKt {
    private static final p<SemanticsNode, SemanticsNode, Integer> UnmergedConfigComparator;
    private static final Comparator<SemanticsNode>[] semanticComparators;

    static {
        Comparator<SemanticsNode>[] comparatorArr = new Comparator[2];
        int i2 = 0;
        while (i2 < 2) {
            final Comparator comparator = i2 == 0 ? RtlBoundsComparator.INSTANCE : LtrBoundsComparator.INSTANCE;
            final Comparator<LayoutNode> zComparator$ui = LayoutNode.Companion.getZComparator$ui();
            final Comparator comparator2 = new Comparator() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int iCompare = comparator.compare(t, t2);
                    return iCompare != 0 ? iCompare : zComparator$ui.compare(((SemanticsNode) t).getLayoutNode$ui(), ((SemanticsNode) t2).getLayoutNode$ui());
                }
            };
            comparatorArr[i2] = new Comparator() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int iCompare = comparator2.compare(t, t2);
                    return iCompare != 0 ? iCompare : a.a(Integer.valueOf(((SemanticsNode) t).getId()), Integer.valueOf(((SemanticsNode) t2).getId()));
                }
            };
            i2++;
        }
        semanticComparators = comparatorArr;
        UnmergedConfigComparator = SemanticsSortKt$UnmergedConfigComparator$1.INSTANCE;
    }

    private static final void geometryDepthFirstSearch(SemanticsNode semanticsNode, ArrayList<SemanticsNode> arrayList, l<? super SemanticsNode, Boolean> lVar, l<? super SemanticsNode, Boolean> lVar2, MutableIntObjectMap<List<SemanticsNode>> mutableIntObjectMap) {
        boolean zBooleanValue = ((Boolean) semanticsNode.getUnmergedConfig$ui().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), SemanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1.INSTANCE)).booleanValue();
        if (zBooleanValue || lVar2.invoke(semanticsNode).booleanValue()) {
            if (lVar.invoke(semanticsNode).booleanValue()) {
                arrayList.add(semanticsNode);
            }
            if (zBooleanValue) {
                mutableIntObjectMap.set(semanticsNode.getId(), subtreeSortedByGeometryGrouping(semanticsNode, lVar, lVar2, semanticsNode.getChildren()));
                return;
            }
        }
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i2 = 0; i2 < size; i2++) {
            geometryDepthFirstSearch(children.get(i2), arrayList, lVar, lVar2, mutableIntObjectMap);
        }
    }

    private static final boolean placedEntryRowOverlaps(ArrayList<k<Rect, List<SemanticsNode>>> arrayList, SemanticsNode semanticsNode) {
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        ArrayList<k<Rect, List<SemanticsNode>>> arrayList2 = arrayList;
        x.f(arrayList2, "<this>");
        int size = arrayList2.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                Rect rect = (Rect) arrayList.get(i2).c();
                float top2 = rect.getTop();
                float bottom2 = rect.getBottom();
                if (top < bottom && top2 < bottom2 && Math.max(top, rect.getTop()) < Math.min(bottom, rect.getBottom())) {
                    arrayList.set(i2, new k<>(rect.intersect(0.0f, top, Float.POSITIVE_INFINITY, bottom), arrayList.get(i2).d()));
                    ((List) arrayList.get(i2).d()).add(semanticsNode);
                    return true;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public static final List<SemanticsNode> sortByGeometryGroupings(SemanticsNode semanticsNode, List<SemanticsNode> list, l<? super SemanticsNode, Boolean> lVar, IntObjectMap<List<SemanticsNode>> intObjectMap) {
        int size = 0;
        char c2 = semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl ? (char) 0 : (char) 1;
        ArrayList arrayList = new ArrayList(list.size() / 2);
        x.f(list, "<this>");
        int size2 = list.size() - 1;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                SemanticsNode semanticsNode2 = list.get(i2);
                if (i2 == 0 || !placedEntryRowOverlaps(arrayList, semanticsNode2)) {
                    arrayList.add(new k(semanticsNode2.getBoundsInWindow(), i.l(semanticsNode2)));
                }
                if (i2 == size2) {
                    break;
                }
                i2++;
            }
        }
        ArrayList arrayList2 = arrayList;
        i.t(arrayList2, TopBottomBoundsComparator.INSTANCE);
        ArrayList arrayList3 = new ArrayList();
        Comparator<SemanticsNode> comparator = semanticComparators[c2];
        int size3 = arrayList2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            k kVar = (k) arrayList2.get(i3);
            i.t((List) kVar.d(), comparator);
            arrayList3.addAll((Collection) kVar.d());
        }
        ArrayList arrayList4 = arrayList3;
        final p<SemanticsNode, SemanticsNode, Integer> pVar = UnmergedConfigComparator;
        i.t(arrayList4, new Comparator() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Number) pVar.invoke(obj, obj2)).intValue();
            }
        });
        while (true) {
            x.f(arrayList4, "<this>");
            if (size > arrayList4.size() - 1) {
                return arrayList4;
            }
            List<SemanticsNode> list2 = intObjectMap.get(((SemanticsNode) arrayList3.get(size)).getId());
            if (list2 != null) {
                if (lVar.invoke(arrayList3.get(size)).booleanValue()) {
                    size++;
                } else {
                    arrayList3.remove(size);
                }
                arrayList3.addAll(size, list2);
                size += list2.size();
            } else {
                size++;
            }
        }
    }

    public static /* synthetic */ List sortByGeometryGroupings$default(SemanticsNode semanticsNode, List list, l lVar, IntObjectMap intObjectMap, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            intObjectMap = IntObjectMapKt.intObjectMapOf();
        }
        return sortByGeometryGroupings(semanticsNode, list, lVar, intObjectMap);
    }

    public static final List<SemanticsNode> subtreeSortedByGeometryGrouping(SemanticsNode semanticsNode, l<? super SemanticsNode, Boolean> lVar, l<? super SemanticsNode, Boolean> lVar2, List<SemanticsNode> list) {
        MutableIntObjectMap mutableIntObjectMapMutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            geometryDepthFirstSearch(list.get(i2), arrayList, lVar, lVar2, mutableIntObjectMapMutableIntObjectMapOf);
        }
        return sortByGeometryGroupings(semanticsNode, arrayList, lVar2, mutableIntObjectMapMutableIntObjectMapOf);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.semantics.SemanticsSortKt$sortByGeometryGroupings$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<SemanticsNode, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // h.g.a.l
        public final Boolean invoke(SemanticsNode semanticsNode) {
            return false;
        }
    }
}
