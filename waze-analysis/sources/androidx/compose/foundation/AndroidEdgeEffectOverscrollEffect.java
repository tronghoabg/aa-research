package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.c.a.a;
import h.c.b.a.f;
import h.c.e;
import h.g.a.p;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    public static final int $stable = 0;
    private long containerSize;
    private final Density density;
    private final EdgeEffectWrapper edgeEffectWrapper;
    private boolean invalidationEnabled;
    private final DelegatableNode node;
    private long pointerId;
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private long pointerPosition;
    private final MutableState<ab> redrawSignal;
    private boolean scrollCycleInProgress;

    private AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j2, PaddingValues paddingValues) {
        this.density = density;
        this.pointerPosition = Offset.Companion.m7995getUnspecifiedF1C5BW0();
        EdgeEffectWrapper edgeEffectWrapper = new EdgeEffectWrapper(context, ColorKt.m8282toArgb8_81llA(j2));
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.redrawSignal = SnapshotStateKt.mutableStateOf(ab.f48028a, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.Companion.m8058getZeroNHjbRc();
        this.pointerId = -1L;
        SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode = SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1, reason: invalid class name */
            final class AnonymousClass1 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, e<? super AnonymousClass1> eVar) {
                    super(2, eVar);
                    this.this$0 = androidEdgeEffectOverscrollEffect;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, eVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // h.g.a.p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
                
                    if (r15 == r0) goto L38;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005e -> B:16:0x0060). Please report as a decompilation issue!!! */
                @Override // h.c.b.a.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                    /*
                        Method dump skipped, instructions count: 231
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(this.this$0, null), eVar);
                return objAwaitEachGesture == a.f48038a ? objAwaitEachGesture : ab.f48028a;
            }
        });
        this.pointerInputNode = SuspendingPointerInputModifierNode;
        this.node = Build.VERSION.SDK_INT >= 31 ? new StretchOverscrollNode(SuspendingPointerInputModifierNode, this, edgeEffectWrapper) : new GlowOverscrollNode(SuspendingPointerInputModifierNode, this, edgeEffectWrapper, paddingValues);
    }

    private final void animateToReleaseIfNeeded() {
        boolean z;
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        boolean z2 = false;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (!edgeEffect4.isFinished() || z) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateOverscroll$foundation();
        }
    }

    /* renamed from: pullBottom-k-4lQ0M, reason: not valid java name */
    private final float m1944pullBottomk4lQ0M(long j2) {
        long jM1951displacementF1C5BW0$foundation = m1951displacementF1C5BW0$foundation() >> 32;
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) jM1951displacementF1C5BW0$foundation);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.containerSize & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        float f2 = 1.0f - fIntBitsToFloat;
        EdgeEffect orCreateBottomEffect = this.edgeEffectWrapper.getOrCreateBottomEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateBottomEffect) == 0.0f ? (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateBottomEffect, -fIntBitsToFloat2, f2)) * Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & this.containerSize)) : Float.intBitsToFloat(i2);
    }

    /* renamed from: pullLeft-k-4lQ0M, reason: not valid java name */
    private final float m1945pullLeftk4lQ0M(long j2) {
        int i2 = (int) (j2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m1951displacementF1C5BW0$foundation() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        float f2 = 1.0f - fIntBitsToFloat;
        EdgeEffect orCreateLeftEffect = this.edgeEffectWrapper.getOrCreateLeftEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateLeftEffect) == 0.0f ? EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateLeftEffect, fIntBitsToFloat2, f2) * Float.intBitsToFloat((int) (this.containerSize >> 32)) : Float.intBitsToFloat(i2);
    }

    /* renamed from: pullRight-k-4lQ0M, reason: not valid java name */
    private final float m1946pullRightk4lQ0M(long j2) {
        int i2 = (int) (j2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m1951displacementF1C5BW0$foundation() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect orCreateRightEffect = this.edgeEffectWrapper.getOrCreateRightEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateRightEffect) == 0.0f ? (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateRightEffect, -fIntBitsToFloat2, fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.containerSize >> 32)) : Float.intBitsToFloat(i2);
    }

    /* renamed from: pullTop-k-4lQ0M, reason: not valid java name */
    private final float m1947pullTopk4lQ0M(long j2) {
        long jM1951displacementF1C5BW0$foundation = m1951displacementF1C5BW0$foundation() >> 32;
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) jM1951displacementF1C5BW0$foundation);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.containerSize & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        EdgeEffect orCreateTopEffect = this.edgeEffectWrapper.getOrCreateTopEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateTopEffect) == 0.0f ? EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateTopEffect, fIntBitsToFloat2, fIntBitsToFloat) * Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & this.containerSize)) : Float.intBitsToFloat(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m1948releaseOppositeOverscrollk4lQ0M(long r11) {
        /*
            r10 = this;
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.edgeEffectWrapper
            boolean r0 = r0.isLeftAnimating()
            r1 = 32
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L2d
            long r4 = r11 >> r1
            int r0 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r0)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L2d
            androidx.compose.foundation.EdgeEffectWrapper r4 = r10.edgeEffectWrapper
            androidx.compose.foundation.EdgeEffectCompat r5 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r4 = r4.getOrCreateLeftEffect()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r5.onReleaseWithOppositeDelta(r4, r0)
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.edgeEffectWrapper
            boolean r0 = r0.isLeftAnimating()
            goto L2e
        L2d:
            r0 = r3
        L2e:
            androidx.compose.foundation.EdgeEffectWrapper r4 = r10.edgeEffectWrapper
            boolean r4 = r4.isRightAnimating()
            r5 = 1
            if (r4 == 0) goto L5f
            long r6 = r11 >> r1
            int r1 = (int) r6
            float r4 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L5f
            androidx.compose.foundation.EdgeEffectWrapper r4 = r10.edgeEffectWrapper
            androidx.compose.foundation.EdgeEffectCompat r6 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r4 = r4.getOrCreateRightEffect()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r6.onReleaseWithOppositeDelta(r4, r1)
            if (r0 != 0) goto L5e
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.edgeEffectWrapper
            boolean r0 = r0.isRightAnimating()
            if (r0 == 0) goto L5c
            goto L5e
        L5c:
            r0 = r3
            goto L5f
        L5e:
            r0 = r5
        L5f:
            androidx.compose.foundation.EdgeEffectWrapper r1 = r10.edgeEffectWrapper
            boolean r1 = r1.isTopAnimating()
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r1 == 0) goto L94
            long r8 = r11 & r6
            int r1 = (int) r8
            float r4 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L94
            androidx.compose.foundation.EdgeEffectWrapper r4 = r10.edgeEffectWrapper
            androidx.compose.foundation.EdgeEffectCompat r8 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r4 = r4.getOrCreateTopEffect()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r8.onReleaseWithOppositeDelta(r4, r1)
            if (r0 != 0) goto L93
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.edgeEffectWrapper
            boolean r0 = r0.isTopAnimating()
            if (r0 == 0) goto L91
            goto L93
        L91:
            r0 = r3
            goto L94
        L93:
            r0 = r5
        L94:
            androidx.compose.foundation.EdgeEffectWrapper r1 = r10.edgeEffectWrapper
            boolean r1 = r1.isBottomAnimating()
            if (r1 == 0) goto Lc2
            long r11 = r11 & r6
            int r11 = (int) r11
            float r12 = java.lang.Float.intBitsToFloat(r11)
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 <= 0) goto Lc2
            androidx.compose.foundation.EdgeEffectWrapper r12 = r10.edgeEffectWrapper
            androidx.compose.foundation.EdgeEffectCompat r1 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r12 = r12.getOrCreateBottomEffect()
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r1.onReleaseWithOppositeDelta(r12, r11)
            if (r0 != 0) goto Lc1
            androidx.compose.foundation.EdgeEffectWrapper r10 = r10.edgeEffectWrapper
            boolean r10 = r10.isBottomAnimating()
            if (r10 == 0) goto Lc0
            return r5
        Lc0:
            return r3
        Lc1:
            return r5
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.m1948releaseOppositeOverscrollk4lQ0M(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r14.invoke(r11, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0132, code lost:
    
        if (r15 != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1949applyToFlingBMRW4eQ(long r12, h.g.a.p<? super androidx.compose.ui.unit.Velocity, ? super h.c.e<? super androidx.compose.ui.unit.Velocity>, ? extends java.lang.Object> r14, h.c.e<? super h.ab> r15) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo1949applyToFlingBMRW4eQ(long, h.g.a.p, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8 A[PHI: r11
  0x00b8: PHI (r11v9 float) = (r11v8 float), (r11v12 float) binds: [B:43:0x00e9, B:32:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133 A[PHI: r6
  0x0133: PHI (r6v2 float) = (r6v1 float), (r6v3 float) binds: [B:67:0x0164, B:56:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo1950applyToScrollRhakbz0(long r18, int r20, h.g.a.l<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> r21) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo1950applyToScrollRhakbz0(long, int, h.g.a.l):long");
    }

    /* renamed from: displacement-F1C5BW0$foundation, reason: not valid java name */
    public final long m1951displacementF1C5BW0$foundation() {
        long jM8059getCenteruvyYCjk = this.pointerPosition;
        if ((9223372034707292159L & jM8059getCenteruvyYCjk) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM8059getCenteruvyYCjk = SizeKt.m8059getCenteruvyYCjk(this.containerSize);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM8059getCenteruvyYCjk >> 32)) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM8059getCenteruvyYCjk & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / Float.intBitsToFloat((int) (this.containerSize & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public /* synthetic */ Modifier getEffectModifier() {
        return Modifier.Companion;
    }

    public final boolean getInvalidationEnabled$foundation() {
        return this.invalidationEnabled;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public DelegatableNode getNode() {
        return this.node;
    }

    public final MutableState<ab> getRedrawSignal$foundation() {
        return this.redrawSignal;
    }

    public final void invalidateOverscroll$foundation() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(ab.f48028a);
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        if (edgeEffect != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        return (edgeEffect4 == null || EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect4) == 0.0f) ? false : true;
    }

    public final void setInvalidationEnabled$foundation(boolean z) {
        this.invalidationEnabled = z;
    }

    /* renamed from: updateSize-uvyYCjk$foundation, reason: not valid java name */
    public final void m1952updateSizeuvyYCjk$foundation(long j2) {
        boolean zM8045equalsimpl0 = Size.m8045equalsimpl0(this.containerSize, Size.Companion.m8058getZeroNHjbRc());
        boolean zM8045equalsimpl02 = Size.m8045equalsimpl0(j2, this.containerSize);
        this.containerSize = j2;
        if (!zM8045equalsimpl02) {
            this.edgeEffectWrapper.m2025updateSizeozmzZPI((h.h.a.b(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (h.h.a.b(Float.intBitsToFloat((int) (j2 >> 32))) << 32));
        }
        if (zM8045equalsimpl0 || zM8045equalsimpl02) {
            return;
        }
        animateToReleaseIfNeeded();
    }

    public static /* synthetic */ void getInvalidationEnabled$foundation$annotations() {
    }

    public /* synthetic */ AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j2, PaddingValues paddingValues, o oVar) {
        this(context, density, j2, paddingValues);
    }
}
