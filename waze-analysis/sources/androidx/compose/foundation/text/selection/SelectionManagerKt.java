package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import h.i;
import h.k;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectionManagerKt {
    private static final Rect invertedInfiniteRect = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m3897calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager selectionManager, long j2) {
        Selection selection = selectionManager.getSelection();
        if (selection == null) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = selectionManager.getDraggingHandle();
        if (draggingHandle == null) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        int iOrdinal = draggingHandle.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalStateException("SelectionContainer does not support cursor");
        }
        if (iOrdinal == 1) {
            return m3899getMagnifierCenterJVtK1S4(selectionManager, j2, selection.getStart());
        }
        if (iOrdinal == 2) {
            return m3899getMagnifierCenterJVtK1S4(selectionManager, j2, selection.getEnd());
        }
        throw new i();
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m3898containsInclusiveUv8p0NA(Rect rect, long j2) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        if (left > fIntBitsToFloat || fIntBitsToFloat > right) {
            return false;
        }
        float top = rect.getTop();
        float bottom = rect.getBottom();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return top <= fIntBitsToFloat2 && fIntBitsToFloat2 <= bottom;
    }

    public static final l<ContextMenuScope, ab> contextMenuBuilder(final SelectionManager selectionManager, final ContextMenuState contextMenuState) {
        return new l() { // from class: androidx.compose.foundation.text.selection.SelectionManagerKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SelectionManagerKt.contextMenuBuilder$lambda$0(selectionManager, contextMenuState, (ContextMenuScope) obj);
            }
        };
    }

    static final ab contextMenuBuilder$lambda$0(final SelectionManager selectionManager, ContextMenuState contextMenuState, ContextMenuScope contextMenuScope) {
        contextMenuBuilder$lambda$0$selectionItem(contextMenuScope, contextMenuState, TextContextMenuItems.Copy, selectionManager.isNonEmptySelection$foundation(), new a() { // from class: androidx.compose.foundation.text.selection.SelectionManagerKt$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return SelectionManagerKt.contextMenuBuilder$lambda$0$0(selectionManager);
            }
        });
        ab abVar = ab.f48028a;
        contextMenuBuilder$lambda$0$selectionItem(contextMenuScope, contextMenuState, TextContextMenuItems.SelectAll, !selectionManager.isEntireContainerSelected$foundation(), new a() { // from class: androidx.compose.foundation.text.selection.SelectionManagerKt$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return SelectionManagerKt.contextMenuBuilder$lambda$0$1(selectionManager);
            }
        });
        h.a.i.i(abVar, abVar);
        return abVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab contextMenuBuilder$lambda$0$0(SelectionManager selectionManager) {
        selectionManager.copy$foundation();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab contextMenuBuilder$lambda$0$1(SelectionManager selectionManager) {
        selectionManager.selectAll$foundation();
        return ab.f48028a;
    }

    private static final void contextMenuBuilder$lambda$0$selectionItem(ContextMenuScope contextMenuScope, ContextMenuState contextMenuState, TextContextMenuItems textContextMenuItems, boolean z, a<ab> aVar) {
        if (z) {
            ContextMenuScope.item$default(contextMenuScope, new CommonContextMenuAreaKt.AnonymousClass1(textContextMenuItems), null, false, null, new CommonContextMenuAreaKt.AnonymousClass2(aVar, contextMenuState), 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> firstAndLast(List<? extends T> list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : h.a.i.i(h.a.i.P(list), h.a.i.T(list));
    }

    /* renamed from: getMagnifierCenter-JVtK1S4, reason: not valid java name */
    private static final long m3899getMagnifierCenterJVtK1S4(SelectionManager selectionManager, long j2, Selection.AnchorInfo anchorInfo) {
        float fG;
        Selectable anchorSelectable$foundation = selectionManager.getAnchorSelectable$foundation(anchorInfo);
        if (anchorSelectable$foundation == null) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates();
        if (containerLayoutCoordinates == null) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates layoutCoordinates = anchorSelectable$foundation.getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        int offset = anchorInfo.getOffset();
        if (offset > anchorSelectable$foundation.getLastVisibleOffset()) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        Offset offsetM3887getCurrentDragPosition_m7T9E = selectionManager.m3887getCurrentDragPosition_m7T9E();
        x.c(offsetM3887getCurrentDragPosition_m7T9E);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates.mo9744localPositionOfR5De75A(containerLayoutCoordinates, offsetM3887getCurrentDragPosition_m7T9E.m7990unboximpl()) >> 32));
        long jMo3846getRangeOfLineContainingjx7JFs = anchorSelectable$foundation.mo3846getRangeOfLineContainingjx7JFs(offset);
        if (TextRange.m10540getCollapsedimpl(jMo3846getRangeOfLineContainingjx7JFs)) {
            fG = anchorSelectable$foundation.getLineLeft(offset);
        } else {
            float lineLeft = anchorSelectable$foundation.getLineLeft(TextRange.m10546getStartimpl(jMo3846getRangeOfLineContainingjx7JFs));
            float lineRight = anchorSelectable$foundation.getLineRight(TextRange.m10541getEndimpl(jMo3846getRangeOfLineContainingjx7JFs) - 1);
            fG = n.g(fIntBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        }
        if (fG == -1.0f) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        if (!IntSize.m11337equalsimpl0(j2, IntSize.Companion.m11344getZeroYbymL2g()) && Math.abs(fIntBitsToFloat - fG) > ((int) (j2 >> 32)) / 2) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        if (anchorSelectable$foundation.getCenterYForOffset(offset) == -1.0f) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        return containerLayoutCoordinates.mo9744localPositionOfR5De75A(layoutCoordinates, (Float.floatToRawIntBits(fG) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(r9)));
    }

    public static final Rect getSelectedRegionRect(List<? extends k<? extends Selectable, Selection>> list, LayoutCoordinates layoutCoordinates) {
        int i2;
        LayoutCoordinates layoutCoordinates2;
        int[] iArr;
        List<? extends k<? extends Selectable, Selection>> list2 = list;
        if (list2.isEmpty()) {
            return invertedInfiniteRect;
        }
        Rect rect = invertedInfiniteRect;
        float fComponent1 = rect.component1();
        float fComponent2 = rect.component2();
        float fComponent3 = rect.component3();
        float fComponent4 = rect.component4();
        int size = list2.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            k<? extends Selectable, Selection> kVar = list2.get(i4);
            Selectable selectable = (Selectable) kVar.a();
            Selection selection = (Selection) kVar.b();
            int offset = selection.getStart().getOffset();
            int offset2 = selection.getEnd().getOffset();
            if (offset == offset2 || (layoutCoordinates2 = selectable.getLayoutCoordinates()) == null) {
                i2 = size;
            } else {
                int iMin = Math.min(offset, offset2);
                int iMax = Math.max(offset, offset2) - 1;
                if (iMin == iMax) {
                    iArr = new int[1];
                    iArr[i3] = iMin;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[i3] = iMin;
                    iArr2[1] = iMax;
                    iArr = iArr2;
                }
                Rect rect2 = invertedInfiniteRect;
                float fComponent12 = rect2.component1();
                float fComponent22 = rect2.component2();
                float fComponent32 = rect2.component3();
                float fComponent42 = rect2.component4();
                while (i3 < iArr.length) {
                    Rect boundingBox = selectable.getBoundingBox(iArr[i3]);
                    fComponent12 = Math.min(fComponent12, boundingBox.getLeft());
                    fComponent22 = Math.min(fComponent22, boundingBox.getTop());
                    fComponent32 = Math.max(fComponent32, boundingBox.getRight());
                    fComponent42 = Math.max(fComponent42, boundingBox.getBottom());
                    i3++;
                }
                long jFloatToRawIntBits = Float.floatToRawIntBits(fComponent12);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fComponent22);
                int iFloatToRawIntBits = Float.floatToRawIntBits(fComponent32);
                i2 = size;
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(fComponent42);
                long jMo9744localPositionOfR5De75A = layoutCoordinates.mo9744localPositionOfR5De75A(layoutCoordinates2, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                long jMo9744localPositionOfR5De75A2 = layoutCoordinates.mo9744localPositionOfR5De75A(layoutCoordinates2, (jFloatToRawIntBits3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (iFloatToRawIntBits << 32));
                fComponent1 = Math.min(fComponent1, Float.intBitsToFloat((int) (jMo9744localPositionOfR5De75A >> 32)));
                fComponent2 = Math.min(fComponent2, Float.intBitsToFloat((int) (jMo9744localPositionOfR5De75A & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
                float fMax = Math.max(fComponent3, Float.intBitsToFloat((int) (jMo9744localPositionOfR5De75A2 >> 32)));
                fComponent4 = Math.max(fComponent4, Float.intBitsToFloat((int) (jMo9744localPositionOfR5De75A2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
                fComponent3 = fMax;
            }
            i4++;
            list2 = list;
            size = i2;
            i3 = 0;
        }
        return new Rect(fComponent1, fComponent2, fComponent3, fComponent4);
    }

    public static final Selection merge(Selection selection, Selection selection2) {
        return selection != null ? selection.merge(selection2) : selection2;
    }

    public static final Rect visibleBounds(LayoutCoordinates layoutCoordinates) {
        Rect rectBoundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates, 1 == ((false ? 1 : 0) | (1 & 1)));
        return RectKt.m8018Rect0a9Yr6o(layoutCoordinates.mo9752windowToLocalMKHz9U(rectBoundsInWindow.m8015getTopLeftF1C5BW0()), layoutCoordinates.mo9752windowToLocalMKHz9U(rectBoundsInWindow.m8009getBottomRightF1C5BW0()));
    }
}
