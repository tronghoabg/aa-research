package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MarqueeModifierElement extends ModifierNodeElement<MarqueeModifierNode> {
    private final int animationMode;
    private final int delayMillis;
    private final int initialDelayMillis;
    private final int iterations;
    private final MarqueeSpacing spacing;
    private final float velocity;

    private MarqueeModifierElement(int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2) {
        this.iterations = i2;
        this.animationMode = i3;
        this.delayMillis = i4;
        this.initialDelayMillis = i5;
        this.spacing = marqueeSpacing;
        this.velocity = f2;
    }

    private final int component1() {
        return this.iterations;
    }

    /* renamed from: component2-ZbEOnfQ, reason: not valid java name */
    private final int m2061component2ZbEOnfQ() {
        return this.animationMode;
    }

    private final int component3() {
        return this.delayMillis;
    }

    private final int component4() {
        return this.initialDelayMillis;
    }

    private final MarqueeSpacing component5() {
        return this.spacing;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m2062component6D9Ej5fM() {
        return this.velocity;
    }

    /* renamed from: copy-lWfNwf4$default, reason: not valid java name */
    public static /* synthetic */ MarqueeModifierElement m2063copylWfNwf4$default(MarqueeModifierElement marqueeModifierElement, int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = marqueeModifierElement.iterations;
        }
        if ((i6 & 2) != 0) {
            i3 = marqueeModifierElement.animationMode;
        }
        if ((i6 & 4) != 0) {
            i4 = marqueeModifierElement.delayMillis;
        }
        if ((i6 & 8) != 0) {
            i5 = marqueeModifierElement.initialDelayMillis;
        }
        if ((i6 & 16) != 0) {
            marqueeSpacing = marqueeModifierElement.spacing;
        }
        if ((i6 & 32) != 0) {
            f2 = marqueeModifierElement.velocity;
        }
        MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
        float f3 = f2;
        return marqueeModifierElement.m2064copylWfNwf4(i2, i3, i4, i5, marqueeSpacing2, f3);
    }

    /* renamed from: copy-lWfNwf4, reason: not valid java name */
    public final MarqueeModifierElement m2064copylWfNwf4(int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2) {
        return new MarqueeModifierElement(i2, i3, i4, i5, marqueeSpacing, f2, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public MarqueeModifierNode create() {
        return new MarqueeModifierNode(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
        return this.iterations == marqueeModifierElement.iterations && MarqueeAnimationMode.m2054equalsimpl0(this.animationMode, marqueeModifierElement.animationMode) && this.delayMillis == marqueeModifierElement.delayMillis && this.initialDelayMillis == marqueeModifierElement.initialDelayMillis && x.n(this.spacing, marqueeModifierElement.spacing) && Dp.m11169equalsimpl0(this.velocity, marqueeModifierElement.velocity);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((((this.iterations * 31) + this.animationMode) * 31) + this.delayMillis) * 31) + this.initialDelayMillis) * 31) + this.spacing.hashCode()) * 31) + Dp.m11170hashCodeimpl(this.velocity);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("basicMarquee");
        inspectorInfo.getProperties().set("iterations", Integer.valueOf(this.iterations));
        inspectorInfo.getProperties().set("animationMode", MarqueeAnimationMode.m2051boximpl(this.animationMode));
        inspectorInfo.getProperties().set("delayMillis", Integer.valueOf(this.delayMillis));
        inspectorInfo.getProperties().set("initialDelayMillis", Integer.valueOf(this.initialDelayMillis));
        inspectorInfo.getProperties().set("spacing", this.spacing);
        inspectorInfo.getProperties().set("velocity", Dp.m11162boximpl(this.velocity));
    }

    public String toString() {
        return "MarqueeModifierElement(iterations=" + this.iterations + ", animationMode=" + ((Object) MarqueeAnimationMode.m2056toStringimpl(this.animationMode)) + ", delayMillis=" + this.delayMillis + ", initialDelayMillis=" + this.initialDelayMillis + ", spacing=" + this.spacing + ", velocity=" + ((Object) Dp.m11175toStringimpl(this.velocity)) + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(MarqueeModifierNode marqueeModifierNode) {
        marqueeModifierNode.m2067updatelWfNwf4(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity);
    }

    public /* synthetic */ MarqueeModifierElement(int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2, o oVar) {
        this(i2, i3, i4, i5, marqueeSpacing, f2);
    }
}
