package com.waze.sharedrive.g;

import androidx.compose.runtime.State;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ab implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f38605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f38606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38607c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38608d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f38609e;

    public /* synthetic */ ab(float f2, long j2, h.g.a.a aVar, h.g.a.a aVar2, int i2) {
        this.f38609e = i2;
        this.f38605a = f2;
        this.f38606b = j2;
        this.f38607c = aVar;
        this.f38608d = aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.ui.graphics.Shape, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f38609e == 0) {
            CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
            long j2 = this.f38606b;
            int i2 = ag.f38615a;
            h.g.b.x.f(cacheDrawScope, "$this$drawWithCache");
            float fMo2127toPx0680j_4 = cacheDrawScope.mo2127toPx0680j_4(this.f38605a);
            return cacheDrawScope.onDrawWithContent(new com.waze.ui.e.f((h.g.a.a) this.f38607c, Brush.Companion.m8175horizontalGradient8A3gB4$default(Brush.Companion, h.a.i.i(Color.m8218boximpl(j2), Color.m8218boximpl(Color.Companion.m8263getTransparent0d7_KjU())), 0.0f, fMo2127toPx0680j_4, 0, 8, (Object) null), fMo2127toPx0680j_4, (h.g.a.a) this.f38608d, Brush.Companion.m8175horizontalGradient8A3gB4$default(Brush.Companion, h.a.i.i(Color.m8218boximpl(Color.Companion.m8263getTransparent0d7_KjU()), Color.m8218boximpl(j2)), Float.intBitsToFloat((int) (cacheDrawScope.m7760getSizeNHjbRc() >> 32)) - fMo2127toPx0680j_4, Float.intBitsToFloat((int) (cacheDrawScope.m7760getSizeNHjbRc() >> 32)), 0, 8, (Object) null), 1));
        }
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        h.g.b.x.f(contentDrawScope, "$this$drawWithContent");
        contentDrawScope.drawContent();
        float f2 = contentDrawScope.mo2127toPx0680j_4(this.f38605a);
        float f3 = f2 / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo8751getSizeNHjbRc() >> 32)) - f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - f2;
        Outline outlineMo2037createOutlinePq9zytI = this.f38608d.mo2037createOutlinePq9zytI((Float.floatToRawIntBits(h.k.n.e(fIntBitsToFloat2, 0.0f)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(h.k.n.e(fIntBitsToFloat, 0.0f)) << 32), contentDrawScope.getLayoutDirection(), contentDrawScope);
        boolean z = outlineMo2037createOutlinePq9zytI instanceof Outline.Rectangle;
        long j3 = this.f38606b;
        Path Path = AndroidPath_androidKt.Path();
        if (z) {
            Path.CC.addRect$default(Path, ((Outline.Rectangle) outlineMo2037createOutlinePq9zytI).getRect(), null, 2, null);
        } else if (outlineMo2037createOutlinePq9zytI instanceof Outline.Rounded) {
            Path.CC.addRoundRect$default(Path, ((Outline.Rounded) outlineMo2037createOutlinePq9zytI).getRoundRect(), null, 2, null);
        } else {
            if (!(outlineMo2037createOutlinePq9zytI instanceof Outline.Generic)) {
                throw new h.i();
            }
            Path.CC.m8542addPathUv8p0NA$default(Path, ((Outline.Generic) outlineMo2037createOutlinePq9zytI).getPath(), 0L, 2, null);
        }
        ?? r0 = this.f38607c;
        PathMeasure PathMeasure = AndroidPathMeasure_androidKt.PathMeasure();
        PathMeasure.setPath(Path, false);
        float length = PathMeasure.getLength();
        Path Path2 = AndroidPath_androidKt.Path();
        PathMeasure.getSegment(0.0f, length * ((Number) r0.getValue()).floatValue(), Path2, true);
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        DrawContext drawContext = contentDrawScope2.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().translate(f3, f3);
            DrawScope.CC.m8832drawPathLG529CI$default(contentDrawScope2, Path2, j3, 0.0f, new Stroke(f2, 0.0f, StrokeCap.Companion.m8633getRoundKaPHkGw(), 0, null, 26, null), null, 0, 52, null);
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            return h.ab.f48028a;
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            throw th;
        }
    }

    public /* synthetic */ ab(float f2, Shape shape, State state, long j2, int i2) {
        this.f38609e = i2;
        this.f38605a = f2;
        this.f38608d = shape;
        this.f38607c = state;
        this.f38606b = j2;
    }
}
