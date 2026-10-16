package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.RippleConfiguration;
import androidx.compose.material3.RippleThemeConfiguration;
import androidx.compose.material3.internal.ripple.RippleNodeConfig;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shape;
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
/* loaded from: classes2.dex */
final class DelegatingThemeAwareRippleNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    private final boolean bounded;
    private final ColorProducer color;
    private final boolean enableDragIndication;
    private final boolean enableFocusIndication;
    private final boolean enableHoverIndication;
    private final boolean enablePressIndication;
    private final Shape focusRingShape;
    private final InteractionSource interactionSource;
    private final float radius;
    private DelegatableNode rippleNode;

    private DelegatingThemeAwareRippleNode(InteractionSource interactionSource, boolean z, float f2, ColorProducer colorProducer, Shape shape, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.interactionSource = interactionSource;
        this.bounded = z;
        this.radius = f2;
        this.color = colorProducer;
        this.focusRingShape = shape;
        this.enablePressIndication = z2;
        this.enableFocusIndication = z3;
        this.enableHoverIndication = z4;
        this.enableDragIndication = z5;
    }

    private final void attachNewRipple() {
        ColorProducer colorProducer = new ColorProducer() { // from class: androidx.compose.material3.DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1
            @Override // androidx.compose.ui.graphics.ColorProducer
            /* renamed from: invoke-0d7_KjU */
            public final long mo4059invoke0d7_KjU() {
                long jMo4059invoke0d7_KjU = this.this$0.color.mo4059invoke0d7_KjU();
                if (jMo4059invoke0d7_KjU != 16) {
                    return jMo4059invoke0d7_KjU;
                }
                RippleConfiguration rippleConfiguration = (RippleConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, RippleKt.getLocalRippleConfiguration());
                return (rippleConfiguration == null || rippleConfiguration.m5408getColor0d7_KjU() == 16) ? ((Color) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, ContentColorKt.getLocalContentColor())).m8238unboximpl() : rippleConfiguration.m5408getColor0d7_KjU();
            }
        };
        final ColorProducer colorProducer2 = new ColorProducer() { // from class: androidx.compose.material3.DelegatingThemeAwareRippleNode$attachNewRipple$calculateOuterStrokeColor$1
            @Override // androidx.compose.ui.graphics.ColorProducer
            /* renamed from: invoke-0d7_KjU */
            public final long mo4059invoke0d7_KjU() {
                RippleConfiguration rippleConfiguration = (RippleConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, RippleKt.getLocalRippleConfiguration());
                return (rippleConfiguration != null ? rippleConfiguration.getFocus() : null) instanceof RippleConfiguration.Focus.InsetRing ? ((RippleConfiguration.Focus.InsetRing) rippleConfiguration.getFocus()).m5410getOuterStrokeColor0d7_KjU() : ((MaterialTheme.Values) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, MaterialTheme.INSTANCE.getLocalMaterialTheme())).getColorScheme().m4573getSecondary0d7_KjU();
            }
        };
        final ColorProducer colorProducer3 = new ColorProducer() { // from class: androidx.compose.material3.DelegatingThemeAwareRippleNode$attachNewRipple$calculateInnerStrokeColor$1
            @Override // androidx.compose.ui.graphics.ColorProducer
            /* renamed from: invoke-0d7_KjU */
            public final long mo4059invoke0d7_KjU() {
                RippleConfiguration rippleConfiguration = (RippleConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, RippleKt.getLocalRippleConfiguration());
                return (rippleConfiguration != null ? rippleConfiguration.getFocus() : null) instanceof RippleConfiguration.Focus.InsetRing ? ((RippleConfiguration.Focus.InsetRing) rippleConfiguration.getFocus()).m5409getInnerStrokeColor0d7_KjU() : ((MaterialTheme.Values) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, MaterialTheme.INSTANCE.getLocalMaterialTheme())).getColorScheme().m4556getOnSecondary0d7_KjU();
            }
        };
        DelegatableNode delegatableNodeM6401createRippleModifierNodeTDGSqEk = androidx.compose.material3.internal.ripple.RippleKt.m6401createRippleModifierNodeTDGSqEk(this.interactionSource, this.bounded, this.radius, colorProducer, new a() { // from class: androidx.compose.material3.DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return DelegatingThemeAwareRippleNode.attachNewRipple$lambda$0(this.f$0, colorProducer2, colorProducer3);
            }
        });
        delegate(delegatableNodeM6401createRippleModifierNodeTDGSqEk);
        this.rippleNode = delegatableNodeM6401createRippleModifierNodeTDGSqEk;
    }

    static final RippleNodeConfig attachNewRipple$lambda$0(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, ColorProducer colorProducer, ColorProducer colorProducer2) {
        RippleNodeConfig.Press.None opacity;
        RippleNodeConfig.Focus.None insetRing;
        RippleNodeConfig.Hover.None opacity2;
        RippleNodeConfig.Drag.None opacity3;
        RippleAlpha rippleAlpha;
        RippleAlpha rippleAlpha2;
        RippleAlpha rippleAlpha3;
        RippleAlpha rippleAlpha4;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode2 = delegatingThemeAwareRippleNode;
        MotionScheme motionScheme = ((MaterialTheme.Values) CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode2, MaterialTheme.INSTANCE.getLocalMaterialTheme())).getMotionScheme();
        RippleThemeConfiguration rippleThemeConfiguration = (RippleThemeConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode2, RippleKt.getLocalRippleThemeConfiguration());
        RippleConfiguration rippleConfiguration = (RippleConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode2, RippleKt.getLocalRippleConfiguration());
        float focusedAlpha = 0.1f;
        if (delegatingThemeAwareRippleNode.enablePressIndication) {
            opacity = new RippleNodeConfig.Press.Opacity((rippleConfiguration == null || (rippleAlpha4 = rippleConfiguration.getRippleAlpha()) == null) ? 0.1f : rippleAlpha4.getPressedAlpha());
        } else {
            opacity = RippleNodeConfig.Press.None.INSTANCE;
        }
        if (delegatingThemeAwareRippleNode.enableFocusIndication) {
            RippleThemeConfiguration.Focus focus = rippleThemeConfiguration.getFocus();
            if (focus instanceof RippleThemeConfiguration.Focus.Opacity) {
                if (rippleConfiguration != null && (rippleAlpha3 = rippleConfiguration.getRippleAlpha()) != null) {
                    focusedAlpha = rippleAlpha3.getFocusedAlpha();
                }
                insetRing = new RippleNodeConfig.Focus.Opacity(focusedAlpha);
            } else {
                if (!(focus instanceof RippleThemeConfiguration.Focus.InsetRing)) {
                    throw new IllegalStateException("Unknown focus ripple theme configuration");
                }
                insetRing = new RippleNodeConfig.Focus.InsetRing(delegatingThemeAwareRippleNode.focusRingShape, ((RippleThemeConfiguration.Focus.InsetRing) rippleThemeConfiguration.getFocus()).m5421getOuterStrokeInsetD9Ej5fM(), ((RippleThemeConfiguration.Focus.InsetRing) rippleThemeConfiguration.getFocus()).m5422getOuterStrokeWidthD9Ej5fM(), colorProducer, ((RippleThemeConfiguration.Focus.InsetRing) rippleThemeConfiguration.getFocus()).m5419getInnerStrokeInsetD9Ej5fM(), ((RippleThemeConfiguration.Focus.InsetRing) rippleThemeConfiguration.getFocus()).m5420getInnerStrokeWidthD9Ej5fM(), colorProducer2, motionScheme.fastSpatialSpec(), motionScheme.fastEffectsSpec(), null);
            }
        } else {
            insetRing = RippleNodeConfig.Focus.None.INSTANCE;
        }
        if (delegatingThemeAwareRippleNode.enableHoverIndication) {
            float hoveredAlpha = 0.08f;
            if (rippleConfiguration != null && (rippleAlpha2 = rippleConfiguration.getRippleAlpha()) != null) {
                hoveredAlpha = rippleAlpha2.getHoveredAlpha();
            }
            opacity2 = new RippleNodeConfig.Hover.Opacity(hoveredAlpha);
        } else {
            opacity2 = RippleNodeConfig.Hover.None.INSTANCE;
        }
        if (delegatingThemeAwareRippleNode.enableDragIndication) {
            float draggedAlpha = 0.16f;
            if (rippleConfiguration != null && (rippleAlpha = rippleConfiguration.getRippleAlpha()) != null) {
                draggedAlpha = rippleAlpha.getDraggedAlpha();
            }
            opacity3 = new RippleNodeConfig.Drag.Opacity(draggedAlpha);
        } else {
            opacity3 = RippleNodeConfig.Drag.None.INSTANCE;
        }
        return new RippleNodeConfig(opacity, insetRing, opacity2, opacity3);
    }

    private final void removeRipple() {
        DelegatableNode delegatableNode = this.rippleNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.rippleNode = null;
    }

    private final void updateConfiguration() {
        ObserverModifierNodeKt.observeReads(this, new a() { // from class: androidx.compose.material3.DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda0
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

    public /* synthetic */ DelegatingThemeAwareRippleNode(InteractionSource interactionSource, boolean z, float f2, ColorProducer colorProducer, Shape shape, boolean z2, boolean z3, boolean z4, boolean z5, o oVar) {
        this(interactionSource, z, f2, colorProducer, shape, z2, z3, z4, z5);
    }
}
