package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.b.an;
import h.k.n;
import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt {
    private static final boolean DEBUG = false;
    private static final float MinFlingVelocityDp = 400.0f;
    public static final float NoDistance = 0.0f;
    public static final float NoVelocity = 0.0f;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        float F$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehaviorKt.animateDecay(null, 0.0f, null, null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1, reason: invalid class name and case insensitive filesystem */
    final class C02651 extends c {
        float F$0;
        float F$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C02651(e<? super C02651> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehaviorKt.animateWithTarget(null, 0.0f, 0.0f, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateDecay(final androidx.compose.foundation.gestures.ScrollScope r5, final float r6, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r7, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r8, final h.g.a.l<? super java.lang.Float, h.ab> r9, h.c.e<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            float r6 = r0.F$0
            java.lang.Object r5 = r0.L$1
            h.g.b.an r5 = (h.g.b.an) r5
            java.lang.Object r7 = r0.L$0
            androidx.compose.animation.core.AnimationState r7 = (androidx.compose.animation.core.AnimationState) r7
            e.b.c.b(r10)
            goto L67
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            e.b.c.b(r10)
            h.g.b.an r10 = new h.g.b.an
            r10.<init>()
            java.lang.Object r2 = r7.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L52
            r2 = 0
            goto L53
        L52:
            r2 = r3
        L53:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$$ExternalSyntheticLambda0 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$$ExternalSyntheticLambda0
            r4.<init>()
            r0.L$0 = r7
            r0.L$1 = r10
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r5 = androidx.compose.animation.core.SuspendAnimationKt.animateDecay(r7, r8, r2, r4, r0)
            if (r5 == r1) goto L75
            r5 = r10
        L67:
            androidx.compose.foundation.gestures.snapping.AnimationResult r8 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r5 = r5.f48102a
            float r6 = r6 - r5
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            r8.<init>(r5, r7)
            return r8
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay(androidx.compose.foundation.gestures.ScrollScope, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.DecayAnimationSpec, h.g.a.l, h.c.e):java.lang.Object");
    }

    private static final void animateDecay$consumeDelta(AnimationScope<Float, AnimationVector1D> animationScope, ScrollScope scrollScope, l<? super Float, ab> lVar, float f2) {
        float fScrollBy;
        try {
            fScrollBy = scrollScope.scrollBy(f2);
        } catch (CancellationException unused) {
            animationScope.cancelAnimation();
            fScrollBy = 0.0f;
        }
        lVar.invoke(Float.valueOf(fScrollBy));
        if (Math.abs(f2 - fScrollBy) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    static final ab animateDecay$lambda$0(float f2, an anVar, ScrollScope scrollScope, l lVar, AnimationScope animationScope) {
        if (Math.abs(((Number) animationScope.getValue()).floatValue()) >= Math.abs(f2)) {
            float fCoerceToTarget = coerceToTarget(((Number) animationScope.getValue()).floatValue(), f2);
            animateDecay$consumeDelta(animationScope, scrollScope, lVar, fCoerceToTarget - anVar.f48102a);
            animationScope.cancelAnimation();
            anVar.f48102a = fCoerceToTarget;
        } else {
            animateDecay$consumeDelta(animationScope, scrollScope, lVar, ((Number) animationScope.getValue()).floatValue() - anVar.f48102a);
            anVar.f48102a = ((Number) animationScope.getValue()).floatValue();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateWithTarget(final androidx.compose.foundation.gestures.ScrollScope r10, float r11, final float r12, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r13, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r14, final h.g.a.l<? super java.lang.Float, h.ab> r15, h.c.e<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r16) {
        /*
            r0 = r16
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C02651
            if (r1 == 0) goto L15
            r1 = r0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C02651) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1
            r1.<init>(r0)
        L1a:
            r7 = r1
            java.lang.Object r0 = r7.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r7.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            float r10 = r7.F$1
            float r11 = r7.F$0
            java.lang.Object r12 = r7.L$1
            h.g.b.an r12 = (h.g.b.an) r12
            java.lang.Object r1 = r7.L$0
            androidx.compose.animation.core.AnimationState r1 = (androidx.compose.animation.core.AnimationState) r1
            e.b.c.b(r0)
            r0 = r1
            goto L84
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3f:
            e.b.c.b(r0)
            h.g.b.an r0 = new h.g.b.an
            r0.<init>()
            java.lang.Object r2 = r13.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r11)
            java.lang.Object r4 = r13.getVelocity()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L68
            r4 = 0
            r5 = r4
            goto L69
        L68:
            r5 = r3
        L69:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$$ExternalSyntheticLambda1 r6 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$$ExternalSyntheticLambda1
            r6.<init>()
            r7.L$0 = r13
            r7.L$1 = r0
            r7.F$0 = r11
            r7.F$1 = r8
            r7.label = r3
            r4 = r14
            r3 = r2
            r2 = r13
            java.lang.Object r10 = androidx.compose.animation.core.SuspendAnimationKt.animateTo(r2, r3, r4, r5, r6, r7)
            if (r10 == r1) goto Lad
            r12 = r0
            r10 = r8
            r0 = r13
        L84:
            java.lang.Object r1 = r0.getVelocity()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r2 = coerceToTarget(r1, r10)
            androidx.compose.foundation.gestures.snapping.AnimationResult r10 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r12 = r12.f48102a
            float r11 = r11 - r12
            java.lang.Float r12 = new java.lang.Float
            r12.<init>(r11)
            r8 = 29
            r9 = 0
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            androidx.compose.animation.core.AnimationState r11 = androidx.compose.animation.core.AnimationStateKt.copy$default(r0, r1, r2, r3, r5, r7, r8, r9)
            r10.<init>(r12, r11)
            return r10
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateWithTarget(androidx.compose.foundation.gestures.ScrollScope, float, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.AnimationSpec, h.g.a.l, h.c.e):java.lang.Object");
    }

    static final ab animateWithTarget$lambda$0(float f2, an anVar, ScrollScope scrollScope, l lVar, AnimationScope animationScope) {
        float fScrollBy;
        float fCoerceToTarget = coerceToTarget(((Number) animationScope.getValue()).floatValue(), f2);
        float f3 = fCoerceToTarget - anVar.f48102a;
        try {
            fScrollBy = scrollScope.scrollBy(f3);
        } catch (CancellationException unused) {
            animationScope.cancelAnimation();
            fScrollBy = 0.0f;
        }
        lVar.invoke(Float.valueOf(fScrollBy));
        if (Math.abs(f3 - fScrollBy) > 0.5f || fCoerceToTarget != ((Number) animationScope.getValue()).floatValue()) {
            animationScope.cancelAnimation();
        }
        anVar.f48102a += fScrollBy;
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object approach(ScrollScope scrollScope, float f2, float f3, ApproachAnimation<Float, AnimationVector1D> approachAnimation, l<? super Float, ab> lVar, e<? super AnimationResult<Float, AnimationVector1D>> eVar) {
        return approachAnimation.approachAnimation(scrollScope, new Float(f2), new Float(f3), lVar, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: calculateFinalOffset-Fhqu1e0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float m2380calculateFinalOffsetFhqu1e0(int r2, float r3, float r4) {
        /*
            androidx.compose.foundation.gestures.snapping.FinalSnappingItem$Companion r0 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.Companion
            int r0 = r0.m2377getClosestItembbeMdSM()
            boolean r0 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m2373equalsimpl0(r2, r0)
            r1 = 0
            if (r0 == 0) goto L1a
            float r2 = java.lang.Math.abs(r4)
            float r0 = java.lang.Math.abs(r3)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto L35
            goto L26
        L1a:
            androidx.compose.foundation.gestures.snapping.FinalSnappingItem$Companion r0 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.Companion
            int r0 = r0.m2378getNextItembbeMdSM()
            boolean r0 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m2373equalsimpl0(r2, r0)
            if (r0 == 0) goto L28
        L26:
            r3 = r4
            goto L35
        L28:
            androidx.compose.foundation.gestures.snapping.FinalSnappingItem$Companion r4 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.Companion
            int r4 = r4.m2379getPreviousItembbeMdSM()
            boolean r2 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m2373equalsimpl0(r2, r4)
            if (r2 != 0) goto L35
            r3 = r1
        L35:
            boolean r2 = calculateFinalOffset_Fhqu1e0$isValidDistance(r3)
            if (r2 == 0) goto L3c
            return r3
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.m2380calculateFinalOffsetFhqu1e0(int, float, float):float");
    }

    private static final boolean calculateFinalOffset_Fhqu1e0$isValidDistance(float f2) {
        return (f2 == Float.POSITIVE_INFINITY || f2 == Float.NEGATIVE_INFINITY) ? false : true;
    }

    private static final float coerceToTarget(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        return f3 > 0.0f ? n.f(f2, f3) : n.e(f2, f3);
    }

    private static final <T extends Comparable<? super T>> T component1(h.k.e<T> eVar) {
        return eVar.getStart();
    }

    private static final <T extends Comparable<? super T>> T component2(h.k.e<T> eVar) {
        return eVar.getEndInclusive();
    }

    public static final float getMinFlingVelocityDp() {
        return MinFlingVelocityDp;
    }

    public static final TargetedFlingBehavior rememberSnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1921733134, i2, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:230)");
        }
        Object obj = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        DecayAnimationSpec decayAnimationSpecRememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        boolean zChanged = composer.changed(decayAnimationSpecRememberSplineBasedDecay) | ((((i2 & 14) ^ 6) > 4 && composer.changed(snapLayoutInfoProvider)) || (i2 & 6) == 4) | composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = snapFlingBehavior(snapLayoutInfoProvider, decayAnimationSpecRememberSplineBasedDecay, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null));
            composer.updateRememberedValue(objRememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }

    public static final TargetedFlingBehavior snapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec) {
        return new SnapFlingBehavior(snapLayoutInfoProvider, decayAnimationSpec, animationSpec);
    }

    private static final void debugLog(a<String> aVar) {
    }
}
