package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.i;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GraphicsLayer {
    private static final LayerSnapshotImpl SnapshotImpl;
    private static final boolean isRobolectric;
    private Outline androidOutline;
    private boolean clip;
    private final GraphicsLayerImpl impl;
    private androidx.compose.ui.graphics.Outline internalOutline;
    private boolean isReleased;
    private Path outlinePath;
    private int outsetBottom;
    private int outsetLeft;
    private int outsetRight;
    private int outsetTop;
    private int parentLayerUsages;
    private RectF pathBounds;
    private long pivotOffset;
    private Path roundRectClipPath;
    private float roundRectCornerRadius;
    private long size;
    private CanvasDrawScope softwareDrawScope;
    private Paint softwareLayerPaint;
    private long topLeft;
    private boolean usePathForClip;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private Density density = DrawContextKt.getDefaultDensity();
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private l<? super DrawScope, ab> drawBlock = GraphicsLayer$drawBlock$1.INSTANCE;
    private final l<DrawScope, ab> clipDrawBlock = new GraphicsLayer$clipDrawBlock$1(this);
    private boolean outlineDirty = true;
    private long roundRectOutlineTopLeft = Offset.Companion.m7996getZeroF1C5BW0();
    private long roundRectOutlineSize = Size.Companion.m8057getUnspecifiedNHjbRc();
    private final ChildLayerDependenciesTracker childDependenciesTracker = new ChildLayerDependenciesTracker();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GraphicsLayer.this.toImageBitmap(this);
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        x.e(lowerCase, "toLowerCase(...)");
        boolean zN = x.n(lowerCase, "robolectric");
        isRobolectric = zN;
        SnapshotImpl = zN ? LayerSnapshotV21.INSTANCE : LayerSnapshotV28.INSTANCE;
    }

    public GraphicsLayer(GraphicsLayerImpl graphicsLayerImpl) {
        this.impl = graphicsLayerImpl;
        graphicsLayerImpl.setClip(false);
        this.topLeft = IntOffset.Companion.m11307getZeronOccac();
        this.size = IntSize.Companion.m11344getZeroYbymL2g();
        this.pivotOffset = Offset.Companion.m7995getUnspecifiedF1C5BW0();
    }

    private final void addSubLayer(GraphicsLayer graphicsLayer) {
        if (this.childDependenciesTracker.onDependencyAdded(graphicsLayer)) {
            graphicsLayer.onAddedToParentLayer();
        }
    }

    private final void configureOutlineAndClip() {
        if (this.outlineDirty) {
            if (this.clip || getShadowElevation() > 0.0f) {
                Path path = this.outlinePath;
                if (path != null) {
                    RectF rectFObtainPathBounds = obtainPathBounds();
                    if (!(path instanceof AndroidPath)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((AndroidPath) path).getInternalPath().computeBounds(rectFObtainPathBounds, false);
                    Outline outlineUpdatePathOutline = updatePathOutline(path);
                    outlineUpdatePathOutline.setAlpha(getAlpha());
                    this.impl.mo8950setOutlineO0kMr_c(outlineUpdatePathOutline, (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Math.round(rectFObtainPathBounds.height())) | (Math.round(rectFObtainPathBounds.width()) << 32));
                    if (this.usePathForClip && this.clip) {
                        this.impl.setClip(false);
                        this.impl.discardDisplayList();
                    } else {
                        this.impl.setClip(this.clip);
                    }
                } else {
                    this.impl.setClip(this.clip);
                    Size.Companion.m8058getZeroNHjbRc();
                    Outline outlineObtainAndroidOutline = obtainAndroidOutline();
                    long jM11351toSizeozmzZPI = IntSizeKt.m11351toSizeozmzZPI(this.size);
                    long j2 = this.roundRectOutlineTopLeft;
                    long j3 = this.roundRectOutlineSize;
                    long j4 = j3 == InlineClassHelperKt.UnspecifiedPackedFloats ? jM11351toSizeozmzZPI : j3;
                    int i2 = (int) (j2 >> 32);
                    int iRound = Math.round(Float.intBitsToFloat(i2));
                    int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                    outlineObtainAndroidOutline.setRoundRect(iRound, Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j4 >> 32))), Math.round(Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j4))), this.roundRectCornerRadius);
                    outlineObtainAndroidOutline.setAlpha(getAlpha());
                    this.impl.mo8950setOutlineO0kMr_c(outlineObtainAndroidOutline, IntSizeKt.m11347roundToIntSizeuvyYCjk(j4));
                }
            } else {
                this.impl.setClip(false);
                this.impl.mo8950setOutlineO0kMr_c(null, IntSize.Companion.m11344getZeroYbymL2g());
            }
        }
        this.outlineDirty = false;
    }

    private final void discardContentIfReleasedAndHaveNoParentLayerUsages() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            discardDisplayList$ui_graphics();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawWithChildTracking(androidx.compose.ui.graphics.drawscope.DrawScope r15) {
        /*
            r14 = this;
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker r0 = r14.childDependenciesTracker
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependency$p(r0)
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$setOldDependency$p(r0, r1)
            androidx.collection.MutableScatterSet r1 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependenciesSet$p(r0)
            if (r1 == 0) goto L2b
            boolean r2 = r1.isNotEmpty()
            if (r2 == 0) goto L2b
            androidx.collection.MutableScatterSet r2 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(r0)
            if (r2 != 0) goto L22
            androidx.collection.MutableScatterSet r2 = androidx.collection.ScatterSetKt.mutableScatterSetOf()
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$setOldDependenciesSet$p(r0, r2)
        L22:
            r3 = r1
            androidx.collection.ScatterSet r3 = (androidx.collection.ScatterSet) r3
            r2.addAll(r3)
            r1.clear()
        L2b:
            r1 = 1
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$setTrackingInProgress$p(r0, r1)
            h.g.a.l<? super androidx.compose.ui.graphics.drawscope.DrawScope, h.ab> r14 = r14.drawBlock
            r14.invoke(r15)
            r14 = 0
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$setTrackingInProgress$p(r0, r14)
            androidx.compose.ui.graphics.layer.GraphicsLayer r15 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependency$p(r0)
            if (r15 == 0) goto L41
            r15.onRemovedFromParentLayer()
        L41:
            androidx.collection.MutableScatterSet r15 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(r0)
            if (r15 == 0) goto L97
            boolean r0 = r15.isNotEmpty()
            if (r0 == 0) goto L97
            r0 = r15
            androidx.collection.ScatterSet r0 = (androidx.collection.ScatterSet) r0
            java.lang.Object[] r1 = r0.elements
            long[] r0 = r0.metadata
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L94
            r3 = r14
        L5a:
            r4 = r0[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L8f
            int r6 = r3 - r2
            r7 = r14
        L6d:
            int r8 = ~r6
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            if (r7 >= r8) goto L8d
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r4
            r12 = 128(0x80, double:6.3E-322)
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 >= 0) goto L89
            int r8 = r3 << 3
            int r8 = r8 + r7
            r8 = r1[r8]
            androidx.compose.ui.graphics.layer.GraphicsLayer r8 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r8
            r8.onRemovedFromParentLayer()
        L89:
            long r4 = r4 >> r9
            int r7 = r7 + 1
            goto L6d
        L8d:
            if (r8 != r9) goto L94
        L8f:
            if (r3 == r2) goto L94
            int r3 = r3 + 1
            goto L5a
        L94:
            r15.clear()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.drawWithChildTracking(androidx.compose.ui.graphics.drawscope.DrawScope):void");
    }

    private final Outline obtainAndroidOutline() {
        Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    private final RectF obtainPathBounds() {
        RectF rectF = this.pathBounds;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.pathBounds = rectF2;
        return rectF2;
    }

    private final void onAddedToParentLayer() {
        this.parentLayerUsages++;
    }

    private final void onRemovedFromParentLayer() {
        this.parentLayerUsages--;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    private final void recordInternal() {
        this.impl.record(this.density, this.layoutDirection, this, this.clipDrawBlock);
    }

    private final void recreateDisplayListIfNeeded() {
        if (this.impl.getHasDisplayList()) {
            return;
        }
        try {
            recordInternal();
        } catch (Throwable unused) {
        }
    }

    private final void resetOutlineParams() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = Size.Companion.m8057getUnspecifiedNHjbRc();
        this.roundRectOutlineTopLeft = Offset.Companion.m7996getZeroF1C5BW0();
        this.roundRectCornerRadius = 0.0f;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    private final <T> T resolveOutlinePosition(p<? super Offset, ? super Size, ? extends T> pVar) {
        long jM11351toSizeozmzZPI = IntSizeKt.m11351toSizeozmzZPI(this.size);
        long j2 = this.roundRectOutlineTopLeft;
        long j3 = this.roundRectOutlineSize;
        if (j3 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM11351toSizeozmzZPI = j3;
        }
        return pVar.invoke(Offset.m7969boximpl(j2), Size.m8037boximpl(jM11351toSizeozmzZPI));
    }

    /* renamed from: setPosition-VbeCjmY, reason: not valid java name */
    private final void m8922setPositionVbeCjmY(long j2, long j3) {
        this.impl.mo8952setPositionH0pRuoY(IntOffset.m11296getXimpl(j2), IntOffset.m11297getYimpl(j2), j3);
    }

    /* renamed from: setRectOutline-tz77jQw$default, reason: not valid java name */
    public static /* synthetic */ void m8923setRectOutlinetz77jQw$default(GraphicsLayer graphicsLayer, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = Offset.Companion.m7996getZeroF1C5BW0();
        }
        if ((i2 & 2) != 0) {
            j3 = Size.Companion.m8057getUnspecifiedNHjbRc();
        }
        graphicsLayer.m8938setRectOutlinetz77jQw(j2, j3);
    }

    /* renamed from: setRoundRectOutline-TNW_H78$default, reason: not valid java name */
    public static /* synthetic */ void m8924setRoundRectOutlineTNW_H78$default(GraphicsLayer graphicsLayer, long j2, long j3, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = Offset.Companion.m7996getZeroF1C5BW0();
        }
        long j4 = j2;
        if ((i2 & 2) != 0) {
            j3 = Size.Companion.m8057getUnspecifiedNHjbRc();
        }
        long j5 = j3;
        if ((i2 & 4) != 0) {
            f2 = 0.0f;
        }
        graphicsLayer.m8939setRoundRectOutlineTNW_H78(j4, j5, f2);
    }

    /* renamed from: setSize-ozmzZPI, reason: not valid java name */
    private final void m8925setSizeozmzZPI(long j2) {
        if (IntSize.m11337equalsimpl0(this.size, j2)) {
            return;
        }
        this.size = j2;
        m8922setPositionVbeCjmY(this.topLeft, j2);
        if (this.roundRectOutlineSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    private final void transformCanvas(Canvas canvas) {
        float f2;
        float f3;
        Canvas canvas2;
        long j2 = this.topLeft;
        int iM11296getXimpl = IntOffset.m11296getXimpl(j2);
        float f4 = this.outsetLeft;
        int iM11297getYimpl = IntOffset.m11297getYimpl(j2);
        float f5 = this.outsetTop;
        int iM11296getXimpl2 = IntOffset.m11296getXimpl(j2);
        long j3 = this.size;
        long j4 = j3 >> 32;
        float f6 = this.outsetRight;
        int iM11297getYimpl2 = IntOffset.m11297getYimpl(j2);
        long j5 = j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        float f7 = this.outsetBottom;
        float alpha = getAlpha();
        ColorFilter colorFilter = getColorFilter();
        int iM8927getBlendMode0nO6VwU = m8927getBlendMode0nO6VwU();
        float f8 = iM11296getXimpl - f4;
        float f9 = iM11297getYimpl - f5;
        if (alpha < 1.0f || !BlendMode.m8137equalsimpl0(iM8927getBlendMode0nO6VwU, BlendMode.Companion.m8168getSrcOver0nO6VwU()) || colorFilter != null || CompositingStrategy.m8915equalsimpl0(m8928getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m8921getOffscreenke2Ky5w())) {
            Paint Paint = this.softwareLayerPaint;
            if (Paint == null) {
                Paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = Paint;
            }
            float f10 = iM11297getYimpl2 + ((int) j5) + f7;
            Paint.setAlpha(alpha);
            Paint.mo8103setBlendModes9anfk8(iM8927getBlendMode0nO6VwU);
            Paint.setColorFilter(colorFilter);
            f2 = f8;
            f3 = f9;
            canvas2 = canvas;
            canvas2.saveLayer(f2, f3, iM11296getXimpl2 + ((int) j4) + f6, f10, AndroidPaint_androidKt.getNativePaint(Paint));
        } else {
            canvas.save();
            canvas2 = canvas;
            f2 = f8;
            f3 = f9;
        }
        canvas2.translate(f2, f3);
        Matrix matrixCalculateMatrix = this.impl.calculateMatrix();
        matrixCalculateMatrix.preTranslate(this.outsetLeft, this.outsetTop);
        canvas2.concat(matrixCalculateMatrix);
    }

    private final Outline updatePathOutline(Path path) {
        Outline outlineObtainAndroidOutline = obtainAndroidOutline();
        if (Build.VERSION.SDK_INT >= 30) {
            OutlineVerificationHelper.INSTANCE.setPath(outlineObtainAndroidOutline, path);
        } else {
            if (!(path instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outlineObtainAndroidOutline.setConvexPath(((AndroidPath) path).getInternalPath());
        }
        outlineObtainAndroidOutline.offset(this.outsetLeft, this.outsetTop);
        this.usePathForClip = !outlineObtainAndroidOutline.canClip();
        this.outlinePath = path;
        return outlineObtainAndroidOutline;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void discardDisplayList$ui_graphics() {
        /*
            r17 = this;
            r0 = r17
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker r1 = r0.childDependenciesTracker
            androidx.compose.ui.graphics.layer.GraphicsLayer r2 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependency$p(r1)
            if (r2 == 0) goto L11
            r2.onRemovedFromParentLayer()
            r2 = 0
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$setDependency$p(r1, r2)
        L11:
            androidx.collection.MutableScatterSet r1 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependenciesSet$p(r1)
            if (r1 == 0) goto L62
            r2 = r1
            androidx.collection.ScatterSet r2 = (androidx.collection.ScatterSet) r2
            java.lang.Object[] r3 = r2.elements
            long[] r2 = r2.metadata
            int r4 = r2.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L5f
            r5 = 0
            r6 = r5
        L25:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5a
            int r9 = r6 - r4
            r10 = r5
        L38:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L58
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L54
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            androidx.compose.ui.graphics.layer.GraphicsLayer r11 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r11
            r11.onRemovedFromParentLayer()
        L54:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L38
        L58:
            if (r11 != r12) goto L5f
        L5a:
            if (r6 == r4) goto L5f
            int r6 = r6 + 1
            goto L25
        L5f:
            r1.clear()
        L62:
            androidx.compose.ui.graphics.layer.GraphicsLayerImpl r0 = r0.impl
            r0.discardDisplayList()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.discardDisplayList$ui_graphics():void");
    }

    public final void draw$ui_graphics(androidx.compose.ui.graphics.Canvas canvas, GraphicsLayer graphicsLayer) {
        Canvas canvas2;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.isReleased) {
            return;
        }
        long j2 = this.roundRectOutlineTopLeft;
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean zIsHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            transformCanvas(nativeCanvas);
            long j3 = this.roundRectOutlineTopLeft;
            float f2 = this.outsetLeft;
            this.roundRectOutlineTopLeft = Offset.m7984minusMKHz9U(j3, (Float.floatToRawIntBits(this.outsetTop) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32));
        }
        configureOutlineAndClip();
        recreateDisplayListIfNeeded();
        boolean z4 = getShadowElevation() > 0.0f;
        if (z4) {
            canvas.enableZ();
        }
        boolean z5 = !zIsHardwareAccelerated && this.clip;
        if (z5) {
            canvas.save();
            androidx.compose.ui.graphics.Outline outline = getOutline();
            if (outline instanceof Outline.Rectangle) {
                Canvas.CC.m8202clipRectmtrdDE$default(canvas, ((Outline.Rectangle) outline).getBounds(), 0, 2, null);
            } else if (outline instanceof Outline.Rounded) {
                Path Path = this.roundRectClipPath;
                if (Path != null) {
                    Path.rewind();
                } else {
                    Path = AndroidPath_androidKt.Path();
                    this.roundRectClipPath = Path;
                }
                Path.CC.addRoundRect$default(Path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
                Canvas.CC.m8200clipPathmtrdDE$default(canvas, Path, 0, 2, null);
            } else {
                if (!(outline instanceof Outline.Generic)) {
                    throw new i();
                }
                Canvas.CC.m8200clipPathmtrdDE$default(canvas, ((Outline.Generic) outline).getPath(), 0, 2, null);
            }
        }
        if (graphicsLayer != null) {
            graphicsLayer.addSubLayer(this);
        }
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            canvas2 = nativeCanvas;
            z = zIsHardwareAccelerated;
            z2 = z4;
            z3 = z5;
            this.impl.draw(canvas);
        } else {
            CanvasDrawScope canvasDrawScope = this.softwareDrawScope;
            if (canvasDrawScope == null) {
                canvasDrawScope = new CanvasDrawScope();
                this.softwareDrawScope = canvasDrawScope;
            }
            CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
            Density density = this.density;
            LayoutDirection layoutDirection = this.layoutDirection;
            long jM11351toSizeozmzZPI = IntSizeKt.m11351toSizeozmzZPI(this.size);
            Density density2 = canvasDrawScope2.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = canvasDrawScope2.getDrawContext().getLayoutDirection();
            androidx.compose.ui.graphics.Canvas canvas3 = canvasDrawScope2.getDrawContext().getCanvas();
            canvas2 = nativeCanvas;
            z = zIsHardwareAccelerated;
            long jMo8758getSizeNHjbRc = canvasDrawScope2.getDrawContext().mo8758getSizeNHjbRc();
            z2 = z4;
            GraphicsLayer graphicsLayer2 = canvasDrawScope2.getDrawContext().getGraphicsLayer();
            z3 = z5;
            DrawContext drawContext = canvasDrawScope2.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setCanvas(canvas);
            drawContext.mo8759setSizeuvyYCjk(jM11351toSizeozmzZPI);
            drawContext.setGraphicsLayer(this);
            canvas.save();
            try {
                drawWithChildTracking(canvasDrawScope2);
            } finally {
                canvas.restore();
                DrawContext drawContext2 = canvasDrawScope2.getDrawContext();
                drawContext2.setDensity(density2);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas3);
                drawContext2.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer2);
            }
        }
        if (z3) {
            canvas.restore();
        }
        if (z2) {
            canvas.disableZ();
        }
        if (!z) {
            canvas2.restore();
        }
        this.roundRectOutlineTopLeft = j2;
    }

    public final void drawForPersistence$ui_graphics(androidx.compose.ui.graphics.Canvas canvas) {
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            recreateDisplayListIfNeeded();
            this.impl.draw(canvas);
        }
    }

    public final void emulateTrimMemory$ui_graphics() {
        this.impl.discardDisplayList();
    }

    public final float getAlpha() {
        return this.impl.getAlpha();
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m8926getAmbientShadowColor0d7_KjU() {
        return this.impl.mo8942getAmbientShadowColor0d7_KjU();
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m8927getBlendMode0nO6VwU() {
        return this.impl.mo8943getBlendMode0nO6VwU();
    }

    public final float getCameraDistance() {
        return this.impl.getCameraDistance();
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final ColorFilter getColorFilter() {
        return this.impl.getColorFilter();
    }

    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    public final int m8928getCompositingStrategyke2Ky5w() {
        return this.impl.mo8944getCompositingStrategyke2Ky5w();
    }

    public final GraphicsLayerImpl getImpl$ui_graphics() {
        return this.impl;
    }

    public final long getLayerId() {
        return this.impl.getLayerId();
    }

    public final androidx.compose.ui.graphics.Outline getOutline() {
        Outline.Rectangle rectangle;
        androidx.compose.ui.graphics.Outline outline = this.internalOutline;
        Path path = this.outlinePath;
        if (outline != null) {
            return outline;
        }
        if (path != null) {
            Outline.Generic generic = new Outline.Generic(path);
            this.internalOutline = generic;
            return generic;
        }
        long jM11351toSizeozmzZPI = IntSizeKt.m11351toSizeozmzZPI(this.size);
        long j2 = this.roundRectOutlineTopLeft;
        long j3 = this.roundRectOutlineSize;
        if (j3 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM11351toSizeozmzZPI = j3;
        }
        long j4 = j2 >> 32;
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) j4);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat3 = fIntBitsToFloat + Float.intBitsToFloat((int) (jM11351toSizeozmzZPI >> 32));
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) (jM11351toSizeozmzZPI & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        if (this.roundRectCornerRadius > 0.0f) {
            rectangle = new Outline.Rounded(RoundRectKt.m8034RoundRectgG7oq9Y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r1) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        } else {
            rectangle = new Outline.Rectangle(new Rect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.internalOutline = rectangle;
        return rectangle;
    }

    public final long getOwnerViewId() {
        return this.impl.getOwnerId();
    }

    /* renamed from: getPivotOffset-F1C5BW0, reason: not valid java name */
    public final long m8929getPivotOffsetF1C5BW0() {
        return this.pivotOffset;
    }

    public final RenderEffect getRenderEffect() {
        return this.impl.getRenderEffect();
    }

    public final float getRotationX() {
        return this.impl.getRotationX();
    }

    public final float getRotationY() {
        return this.impl.getRotationY();
    }

    public final float getRotationZ() {
        return this.impl.getRotationZ();
    }

    public final float getScaleX() {
        return this.impl.getScaleX();
    }

    public final float getScaleY() {
        return this.impl.getScaleY();
    }

    public final float getShadowElevation() {
        return this.impl.getShadowElevation();
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m8930getSizeYbymL2g() {
        return this.size;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m8931getSpotShadowColor0d7_KjU() {
        return this.impl.mo8946getSpotShadowColor0d7_KjU();
    }

    /* renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m8932getTopLeftnOccac() {
        return this.topLeft;
    }

    public final float getTranslationX() {
        return this.impl.getTranslationX();
    }

    public final float getTranslationY() {
        return this.impl.getTranslationY();
    }

    public final boolean isReleased() {
        return this.isReleased;
    }

    /* renamed from: record-mL-hObY, reason: not valid java name */
    public final void m8933recordmLhObY(Density density, LayoutDirection layoutDirection, long j2, l<? super DrawScope, ab> lVar) {
        m8925setSizeozmzZPI(j2);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = lVar;
        this.impl.setInvalidated(true);
        recordInternal();
    }

    public final void release$ui_graphics() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    public final void setAlpha(float f2) {
        if (this.impl.getAlpha() == f2) {
            return;
        }
        this.impl.setAlpha(f2);
    }

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m8934setAmbientShadowColor8_81llA(long j2) {
        if (Color.m8229equalsimpl0(j2, this.impl.mo8942getAmbientShadowColor0d7_KjU())) {
            return;
        }
        this.impl.mo8947setAmbientShadowColor8_81llA(j2);
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m8935setBlendModes9anfk8(int i2) {
        if (BlendMode.m8137equalsimpl0(this.impl.mo8943getBlendMode0nO6VwU(), i2)) {
            return;
        }
        this.impl.mo8948setBlendModes9anfk8(i2);
    }

    public final void setCameraDistance(float f2) {
        if (this.impl.getCameraDistance() == f2) {
            return;
        }
        this.impl.setCameraDistance(f2);
    }

    public final void setClip(boolean z) {
        if (this.clip != z) {
            this.clip = z;
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (x.n(this.impl.getColorFilter(), colorFilter)) {
            return;
        }
        this.impl.setColorFilter(colorFilter);
    }

    /* renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    public final void m8936setCompositingStrategyWpw9cng(int i2) {
        if (CompositingStrategy.m8915equalsimpl0(this.impl.mo8944getCompositingStrategyke2Ky5w(), i2)) {
            return;
        }
        this.impl.mo8949setCompositingStrategyWpw9cng(i2);
    }

    public final void setOutsets(int i2, int i3, int i4, int i5) {
        this.outsetLeft = i2;
        this.outsetTop = i3;
        this.outsetRight = i4;
        this.outsetBottom = i5;
        this.impl.setOutsets(i2, i3, i4, i5);
    }

    public final void setPathOutline(Path path) {
        resetOutlineParams();
        this.outlinePath = path;
        configureOutlineAndClip();
    }

    /* renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    public final void m8937setPivotOffsetk4lQ0M(long j2) {
        if (Offset.m7977equalsimpl0(this.pivotOffset, j2)) {
            return;
        }
        this.pivotOffset = j2;
        this.impl.mo8951setPivotOffsetk4lQ0M(j2);
    }

    /* renamed from: setRectOutline-tz77jQw, reason: not valid java name */
    public final void m8938setRectOutlinetz77jQw(long j2, long j3) {
        m8939setRoundRectOutlineTNW_H78(j2, j3, 0.0f);
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        if (x.n(this.impl.getRenderEffect(), renderEffect)) {
            return;
        }
        this.impl.setRenderEffect(renderEffect);
    }

    public final void setRotationX(float f2) {
        if (this.impl.getRotationX() == f2) {
            return;
        }
        this.impl.setRotationX(f2);
    }

    public final void setRotationY(float f2) {
        if (this.impl.getRotationY() == f2) {
            return;
        }
        this.impl.setRotationY(f2);
    }

    public final void setRotationZ(float f2) {
        if (this.impl.getRotationZ() == f2) {
            return;
        }
        this.impl.setRotationZ(f2);
    }

    /* renamed from: setRoundRectOutline-TNW_H78, reason: not valid java name */
    public final void m8939setRoundRectOutlineTNW_H78(long j2, long j3, float f2) {
        float f3 = this.outsetLeft;
        float f4 = this.outsetTop;
        long jM7985plusMKHz9U = Offset.m7985plusMKHz9U(j2, (Float.floatToRawIntBits(f4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f3) << 32));
        if (Offset.m7977equalsimpl0(this.roundRectOutlineTopLeft, jM7985plusMKHz9U) && Size.m8045equalsimpl0(this.roundRectOutlineSize, j3) && this.roundRectCornerRadius == f2 && this.outlinePath == null) {
            return;
        }
        resetOutlineParams();
        this.roundRectOutlineTopLeft = jM7985plusMKHz9U;
        this.roundRectOutlineSize = j3;
        this.roundRectCornerRadius = f2;
        configureOutlineAndClip();
    }

    public final void setScaleX(float f2) {
        if (this.impl.getScaleX() == f2) {
            return;
        }
        this.impl.setScaleX(f2);
    }

    public final void setScaleY(float f2) {
        if (this.impl.getScaleY() == f2) {
            return;
        }
        this.impl.setScaleY(f2);
    }

    public final void setShadowElevation(float f2) {
        if (this.impl.getShadowElevation() == f2) {
            return;
        }
        this.impl.setShadowElevation(f2);
        this.outlineDirty = true;
        configureOutlineAndClip();
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m8940setSpotShadowColor8_81llA(long j2) {
        if (Color.m8229equalsimpl0(j2, this.impl.mo8946getSpotShadowColor0d7_KjU())) {
            return;
        }
        this.impl.mo8953setSpotShadowColor8_81llA(j2);
    }

    /* renamed from: setTopLeft--gyyYBs, reason: not valid java name */
    public final void m8941setTopLeftgyyYBs(long j2) {
        if (IntOffset.m11295equalsimpl0(this.topLeft, j2)) {
            return;
        }
        this.topLeft = j2;
        m8922setPositionVbeCjmY(j2, this.size);
    }

    public final void setTranslationX(float f2) {
        if (this.impl.getTranslationX() == f2) {
            return;
        }
        this.impl.setTranslationX(f2);
    }

    public final void setTranslationY(float f2) {
        if (this.impl.getTranslationY() == f2) {
            return;
        }
        this.impl.setTranslationY(f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object toImageBitmap(h.c.e<? super androidx.compose.ui.graphics.ImageBitmap> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.ui.graphics.layer.GraphicsLayer.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r0 = (androidx.compose.ui.graphics.layer.GraphicsLayer.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r0 = new androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            androidx.compose.ui.graphics.layer.LayerSnapshotImpl r5 = androidx.compose.ui.graphics.layer.GraphicsLayer.SnapshotImpl
            r0.label = r3
            java.lang.Object r5 = r5.toBitmap(r4, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            androidx.compose.ui.graphics.ImageBitmap r4 = androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.toImageBitmap(h.c.e):java.lang.Object");
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getClip$annotations() {
    }
}
