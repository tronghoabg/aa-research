package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import h.ab;
import h.g.a.a;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DelegatingThemeAwareRippleNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    private final boolean bounded;
    private final ColorProducer color;
    private final InteractionSource interactionSource;
    private final float radius;
    private DelegatableNode rippleNode;

    private DelegatingThemeAwareRippleNode(InteractionSource interactionSource, boolean z, float f2, ColorProducer colorProducer) {
        this.interactionSource = interactionSource;
        this.bounded = z;
        this.radius = f2;
        this.color = colorProducer;
    }

    private final void attachNewRipple() {
        DelegatableNode delegatableNodeM4310createRippleModifierNodeTDGSqEk = androidx.compose.material.ripple.RippleKt.m4310createRippleModifierNodeTDGSqEk(this.interactionSource, this.bounded, this.radius, new ColorProducer() { // from class: androidx.compose.material.DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1
            @Override // androidx.compose.ui.graphics.ColorProducer
            /* renamed from: invoke-0d7_KjU, reason: not valid java name */
            public final long mo4059invoke0d7_KjU() {
                long jMo4059invoke0d7_KjU = this.this$0.color.mo4059invoke0d7_KjU();
                if (jMo4059invoke0d7_KjU != 16) {
                    return jMo4059invoke0d7_KjU;
                }
                RippleConfiguration rippleConfiguration = (RippleConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, RippleKt.getLocalRippleConfiguration());
                if (rippleConfiguration != null && rippleConfiguration.m4165getColor0d7_KjU() != 16) {
                    return rippleConfiguration.m4165getColor0d7_KjU();
                }
                return RippleDefaults.INSTANCE.m4167rippleColor5vOe2sY(((Color) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, ContentColorKt.getLocalContentColor())).m8238unboximpl(), ((Colors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, ColorsKt.getLocalColors())).isLight());
            }
        }, new a() { // from class: androidx.compose.material.DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return DelegatingThemeAwareRippleNode.attachNewRipple$lambda$0(this.f$0);
            }
        });
        delegate(delegatableNodeM4310createRippleModifierNodeTDGSqEk);
        this.rippleNode = delegatableNodeM4310createRippleModifierNodeTDGSqEk;
    }

    static final RippleAlpha attachNewRipple$lambda$0(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        RippleAlpha rippleAlpha;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode2 = delegatingThemeAwareRippleNode;
        RippleConfiguration rippleConfiguration = (RippleConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode2, RippleKt.getLocalRippleConfiguration());
        return (rippleConfiguration == null || (rippleAlpha = rippleConfiguration.getRippleAlpha()) == null) ? RippleDefaults.INSTANCE.m4166rippleAlphaDxMtmZc(((Color) CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode2, ContentColorKt.getLocalContentColor())).m8238unboximpl(), ((Colors) CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode2, ColorsKt.getLocalColors())).isLight()) : rippleAlpha;
    }

    private final void removeRipple() {
        DelegatableNode delegatableNode = this.rippleNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.rippleNode = null;
    }

    private final void updateConfiguration() {
        ObserverModifierNodeKt.observeReads(this, new a() { // from class: androidx.compose.material.DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return DelegatingThemeAwareRippleNode.updateConfiguration$lambda$0(this.f$0);
            }
        });
    }

    static final ab updateConfiguration$lambda$0(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        if (((RippleConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode, RippleKt.getLocalRippleConfiguration())) == null) {
            delegatingThemeAwareRippleNode.removeRipple();
        } else if (delegatingThemeAwareRippleNode.rippleNode == null) {
            delegatingThemeAwareRippleNode.attachNewRipple();
        }
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateConfiguration();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        updateConfiguration();
    }

    public /* synthetic */ DelegatingThemeAwareRippleNode(InteractionSource interactionSource, boolean z, float f2, ColorProducer colorProducer, o oVar) {
        this(interactionSource, z, f2, colorProducer);
    }
}
