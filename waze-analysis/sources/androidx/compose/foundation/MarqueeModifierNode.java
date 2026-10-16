package androidx.compose.foundation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.MarqueeModifierNode;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.i;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MarqueeModifierNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, FocusEventModifierNode {
    private br animationJob;
    private final MutableState animationMode$delegate;
    private final MutableIntState containerWidth$delegate;
    private final MutableIntState contentWidth$delegate;
    private int delayMillis;
    private final MutableState hasFocus$delegate;
    private int initialDelayMillis;
    private int iterations;
    private GraphicsLayer marqueeLayer;
    private final Animatable<Float, AnimationVector1D> offset;
    private final MutableState spacing$delegate;
    private final State spacingPx$delegate;
    private float velocity;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ br $oldJob;
        int label;
        final /* synthetic */ MarqueeModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(br brVar, MarqueeModifierNode marqueeModifierNode, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$oldJob = brVar;
            this.this$0 = marqueeModifierNode;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$oldJob, this.this$0, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            if (r4.this$0.runAnimation(r4) != r0) goto L17;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                e.b.c.b(r5)
                goto L3c
            L10:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L18:
                e.b.c.b(r5)
                goto L2f
            L1c:
                e.b.c.b(r5)
                kotlinx.coroutines.br r5 = r4.$oldJob
                if (r5 == 0) goto L2f
                r1 = r4
                h.c.e r1 = (h.c.e) r1
                r4.label = r3
                java.lang.Object r5 = r5.m(r1)
                if (r5 != r0) goto L2f
                goto L3f
            L2f:
                androidx.compose.foundation.MarqueeModifierNode r5 = r4.this$0
                r1 = r4
                h.c.e r1 = (h.c.e) r1
                r4.label = r2
                java.lang.Object r4 = androidx.compose.foundation.MarqueeModifierNode.access$runAnimation(r5, r1)
                if (r4 == r0) goto L3f
            L3c:
                h.ab r4 = h.ab.f48028a
                return r4
            L3f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifierNode.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2, reason: invalid class name and collision with other inner class name */
        final class C00252 extends g implements p<Float, e<? super ab>, Object> {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ MarqueeModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00252(MarqueeModifierNode marqueeModifierNode, e<? super C00252> eVar) {
                super(2, eVar);
                this.this$0 = marqueeModifierNode;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                C00252 c00252 = new C00252(this.this$0, eVar);
                c00252.L$0 = obj;
                return c00252;
            }

            @Override // h.g.a.p
            public final Object invoke(Float f2, e<? super ab> eVar) {
                return ((C00252) create(f2, eVar)).invokeSuspend(ab.f48028a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
            
                if (r18.this$0.offset.snapTo(new java.lang.Float(0.0f), r18) != r2) goto L33;
             */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00a5 A[Catch: all -> 0x0033, PHI: r0
  0x00a5: PHI (r0v6 java.lang.Object) = (r0v5 java.lang.Object), (r0v14 java.lang.Object) binds: [B:24:0x00a3, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002c, B:25:0x00a5, B:23:0x008a), top: B:35:0x000c }] */
            @Override // h.c.b.a.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 221
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifierNode.AnonymousClass2.C00252.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        static final Float invokeSuspend$lambda$0(MarqueeModifierNode marqueeModifierNode) {
            if (marqueeModifierNode.getContentWidth() <= marqueeModifierNode.getContainerWidth()) {
                return null;
            }
            if (!MarqueeAnimationMode.m2054equalsimpl0(marqueeModifierNode.m2065getAnimationModeZbEOnfQ(), MarqueeAnimationMode.Companion.m2059getWhileFocusedZbEOnfQ()) || marqueeModifierNode.getHasFocus()) {
                return Float.valueOf(marqueeModifierNode.getContentWidth() + marqueeModifierNode.getSpacingPx());
            }
            return null;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return MarqueeModifierNode.this.new AnonymousClass2(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final MarqueeModifierNode marqueeModifierNode = MarqueeModifierNode.this;
                this.label = 1;
                if (ai.e(SnapshotStateKt.snapshotFlow(new h.g.a.a() { // from class: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return MarqueeModifierNode.AnonymousClass2.invokeSuspend$lambda$0(marqueeModifierNode);
                    }
                }), new C00252(MarqueeModifierNode.this, null), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    private MarqueeModifierNode(int i2, int i3, int i4, int i5, final MarqueeSpacing marqueeSpacing, float f2) {
        this.iterations = i2;
        this.delayMillis = i4;
        this.initialDelayMillis = i5;
        this.velocity = f2;
        this.contentWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.containerWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.hasFocus$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.spacing$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(marqueeSpacing, null, 2, null);
        this.animationMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MarqueeAnimationMode.m2051boximpl(i3), null, 2, null);
        this.offset = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.spacingPx$delegate = SnapshotStateKt.derivedStateOf(new h.g.a.a() { // from class: androidx.compose.foundation.MarqueeModifierNode$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
                MarqueeModifierNode marqueeModifierNode = this;
                return Integer.valueOf(marqueeSpacing2.calculateSpacing(DelegatableNodeKt.requireDensity(marqueeModifierNode), marqueeModifierNode.getContentWidth(), marqueeModifierNode.getContainerWidth()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab draw$lambda$0$0(ContentDrawScope contentDrawScope, DrawScope drawScope) {
        contentDrawScope.drawContent();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContainerWidth() {
        return this.containerWidth$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContentWidth() {
        return this.contentWidth$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSpacingPx() {
        return ((Number) this.spacingPx$delegate.getValue()).intValue();
    }

    static final ab measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, 0, 0.0f, (l) null, 12, (Object) null);
        return ab.f48028a;
    }

    private final void restartAnimation() {
        br brVar = this.animationJob;
        if (brVar != null) {
            brVar.s(null);
        }
        if (isAttached()) {
            this.animationJob = aj.z(getCoroutineScope(), null, null, new AnonymousClass1(brVar, this, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(e<? super ab> eVar) {
        Object objV;
        return (this.iterations > 0 && (objV = aj.v(FixedMotionDurationScale.INSTANCE, new AnonymousClass2(null), eVar)) == a.f48038a) ? objV : ab.f48028a;
    }

    private final void setContainerWidth(int i2) {
        this.containerWidth$delegate.setIntValue(i2);
    }

    private final void setContentWidth(int i2) {
        this.contentWidth$delegate.setIntValue(i2);
    }

    private final void setHasFocus(boolean z) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(final ContentDrawScope contentDrawScope) {
        float contentWidth;
        if (Dp.m11163compareTo0680j_4(this.velocity, 0.0f) > 0) {
            LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
            LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
            int iOrdinal = layoutDirection.ordinal();
            if (iOrdinal == 0) {
                contentWidth = this.offset.getValue().floatValue();
            } else {
                if (iOrdinal != 1) {
                    throw new i();
                }
                float f2 = -this.offset.getValue().floatValue();
                int contentWidth2 = getContentWidth();
                contentWidth = ((f2 + (contentWidth2 + contentWidth2)) + getSpacingPx()) - getContainerWidth();
            }
        } else {
            LayoutDirection layoutDirection3 = contentDrawScope.getLayoutDirection();
            LayoutDirection layoutDirection4 = LayoutDirection.Ltr;
            int iOrdinal2 = layoutDirection3.ordinal();
            if (iOrdinal2 == 0) {
                contentWidth = (-this.offset.getValue().floatValue()) + getContentWidth() + getSpacingPx();
            } else {
                if (iOrdinal2 != 1) {
                    throw new i();
                }
                contentWidth = (this.offset.getValue().floatValue() + getContentWidth()) - getContainerWidth();
            }
        }
        float contentWidth3 = getContentWidth();
        float containerWidth = getContainerWidth();
        int contentWidth4 = getContentWidth() + getSpacingPx();
        int contentWidth5 = getContentWidth() + getSpacingPx();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        GraphicsLayer graphicsLayer = this.marqueeLayer;
        if (graphicsLayer != null) {
            contentDrawScope.mo8752recordJVtK1S4(graphicsLayer, (getContentWidth() << 32) | (h.h.a.b(fIntBitsToFloat) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new l() { // from class: androidx.compose.foundation.MarqueeModifierNode$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return MarqueeModifierNode.draw$lambda$0$0(contentDrawScope, (DrawScope) obj);
                }
            });
        }
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        float containerWidth2 = getContainerWidth();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & contentDrawScope2.mo8751getSizeNHjbRc()));
        int iM8217getIntersectrtfAjoo = ClipOp.Companion.m8217getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope2.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8761clipRectN_I0leg(0.0f, 0.0f, containerWidth2, fIntBitsToFloat2, iM8217getIntersectrtfAjoo);
            float f3 = -contentWidth;
            contentDrawScope2.getDrawContext().getTransform().translate(f3, 0.0f);
            try {
                GraphicsLayer graphicsLayer2 = this.marqueeLayer;
                float f4 = contentWidth4;
                float f5 = containerWidth + contentWidth;
                float f6 = contentWidth5;
                if (graphicsLayer2 != null) {
                    if (contentWidth < contentWidth3) {
                        GraphicsLayerKt.drawLayer(contentDrawScope2, graphicsLayer2);
                    }
                    if (f5 > f4) {
                        contentDrawScope2.getDrawContext().getTransform().translate(f6, 0.0f);
                        try {
                            GraphicsLayerKt.drawLayer(contentDrawScope2, graphicsLayer2);
                            contentDrawScope2.getDrawContext().getTransform().translate(-f6, 0.0f);
                        } finally {
                        }
                    }
                } else {
                    if (contentWidth < contentWidth3) {
                        contentDrawScope.drawContent();
                    }
                    if (f5 > f4) {
                        contentDrawScope2.getDrawContext().getTransform().translate(f6, 0.0f);
                        try {
                            contentDrawScope.drawContent();
                            contentDrawScope2.getDrawContext().getTransform().translate(-f6, 0.0f);
                        } finally {
                        }
                    }
                }
            } finally {
                contentDrawScope2.getDrawContext().getTransform().translate(-f3, 0.0f);
            }
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getAnimationMode-ZbEOnfQ, reason: not valid java name */
    public final int m2065getAnimationModeZbEOnfQ() {
        return ((MarqueeAnimationMode) this.animationMode$delegate.getValue()).m2057unboximpl();
    }

    public final MarqueeSpacing getSpacing() {
        return (MarqueeSpacing) this.spacing$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        setContainerWidth(ConstraintsKt.m11124constrainWidthK40F9xA(j2, placeableMo9741measureBRTryo0.getWidth()));
        setContentWidth(placeableMo9741measureBRTryo0.getWidth());
        return MeasureScope.CC.layout$default(measureScope, getContainerWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.foundation.MarqueeModifierNode$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return MarqueeModifierNode.measure_3p2s80s$lambda$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return 0;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        GraphicsLayer graphicsLayer = this.marqueeLayer;
        GraphicsContext graphicsContextRequireGraphicsContext = DelegatableNodeKt.requireGraphicsContext(this);
        if (graphicsLayer != null) {
            graphicsContextRequireGraphicsContext.releaseGraphicsLayer(graphicsLayer);
        }
        this.marqueeLayer = graphicsContextRequireGraphicsContext.createGraphicsLayer();
        restartAnimation();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        br brVar = this.animationJob;
        if (brVar != null) {
            brVar.s(null);
        }
        this.animationJob = null;
        GraphicsLayer graphicsLayer = this.marqueeLayer;
        if (graphicsLayer != null) {
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer);
            this.marqueeLayer = null;
        }
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        setHasFocus(focusState.getHasFocus());
    }

    /* renamed from: setAnimationMode-97h66l8, reason: not valid java name */
    public final void m2066setAnimationMode97h66l8(int i2) {
        this.animationMode$delegate.setValue(MarqueeAnimationMode.m2051boximpl(i2));
    }

    public final void setSpacing(MarqueeSpacing marqueeSpacing) {
        this.spacing$delegate.setValue(marqueeSpacing);
    }

    /* renamed from: update-lWfNwf4, reason: not valid java name */
    public final void m2067updatelWfNwf4(int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2) {
        setSpacing(marqueeSpacing);
        m2066setAnimationMode97h66l8(i3);
        if (this.iterations == i2 && this.delayMillis == i4 && this.initialDelayMillis == i5 && Dp.m11169equalsimpl0(this.velocity, f2)) {
            return;
        }
        this.iterations = i2;
        this.delayMillis = i4;
        this.initialDelayMillis = i5;
        this.velocity = f2;
        restartAnimation();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
    }

    public /* synthetic */ MarqueeModifierNode(int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2, o oVar) {
        this(i2, i3, i4, i5, marqueeSpacing, f2);
    }
}
