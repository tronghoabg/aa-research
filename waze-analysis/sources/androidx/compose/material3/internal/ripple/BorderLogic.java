package androidx.compose.material3.internal.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
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
import androidx.compose.ui.unit.Dp;
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
/* loaded from: classes2.dex */
public final class BorderLogic {
    public static final int $stable = 8;
    private BorderCache borderCache;
    private a<Dp> borderInset;
    private a<Dp> borderWidth;
    private l<? super DrawScope, ab> drawBorder;
    private Brush lastBrush;
    private Outline lastOutline;

    /* renamed from: borderSize-bSu-EZI, reason: not valid java name */
    private final long m6394borderSizebSuEZI(DrawScope drawScope, float f2, float f3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32)) - f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - f2;
        return (Float.floatToRawIntBits(fIntBitsToFloat2 - r8) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fIntBitsToFloat - (f3 + f3)) << 32);
    }

    private final l<DrawScope, ab> createDrawGenericBorder(final Brush brush, final a<GraphicsLayer> aVar, final Outline.Generic generic) {
        final Rect bounds = generic.getPath().getBounds();
        BorderCache borderCache = this.borderCache;
        if (borderCache == null) {
            borderCache = new BorderCache();
            this.borderCache = borderCache;
        }
        x.c(borderCache);
        final Path pathObtainPath = borderCache.obtainPath();
        pathObtainPath.reset();
        Path.CC.addRect$default(pathObtainPath, bounds, null, 2, null);
        pathObtainPath.mo8117opN5in7k0(pathObtainPath, generic.getPath(), PathOperation.Companion.m8564getDifferenceb3I0S0c());
        float fCeil = (float) Math.ceil(bounds.getRight() - bounds.getLeft());
        final long jCeil = (((int) Math.ceil(bounds.getBottom() - bounds.getTop())) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (((int) fCeil) << 32);
        return new l() { // from class: androidx.compose.material3.internal.ripple.BorderLogic$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BorderLogic.createDrawGenericBorder$lambda$1(this.f$0, generic, brush, bounds, jCeil, aVar, pathObtainPath, (DrawScope) obj);
            }
        };
    }

    static final ab createDrawGenericBorder$lambda$1(BorderLogic borderLogic, final Outline.Generic generic, final Brush brush, final Rect rect, long j2, a aVar, final Path path, DrawScope drawScope) {
        a<Dp> aVar2 = borderLogic.borderWidth;
        x.c(aVar2);
        float fCeil = Dp.m11169equalsimpl0(aVar2.invoke().m11178unboximpl(), Dp.Companion.m11182getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(drawScope.mo2127toPx0680j_4(r0));
        float fM8048getMinDimensionimpl = Size.m8048getMinDimensionimpl(drawScope.mo8751getSizeNHjbRc());
        x.c(borderLogic.borderInset);
        float fCeil2 = (float) Math.ceil(drawScope.mo2127toPx0680j_4(r3.invoke().m11178unboximpl()));
        final float fE = n.e(Math.min(fCeil, (float) Math.ceil((fM8048getMinDimensionimpl - (fCeil2 + fCeil2)) / 2.0f)), 0.0f);
        x.c(borderLogic.borderInset);
        final float fCeil3 = (float) Math.ceil(drawScope.mo2127toPx0680j_4(r0.invoke().m11178unboximpl()));
        if (fCeil3 != 0.0f || fE + fE <= Size.m8048getMinDimensionimpl(drawScope.mo8751getSizeNHjbRc())) {
            float left = rect.getLeft();
            float f2 = -left;
            float top = rect.getTop();
            float f3 = -top;
            drawScope.getDrawContext().getTransform().translate(left, top);
            try {
                x.c(borderLogic.borderCache);
                GraphicsLayer graphicsLayer = (GraphicsLayer) aVar.invoke();
                graphicsLayer.m8936setCompositingStrategyWpw9cng(CompositingStrategy.Companion.m8921getOffscreenke2Ky5w());
                drawScope.mo8752recordJVtK1S4(graphicsLayer, j2, new l<DrawScope, ab>() { // from class: androidx.compose.material3.internal.ripple.BorderLogic$createDrawGenericBorder$lambda$1$0$0$$inlined$drawBorderCache-95KtPRI$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope2) {
                        float f4 = -rect.getLeft();
                        float f5 = -rect.getTop();
                        drawScope2.getDrawContext().getTransform().translate(f4, f5);
                        float f6 = -f5;
                        float f7 = -f4;
                        try {
                            Path path2 = generic.getPath();
                            Brush brush2 = brush;
                            float f8 = fE + fCeil3;
                            DrawScope.CC.m8831drawPathGBMwjPU$default(drawScope2, path2, brush2, 0.0f, new Stroke(f8 + f8, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                            Path path3 = generic.getPath();
                            Brush brush3 = brush;
                            float f9 = fCeil3;
                            DrawScope.CC.m8831drawPathGBMwjPU$default(drawScope2, path3, brush3, 0.0f, new Stroke(f9 + f9, 0.0f, 0, 0, null, 30, null), null, BlendMode.Companion.m8141getClear0nO6VwU(), 20, null);
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawScope2.mo8751getSizeNHjbRc() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (drawScope2.mo8751getSizeNHjbRc() >> 32));
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (drawScope2.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + 1.0f) / Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & drawScope2.mo8751getSizeNHjbRc()));
                            long jMo8750getCenterF1C5BW0 = drawScope2.mo8750getCenterF1C5BW0();
                            DrawContext drawContext = drawScope2.getDrawContext();
                            long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
                            drawContext.getCanvas().save();
                            try {
                                drawContext.getTransform().mo8765scale0AR0LA0(fIntBitsToFloat, fIntBitsToFloat2, jMo8750getCenterF1C5BW0);
                                DrawScope.CC.m8831drawPathGBMwjPU$default(drawScope2, path, brush, 0.0f, null, null, BlendMode.Companion.m8141getClear0nO6VwU(), 28, null);
                            } finally {
                                drawContext.getCanvas().restore();
                                drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
                            }
                        } finally {
                            drawScope2.getDrawContext().getTransform().translate(f7, f6);
                        }
                    }

                    @Override // h.g.a.l
                    public /* bridge */ /* synthetic */ ab invoke(DrawScope drawScope2) {
                        invoke2(drawScope2);
                        return ab.f48028a;
                    }
                });
                GraphicsLayerKt.drawLayer(drawScope, graphicsLayer);
            } finally {
                drawScope.getDrawContext().getTransform().translate(f2, f3);
            }
        } else {
            DrawScope.CC.m8831drawPathGBMwjPU$default(drawScope, generic.getPath(), brush, 0.0f, null, null, 0, 60, null);
        }
        return ab.f48028a;
    }

    private final l<DrawScope, ab> createDrawRectBorder(final Brush brush) {
        return new l() { // from class: androidx.compose.material3.internal.ripple.BorderLogic$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BorderLogic.createDrawRectBorder$lambda$0(this.f$0, brush, (DrawScope) obj);
            }
        };
    }

    static final ab createDrawRectBorder$lambda$0(BorderLogic borderLogic, Brush brush, DrawScope drawScope) {
        a<Dp> aVar = borderLogic.borderWidth;
        x.c(aVar);
        float fCeil = Dp.m11169equalsimpl0(aVar.invoke().m11178unboximpl(), Dp.Companion.m11182getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(drawScope.mo2127toPx0680j_4(r2));
        float fM8048getMinDimensionimpl = Size.m8048getMinDimensionimpl(drawScope.mo8751getSizeNHjbRc());
        x.c(borderLogic.borderInset);
        float fCeil2 = (float) Math.ceil(drawScope.mo2127toPx0680j_4(r4.invoke().m11178unboximpl()));
        float fE = n.e(Math.min(fCeil, (float) Math.ceil((fM8048getMinDimensionimpl - (fCeil2 + fCeil2)) / 2.0f)), 0.0f);
        x.c(borderLogic.borderInset);
        float fCeil3 = (float) Math.ceil(drawScope.mo2127toPx0680j_4(r0.invoke().m11178unboximpl()));
        float f2 = (fE / 2.0f) + fCeil3;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32)) - fE;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - fE;
        float f3 = fCeil3 + fCeil3;
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat - f3);
        long jFloatToRawIntBits4 = Float.floatToRawIntBits(fIntBitsToFloat2 - f3);
        boolean z = false;
        if (fCeil3 == 0.0f && fE + fE > Size.m8048getMinDimensionimpl(drawScope.mo8751getSizeNHjbRc())) {
            z = true;
        }
        DrawScope.CC.m8835drawRectAsUm42w$default(drawScope, brush, z ? Offset.Companion.m7996getZeroF1C5BW0() : (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), z ? drawScope.mo8751getSizeNHjbRc() : (jFloatToRawIntBits4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits3 << 32), 0.0f, z ? Fill.INSTANCE : new Stroke(fE, 0.0f, 0, 0, null, 30, null), null, 0, 104, null);
        return ab.f48028a;
    }

    private final l<DrawScope, ab> createDrawRoundRectBorder(final Brush brush, final Outline.Rounded rounded) {
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            return new l() { // from class: androidx.compose.material3.internal.ripple.BorderLogic$$ExternalSyntheticLambda2
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return BorderLogic.createDrawRoundRectBorder$lambda$0(this.f$0, rounded, brush, (DrawScope) obj);
                }
            };
        }
        BorderCache borderCache = this.borderCache;
        if (borderCache == null) {
            borderCache = new BorderCache();
            this.borderCache = borderCache;
        }
        x.c(borderCache);
        final Path pathObtainPath = borderCache.obtainPath();
        final an anVar = new an();
        anVar.f48102a = Float.NaN;
        final aq aqVar = new aq();
        return new l() { // from class: androidx.compose.material3.internal.ripple.BorderLogic$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BorderLogic.createDrawRoundRectBorder$lambda$1(this.f$0, anVar, aqVar, pathObtainPath, rounded, brush, (DrawScope) obj);
            }
        };
    }

    static final ab createDrawRoundRectBorder$lambda$0(BorderLogic borderLogic, Outline.Rounded rounded, Brush brush, DrawScope drawScope) throws Throwable {
        long j2;
        a<Dp> aVar = borderLogic.borderWidth;
        x.c(aVar);
        float fCeil = Dp.m11169equalsimpl0(aVar.invoke().m11178unboximpl(), Dp.Companion.m11182getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(drawScope.mo2127toPx0680j_4(r2));
        float fM8048getMinDimensionimpl = Size.m8048getMinDimensionimpl(drawScope.mo8751getSizeNHjbRc());
        x.c(borderLogic.borderInset);
        float fCeil2 = (float) Math.ceil(drawScope.mo2127toPx0680j_4(r4.invoke().m11178unboximpl()));
        float fE = n.e(Math.min(fCeil, (float) Math.ceil((fM8048getMinDimensionimpl - (fCeil2 + fCeil2)) / 2.0f)), 0.0f);
        x.c(borderLogic.borderInset);
        float fCeil3 = (float) Math.ceil(drawScope.mo2127toPx0680j_4(r0.invoke().m11178unboximpl()));
        float f2 = fE / 2.0f;
        float f3 = f2 + fCeil3;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f3);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32)) - fE;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - fE;
        float f4 = fCeil3 + fCeil3;
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat - f4);
        long jFloatToRawIntBits4 = Float.floatToRawIntBits(fIntBitsToFloat2 - f4);
        boolean z = false;
        if (fCeil3 == 0.0f && fE + fE > Size.m8048getMinDimensionimpl(drawScope.mo8751getSizeNHjbRc())) {
            z = true;
        }
        boolean z2 = z;
        long jM6393shrinkKibmq7A = BorderKt.m6393shrinkKibmq7A(rounded.getRoundRect().m8030getTopLeftCornerRadiuskKHJgLs(), fCeil3);
        Stroke stroke = new Stroke(fE, 0.0f, 0, 0, null, 30, null);
        if (z2) {
            DrawScope.CC.m8837drawRoundRectZuiqVtQ$default(drawScope, brush, 0L, 0L, jM6393shrinkKibmq7A, 0.0f, null, null, 0, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_DEFAULT_3, null);
        } else if (Float.intBitsToFloat((int) (jM6393shrinkKibmq7A >> 32)) < f2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32)) - fE;
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - fE;
            int iM8216getDifferencertfAjoo = ClipOp.Companion.m8216getDifferencertfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo8761clipRectN_I0leg(fE, fE, fIntBitsToFloat3, fIntBitsToFloat4, iM8216getDifferencertfAjoo);
                try {
                    DrawScope.CC.m8837drawRoundRectZuiqVtQ$default(drawScope, brush, 0L, 0L, jM6393shrinkKibmq7A, 0.0f, null, null, 0, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_DEFAULT_3, null);
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
            DrawScope.CC.m8837drawRoundRectZuiqVtQ$default(drawScope, brush, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (jFloatToRawIntBits4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits3 << 32), BorderKt.m6393shrinkKibmq7A(jM6393shrinkKibmq7A, f2), 0.0f, stroke, null, 0, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_7, null);
        }
        return ab.f48028a;
    }

    static final ab createDrawRoundRectBorder$lambda$1(BorderLogic borderLogic, an anVar, aq aqVar, Path path, Outline.Rounded rounded, Brush brush, DrawScope drawScope) {
        a<Dp> aVar = borderLogic.borderWidth;
        x.c(aVar);
        float fCeil = Dp.m11169equalsimpl0(aVar.invoke().m11178unboximpl(), Dp.Companion.m11182getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(drawScope.mo2127toPx0680j_4(r0));
        float fM8048getMinDimensionimpl = Size.m8048getMinDimensionimpl(drawScope.mo8751getSizeNHjbRc());
        x.c(borderLogic.borderInset);
        float fCeil2 = (float) Math.ceil(drawScope.mo2127toPx0680j_4(r2.invoke().m11178unboximpl()));
        float fE = n.e(Math.min(fCeil, (float) Math.ceil((fM8048getMinDimensionimpl - (fCeil2 + fCeil2)) / 2.0f)), 0.0f);
        x.c(borderLogic.borderInset);
        float fCeil3 = (float) Math.ceil(drawScope.mo2127toPx0680j_4(r9.invoke().m11178unboximpl()));
        boolean z = false;
        if (fCeil3 == 0.0f && fE + fE > Size.m8048getMinDimensionimpl(drawScope.mo8751getSizeNHjbRc())) {
            z = true;
        }
        if (anVar.f48102a != fE) {
            BorderKt.access$createRoundRectPath(path, rounded.getRoundRect(), fE, fCeil3, z);
            aqVar.f48105a = path;
            anVar.f48102a = fE;
        }
        Object obj = aqVar.f48105a;
        x.c(obj);
        DrawScope.CC.m8831drawPathGBMwjPU$default(drawScope, (Path) obj, brush, 0.0f, null, null, 0, 60, null);
        return ab.f48028a;
    }

    private final boolean fillArea(DrawScope drawScope, float f2, float f3) {
        return f3 == 0.0f && f2 + f2 > Size.m8048getMinDimensionimpl(drawScope.mo8751getSizeNHjbRc());
    }

    private final float strokeInsetPx(DrawScope drawScope) {
        x.c(this.borderInset);
        return (float) Math.ceil(drawScope.mo2127toPx0680j_4(r0.invoke().m11178unboximpl()));
    }

    private final float strokeWidthPx(DrawScope drawScope) {
        a<Dp> aVar = this.borderWidth;
        x.c(aVar);
        float fCeil = Dp.m11169equalsimpl0(aVar.invoke().m11178unboximpl(), Dp.Companion.m11182getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(drawScope.mo2127toPx0680j_4(r0));
        float fM8048getMinDimensionimpl = Size.m8048getMinDimensionimpl(drawScope.mo8751getSizeNHjbRc());
        x.c(this.borderInset);
        float fCeil2 = (float) Math.ceil(drawScope.mo2127toPx0680j_4(r3.invoke().m11178unboximpl()));
        return n.e(Math.min(fCeil, (float) Math.ceil((fM8048getMinDimensionimpl - (fCeil2 + fCeil2)) / 2.0f)), 0.0f);
    }

    /* renamed from: topLeft-dBAh8RU, reason: not valid java name */
    private final long m6395topLeftdBAh8RU(float f2, float f3) {
        return (Float.floatToRawIntBits(r5) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits((f2 / 2.0f) + f3) << 32);
    }

    public final void drawBorder$material3(DrawScope drawScope, a<Dp> aVar, a<Dp> aVar2, Brush brush, a<GraphicsLayer> aVar3, Outline outline) {
        l<? super DrawScope, ab> lVarCreateDrawRectBorder;
        this.borderWidth = aVar;
        this.borderInset = aVar2;
        if (!x.n(brush, this.lastBrush) || !x.n(outline, this.lastOutline) || (lVarCreateDrawRectBorder = this.drawBorder) == null) {
            this.lastBrush = brush;
            this.lastOutline = outline;
            if (outline instanceof Outline.Generic) {
                lVarCreateDrawRectBorder = createDrawGenericBorder(brush, aVar3, (Outline.Generic) outline);
            } else if (outline instanceof Outline.Rounded) {
                lVarCreateDrawRectBorder = createDrawRoundRectBorder(brush, (Outline.Rounded) outline);
            } else {
                if (!(outline instanceof Outline.Rectangle)) {
                    throw new i();
                }
                lVarCreateDrawRectBorder = createDrawRectBorder(brush);
            }
            this.drawBorder = lVarCreateDrawRectBorder;
        }
        x.c(lVarCreateDrawRectBorder);
        lVarCreateDrawRectBorder.invoke(drawScope);
    }
}
