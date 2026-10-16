package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface GraphicsLayerImpl {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.layer.GraphicsLayerImpl$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$getHasDisplayList(GraphicsLayerImpl graphicsLayerImpl) {
            return true;
        }

        public static boolean $default$getSupportsSoftwareRendering(GraphicsLayerImpl graphicsLayerImpl) {
            return false;
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final l<DrawScope, ab> DefaultDrawBlock = GraphicsLayerImpl$Companion$DefaultDrawBlock$1.INSTANCE;

        private Companion() {
        }

        public final l<DrawScope, ab> getDefaultDrawBlock() {
            return DefaultDrawBlock;
        }
    }

    Matrix calculateMatrix();

    void discardDisplayList();

    void draw(Canvas canvas);

    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    long mo8942getAmbientShadowColor0d7_KjU();

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    int mo8943getBlendMode0nO6VwU();

    float getCameraDistance();

    boolean getClip();

    ColorFilter getColorFilter();

    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    int mo8944getCompositingStrategyke2Ky5w();

    boolean getHasDisplayList();

    long getLayerId();

    long getOwnerId();

    /* renamed from: getPivotOffset-F1C5BW0, reason: not valid java name */
    long mo8945getPivotOffsetF1C5BW0();

    RenderEffect getRenderEffect();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    long mo8946getSpotShadowColor0d7_KjU();

    boolean getSupportsSoftwareRendering();

    float getTranslationX();

    float getTranslationY();

    boolean isInvalidated();

    void record(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, l<? super DrawScope, ab> lVar);

    void setAlpha(float f2);

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    void mo8947setAmbientShadowColor8_81llA(long j2);

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    void mo8948setBlendModes9anfk8(int i2);

    void setCameraDistance(float f2);

    void setClip(boolean z);

    void setColorFilter(ColorFilter colorFilter);

    /* renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    void mo8949setCompositingStrategyWpw9cng(int i2);

    void setInvalidated(boolean z);

    /* renamed from: setOutline-O0kMr_c, reason: not valid java name */
    void mo8950setOutlineO0kMr_c(Outline outline, long j2);

    void setOutsets(int i2, int i3, int i4, int i5);

    /* renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    void mo8951setPivotOffsetk4lQ0M(long j2);

    /* renamed from: setPosition-H0pRuoY, reason: not valid java name */
    void mo8952setPositionH0pRuoY(int i2, int i3, long j2);

    void setRenderEffect(RenderEffect renderEffect);

    void setRotationX(float f2);

    void setRotationY(float f2);

    void setRotationZ(float f2);

    void setScaleX(float f2);

    void setScaleY(float f2);

    void setShadowElevation(float f2);

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    void mo8953setSpotShadowColor8_81llA(long j2);

    void setTranslationX(float f2);

    void setTranslationY(float f2);
}
