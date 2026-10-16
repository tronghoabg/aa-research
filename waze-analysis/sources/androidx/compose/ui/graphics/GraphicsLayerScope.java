package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.PlacementScopeMarker;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;

/* compiled from: WazeSource */
@PlacementScopeMarker
/* loaded from: classes.dex */
public interface GraphicsLayerScope extends Density {
    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    long mo8403getAmbientShadowColor0d7_KjU();

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    int mo8404getBlendMode0nO6VwU();

    float getCameraDistance();

    boolean getClip();

    ColorFilter getColorFilter();

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    int mo8405getCompositingStrategyNrFUSI();

    LayerOutsets getOutsets();

    RenderEffect getRenderEffect();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    Shape getShape();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    long mo8406getSizeNHjbRc();

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    long mo8407getSpotShadowColor0d7_KjU();

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    long mo8408getTransformOriginSzJe1aQ();

    float getTranslationX();

    float getTranslationY();

    void setAlpha(float f2);

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    void mo8409setAmbientShadowColor8_81llA(long j2);

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    void mo8410setBlendModes9anfk8(int i2);

    void setCameraDistance(float f2);

    void setClip(boolean z);

    void setColorFilter(ColorFilter colorFilter);

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    void mo8411setCompositingStrategyaDBOjCE(int i2);

    void setOutsets(LayerOutsets layerOutsets);

    void setRenderEffect(RenderEffect renderEffect);

    void setRotationX(float f2);

    void setRotationY(float f2);

    void setRotationZ(float f2);

    void setScaleX(float f2);

    void setScaleY(float f2);

    void setShadowElevation(float f2);

    void setShape(Shape shape);

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    void mo8412setSpotShadowColor8_81llA(long j2);

    /* renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    void mo8413setTransformOrigin__ExYCQ(long j2);

    void setTranslationX(float f2);

    void setTranslationY(float f2);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.GraphicsLayerScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: $default$getAmbientShadowColor-0d7_KjU, reason: not valid java name */
        public static long m8414$default$getAmbientShadowColor0d7_KjU(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScopeKt.getDefaultShadowColor();
        }

        /* renamed from: $default$getBlendMode-0nO6VwU, reason: not valid java name */
        public static int m8415$default$getBlendMode0nO6VwU(GraphicsLayerScope graphicsLayerScope) {
            return BlendMode.Companion.m8168getSrcOver0nO6VwU();
        }

        public static ColorFilter $default$getColorFilter(GraphicsLayerScope graphicsLayerScope) {
            return null;
        }

        /* renamed from: $default$getCompositingStrategy--NrFUSI, reason: not valid java name */
        public static int m8416$default$getCompositingStrategyNrFUSI(GraphicsLayerScope graphicsLayerScope) {
            return CompositingStrategy.Companion.m8317getAutoNrFUSI();
        }

        public static LayerOutsets $default$getOutsets(GraphicsLayerScope graphicsLayerScope) {
            return LayerOutsets.Companion.getZero();
        }

        public static RenderEffect $default$getRenderEffect(GraphicsLayerScope graphicsLayerScope) {
            return null;
        }

        /* renamed from: $default$getSize-NH-jbRc, reason: not valid java name */
        public static long m8417$default$getSizeNHjbRc(GraphicsLayerScope graphicsLayerScope) {
            return Size.Companion.m8057getUnspecifiedNHjbRc();
        }

        /* renamed from: $default$getSpotShadowColor-0d7_KjU, reason: not valid java name */
        public static long m8418$default$getSpotShadowColor0d7_KjU(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScopeKt.getDefaultShadowColor();
        }

        public static /* synthetic */ ColorFilter access$getColorFilter$jd(GraphicsLayerScope graphicsLayerScope) {
            return null;
        }

        public static /* synthetic */ RenderEffect access$getRenderEffect$jd(GraphicsLayerScope graphicsLayerScope) {
            return null;
        }

        /* renamed from: $default$setAmbientShadowColor-8_81llA, reason: not valid java name */
        public static void m8419$default$setAmbientShadowColor8_81llA(GraphicsLayerScope graphicsLayerScope, long j2) {
        }

