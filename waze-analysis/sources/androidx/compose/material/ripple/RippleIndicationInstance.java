package androidx.compose.material.ripple;

import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import h.g.a.a;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class RippleIndicationInstance implements IndicationInstance {
    public static final int $stable = 8;
    private final boolean bounded;
    private final StateLayer stateLayer;

    public RippleIndicationInstance(boolean z, final State<RippleAlpha> state) {
        this.bounded = z;
        this.stateLayer = new StateLayer(z, new a() { // from class: androidx.compose.material.ripple.RippleIndicationInstance$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return RippleIndicationInstance.stateLayer$lambda$0(state);
            }
        });
    }

    static final RippleAlpha stateLayer$lambda$0(State state) {
        return (RippleAlpha) state.getValue();
    }

    public abstract void addRipple(PressInteraction.Press press, af afVar);

    /* renamed from: drawStateLayer-H2RKhps, reason: not valid java name */
    public final void m4309drawStateLayerH2RKhps(DrawScope drawScope, float f2, long j2) {
        this.stateLayer.m4317drawStateLayermxwnekA(drawScope, Float.isNaN(f2) ? RippleAnimationKt.m4305getRippleEndRadiuscSwnlzA(drawScope, this.bounded, drawScope.mo8751getSizeNHjbRc()) : drawScope.mo2127toPx0680j_4(f2), j2);
    }

    public abstract void removeRipple(PressInteraction.Press press);

    public final void updateStateLayer$material_ripple(Interaction interaction, af afVar) {
        this.stateLayer.handleInteraction$material_ripple(interaction, afVar);
    }
}
