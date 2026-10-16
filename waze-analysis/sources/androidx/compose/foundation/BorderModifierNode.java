package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.l;
import h.g.b.aq;
import h.g.b.o;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode implements SemanticsModifierNode {
    public static final int $stable = 8;
    private BorderCache borderCache;
    private Brush brush;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private final boolean isImportantForBounds;
    private Shape shape;
    private final boolean shouldAutoInvalidate;
    private float width;

    private BorderModifierNode(float f2, Brush brush, Shape shape) {
        this.width = f2;
        this.brush = brush;
        this.shape = shape;
        CacheDrawModifierNode CacheDrawModifierNode = DrawModifierKt.CacheDrawModifierNode(new l() { // from class: androidx.compose.foundation.BorderModifierNode$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BorderModifierNode.drawWithCacheModifierNode$lambda$0(this.f$0, (CacheDrawScope) obj);
            }
        });
        delegate(CacheDrawModifierNode);
        this.drawWithCacheModifierNode = CacheDrawModifierNode;
    }

    private final DrawResult drawGenericBorder(CacheDrawScope cacheDrawScope, final Brush brush, final Outline.Generic generic, boolean z, float f2) throws Throwable {
        int iM8473getArgb8888_sVssgQ;
        ColorFilter colorFilterM8269tintxETnrds$default;
        float f3;
        float f4;
        CanvasDrawScope canvasDrawScope;
        DrawContext drawContext;
        long j2;
        if (z) {
            return cacheDrawScope.onDrawWithContent(new l() { // from class: androidx.compose.foundation.BorderModifierNode$$ExternalSyntheticLambda2
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return BorderModifierNode.drawGenericBorder$lambda$0(generic, brush, (ContentDrawScope) obj);
                }
            });
        }
        if (brush instanceof SolidColor) {
            iM8473getArgb8888_sVssgQ = ImageBitmapConfig.Companion.m8472getAlpha8_sVssgQ();
            colorFilterM8269tintxETnrds$default = ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, Color.m8227copywmQWz5c$default(((SolidColor) brush).m8614getValue0d7_KjU(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), 0, 2, null);
        } else {
            iM8473getArgb8888_sVssgQ = ImageBitmapConfig.Companion.m8473getArgb8888_sVssgQ();
            colorFilterM8269tintxETnrds$default = null;
        }
        int i2 = iM8473getArgb8888_sVssgQ;
        final Rect bounds = generic.getPath().getBounds();
        BorderCache borderCache = this.borderCache;
        if (borderCache == null) {
            BorderCache borderCache2 = new BorderCache(null, null, null, null, 15, null);
            this.borderCache = borderCache2;
            borderCache = borderCache2;
        }
        if (borderCache == null) {
            x.g();
        }
        Path pathObtainPath = borderCache.obtainPath();
        pathObtainPath.reset();
        Path.CC.addRect$default(pathObtainPath, bounds, null, 2, null);
        pathObtainPath.mo8117opN5in7k0(pathObtainPath, generic.getPath(), PathOperation.Companion.m8564getDifferenceb3I0S0c());
        final aq aqVar = new aq();
        float fCeil = (float) Math.ceil(bounds.getRight() - bounds.getLeft());
        float fCeil2 = (float) Math.ceil(bounds.getBottom() - bounds.getTop());
        BorderCache borderCache3 = this.borderCache;
        if (borderCache3 == null) {
            x.g();
        }
        ImageBitmap imageBitmapM8478ImageBitmapx__hDU$default = borderCache3.imageBitmap;
        Canvas Canvas = borderCache3.canvas;
        ImageBitmapConfig imageBitmapConfigM8465boximpl = imageBitmapM8478ImageBitmapx__hDU$default != null ? ImageBitmapConfig.m8465boximpl(imageBitmapM8478ImageBitmapx__hDU$default.mo8092getConfig_sVssgQ()) : null;
        int iM8473getArgb8888_sVssgQ2 = ImageBitmapConfig.Companion.m8473getArgb8888_sVssgQ();
        boolean z2 = true;
        if (imageBitmapConfigM8465boximpl == null || !ImageBitmapConfig.m8468equalsimpl0(imageBitmapConfigM8465boximpl.m8471unboximpl(), iM8473getArgb8888_sVssgQ2)) {
            if (!ImageBitmapConfig.m8467equalsimpl(i2, imageBitmapM8478ImageBitmapx__hDU$default != null ? ImageBitmapConfig.m8465boximpl(imageBitmapM8478ImageBitmapx__hDU$default.mo8092getConfig_sVssgQ()) : null)) {
                z2 = false;
            }
        }
        final long j3 = (((int) fCeil) << 32) | (((int) fCeil2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        if (imageBitmapM8478ImageBitmapx__hDU$default == null || Canvas == null || Float.intBitsToFloat((int) (cacheDrawScope.m7760getSizeNHjbRc() >> 32)) > imageBitmapM8478ImageBitmapx__hDU$default.getWidth() || Float.intBitsToFloat((int) (cacheDrawScope.m7760getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) > imageBitmapM8478ImageBitmapx__hDU$default.getHeight() || !z2) {
            imageBitmapM8478ImageBitmapx__hDU$default = ImageBitmapKt.m8478ImageBitmapx__hDU$default((int) (j3 >> 32), (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), i2, false, null, 24, null);
            borderCache3.imageBitmap = imageBitmapM8478ImageBitmapx__hDU$default;
            Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmapM8478ImageBitmapx__hDU$default);
            borderCache3.canvas = Canvas;
        }
        ImageBitmap imageBitmap = imageBitmapM8478ImageBitmapx__hDU$default;
        Canvas canvas = Canvas;
        CanvasDrawScope canvasDrawScope2 = borderCache3.canvasDrawScope;
        if (canvasDrawScope2 == null) {
            canvasDrawScope2 = new CanvasDrawScope();
            borderCache3.canvasDrawScope = canvasDrawScope2;
        }
        CanvasDrawScope canvasDrawScope3 = canvasDrawScope2;
        long jM11351toSizeozmzZPI = IntSizeKt.m11351toSizeozmzZPI(j3);
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope3.getDrawParams();
        Density densityComponent1 = drawParams.component1();
        LayoutDirection layoutDirectionComponent2 = drawParams.component2();
        Canvas canvasComponent3 = drawParams.component3();
        long jM8754component4NHjbRc = drawParams.m8754component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope3.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m8757setSizeuvyYCjk(jM11351toSizeozmzZPI);
        canvas.save();
        CanvasDrawScope canvasDrawScope4 = canvasDrawScope3;
        DrawScope.CC.m8836drawRectnJ9OG0$default(canvasDrawScope4, Color.Companion.m8254getBlack0d7_KjU(), 0L, jM11351toSizeozmzZPI, 0.0f, null, null, BlendMode.Companion.m8141getClear0nO6VwU(), 58, null);
        float f5 = -bounds.getLeft();
        float f6 = -bounds.getTop();
        canvasDrawScope4.getDrawContext().getTransform().translate(f5, f6);
        float f7 = -f6;
        float f8 = -f5;
        try {
            f4 = f8;
            f3 = f7;
            canvasDrawScope = canvasDrawScope4;
            final ColorFilter colorFilter = colorFilterM8269tintxETnrds$default;
            try {
                DrawScope.CC.m8831drawPathGBMwjPU$default(canvasDrawScope, generic.getPath(), brush, 0.0f, new Stroke(f2 + f2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                float fIntBitsToFloat = (Float.intBitsToFloat((int) (canvasDrawScope.mo8751getSizeNHjbRc() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (canvasDrawScope.mo8751getSizeNHjbRc() >> 32));
                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (canvasDrawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + 1.0f) / Float.intBitsToFloat((int) (canvasDrawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                long jMo8750getCenterF1C5BW0 = canvasDrawScope.mo8750getCenterF1C5BW0();
                DrawContext drawContext2 = canvasDrawScope.getDrawContext();
                long jMo8758getSizeNHjbRc = drawContext2.mo8758getSizeNHjbRc();
                drawContext2.getCanvas().save();
                try {
                    drawContext2.getTransform().mo8765scale0AR0LA0(fIntBitsToFloat, fIntBitsToFloat2, jMo8750getCenterF1C5BW0);
                    j2 = jMo8758getSizeNHjbRc;
                    try {
                        DrawScope.CC.m8831drawPathGBMwjPU$default(canvasDrawScope, pathObtainPath, brush, 0.0f, null, null, BlendMode.Companion.m8141getClear0nO6VwU(), 28, null);
                        drawContext2.getCanvas().restore();
                        drawContext2.mo8759setSizeuvyYCjk(j2);
                        canvasDrawScope.getDrawContext().getTransform().translate(f4, f3);
                        canvas.restore();
                        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope3.getDrawParams();
                        drawParams3.setDensity(densityComponent1);
                        drawParams3.setLayoutDirection(layoutDirectionComponent2);
                        drawParams3.setCanvas(canvasComponent3);
                        drawParams3.m8757setSizeuvyYCjk(jM8754component4NHjbRc);
                        imageBitmap.prepareToDraw();
                        aqVar.f48105a = imageBitmap;
                        return cacheDrawScope.onDrawWithContent(new l() { // from class: androidx.compose.foundation.BorderModifierNode$$ExternalSyntheticLambda3
                            @Override // h.g.a.l
                            public final Object invoke(Object obj) {
                                return BorderModifierNode.drawGenericBorder$lambda$3(bounds, aqVar, j3, colorFilter, (ContentDrawScope) obj);
                            }
                        });
                    } catch (Throwable th) {
                        th = th;
                        drawContext = drawContext2;
                        drawContext.getCanvas().restore();
                        drawContext.mo8759setSizeuvyYCjk(j2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    drawContext = drawContext2;
                    j2 = jMo8758getSizeNHjbRc;
                }
            } catch (Throwable th3) {
                th = th3;
                canvasDrawScope.getDrawContext().getTransform().translate(f4, f3);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            f3 = f7;
            f4 = f8;
            canvasDrawScope = canvasDrawScope4;
        }
    }

    static final ab drawGenericBorder$lambda$0(Outline.Generic generic, Brush brush, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        DrawScope.CC.m8831drawPathGBMwjPU$default(contentDrawScope, generic.getPath(), brush, 0.0f, null, null, 0, 60, null);
        return ab.f48028a;
    }

    static final ab drawGenericBorder$lambda$3(Rect rect, aq aqVar, long j2, ColorFilter colorFilter, ContentDrawScope contentDrawScope) throws Throwable {
        float f2;
        contentDrawScope.drawContent();
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        float left = rect.getLeft();
        float f3 = -left;
        float top = rect.getTop();
        float f4 = -top;
        contentDrawScope2.getDrawContext().getTransform().translate(left, top);
        try {
        } catch (Throwable th) {
            th = th;
            f2 = f4;
        }
        try {
            DrawScope.CC.m8825drawImageAZ2fEMs$default(contentDrawScope2, (ImageBitmap) aqVar.f48105a, 0L, j2, 0L, 0L, 0.0f, null, colorFilter, 0, 0, DisplayStrings.DS_ADD_A_MESSAGE_OPTIONAL, null);
            contentDrawScope2.getDrawContext().getTransform().translate(f3, f4);
            return ab.f48028a;
        } catch (Throwable th2) {
            th = th2;
            f3 = f3;
            f2 = f4;
            contentDrawScope2.getDrawContext().getTransform().translate(f3, f2);
            throw th;
        }
    }

    /* renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    private final DrawResult m1988drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j2, final long j3, final boolean z, final float f2) {
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long jM8030getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m8030getTopLeftCornerRadiuskKHJgLs();
            final float f3 = f2 / 2.0f;
            final Stroke stroke = new Stroke(f2, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new l() { // from class: androidx.compose.foundation.BorderModifierNode$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return BorderModifierNode.drawRoundRectBorder_JqoCqck$lambda$0(z, brush, jM8030getTopLeftCornerRadiuskKHJgLs, f3, f2, j2, j3, stroke, (ContentDrawScope) obj);
                }
            });
        }
        BorderCache borderCache = this.borderCache;
        if (borderCache == null) {
            BorderCache borderCache2 = new BorderCache(null, null, null, null, 15, null);
            this.borderCache = borderCache2;
            borderCache = borderCache2;
        }
        if (borderCache == null) {
            x.g();
        }
        final Path pathObtainPath = borderCache.obtainPath();
        BorderKt.access$createRoundRectPath(pathObtainPath, rounded.getRoundRect(), f2, z);
        return cacheDrawScope.onDrawWithContent(new l() { // from class: androidx.compose.foundation.BorderModifierNode$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BorderModifierNode.drawRoundRectBorder_JqoCqck$lambda$1(pathObtainPath, brush, (ContentDrawScope) obj);
            }
        });
    }

    static final ab drawRoundRectBorder_JqoCqck$lambda$0(boolean z, Brush brush, long j2, float f2, float f3, long j3, long j4, Stroke stroke, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (z) {
            DrawScope.CC.m8837drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, j2, 0.0f, null, null, 0, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_DEFAULT_3, null);
        } else if (Float.intBitsToFloat((int) (j2 >> 32)) < f2) {
            ContentDrawScope contentDrawScope2 = contentDrawScope;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo8751getSizeNHjbRc() >> 32)) - f3;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - f3;
            int iM8216getDifferencertfAjoo = ClipOp.Companion.m8216getDifferencertfAjoo();
            DrawContext drawContext = contentDrawScope2.getDrawContext();
            long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo8761clipRectN_I0leg(f3, f3, fIntBitsToFloat, fIntBitsToFloat2, iM8216getDifferencertfAjoo);
                DrawScope.CC.m8837drawRoundRectZuiqVtQ$default(contentDrawScope2, brush, 0L, 0L, j2, 0.0f, null, null, 0, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_DEFAULT_3, null);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            }
        } else {
            DrawScope.CC.m8837drawRoundRectZuiqVtQ$default(contentDrawScope, brush, j3, j4, BorderKt.m1987shrinkKibmq7A(j2, f2), 0.0f, stroke, null, 0, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_7, null);
        }
        return ab.f48028a;
    }

    static final ab drawRoundRectBorder_JqoCqck$lambda$1(Path path, Brush brush, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        DrawScope.CC.m8831drawPathGBMwjPU$default(contentDrawScope, path, brush, 0.0f, null, null, 0, 60, null);
        return ab.f48028a;
    }

    static final DrawResult drawWithCacheModifierNode$lambda$0(BorderModifierNode borderModifierNode, CacheDrawScope cacheDrawScope) {
        if (cacheDrawScope.mo2127toPx0680j_4(borderModifierNode.width) < 0.0f || Size.m8048getMinDimensionimpl(cacheDrawScope.m7760getSizeNHjbRc()) <= 0.0f) {
            return BorderKt.drawContentWithoutBorder(cacheDrawScope);
        }
        float fMin = Math.min(Dp.m11169equalsimpl0(borderModifierNode.width, Dp.Companion.m11182getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo2127toPx0680j_4(borderModifierNode.width)), (float) Math.ceil(Size.m8048getMinDimensionimpl(cacheDrawScope.m7760getSizeNHjbRc()) / 2.0f));
        float f2 = fMin / 2.0f;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.m7760getSizeNHjbRc() >> 32)) - fMin;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cacheDrawScope.m7760getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - fMin;
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits4 = Float.floatToRawIntBits(fIntBitsToFloat2);
        boolean z = fMin + fMin > Size.m8048getMinDimensionimpl(cacheDrawScope.m7760getSizeNHjbRc());
        Outline outlineMo2037createOutlinePq9zytI = borderModifierNode.shape.mo2037createOutlinePq9zytI(cacheDrawScope.m7760getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
        if (outlineMo2037createOutlinePq9zytI instanceof Outline.Generic) {
            return borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.brush, (Outline.Generic) outlineMo2037createOutlinePq9zytI, z, fMin);
        }
        boolean z2 = z;
        boolean z3 = outlineMo2037createOutlinePq9zytI instanceof Outline.Rounded;
        long j2 = (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
        long j3 = (jFloatToRawIntBits4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits3 << 32);
        if (z3) {
            return borderModifierNode.m1988drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode.brush, (Outline.Rounded) outlineMo2037createOutlinePq9zytI, j2, j3, z2, fMin);
        }
        if (outlineMo2037createOutlinePq9zytI instanceof Outline.Rectangle) {
            return BorderKt.m1986drawRectBorderNsqcLGU(cacheDrawScope, borderModifierNode.brush, j2, j3, z2, fMin);
        }
        throw new i();
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setShape(semanticsPropertyReceiver, this.shape);
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m1989getWidthD9Ej5fM() {
        return this.width;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean isImportantForBounds() {
        return this.isImportantForBounds;
    }

    public final void setBrush(Brush brush) {
        if (x.n(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final void setShape(Shape shape) {
        if (x.n(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
        SemanticsModifierNodeKt.invalidateSemantics(this);
    }

    /* renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m1990setWidth0680j_4(float f2) {
        if (Dp.m11169equalsimpl0(this.width, f2)) {
            return;
        }
        this.width = f2;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public /* synthetic */ BorderModifierNode(float f2, Brush brush, Shape shape, o oVar) {
        this(f2, brush, shape);
    }
}
