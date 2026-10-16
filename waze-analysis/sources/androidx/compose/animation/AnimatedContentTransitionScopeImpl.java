package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {
    public static final int $stable = 8;
    private State<IntSize> animatedSize;
    private Alignment contentAlignment;
    private LayoutDirection layoutDirection;
    private final MutableState measuredSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m11331boximpl(IntSize.Companion.m11344getZeroYbymL2g()), null, 2, null);
    private final MutableScatterMap<S, State<IntSize>> targetSizeMap = ScatterMapKt.mutableScatterMapOf();
    private final Transition<S> transition;

    /* compiled from: WazeSource */
    final class SizeModifierElement<S> extends ModifierNodeElement<SizeModifierNode<S>> {
        private final AnimatedContentTransitionScopeImpl<S> scope;
        private final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
        private final State<SizeTransform> sizeTransform;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifierElement(Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, State<? extends SizeTransform> state, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
            this.scope = animatedContentTransitionScopeImpl;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public SizeModifierNode<S> create() {
            return new SizeModifierNode<>(this.sizeAnimation, this.sizeTransform, this.scope);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            if (!(obj instanceof SizeModifierElement)) {
                return false;
            }
            SizeModifierElement sizeModifierElement = (SizeModifierElement) obj;
            return x.n(sizeModifierElement.sizeAnimation, this.sizeAnimation) && x.n(sizeModifierElement.sizeTransform, this.sizeTransform);
        }

        public final AnimatedContentTransitionScopeImpl<S> getScope() {
            return this.scope;
        }

        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            int iHashCode = this.scope.hashCode() * 31;
            Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
            return ((iHashCode + (deferredAnimation != null ? deferredAnimation.hashCode() : 0)) * 31) + this.sizeTransform.hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("sizeTransform");
            inspectorInfo.getProperties().set("sizeAnimation", this.sizeAnimation);
            inspectorInfo.getProperties().set("sizeTransform", this.sizeTransform);
            inspectorInfo.getProperties().set("scope", this.scope);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(SizeModifierNode<S> sizeModifierNode) {
            sizeModifierNode.setSizeAnimation(this.sizeAnimation);
            sizeModifierNode.setSizeTransform(this.sizeTransform);
            sizeModifierNode.setScope(this.scope);
        }
    }

    /* compiled from: WazeSource */
    final class SizeModifierNode<S> extends LayoutModifierNodeWithPassThroughIntrinsics {
        private long lastSize = AnimatedContentKt.UnspecifiedSize;
        private AnimatedContentTransitionScopeImpl<S> scope;
        private Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
        private State<? extends SizeTransform> sizeTransform;

        public SizeModifierNode(Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, State<? extends SizeTransform> state, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
            this.scope = animatedContentTransitionScopeImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lastContinuousSizeOrDefault-mzRDjE0, reason: not valid java name */
        public final long m1731lastContinuousSizeOrDefaultmzRDjE0(long j2) {
            long j3 = this.lastSize;
            return IntSize.m11337equalsimpl0(j3, AnimatedContentKt.UnspecifiedSize) ? j2 : j3;
        }

        public final AnimatedContentTransitionScopeImpl<S> getScope() {
            return this.scope;
        }

        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.ui.node.LayoutModifierNode
        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
            long jM11343unboximpl;
            long width;
            long height;
            Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
            if (measureScope.isLookingAhead()) {
                width = placeableMo9741measureBRTryo0.getWidth() << 32;
                height = placeableMo9741measureBRTryo0.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            } else {
                if (this.sizeAnimation != null) {
                    long height2 = placeableMo9741measureBRTryo0.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                    Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
                    x.c(deferredAnimation);
                    long width2 = (placeableMo9741measureBRTryo0.getWidth() << 32) | height2;
                    State<IntSize> stateAnimate = deferredAnimation.animate(new AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1(this, width2), new AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2(this, width2));
                    this.scope.setAnimatedSize$animation(stateAnimate);
                    jM11343unboximpl = stateAnimate.getValue().m11343unboximpl();
                    this.lastSize = stateAnimate.getValue().m11343unboximpl();
                    return MeasureScope.CC.layout$default(measureScope, (int) (jM11343unboximpl >> 32), (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & jM11343unboximpl), null, new AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1(this, placeableMo9741measureBRTryo0, jM11343unboximpl), 4, null);
                }
                width = placeableMo9741measureBRTryo0.getWidth() << 32;
                height = placeableMo9741measureBRTryo0.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                this.lastSize = (placeableMo9741measureBRTryo0.getWidth() << 32) | (placeableMo9741measureBRTryo0.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            }
            jM11343unboximpl = width | height;
            return MeasureScope.CC.layout$default(measureScope, (int) (jM11343unboximpl >> 32), (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & jM11343unboximpl), null, new AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1(this, placeableMo9741measureBRTryo0, jM11343unboximpl), 4, null);
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onReset() {
            this.lastSize = AnimatedContentKt.UnspecifiedSize;
        }

        public final void setScope(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.scope = animatedContentTransitionScopeImpl;
        }

        public final void setSizeAnimation(Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation) {
            this.sizeAnimation = deferredAnimation;
        }

        public final void setSizeTransform(State<? extends SizeTransform> state) {
            this.sizeTransform = state;
        }
    }

    public AnimatedContentTransitionScopeImpl(Transition<S> transition, Alignment alignment, LayoutDirection layoutDirection) {
        this.transition = transition;
        this.contentAlignment = alignment;
        this.layoutDirection = layoutDirection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateOffset-emnUabE, reason: not valid java name */
    public final long m1724calculateOffsetemnUabE(long j2, long j3) {
        return getContentAlignment().mo7648alignKFBX0sM(j2, j3, LayoutDirection.Ltr);
    }

    private static final boolean createSizeAnimationModifier$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createSizeAnimationModifier$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentSize-YbymL2g, reason: not valid java name */
    public final long m1725getCurrentSizeYbymL2g() {
        State<IntSize> state = this.animatedSize;
        return state != null ? state.getValue().m11343unboximpl() : m1728getMeasuredSizeYbymL2g$animation();
    }

    /* renamed from: isLeft-gWo6LJ4, reason: not valid java name */
    private final boolean m1726isLeftgWo6LJ4(int i2) {
        if (AnimatedContentTransitionScope.SlideDirection.m1712equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m1718getLeftDKzdypw())) {
            return true;
        }
        if (AnimatedContentTransitionScope.SlideDirection.m1712equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m1720getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr) {
            return true;
        }
        return AnimatedContentTransitionScope.SlideDirection.m1712equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m1717getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl;
    }

    /* renamed from: isRight-gWo6LJ4, reason: not valid java name */
    private final boolean m1727isRightgWo6LJ4(int i2) {
        if (AnimatedContentTransitionScope.SlideDirection.m1712equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m1719getRightDKzdypw())) {
            return true;
        }
        if (AnimatedContentTransitionScope.SlideDirection.m1712equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m1720getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl) {
            return true;
        }
        return AnimatedContentTransitionScope.SlideDirection.m1712equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m1717getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr;
    }

    public final Modifier createSizeAnimationModifier$animation(ContentTransform contentTransform, Composer composer, int i2) {
        Modifier.Companion companion;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(93755870, i2, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:573)");
        }
        boolean zChanged = composer.changed(this);
        Object objRememberedValue = composer.rememberedValue();
        Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = null;
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        Transition<S> transition = this.transition;
        if (x.n(transition.getCurrentState(), transition.getTargetState())) {
            createSizeAnimationModifier$lambda$2(mutableState, false);
        } else if (stateRememberUpdatedState.getValue() != null) {
            createSizeAnimationModifier$lambda$2(mutableState, true);
        }
        if (createSizeAnimationModifier$lambda$1(mutableState)) {
            composer.startReplaceGroup(1353077497);
            deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.Companion), null, composer, 0, 2);
            boolean zChanged2 = composer.changed(deferredAnimationCreateDeferredAnimation);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) stateRememberUpdatedState.getValue();
                objRememberedValue2 = (sizeTransform == null || sizeTransform.getClip()) ? ClipKt.clipToBounds(Modifier.Companion) : (Modifier) Modifier.Companion;
                composer.updateRememberedValue(objRememberedValue2);
            }
            companion = (Modifier) objRememberedValue2;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1353343539);
            composer.endReplaceGroup();
            this.animatedSize = null;
            companion = Modifier.Companion;
        }
        Modifier modifierThen = companion.then(new SizeModifierElement(deferredAnimationCreateDeferredAnimation, stateRememberUpdatedState, this));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifierThen;
    }

    public final State<IntSize> getAnimatedSize$animation() {
        return this.animatedSize;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public /* synthetic */ ExitTransition getKeepUntilTransitionsFinished(ExitTransition.Companion companion) {
        return companion.getKeepUntilTransitionsFinished$animation();
    }

    public final LayoutDirection getLayoutDirection$animation() {
        return this.layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMeasuredSize-YbymL2g$animation, reason: not valid java name */
    public final long m1728getMeasuredSizeYbymL2g$animation() {
        return ((IntSize) this.measuredSize$delegate.getValue()).m11343unboximpl();
    }

    public final MutableScatterMap<S, State<IntSize>> getTargetSizeMap$animation() {
        return this.targetSizeMap;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    public final Transition<S> getTransition$animation() {
        return this.transition;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public /* synthetic */ boolean isTransitioningTo(Object obj, Object obj2) {
        return Transition.Segment.CC.$default$isTransitioningTo(this, obj, obj2);
    }

    public final void setAnimatedSize$animation(State<IntSize> state) {
        this.animatedSize = state;
    }

    public void setContentAlignment(Alignment alignment) {
        this.contentAlignment = alignment;
    }

    public final void setLayoutDirection$animation(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    /* renamed from: setMeasuredSize-ozmzZPI$animation, reason: not valid java name */
    public final void m1729setMeasuredSizeozmzZPI$animation(long j2) {
        this.measuredSize$delegate.setValue(IntSize.m11331boximpl(j2));
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* renamed from: slideIntoContainer-mOhB8PU */
    public EnterTransition mo1705slideIntoContainermOhB8PU(int i2, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, l<? super Integer, Integer> lVar) {
        return m1726isLeftgWo6LJ4(i2) ? EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$1(lVar, this)) : m1727isRightgWo6LJ4(i2) ? EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$2(lVar, this)) : AnimatedContentTransitionScope.SlideDirection.m1712equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m1721getUpDKzdypw()) ? EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$3(lVar, this)) : AnimatedContentTransitionScope.SlideDirection.m1712equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m1716getDownDKzdypw()) ? EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$4(lVar, this)) : EnterTransition.Companion.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* renamed from: slideOutOfContainer-mOhB8PU */
    public ExitTransition mo1706slideOutOfContainermOhB8PU(int i2, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, l<? super Integer, Integer> lVar) {
        return m1726isLeftgWo6LJ4(i2) ? EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$1(this, lVar)) : m1727isRightgWo6LJ4(i2) ? EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$2(this, lVar)) : AnimatedContentTransitionScope.SlideDirection.m1712equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m1721getUpDKzdypw()) ? EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$3(this, lVar)) : AnimatedContentTransitionScope.SlideDirection.m1712equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m1716getDownDKzdypw()) ? EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$4(this, lVar)) : ExitTransition.Companion.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform) {
        contentTransform.setSizeTransform$animation(sizeTransform);
        return contentTransform;
    }

    /* compiled from: WazeSource */
    public final class ChildData implements ParentDataModifier {
        public static final int $stable = 0;
        private final MutableState isPendingTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        private final MutableState isTarget$delegate;

        public ChildData(boolean z) {
            this.isTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ boolean all(l lVar) {
            return Modifier.Element.CC.$default$all(this, lVar);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ boolean any(l lVar) {
            return Modifier.Element.CC.$default$any(this, lVar);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ Object foldIn(Object obj, p pVar) {
            return Modifier.Element.CC.$default$foldIn(this, obj, pVar);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ Object foldOut(Object obj, p pVar) {
            return Modifier.Element.CC.$default$foldOut(this, obj, pVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean isPendingTarget() {
            return ((Boolean) this.isPendingTarget$delegate.getValue()).booleanValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean isTarget() {
            return ((Boolean) this.isTarget$delegate.getValue()).booleanValue();
        }

        public final void setPendingTarget(boolean z) {
            this.isPendingTarget$delegate.setValue(Boolean.valueOf(z));
        }

        public final void setTarget(boolean z) {
            this.isTarget$delegate.setValue(Boolean.valueOf(z));
        }

        @Override // androidx.compose.ui.Modifier
        public /* synthetic */ Modifier then(Modifier modifier) {
            return Modifier.CC.$default$then(this, modifier);
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public Object modifyParentData(Density density, Object obj) {
            return this;
        }
    }
}
