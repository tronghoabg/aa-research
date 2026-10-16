package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.shadow.InnerShadowPainter;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class BlockInnerShadowNode extends Modifier.Node implements DrawModifierNode, ObserverModifierNode, InnerShadowScope {
    public static final int $stable = 0;
    private l<? super InnerShadowScope, ab> block;
    private boolean blockRead;
    private Brush brush;
    private Density densityObject;
    private float radius;
    private InnerShadowPainter shadowPainter;
    private Shape shape;
    private float spread;
    private Shadow targetShadow;
    private long offset = Offset.Companion.m7996getZeroF1C5BW0();
    private long color = Color.Companion.m8254getBlack0d7_KjU();
    private float alpha = 1.0f;
    private int blendMode = BlendMode.Companion.m8168getSrcOver0nO6VwU();

    public BlockInnerShadowNode(Shape shape, l<? super InnerShadowScope, ab> lVar) {
        this.shape = shape;
        this.block = lVar;
    }

    private final void invalidateShadow() {
        this.targetShadow = null;
        this.shadowPainter = null;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    private final InnerShadowPainter obtainPainter() {
        if (!this.blockRead) {
            this.blockRead = true;
            ShadowKt.resetShadow(this);
            ObserverModifierNodeKt.observeReads(this, new AnonymousClass1());
        }
        Shadow shadow = this.targetShadow;
        InnerShadowPainter innerShadowPainter = this.shadowPainter;
        Brush brush = getBrush();
        float fMo2123toDpu2uoSUM = mo2123toDpu2uoSUM(getRadius());
        float fMo2123toDpu2uoSUM2 = mo2123toDpu2uoSUM(getSpread());
        float fMo2123toDpu2uoSUM3 = mo2123toDpu2uoSUM(Float.intBitsToFloat((int) (mo7741getOffsetF1C5BW0() >> 32)));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(mo2123toDpu2uoSUM(Float.intBitsToFloat((int) (mo7741getOffsetF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fMo2123toDpu2uoSUM3) << 32);
        if (innerShadowPainter != null && shadow != null && Dp.m11169equalsimpl0(shadow.m8985getRadiusD9Ej5fM(), fMo2123toDpu2uoSUM) && Dp.m11169equalsimpl0(shadow.m8986getSpreadD9Ej5fM(), fMo2123toDpu2uoSUM2) && Color.m8229equalsimpl0(shadow.m8983getColor0d7_KjU(), mo7740getColor0d7_KjU()) && x.n(shadow.getBrush(), brush) && shadow.getAlpha() == getAlpha() && BlendMode.m8137equalsimpl0(shadow.m8982getBlendMode0nO6VwU(), mo7739getBlendMode0nO6VwU()) && DpOffset.m11224equalsimpl0(shadow.m8984getOffsetRKDOV3M(), jFloatToRawIntBits)) {
            return innerShadowPainter;
        }
        Shadow shadow2 = brush != null ? new Shadow(fMo2123toDpu2uoSUM, brush, fMo2123toDpu2uoSUM2, jFloatToRawIntBits, getAlpha(), mo7739getBlendMode0nO6VwU(), (o) null) : new Shadow(fMo2123toDpu2uoSUM, mo7740getColor0d7_KjU(), fMo2123toDpu2uoSUM2, jFloatToRawIntBits, getAlpha(), mo7739getBlendMode0nO6VwU(), (o) null);
        this.targetShadow = shadow2;
        InnerShadowPainter innerShadowPainterCreateInnerShadowPainter = DelegatableNodeKt.requireGraphicsContext(this).getShadowContext().createInnerShadowPainter(this.shape, shadow2);
        this.shadowPainter = innerShadowPainterCreateInnerShadowPainter;
        return innerShadowPainterCreateInnerShadowPainter;
    }

    private final void setBlock(l<? super InnerShadowScope, ab> lVar) {
        if (this.block != lVar) {
            this.block = lVar;
            this.blockRead = false;
            DrawModifierNodeKt.invalidateDraw(this);
        }
    }

    private final void setShape(Shape shape) {
        if (x.n(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        invalidateShadow();
    }

    private final void updateDensity() {
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        if (x.n(this.densityObject, densityRequireDensity)) {
            return;
        }
        this.densityObject = densityRequireDensity;
        this.blockRead = false;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        Painter.m8964drawx_KDEd0$default(obtainPainter(), contentDrawScope, contentDrawScope.mo8751getSizeNHjbRc(), 0.0f, null, 6, null);
        contentDrawScope.drawContent();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof BlockInnerShadowNode)) {
            BlockInnerShadowNode blockInnerShadowNode = (BlockInnerShadowNode) obj;
            return getAlpha() == blockInnerShadowNode.getAlpha() && x.n(this.shape, blockInnerShadowNode.shape) && this.block == blockInnerShadowNode.block && getRadius() == blockInnerShadowNode.getRadius() && getSpread() == blockInnerShadowNode.getSpread() && Offset.m7977equalsimpl0(mo7741getOffsetF1C5BW0(), blockInnerShadowNode.mo7741getOffsetF1C5BW0()) && Color.m8229equalsimpl0(mo7740getColor0d7_KjU(), blockInnerShadowNode.mo7740getColor0d7_KjU()) && x.n(getBrush(), blockInnerShadowNode.getBrush()) && BlendMode.m8137equalsimpl0(mo7739getBlendMode0nO6VwU(), blockInnerShadowNode.mo7739getBlendMode0nO6VwU());
        }
        return false;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: getBlendMode-0nO6VwU */
    public int mo7739getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public Brush getBrush() {
        return this.brush;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: getColor-0d7_KjU */
    public long mo7740getColor0d7_KjU() {
        return this.color;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        Density density = this.densityObject;
        if (density != null) {
            return density.getDensity();
        }
        return 1.0f;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        Density density = this.densityObject;
        if (density != null) {
            return density.getFontScale();
        }
        return 1.0f;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: getOffset-F1C5BW0 */
    public long mo7741getOffsetF1C5BW0() {
        return this.offset;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public float getRadius() {
        return this.radius;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public float getSpread() {
        return this.spread;
    }

    public int hashCode() {
        int iFloatToIntBits = (((((((Float.floatToIntBits(getAlpha()) * 31) + this.shape.hashCode()) * 31) + this.block.hashCode()) * 31) + Float.floatToIntBits(getRadius())) * 31) + Float.floatToIntBits(getSpread());
        int iM7982hashCodeimpl = Offset.m7982hashCodeimpl(mo7741getOffsetF1C5BW0());
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(mo7740getColor0d7_KjU());
        Brush brush = getBrush();
        return (((((((iFloatToIntBits * 31) + iM7982hashCodeimpl) * 31) + iM8235hashCodeimpl) * 31) + (brush != null ? brush.hashCode() : 0)) * 31) + mo7739getBlendMode0nO6VwU();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDensity();
    }

    @Override // androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        if (isAttached()) {
            updateDensity();
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        this.blockRead = false;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo2120roundToPxR2X_6o(long j2) {
        return Density.CC.m11128$default$roundToPxR2X_6o(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo2121roundToPx0680j_4(float f2) {
        return Density.CC.m11129$default$roundToPx0680j_4(this, f2);
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public void setAlpha(float f2) {
        if (this.alpha == f2) {
            return;
        }
        this.alpha = f2;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: setBlendMode-s9anfk8 */
    public void mo7742setBlendModes9anfk8(int i2) {
        if (BlendMode.m8137equalsimpl0(this.blendMode, i2)) {
            return;
        }
        this.blendMode = i2;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public void setBrush(Brush brush) {
        if (x.n(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: setColor-8_81llA */
    public void mo7743setColor8_81llA(long j2) {
        if (j2 == 16) {
            j2 = Color.Companion.m8254getBlack0d7_KjU();
        }
        if (Color.m8229equalsimpl0(this.color, j2)) {
            return;
        }
        this.color = j2;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: setOffset-k-4lQ0M */
    public void mo7744setOffsetk4lQ0M(long j2) {
        if (Offset.m7977equalsimpl0(this.offset, j2)) {
            return;
        }
        this.offset = j2;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public void setRadius(float f2) {
        if (this.radius == f2) {
            return;
        }
        this.radius = f2;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public void setSpread(float f2) {
        if (this.spread == f2) {
            return;
        }
        this.spread = f2;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo2122toDpGaN1DYA(long j2) {
        return FontScaling.CC.m11273$default$toDpGaN1DYA(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo2123toDpu2uoSUM(float f2) {
        return Density.CC.m11130$default$toDpu2uoSUM(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo2125toDpSizekrfVVM(long j2) {
        return Density.CC.m11132$default$toDpSizekrfVVM(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo2126toPxR2X_6o(long j2) {
        return Density.CC.m11133$default$toPxR2X_6o(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo2127toPx0680j_4(float f2) {
        return Density.CC.m11134$default$toPx0680j_4(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return Density.CC.$default$toRect(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo2128toSizeXkaWNTQ(long j2) {
        return Density.CC.m11135$default$toSizeXkaWNTQ(this, j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo2129toSp0xMU5do(float f2) {
        return FontScaling.CC.m11274$default$toSp0xMU5do(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo2130toSpkPz2Gy4(float f2) {
        return Density.CC.m11136$default$toSpkPz2Gy4(this, f2);
    }

    public final void update(Shape shape, l<? super InnerShadowScope, ab> lVar) {
        setShape(shape);
        setBlock(lVar);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo2124toDpu2uoSUM(int i2) {
        return Density.CC.m11131$default$toDpu2uoSUM((Density) this, i2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo2131toSpkPz2Gy4(int i2) {
        return Density.CC.m11137$default$toSpkPz2Gy4((Density) this, i2);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.draw.BlockInnerShadowNode$obtainPainter$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements a<ab> {
        AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BlockInnerShadowNode blockInnerShadowNode = BlockInnerShadowNode.this;
            blockInnerShadowNode.block.invoke(blockInnerShadowNode);
        }

        @Override // h.g.a.a
        public /* bridge */ /* synthetic */ ab invoke() {
            invoke2();
            return ab.f48028a;
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
    }
}
