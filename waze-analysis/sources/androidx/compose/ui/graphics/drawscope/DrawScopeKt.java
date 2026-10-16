package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.DegreesKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DrawScopeKt {
    /* renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m8878clipPathKD09W0M(DrawScope drawScope, Path path, int i2, l<? super DrawScope, ab> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8760clipPathmtrdDE(path, i2);
            lVar.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    /* renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m8879clipPathKD09W0M$default(DrawScope drawScope, Path path, int i2, l lVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = ClipOp.Companion.m8217getIntersectrtfAjoo();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8760clipPathmtrdDE(path, i2);
            lVar.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    /* renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m8880clipRectrOu3jXo(DrawScope drawScope, float f2, float f3, float f4, float f5, int i2, l<? super DrawScope, ab> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8761clipRectN_I0leg(f2, f3, f4, f5, i2);
            lVar.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    /* renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m8881clipRectrOu3jXo$default(DrawScope drawScope, float f2, float f3, float f4, float f5, int i2, l lVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            f4 = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32));
        }
        float f6 = f4;
        if ((i3 & 8) != 0) {
            f5 = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        }
        float f7 = f5;
        if ((i3 & 16) != 0) {
            i2 = ClipOp.Companion.m8217getIntersectrtfAjoo();
        }
        int i4 = i2;
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            int i5 = i3 & 2;
            int i6 = i3 & 1;
            if (i5 != 0) {
                f3 = 0.0f;
            }
            transform.mo8761clipRectN_I0leg(1 == i6 ? 0.0f : f2, f3, f6, f7, i4);
            lVar.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    /* renamed from: draw-GRGpd60, reason: not valid java name */
    public static final /* synthetic */ void m8882drawGRGpd60(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j2, l<? super DrawScope, ab> lVar) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo8758getSizeNHjbRc = drawScope.getDrawContext().mo8758getSizeNHjbRc();
        GraphicsLayer graphicsLayer = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo8759setSizeuvyYCjk(j2);
        drawContext.setGraphicsLayer(null);
        canvas.save();
        try {
            lVar.invoke(drawScope);
        } finally {
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
        }
    }

    /* renamed from: draw-ymL40Pk, reason: not valid java name */
    public static final void m8883drawymL40Pk(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j2, GraphicsLayer graphicsLayer, l<? super DrawScope, ab> lVar) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo8758getSizeNHjbRc = drawScope.getDrawContext().mo8758getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo8759setSizeuvyYCjk(j2);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            lVar.invoke(drawScope);
        } finally {
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
        }
    }

    /* renamed from: draw-ymL40Pk$default, reason: not valid java name */
    public static /* synthetic */ void m8884drawymL40Pk$default(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j2, GraphicsLayer graphicsLayer, l lVar, int i2, Object obj) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo8758getSizeNHjbRc = drawScope.getDrawContext().mo8758getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo8759setSizeuvyYCjk(j2);
        if ((i2 & 16) != 0) {
            graphicsLayer = null;
        }
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            lVar.invoke(drawScope);
        } finally {
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
        }
    }

    public static final void drawIntoCanvas(DrawScope drawScope, l<? super Canvas, ab> lVar) {
        lVar.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void inset(DrawScope drawScope, float f2, float f3, float f4, float f5, l<? super DrawScope, ab> lVar) {
        drawScope.getDrawContext().getTransform().inset(f2, f3, f4, f5);
        float f6 = -f2;
        float f7 = -f3;
        float f8 = -f4;
        float f9 = -f5;
        try {
            lVar.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().inset(f6, f7, f8, f9);
        }
    }

    public static /* synthetic */ void inset$default(DrawScope drawScope, float f2, float f3, l lVar, int i2, Object obj) {
        DrawTransform transform = drawScope.getDrawContext().getTransform();
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        transform.inset(f2, f3, f2, f3);
        float f4 = -f2;
        float f5 = -f3;
        try {
            lVar.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().inset(f4, f5, f4, f5);
        }
    }

    /* renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m8885rotateRg1IO4c(DrawScope drawScope, float f2, long j2, l<? super DrawScope, ab> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8764rotateUv8p0NA(f2, j2);
            lVar.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    /* renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m8886rotateRg1IO4c$default(DrawScope drawScope, float f2, long j2, l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = drawScope.mo8750getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8764rotateUv8p0NA(f2, j2);
            lVar.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    /* renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m8887rotateRadRg1IO4c(DrawScope drawScope, float f2, long j2, l<? super DrawScope, ab> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8764rotateUv8p0NA(DegreesKt.degrees(f2), j2);
            lVar.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    /* renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m8888rotateRadRg1IO4c$default(DrawScope drawScope, float f2, long j2, l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = drawScope.mo8750getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8764rotateUv8p0NA(DegreesKt.degrees(f2), j2);
            lVar.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    /* renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m8889scaleFgt4K4Q(DrawScope drawScope, float f2, float f3, long j2, l<? super DrawScope, ab> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8765scale0AR0LA0(f2, f3, j2);
            lVar.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    /* renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m8890scaleFgt4K4Q$default(DrawScope drawScope, float f2, float f3, long j2, l lVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = drawScope.mo8750getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8765scale0AR0LA0(f2, f3, j2);
            lVar.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    /* renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m8891scaleRg1IO4c(DrawScope drawScope, float f2, long j2, l<? super DrawScope, ab> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8765scale0AR0LA0(f2, f2, j2);
            lVar.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    /* renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m8892scaleRg1IO4c$default(DrawScope drawScope, float f2, long j2, l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = drawScope.mo8750getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8765scale0AR0LA0(f2, f2, j2);
            lVar.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    public static final void translate(DrawScope drawScope, float f2, float f3, l<? super DrawScope, ab> lVar) {
        drawScope.getDrawContext().getTransform().translate(f2, f3);
        float f4 = -f2;
        float f5 = -f3;
        try {
            lVar.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().translate(f4, f5);
        }
    }

    public static /* synthetic */ void translate$default(DrawScope drawScope, float f2, float f3, l lVar, int i2, Object obj) {
        DrawTransform transform = drawScope.getDrawContext().getTransform();
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        transform.translate(f2, f3);
        float f4 = -f2;
        float f5 = -f3;
        try {
            lVar.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().translate(f4, f5);
        }
    }

    public static final void withTransform(DrawScope drawScope, l<? super DrawTransform, ab> lVar, l<? super DrawScope, ab> lVar2) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            lVar.invoke(drawContext.getTransform());
            lVar2.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    public static final void inset(DrawScope drawScope, float f2, float f3, l<? super DrawScope, ab> lVar) {
        drawScope.getDrawContext().getTransform().inset(f2, f3, f2, f3);
        float f4 = -f2;
        float f5 = -f3;
        try {
            lVar.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().inset(f4, f5, f4, f5);
        }
    }

    public static final void inset(DrawScope drawScope, float f2, l<? super DrawScope, ab> lVar) {
        drawScope.getDrawContext().getTransform().inset(f2, f2, f2, f2);
        float f3 = -f2;
        try {
            lVar.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().inset(f3, f3, f3, f3);
        }
    }
}
