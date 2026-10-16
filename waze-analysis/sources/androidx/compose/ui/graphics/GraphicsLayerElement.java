package androidx.compose.ui.graphics;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class GraphicsLayerElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {
    private final float alpha;
    private final long ambientShadowColor;
    private final int blendMode;
    private final float cameraDistance;
    private final boolean clip;
    private final ColorFilter colorFilter;
    private final int compositingStrategy;
    private final LayerOutsets outsets;
    private final RenderEffect renderEffect;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;
    private final Shape shape;
    private final long spotShadowColor;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    private GraphicsLayerElement(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect, long j3, long j4, int i2, int i3, ColorFilter colorFilter, LayerOutsets layerOutsets) {
        this.scaleX = f2;
        this.scaleY = f3;
        this.alpha = f4;
        this.translationX = f5;
        this.translationY = f6;
        this.shadowElevation = f7;
        this.rotationX = f8;
        this.rotationY = f9;
        this.rotationZ = f10;
        this.cameraDistance = f11;
        this.transformOrigin = j2;
        this.shape = shape;
        this.clip = z;
        this.renderEffect = renderEffect;
        this.ambientShadowColor = j3;
        this.spotShadowColor = j4;
        this.compositingStrategy = i2;
        this.blendMode = i3;
        this.colorFilter = colorFilter;
        this.outsets = layerOutsets;
    }

    /* renamed from: copy-Ln22Ef4$default, reason: not valid java name */
    public static /* synthetic */ GraphicsLayerElement m8379copyLn22Ef4$default(GraphicsLayerElement graphicsLayerElement, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect, long j3, long j4, int i2, int i3, ColorFilter colorFilter, LayerOutsets layerOutsets, int i4, Object obj) {
        LayerOutsets layerOutsets2;
        ColorFilter colorFilter2;
        float f12 = (i4 & 1) != 0 ? graphicsLayerElement.scaleX : f2;
        float f13 = (i4 & 2) != 0 ? graphicsLayerElement.scaleY : f3;
        float f14 = (i4 & 4) != 0 ? graphicsLayerElement.alpha : f4;
        float f15 = (i4 & 8) != 0 ? graphicsLayerElement.translationX : f5;
        float f16 = (i4 & 16) != 0 ? graphicsLayerElement.translationY : f6;
        float f17 = (i4 & 32) != 0 ? graphicsLayerElement.shadowElevation : f7;
        float f18 = (i4 & 64) != 0 ? graphicsLayerElement.rotationX : f8;
        float f19 = (i4 & 128) != 0 ? graphicsLayerElement.rotationY : f9;
        float f20 = (i4 & 256) != 0 ? graphicsLayerElement.rotationZ : f10;
        float f21 = (i4 & 512) != 0 ? graphicsLayerElement.cameraDistance : f11;
        long j5 = (i4 & 1024) != 0 ? graphicsLayerElement.transformOrigin : j2;
        Shape shape2 = (i4 & 2048) != 0 ? graphicsLayerElement.shape : shape;
        boolean z2 = (i4 & 4096) != 0 ? graphicsLayerElement.clip : z;
        float f22 = f12;
        RenderEffect renderEffect2 = (i4 & 8192) != 0 ? graphicsLayerElement.renderEffect : renderEffect;
        long j6 = (i4 & 16384) != 0 ? graphicsLayerElement.ambientShadowColor : j3;
        long j7 = (i4 & 32768) != 0 ? graphicsLayerElement.spotShadowColor : j4;
        int i5 = (i4 & 65536) != 0 ? graphicsLayerElement.compositingStrategy : i2;
        int i6 = (i4 & 131072) != 0 ? graphicsLayerElement.blendMode : i3;
        int i7 = i5;
        ColorFilter colorFilter3 = (i4 & 262144) != 0 ? graphicsLayerElement.colorFilter : colorFilter;
        if ((i4 & 524288) != 0) {
            colorFilter2 = colorFilter3;
            layerOutsets2 = graphicsLayerElement.outsets;
        } else {
            layerOutsets2 = layerOutsets;
            colorFilter2 = colorFilter3;
        }
        return graphicsLayerElement.m8385copyLn22Ef4(f22, f13, f14, f15, f16, f17, f18, f19, f20, f21, j5, shape2, z2, renderEffect2, j6, j7, i7, i6, colorFilter2, layerOutsets2);
    }

    public final float component1() {
        return this.scaleX;
    }

    public final float component10() {
        return this.cameraDistance;
    }

    /* renamed from: component11-SzJe1aQ, reason: not valid java name */
    public final long m8380component11SzJe1aQ() {
        return this.transformOrigin;
    }

    public final Shape component12() {
        return this.shape;
    }

    public final boolean component13() {
        return this.clip;
    }

    public final RenderEffect component14() {
        return this.renderEffect;
    }

    /* renamed from: component15-0d7_KjU, reason: not valid java name */
    public final long m8381component150d7_KjU() {
        return this.ambientShadowColor;
    }

    /* renamed from: component16-0d7_KjU, reason: not valid java name */
    public final long m8382component160d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: component17--NrFUSI, reason: not valid java name */
    public final int m8383component17NrFUSI() {
        return this.compositingStrategy;
    }

    /* renamed from: component18-0nO6VwU, reason: not valid java name */
    public final int m8384component180nO6VwU() {
        return this.blendMode;
    }

    public final ColorFilter component19() {
        return this.colorFilter;
    }

    public final float component2() {
        return this.scaleY;
    }

    public final LayerOutsets component20() {
        return this.outsets;
    }

    public final float component3() {
        return this.alpha;
    }

    public final float component4() {
        return this.translationX;
    }

    public final float component5() {
        return this.translationY;
    }

    public final float component6() {
        return this.shadowElevation;
    }

    public final float component7() {
        return this.rotationX;
    }

    public final float component8() {
        return this.rotationY;
    }

    public final float component9() {
        return this.rotationZ;
    }

    /* renamed from: copy-Ln22Ef4, reason: not valid java name */
    public final GraphicsLayerElement m8385copyLn22Ef4(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect, long j3, long j4, int i2, int i3, ColorFilter colorFilter, LayerOutsets layerOutsets) {
        return new GraphicsLayerElement(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z, renderEffect, j3, j4, i2, i3, colorFilter, layerOutsets, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SimpleGraphicsLayerModifier create() {
        return new SimpleGraphicsLayerModifier(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, this.renderEffect, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, this.blendMode, this.colorFilter, this.outsets, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.scaleX, graphicsLayerElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerElement.cameraDistance) == 0 && TransformOrigin.m8665equalsimpl0(this.transformOrigin, graphicsLayerElement.transformOrigin) && x.n(this.shape, graphicsLayerElement.shape) && this.clip == graphicsLayerElement.clip && x.n(this.renderEffect, graphicsLayerElement.renderEffect) && Color.m8229equalsimpl0(this.ambientShadowColor, graphicsLayerElement.ambientShadowColor) && Color.m8229equalsimpl0(this.spotShadowColor, graphicsLayerElement.spotShadowColor) && CompositingStrategy.m8313equalsimpl0(this.compositingStrategy, graphicsLayerElement.compositingStrategy) && BlendMode.m8137equalsimpl0(this.blendMode, graphicsLayerElement.blendMode) && x.n(this.colorFilter, graphicsLayerElement.colorFilter) && x.n(this.outsets, graphicsLayerElement.outsets);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m8386getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m8387getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m8388getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    public final LayerOutsets getOutsets() {
        return this.outsets;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m8389getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m8390getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iFloatToIntBits = (((((((((((((((((((((Float.floatToIntBits(this.scaleX) * 31) + Float.floatToIntBits(this.scaleY)) * 31) + Float.floatToIntBits(this.alpha)) * 31) + Float.floatToIntBits(this.translationX)) * 31) + Float.floatToIntBits(this.translationY)) * 31) + Float.floatToIntBits(this.shadowElevation)) * 31) + Float.floatToIntBits(this.rotationX)) * 31) + Float.floatToIntBits(this.rotationY)) * 31) + Float.floatToIntBits(this.rotationZ)) * 31) + Float.floatToIntBits(this.cameraDistance)) * 31) + TransformOrigin.m8668hashCodeimpl(this.transformOrigin)) * 31) + this.shape.hashCode();
        RenderEffect renderEffect = this.renderEffect;
        int iM = ((((((((((((iFloatToIntBits * 31) + GraphicsLayerElement$$ExternalSyntheticBackport0.m(this.clip)) * 31) + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31) + Color.m8235hashCodeimpl(this.ambientShadowColor)) * 31) + Color.m8235hashCodeimpl(this.spotShadowColor)) * 31) + this.compositingStrategy) * 31) + this.blendMode) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return ((iM + (colorFilter != null ? colorFilter.hashCode() : 0)) * 31) + this.outsets.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", Float.valueOf(this.scaleX));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.scaleY));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.translationX));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.translationY));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.shadowElevation));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.rotationX));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.rotationY));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.rotationZ));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.cameraDistance));
        inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m8658boximpl(this.transformOrigin));
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.clip));
        inspectorInfo.getProperties().set("renderEffect", this.renderEffect);
        inspectorInfo.getProperties().set("ambientShadowColor", Color.m8218boximpl(this.ambientShadowColor));
        inspectorInfo.getProperties().set("spotShadowColor", Color.m8218boximpl(this.spotShadowColor));
        inspectorInfo.getProperties().set("compositingStrategy", CompositingStrategy.m8310boximpl(this.compositingStrategy));
        inspectorInfo.getProperties().set("blendMode", BlendMode.m8134boximpl(this.blendMode));
        inspectorInfo.getProperties().set("colorFilter", this.colorFilter);
        inspectorInfo.getProperties().set("outsets", this.outsets);
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha=" + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) TransformOrigin.m8669toStringimpl(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) Color.m8236toStringimpl(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) Color.m8236toStringimpl(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) CompositingStrategy.m8315toStringimpl(this.compositingStrategy)) + ", blendMode=" + ((Object) BlendMode.m8139toStringimpl(this.blendMode)) + ", colorFilter=" + this.colorFilter + ", outsets=" + this.outsets + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        simpleGraphicsLayerModifier.setScaleX(this.scaleX);
        simpleGraphicsLayerModifier.setScaleY(this.scaleY);
        simpleGraphicsLayerModifier.setAlpha(this.alpha);
        simpleGraphicsLayerModifier.setTranslationX(this.translationX);
        simpleGraphicsLayerModifier.setTranslationY(this.translationY);
        simpleGraphicsLayerModifier.setShadowElevation(this.shadowElevation);
        simpleGraphicsLayerModifier.setRotationX(this.rotationX);
        simpleGraphicsLayerModifier.setRotationY(this.rotationY);
        simpleGraphicsLayerModifier.setRotationZ(this.rotationZ);
        simpleGraphicsLayerModifier.setCameraDistance(this.cameraDistance);
        simpleGraphicsLayerModifier.m8613setTransformOrigin__ExYCQ(this.transformOrigin);
        simpleGraphicsLayerModifier.setShape(this.shape);
        simpleGraphicsLayerModifier.setClip(this.clip);
        simpleGraphicsLayerModifier.setRenderEffect(this.renderEffect);
        simpleGraphicsLayerModifier.m8609setAmbientShadowColor8_81llA(this.ambientShadowColor);
        simpleGraphicsLayerModifier.m8612setSpotShadowColor8_81llA(this.spotShadowColor);
        simpleGraphicsLayerModifier.m8611setCompositingStrategyaDBOjCE(this.compositingStrategy);
        simpleGraphicsLayerModifier.m8610setBlendModes9anfk8(this.blendMode);
        simpleGraphicsLayerModifier.setColorFilter(this.colorFilter);
        simpleGraphicsLayerModifier.setOutsets(this.outsets);
        simpleGraphicsLayerModifier.invalidateLayerBlock();
    }

    public /* synthetic */ GraphicsLayerElement(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect, long j3, long j4, int i2, int i3, ColorFilter colorFilter, LayerOutsets layerOutsets, o oVar) {
        this(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z, renderEffect, j3, j4, i2, i3, colorFilter, layerOutsets);
    }
}
