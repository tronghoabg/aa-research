package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface DeviceRenderNode {
    void discardDisplayList();

    void drawInto(Canvas canvas);

    DeviceRenderNodeData dumpRenderNodeData();

    float getAlpha();

    int getAmbientShadowColor();

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    int mo10230getBlendMode0nO6VwU();

    int getBottom();

    float getCameraDistance();

    boolean getClipToBounds();

    boolean getClipToOutline();

    ColorFilter getColorFilter();

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    int mo10231getCompositingStrategyNrFUSI();

    float getElevation();

    boolean getHasDisplayList();

    int getHeight();

    void getInverseMatrix(Matrix matrix);

    int getLeft();

    void getMatrix(Matrix matrix);

    float getPivotX();

    float getPivotY();

    RenderEffect getRenderEffect();

    int getRight();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    int getSpotShadowColor();

    int getTop();

    float getTranslationX();

    float getTranslationY();

    long getUniqueId();

    int getWidth();

    void offsetLeftAndRight(int i2);

    void offsetTopAndBottom(int i2);

    void record(CanvasHolder canvasHolder, Path path, l<? super androidx.compose.ui.graphics.Canvas, ab> lVar);

    void setAlpha(float f2);

    void setAmbientShadowColor(int i2);

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    void mo10232setBlendModes9anfk8(int i2);

    void setCameraDistance(float f2);

    void setClipToBounds(boolean z);

    void setClipToOutline(boolean z);

    void setColorFilter(ColorFilter colorFilter);

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    void mo10233setCompositingStrategyaDBOjCE(int i2);

    void setElevation(float f2);

    boolean setHasOverlappingRendering(boolean z);

    void setOutline(Outline outline);

    void setPivotX(float f2);

    void setPivotY(float f2);

    boolean setPosition(int i2, int i3, int i4, int i5);

    void setRenderEffect(RenderEffect renderEffect);

    void setRotationX(float f2);

    void setRotationY(float f2);

    void setRotationZ(float f2);

    void setScaleX(float f2);

    void setScaleY(float f2);

    void setSpotShadowColor(int i2);

    void setTranslationX(float f2);

    void setTranslationY(float f2);
}