        /* renamed from: $default$setBlendMode-s9anfk8, reason: not valid java name */
        public static void m8420$default$setBlendModes9anfk8(GraphicsLayerScope graphicsLayerScope, int i2) {
        }

        public static void $default$setColorFilter(GraphicsLayerScope graphicsLayerScope, ColorFilter colorFilter) {
        }

        /* renamed from: $default$setCompositingStrategy-aDBOjCE, reason: not valid java name */
        public static void m8421$default$setCompositingStrategyaDBOjCE(GraphicsLayerScope graphicsLayerScope, int i2) {
        }

        public static void $default$setOutsets(GraphicsLayerScope graphicsLayerScope, LayerOutsets layerOutsets) {
        }

        public static void $default$setRenderEffect(GraphicsLayerScope graphicsLayerScope, RenderEffect renderEffect) {
        }

        /* renamed from: $default$setSpotShadowColor-8_81llA, reason: not valid java name */
        public static void m8422$default$setSpotShadowColor8_81llA(GraphicsLayerScope graphicsLayerScope, long j2) {
        }

        /* renamed from: access$setAmbientShadowColor-8_81llA$jd, reason: not valid java name */
        public static /* synthetic */ void m8430access$setAmbientShadowColor8_81llA$jd(GraphicsLayerScope graphicsLayerScope, long j2) {
        }

        /* renamed from: access$setBlendMode-s9anfk8$jd, reason: not valid java name */
        public static /* synthetic */ void m8431access$setBlendModes9anfk8$jd(GraphicsLayerScope graphicsLayerScope, int i2) {
        }

        public static /* synthetic */ void access$setColorFilter$jd(GraphicsLayerScope graphicsLayerScope, ColorFilter colorFilter) {
        }

        /* renamed from: access$setCompositingStrategy-aDBOjCE$jd, reason: not valid java name */
        public static /* synthetic */ void m8432access$setCompositingStrategyaDBOjCE$jd(GraphicsLayerScope graphicsLayerScope, int i2) {
        }

        public static /* synthetic */ void access$setOutsets$jd(GraphicsLayerScope graphicsLayerScope, LayerOutsets layerOutsets) {
        }

        public static /* synthetic */ void access$setRenderEffect$jd(GraphicsLayerScope graphicsLayerScope, RenderEffect renderEffect) {
        }

