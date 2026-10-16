package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.BlurEffect;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class BlurKt$blur$1 extends y implements l<GraphicsLayerScope, ab> {
    final /* synthetic */ boolean $clip;
    final /* synthetic */ Shape $edgeTreatment;
    final /* synthetic */ float $radiusX;
    final /* synthetic */ float $radiusY;
    final /* synthetic */ int $tileMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlurKt$blur$1(float f2, float f3, int i2, Shape shape, boolean z) {
        super(1);
        this.$radiusX = f2;
        this.$radiusY = f3;
        this.$tileMode = i2;
        this.$edgeTreatment = shape;
        this.$clip = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
        float f2 = graphicsLayerScope.mo2127toPx0680j_4(this.$radiusX);
        float f3 = graphicsLayerScope.mo2127toPx0680j_4(this.$radiusY);
        BlurEffect blurEffectM8582BlurEffect3YTHUZs = null;
        if (f2 > 0.0f && f3 > 0.0f) {
            blurEffectM8582BlurEffect3YTHUZs = RenderEffectKt.m8582BlurEffect3YTHUZs(f2, f3, this.$tileMode);
        }
        graphicsLayerScope.setRenderEffect(blurEffectM8582BlurEffect3YTHUZs);
        Shape rectangleShape = this.$edgeTreatment;
        if (rectangleShape == null) {
            rectangleShape = RectangleShapeKt.getRectangleShape();
        }
        graphicsLayerScope.setShape(rectangleShape);
        graphicsLayerScope.setClip(this.$clip);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return ab.f48028a;
    }
}
