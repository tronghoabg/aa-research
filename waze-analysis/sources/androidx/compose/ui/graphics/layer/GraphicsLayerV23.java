package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GraphicsLayerV23 implements GraphicsLayerImpl {
    private static boolean testFailCreateRenderNode;
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
    private final long layerId;
    private Paint layerPaint;
    private Matrix matrix;
    private boolean outlineIsProvided;
    private long outlineSize;
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
    private boolean shouldManuallySetCenterPivot;
    private long size;
    private long spotShadowColor;
    private float translationX;
    private float translationY;
    private int x;
    private int y;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final AtomicBoolean needToValidateAccess = new AtomicBoolean(true);

    public GraphicsLayerV23(View view, long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.ownerId = j2;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.renderNode = renderNodeCreate;
        this.size = IntSize.Companion.m11344getZeroYbymL2g();
        this.outlineSize = IntSize.Companion.m11344getZeroYbymL2g();
        if (needToValidateAccess.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            verifyShadowColorProperties(renderNodeCreate);
            discardDisplayListInternal$ui_graphics();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        if (testFailCreateRenderNode) {
            throw new NoClassDefFoundError();
        }
        renderNodeCreate.setClipToBounds(false);
        m8954applyCompositingStrategyWpw9cng(CompositingStrategy.Companion.m8919getAutoke2Ky5w());
        this.compositingStrategy = CompositingStrategy.Companion.m8919getAutoke2Ky5w();
        this.blendMode = BlendMode.Companion.m8168getSrcOver0nO6VwU();
        this.alpha = 1.0f;
        this.pivotOffset = Offset.Companion.m7995getUnspecifiedF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.ambientShadowColor = Color.Companion.m8254getBlack0d7_KjU();
        this.spotShadowColor = Color.Companion.m8254getBlack0d7_KjU();
        this.cameraDistance = 8.0f;
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

    /* renamed from: applyCompositingStrategy-Wpw9cng, reason: not valid java name */
    private final void m8954applyCompositingStrategyWpw9cng(int i2) {
        boolean zM8915equalsimpl0 = CompositingStrategy.m8915equalsimpl0(i2, CompositingStrategy.Companion.m8921getOffscreenke2Ky5w());
        RenderNode renderNode = this.renderNode;
        if (zM8915equalsimpl0) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m8915equalsimpl0(i2, CompositingStrategy.Companion.m8920getModulateAlphake2Ky5w())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
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
        return (!CompositingStrategy.m8915equalsimpl0(mo8944getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m8921getOffscreenke2Ky5w()) && BlendMode.m8137equalsimpl0(mo8943getBlendMode0nO6VwU(), BlendMode.Companion.m8168getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m8954applyCompositingStrategyWpw9cng(CompositingStrategy.Companion.m8921getOffscreenke2Ky5w());
        } else {
            m8954applyCompositingStrategyWpw9cng(mo8944getCompositingStrategyke2Ky5w());
        }
    }

    private final void updatePivot() {
        if ((mo8945getPivotOffsetF1C5BW0() & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.shouldManuallySetCenterPivot = false;
            this.renderNode.setPivotX(Float.intBitsToFloat((int) (mo8945getPivotOffsetF1C5BW0() >> 32)) + this.outsetLeft);
            this.renderNode.setPivotY(Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & mo8945getPivotOffsetF1C5BW0())) + this.outsetTop);
            return;
        }
        this.shouldManuallySetCenterPivot = true;
        this.renderNode.setPivotX((((int) (this.size >> 32)) / 2.0f) + this.outsetLeft);
        this.renderNode.setPivotY((((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & this.size)) / 2.0f) + this.outsetTop);
    }

    private final void updatePosition() {
        int i2 = this.x;
        int i3 = i2 - this.outsetLeft;
        int i4 = this.y;
        int i5 = i4 - this.outsetTop;
        long j2 = this.size;
        this.renderNode.setLeftTopRightBottom(i3, i5, i2 + ((int) (j2 >> 32)) + this.outsetRight, i4 + ((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + this.outsetBottom);
    }

    private final void verifyShadowColorProperties(RenderNode renderNode) {
        RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = RenderNodeVerificationHelper28.INSTANCE;
        renderNodeVerificationHelper28.setAmbientShadowColor(renderNode, renderNodeVerificationHelper28.getAmbientShadowColor(renderNode));
        RenderNodeVerificationHelper28 renderNodeVerificationHelper282 = RenderNodeVerificationHelper28.INSTANCE;
        renderNodeVerificationHelper282.setSpotShadowColor(renderNode, renderNodeVerificationHelper282.getSpotShadowColor(renderNode));
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
        discardDisplayListInternal$ui_graphics();
    }

    public final void discardDisplayListInternal$ui_graphics() {
        RenderNodeVerificationHelper24.INSTANCE.discardDisplayList(this.renderNode);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void draw(Canvas canvas) {
        DisplayListCanvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        x.d(nativeCanvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        nativeCanvas.drawRenderNode(this.renderNode);
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
        return this.renderNode.isValid();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        return this.layerId;
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
    public void record(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, l<? super DrawScope, ab> lVar) throws Throwable {
        DisplayListCanvas displayListCanvas;
        CanvasHolder canvasHolder;
        android.graphics.Canvas internalCanvas;
        AndroidCanvas androidCanvas;
        DisplayListCanvas displayListCanvas2;
        CanvasDrawScope canvasDrawScope;
        Density density2;
        LayoutDirection layoutDirection2;
        Canvas canvas;
        CanvasHolder canvasHolder2;
        long jMo8758getSizeNHjbRc;
        GraphicsLayer graphicsLayer2;
        android.graphics.Canvas canvas2;
        int i2;
        int i3;
        DisplayListCanvas displayListCanvasStart = this.renderNode.start(Math.max(((int) (this.size >> 32)) + this.outsetLeft + this.outsetRight, (int) (this.outlineSize >> 32)), Math.max(((int) (this.size & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + this.outsetTop + this.outsetBottom, (int) (this.outlineSize & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        float f2 = this.outsetLeft;
        float f3 = this.outsetTop;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        try {
            canvasHolder = this.canvasHolder;
            internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas((android.graphics.Canvas) displayListCanvasStart);
            androidCanvas = canvasHolder.getAndroidCanvas();
            displayListCanvas2 = null;
        } catch (Throwable th) {
            th = th;
            displayListCanvas = displayListCanvasStart;
        }
        try {
            try {
                if (this.outsetLeft <= 0.0f) {
                    try {
                        if (this.outsetTop <= 0.0f) {
                            canvasDrawScope = this.canvasDrawScope;
                            long jM11351toSizeozmzZPI = IntSizeKt.m11351toSizeozmzZPI(this.size);
                            density2 = canvasDrawScope.getDrawContext().getDensity();
                            layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
                            canvas = canvasDrawScope.getDrawContext().getCanvas();
                            displayListCanvas2 = displayListCanvasStart;
                            canvasHolder2 = canvasHolder;
                            jMo8758getSizeNHjbRc = canvasDrawScope.getDrawContext().mo8758getSizeNHjbRc();
                            graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
                            canvas2 = internalCanvas;
                            DrawContext drawContext = canvasDrawScope.getDrawContext();
                            drawContext.setDensity(density);
                            drawContext.setLayoutDirection(layoutDirection);
                            drawContext.setCanvas(androidCanvas);
                            drawContext.mo8759setSizeuvyYCjk(jM11351toSizeozmzZPI);
                            drawContext.setGraphicsLayer(graphicsLayer);
                            androidCanvas.save();
                            try {
                                lVar.invoke(canvasDrawScope);
                                androidCanvas.restore();
                                DrawContext drawContext2 = canvasDrawScope.getDrawContext();
                                drawContext2.setDensity(density2);
                                drawContext2.setLayoutDirection(layoutDirection2);
                                drawContext2.setCanvas(canvas);
                                drawContext2.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
                                drawContext2.setGraphicsLayer(graphicsLayer2);
                                canvasHolder2.getAndroidCanvas().setInternalCanvas(canvas2);
                                this.renderNode.end(displayListCanvas2);
                                setInvalidated(false);
                                return;
                            } finally {
                                androidCanvas.restore();
                                DrawContext drawContext3 = canvasDrawScope.getDrawContext();
                                drawContext3.setDensity(density2);
                                drawContext3.setLayoutDirection(layoutDirection2);
                                drawContext3.setCanvas(canvas);
                                drawContext3.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
                                drawContext3.setGraphicsLayer(graphicsLayer2);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        displayListCanvas2 = displayListCanvasStart;
                        displayListCanvas = displayListCanvas2;
                        this.renderNode.end(displayListCanvas);
                        throw th;
                    }
                }
                lVar.invoke(canvasDrawScope);
                androidCanvas.restore();
                DrawContext drawContext4 = canvasDrawScope.getDrawContext();
                drawContext4.setDensity(density2);
                drawContext4.setLayoutDirection(layoutDirection2);
                drawContext4.setCanvas(canvas);
                drawContext4.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
                drawContext4.setGraphicsLayer(graphicsLayer2);
                androidCanvas.translate(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
                canvasHolder2.getAndroidCanvas().setInternalCanvas(canvas2);
                this.renderNode.end(displayListCanvas2);
                setInvalidated(false);
                return;
            } catch (Throwable th3) {
                displayListCanvas = displayListCanvas2;
                try {
                    throw th3;
                } catch (Throwable th4) {
                    th = th4;
                    this.renderNode.end(displayListCanvas);
                    throw th;
                }
            }
            displayListCanvas2 = displayListCanvasStart;
            canvasHolder2 = canvasHolder;
            canvas2 = internalCanvas;
            long j2 = (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
            i2 = (int) (j2 >> 32);
            float fIntBitsToFloat = Float.intBitsToFloat(i2);
            i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            androidCanvas.translate(fIntBitsToFloat, Float.intBitsToFloat(i3));
            canvasDrawScope = this.canvasDrawScope;
            long jM11351toSizeozmzZPI2 = IntSizeKt.m11351toSizeozmzZPI(this.size);
            density2 = canvasDrawScope.getDrawContext().getDensity();
            layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
            canvas = canvasDrawScope.getDrawContext().getCanvas();
            jMo8758getSizeNHjbRc = canvasDrawScope.getDrawContext().mo8758getSizeNHjbRc();
            graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
            DrawContext drawContext5 = canvasDrawScope.getDrawContext();
            drawContext5.setDensity(density);
            drawContext5.setLayoutDirection(layoutDirection);
            drawContext5.setCanvas(androidCanvas);
            drawContext5.mo8759setSizeuvyYCjk(jM11351toSizeozmzZPI2);
            drawContext5.setGraphicsLayer(graphicsLayer);
            androidCanvas.save();
        } catch (Throwable th5) {
            th = th5;
            displayListCanvas = displayListCanvas2;
            this.renderNode.end(displayListCanvas);
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
        RenderNodeVerificationHelper28.INSTANCE.setAmbientShadowColor(this.renderNode, ColorKt.m8282toArgb8_81llA(j2));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setBlendMode-s9anfk8 */
    public void mo8948setBlendModes9anfk8(int i2) {
        if (BlendMode.m8137equalsimpl0(this.blendMode, i2)) {
            return;
        }
        this.blendMode = i2;
        obtainLayerPaint().setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m8073toPorterDuffModes9anfk8(i2)));
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f2) {
        this.cameraDistance = f2;
        this.renderNode.setCameraDistance(-f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z) {
        this.clip = z;
        applyClip();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        if (colorFilter == null) {
            updateLayerProperties();
            return;
        }
        m8954applyCompositingStrategyWpw9cng(CompositingStrategy.Companion.m8921getOffscreenke2Ky5w());
        RenderNode renderNode = this.renderNode;
        Paint paintObtainLayerPaint = obtainLayerPaint();
        paintObtainLayerPaint.setColorFilter(AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter));
        renderNode.setLayerPaint(paintObtainLayerPaint);
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
        this.outlineSize = j2;
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
        boolean zM11337equalsimpl0 = IntSize.m11337equalsimpl0(this.size, j2);
        this.size = j2;
        updatePosition();
        if (zM11337equalsimpl0) {
            return;
        }
        if (this.shouldManuallySetCenterPivot || Offset.m7977equalsimpl0(mo8945getPivotOffsetF1C5BW0(), Offset.Companion.m7995getUnspecifiedF1C5BW0())) {
            this.renderNode.setPivotX((((int) (j2 >> 32)) / 2.0f) + this.outsetLeft);
            this.renderNode.setPivotY((((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / 2.0f) + this.outsetTop);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
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
        this.renderNode.setRotation(f2);
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
        RenderNodeVerificationHelper28.INSTANCE.setSpotShadowColor(this.renderNode, ColorKt.m8282toArgb8_81llA(j2));
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

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean getTestFailCreateRenderNode$ui_graphics() {
            return GraphicsLayerV23.testFailCreateRenderNode;
        }

        public final void setTestFailCreateRenderNode$ui_graphics(boolean z) {
            GraphicsLayerV23.testFailCreateRenderNode = z;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ GraphicsLayerV23(View view, long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i2, o oVar) {
        this(view, j2, (i2 & 4) != 0 ? new CanvasHolder() : canvasHolder, (i2 & 8) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
