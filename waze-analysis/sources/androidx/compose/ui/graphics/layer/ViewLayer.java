package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ViewLayer extends View {
    private boolean canUseCompositingLayer;
    private final CanvasDrawScope canvasDrawScope;
    private final CanvasHolder canvasHolder;
    private Density density;
    private l<? super DrawScope, ab> drawBlock;
    private boolean isInvalidated;
    private Outline layerOutline;
    private LayoutDirection layoutDirection;
    private float outsetLeft;
    private float outsetTop;
    private final View ownerView;
    private GraphicsLayer parentLayer;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final ViewOutlineProvider LayerOutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.graphics.layer.ViewLayer$Companion$LayerOutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            ViewLayer viewLayer;
            Outline outline2;
            if (!(view instanceof ViewLayer) || (outline2 = (viewLayer = (ViewLayer) view).layerOutline) == null) {
                return;
            }
            outline.set(outline2);
            if (viewLayer.outsetLeft == 0.0f && viewLayer.outsetTop == 0.0f) {
                return;
            }
            outline.offset((int) viewLayer.outsetLeft, (int) viewLayer.outsetTop);
        }
    };

    public ViewLayer(View view, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        super(view.getContext());
        this.ownerView = view;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        setOutlineProvider(LayerOutlineProvider);
        this.canUseCompositingLayer = true;
        this.density = DrawContextKt.getDefaultDensity();
        this.layoutDirection = LayoutDirection.Ltr;
        this.drawBlock = GraphicsLayerImpl.Companion.getDefaultDrawBlock();
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AndroidCanvas androidCanvas;
        CanvasDrawScope canvasDrawScope;
        Density density;
        LayoutDirection layoutDirection;
        androidx.compose.ui.graphics.Canvas canvas2;
        long jMo8758getSizeNHjbRc;
        GraphicsLayer graphicsLayer;
        if (this.outsetLeft > 0.0f || this.outsetTop > 0.0f) {
            int iSave = canvas.save();
            canvas.translate(this.outsetLeft, this.outsetTop);
            CanvasHolder canvasHolder = this.canvasHolder;
            Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
            androidCanvas = canvasHolder.getAndroidCanvas();
            canvasDrawScope = this.canvasDrawScope;
            Density density2 = this.density;
            LayoutDirection layoutDirection2 = this.layoutDirection;
            float width = getWidth();
            float height = getHeight();
            long jFloatToRawIntBits = Float.floatToRawIntBits(width) << 32;
            long jFloatToRawIntBits2 = MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(height);
            GraphicsLayer graphicsLayer2 = this.parentLayer;
            l<? super DrawScope, ab> lVar = this.drawBlock;
            density = canvasDrawScope.getDrawContext().getDensity();
            layoutDirection = canvasDrawScope.getDrawContext().getLayoutDirection();
            canvas2 = canvasDrawScope.getDrawContext().getCanvas();
            jMo8758getSizeNHjbRc = canvasDrawScope.getDrawContext().mo8758getSizeNHjbRc();
            graphicsLayer = canvasDrawScope.getDrawContext().getGraphicsLayer();
            DrawContext drawContext = canvasDrawScope.getDrawContext();
            drawContext.setDensity(density2);
            drawContext.setLayoutDirection(layoutDirection2);
            drawContext.setCanvas(androidCanvas);
            drawContext.mo8759setSizeuvyYCjk(jFloatToRawIntBits | jFloatToRawIntBits2);
            drawContext.setGraphicsLayer(graphicsLayer2);
            androidCanvas.save();
            try {
                lVar.invoke(canvasDrawScope);
                androidCanvas.restore();
                DrawContext drawContext2 = canvasDrawScope.getDrawContext();
                drawContext2.setDensity(density);
                drawContext2.setLayoutDirection(layoutDirection);
                drawContext2.setCanvas(canvas2);
                drawContext2.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer);
                canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
                canvas.restoreToCount(iSave);
            } finally {
            }
        } else {
            CanvasHolder canvasHolder2 = this.canvasHolder;
            Canvas internalCanvas2 = canvasHolder2.getAndroidCanvas().getInternalCanvas();
            canvasHolder2.getAndroidCanvas().setInternalCanvas(canvas);
            androidCanvas = canvasHolder2.getAndroidCanvas();
            canvasDrawScope = this.canvasDrawScope;
            Density density3 = this.density;
            LayoutDirection layoutDirection3 = this.layoutDirection;
            float width2 = getWidth();
            float height2 = getHeight();
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(width2) << 32;
            long jFloatToRawIntBits4 = MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(height2);
            GraphicsLayer graphicsLayer3 = this.parentLayer;
            l<? super DrawScope, ab> lVar2 = this.drawBlock;
            density = canvasDrawScope.getDrawContext().getDensity();
            layoutDirection = canvasDrawScope.getDrawContext().getLayoutDirection();
            canvas2 = canvasDrawScope.getDrawContext().getCanvas();
            jMo8758getSizeNHjbRc = canvasDrawScope.getDrawContext().mo8758getSizeNHjbRc();
            graphicsLayer = canvasDrawScope.getDrawContext().getGraphicsLayer();
            DrawContext drawContext3 = canvasDrawScope.getDrawContext();
            drawContext3.setDensity(density3);
            drawContext3.setLayoutDirection(layoutDirection3);
            drawContext3.setCanvas(androidCanvas);
            drawContext3.mo8759setSizeuvyYCjk(jFloatToRawIntBits3 | jFloatToRawIntBits4);
            drawContext3.setGraphicsLayer(graphicsLayer3);
            androidCanvas.save();
            try {
                lVar2.invoke(canvasDrawScope);
                androidCanvas.restore();
                DrawContext drawContext4 = canvasDrawScope.getDrawContext();
                drawContext4.setDensity(density);
                drawContext4.setLayoutDirection(layoutDirection);
                drawContext4.setCanvas(canvas2);
                drawContext4.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
                drawContext4.setGraphicsLayer(graphicsLayer);
                canvasHolder2.getAndroidCanvas().setInternalCanvas(internalCanvas2);
            } finally {
            }
        }
        this.isInvalidated = false;
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.canUseCompositingLayer;
    }

    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    public final View getOwnerView() {
        return this.ownerView;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.canUseCompositingLayer != z) {
            this.canUseCompositingLayer = z;
            invalidate();
        }
    }

    public final void setDrawParams(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, l<? super DrawScope, ab> lVar, float f2, float f3) {
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = lVar;
        this.parentLayer = graphicsLayer;
        this.outsetLeft = f2;
        this.outsetTop = f3;
    }

    public final void setInvalidated(boolean z) {
        this.isInvalidated = z;
    }

    public final boolean setLayerOutline(Outline outline) {
        this.layerOutline = outline;
        OutlineUtils.INSTANCE.rebuildOutline(this);
        return true;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final ViewOutlineProvider getLayerOutlineProvider$ui_graphics() {
            return ViewLayer.LayerOutlineProvider;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public /* synthetic */ ViewLayer(View view, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i2, o oVar) {
        this(view, (i2 & 2) != 0 ? new CanvasHolder() : canvasHolder, (i2 & 4) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }
}
