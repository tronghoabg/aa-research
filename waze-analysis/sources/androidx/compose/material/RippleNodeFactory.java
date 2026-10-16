package androidx.compose.material;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class RippleNodeFactory implements IndicationNodeFactory {
    private final boolean bounded;
    private final long color;
    private final ColorProducer colorProducer;
    private final float radius;

    private RippleNodeFactory(boolean z, float f2, ColorProducer colorProducer) {
        this(z, f2, colorProducer, Color.Companion.m8264getUnspecified0d7_KjU());
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public DelegatableNode create(InteractionSource interactionSource) {
        ColorProducer colorProducer = this.colorProducer;
        if (colorProducer == null) {
            colorProducer = new ColorProducer() { // from class: androidx.compose.material.RippleNodeFactory$create$colorProducer$1
                @Override // androidx.compose.ui.graphics.ColorProducer
                /* renamed from: invoke-0d7_KjU */
                public final long mo4059invoke0d7_KjU() {
                    return this.this$0.color;
                }
            };
        }
        return new DelegatingThemeAwareRippleNode(interactionSource, this.bounded, this.radius, colorProducer, null);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleNodeFactory)) {
            return false;
        }
        RippleNodeFactory rippleNodeFactory = (RippleNodeFactory) obj;
        if (this.bounded == rippleNodeFactory.bounded && Dp.m11169equalsimpl0(this.radius, rippleNodeFactory.radius) && x.n(this.colorProducer, rippleNodeFactory.colorProducer)) {
            return Color.m8229equalsimpl0(this.color, rippleNodeFactory.color);
        }
        return false;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public int hashCode() {
        int iM = (RippleNodeFactory$$ExternalSyntheticBackport0.m(this.bounded) * 31) + Dp.m11170hashCodeimpl(this.radius);
        ColorProducer colorProducer = this.colorProducer;
        return (((iM * 31) + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31) + Color.m8235hashCodeimpl(this.color);
    }

    @Override // androidx.compose.foundation.Indication
    public /* synthetic */ IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i2) {
        return Indication.CC.$default$rememberUpdatedInstance(this, interactionSource, composer, i2);
    }

    private RippleNodeFactory(boolean z, float f2, ColorProducer colorProducer, long j2) {
        this.bounded = z;
        this.radius = f2;
        this.colorProducer = colorProducer;
        this.color = j2;
    }

    public /* synthetic */ RippleNodeFactory(boolean z, float f2, ColorProducer colorProducer, o oVar) {
        this(z, f2, colorProducer);
    }

    private RippleNodeFactory(boolean z, float f2, long j2) {
        this(z, f2, (ColorProducer) null, j2);
    }

    public /* synthetic */ RippleNodeFactory(boolean z, float f2, long j2, o oVar) {
        this(z, f2, j2);
    }
}
