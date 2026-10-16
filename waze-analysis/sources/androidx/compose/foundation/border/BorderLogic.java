package androidx.compose.foundation.border;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.layer.CompositingStrategy;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.an;
import h.g.b.aq;
import h.g.b.x;
import h.i;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BorderLogic {
    public static final int $stable = 8;
    private Path borderPath;
    private a<Float> borderWidth;
    private l<? super DrawScope, ab> drawBorder;
    private Brush lastBrush;
    private Outline lastOutline;

    private final l<DrawScope, ab> createDrawGenericBorder(final Brush brush, final a<GraphicsLayer> aVar, final Outline.Generic generic) {
        final Rect bounds = generic.getPath().getBounds();
        final float minDimension = bounds.getMinDimension();
        final Path pathObtainPath = obtainPath();
        pathObtainPath.reset();
        Path.CC.addRect$default(pathObtainPath, bounds, null, 2, null);
        pathObtainPath.mo8117opN5in7k0(pathObtainPath, generic.getPath(), PathOperation.Companion.m8564getDifferenceb3I0S0c());
        final long jCeil = (((int) Math.ceil(bounds.getBottom() - bounds.getTop())) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (((int) Math.ceil(bounds.getRight() - bounds.getLeft())) << 32);
        return new l() { // from class: androidx.compose.foundation.border.BorderLogic$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BorderLogic.createDrawGenericBorder$lambda$1(this.f$0, minDimension, generic, brush, aVar, bounds, jCeil, pathObtainPath, (DrawScope) obj);
            }
        };
    }

    static final ab createDrawGenericBorder$lambda$1(BorderLogic borderLogic, float f2, final Outline.Generic generic, final Brush brush, a aVar, final Rect rect, long j2, final Path path, DrawScope drawScope) {
        a<Float> aVar2 = borderLogic.borderWidth;
        x.c(aVar2);
        final float fE = n.e(aVar2.invoke().floatValue(), 0.0f);
        if (fE + fE > f2) {
            DrawScope.CC.m8831drawPathGBMwjPU$default(drawScope, generic.getPath(), brush, 0.0f, null, null, 0, 60, null);
        } else {
            GraphicsLayer graphicsLayer = (GraphicsLayer) aVar.invoke();
            graphicsLayer.m8936setCompositingStrategyWpw9cng(CompositingStrategy.Companion.m8921getOffscreenke2Ky5w());
            float left = rect.getLeft();
            float f3 = -left;
            float top = rect.getTop();
            float f4 = -top;
            drawScope.getDrawContext().getTransform().translate(left, top);
            try {
                drawScope.mo8752recordJVtK1S4(graphicsLayer, j2, new l() { // from class: androidx.compose.foundation.border.BorderLogic$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return BorderLogic.createDrawGenericBorder$lambda$1$0$0(rect, generic, brush, fE, path, (DrawScope) obj);
                    }
                });
                GraphicsLayerKt.drawLayer(drawScope, graphicsLayer);
            } finally {
                drawScope.getDrawContext().getTransform().translate(f3, f4);
            }
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab createDrawGenericBorder$lambda$1$0$0(Rect rect, Outline.Generic generic, Brush brush, float f2, Path path, DrawScope drawScope) {
        float f3 = -rect.getLeft();
        float f4 = -rect.getTop();
        drawScope.getDrawContext().getTransform().translate(f3, f4);
        float f5 = -f4;
        float f6 = -f3;
        try {
            DrawScope.CC.m8831drawPathGBMwjPU$default(drawScope, generic.getPath(), brush, 0.0f, new Stroke(f2 + f2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32));
            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + 1.0f) / Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            long jMo8750getCenterF1C5BW0 = drawScope.mo8750getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo8765scale0AR0LA0(fIntBitsToFloat, fIntBitsToFloat2, jMo8750getCenterF1C5BW0);
                DrawScope.CC.m8831drawPathGBMwjPU$default(drawScope, path, brush, 0.0f, null, null, BlendMode.Companion.m8141getClear0nO6VwU(), 28, null);
                drawScope.getDrawContext().getTransform().translate(f6, f5);
                return ab.f48028a;
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            }
        } catch (Throwable th) {
            drawScope.getDrawContext().getTransform().translate(f6, f5);
            throw th;
        }
    }

    private final l<DrawScope, ab> createDrawRectBorder(final Brush brush, Outline.Rectangle rectangle) {
        final Rect rect = rectangle.getRect();
        return new l() { // from class: androidx.compose.foundation.border.BorderLogic$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BorderLogic.createDrawRectBorder$lambda$0(this.f$0, rect, brush, (DrawScope) obj);
            }
        };
    }

    static final ab createDrawRectBorder$lambda$0(BorderLogic borderLogic, Rect rect, Brush brush, DrawScope drawScope) {
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        a<Float> aVar = borderLogic.borderWidth;
        x.c(aVar);
        float fE = n.e(aVar.invoke().floatValue(), 0.0f);
        boolean z = fE + fE > rect.getMinDimension();
        if (z) {
            jFloatToRawIntBits = rect.m8015getTopLeftF1C5BW0();
        } else {
            float f2 = fE / 2.0f;
            jFloatToRawIntBits = (Float.floatToRawIntBits(rect.getLeft() + f2) << 32) | (Float.floatToRawIntBits(rect.getTop() + f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }
        long j2 = jFloatToRawIntBits;
        if (z) {
            jFloatToRawIntBits2 = rect.m8013getSizeNHjbRc();
        } else {
            float right = (rect.getRight() - rect.getLeft()) - fE;
            jFloatToRawIntBits2 = (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits((rect.getBottom() - rect.getTop()) - fE)) | (Float.floatToRawIntBits(right) << 32);
        }
        DrawScope.CC.m8835drawRectAsUm42w$default(drawScope, brush, j2, jFloatToRawIntBits2, 0.0f, z ? Fill.INSTANCE : new Stroke(fE, 0.0f, 0, 0, null, 30, null), null, 0, 104, null);
        return ab.f48028a;
    }

    private final l<DrawScope, ab> createDrawRoundRectBorder(final Brush brush, Outline.Rounded rounded) {
        final RoundRect roundRect = rounded.getRoundRect();
        if (RoundRectKt.isSimple(roundRect)) {
            return new l() { // from class: androidx.compose.foundation.border.BorderLogic$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return BorderLogic.createDrawRoundRectBorder$lambda$0(this.f$0, roundRect, brush, (DrawScope) obj);
                }
            };
        }
        final Path pathObtainPath = obtainPath();
        final an anVar = new an();
        anVar.f48102a = Float.NaN;
        final aq aqVar = new aq();
        return new l() { // from class: androidx.compose.foundation.border.BorderLogic$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BorderLogic.createDrawRoundRectBorder$lambda$1(this.f$0, roundRect, anVar, aqVar, pathObtainPath, brush, (DrawScope) obj);
            }
        };
    }

    static final ab createDrawRoundRectBorder$lambda$0(BorderLogic borderLogic, RoundRect roundRect, Brush brush, DrawScope drawScope) throws Throwable {
        long j2;
        a<Float> aVar = borderLogic.borderWidth;
        x.c(aVar);
        float fE = n.e(aVar.invoke().floatValue(), 0.0f);
        float f2 = fE + fE;
        float minDimension = RoundRectKt.getMinDimension(roundRect);
        long jM8030getTopLeftCornerRadiuskKHJgLs = roundRect.m8030getTopLeftCornerRadiuskKHJgLs();
        Stroke stroke = new Stroke(fE, 0.0f, 0, 0, null, 30, null);
        if (f2 > minDimension) {
            float left = roundRect.getLeft();
            float top = roundRect.getTop();
            long jFloatToRawIntBits = Float.floatToRawIntBits(left);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(top) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            float width = roundRect.getWidth();
            float height = roundRect.getHeight();
            DrawScope.CC.m8837drawRoundRectZuiqVtQ$default(drawScope, brush, (jFloatToRawIntBits << 32) | jFloatToRawIntBits2, (Float.floatToRawIntBits(width) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(height)), jM8030getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 240, null);
        } else {
            float f3 = fE / 2.0f;
            if (Float.intBitsToFloat((int) (jM8030getTopLeftCornerRadiuskKHJgLs >> 32)) < f3) {
                float left2 = roundRect.getLeft() + fE;
                float top2 = roundRect.getTop() + fE;
                float right = roundRect.getRight() - fE;
                float bottom = roundRect.getBottom() - fE;
                int iM8216getDifferencertfAjoo = ClipOp.Companion.m8216getDifferencertfAjoo();
                DrawContext drawContext = drawScope.getDrawContext();
                long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo8761clipRectN_I0leg(left2, top2, right, bottom, iM8216getDifferencertfAjoo);
                    float left3 = roundRect.getLeft();
                    float top3 = roundRect.getTop();
                    long jFloatToRawIntBits3 = Float.floatToRawIntBits(left3) << 32;
                    long jFloatToRawIntBits4 = Float.floatToRawIntBits(top3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                    float width2 = roundRect.getWidth();
                    float height2 = roundRect.getHeight();
                    try {
                        DrawScope.CC.m8837drawRoundRectZuiqVtQ$default(drawScope, brush, jFloatToRawIntBits3 | jFloatToRawIntBits4, (Float.floatToRawIntBits(width2) << 32) | (Float.floatToRawIntBits(height2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), jM8030getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 240, null);
                        drawContext.getCanvas().restore();
                        drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
                    } catch (Throwable th) {
                        th = th;
                        j2 = jMo8758getSizeNHjbRc;
                        drawContext.getCanvas().restore();
                        drawContext.mo8759setSizeuvyYCjk(j2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j2 = jMo8758getSizeNHjbRc;
                }
            } else {
                float left4 = roundRect.getLeft() + f3;
                float top4 = roundRect.getTop() + f3;
                long jFloatToRawIntBits5 = Float.floatToRawIntBits(left4);
                long jFloatToRawIntBits6 = Float.floatToRawIntBits(top4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                float width3 = roundRect.getWidth() - fE;
                float height3 = roundRect.getHeight() - fE;
                DrawScope.CC.m8837drawRoundRectZuiqVtQ$default(drawScope, brush, (jFloatToRawIntBits5 << 32) | jFloatToRawIntBits6, (Float.floatToRawIntBits(width3) << 32) | (Float.floatToRawIntBits(height3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), BorderLogicKt.m2075shrinkKibmq7A(jM8030getTopLeftCornerRadiuskKHJgLs, f3), 0.0f, stroke, null, 0, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_7, null);
            }
        }
        return ab.f48028a;
    }

    static final ab createDrawRoundRectBorder$lambda$1(BorderLogic borderLogic, RoundRect roundRect, an anVar, aq aqVar, Path path, Brush brush, DrawScope drawScope) {
        a<Float> aVar = borderLogic.borderWidth;
        x.c(aVar);
        float fE = n.e(aVar.invoke().floatValue(), 0.0f);
        float minDimension = RoundRectKt.getMinDimension(roundRect);
        if (anVar.f48102a != fE) {
            BorderLogicKt.access$createRoundRectPath(path, roundRect, fE, fE + fE > minDimension);
            aqVar.f48105a = path;
            anVar.f48102a = fE;
        }
        Object obj = aqVar.f48105a;
        x.c(obj);
        DrawScope.CC.m8831drawPathGBMwjPU$default(drawScope, (Path) obj, brush, 0.0f, null, null, 0, 60, null);
        return ab.f48028a;
    }

    private final Path obtainPath() {
        Path path = this.borderPath;
        if (path != null) {
            return path;
        }
        Path Path = AndroidPath_androidKt.Path();
        this.borderPath = Path;
        return Path;
    }

    private final float strokeWidthPx() {
        a<Float> aVar = this.borderWidth;
        x.c(aVar);
        return n.e(aVar.invoke().floatValue(), 0.0f);
    }

    /* renamed from: drawBorder-2gY9BTk$foundation, reason: not valid java name */
    public final void m2073drawBorder2gY9BTk$foundation(DrawScope drawScope, a<Float> aVar, Brush brush, a<GraphicsLayer> aVar2, Outline outline, long j2) {
        l<DrawScope, ab> lVarCreateDrawRectBorder;
        this.borderWidth = aVar;
        if (!x.n(brush, this.lastBrush) || !x.n(outline, this.lastOutline) || this.drawBorder == null) {
            this.lastBrush = brush;
            this.lastOutline = outline;
            if (outline instanceof Outline.Generic) {
                lVarCreateDrawRectBorder = createDrawGenericBorder(brush, aVar2, (Outline.Generic) outline);
            } else if (outline instanceof Outline.Rounded) {
                lVarCreateDrawRectBorder = createDrawRoundRectBorder(brush, (Outline.Rounded) outline);
            } else {
                if (!(outline instanceof Outline.Rectangle)) {
                    throw new i();
                }
                lVarCreateDrawRectBorder = createDrawRectBorder(brush, (Outline.Rectangle) outline);
            }
            this.drawBorder = lVarCreateDrawRectBorder;
        }
        if (Offset.m7977equalsimpl0(j2, Offset.Companion.m7996getZeroF1C5BW0())) {
            l<? super DrawScope, ab> lVar = this.drawBorder;
            x.c(lVar);
            lVar.invoke(drawScope);
            return;
        }
        long j3 = MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float f2 = -fIntBitsToFloat;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) j3);
        float f3 = -fIntBitsToFloat2;
        drawScope.getDrawContext().getTransform().translate(fIntBitsToFloat, fIntBitsToFloat2);
        try {
            l<? super DrawScope, ab> lVar2 = this.drawBorder;
            x.c(lVar2);
            lVar2.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().translate(f2, f3);
        }
    }
}
