package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.k.n;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class MinimumInteractiveBalancedPaddingNode extends Modifier.Node implements LayoutModifierNode {
    private AnimationSpec<Float> animationSpec;
    private boolean hasVisibleLeadingContent;
    private boolean hasVisibleTrailingContent;
    private Animatable<Float, AnimationVector1D> paddingAnimation;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.MinimumInteractiveBalancedPaddingNode$updateAnimation$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return MinimumInteractiveBalancedPaddingNode.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        
            if (r13 != r0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
        
            if (r13 != r0) goto L19;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r12.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                e.b.c.b(r13)
                goto L77
            L10:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L18:
                e.b.c.b(r13)
                goto L52
            L1c:
                e.b.c.b(r13)
                androidx.compose.material3.MinimumInteractiveBalancedPaddingNode r13 = androidx.compose.material3.MinimumInteractiveBalancedPaddingNode.this
                boolean r13 = r13.getHasVisibleLeadingContent()
                if (r13 != 0) goto L55
                androidx.compose.material3.MinimumInteractiveBalancedPaddingNode r13 = androidx.compose.material3.MinimumInteractiveBalancedPaddingNode.this
                boolean r13 = r13.getHasVisibleTrailingContent()
                if (r13 != 0) goto L55
                androidx.compose.material3.MinimumInteractiveBalancedPaddingNode r13 = androidx.compose.material3.MinimumInteractiveBalancedPaddingNode.this
                androidx.compose.animation.core.Animatable r4 = androidx.compose.material3.MinimumInteractiveBalancedPaddingNode.access$getPaddingAnimation$p(r13)
                java.lang.Float r5 = new java.lang.Float
                r13 = 1065353216(0x3f800000, float:1.0)
                r5.<init>(r13)
                androidx.compose.material3.MinimumInteractiveBalancedPaddingNode r13 = androidx.compose.material3.MinimumInteractiveBalancedPaddingNode.this
                androidx.compose.animation.core.AnimationSpec r6 = r13.getAnimationSpec()
                r9 = r12
                h.c.e r9 = (h.c.e) r9
                r12.label = r3
                r10 = 12
                r11 = 0
                r7 = 0
                r8 = 0
                java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 == r0) goto L7c
            L52:
                androidx.compose.animation.core.AnimationResult r13 = (androidx.compose.animation.core.AnimationResult) r13
                goto L79
            L55:
                androidx.compose.material3.MinimumInteractiveBalancedPaddingNode r13 = androidx.compose.material3.MinimumInteractiveBalancedPaddingNode.this
                androidx.compose.animation.core.Animatable r3 = androidx.compose.material3.MinimumInteractiveBalancedPaddingNode.access$getPaddingAnimation$p(r13)
                java.lang.Float r4 = new java.lang.Float
                r13 = 0
                r4.<init>(r13)
                androidx.compose.material3.MinimumInteractiveBalancedPaddingNode r13 = androidx.compose.material3.MinimumInteractiveBalancedPaddingNode.this
                androidx.compose.animation.core.AnimationSpec r5 = r13.getAnimationSpec()
                r8 = r12
                h.c.e r8 = (h.c.e) r8
                r12.label = r2
                r9 = 12
                r10 = 0
                r6 = 0
                r7 = 0
                java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r13 == r0) goto L7c
            L77:
                androidx.compose.animation.core.AnimationResult r13 = (androidx.compose.animation.core.AnimationResult) r13
            L79:
                h.ab r12 = h.ab.f48028a
                return r12
            L7c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MinimumInteractiveBalancedPaddingNode.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public MinimumInteractiveBalancedPaddingNode(boolean z, boolean z2, AnimationSpec<Float> animationSpec) {
        this.hasVisibleLeadingContent = z;
        this.hasVisibleTrailingContent = z2;
        this.animationSpec = animationSpec;
        this.paddingAnimation = AnimatableKt.Animatable$default((z || z2) ? 0.0f : 1.0f, 0.0f, 2, null);
    }

    static final ab measure_3p2s80s$lambda$2(Placeable placeable, int i2, int i3, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, (i2 - placeable.getWidth()) / 2, (i3 - placeable.getHeight()) / 2, 0.0f, 4, null);
        return ab.f48028a;
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getHasVisibleLeadingContent() {
        return this.hasVisibleLeadingContent;
    }

    public final boolean getHasVisibleTrailingContent() {
        return this.hasVisibleTrailingContent;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicHeight.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public AnonymousClass1() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicWidth.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03831() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        float f2;
        float f3;
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
        if (this.hasVisibleLeadingContent && this.hasVisibleTrailingContent) {
            f2 = 0.0f;
            f3 = 0.0f;
        } else {
            float fFloatValue = this.paddingAnimation.getValue().floatValue();
            int i2 = placeableMo9741measureBRTryo0.get(InteractiveComponentSizeKt.getMinimumInteractiveTopAlignmentLine());
            f2 = i2 != Integer.MIN_VALUE ? i2 * fFloatValue : 0.0f;
            int i3 = placeableMo9741measureBRTryo0.get(InteractiveComponentSizeKt.getMinimumInteractiveLeftAlignmentLine());
            f3 = i3 != Integer.MIN_VALUE ? i3 * fFloatValue : 0.0f;
        }
        float f4 = f2 - f3;
        final int width = placeableMo9741measureBRTryo0.getWidth() + Math.round(n.e(f4 + f4, 0.0f));
        float f5 = f3 - f2;
        final int height = placeableMo9741measureBRTryo0.getHeight() + Math.round(n.e(f5 + f5, 0.0f));
        return MeasureScope.CC.layout$default(measureScope, width, height, null, new l() { // from class: androidx.compose.material3.MinimumInteractiveBalancedPaddingNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return MinimumInteractiveBalancedPaddingNode.measure_3p2s80s$lambda$2(placeableMo9741measureBRTryo0, width, height, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicHeight.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03841() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicWidth.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03851() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public final void setAnimationSpec(AnimationSpec<Float> animationSpec) {
        this.animationSpec = animationSpec;
    }

    public final void setHasVisibleLeadingContent(boolean z) {
        this.hasVisibleLeadingContent = z;
    }

    public final void setHasVisibleTrailingContent(boolean z) {
        this.hasVisibleTrailingContent = z;
    }

    public final void updateAnimation() {
        aj.z(getCoroutineScope(), null, null, new AnonymousClass1(null), 3);
    }
}
