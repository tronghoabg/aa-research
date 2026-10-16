package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.ListUtilsKt;
import com.waze.gas.GasNativeManager;
import h.a.i;
import h.e;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.h.a;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TopAppBarMeasurePolicy implements MeasurePolicy {
    private final PaddingValues contentPadding;
    private final float height;
    private final FloatProducer scrolledOffset;
    private final int titleBottomPadding;
    private final Alignment.Horizontal titleHorizontalAlignment;
    private final Arrangement.Vertical titleVerticalArrangement;

    private TopAppBarMeasurePolicy(FloatProducer floatProducer, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i2, float f2, PaddingValues paddingValues) {
        this.scrolledOffset = floatProducer;
        this.titleVerticalArrangement = vertical;
        this.titleHorizontalAlignment = horizontal;
        this.titleBottomPadding = i2;
        this.height = f2;
        this.contentPadding = paddingValues;
    }

    /* renamed from: placeTopAppBar-LfZho9M, reason: not valid java name */
    private final MeasureResult m6091placeTopAppBarLfZho9M(MeasureScope measureScope, final long j2, int i2, final int i3, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final int i4, PaddingValues paddingValues) {
        int i5 = measureScope.mo2121roundToPx0680j_4(paddingValues.mo2707calculateTopPaddingD9Ej5fM());
        int i6 = measureScope.mo2121roundToPx0680j_4(paddingValues.mo2704calculateBottomPaddingD9Ej5fM());
        final int i7 = measureScope.mo2121roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, measureScope.getLayoutDirection()));
        final int i8 = measureScope.mo2121roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, measureScope.getLayoutDirection()));
        final int i9 = (i2 + i5) - i6;
        return MeasureScope.CC.layout$default(measureScope, Constraints.m11107getMaxWidthimpl(j2), i2, null, new l() { // from class: androidx.compose.material3.TopAppBarMeasurePolicy$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TopAppBarMeasurePolicy.placeTopAppBar_LfZho9M$lambda$0(placeable, i7, i9, placeable2, placeable3, j2, i8, this, i4, i3, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final h.ab placeTopAppBar_LfZho9M$lambda$0(androidx.compose.ui.layout.Placeable r10, int r11, int r12, androidx.compose.ui.layout.Placeable r13, androidx.compose.ui.layout.Placeable r14, long r15, int r17, androidx.compose.material3.TopAppBarMeasurePolicy r18, int r19, int r20, androidx.compose.ui.layout.Placeable.PlacementScope r21) {
        /*
            r0 = r18
            r1 = r20
            int r2 = r10.getHeight()
            int r2 = r12 - r2
            int r6 = r2 / 2
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r10
            r5 = r11
            r3 = r21
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(r3, r4, r5, r6, r7, r8, r9)
            float r2 = androidx.compose.material3.AppBarKt.access$getTopAppBarTitleInset$p()
            int r2 = r3.mo2121roundToPx0680j_4(r2)
            int r10 = r10.getWidth()
            int r10 = java.lang.Math.max(r2, r10)
            int r2 = r14.getWidth()
            androidx.compose.ui.Alignment$Horizontal r4 = r0.titleHorizontalAlignment
            int r5 = r13.getWidth()
            int r6 = androidx.compose.ui.unit.Constraints.m11107getMaxWidthimpl(r15)
            androidx.compose.ui.unit.LayoutDirection r7 = androidx.compose.ui.unit.LayoutDirection.Ltr
            int r4 = r4.align(r5, r6, r7)
            if (r4 >= r10) goto L41
            int r10 = r10 - r4
        L3d:
            int r11 = r11 + r10
            int r4 = r4 + r11
        L3f:
            r2 = r4
            goto L59
        L41:
            int r10 = r13.getWidth()
            int r10 = r10 + r4
            int r5 = androidx.compose.ui.unit.Constraints.m11107getMaxWidthimpl(r15)
            int r5 = r5 - r2
            if (r10 <= r5) goto L3f
            int r10 = androidx.compose.ui.unit.Constraints.m11107getMaxWidthimpl(r15)
            int r10 = r10 - r2
            int r2 = r13.getWidth()
            int r2 = r2 + r4
            int r10 = r10 - r2
            goto L3d
        L59:
            androidx.compose.foundation.layout.Arrangement$Vertical r10 = r0.titleVerticalArrangement
            androidx.compose.foundation.layout.Arrangement r11 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r11 = r11.getCenter()
            boolean r11 = h.g.b.x.n(r10, r11)
            if (r11 == 0) goto L70
            int r10 = r13.getHeight()
            int r10 = r12 - r10
            int r10 = r10 / 2
            goto La6
        L70:
            androidx.compose.foundation.layout.Arrangement r11 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Vertical r11 = r11.getBottom()
            boolean r10 = h.g.b.x.n(r10, r11)
            r11 = 0
            if (r10 == 0) goto La5
            int r10 = r0.titleBottomPadding
            if (r10 != 0) goto L88
            int r10 = r13.getHeight()
            int r10 = r12 - r10
            goto La6
        L88:
            int r0 = r13.getHeight()
            int r0 = r0 - r19
            int r4 = r13.getHeight()
            int r10 = r10 - r0
            int r4 = r4 + r10
            if (r4 <= r1) goto L98
            int r4 = r4 - r1
            int r10 = r10 - r4
        L98:
            int r0 = r13.getHeight()
            int r0 = r12 - r0
            int r10 = java.lang.Math.max(r11, r10)
            int r10 = r0 - r10
            goto La6
        La5:
            r10 = r11
        La6:
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r13
            r0 = r3
            r3 = r10
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(r0, r1, r2, r3, r4, r5, r6)
            int r10 = androidx.compose.ui.unit.Constraints.m11107getMaxWidthimpl(r15)
            int r11 = r14.getWidth()
            int r10 = r10 - r11
            int r2 = r10 - r17
            int r10 = r14.getHeight()
            int r12 = r12 - r10
            int r3 = r12 / 2
            r1 = r14
            r0 = r21
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(r0, r1, r2, r3, r4, r5, r6)
            h.ab r10 = h.ab.f48028a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TopAppBarMeasurePolicy.placeTopAppBar_LfZho9M$lambda$0(androidx.compose.ui.layout.Placeable, int, int, androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Placeable, long, int, androidx.compose.material3.TopAppBarMeasurePolicy, int, int, androidx.compose.ui.layout.Placeable$PlacementScope):h.ab");
    }

    public final PaddingValues getContentPadding() {
        return this.contentPadding;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m6092getHeightD9Ej5fM() {
        return this.height;
    }

    public final FloatProducer getScrolledOffset() {
        return this.scrolledOffset;
    }

    public final int getTitleBottomPadding() {
        return this.titleBottomPadding;
    }

    public final Alignment.Horizontal getTitleHorizontalAlignment() {
        return this.titleHorizontalAlignment;
    }

    public final Arrangement.Vertical getTitleVerticalArrangement() {
        return this.titleVerticalArrangement;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        Integer numValueOf;
        int i3 = intrinsicMeasureScope.mo2121roundToPx0680j_4(this.height);
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).maxIntrinsicHeight(i2));
            int iE = i.e(list);
            if (iE > 0) {
                int i4 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i4).maxIntrinsicHeight(i2));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i4 == iE) {
                        break;
                    }
                    i4++;
                }
            }
        }
        Integer num = numValueOf;
        return Math.max(i3, num != null ? num.intValue() : 0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        int size = list.size();
        int iMaxIntrinsicWidth = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iMaxIntrinsicWidth += list.get(i3).maxIntrinsicWidth(i2);
        }
        return iMaxIntrinsicWidth;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        int iH;
        int i2;
        TopAppBarMeasurePolicy topAppBarMeasurePolicy = this;
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i3 = 0;
        while (i3 < size) {
            Measurable measurable = list.get(i3);
            if (x.n(LayoutIdKt.getLayoutId(measurable), "navigationIcon")) {
                Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null));
                int size2 = list2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Measurable measurable2 = list.get(i4);
                    if (x.n(LayoutIdKt.getLayoutId(measurable2), "actionIcons")) {
                        Placeable placeableMo9741measureBRTryo02 = measurable2.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null));
                        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2) == Integer.MAX_VALUE ? Constraints.m11107getMaxWidthimpl(j2) : n.h((((Constraints.m11107getMaxWidthimpl(j2) - Math.max(measureScope2.mo2121roundToPx0680j_4(AppBarKt.TopAppBarTitleInset), placeableMo9741measureBRTryo0.getWidth())) - placeableMo9741measureBRTryo02.getWidth()) - measureScope2.mo2121roundToPx0680j_4(PaddingKt.calculateStartPadding(topAppBarMeasurePolicy.contentPadding, measureScope2.getLayoutDirection()))) - measureScope2.mo2121roundToPx0680j_4(PaddingKt.calculateEndPadding(topAppBarMeasurePolicy.contentPadding, measureScope2.getLayoutDirection())), 0);
                        int size3 = list2.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            Measurable measurable3 = list.get(i5);
                            if (x.n(LayoutIdKt.getLayoutId(measurable3), GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE)) {
                                Placeable placeableMo9741measureBRTryo03 = measurable3.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, iM11107getMaxWidthimpl, 0, 0, 12, null));
                                int i6 = placeableMo9741measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE ? placeableMo9741measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) : 0;
                                float fInvoke = topAppBarMeasurePolicy.scrolledOffset.invoke();
                                int iB = Float.isNaN(fInvoke) ? 0 : a.b(fInvoke);
                                int iMax = Math.max(measureScope2.mo2121roundToPx0680j_4(topAppBarMeasurePolicy.height), placeableMo9741measureBRTryo03.getHeight()) + measureScope2.mo2121roundToPx0680j_4(topAppBarMeasurePolicy.contentPadding.mo2707calculateTopPaddingD9Ej5fM()) + measureScope2.mo2121roundToPx0680j_4(topAppBarMeasurePolicy.contentPadding.mo2704calculateBottomPaddingD9Ej5fM());
                                if (Constraints.m11106getMaxHeightimpl(j2) == Integer.MAX_VALUE) {
                                    iH = iMax;
                                    i2 = iH;
                                } else {
                                    iH = n.h(iB + iMax, 0);
                                    i2 = iMax;
                                }
                                return topAppBarMeasurePolicy.m6091placeTopAppBarLfZho9M(measureScope2, j2, iH, i2, placeableMo9741measureBRTryo0, placeableMo9741measureBRTryo03, placeableMo9741measureBRTryo02, i6, topAppBarMeasurePolicy.contentPadding);
                            }
                            i5++;
                            topAppBarMeasurePolicy = this;
                            measureScope2 = measureScope;
                        }
                        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new e();
                    }
                    i4++;
                    topAppBarMeasurePolicy = this;
                    measureScope2 = measureScope;
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new e();
            }
            i3++;
            topAppBarMeasurePolicy = this;
            measureScope2 = measureScope;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        Integer numValueOf;
        int i3 = intrinsicMeasureScope.mo2121roundToPx0680j_4(this.height);
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).minIntrinsicHeight(i2));
            int iE = i.e(list);
            if (iE > 0) {
                int i4 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i4).minIntrinsicHeight(i2));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i4 == iE) {
                        break;
                    }
                    i4++;
                }
            }
        }
        Integer num = numValueOf;
        return Math.max(i3, num != null ? num.intValue() : 0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        int size = list.size();
        int iMinIntrinsicWidth = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iMinIntrinsicWidth += list.get(i3).minIntrinsicWidth(i2);
        }
        return iMinIntrinsicWidth;
    }

    public /* synthetic */ TopAppBarMeasurePolicy(FloatProducer floatProducer, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i2, float f2, PaddingValues paddingValues, o oVar) {
        this(floatProducer, vertical, horizontal, i2, f2, paddingValues);
    }
}
