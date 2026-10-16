package androidx.compose.ui.platform;

import android.os.Build;
import androidx.compose.ui.FrameRateCategory;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GraphicsLayerOwnerLayer implements OwnedLayer, GraphicLayerInfo {
    public static final int $stable = 8;
    private final GraphicsContext context;
    private p<? super Canvas, ? super GraphicsLayer, ab> drawBlock;
    private boolean drawnWithEnabledZ;
    private float frameRate;
    private GraphicsLayer graphicsLayer;
    private a<ab> invalidateParentLayer;
    private float[] inverseMatrixCache;
    private boolean isDestroyed;
    private boolean isDirty;
    private boolean isFrameRateFromParent;
    private boolean isInverseMatrixDirty;
    private boolean isMatrixDirty;
    private int mutatedFields;
    private Outline outline;
    private final AndroidComposeView ownerView;
    private long size = 9223372034707292159L;
    private final float[] matrixCache = Matrix.m8492constructorimpl$default(null, 1, null);
    private Density density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final CanvasDrawScope scope = new CanvasDrawScope();
    private long transformOrigin = TransformOrigin.Companion.m8671getCenterSzJe1aQ();
    private boolean isIdentity = true;
    private final l<DrawScope, ab> recordLambda = new GraphicsLayerOwnerLayer$recordLambda$1(this);

    public GraphicsLayerOwnerLayer(GraphicsLayer graphicsLayer, GraphicsContext graphicsContext, AndroidComposeView androidComposeView, p<? super Canvas, ? super GraphicsLayer, ab> pVar, a<ab> aVar) {
        this.graphicsLayer = graphicsLayer;
        this.context = graphicsContext;
        this.ownerView = androidComposeView;
        this.drawBlock = pVar;
        this.invalidateParentLayer = aVar;
    }

    /* renamed from: getInverseMatrix-3i98HWw, reason: not valid java name */
    private final float[] m10248getInverseMatrix3i98HWw() {
        float[] fArrM8492constructorimpl$default = this.inverseMatrixCache;
        if (fArrM8492constructorimpl$default == null) {
            fArrM8492constructorimpl$default = Matrix.m8492constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArrM8492constructorimpl$default;
        }
        if (this.isInverseMatrixDirty) {
            this.isInverseMatrixDirty = false;
            float[] fArrM10249getMatrixsQKQjiQ = m10249getMatrixsQKQjiQ();
            if (this.isIdentity) {
                return fArrM10249getMatrixsQKQjiQ;
            }
            if (!InvertMatrixKt.m10252invertToJiSxe2E(fArrM10249getMatrixsQKQjiQ, fArrM8492constructorimpl$default)) {
                fArrM8492constructorimpl$default[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrM8492constructorimpl$default[0])) {
            return null;
        }
        return fArrM8492constructorimpl$default;
    }

    /* renamed from: getMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m10249getMatrixsQKQjiQ() {
        updateMatrix();
        return this.matrixCache;
    }

    private final void setDirty(boolean z) {
        if (z != this.isDirty) {
            this.isDirty = z;
            this.ownerView.notifyLayerIsDirty$ui(this, z);
        }
    }

    private final void triggerRepaint() {
        WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
    }

    private final void updateMatrix() {
        if (this.isMatrixDirty) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            long jM8059getCenteruvyYCjk = (graphicsLayer.m8929getPivotOffsetF1C5BW0() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? SizeKt.m8059getCenteruvyYCjk(IntSizeKt.m11351toSizeozmzZPI(this.size)) : graphicsLayer.m8929getPivotOffsetF1C5BW0();
            Matrix.m8503resetToPivotedTransformimpl$default(this.matrixCache, Float.intBitsToFloat((int) (jM8059getCenteruvyYCjk >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & jM8059getCenteruvyYCjk)), graphicsLayer.getTranslationX(), graphicsLayer.getTranslationY(), 0.0f, graphicsLayer.getRotationX(), graphicsLayer.getRotationY(), graphicsLayer.getRotationZ(), graphicsLayer.getScaleX(), graphicsLayer.getScaleY(), 0.0f, DisplayStrings.DS_LOG_OUT, null);
            this.isMatrixDirty = false;
            this.isIdentity = MatrixKt.m8517isIdentity58bKbWc(this.matrixCache);
        }
    }

    private final void updateOutline() {
        a<ab> aVar;
        Outline outline = this.outline;
        if (outline == null) {
            return;
        }
        GraphicsLayerKt.setOutline(this.graphicsLayer, outline);
        if (Build.VERSION.SDK_INT < 33) {
            if (((outline instanceof Outline.Generic) || ((outline instanceof Outline.Rounded) && !RoundRectKt.isSimple(((Outline.Rounded) outline).getRoundRect()))) && (aVar = this.invalidateParentLayer) != null) {
                aVar.invoke();
            }
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        setFrameRate(0.0f);
        setFrameRateFromParent(false);
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext != null) {
            graphicsContext.releaseGraphicsLayer(this.graphicsLayer);
            this.ownerView.recycle$ui(this);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer graphicsLayer) {
        updateDisplayList();
        this.drawnWithEnabledZ = this.graphicsLayer.getShadowElevation() > 0.0f;
        DrawContext drawContext = this.scope.getDrawContext();
        drawContext.setCanvas(canvas);
        drawContext.setGraphicsLayer(graphicsLayer);
        GraphicsLayerKt.drawLayer(this.scope, this.graphicsLayer);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public float getFrameRate() {
        return this.frameRate;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.graphicsLayer.getLayerId();
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return this.graphicsLayer.getOwnerViewId();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo10124getUnderlyingMatrixsQKQjiQ() {
        return m10249getMatrixsQKQjiQ();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo10125inverseTransform58bKbWc(float[] fArr) {
        float[] fArrM10248getInverseMatrix3i98HWw = m10248getInverseMatrix3i98HWw();
        if (fArrM10248getInverseMatrix3i98HWw != null) {
            Matrix.m8511timesAssign58bKbWc(fArr, fArrM10248getInverseMatrix3i98HWw);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public boolean isFrameRateFromParent() {
        return this.isFrameRateFromParent;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo10126isInLayerk4lQ0M(long j2) {
        int i2 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        if (this.graphicsLayer.getClip()) {
            return ShapeContainingUtilKt.isInOutline$default(this.graphicsLayer.getOutline(), fIntBitsToFloat, fIntBitsToFloat2, null, null, 24, null);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z) {
        float[] fArrM10248getInverseMatrix3i98HWw = z ? m10248getInverseMatrix3i98HWw() : m10249getMatrixsQKQjiQ();
        if (this.isIdentity) {
            return;
        }
        if (fArrM10248getInverseMatrix3i98HWw == null) {
            mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            Matrix.m8500mapimpl(fArrM10248getInverseMatrix3i98HWw, mutableRect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo10127mapOffset8S9VItk(long j2, boolean z) {
        float[] fArrM10249getMatrixsQKQjiQ;
        if (z) {
            fArrM10249getMatrixsQKQjiQ = m10248getInverseMatrix3i98HWw();
            if (fArrM10249getMatrixsQKQjiQ == null) {
                return Offset.Companion.m7994getInfiniteF1C5BW0();
            }
        } else {
            fArrM10249getMatrixsQKQjiQ = m10249getMatrixsQKQjiQ();
        }
        return this.isIdentity ? j2 : Matrix.m8498mapMKHz9U(fArrM10249getMatrixsQKQjiQ, j2);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo10128movegyyYBs(long j2) {
        if (this.ownerView.isArrEnabled$ui()) {
            this.ownerView.voteFrameRate(FrameRateCategory.Companion.m7657getHighNSsRyOo());
        }
        this.graphicsLayer.m8941setTopLeftgyyYBs(j2);
        triggerRepaint();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo10129resizeozmzZPI(long j2) {
        if (IntSize.m11337equalsimpl0(j2, this.size)) {
            return;
        }
        if (this.ownerView.isArrEnabled$ui()) {
            this.ownerView.voteFrameRate(FrameRateCategory.Companion.m7657getHighNSsRyOo());
        }
        this.size = j2;
        invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(p<? super Canvas, ? super GraphicsLayer, ab> pVar, a<ab> aVar) {
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext == null) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("currently reuse is only supported when we manage the layer lifecycle");
            throw new e();
        }
        if (!this.graphicsLayer.isReleased()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("layer should have been released before reuse");
        }
        this.graphicsLayer = graphicsContext.createGraphicsLayer();
        this.isDestroyed = false;
        this.drawBlock = pVar;
        this.invalidateParentLayer = aVar;
        this.isMatrixDirty = false;
        this.isInverseMatrixDirty = false;
        this.isIdentity = true;
        Matrix.m8501resetimpl(this.matrixCache);
        float[] fArr = this.inverseMatrixCache;
        if (fArr != null) {
            Matrix.m8501resetimpl(fArr);
        }
        this.transformOrigin = TransformOrigin.Companion.m8671getCenterSzJe1aQ();
        this.drawnWithEnabledZ = false;
        this.size = 9223372034707292159L;
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void setFrameRate(float f2) {
        this.frameRate = f2;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void setFrameRateFromParent(boolean z) {
        this.isFrameRateFromParent = z;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo10130transform58bKbWc(float[] fArr) {
        Matrix.m8511timesAssign58bKbWc(fArr, m10249getMatrixsQKQjiQ());
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.ownerView.isArrEnabled$ui() && getFrameRate() != 0.0f) {
            this.ownerView.voteFrameRate(getFrameRate());
        }
        if (this.isDirty) {
            if (!TransformOrigin.m8665equalsimpl0(this.transformOrigin, TransformOrigin.Companion.m8671getCenterSzJe1aQ()) && !IntSize.m11337equalsimpl0(this.graphicsLayer.m8930getSizeYbymL2g(), this.size)) {
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                float fM8666getPivotFractionXimpl = TransformOrigin.m8666getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32));
                float fM8667getPivotFractionYimpl = TransformOrigin.m8667getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                graphicsLayer.m8937setPivotOffsetk4lQ0M((Float.floatToRawIntBits(fM8667getPivotFractionYimpl) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fM8666getPivotFractionXimpl) << 32));
            }
            this.graphicsLayer.m8933recordmLhObY(this.density, this.layoutDirection, this.size, this.recordLambda);
            setDirty(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        int iM8920getModulateAlphake2Ky5w;
        a<ab> aVar;
        int mutatedFields$ui = reusableGraphicsLayerScope.getMutatedFields$ui() | this.mutatedFields;
        this.layoutDirection = reusableGraphicsLayerScope.getLayoutDirection$ui();
        Density graphicsDensity$ui = reusableGraphicsLayerScope.getGraphicsDensity$ui();
        this.density = graphicsDensity$ui;
        if ((1048576 & mutatedFields$ui) != 0) {
            this.graphicsLayer.setOutsets(graphicsDensity$ui.mo2121roundToPx0680j_4(reusableGraphicsLayerScope.getOutsets().m8480getLeftD9Ej5fM()), graphicsDensity$ui.mo2121roundToPx0680j_4(reusableGraphicsLayerScope.getOutsets().m8482getTopD9Ej5fM()), graphicsDensity$ui.mo2121roundToPx0680j_4(reusableGraphicsLayerScope.getOutsets().m8481getRightD9Ej5fM()), graphicsDensity$ui.mo2121roundToPx0680j_4(reusableGraphicsLayerScope.getOutsets().m8479getBottomD9Ej5fM()));
            invalidate();
        }
        int i2 = mutatedFields$ui & 4096;
        if (i2 != 0) {
            this.transformOrigin = reusableGraphicsLayerScope.mo8408getTransformOriginSzJe1aQ();
        }
        if ((mutatedFields$ui & 1) != 0) {
            this.graphicsLayer.setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((mutatedFields$ui & 2) != 0) {
            this.graphicsLayer.setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((mutatedFields$ui & 4) != 0) {
            this.graphicsLayer.setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui & 8) != 0) {
            this.graphicsLayer.setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((mutatedFields$ui & 16) != 0) {
            this.graphicsLayer.setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((mutatedFields$ui & 32) != 0) {
            this.graphicsLayer.setShadowElevation(reusableGraphicsLayerScope.getShadowElevation());
            if (reusableGraphicsLayerScope.getShadowElevation() > 0.0f && !this.drawnWithEnabledZ && (aVar = this.invalidateParentLayer) != null) {
                aVar.invoke();
            }
        }
        if ((mutatedFields$ui & 64) != 0) {
            this.graphicsLayer.m8934setAmbientShadowColor8_81llA(reusableGraphicsLayerScope.mo8403getAmbientShadowColor0d7_KjU());
        }
        if ((mutatedFields$ui & 128) != 0) {
            this.graphicsLayer.m8940setSpotShadowColor8_81llA(reusableGraphicsLayerScope.mo8407getSpotShadowColor0d7_KjU());
        }
        if ((mutatedFields$ui & 1024) != 0) {
            this.graphicsLayer.setRotationZ(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((mutatedFields$ui & 256) != 0) {
            this.graphicsLayer.setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui & 512) != 0) {
            this.graphicsLayer.setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((mutatedFields$ui & 2048) != 0) {
            this.graphicsLayer.setCameraDistance(reusableGraphicsLayerScope.getCameraDistance());
        }
        if (i2 != 0) {
            boolean zM8665equalsimpl0 = TransformOrigin.m8665equalsimpl0(this.transformOrigin, TransformOrigin.Companion.m8671getCenterSzJe1aQ());
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            if (zM8665equalsimpl0) {
                graphicsLayer.m8937setPivotOffsetk4lQ0M(Offset.Companion.m7995getUnspecifiedF1C5BW0());
            } else {
                float fM8666getPivotFractionXimpl = TransformOrigin.m8666getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32));
                graphicsLayer.m8937setPivotOffsetk4lQ0M((Float.floatToRawIntBits(TransformOrigin.m8667getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fM8666getPivotFractionXimpl) << 32));
            }
        }
        if ((mutatedFields$ui & 16384) != 0) {
            this.graphicsLayer.setClip(reusableGraphicsLayerScope.getClip());
        }
        if ((131072 & mutatedFields$ui) != 0) {
            this.graphicsLayer.setRenderEffect(reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((262144 & mutatedFields$ui) != 0) {
            this.graphicsLayer.setColorFilter(reusableGraphicsLayerScope.getColorFilter());
        }
        if ((524288 & mutatedFields$ui) != 0) {
            this.graphicsLayer.m8935setBlendModes9anfk8(reusableGraphicsLayerScope.mo8404getBlendMode0nO6VwU());
        }
        if ((32768 & mutatedFields$ui) != 0) {
            GraphicsLayer graphicsLayer2 = this.graphicsLayer;
            int iMo8405getCompositingStrategyNrFUSI = reusableGraphicsLayerScope.mo8405getCompositingStrategyNrFUSI();
            if (CompositingStrategy.m8313equalsimpl0(iMo8405getCompositingStrategyNrFUSI, CompositingStrategy.Companion.m8317getAutoNrFUSI())) {
                iM8920getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m8919getAutoke2Ky5w();
            } else if (CompositingStrategy.m8313equalsimpl0(iMo8405getCompositingStrategyNrFUSI, CompositingStrategy.Companion.m8319getOffscreenNrFUSI())) {
                iM8920getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m8921getOffscreenke2Ky5w();
            } else {
                if (!CompositingStrategy.m8313equalsimpl0(iMo8405getCompositingStrategyNrFUSI, CompositingStrategy.Companion.m8318getModulateAlphaNrFUSI())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iM8920getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m8920getModulateAlphake2Ky5w();
            }
            graphicsLayer2.m8936setCompositingStrategyWpw9cng(iM8920getModulateAlphake2Ky5w);
        }
        boolean z = true;
        if ((mutatedFields$ui & Fields.MatrixAffectingFields) != 0) {
            this.isMatrixDirty = true;
            this.isInverseMatrixDirty = true;
        }
        if (x.n(this.outline, reusableGraphicsLayerScope.getOutline$ui())) {
            z = false;
        } else {
            this.outline = reusableGraphicsLayerScope.getOutline$ui();
            updateOutline();
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui();
        if (mutatedFields$ui != 0 || z) {
            triggerRepaint();
            if (this.ownerView.isArrEnabled$ui()) {
                this.ownerView.voteFrameRate(getFrameRate());
            }
        }
    }
}
