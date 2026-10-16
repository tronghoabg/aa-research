package androidx.compose.ui.graphics;

import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SimpleGraphicsLayerModifier$layerBlock$1 extends y implements l<GraphicsLayerScope, ab> {
    final /* synthetic */ SimpleGraphicsLayerModifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleGraphicsLayerModifier$layerBlock$1(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        super(1);
        this.this$0 = simpleGraphicsLayerModifier;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setScaleX(this.this$0.getScaleX());
        graphicsLayerScope.setScaleY(this.this$0.getScaleY());
        graphicsLayerScope.setAlpha(this.this$0.getAlpha());
        graphicsLayerScope.setTranslationX(this.this$0.getTranslationX());
        graphicsLayerScope.setTranslationY(this.this$0.getTranslationY());
        graphicsLayerScope.setShadowElevation(this.this$0.getShadowElevation());
        graphicsLayerScope.setRotationX(this.this$0.getRotationX());
        graphicsLayerScope.setRotationY(this.this$0.getRotationY());
        graphicsLayerScope.setRotationZ(this.this$0.getRotationZ());
        graphicsLayerScope.setCameraDistance(this.this$0.getCameraDistance());
        graphicsLayerScope.mo8413setTransformOrigin__ExYCQ(this.this$0.m8608getTransformOriginSzJe1aQ());
        graphicsLayerScope.setShape(this.this$0.getShape());
        graphicsLayerScope.setClip(this.this$0.getClip());
        graphicsLayerScope.setRenderEffect(this.this$0.getRenderEffect());
        graphicsLayerScope.mo8409setAmbientShadowColor8_81llA(this.this$0.m8604getAmbientShadowColor0d7_KjU());
        graphicsLayerScope.mo8412setSpotShadowColor8_81llA(this.this$0.m8607getSpotShadowColor0d7_KjU());
        graphicsLayerScope.mo8411setCompositingStrategyaDBOjCE(this.this$0.m8606getCompositingStrategyNrFUSI());
        graphicsLayerScope.mo8410setBlendModes9anfk8(this.this$0.m8605getBlendMode0nO6VwU());
        graphicsLayerScope.setColorFilter(this.this$0.getColorFilter());
        graphicsLayerScope.setOutsets(this.this$0.getOutsets());
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return ab.f48028a;
    }
}
