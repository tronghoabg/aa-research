package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GraphicsLayerV29 implements GraphicsLayerImpl {
    public static final int $stable = 8;
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;
    private float cameraDistance;
    private final CanvasDrawScope canvasDrawScope;
    private final CanvasHolder canvasHolder;
    private boolean clip;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private boolean isInvalidated;
    private Paint layerPaint;
    private Matrix matrix;
    private boolean outlineIsProvided;
    private int outsetBottom;
    private int outsetLeft;
    private int outsetRight;
    private int outsetTop;
    private final long ownerId;
    private long pivotOffset;
    private RenderEffect renderEffect;
    private final RenderNode renderNode;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private long size;
    private long spotShadowColor;
    private float translationX;
    private float translationY;
    private int x;
    private int y;

    public GraphicsLayerV29(long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.ownerId = j2;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.renderNode = renderNode;
        this.size = Size.Companion.m8058getZeroNHjbRc();
        renderNode.setClipToBounds(false);
        m8955applyCompositingStrategyZ1X6vPc(renderNode, CompositingStrategy.Companion.m8919getAutoke2Ky5w());
        this.alpha = 1.0f;
        this.blendMode = BlendMode.Companion.m8168getSrcOver0nO6VwU();
        this.pivotOffset = Offset.Companion.m7995getUnspecifiedF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.ambientShadowColor = Color.Companion.m8254getBlack0d7_KjU();
        this.spotShadowColor = Color.Companion.m8254getBlack0d7_KjU();
        this.cameraDistance = 8.0f;
        this.compositingStrategy = CompositingStrategy.Companion.m8919getAutoke2Ky5w();
        this.isInvalidated = true;
    }

    private final void applyClip() {
        boolean z = getClip() && !this.outlineIsProvided;
        boolean z2 = getClip() && this.outlineIsProvided;
        if (z != this.clipToBounds) {
            this.clipToBounds = z;
            this.renderNode.setClipToBounds(z);
        }
        if (z2 != this.clipToOutline) {
            this.clipToOutline = z2;
            this.renderNode.setClipToOutline(z2);
        }
    }

    /* renamed from: applyCompositingStrategy-Z1X6vPc, reason: not valid java name */
    private final void m8955applyCompositingStrategyZ1X6vPc(RenderNode renderNode, int i2) {
        if (CompositingStrategy.m8915equalsimpl0(i2, CompositingStrategy.Companion.m8921getOffscreenke2Ky5w())) {
            renderNode.setUseCompositingLayer(true, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        boolean zM8915equalsimpl0 = CompositingStrategy.m8915equalsimpl0(i2, CompositingStrategy.Companion.m8920getModulateAlphake2Ky5w());
        Paint paint = this.layerPaint;
        if (zM8915equalsimpl0) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final Paint obtainLayerPaint() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.layerPaint = paint2;
        return paint2;
    }

    private final boolean requiresCompositingLayer() {
        return CompositingStrategy.m8915equalsimpl0(mo8944getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m8921getOffscreenke2Ky5w()) || requiresLayerPaint() || getRenderEffect() != null;
    }

    private final boolean requiresLayerPaint() {
        return (BlendMode.m8137equalsimpl0(mo8943getBlendMode0nO6VwU(), BlendMode.Companion.m8168getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateLayerProperties() {
        boolean zRequiresCompositingLayer = requiresCompositingLayer();
        RenderNode renderNode = this.renderNode;
        if (zRequiresCompositingLayer) {
            m8955applyCompositingStrategyZ1X6vPc(renderNode, CompositingStrategy.Companion.m8921getOffscreenke2Ky5w());
        } else {
            m8955applyCompositingStrategyZ1X6vPc(renderNode, mo8944getCompositingStrategyke2Ky5w());
        }
    }

    private final void updatePivot() {
        long jMo8945getPivotOffsetF1C5BW0 = mo8945getPivotOffsetF1C5BW0() & 9223372034707292159L;
        RenderNode renderNode = this.renderNode;
        if (jMo8945getPivotOffsetF1C5BW0 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.size >> 32)) / 2.0f) + this.outsetLeft);
            this.renderNode.setPivotY((Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & this.size)) / 2.0f) + this.outsetTop);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (mo8945getPivotOffsetF1C5BW0() >> 32)) + this.outsetLeft);
            this.renderNode.setPivotY(Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & mo8945getPivotOffsetF1C5BW0())) + this.outsetTop);
        }
    }

    private final void updatePosition() {
        int i2 = this.x;
        this.renderNode.setPosition(i2 - this.outsetLeft, this.y - this.outsetTop, i2 + ((int) Float.intBitsToFloat((int) (this.size >> 32))) + this.outsetRight, this.y + ((int) Float.intBitsToFloat((int) (this.size & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) + this.outsetBottom);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public Matrix calculateMatrix() {
        Matrix matrix = this.matrix;
        if (matrix == null) {
            matrix = new Matrix();
            this.matrix = matrix;
        }
        this.renderNode.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void draw(Canvas canvas) {
        AndroidCanvas_androidKt.getNativeCanvas(canvas).drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo8942getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getBlendMode-0nO6VwU */
    public int mo8943getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getCompositingStrategy-ke2Ky5w */
    public int mo8944getCompositingStrategyke2Ky5w() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getHasDisplayList() {
        return this.renderNode.hasDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getOwnerId() {
        return this.ownerId;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getPivotOffset-F1C5BW0 */
    public long mo8945getPivotOffsetF1C5BW0() {
        return this.pivotOffset;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getSpotShadowColor-0d7_KjU */
    public long mo8946getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public /* synthetic */ boolean getSupportsSoftwareRendering() {
        return false;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean isInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void record(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, l<? super DrawScope, ab> lVar) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        float f2 = this.outsetLeft;
        float f3 = this.outsetTop;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(recordingCanvasBeginRecording);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            DrawContext drawContext = this.canvasDrawScope.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setGraphicsLayer(graphicsLayer);
            drawContext.mo8759setSizeuvyYCjk(this.size);
            drawContext.setCanvas(androidCanvas);
            if (this.outsetLeft > 0.0f || this.outsetTop > 0.0f) {
                long j2 = (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
                int i2 = (int) (j2 >> 32);
                float fIntBitsToFloat = Float.intBitsToFloat(i2);
                int i3 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2);
                androidCanvas.translate(fIntBitsToFloat, Float.intBitsToFloat(i3));
                lVar.invoke(this.canvasDrawScope);
                androidCanvas.translate(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
            } else {
                lVar.invoke(this.canvasDrawScope);
            }
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
            this.renderNode.endRecording();
            setInvalidated(false);
        } catch (Throwable th) {
            this.renderNode.endRecording();
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float f2) {
        this.alpha = f2;
        this.renderNode.setAlpha(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo8947setAmbientShadowColor8_81llA(long j2) {
        this.ambientShadowColor = j2;
        this.renderNode.setAmbientShadowColor(ColorKt.m8282toArgb8_81llA(j2));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setBlendMode-s9anfk8 */
    public void mo8948setBlendModes9anfk8(int i2) {
        this.blendMode = i2;
        obtainLayerPaint().setBlendMode(AndroidBlendMode_androidKt.m8072toAndroidBlendModes9anfk8(i2));
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f2) {
        this.cameraDistance = f2;
        this.renderNode.setCameraDistance(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z) {
        this.clip = z;
        applyClip();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        obtainLayerPaint().setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setCompositingStrategy-Wpw9cng */
    public void mo8949setCompositingStrategyWpw9cng(int i2) {
        this.compositingStrategy = i2;
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setInvalidated(boolean z) {
        this.isInvalidated = z;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setOutline-O0kMr_c */
    public void mo8950setOutlineO0kMr_c(Outline outline, long j2) {
        this.renderNode.setOutline(outline);
        this.outlineIsProvided = outline != null;
        applyClip();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setOutsets(int i2, int i3, int i4, int i5) {
        if (i2 < 0 || i3 < 0 || i4 < 0 || i5 < 0) {
            androidx.compose.ui.graphics.InlineClassHelperKt.throwIllegalArgumentException("Outsets cannot be negative! Left: " + i2 + ", Top: " + i3 + ", Right: " + i4 + ", Bottom: " + i5);
        }
        int i6 = this.outsetLeft;
        if (i2 == i6 && i3 == this.outsetTop && i4 == this.outsetRight && i5 == this.outsetBottom) {
            return;
        }
        boolean z = true;
        if (i2 == i6 && i3 == this.outsetTop) {
            z = false;
        }
        this.outsetLeft = i2;
        this.outsetTop = i3;
        this.outsetRight = i4;
        this.outsetBottom = i5;
        updatePosition();
        if (z) {
            updatePivot();
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPivotOffset-k-4lQ0M */
    public void mo8951setPivotOffsetk4lQ0M(long j2) {
        this.pivotOffset = j2;
        updatePivot();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPosition-H0pRuoY */
    public void mo8952setPositionH0pRuoY(int i2, int i3, long j2) {
        this.x = i2;
        this.y = i3;
        boolean zM8045equalsimpl0 = Size.m8045equalsimpl0(this.size, IntSizeKt.m11351toSizeozmzZPI(j2));
        this.size = IntSizeKt.m11351toSizeozmzZPI(j2);
        updatePosition();
        if (zM8045equalsimpl0 || !Offset.m7977equalsimpl0(mo8945getPivotOffsetF1C5BW0(), Offset.Companion.m7995getUnspecifiedF1C5BW0())) {
            return;
        }
        this.renderNode.setPivotX((((int) (j2 >> 32)) / 2.0f) + this.outsetLeft);
        this.renderNode.setPivotY((((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / 2.0f) + this.outsetTop);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeVerificationHelper.INSTANCE.setRenderEffect(this.renderNode, renderEffect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float f2) {
        this.rotationX = f2;
        this.renderNode.setRotationX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float f2) {
        this.rotationY = f2;
        this.renderNode.setRotationY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float f2) {
        this.rotationZ = f2;
        this.renderNode.setRotationZ(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleX(float f2) {
        this.scaleX = f2;
        this.renderNode.setScaleX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float f2) {
        this.scaleY = f2;
        this.renderNode.setScaleY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float f2) {
        this.shadowElevation = f2;
        this.renderNode.setElevation(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo8953setSpotShadowColor8_81llA(long j2) {
        this.spotShadowColor = j2;
        this.renderNode.setSpotShadowColor(ColorKt.m8282toArgb8_81llA(j2));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f2) {
        this.translationX = f2;
        this.renderNode.setTranslationX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f2) {
        this.translationY = f2;
        this.renderNode.setTranslationY(f2);
    }

    public /* synthetic */ GraphicsLayerV29(long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i2, o oVar) {
        this(j2, (i2 & 2) != 0 ? new CanvasHolder() : canvasHolder, (i2 & 4) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
