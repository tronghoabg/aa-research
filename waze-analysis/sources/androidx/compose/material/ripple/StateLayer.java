package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import h.a.i;
import h.g.a.a;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class StateLayer {
    private final boolean bounded;
    private Interaction currentInteraction;
    private final a<RippleAlpha> rippleAlpha;
    private final Animatable<Float, AnimationVector1D> animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
    private final List<Interaction> interactions = new ArrayList();

    public StateLayer(boolean z, a<RippleAlpha> aVar) {
        this.bounded = z;
        this.rippleAlpha = aVar;
    }

    /* renamed from: drawStateLayer-mxwnekA, reason: not valid java name */
    public final void m4317drawStateLayermxwnekA(DrawScope drawScope, float f2, long j2) {
        float fFloatValue = this.animatedAlpha.getValue().floatValue();
        if (fFloatValue > 0.0f) {
            long jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j2, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.bounded) {
                DrawScope.CC.m8823drawCircleVaOC9Bg$default(drawScope, jM8227copywmQWz5c$default, f2, 0L, 0.0f, null, null, 0, 124, null);
                return;
            }
            float fM8049getWidthimpl = Size.m8049getWidthimpl(drawScope.mo8751getSizeNHjbRc());
            float fM8046getHeightimpl = Size.m8046getHeightimpl(drawScope.mo8751getSizeNHjbRc());
            int iM8217getIntersectrtfAjoo = ClipOp.Companion.m8217getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo8761clipRectN_I0leg(0.0f, 0.0f, fM8049getWidthimpl, fM8046getHeightimpl, iM8217getIntersectrtfAjoo);
                DrawScope.CC.m8823drawCircleVaOC9Bg$default(drawScope, jM8227copywmQWz5c$default, f2, 0L, 0.0f, null, null, 0, 124, null);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            }
        }
    }

    public final void handleInteraction$material_ripple(Interaction interaction, af afVar) {
        if (interaction instanceof HoverInteraction.Enter) {
            this.interactions.add(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            this.interactions.remove(((HoverInteraction.Exit) interaction).getEnter());
        } else if (interaction instanceof FocusInteraction.Focus) {
            this.interactions.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            this.interactions.remove(((FocusInteraction.Unfocus) interaction).getFocus());
        } else if (interaction instanceof DragInteraction.Start) {
            this.interactions.add(interaction);
        } else if (interaction instanceof DragInteraction.Stop) {
            this.interactions.remove(((DragInteraction.Stop) interaction).getStart());
        } else if (!(interaction instanceof DragInteraction.Cancel)) {
            return;
        } else {
            this.interactions.remove(((DragInteraction.Cancel) interaction).getStart());
        }
        Interaction interaction2 = (Interaction) i.U(this.interactions);
        if (x.n(this.currentInteraction, interaction2)) {
            return;
        }
        if (interaction2 != null) {
            RippleAlpha rippleAlphaInvoke = this.rippleAlpha.invoke();
            aj.z(afVar, null, null, new StateLayer$handleInteraction$1(this, interaction2 instanceof HoverInteraction.Enter ? rippleAlphaInvoke.getHoveredAlpha() : interaction2 instanceof FocusInteraction.Focus ? rippleAlphaInvoke.getFocusedAlpha() : interaction2 instanceof DragInteraction.Start ? rippleAlphaInvoke.getDraggedAlpha() : 0.0f, RippleKt.incomingStateLayerAnimationSpecFor(interaction2), null), 3);
        } else {
            aj.z(afVar, null, null, new StateLayer$handleInteraction$2(this, RippleKt.outgoingStateLayerAnimationSpecFor(this.currentInteraction), null), 3);
        }
        this.currentInteraction = interaction2;
    }
}
