package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    private Alignment currentAlignment;
    private EnterTransition enter;
    private ExitTransition exit;
    private GraphicsLayerBlockForEnterExit graphicsLayerBlock;
    private a<Boolean> isEnabled;
    private boolean lookaheadConstraintsAvailable;
    private SharedMutableTransformState mutableTransformState;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation;
    private Transition<EnterExitState> transition;
    private long lookaheadSize = AnimationModifierKt.getInvalidSize();
    private long lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private final l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> sizeTransitionSpec = new EnterExitTransitionModifierNode$sizeTransitionSpec$1(this);
    private final l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> slideSpec = new EnterExitTransitionModifierNode$slideSpec$1(this);

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EnterExitTransitionModifierNode(Transition<EnterExitState> transition, Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, SharedMutableTransformState sharedMutableTransformState, a<Boolean> aVar, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.mutableTransformState = sharedMutableTransformState;
        this.isEnabled = aVar;
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    /* renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m1772setLookaheadConstraintsBRTryo0(long j2) {
        this.lookaheadConstraintsAvailable = true;
        this.lookaheadConstraints = j2;
    }

    public final Alignment getAlignment() {
        ChangeSize changeSize;
        Alignment alignment;
        Alignment alignment2;
        if (this.transition.getSegment().isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
            ChangeSize changeSize2 = this.enter.getData$animation().getChangeSize();
            if (changeSize2 != null && (alignment2 = changeSize2.getAlignment()) != null) {
                return alignment2;
            }
            changeSize = this.exit.getData$animation().getChangeSize();
            if (changeSize == null) {
                return null;
            }
        } else {
            ChangeSize changeSize3 = this.exit.getData$animation().getChangeSize();
            if (changeSize3 != null && (alignment = changeSize3.getAlignment()) != null) {
                return alignment;
            }
            changeSize = this.enter.getData$animation().getChangeSize();
            if (changeSize == null) {
                return null;
            }
        }
        return changeSize.getAlignment();
    }

    public final Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    public final EnterTransition getEnter() {
        return this.enter;
    }

    public final ExitTransition getExit() {
        return this.exit;
    }

    public final GraphicsLayerBlockForEnterExit getGraphicsLayerBlock() {
        return this.graphicsLayerBlock;
    }

    public final SharedMutableTransformState getMutableTransformState() {
        return this.mutableTransformState;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    public final l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> getSizeTransitionSpec() {
        return this.sizeTransitionSpec;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getSlideAnimation() {
        return this.slideAnimation;
    }

    public final l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> getSlideSpec() {
        return this.slideSpec;
    }

    public final Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public final a<Boolean> isEnabled() {
        return this.isEnabled;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        long j3;
        State stateAnimate$default;
        if (this.transition.getCurrentState() == this.transition.getTargetState()) {
            this.currentAlignment = null;
        } else if (this.currentAlignment == null) {
            Alignment alignment = getAlignment();
            if (alignment == null) {
                alignment = Alignment.Companion.getTopStart();
            }
            this.currentAlignment = alignment;
        }
        if (measureScope.isLookingAhead()) {
            Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
            long width = (placeableMo9741measureBRTryo0.getWidth() << 32) | (placeableMo9741measureBRTryo0.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            this.lookaheadSize = width;
            m1772setLookaheadConstraintsBRTryo0(j2);
            return MeasureScope.CC.layout$default(measureScope, (int) (width >> 32), (int) (width & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, new EnterExitTransitionModifierNode$measure$1(placeableMo9741measureBRTryo0), 4, null);
        }
        if (!this.isEnabled.invoke().booleanValue()) {
            Placeable placeableMo9741measureBRTryo02 = measurable.mo9741measureBRTryo0(j2);
            return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo02.getWidth(), placeableMo9741measureBRTryo02.getHeight(), null, new EnterExitTransitionModifierNode$measure$3$1(placeableMo9741measureBRTryo02), 4, null);
        }
        l<GraphicsLayerScope, ab> lVarInit = this.graphicsLayerBlock.init();
        Placeable placeableMo9741measureBRTryo03 = measurable.mo9741measureBRTryo0(j2);
        int width2 = placeableMo9741measureBRTryo03.getWidth();
        long height = placeableMo9741measureBRTryo03.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        long j4 = this.lookaheadSize;
        long j5 = (width2 << 32) | height;
        if (true != AnimationModifierKt.m1736isValidozmzZPI(j4)) {
            j4 = j5;
        }
        Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
        State<IntSize> stateAnimate = deferredAnimation != null ? deferredAnimation.animate(this.sizeTransitionSpec, new EnterExitTransitionModifierNode$measure$animSize$1(this, j4)) : null;
        long jM11121constrain4WqzIAM = ConstraintsKt.m11121constrain4WqzIAM(j2, stateAnimate != null ? stateAnimate.getValue().m11343unboximpl() : j5);
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2 = this.offsetAnimation;
        long jM11305unboximpl = deferredAnimation2 != null ? deferredAnimation2.animate(EnterExitTransitionModifierNode$measure$offsetDelta$1.INSTANCE, new EnterExitTransitionModifierNode$measure$offsetDelta$2(this, j4)).getValue().m11305unboximpl() : IntOffset.Companion.m11307getZeronOccac();
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3 = this.slideAnimation;
        if (deferredAnimation3 != null) {
            j3 = 4294967295L;
            stateAnimate$default = Transition.DeferredAnimation.animate$default(deferredAnimation3, this.slideSpec, this.mutableTransformState.m1817getSlideHandoffValueJyOPPKE(), null, new EnterExitTransitionModifierNode$measure$animSlideOffsetState$1(this, j4), 4, null);
        } else {
            j3 = 4294967295L;
            stateAnimate$default = null;
        }
        return MeasureScope.CC.layout$default(measureScope, (int) (jM11121constrain4WqzIAM >> 32), (int) (jM11121constrain4WqzIAM & j3), null, new EnterExitTransitionModifierNode$measure$2(this, stateAnimate$default, j5, j4, jM11121constrain4WqzIAM, placeableMo9741measureBRTryo03, jM11305unboximpl, lVarInit), 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.lookaheadConstraintsAvailable = false;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
    }

    public final void setCurrentAlignment(Alignment alignment) {
        this.currentAlignment = alignment;
    }

    public final void setEnabled(a<Boolean> aVar) {
        this.isEnabled = aVar;
    }

    public final void setEnter(EnterTransition enterTransition) {
        this.enter = enterTransition;
    }

    public final void setExit(ExitTransition exitTransition) {
        this.exit = exitTransition;
    }

    public final void setGraphicsLayerBlock(GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    public final void setMutableTransformState(SharedMutableTransformState sharedMutableTransformState) {
        this.mutableTransformState = sharedMutableTransformState;
    }

    public final void setOffsetAnimation(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.offsetAnimation = deferredAnimation;
    }

    public final void setSizeAnimation(Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation) {
        this.sizeAnimation = deferredAnimation;
    }

    public final void setSlideAnimation(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.slideAnimation = deferredAnimation;
    }

    public final void setTransition(Transition<EnterExitState> transition) {
        this.transition = transition;
    }

    /* renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m1773sizeByStateUzc_VyU(EnterExitState enterExitState, long j2) {
        l<IntSize, IntSize> size;
        l<IntSize, IntSize> size2;
        EnterExitState enterExitState2 = EnterExitState.PreEnter;
        int iOrdinal = enterExitState.ordinal();
        if (iOrdinal == 0) {
            ChangeSize changeSize = this.enter.getData$animation().getChangeSize();
            if (changeSize != null && (size = changeSize.getSize()) != null) {
                return size.invoke(IntSize.m11331boximpl(j2)).m11343unboximpl();
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new i();
            }
            ChangeSize changeSize2 = this.exit.getData$animation().getChangeSize();
            if (changeSize2 != null && (size2 = changeSize2.getSize()) != null) {
                return size2.invoke(IntSize.m11331boximpl(j2)).m11343unboximpl();
            }
        }
        return j2;
    }

    /* renamed from: slideTargetValueByState-oFUgxo0, reason: not valid java name */
    public final long m1774slideTargetValueByStateoFUgxo0(EnterExitState enterExitState, long j2) {
        l<IntSize, IntOffset> slideOffset;
        l<IntSize, IntOffset> slideOffset2;
        Slide slide = this.enter.getData$animation().getSlide();
        long jM11307getZeronOccac = (slide == null || (slideOffset2 = slide.getSlideOffset()) == null) ? IntOffset.Companion.m11307getZeronOccac() : slideOffset2.invoke(IntSize.m11331boximpl(j2)).m11305unboximpl();
        Slide slide2 = this.exit.getData$animation().getSlide();
        long jM11307getZeronOccac2 = (slide2 == null || (slideOffset = slide2.getSlideOffset()) == null) ? IntOffset.Companion.m11307getZeronOccac() : slideOffset.invoke(IntSize.m11331boximpl(j2)).m11305unboximpl();
        EnterExitState enterExitState2 = EnterExitState.PreEnter;
        int iOrdinal = enterExitState.ordinal();
        if (iOrdinal == 0) {
            return jM11307getZeronOccac;
        }
        if (iOrdinal == 1) {
            return IntOffset.Companion.m11307getZeronOccac();
        }
        if (iOrdinal == 2) {
            return jM11307getZeronOccac2;
        }
        throw new i();
    }

    /* renamed from: targetOffsetByState-oFUgxo0, reason: not valid java name */
    public final long m1775targetOffsetByStateoFUgxo0(EnterExitState enterExitState, long j2) {
        if (this.currentAlignment == null) {
            return IntOffset.Companion.m11307getZeronOccac();
        }
        if (getAlignment() == null) {
            return IntOffset.Companion.m11307getZeronOccac();
        }
        if (x.n(this.currentAlignment, getAlignment())) {
            return IntOffset.Companion.m11307getZeronOccac();
        }
        EnterExitState enterExitState2 = EnterExitState.PreEnter;
        int iOrdinal = enterExitState.ordinal();
        if (iOrdinal == 0) {
            return IntOffset.Companion.m11307getZeronOccac();
        }
        if (iOrdinal == 1) {
            return IntOffset.Companion.m11307getZeronOccac();
        }
        if (iOrdinal != 2) {
            throw new i();
        }
        ChangeSize changeSize = this.exit.getData$animation().getChangeSize();
        if (changeSize == null) {
            return IntOffset.Companion.m11307getZeronOccac();
        }
        long jM11343unboximpl = changeSize.getSize().invoke(IntSize.m11331boximpl(j2)).m11343unboximpl();
        Alignment alignment = getAlignment();
        x.c(alignment);
        long jMo7648alignKFBX0sM = alignment.mo7648alignKFBX0sM(j2, jM11343unboximpl, LayoutDirection.Ltr);
        Alignment alignment2 = this.currentAlignment;
        x.c(alignment2);
        return IntOffset.m11299minusqkQi6aY(jMo7648alignKFBX0sM, alignment2.mo7648alignKFBX0sM(j2, jM11343unboximpl, LayoutDirection.Ltr));
    }
}
