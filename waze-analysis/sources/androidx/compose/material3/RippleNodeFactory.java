package androidx.compose.material3;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class RippleNodeFactory implements IndicationNodeFactory {
    private final boolean bounded;
    private final long color;
    private final ColorProducer colorProducer;
    private final boolean enableDragIndication;
    private final boolean enableFocusIndication;
    private final boolean enableHoverIndication;
    private final boolean enablePressIndication;
    private final Shape focusRingShape;
    private final float radius;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private RippleNodeFactory(boolean r13, float r14, androidx.compose.ui.graphics.ColorProducer r15, androidx.compose.ui.graphics.Shape r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r12 = this;
            androidx.compose.ui.graphics.Color$Companion r0 = androidx.compose.ui.graphics.Color.Companion
            long r5 = r0.m8264getUnspecified0d7_KjU()
            if (r16 != 0) goto L41
            androidx.compose.ui.unit.Dp r0 = androidx.compose.ui.unit.Dp.m11162boximpl(r14)
            float r1 = r0.m11178unboximpl()
            androidx.compose.ui.unit.Dp$Companion r2 = androidx.compose.ui.unit.Dp.Companion
            float r2 = r2.m11184getUnspecifiedD9Ej5fM()
            boolean r1 = androidx.compose.ui.unit.Dp.m11169equalsimpl0(r1, r2)
            r2 = 0
            r3 = 1
            if (r3 != r1) goto L1f
            r0 = r2
        L1f:
            if (r0 == 0) goto L29
            float r0 = r0.m11178unboximpl()
            androidx.compose.foundation.shape.RoundedCornerShape r2 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(r0)
        L29:
            if (r2 == 0) goto L2f
            r0 = r2
            androidx.compose.ui.graphics.Shape r0 = (androidx.compose.ui.graphics.Shape) r0
            goto L33
        L2f:
            androidx.compose.ui.graphics.Shape r0 = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape()
        L33:
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r7 = r0
            goto L4f
        L41:
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
        L4f:
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.RippleNodeFactory.<init>(boolean, float, androidx.compose.ui.graphics.ColorProducer, androidx.compose.ui.graphics.Shape, boolean, boolean, boolean, boolean):void");
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public DelegatableNode create(InteractionSource interactionSource) {
        ColorProducer colorProducer = this.colorProducer;
        if (colorProducer == null) {
            colorProducer = new ColorProducer() { // from class: androidx.compose.material3.RippleNodeFactory$create$colorProducer$1
                @Override // androidx.compose.ui.graphics.ColorProducer
                /* renamed from: invoke-0d7_KjU */
                public final long mo4059invoke0d7_KjU() {
                    return this.this$0.color;
                }
            };
        }
        return new DelegatingThemeAwareRippleNode(interactionSource, this.bounded, this.radius, colorProducer, this.focusRingShape, this.enablePressIndication, this.enableFocusIndication, this.enableHoverIndication, this.enableDragIndication, null);
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
        return this.bounded == rippleNodeFactory.bounded && Dp.m11169equalsimpl0(this.radius, rippleNodeFactory.radius) && x.n(this.colorProducer, rippleNodeFactory.colorProducer) && Color.m8229equalsimpl0(this.color, rippleNodeFactory.color) && x.n(this.focusRingShape, rippleNodeFactory.focusRingShape) && this.enablePressIndication == rippleNodeFactory.enablePressIndication && this.enableFocusIndication == rippleNodeFactory.enableFocusIndication && this.enableHoverIndication == rippleNodeFactory.enableHoverIndication && this.enableDragIndication == rippleNodeFactory.enableDragIndication;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public int hashCode() {
        int iM = (RippleNodeFactory$$ExternalSyntheticBackport0.m(this.bounded) * 31) + Dp.m11170hashCodeimpl(this.radius);
        ColorProducer colorProducer = this.colorProducer;
        return (((((((((((((iM * 31) + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31) + Color.m8235hashCodeimpl(this.color)) * 31) + this.focusRingShape.hashCode()) * 31) + RippleNodeFactory$$ExternalSyntheticBackport0.m(this.enablePressIndication)) * 31) + RippleNodeFactory$$ExternalSyntheticBackport0.m(this.enableFocusIndication)) * 31) + RippleNodeFactory$$ExternalSyntheticBackport0.m(this.enableHoverIndication)) * 31) + RippleNodeFactory$$ExternalSyntheticBackport0.m(this.enableDragIndication);
    }

    @Override // androidx.compose.foundation.Indication
    public /* synthetic */ IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i2) {
        return Indication.CC.$default$rememberUpdatedInstance(this, interactionSource, composer, i2);
    }

    private RippleNodeFactory(boolean z, float f2, ColorProducer colorProducer, long j2, Shape shape, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.bounded = z;
        this.radius = f2;
        this.colorProducer = colorProducer;
        this.color = j2;
        this.focusRingShape = shape;
        this.enablePressIndication = z2;
        this.enableFocusIndication = z3;
        this.enableHoverIndication = z4;
        this.enableDragIndication = z5;
    }

    public /* synthetic */ RippleNodeFactory(boolean z, float f2, ColorProducer colorProducer, Shape shape, boolean z2, boolean z3, boolean z4, boolean z5, o oVar) {
        this(z, f2, colorProducer, shape, z2, z3, z4, z5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private RippleNodeFactory(boolean z, float f2, long j2, Shape shape, boolean z2, boolean z3, boolean z4, boolean z5) {
        Shape shape2;
        RoundedCornerShape rectangleShape;
        if (shape == null) {
            Dp dpM11162boximpl = Dp.m11162boximpl(f2);
            dpM11162boximpl = true == Dp.m11169equalsimpl0(dpM11162boximpl.m11178unboximpl(), Dp.Companion.m11184getUnspecifiedD9Ej5fM()) ? null : dpM11162boximpl;
            RoundedCornerShape roundedCornerShapeM3086RoundedCornerShape0680j_4 = dpM11162boximpl != null ? RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(dpM11162boximpl.m11178unboximpl()) : null;
            if (roundedCornerShapeM3086RoundedCornerShape0680j_4 != null) {
                rectangleShape = roundedCornerShapeM3086RoundedCornerShape0680j_4;
            } else {
                rectangleShape = RectangleShapeKt.getRectangleShape();
            }
            shape2 = rectangleShape;
        } else {
            shape2 = shape;
        }
        this(z, f2, (ColorProducer) null, j2, shape2, z2, z3, z4, z5);
    }

    public /* synthetic */ RippleNodeFactory(boolean z, float f2, long j2, Shape shape, boolean z2, boolean z3, boolean z4, boolean z5, o oVar) {
        this(z, f2, j2, shape, z2, z3, z4, z5);
    }
}
