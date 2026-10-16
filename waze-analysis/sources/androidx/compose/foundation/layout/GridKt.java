package androidx.compose.foundation.layout;

import androidx.collection.LongList;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.compose.foundation.layout.GridTrackSize;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.g.b.x;
import h.k.j;
import h.k.n;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GridKt {
    private static final Comparator<GridItem> GridItemsComparator = new Comparator() { // from class: androidx.compose.foundation.layout.GridKt$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return GridKt.GridItemsComparator$lambda$0((GridItem) obj, (GridItem) obj2);
        }
    };

    public static final void Grid(l<? super GridConfigurationScope, ab> lVar, Modifier modifier, q<? super GridScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i2 & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new GridMeasurePolicy(stateRememberUpdatedState);
            composer.updateRememberedValue(objRememberedValue);
        }
        GridMeasurePolicy gridMeasurePolicy = (GridMeasurePolicy) objRememberedValue;
        int iM = GridKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Updater.m7351setimpl(composer, gridMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
        Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
        Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
        qVar.invoke(GridScopeInstance.INSTANCE, composer, Integer.valueOf(((i2 >> 3) & 112) | 6));
        composer.endNode();
    }

    static final int GridItemsComparator$lambda$0(GridItem gridItem, GridItem gridItem2) {
        int iA = x.a(gridItem.getRow(), gridItem2.getRow());
        return iA != 0 ? iA : x.a(gridItem.getColumn(), gridItem2.getColumn());
    }

    /* renamed from: calculateColumnWidths-O3s9Psw, reason: not valid java name */
    private static final int m2678calculateColumnWidthsO3s9Psw(Density density, LongList longList, int i2, int i3, int[] iArr, MutableObjectList<GridItem>[] mutableObjectListArr, long j2, MutableObjectList<GridItem> mutableObjectList, int i4) {
        int i5;
        int iMo2121roundToPx0680j_4;
        int i6 = 0;
        if (i2 == 0) {
            return 0;
        }
        int i7 = (i2 - 1) * i4;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = Integer.MAX_VALUE;
        if (i3 == Integer.MAX_VALUE) {
            i5 = Integer.MAX_VALUE;
        } else {
            int i9 = i3 - i7;
            i5 = i9 < 0 ? 0 : i9;
        }
        MutableIntList mutableIntList = new MutableIntList(0, 1, null);
        int[] iArr2 = new int[i2];
        float fM2690getValueimpl$foundation_layout = 0.0f;
        while (i6 < i2) {
            long jM2701getAutoeyNpfc4 = i6 < longList._size ? longList.get(i6) : GridTrackSize.Companion.m2701getAutoeyNpfc4();
            GridTrackSize.Companion companion = GridTrackSize.Companion;
            switch (GridTrackSize.m2689getTypeimpl$foundation_layout(jM2701getAutoeyNpfc4)) {
                case 1:
                    iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(GridTrackSize.m2690getValueimpl$foundation_layout(jM2701getAutoeyNpfc4));
                    break;
                case 2:
                    if (i5 == Integer.MAX_VALUE) {
                        iMo2121roundToPx0680j_4 = calculateMaxIntrinsicWidth(mutableObjectListArr[i6]);
                        break;
                    } else {
                        iMo2121roundToPx0680j_4 = h.h.a.b(GridTrackSize.m2690getValueimpl$foundation_layout(jM2701getAutoeyNpfc4) * i5);
                        break;
                    }
                case 3:
                    fM2690getValueimpl$foundation_layout += GridTrackSize.m2690getValueimpl$foundation_layout(jM2701getAutoeyNpfc4);
                    iMo2121roundToPx0680j_4 = calculateMinIntrinsicWidth(mutableObjectListArr[i6]);
                    break;
                case 4:
                    iMo2121roundToPx0680j_4 = calculateMinIntrinsicWidth(mutableObjectListArr[i6]);
                    break;
                case 5:
                    iMo2121roundToPx0680j_4 = calculateMaxIntrinsicWidth(mutableObjectListArr[i6]);
                    break;
                case 6:
                    if (i5 != Integer.MAX_VALUE) {
                        long jCalculateMinMaxIntrinsicWidth = calculateMinMaxIntrinsicWidth(mutableObjectListArr[i6]);
                        long j3 = jCalculateMinMaxIntrinsicWidth >>> 32;
                        long j4 = jCalculateMinMaxIntrinsicWidth & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                        mutableIntList.add(i6);
                        iArr2[i6] = (int) j3;
                        iMo2121roundToPx0680j_4 = (int) j4;
                        break;
                    } else {
                        iMo2121roundToPx0680j_4 = calculateMaxIntrinsicWidth(mutableObjectListArr[i6]);
                        break;
                    }
                case 7:
                    fM2690getValueimpl$foundation_layout += GridTrackSize.m2687getMaxValueimpl$foundation_layout(jM2701getAutoeyNpfc4);
                    iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(GridTrackSize.m2688getMinValueimpl$foundation_layout(jM2701getAutoeyNpfc4));
                    break;
                default:
                    iMo2121roundToPx0680j_4 = calculateMaxIntrinsicWidth(mutableObjectListArr[i6]);
                    break;
            }
            iArr[i6] = iMo2121roundToPx0680j_4;
            i6++;
        }
        m2681distributeSpanningSpace7Fe8Tnw(longList, iArr, mutableObjectList, false, j2, null, i4, 0);
        if (i5 != Integer.MAX_VALUE) {
            if (mutableIntList._size != 0) {
                expandAutoTracks(mutableIntList, iArr, iArr2, i5);
            }
            i8 = i5;
        }
        return distributeFlexSpaceAndGetTotal(iArr, i8, fM2690getValueimpl$foundation_layout, i2, longList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateGridTrackSizes-cMe430U, reason: not valid java name */
    public static final GridTrackSizes m2679calculateGridTrackSizescMe430U(Density density, MutableObjectList<GridItem> mutableObjectList, LongList longList, LongList longList2, int i2, int i3, long j2, float f2, float f3) {
        int iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(f2);
        int iMo2121roundToPx0680j_42 = density.mo2121roundToPx0680j_4(f3);
        MutableObjectList[] mutableObjectListArr = new MutableObjectList[i2];
        MutableObjectList[] mutableObjectListArr2 = new MutableObjectList[i3];
        MutableObjectList<GridItem> mutableObjectList2 = mutableObjectList;
        Object[] objArr = mutableObjectList2.content;
        int i4 = mutableObjectList2._size;
        for (int i5 = 0; i5 < i4; i5++) {
            GridItem gridItem = (GridItem) objArr[i5];
            if (gridItem.getColumn() < i2) {
                MutableObjectList mutableObjectList3 = mutableObjectListArr[gridItem.getColumn()];
                if (mutableObjectList3 == null) {
                    mutableObjectList3 = new MutableObjectList(0, 1, null);
                    mutableObjectListArr[gridItem.getColumn()] = mutableObjectList3;
                }
                mutableObjectList3.add(gridItem);
            }
            if (gridItem.getRow() < i3) {
                MutableObjectList mutableObjectList4 = mutableObjectListArr2[gridItem.getRow()];
                if (mutableObjectList4 == null) {
                    mutableObjectList4 = new MutableObjectList(0, 1, null);
                    mutableObjectListArr2[gridItem.getRow()] = mutableObjectList4;
                }
                mutableObjectList4.add(gridItem);
            }
        }
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i3];
        return new GridTrackSizes(iArr, iArr2, m2678calculateColumnWidthsO3s9Psw(density, longList, i2, Constraints.m11107getMaxWidthimpl(j2), iArr, mutableObjectListArr, j2, mutableObjectList, iMo2121roundToPx0680j_4) + (Math.max(0, i2 - 1) * iMo2121roundToPx0680j_4), m2680calculateRowHeightsG0elyg(density, longList2, i3, Constraints.m11106getMaxHeightimpl(j2), iArr2, mutableObjectListArr2, j2, iArr, mutableObjectList, iMo2121roundToPx0680j_42, iMo2121roundToPx0680j_4) + (Math.max(0, i3 - 1) * iMo2121roundToPx0680j_42), iMo2121roundToPx0680j_4, iMo2121roundToPx0680j_42);
    }

    private static final int calculateMaxIntrinsicHeight(MutableObjectList<GridItem> mutableObjectList, int[] iArr, int i2, int i3) {
        if (mutableObjectList == null) {
            return 0;
        }
        MutableObjectList<GridItem> mutableObjectList2 = mutableObjectList;
        Object[] objArr = mutableObjectList2.content;
        int i4 = mutableObjectList2._size;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            GridItem gridItem = (GridItem) objArr[i6];
            if (gridItem.getRowSpan() == 1) {
                int iMaxIntrinsicHeight = gridItem.getMeasurable().maxIntrinsicHeight(getSpannedWidth(gridItem, iArr, i2, i3));
                if (iMaxIntrinsicHeight > i5) {
                    i5 = iMaxIntrinsicHeight;
                }
            }
        }
        return i5;
    }

    private static final int calculateMaxIntrinsicWidth(MutableObjectList<GridItem> mutableObjectList) {
        int iMaxIntrinsicWidth;
        if (mutableObjectList == null) {
            return 0;
        }
        MutableObjectList<GridItem> mutableObjectList2 = mutableObjectList;
        Object[] objArr = mutableObjectList2.content;
        int i2 = mutableObjectList2._size;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            GridItem gridItem = (GridItem) objArr[i4];
            if (gridItem.getColumnSpan() == 1 && (iMaxIntrinsicWidth = gridItem.getMeasurable().maxIntrinsicWidth(Integer.MAX_VALUE)) > i3) {
                i3 = iMaxIntrinsicWidth;
            }
        }
        return i3;
    }

    private static final int calculateMinIntrinsicHeight(MutableObjectList<GridItem> mutableObjectList, int[] iArr, int i2, int i3) {
        if (mutableObjectList == null) {
            return 0;
        }
        MutableObjectList<GridItem> mutableObjectList2 = mutableObjectList;
        Object[] objArr = mutableObjectList2.content;
        int i4 = mutableObjectList2._size;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            GridItem gridItem = (GridItem) objArr[i6];
            if (gridItem.getRowSpan() == 1) {
                int iMinIntrinsicHeight = gridItem.getMeasurable().minIntrinsicHeight(getSpannedWidth(gridItem, iArr, i2, i3));
                if (iMinIntrinsicHeight > i5) {
                    i5 = iMinIntrinsicHeight;
                }
            }
        }
        return i5;
    }

    private static final int calculateMinIntrinsicWidth(MutableObjectList<GridItem> mutableObjectList) {
        int iMinIntrinsicWidth;
        if (mutableObjectList == null) {
            return 0;
        }
        MutableObjectList<GridItem> mutableObjectList2 = mutableObjectList;
        Object[] objArr = mutableObjectList2.content;
        int i2 = mutableObjectList2._size;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            GridItem gridItem = (GridItem) objArr[i4];
            if (gridItem.getColumnSpan() == 1 && (iMinIntrinsicWidth = gridItem.getMeasurable().minIntrinsicWidth(Integer.MAX_VALUE)) > i3) {
                i3 = iMinIntrinsicWidth;
            }
        }
        return i3;
    }

    private static final long calculateMinMaxIntrinsicHeight(MutableObjectList<GridItem> mutableObjectList, int[] iArr, int i2, int i3) {
        if (mutableObjectList == null) {
            return 0L;
        }
        MutableObjectList<GridItem> mutableObjectList2 = mutableObjectList;
        Object[] objArr = mutableObjectList2.content;
        int i4 = mutableObjectList2._size;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            GridItem gridItem = (GridItem) objArr[i7];
            if (gridItem.getRowSpan() == 1) {
                int spannedWidth = getSpannedWidth(gridItem, iArr, i2, i3);
                int iMinIntrinsicHeight = gridItem.getMeasurable().minIntrinsicHeight(spannedWidth);
                int iMaxIntrinsicHeight = gridItem.getMeasurable().maxIntrinsicHeight(spannedWidth);
                if (iMinIntrinsicHeight > i6) {
                    i6 = iMinIntrinsicHeight;
                }
                if (iMaxIntrinsicHeight > i5) {
                    i5 = iMaxIntrinsicHeight;
                }
            }
        }
        return (i5 << 32) | i6;
    }

    private static final long calculateMinMaxIntrinsicWidth(MutableObjectList<GridItem> mutableObjectList) {
        if (mutableObjectList == null) {
            return 0L;
        }
        MutableObjectList<GridItem> mutableObjectList2 = mutableObjectList;
        Object[] objArr = mutableObjectList2.content;
        int i2 = mutableObjectList2._size;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            GridItem gridItem = (GridItem) objArr[i5];
            if (gridItem.getColumnSpan() == 1) {
                int iMinIntrinsicWidth = gridItem.getMeasurable().minIntrinsicWidth(Integer.MAX_VALUE);
                int iMaxIntrinsicWidth = gridItem.getMeasurable().maxIntrinsicWidth(Integer.MAX_VALUE);
                if (iMinIntrinsicWidth > i4) {
                    i4 = iMinIntrinsicWidth;
                }
                if (iMaxIntrinsicWidth > i3) {
                    i3 = iMaxIntrinsicWidth;
                }
            }
        }
        return (i3 << 32) | i4;
    }

    /* renamed from: calculateRowHeights-G-0elyg, reason: not valid java name */
    private static final int m2680calculateRowHeightsG0elyg(Density density, LongList longList, int i2, int i3, int[] iArr, MutableObjectList<GridItem>[] mutableObjectListArr, long j2, int[] iArr2, MutableObjectList<GridItem> mutableObjectList, int i4, int i5) {
        int i6;
        int i7;
        int iMo2121roundToPx0680j_4;
        int i8;
        int i9 = 0;
        if (i2 == 0) {
            return 0;
        }
        int i10 = (i2 - 1) * i4;
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = Integer.MAX_VALUE;
        if (i3 == Integer.MAX_VALUE) {
            i6 = Integer.MAX_VALUE;
        } else {
            int i12 = i3 - i10;
            i6 = i12 < 0 ? 0 : i12;
        }
        MutableIntList mutableIntList = new MutableIntList(0, 1, null);
        int[] iArr3 = new int[i2];
        float fM2690getValueimpl$foundation_layout = 0.0f;
        while (i9 < i2) {
            long jM2701getAutoeyNpfc4 = i9 < longList._size ? longList.get(i9) : GridTrackSize.Companion.m2701getAutoeyNpfc4();
            GridTrackSize.Companion companion = GridTrackSize.Companion;
            switch (GridTrackSize.m2689getTypeimpl$foundation_layout(jM2701getAutoeyNpfc4)) {
                case 1:
                    i7 = i6;
                    iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(GridTrackSize.m2690getValueimpl$foundation_layout(jM2701getAutoeyNpfc4));
                    break;
                case 2:
                    int i13 = i11;
                    i7 = i6;
                    if (i7 == i13) {
                        iMo2121roundToPx0680j_4 = calculateMaxIntrinsicHeight(mutableObjectListArr[i9], iArr2, Constraints.m11107getMaxWidthimpl(j2), i5);
                        break;
                    } else {
                        iMo2121roundToPx0680j_4 = h.h.a.b(GridTrackSize.m2690getValueimpl$foundation_layout(jM2701getAutoeyNpfc4) * i7);
                        break;
                    }
                case 3:
                    i8 = i6;
                    fM2690getValueimpl$foundation_layout += GridTrackSize.m2690getValueimpl$foundation_layout(jM2701getAutoeyNpfc4);
                    iMo2121roundToPx0680j_4 = calculateMinIntrinsicHeight(mutableObjectListArr[i9], iArr2, Constraints.m11107getMaxWidthimpl(j2), i5);
                    i7 = i8;
                    break;
                case 4:
                    i8 = i6;
                    iMo2121roundToPx0680j_4 = calculateMinIntrinsicHeight(mutableObjectListArr[i9], iArr2, Constraints.m11107getMaxWidthimpl(j2), i5);
                    i7 = i8;
                    break;
                case 5:
                    i8 = i6;
                    iMo2121roundToPx0680j_4 = calculateMaxIntrinsicHeight(mutableObjectListArr[i9], iArr2, Constraints.m11107getMaxWidthimpl(j2), i5);
                    i7 = i8;
                    break;
                case 6:
                    if (i6 != i11) {
                        long jCalculateMinMaxIntrinsicHeight = calculateMinMaxIntrinsicHeight(mutableObjectListArr[i9], iArr2, Constraints.m11107getMaxWidthimpl(j2), i5);
                        i8 = i6;
                        long j3 = jCalculateMinMaxIntrinsicHeight >>> 32;
                        long j4 = jCalculateMinMaxIntrinsicHeight & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                        mutableIntList.add(i9);
                        iArr3[i9] = (int) j3;
                        iMo2121roundToPx0680j_4 = (int) j4;
                        i7 = i8;
                        break;
                    } else {
                        iMo2121roundToPx0680j_4 = calculateMaxIntrinsicHeight(mutableObjectListArr[i9], iArr2, Constraints.m11107getMaxWidthimpl(j2), i5);
                        i7 = i6;
                        break;
                    }
                case 7:
                    fM2690getValueimpl$foundation_layout += GridTrackSize.m2687getMaxValueimpl$foundation_layout(jM2701getAutoeyNpfc4);
                    iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(GridTrackSize.m2688getMinValueimpl$foundation_layout(jM2701getAutoeyNpfc4));
                    i7 = i6;
                    break;
                default:
                    i7 = i6;
                    iMo2121roundToPx0680j_4 = calculateMaxIntrinsicHeight(mutableObjectListArr[i9], iArr2, Constraints.m11107getMaxWidthimpl(j2), i5);
                    break;
            }
            iArr[i9] = iMo2121roundToPx0680j_4;
            i9++;
            i6 = i7;
            i11 = Integer.MAX_VALUE;
        }
        int i14 = i6;
        m2681distributeSpanningSpace7Fe8Tnw(longList, iArr, mutableObjectList, true, j2, iArr2, i4, i5);
        if (i14 == Integer.MAX_VALUE) {
            i14 = Integer.MAX_VALUE;
        } else if (mutableIntList._size != 0) {
            expandAutoTracks(mutableIntList, iArr, iArr3, i14);
        }
        return distributeFlexSpaceAndGetTotal(iArr, i14, fM2690getValueimpl$foundation_layout, i2, longList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] calculateTrackOffsets(int[] iArr, int i2) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            iArr2[i4] = i3;
            i3 += iArr[i4] + i2;
        }
        return iArr2;
    }

    public static final void columns(GridConfigurationScope gridConfigurationScope, GridTrackSpec... gridTrackSpecArr) {
        for (GridTrackSpec gridTrackSpec : gridTrackSpecArr) {
            if (gridTrackSpec instanceof GridTrackSize) {
                gridConfigurationScope.mo2638column118E5d0(((GridTrackSize) gridTrackSpec).m2693unboximpl());
            }
        }
    }

    private static final int distributeFlexSpaceAndGetTotal(int[] iArr, int i2, float f2, int i3, LongList longList) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 : iArr) {
            i5 += i6;
        }
        int iMax = i2 == Integer.MAX_VALUE ? 0 : Math.max(0, i2 - i5);
        if (f2 > 0.0f && iMax > 0) {
            float f3 = 0.0f;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i7 < i3) {
                long jM2701getAutoeyNpfc4 = i7 < longList._size ? longList.get(i7) : GridTrackSize.Companion.m2701getAutoeyNpfc4();
                GridTrackSize.Companion companion = GridTrackSize.Companion;
                int iM2689getTypeimpl$foundation_layout = GridTrackSize.m2689getTypeimpl$foundation_layout(jM2701getAutoeyNpfc4);
                float fM2687getMaxValueimpl$foundation_layout = iM2689getTypeimpl$foundation_layout != 3 ? iM2689getTypeimpl$foundation_layout != 7 ? 0.0f : GridTrackSize.m2687getMaxValueimpl$foundation_layout(jM2701getAutoeyNpfc4) : GridTrackSize.m2690getValueimpl$foundation_layout(jM2701getAutoeyNpfc4);
                if (fM2687getMaxValueimpl$foundation_layout > 0.0f) {
                    f3 += fM2687getMaxValueimpl$foundation_layout;
                    int iMax2 = Math.max(0, h.h.a.b((f3 / f2) * iMax) - i9);
                    iArr[i7] = iArr[i7] + iMax2;
                    i8 = iMax2 + i9;
                    i9 = i8;
                }
                i7++;
            }
            i4 = i8;
        }
        return i5 + i4;
    }

    /* renamed from: distributeSpanningSpace-7Fe8Tnw, reason: not valid java name */
    private static final void m2681distributeSpanningSpace7Fe8Tnw(LongList longList, int[] iArr, MutableObjectList<GridItem> mutableObjectList, boolean z, long j2, int[] iArr2, int i2, int i3) {
        int i4;
        int iMaxIntrinsicWidth;
        int iM11107getMaxWidthimpl;
        MutableObjectList<GridItem> mutableObjectList2 = mutableObjectList;
        Object[] objArr = mutableObjectList2.content;
        int i5 = mutableObjectList2._size;
        for (int i6 = 0; i6 < i5; i6++) {
            GridItem gridItem = (GridItem) objArr[i6];
            int row = z ? gridItem.getRow() : gridItem.getColumn();
            int rowSpan = z ? gridItem.getRowSpan() : gridItem.getColumnSpan();
            if (rowSpan > 1) {
                int i7 = row + rowSpan;
                int length = iArr.length;
                if (i7 > length) {
                    i7 = length;
                }
                int i8 = row;
                int i9 = 0;
                int i10 = 0;
                while (i8 < i7) {
                    i9 += iArr[i8];
                    long jM2701getAutoeyNpfc4 = i8 < longList._size ? longList.get(i8) : GridTrackSize.Companion.m2701getAutoeyNpfc4();
                    GridTrackSize.Companion companion = GridTrackSize.Companion;
                    if (GridTrackSize.m2689getTypeimpl$foundation_layout(jM2701getAutoeyNpfc4) != 1 && GridTrackSize.m2689getTypeimpl$foundation_layout(jM2701getAutoeyNpfc4) != 2) {
                        i10++;
                    }
                    i8++;
                }
                int iMax = i9 + (Math.max(0, rowSpan - 1) * i2);
                if (z) {
                    if (iArr2 != null) {
                        int column = gridItem.getColumn();
                        int columnSpan = gridItem.getColumnSpan() + column;
                        int length2 = iArr2.length;
                        if (columnSpan > length2) {
                            columnSpan = length2;
                        }
                        int i11 = 0;
                        while (column < columnSpan) {
                            i11 += iArr2[column];
                            column++;
                        }
                        i4 = 0;
                        iM11107getMaxWidthimpl = i11 + (Math.max(0, gridItem.getColumnSpan() - 1) * i3);
                    } else {
                        i4 = 0;
                        iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
                    }
                    iMaxIntrinsicWidth = gridItem.getMeasurable().maxIntrinsicHeight(iM11107getMaxWidthimpl);
                } else {
                    i4 = 0;
                    iMaxIntrinsicWidth = gridItem.getMeasurable().maxIntrinsicWidth(Integer.MAX_VALUE);
                }
                int i12 = iMaxIntrinsicWidth - iMax;
                if (i12 > 0 && i10 > 0) {
                    int i13 = i12 / i10;
                    int i14 = i12 % i10;
                    while (row < i7) {
                        long jM2701getAutoeyNpfc42 = row < longList._size ? longList.get(row) : GridTrackSize.Companion.m2701getAutoeyNpfc4();
                        GridTrackSize.Companion companion2 = GridTrackSize.Companion;
                        if (GridTrackSize.m2689getTypeimpl$foundation_layout(jM2701getAutoeyNpfc42) != 1 && GridTrackSize.m2689getTypeimpl$foundation_layout(jM2701getAutoeyNpfc42) != 2) {
                            iArr[row] = iArr[row] + (i14 > 0 ? 1 : i4) + i13;
                            if (i14 > 0) {
                                i14--;
                            }
                        }
                        row++;
                    }
                }
            }
        }
    }

    private static final void expandAutoTracks(MutableIntList mutableIntList, int[] iArr, int[] iArr2, int i2) {
        MutableIntList mutableIntList2 = mutableIntList;
        if (mutableIntList2._size == 0) {
            return;
        }
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i2 - i3;
        if (i5 <= 0) {
            return;
        }
        int i6 = mutableIntList2._size;
        int[] iArr3 = new int[i6];
        int[] iArr4 = mutableIntList2.content;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = iArr4[i8];
            int iMax = Math.max(0, iArr2[i9] - iArr[i9]);
            iArr3[i8] = iMax;
            i7 += iMax;
        }
        if (i7 == 0) {
            return;
        }
        if (i5 >= i7) {
            j jVarU = n.u(0, mutableIntList2._size);
            int iA = jVarU.a();
            int iB = jVarU.b();
            if (iA > iB) {
                return;
            }
            while (true) {
                int i10 = mutableIntList.get(iA);
                iArr[i10] = iArr[i10] + iArr3[iA];
                if (iA == iB) {
                    return;
                } else {
                    iA++;
                }
            }
        } else {
            j jVarU2 = n.u(0, mutableIntList2._size);
            int iA2 = jVarU2.a();
            int iB2 = jVarU2.b();
            if (iA2 > iB2) {
                return;
            }
            while (true) {
                int i11 = mutableIntList.get(iA2);
                iArr[i11] = iArr[i11] + h.h.a.b((iArr3[iA2] / i7) * i5);
                if (iA2 == iB2) {
                    return;
                } else {
                    iA2++;
                }
            }
        }
    }

    private static final int getSpannedWidth(GridItem gridItem, int[] iArr, int i2, int i3) {
        int column = gridItem.getColumn();
        int length = iArr.length;
        if (column >= length) {
            return i2;
        }
        int columnSpan = gridItem.getColumnSpan() + column;
        if (columnSpan <= length) {
            length = columnSpan;
        }
        int i4 = 0;
        for (int i5 = column; i5 < length; i5++) {
            i4 += iArr[i5];
        }
        return i4 + (Math.max(0, (length - column) - 1) * i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void measureItems(MutableObjectList<GridItem> mutableObjectList, GridTrackSizes gridTrackSizes, LayoutDirection layoutDirection) {
        int length = gridTrackSizes.getRowHeights().length;
        int length2 = gridTrackSizes.getColumnWidths().length;
        MutableObjectList<GridItem> mutableObjectList2 = mutableObjectList;
        Object[] objArr = mutableObjectList2.content;
        int i2 = mutableObjectList2._size;
        for (int i3 = 0; i3 < i2; i3++) {
            GridItem gridItem = (GridItem) objArr[i3];
            int row = gridItem.getRow();
            int column = gridItem.getColumn();
            if (row < length && column < length2) {
                int columnSpan = gridItem.getColumnSpan() + column;
                if (columnSpan > length2) {
                    columnSpan = length2;
                }
                int columnGapPx = 0;
                for (int i4 = column; i4 < columnSpan; i4++) {
                    columnGapPx += gridTrackSizes.getColumnWidths()[i4];
                }
                int i5 = columnSpan - column;
                if (i5 > 1) {
                    columnGapPx += (i5 - 1) * gridTrackSizes.getColumnGapPx();
                }
                int i6 = columnGapPx;
                int rowSpan = gridItem.getRowSpan() + row;
                if (rowSpan > length) {
                    rowSpan = length;
                }
                int rowGapPx = 0;
                for (int i7 = row; i7 < rowSpan; i7++) {
                    rowGapPx += gridTrackSizes.getRowHeights()[i7];
                }
                int i8 = rowSpan - row;
                if (i8 > 1) {
                    rowGapPx += (i8 - 1) * gridTrackSizes.getRowGapPx();
                }
                int i9 = rowGapPx;
                Placeable placeableMo9741measureBRTryo0 = gridItem.getMeasurable().mo9741measureBRTryo0(ConstraintsKt.Constraints$default(0, i6, 0, i9, 5, null));
                long width = placeableMo9741measureBRTryo0.getWidth();
                long jMo7648alignKFBX0sM = gridItem.getAlignment().mo7648alignKFBX0sM((placeableMo9741measureBRTryo0.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (width << 32), (i6 << 32) | (i9 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), layoutDirection);
                gridItem.setPlaceable(placeableMo9741measureBRTryo0);
                gridItem.setOffsetX(IntOffset.m11296getXimpl(jMo7648alignKFBX0sM));
                gridItem.setOffsetY(IntOffset.m11297getYimpl(jMo7648alignKFBX0sM));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015a  */
    /* renamed from: resolveGridItemIndices-pclAfdo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.layout.ResolvedGridItemIndicesResult m2682resolveGridItemIndicespclAfdo(java.util.List<? extends androidx.compose.ui.layout.Measurable> r29, androidx.collection.LongList r30, androidx.collection.LongList r31, int r32) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.GridKt.m2682resolveGridItemIndicespclAfdo(java.util.List, androidx.collection.LongList, androidx.collection.LongList, int):androidx.compose.foundation.layout.ResolvedGridItemIndicesResult");
    }

    private static final boolean resolveGridItemIndices_pclAfdo$isAreaOccupied(MutableIntSet mutableIntSet, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i4 + i2;
        if (i7 > 1000 || (i6 = i5 + i3) > 1000) {
            return true;
        }
        while (i2 < i7) {
            for (int i8 = i3; i8 < i6; i8++) {
                if (mutableIntSet.contains(resolveGridItemIndices_pclAfdo$packCoordinate(i2, i8))) {
                    return true;
                }
            }
            i2++;
        }
        return false;
    }

    private static final void resolveGridItemIndices_pclAfdo$markAreaOccupied(MutableIntSet mutableIntSet, int i2, int i3, int i4, int i5) {
        for (int i6 = i2; i6 < i2 + i4; i6++) {
            int i7 = i3 + i5;
            for (int i8 = i3; i8 < i7; i8++) {
                mutableIntSet.add(resolveGridItemIndices_pclAfdo$packCoordinate(i6, i8));
            }
        }
    }

    private static final int resolveGridItemIndices_pclAfdo$packCoordinate(int i2, int i3) {
        return (i2 << 16) | ((char) i3);
    }

    private static final int resolveToZeroBasedIndex(int i2, int i3) {
        if (i2 != 0) {
            if (i2 > 0) {
                return i2 - 1;
            }
            int i4 = i3 + i2;
            if (i4 >= 0) {
                return i4;
            }
        }
        return -1;
    }

    public static final void rows(GridConfigurationScope gridConfigurationScope, GridTrackSpec... gridTrackSpecArr) {
        for (GridTrackSpec gridTrackSpec : gridTrackSpecArr) {
            if (gridTrackSpec instanceof GridTrackSize) {
                gridConfigurationScope.mo2650row118E5d0(((GridTrackSize) gridTrackSpec).m2693unboximpl());
            }
        }
    }

    private static final <T> void sortWith(MutableObjectList<T> mutableObjectList, Comparator<T> comparator) {
        int i2;
        int size = mutableObjectList.getSize();
        for (int i3 = 1; i3 < size; i3++) {
            T t = mutableObjectList.get(i3);
            int i4 = i3 - 1;
            while (true) {
                i2 = i4 + 1;
                if (i4 < 0 || comparator.compare(mutableObjectList.get(i4), t) <= 0) {
                    break;
                }
                mutableObjectList.set(i2, mutableObjectList.get(i4));
                i4--;
            }
            mutableObjectList.set(i2, t);
        }
    }
}
