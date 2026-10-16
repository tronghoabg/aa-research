package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class VeilModifierNode extends Modifier.Node implements DrawModifierNode {
    private EnterTransition enter;
    private ExitTransition exit;
    private SharedMutableTransformState mutableTransformState;
    private Transition<EnterExitState> transition;
    private Transition<EnterExitState>.DeferredAnimation<Color, AnimationVector4D> veilAnimation;

    public VeilModifierNode(Transition<EnterExitState> transition, Transition<EnterExitState>.DeferredAnimation<Color, AnimationVector4D> deferredAnimation, EnterTransition enterTransition, ExitTransition exitTransition, SharedMutableTransformState sharedMutableTransformState) {
        this.transition = transition;
        this.veilAnimation = deferredAnimation;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.mutableTransformState = sharedMutableTransformState;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        long jM8058getZeroNHjbRc;
        contentDrawScope.drawContent();
        long jM1812combinedVeill2rxGTc = this.mutableTransformState.m1812combinedVeill2rxGTc(((Color) Transition.DeferredAnimation.animate$default(this.veilAnimation, new VeilModifierNode$draw$veilColor$1(this), this.mutableTransformState.m1819getVeilHandoffValueQN2ZGVo(), null, new VeilModifierNode$draw$veilColor$2(this), 4, null).getValue()).m8238unboximpl());
        if (Color.m8230getAlphaimpl(jM1812combinedVeill2rxGTc) == 0.0f) {
            return;
        }
        Veil veil = this.enter.getData$animation().getVeil();
        if (veil == null) {
            veil = this.exit.getData$animation().getVeil();
        }
        if (veil == null || !veil.getMatchParentSize()) {
            DrawScope.CC.m8836drawRectnJ9OG0$default(contentDrawScope, jM1812combinedVeill2rxGTc, 0L, 0L, 0.0f, null, null, 0, 126, null);
            return;
        }
        LayoutCoordinates layoutCoordinatesRequireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(this);
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinatesRequireLayoutCoordinates.getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            long jMo9743getSizeYbymL2g = parentLayoutCoordinates.mo9743getSizeYbymL2g();
            long j2 = jMo9743getSizeYbymL2g >> 32;
            long j3 = jMo9743getSizeYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            jM8058getZeroNHjbRc = (Float.floatToRawIntBits((int) j3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits((int) j2) << 32);
        } else {
            jM8058getZeroNHjbRc = Size.Companion.m8058getZeroNHjbRc();
        }
        DrawScope.CC.m8836drawRectnJ9OG0$default(contentDrawScope, jM1812combinedVeill2rxGTc, LayoutCoordinatesKt.positionInParent(layoutCoordinatesRequireLayoutCoordinates) ^ (-9223372034707292160L), jM8058getZeroNHjbRc, 0.0f, null, null, 0, 120, null);
    }

    public final EnterTransition getEnter() {
        return this.enter;
    }

    public final ExitTransition getExit() {
        return this.exit;
    }

    public final SharedMutableTransformState getMutableTransformState() {
        return this.mutableTransformState;
    }

    public final Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public final Transition<EnterExitState>.DeferredAnimation<Color, AnimationVector4D> getVeilAnimation() {
        return this.veilAnimation;
    }

    public final void setEnter(EnterTransition enterTransition) {
        this.enter = enterTransition;
    }

    public final void setExit(ExitTransition exitTransition) {
        this.exit = exitTransition;
    }

    public final void setMutableTransformState(SharedMutableTransformState sharedMutableTransformState) {
        this.mutableTransformState = sharedMutableTransformState;
    }

    public final void setTransition(Transition<EnterExitState> transition) {
        this.transition = transition;
    }

    public final void setVeilAnimation(Transition<EnterExitState>.DeferredAnimation<Color, AnimationVector4D> deferredAnimation) {
        this.veilAnimation = deferredAnimation;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
    }
}
