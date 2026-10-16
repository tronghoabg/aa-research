package androidx.compose.material3.internal.ripple;

import android.view.View;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.internal.ripple.RippleNodeConfig;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import h.ab;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidRippleNode extends RippleNode implements RippleHostKey {
    public static final int $stable = 8;
    private RippleContainer rippleContainer;
    private RippleHostView rippleHostView;

    private AndroidRippleNode(InteractionSource interactionSource, boolean z, float f2, ColorProducer colorProducer, a<RippleNodeConfig> aVar) {
        super(interactionSource, z, f2, colorProducer, aVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab addRipple_12SF9DM$lambda$0$0$0(AndroidRippleNode androidRippleNode) {
        DrawModifierNodeKt.invalidateDraw(androidRippleNode);
        return ab.f48028a;
    }

    private final RippleContainer getOrCreateRippleContainer() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            return rippleContainer;
        }
        RippleContainer rippleContainerCreateAndAttachRippleContainerIfNeeded = Ripple_androidKt.createAndAttachRippleContainerIfNeeded(Ripple_androidKt.findNearestViewGroup((View) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AndroidCompositionLocals_androidKt.getLocalView())));
        this.rippleContainer = rippleContainerCreateAndAttachRippleContainerIfNeeded;
        x.c(rippleContainerCreateAndAttachRippleContainerIfNeeded);
        return rippleContainerCreateAndAttachRippleContainerIfNeeded;
    }

    private final void setRippleHostView(RippleHostView rippleHostView) {
        this.rippleHostView = rippleHostView;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.material3.internal.ripple.RippleNode
    /* renamed from: addRipple-12SF9DM, reason: not valid java name */
    public void mo6390addRipple12SF9DM(PressInteraction.Press press, long j2, float f2) {
        RippleHostView rippleHostView = getOrCreateRippleContainer().getRippleHostView(this);
        RippleNodeConfig.Press press2 = getRippleNodeConfig().invoke().getPress();
        rippleHostView.m6399addRippleKOepWvA(press, getBounded(), j2, h.h.a.b(f2), m6402getRippleColor0d7_KjU(), press2 instanceof RippleNodeConfig.Press.Opacity ? ((RippleNodeConfig.Press.Opacity) press2).getAlpha() : 0.0f, new a() { // from class: androidx.compose.material3.internal.ripple.AndroidRippleNode$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return AndroidRippleNode.addRipple_12SF9DM$lambda$0$0$0(this.f$0);
            }
        });
        setRippleHostView(rippleHostView);
    }

    @Override // androidx.compose.material3.internal.ripple.RippleNode
    public void drawRipples(DrawScope drawScope) {
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        RippleHostView rippleHostView = this.rippleHostView;
        if (rippleHostView != null) {
            RippleNodeConfig.Press press = getRippleNodeConfig().invoke().getPress();
            rippleHostView.m6400setRipplePropertiesbiQXAtU(m6403getRippleSizeNHjbRc(), h.h.a.b(getTargetRadius()), m6402getRippleColor0d7_KjU(), press instanceof RippleNodeConfig.Press.Opacity ? ((RippleNodeConfig.Press.Opacity) press).getAlpha() : 0.0f);
            rippleHostView.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    @Override // androidx.compose.material3.internal.ripple.RippleNode, androidx.compose.ui.Modifier.Node
    public void onDetach() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            rippleContainer.disposeRippleIfNeeded(this);
        }
    }

    @Override // androidx.compose.material3.internal.ripple.RippleHostKey
    public void onResetRippleHostView() {
        setRippleHostView(null);
    }

    @Override // androidx.compose.material3.internal.ripple.RippleNode
    public void removeRipple(PressInteraction.Press press) {
        RippleHostView rippleHostView = this.rippleHostView;
        if (rippleHostView != null) {
            rippleHostView.removeRipple();
        }
    }

    public /* synthetic */ AndroidRippleNode(InteractionSource interactionSource, boolean z, float f2, ColorProducer colorProducer, a aVar, o oVar) {
        this(interactionSource, z, f2, colorProducer, aVar);
    }
}
