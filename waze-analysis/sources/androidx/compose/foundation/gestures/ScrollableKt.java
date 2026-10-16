package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;
import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ScrollableKt {
    private static final float DefaultScrollMotionDurationScaleFactor = 1.0f;
    private static final double VerticalAxisThresholdAngle = 0.7853981633974483d;
    private static final l<PointerType, Boolean> CanDragCalculation = new l() { // from class: androidx.compose.foundation.gestures.ScrollableKt$$ExternalSyntheticLambda0
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return Boolean.valueOf(ScrollableKt.CanDragCalculation$lambda$0((PointerType) obj));
        }
    };
    private static final ScrollScope NoOpScrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollableKt$NoOpScrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float f2) {
            return f2;
        }
    };
    private static final MotionDurationScale DefaultScrollMotionDurationScale = new MotionDurationScale() { // from class: androidx.compose.foundation.gestures.ScrollableKt$DefaultScrollMotionDurationScale$1
        @Override // h.c.j
        public /* bridge */ <R> R fold(R r, p<? super R, ? super h, ? extends R> pVar) {
            return (R) MotionDurationScale.DefaultImpls.fold(this, r, pVar);
        }

        @Override // h.c.h, h.c.j
        public /* bridge */ <E extends h> E get(i<E> iVar) {
            return (E) MotionDurationScale.DefaultImpls.get(this, iVar);
        }

        @Override // androidx.compose.ui.MotionDurationScale, h.c.h
        public /* synthetic */ i getKey() {
            return MotionDurationScale.Key;
        }

        @Override // androidx.compose.ui.MotionDurationScale
        public float getScaleFactor() {
            return 1.0f;
        }

        @Override // h.c.j
        public /* bridge */ j minusKey(i<?> iVar) {
            return MotionDurationScale.DefaultImpls.minusKey(this, iVar);
        }

        @Override // h.c.j
        public /* bridge */ j plus(j jVar) {
            return MotionDurationScale.DefaultImpls.plus(this, jVar);
        }
    };
    private static final Density UnityDensity = new Density() { // from class: androidx.compose.foundation.gestures.ScrollableKt$UnityDensity$1
        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public /* synthetic */ int mo2120roundToPxR2X_6o(long j2) {
            return Density.CC.m11128$default$roundToPxR2X_6o(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public /* synthetic */ int mo2121roundToPx0680j_4(float f2) {
            return Density.CC.m11129$default$roundToPx0680j_4(this, f2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public /* synthetic */ float mo2122toDpGaN1DYA(long j2) {
            return FontScaling.CC.m11273$default$toDpGaN1DYA(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo2123toDpu2uoSUM(float f2) {
            return Density.CC.m11130$default$toDpu2uoSUM(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public /* synthetic */ long mo2125toDpSizekrfVVM(long j2) {
            return Density.CC.m11132$default$toDpSizekrfVVM(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public /* synthetic */ float mo2126toPxR2X_6o(long j2) {
            return Density.CC.m11133$default$toPxR2X_6o(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public /* synthetic */ float mo2127toPx0680j_4(float f2) {
            return Density.CC.m11134$default$toPx0680j_4(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        public /* synthetic */ Rect toRect(DpRect dpRect) {
            return Density.CC.$default$toRect(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public /* synthetic */ long mo2128toSizeXkaWNTQ(long j2) {
            return Density.CC.m11135$default$toSizeXkaWNTQ(this, j2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public /* synthetic */ long mo2129toSp0xMU5do(float f2) {
            return FontScaling.CC.m11274$default$toSp0xMU5do(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo2130toSpkPz2Gy4(float f2) {
            return Density.CC.m11136$default$toSpkPz2Gy4(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo2124toDpu2uoSUM(int i2) {
            return Density.CC.m11131$default$toDpu2uoSUM((Density) this, i2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo2131toSpkPz2Gy4(int i2) {
            return Density.CC.m11137$default$toSpkPz2Gy4((Density) this, i2);
        }
    };

    static final boolean CanDragCalculation$lambda$0(PointerType pointerType) {
        return pointerType == null || !PointerType.m9682equalsimpl0(pointerType.m9685unboximpl(), PointerType.Companion.m9687getMouseT8wyACA());
    }

    public static final l<PointerType, Boolean> getCanDragCalculation() {
        return CanDragCalculation;
    }

    public static final MotionDurationScale getDefaultScrollMotionDurationScale() {
        return DefaultScrollMotionDurationScale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getShouldBeTriggeredByMouseWheel(FlingBehavior flingBehavior) {
        return !(flingBehavior instanceof ScrollableDefaultFlingBehavior);
    }

    public static final Density getUnityDensity() {
        return UnityDensity;
    }

    public static final Modifier scrollable(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        return modifier.then(new ScrollableElement(scrollableState, orientation, overscrollEffect, z, z2, flingBehavior, mutableInteractionSource, bringIntoViewSpec));
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec, int i2, Object obj) {
        boolean z3 = z | (!((i2 & 8) == 0));
        boolean z4 = z2 & ((i2 & 16) == 0);
        if ((i2 & 32) != 0) {
            flingBehavior = null;
        }
        if ((i2 & 64) != 0) {
            mutableInteractionSource = null;
        }
        if ((i2 & 128) != 0) {
            bringIntoViewSpec = null;
        }
        return scrollable(modifier, scrollableState, orientation, overscrollEffect, z3, z4, flingBehavior, mutableInteractionSource, bringIntoViewSpec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: semanticsScrollBy-d-4ec7I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2296semanticsScrollByd4ec7I(androidx.compose.foundation.gestures.ScrollingLogic r10, long r11, h.c.e<? super androidx.compose.ui.geometry.Offset> r13) {
        /*
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r10 = r0.L$1
            h.g.b.an r10 = (h.g.b.an) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r11 = (androidx.compose.foundation.gestures.ScrollingLogic) r11
            e.b.c.b(r13)
            r8 = r10
            r10 = r11
            goto L5a
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            e.b.c.b(r13)
            h.g.b.an r8 = new h.g.b.an
            r8.<init>()
            androidx.compose.foundation.MutatePriority r13 = androidx.compose.foundation.MutatePriority.Default
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2 r4 = new androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2
            r9 = 0
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r8, r9)
            h.g.a.p r4 = (h.g.a.p) r4
            r0.L$0 = r5
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r10 = r5.scroll(r13, r4, r0)
            if (r10 == r1) goto L65
            r10 = r5
        L5a:
            float r11 = r8.f48102a
            long r10 = r10.m2319toOffsettuRUvjQ(r11)
            androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m7969boximpl(r10)
            return r10
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.m2296semanticsScrollByd4ec7I(androidx.compose.foundation.gestures.ScrollingLogic, long, h.c.e):java.lang.Object");
    }

    public static final Modifier scrollable(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource) {
        return scrollable$default(modifier, scrollableState, orientation, null, z, z2, flingBehavior, mutableInteractionSource, null, 128, null);
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i2, Object obj) {
        boolean z3 = z | (!((i2 & 4) == 0));
        boolean z4 = z2 & ((i2 & 8) == 0);
        if ((i2 & 16) != 0) {
            flingBehavior = null;
        }
        if ((i2 & 32) != 0) {
            mutableInteractionSource = null;
        }
        return scrollable(modifier, scrollableState, orientation, z3, z4, flingBehavior, mutableInteractionSource);
    }
}
