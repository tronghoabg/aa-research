package androidx.compose.material3.internal.ripple;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatingNode;
import h.g.a.a;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RippleModifierNode extends DelegatingNode {
    public static final int $stable = DelegatingNode.$stable;

    private RippleModifierNode(InteractionSource interactionSource, boolean z, float f2, ColorProducer colorProducer, a<RippleNodeConfig> aVar) {
        delegate(Ripple_androidKt.m6408createPlatformRippleNodeTDGSqEk(interactionSource, z, f2, colorProducer, aVar));
    }

    public /* synthetic */ RippleModifierNode(InteractionSource interactionSource, boolean z, float f2, ColorProducer colorProducer, a aVar, o oVar) {
        this(interactionSource, z, f2, colorProducer, aVar);
    }
}