        /* renamed from: access$setSpotShadowColor-8_81llA$jd, reason: not valid java name */
        public static /* synthetic */ void m8433access$setSpotShadowColor8_81llA$jd(GraphicsLayerScope graphicsLayerScope, long j2) {
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
        public static long m8444getAmbientShadowColor0d7_KjU(GraphicsLayerScope graphicsLayerScope) {
            return CC.m8414$default$getAmbientShadowColor0d7_KjU(graphicsLayerScope);
        }

        @Deprecated
        /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
        public static int m8445getBlendMode0nO6VwU(GraphicsLayerScope graphicsLayerScope) {
            return CC.m8415$default$getBlendMode0nO6VwU(graphicsLayerScope);
        }

        @Deprecated
        public static ColorFilter getColorFilter(GraphicsLayerScope graphicsLayerScope) {
            return null;
        }

        @Deprecated
        /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
        public static int m8446getCompositingStrategyNrFUSI(GraphicsLayerScope graphicsLayerScope) {
            return CC.m8416$default$getCompositingStrategyNrFUSI(graphicsLayerScope);
        }

        @Deprecated
        public static LayerOutsets getOutsets(GraphicsLayerScope graphicsLayerScope) {
            return CC.$default$getOutsets(graphicsLayerScope);
        }

        @Deprecated
        public static RenderEffect getRenderEffect(GraphicsLayerScope graphicsLayerScope) {
            return null;
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m8447getSizeNHjbRc(GraphicsLayerScope graphicsLayerScope) {
            return CC.m8417$default$getSizeNHjbRc(graphicsLayerScope);
        }

        @Deprecated
        /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
        public static long m8448getSpotShadowColor0d7_KjU(GraphicsLayerScope graphicsLayerScope) {
            return CC.m8418$default$getSpotShadowColor0d7_KjU(graphicsLayerScope);
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m8449roundToPxR2X_6o(GraphicsLayerScope graphicsLayerScope, long j2) {
            return Density.CC.m11128$default$roundToPxR2X_6o(graphicsLayerScope, j2);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m8450roundToPx0680j_4(GraphicsLayerScope graphicsLayerScope, float f2) {
            return Density.CC.m11129$default$roundToPx0680j_4(graphicsLayerScope, f2);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m8455toDpGaN1DYA(GraphicsLayerScope graphicsLayerScope, long j2) {
            return FontScaling.CC.m11273$default$toDpGaN1DYA(graphicsLayerScope, j2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m8456toDpu2uoSUM(GraphicsLayerScope graphicsLayerScope, float f2) {
            return Density.CC.m11130$default$toDpu2uoSUM(graphicsLayerScope, f2);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m8458toDpSizekrfVVM(GraphicsLayerScope graphicsLayerScope, long j2) {
            return Density.CC.m11132$default$toDpSizekrfVVM(graphicsLayerScope, j2);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m8459toPxR2X_6o(GraphicsLayerScope graphicsLayerScope, long j2) {
            return Density.CC.m11133$default$toPxR2X_6o(graphicsLayerScope, j2);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m8460toPx0680j_4(GraphicsLayerScope graphicsLayerScope, float f2) {
            return Density.CC.m11134$default$toPx0680j_4(graphicsLayerScope, f2);
        }

        @Deprecated
        public static Rect toRect(GraphicsLayerScope graphicsLayerScope, DpRect dpRect) {
            return Density.CC.$default$toRect(graphicsLayerScope, dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m8461toSizeXkaWNTQ(GraphicsLayerScope graphicsLayerScope, long j2) {
            return Density.CC.m11135$default$toSizeXkaWNTQ(graphicsLayerScope, j2);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m8462toSp0xMU5do(GraphicsLayerScope graphicsLayerScope, float f2) {
            return FontScaling.CC.m11274$default$toSp0xMU5do(graphicsLayerScope, f2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m8463toSpkPz2Gy4(GraphicsLayerScope graphicsLayerScope, float f2) {
            return Density.CC.m11136$default$toSpkPz2Gy4(graphicsLayerScope, f2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m8457toDpu2uoSUM(GraphicsLayerScope graphicsLayerScope, int i2) {
            return Density.CC.m11131$default$toDpu2uoSUM((Density) graphicsLayerScope, i2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m8464toSpkPz2Gy4(GraphicsLayerScope graphicsLayerScope, int i2) {
            return Density.CC.m11137$default$toSpkPz2Gy4((Density) graphicsLayerScope, i2);
        }

        public static /* synthetic */ void getClip$annotations() {
        }

        @Deprecated
        /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
        public static void m8451setAmbientShadowColor8_81llA(GraphicsLayerScope graphicsLayerScope, long j2) {
        }

        @Deprecated
        /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
        public static void m8452setBlendModes9anfk8(GraphicsLayerScope graphicsLayerScope, int i2) {
        }

        @Deprecated
        public static void setColorFilter(GraphicsLayerScope graphicsLayerScope, ColorFilter colorFilter) {
        }

        @Deprecated
        /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
        public static void m8453setCompositingStrategyaDBOjCE(GraphicsLayerScope graphicsLayerScope, int i2) {
        }

        @Deprecated
        public static void setOutsets(GraphicsLayerScope graphicsLayerScope, LayerOutsets layerOutsets) {
        }

        @Deprecated
        public static void setRenderEffect(GraphicsLayerScope graphicsLayerScope, RenderEffect renderEffect) {
        }

        @Deprecated
        /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
        public static void m8454setSpotShadowColor8_81llA(GraphicsLayerScope graphicsLayerScope, long j2) {
        }
    }
}
