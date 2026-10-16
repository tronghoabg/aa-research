package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class IndicatorLineElement extends ModifierNodeElement<IndicatorLineNode> {
    public static final int $stable = 0;
    private final TextFieldColors colors;
    private final boolean enabled;
    private final float focusedIndicatorLineThickness;
    private final InteractionSource interactionSource;
    private final boolean isError;
    private final Shape textFieldShape;
    private final float unfocusedIndicatorLineThickness;

    private IndicatorLineElement(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f2, float f3) {
        this.enabled = z;
        this.isError = z2;
        this.interactionSource = interactionSource;
        this.colors = textFieldColors;
        this.textFieldShape = shape;
        this.focusedIndicatorLineThickness = f2;
        this.unfocusedIndicatorLineThickness = f3;
    }

    /* renamed from: copy-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ IndicatorLineElement m5049copygv0btCI$default(IndicatorLineElement indicatorLineElement, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = indicatorLineElement.enabled;
        }
        if ((i2 & 2) != 0) {
            z2 = indicatorLineElement.isError;
        }
        if ((i2 & 4) != 0) {
            interactionSource = indicatorLineElement.interactionSource;
        }
        if ((i2 & 8) != 0) {
            textFieldColors = indicatorLineElement.colors;
        }
        if ((i2 & 16) != 0) {
            shape = indicatorLineElement.textFieldShape;
        }
        if ((i2 & 32) != 0) {
            f2 = indicatorLineElement.focusedIndicatorLineThickness;
        }
        if ((i2 & 64) != 0) {
            f3 = indicatorLineElement.unfocusedIndicatorLineThickness;
        }
        float f4 = f2;
        float f5 = f3;
        Shape shape2 = shape;
        InteractionSource interactionSource2 = interactionSource;
        return indicatorLineElement.m5052copygv0btCI(z, z2, interactionSource2, textFieldColors, shape2, f4, f5);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final boolean component2() {
        return this.isError;
    }

    public final InteractionSource component3() {
        return this.interactionSource;
    }

    public final TextFieldColors component4() {
        return this.colors;
    }

    public final Shape component5() {
        return this.textFieldShape;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    public final float m5050component6D9Ej5fM() {
        return this.focusedIndicatorLineThickness;
    }

    /* renamed from: component7-D9Ej5fM, reason: not valid java name */
    public final float m5051component7D9Ej5fM() {
        return this.unfocusedIndicatorLineThickness;
    }

    /* renamed from: copy-gv0btCI, reason: not valid java name */
    public final IndicatorLineElement m5052copygv0btCI(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f2, float f3) {
        return new IndicatorLineElement(z, z2, interactionSource, textFieldColors, shape, f2, f3, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public IndicatorLineNode create() {
        return new IndicatorLineNode(this.enabled, this.isError, this.interactionSource, this.colors, this.textFieldShape, this.focusedIndicatorLineThickness, this.unfocusedIndicatorLineThickness, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicatorLineElement)) {
            return false;
        }
        IndicatorLineElement indicatorLineElement = (IndicatorLineElement) obj;
        return this.enabled == indicatorLineElement.enabled && this.isError == indicatorLineElement.isError && x.n(this.interactionSource, indicatorLineElement.interactionSource) && x.n(this.colors, indicatorLineElement.colors) && x.n(this.textFieldShape, indicatorLineElement.textFieldShape) && Dp.m11169equalsimpl0(this.focusedIndicatorLineThickness, indicatorLineElement.focusedIndicatorLineThickness) && Dp.m11169equalsimpl0(this.unfocusedIndicatorLineThickness, indicatorLineElement.unfocusedIndicatorLineThickness);
    }

    public final TextFieldColors getColors() {
        return this.colors;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: getFocusedIndicatorLineThickness-D9Ej5fM, reason: not valid java name */
    public final float m5053getFocusedIndicatorLineThicknessD9Ej5fM() {
        return this.focusedIndicatorLineThickness;
    }

    public final InteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final Shape getTextFieldShape() {
        return this.textFieldShape;
    }

    /* renamed from: getUnfocusedIndicatorLineThickness-D9Ej5fM, reason: not valid java name */
    public final float m5054getUnfocusedIndicatorLineThicknessD9Ej5fM() {
        return this.unfocusedIndicatorLineThickness;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iM = (((IndicatorLineElement$$ExternalSyntheticBackport0.m(this.enabled) * 31) + IndicatorLineElement$$ExternalSyntheticBackport0.m(this.isError)) * 31) + this.interactionSource.hashCode();
        TextFieldColors textFieldColors = this.colors;
        int iHashCode = ((iM * 31) + (textFieldColors == null ? 0 : textFieldColors.hashCode())) * 31;
        Shape shape = this.textFieldShape;
        return ((((iHashCode + (shape != null ? shape.hashCode() : 0)) * 31) + Dp.m11170hashCodeimpl(this.focusedIndicatorLineThickness)) * 31) + Dp.m11170hashCodeimpl(this.unfocusedIndicatorLineThickness);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("indicatorLine");
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("isError", Boolean.valueOf(this.isError));
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("colors", this.colors);
        inspectorInfo.getProperties().set("textFieldShape", this.textFieldShape);
        inspectorInfo.getProperties().set("focusedIndicatorLineThickness", Dp.m11162boximpl(this.focusedIndicatorLineThickness));
        inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", Dp.m11162boximpl(this.unfocusedIndicatorLineThickness));
    }

    public final boolean isError() {
        return this.isError;
    }

    public String toString() {
        return "IndicatorLineElement(enabled=" + this.enabled + ", isError=" + this.isError + ", interactionSource=" + this.interactionSource + ", colors=" + this.colors + ", textFieldShape=" + this.textFieldShape + ", focusedIndicatorLineThickness=" + ((Object) Dp.m11175toStringimpl(this.focusedIndicatorLineThickness)) + ", unfocusedIndicatorLineThickness=" + ((Object) Dp.m11175toStringimpl(this.unfocusedIndicatorLineThickness)) + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(IndicatorLineNode indicatorLineNode) {
        indicatorLineNode.m5055updategv0btCI(this.enabled, this.isError, this.interactionSource, this.colors, this.textFieldShape, this.focusedIndicatorLineThickness, this.unfocusedIndicatorLineThickness);
    }

    public /* synthetic */ IndicatorLineElement(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f2, float f3, o oVar) {
        this(z, z2, interactionSource, textFieldColors, shape, f2, f3);
    }
}
