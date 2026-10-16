package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    public /* synthetic */ PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2, o oVar) {
        this(painter, z, (i2 & 4) != 0 ? Alignment.Companion.getCenter() : alignment, (i2 & 8) != 0 ? ContentScale.Companion.getInside() : contentScale, (i2 & 16) != 0 ? 1.0f : f2, (i2 & 32) != 0 ? null : colorFilter);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m7810calculateScaledSizeE7KxVPU(long j2) {
        if (!getUseIntrinsicSize()) {
            return j2;
        }
        int i2 = (int) (j2 >> 32);
        float fIntBitsToFloat = !m7812hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo8959getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat(i2) : Float.intBitsToFloat((int) (this.painter.mo8959getIntrinsicSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = !m7811hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo8959getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) : Float.intBitsToFloat((int) (this.painter.mo8959getIntrinsicSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        if (Float.intBitsToFloat(i2) == 0.0f || Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)) == 0.0f) {
            return Size.Companion.m8058getZeroNHjbRc();
        }
        long j3 = jFloatToRawIntBits | jFloatToRawIntBits2;
        return ScaleFactorKt.m9878timesUQTWf7w(j3, this.contentScale.mo9734computeScaleFactorH7hwNQA(j3, j2));
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.mo8959getIntrinsicSizeNHjbRc() != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m7811hasSpecifiedAndFiniteHeightuvyYCjk(long j2) {
        return !Size.m8045equalsimpl0(j2, Size.Companion.m8057getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m7812hasSpecifiedAndFiniteWidthuvyYCjk(long j2) {
        return !Size.m8045equalsimpl0(j2, Size.Companion.m8057getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m7813modifyConstraintsZezNO4M(long j2) {
        boolean z = Constraints.m11103getHasBoundedWidthimpl(j2) && Constraints.m11102getHasBoundedHeightimpl(j2);
        boolean z2 = Constraints.m11105getHasFixedWidthimpl(j2) && Constraints.m11104getHasFixedHeightimpl(j2);
        if ((!getUseIntrinsicSize() && z) || z2) {
            return Constraints.m11097copyZbe2FdA$default(j2, Constraints.m11107getMaxWidthimpl(j2), 0, Constraints.m11106getMaxHeightimpl(j2), 0, 10, null);
        }
        long jMo8959getIntrinsicSizeNHjbRc = this.painter.mo8959getIntrinsicSizeNHjbRc();
        int iRound = m7812hasSpecifiedAndFiniteWidthuvyYCjk(jMo8959getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (jMo8959getIntrinsicSizeNHjbRc >> 32))) : Constraints.m11109getMinWidthimpl(j2);
        int iRound2 = m7811hasSpecifiedAndFiniteHeightuvyYCjk(jMo8959getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (jMo8959getIntrinsicSizeNHjbRc & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) : Constraints.m11108getMinHeightimpl(j2);
        long jM7810calculateScaledSizeE7KxVPU = m7810calculateScaledSizeE7KxVPU((Float.floatToRawIntBits(ConstraintsKt.m11123constrainHeightK40F9xA(j2, iRound2)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(ConstraintsKt.m11124constrainWidthK40F9xA(j2, iRound)) << 32));
        return Constraints.m11097copyZbe2FdA$default(j2, ConstraintsKt.m11124constrainWidthK40F9xA(j2, Math.round(Float.intBitsToFloat((int) (jM7810calculateScaledSizeE7KxVPU >> 32)))), 0, ConstraintsKt.m11123constrainHeightK40F9xA(j2, Math.round(Float.intBitsToFloat((int) (jM7810calculateScaledSizeE7KxVPU & MuxerUtil.UNSIGNED_INT_MAX_VALUE)))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        long jM8058getZeroNHjbRc;
        long jMo8959getIntrinsicSizeNHjbRc = this.painter.mo8959getIntrinsicSizeNHjbRc();
        float fIntBitsToFloat = m7812hasSpecifiedAndFiniteWidthuvyYCjk(jMo8959getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (jMo8959getIntrinsicSizeNHjbRc >> 32)) : Float.intBitsToFloat((int) (contentDrawScope.mo8751getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = m7811hasSpecifiedAndFiniteHeightuvyYCjk(jMo8959getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (jMo8959getIntrinsicSizeNHjbRc & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) : Float.intBitsToFloat((int) (contentDrawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
        long j2 = jFloatToRawIntBits << 32;
        long j3 = jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        if (Float.intBitsToFloat((int) (contentDrawScope.mo8751getSizeNHjbRc() >> 32)) == 0.0f || Float.intBitsToFloat((int) (contentDrawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) == 0.0f) {
            jM8058getZeroNHjbRc = Size.Companion.m8058getZeroNHjbRc();
        } else {
            long j4 = j2 | j3;
            jM8058getZeroNHjbRc = ScaleFactorKt.m9878timesUQTWf7w(j4, this.contentScale.mo9734computeScaleFactorH7hwNQA(j4, contentDrawScope.mo8751getSizeNHjbRc()));
        }
        long j5 = jM8058getZeroNHjbRc;
        long jMo7648alignKFBX0sM = this.alignment.mo7648alignKFBX0sM((Math.round(Float.intBitsToFloat((int) (j5 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (j5 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo8751getSizeNHjbRc() >> 32))) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)))), contentDrawScope.getLayoutDirection());
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        float fM11296getXimpl = IntOffset.m11296getXimpl(jMo7648alignKFBX0sM);
        float fM11297getYimpl = IntOffset.m11297getYimpl(jMo7648alignKFBX0sM);
        contentDrawScope2.getDrawContext().getTransform().translate(fM11296getXimpl, fM11297getYimpl);
        float f2 = -fM11296getXimpl;
        float f3 = -fM11297getYimpl;
        try {
            this.painter.m8965drawx_KDEd0(contentDrawScope2, j5, this.alpha, this.colorFilter);
            contentDrawScope2.getDrawContext().getTransform().translate(f2, f3);
            contentDrawScope.drawContent();
        } catch (Throwable th) {
            contentDrawScope2.getDrawContext().getTransform().translate(f2, f3);
            throw th;
        }
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicHeight(i2);
        }
        long jM7813modifyConstraintsZezNO4M = m7813modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null));
        return Math.max(Constraints.m11108getMinHeightimpl(jM7813modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicWidth(i2);
        }
        long jM7813modifyConstraintsZezNO4M = m7813modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null));
        return Math.max(Constraints.m11109getMinWidthimpl(jM7813modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(m7813modifyConstraintsZezNO4M(j2));
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new PainterNode$measure$1(placeableMo9741measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicHeight(i2);
        }
        long jM7813modifyConstraintsZezNO4M = m7813modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null));
        return Math.max(Constraints.m11108getMinHeightimpl(jM7813modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicWidth(i2);
        }
        long jM7813modifyConstraintsZezNO4M = m7813modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null));
        return Math.max(Constraints.m11109getMinWidthimpl(jM7813modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i2));
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAlpha(float f2) {
        this.alpha = f2;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public final void setContentScale(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final void setPainter(Painter painter) {
        this.painter = painter;
    }

    public final void setSizeToIntrinsics(boolean z) {
        this.sizeToIntrinsics = z;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
    }

    public PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f2;
        this.colorFilter = colorFilter;
    }
}
