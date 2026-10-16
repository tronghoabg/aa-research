package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {
    public static final int $stable = 0;
    private final LazyLayoutItemContentFactory itemContentFactory;
    private final LazyLayoutItemProvider itemProvider;
    private final SubcomposeMeasureScope subcomposeMeasureScope;
    private final MutableIntObjectMap<List<Placeable>> placeablesCache = IntObjectMapKt.mutableIntObjectMapOf();
    private final MutableIntObjectMap<List<Measurable>> measurablesCache = IntObjectMapKt.mutableIntObjectMapOf();

    public LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeMeasureScope subcomposeMeasureScope) {
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeMeasureScope = subcomposeMeasureScope;
        this.itemProvider = lazyLayoutItemContentFactory.getItemProvider().invoke();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    public List<Measurable> compose(int i2) {
        List<Measurable> list = this.measurablesCache.get(i2);
        if (list != null) {
            return list;
        }
        Object key = this.itemProvider.getKey(i2);
        List<Measurable> listSubcompose = this.subcomposeMeasureScope.subcompose(key, this.itemContentFactory.getContent(i2, key, this.itemProvider.getContentType(i2)));
        this.measurablesCache.set(i2, listSubcompose);
        return listSubcompose;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.subcomposeMeasureScope.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, l<? super Placeable.PlacementScope, ab> lVar) {
        return this.subcomposeMeasureScope.layout(i2, i3, map, lVar);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    /* renamed from: measure-0kLqBqw */
    public List<Placeable> mo2952measure0kLqBqw(int i2, long j2) {
        List<Placeable> list = this.placeablesCache.get(i2);
        if (list != null) {
            return list;
        }
        Object key = this.itemProvider.getKey(i2);
        List<Measurable> listSubcompose = this.subcomposeMeasureScope.subcompose(key, this.itemContentFactory.getContent(i2, key, this.itemProvider.getContentType(i2)));
        int size = listSubcompose.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(listSubcompose.get(i3).mo9741measureBRTryo0(j2));
        }
        ArrayList arrayList2 = arrayList;
        this.placeablesCache.set(i2, arrayList2);
        return arrayList2;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo2120roundToPxR2X_6o(long j2) {
        return this.subcomposeMeasureScope.mo2120roundToPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo2121roundToPx0680j_4(float f2) {
        return this.subcomposeMeasureScope.mo2121roundToPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo2122toDpGaN1DYA(long j2) {
        return this.subcomposeMeasureScope.mo2122toDpGaN1DYA(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo2123toDpu2uoSUM(float f2) {
        return this.subcomposeMeasureScope.mo2123toDpu2uoSUM(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo2125toDpSizekrfVVM(long j2) {
        return this.subcomposeMeasureScope.mo2125toDpSizekrfVVM(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo2126toPxR2X_6o(long j2) {
        return this.subcomposeMeasureScope.mo2126toPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo2127toPx0680j_4(float f2) {
        return this.subcomposeMeasureScope.mo2127toPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        return this.subcomposeMeasureScope.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo2128toSizeXkaWNTQ(long j2) {
        return this.subcomposeMeasureScope.mo2128toSizeXkaWNTQ(j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo2129toSp0xMU5do(float f2) {
        return this.subcomposeMeasureScope.mo2129toSp0xMU5do(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo2130toSpkPz2Gy4(float f2) {
        return this.subcomposeMeasureScope.mo2130toSpkPz2Gy4(f2);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, l<? super RulerScope, ab> lVar, l<? super Placeable.PlacementScope, ab> lVar2) {
        return this.subcomposeMeasureScope.layout(i2, i3, map, lVar, lVar2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo2124toDpu2uoSUM(int i2) {
        return this.subcomposeMeasureScope.mo2124toDpu2uoSUM(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo2131toSpkPz2Gy4(int i2) {
        return this.subcomposeMeasureScope.mo2131toSpkPz2Gy4(i2);
    }
}
