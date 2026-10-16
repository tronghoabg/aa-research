package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GraphicsViewLayer implements GraphicsLayerImpl {
    private static final Canvas PlaceholderCanvas;
    private static final boolean mayRenderInSoftware;
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;
    private final CanvasHolder canvasHolder;
    private boolean clipBoundsInvalidated;
    private final Rect clipRect;
    private boolean clipToBounds;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private boolean isInvalidated;
    private final DrawChildContainer layerContainer;
    private final long layerId;
    private Paint layerPaint;
    private boolean outlineIsProvided;
    private int outsetBottom;
    private int outsetLeft;
    private int outsetRight;
    private int outsetTop;
    private final long ownerId;
    private final Picture picture;
    private final CanvasHolder pictureCanvasHolder;
    private final CanvasDrawScope pictureDrawScope;
    private long pivotOffset;
    private RenderEffect renderEffect;
    private final Resources resources;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private boolean shouldManuallySetCenterPivot;
    private long size;
    private long spotShadowColor;
    private final boolean supportsSoftwareRendering;
    private float translationX;
    private float translationY;
    private final ViewLayer viewLayer;
    private int x;
    private int y;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    static {
        SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable();
        mayRenderInSoftware = false;
        PlaceholderCanvas = new Canvas() { // from class: androidx.compose.ui.graphics.layer.GraphicsViewLayer$Companion$PlaceholderCanvas$1
            @Override // android.graphics.Canvas
            public boolean isHardwareAccelerated() {
                return true;
            }
        };
    }

    public GraphicsViewLayer(DrawChildContainer drawChildContainer, long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.layerContainer = drawChildContainer;
        this.ownerId = j2;
        this.canvasHolder = canvasHolder;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, canvasHolder, canvasDrawScope);
        this.viewLayer = viewLayer;
        this.resources = drawChildContainer.getResources();
        this.clipRect = new Rect();
        boolean z = mayRenderInSoftware;
        this.picture = z ? new Picture() : null;
        this.pictureDrawScope = z ? new CanvasDrawScope() : null;
        this.pictureCanvasHolder = z ? new CanvasHolder() : null;
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.size = IntSize.Companion.m11344getZeroYbymL2g();
        this.isInvalidated = true;
        this.layerId = View.generateViewId();
        this.blendMode = BlendMode.Companion.m8168getSrcOver0nO6VwU();
        this.compositingStrategy = CompositingStrategy.Companion.m8919getAutoke2Ky5w();
        this.alpha = 1.0f;
        this.pivotOffset = Offset.Companion.m7995getUnspecifiedF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.ambientShadowColor = Color.Companion.m8254getBlack0d7_KjU();
        this.spotShadowColor = Color.Companion.m8254getBlack0d7_KjU();
        this.supportsSoftwareRendering = z;
    }

    /* renamed from: applyCompositingLayer-Wpw9cng, reason: not valid java name */
    private final void m8956applyCompositingLayerWpw9cng(int i2) {
        boolean z = true;
        if (CompositingStrategy.m8915equalsimpl0(i2, CompositingStrategy.Companion.m8921getOffscreenke2Ky5w())) {
            this.viewLayer.setLayerType(2, this.layerPaint);
        } else {
            boolean zM8915equalsimpl0 = CompositingStrategy.m8915equalsimpl0(i2, CompositingStrategy.Companion.m8920getModulateAlphake2Ky5w());
            ViewLayer viewLayer = this.viewLayer;
            if (zM8915equalsimpl0) {
                viewLayer.setLayerType(0, this.layerPaint);
                z = false;
            } else {
                viewLayer.setLayerType(0, this.layerPaint);
            }
        }
        this.viewLayer.setCanUseCompositingLayer$ui_graphics(z);
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

    private final void recordDrawingOperations() {
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            Canvas canvas = PlaceholderCanvas;
            Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.drawChild$ui_graphics(androidCanvas, viewLayer, viewLayer.getDrawingTime());
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        } catch (ClassCastException unused) {
        }
    }

    private final boolean requiresCompositingLayer() {
        return CompositingStrategy.m8915equalsimpl0(mo8944getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m8921getOffscreenke2Ky5w()) || requiresLayerPaint();
    }

    private final boolean requiresLayerPaint() {
        return (BlendMode.m8137equalsimpl0(mo8943getBlendMode0nO6VwU(), BlendMode.Companion.m8168getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateClipBounds() {
        if (this.clipBoundsInvalidated) {
            ViewLayer viewLayer = this.viewLayer;
            Rect rect = null;
            if (getClip() && !this.outlineIsProvided) {
                rect = this.clipRect;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.viewLayer.getWidth();
                rect.bottom = this.viewLayer.getHeight();
            }
            viewLayer.setClipBounds(rect);
        }
    }

    private final void updateLayerLayout() {
        if (getClip()) {
            this.clipBoundsInvalidated = true;
        }
        ViewLayer viewLayer = this.viewLayer;
        int i2 = this.x;
        int i3 = i2 - this.outsetLeft;
        int i4 = this.y;
        int i5 = i4 - this.outsetTop;
        long j2 = this.size;
        viewLayer.layout(i3, i5, i2 + ((int) (j2 >> 32)) + this.outsetRight, i4 + ((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + this.outsetBottom);
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m8956applyCompositingLayerWpw9cng(CompositingStrategy.Companion.m8921getOffscreenke2Ky5w());
        } else {
            m8956applyCompositingLayerWpw9cng(mo8944getCompositingStrategyke2Ky5w());
        }
    }

    private final void updatePivot() {
        if (!this.shouldManuallySetCenterPivot && !Offset.m7977equalsimpl0(mo8945getPivotOffsetF1C5BW0(), Offset.Companion.m7995getUnspecifiedF1C5BW0())) {
            this.viewLayer.setPivotX(Float.intBitsToFloat((int) (mo8945getPivotOffsetF1C5BW0() >> 32)) + this.outsetLeft);
            this.viewLayer.setPivotY(Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & mo8945getPivotOffsetF1C5BW0())) + this.outsetTop);
            return;
        }
        this.viewLayer.setPivotX((((int) (this.size >> 32)) / 2.0f) + this.outsetLeft);
        this.viewLayer.setPivotY((((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & this.size)) / 2.0f) + this.outsetTop);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public Matrix calculateMatrix() {
        return this.viewLayer.getMatrix();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        this.layerContainer.removeViewInLayout(this.viewLayer);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void draw(androidx.compose.ui.graphics.Canvas canvas) {
        updateClipBounds();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.drawChild$ui_graphics(canvas, viewLayer, viewLayer.getDrawingTime());
        } else {
            Picture picture = this.picture;
            if (picture != null) {
                nativeCanvas.drawPicture(picture);
            }
        }
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
        return this.viewLayer.getCameraDistance() / this.resources.getDisplayMetrics().densityDpi;
    }

    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        return this.clipToBounds || this.viewLayer.getClipToOutline();
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
    public /* synthetic */ boolean getHasDisplayList() {
        return true;
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
    public boolean getSupportsSoftwareRendering() {
        return this.supportsSoftwareRendering;
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
        Picture picture;
        CanvasHolder canvasHolder;
        int i2;
        int i3;
        CanvasDrawScope canvasDrawScope;
        Density density2;
        LayoutDirection layoutDirection2;
        androidx.compose.ui.graphics.Canvas canvas;
        long jMo8758getSizeNHjbRc;
        GraphicsLayer graphicsLayer2;
        if (this.viewLayer.getParent() == null) {
            this.layerContainer.addView(this.viewLayer);
        }
        float f2 = this.outsetLeft;
        float f3 = this.outsetTop;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        ViewLayer viewLayer = this.viewLayer;
        long j2 = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i4 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i5 = (int) (j2 >> 32);
        viewLayer.setDrawParams(density, layoutDirection, graphicsLayer, lVar, Float.intBitsToFloat(i5), Float.intBitsToFloat(i4));
        if (!this.viewLayer.isAttachedToWindow()) {
            return;
        }
        this.viewLayer.setVisibility(4);
        this.viewLayer.setVisibility(0);
        recordDrawingOperations();
        Picture picture2 = this.picture;
        if (picture2 == null) {
            return;
        }
        ViewLayer viewLayer2 = this.viewLayer;
        Canvas canvasBeginRecording = picture2.beginRecording(viewLayer2.getWidth(), viewLayer2.getHeight());
        try {
            CanvasHolder canvasHolder2 = this.pictureCanvasHolder;
            if (canvasHolder2 != null) {
                Canvas internalCanvas = canvasHolder2.getAndroidCanvas().getInternalCanvas();
                canvasHolder2.getAndroidCanvas().setInternalCanvas(canvasBeginRecording);
                AndroidCanvas androidCanvas = canvasHolder2.getAndroidCanvas();
                try {
                    if (this.outsetLeft > 0.0f || this.outsetTop > 0.0f) {
                        picture = picture2;
                        androidCanvas.translate(Float.intBitsToFloat(i5), Float.intBitsToFloat(i4));
                        CanvasDrawScope canvasDrawScope2 = this.pictureDrawScope;
                        if (canvasDrawScope2 != null) {
                            canvasDrawScope = canvasDrawScope2;
                            long jM11351toSizeozmzZPI = IntSizeKt.m11351toSizeozmzZPI(this.size);
                            density2 = canvasDrawScope.getDrawContext().getDensity();
                            layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
                            canvas = canvasDrawScope.getDrawContext().getCanvas();
                            canvasHolder = canvasHolder2;
                            i2 = i4;
                            jMo8758getSizeNHjbRc = canvasDrawScope.getDrawContext().mo8758getSizeNHjbRc();
                            i3 = i5;
                            graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
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
                            } finally {
                            }
                        } else {
                            canvasHolder = canvasHolder2;
                            i2 = i4;
                            i3 = i5;
                        }
                        androidCanvas.translate(-Float.intBitsToFloat(i3), -Float.intBitsToFloat(i2));
                    } else {
                        CanvasDrawScope canvasDrawScope3 = this.pictureDrawScope;
                        if (canvasDrawScope3 != null) {
                            canvasDrawScope = canvasDrawScope3;
                            long jM11351toSizeozmzZPI2 = IntSizeKt.m11351toSizeozmzZPI(this.size);
                            density2 = canvasDrawScope.getDrawContext().getDensity();
                            layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
                            canvas = canvasDrawScope.getDrawContext().getCanvas();
                            jMo8758getSizeNHjbRc = canvasDrawScope.getDrawContext().mo8758getSizeNHjbRc();
                            picture = picture2;
                            graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
                            DrawContext drawContext3 = canvasDrawScope.getDrawContext();
                            drawContext3.setDensity(density);
                            drawContext3.setLayoutDirection(layoutDirection);
                            drawContext3.setCanvas(androidCanvas);
                            drawContext3.mo8759setSizeuvyYCjk(jM11351toSizeozmzZPI2);
                            drawContext3.setGraphicsLayer(graphicsLayer);
                            androidCanvas.save();
                            try {
                                lVar.invoke(canvasDrawScope);
                                androidCanvas.restore();
                                DrawContext drawContext4 = canvasDrawScope.getDrawContext();
                                drawContext4.setDensity(density2);
                                drawContext4.setLayoutDirection(layoutDirection2);
                                drawContext4.setCanvas(canvas);
                                drawContext4.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
                                drawContext4.setGraphicsLayer(graphicsLayer2);
                            } finally {
                            }
                        } else {
                            picture = picture2;
                        }
                        canvasHolder = canvasHolder2;
                    }
                    canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
                } catch (Throwable th) {
                    th = th;
                    picture.endRecording();
                    throw th;
                }
            } else {
                picture = picture2;
            }
            picture.endRecording();
        } catch (Throwable th2) {
            th = th2;
            picture = picture2;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float f2) {
        this.alpha = f2;
        this.viewLayer.setAlpha(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo8947setAmbientShadowColor8_81llA(long j2) {
        this.ambientShadowColor = j2;
        ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this.viewLayer, ColorKt.m8282toArgb8_81llA(j2));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setBlendMode-s9anfk8 */
    public void mo8948setBlendModes9anfk8(int i2) {
        this.blendMode = i2;
        obtainLayerPaint().setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m8073toPorterDuffModes9anfk8(i2)));
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f2) {
        this.viewLayer.setCameraDistance(f2 * this.resources.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z) {
        this.clipToBounds = z && !this.outlineIsProvided;
        this.clipBoundsInvalidated = true;
        this.viewLayer.setClipToOutline(z && this.outlineIsProvided);
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
        this.viewLayer.setLayerOutline(outline);
        if (getClip() && outline != null) {
            this.viewLayer.setClipToOutline(true);
            if (this.clipToBounds) {
                this.clipToBounds = false;
                this.clipBoundsInvalidated = true;
            }
        }
        this.outlineIsProvided = outline != null;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setOutsets(int i2, int i3, int i4, int i5) {
        if (i2 < 0 || i3 < 0 || i4 < 0 || i5 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Outsets cannot be negative! Left: " + i2 + ", Top: " + i3 + ", Right: " + i4 + ", Bottom: " + i5);
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
        updateLayerLayout();
        if (z) {
            updatePivot();
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPivotOffset-k-4lQ0M */
    public void mo8951setPivotOffsetk4lQ0M(long j2) {
        this.pivotOffset = j2;
        this.shouldManuallySetCenterPivot = (j2 & 9223372034707292159L) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
        updatePivot();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPosition-H0pRuoY */
    public void mo8952setPositionH0pRuoY(int i2, int i3, long j2) {
        if (!IntSize.m11337equalsimpl0(this.size, j2)) {
            this.x = i2;
            this.y = i3;
            this.size = j2;
            updateLayerLayout();
            return;
        }
        int i4 = this.x;
        if (i4 != i2) {
            this.viewLayer.offsetLeftAndRight(i2 - i4);
        }
        int i5 = this.y;
        if (i5 != i3) {
            this.viewLayer.offsetTopAndBottom(i3 - i5);
        }
        this.x = i2;
        this.y = i3;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this.viewLayer, renderEffect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float f2) {
        this.rotationX = f2;
        this.viewLayer.setRotationX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float f2) {
        this.rotationY = f2;
        this.viewLayer.setRotationY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float f2) {
        this.rotationZ = f2;
        this.viewLayer.setRotation(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleX(float f2) {
        this.scaleX = f2;
        this.viewLayer.setScaleX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float f2) {
        this.scaleY = f2;
        this.viewLayer.setScaleY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float f2) {
        this.shadowElevation = f2;
        this.viewLayer.setElevation(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo8953setSpotShadowColor8_81llA(long j2) {
        this.spotShadowColor = j2;
        ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this.viewLayer, ColorKt.m8282toArgb8_81llA(j2));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f2) {
        this.translationX = f2;
        this.viewLayer.setTranslationX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f2) {
        this.translationY = f2;
        this.viewLayer.setTranslationY(f2);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean getMayRenderInSoftware() {
            return GraphicsViewLayer.mayRenderInSoftware;
        }

        public final Canvas getPlaceholderCanvas() {
            return GraphicsViewLayer.PlaceholderCanvas;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ GraphicsViewLayer(DrawChildContainer drawChildContainer, long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i2, o oVar) {
        this(drawChildContainer, j2, (i2 & 4) != 0 ? new CanvasHolder() : canvasHolder, (i2 & 8) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
