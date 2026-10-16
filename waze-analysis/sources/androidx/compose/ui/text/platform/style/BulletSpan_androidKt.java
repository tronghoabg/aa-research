package androidx.compose.ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import h.ab;
import h.g.a.a;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BulletSpan_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void draw(Outline outline, Canvas canvas, Paint paint, float f2, float f3, int i2) {
        if (outline instanceof Outline.Generic) {
            canvas.save();
            Outline.Generic generic = (Outline.Generic) outline;
            Rect bounds = generic.getBounds();
            canvas.translate(f2, f3 - ((bounds.getBottom() - bounds.getTop()) / 2.0f));
            Path path = generic.getPath();
            if (!(path instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            canvas.drawPath(((AndroidPath) path).getInternalPath(), paint);
            canvas.restore();
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Rectangle)) {
                throw new i();
            }
            Outline.Rectangle rectangle = (Outline.Rectangle) outline;
            Rect rect = rectangle.getRect();
            float bottom = f3 - ((rect.getBottom() - rect.getTop()) / 2.0f);
            Rect rect2 = rectangle.getRect();
            float right = f2 + (i2 * (rect2.getRight() - rect2.getLeft()));
            Rect rect3 = rectangle.getRect();
            canvas.drawRect(f2, bottom, right, f3 + ((rect3.getBottom() - rect3.getTop()) / 2.0f), paint);
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (rounded.getRoundRect().m8030getTopLeftCornerRadiuskKHJgLs() >> 32));
            canvas.drawRoundRect(f2, f3 - (rounded.getRoundRect().getHeight() / 2.0f), (i2 * rounded.getRoundRect().getWidth()) + f2, (rounded.getRoundRect().getHeight() / 2.0f) + f3, fIntBitsToFloat, fIntBitsToFloat, paint);
            return;
        }
        Path Path = AndroidPath_androidKt.Path();
        Path.CC.addRoundRect$default(Path, rounded.getRoundRect(), null, 2, null);
        canvas.save();
        canvas.translate(f2, f3 - (rounded.getRoundRect().getHeight() / 2.0f));
        if (!(Path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) Path).getInternalPath(), paint);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBrushAndDraw-yzxVdVo, reason: not valid java name */
    public static final void m10867setBrushAndDrawyzxVdVo(Paint paint, Brush brush, float f2, long j2, a<ab> aVar) {
        Integer numValueOf = null;
        if (brush == null) {
            if (!Float.isNaN(f2)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                numValueOf.intValue();
                paint.setAlpha((int) Math.rint(f2 * 255.0f));
            }
            aVar.invoke();
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (brush instanceof SolidColor) {
            int color = paint.getColor();
            if (!Float.isNaN(f2)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                numValueOf.intValue();
                paint.setAlpha((int) Math.rint(f2 * 255.0f));
            }
            paint.setColor(ColorKt.m8282toArgb8_81llA(((SolidColor) brush).m8614getValue0d7_KjU()));
            aVar.invoke();
            paint.setColor(color);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (!(brush instanceof ShaderBrush)) {
            throw new i();
        }
        Shader shader = paint.getShader();
        if (!Float.isNaN(f2)) {
            numValueOf = Integer.valueOf(paint.getAlpha());
            numValueOf.intValue();
            paint.setAlpha((int) Math.rint(f2 * 255.0f));
        }
        paint.setShader(((ShaderBrush) brush).mo8197createShaderuvyYCjk(j2));
        aVar.invoke();
        paint.setShader(shader);
        if (numValueOf != null) {
            paint.setAlpha(numValueOf.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDrawStyle(Paint paint, DrawStyle drawStyle) {
        if (x.n(drawStyle, Fill.INSTANCE)) {
            paint.setStyle(Paint.Style.FILL);
            return;
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new i();
        }
        paint.setStyle(Paint.Style.STROKE);
        Stroke stroke = (Stroke) drawStyle;
        paint.setStrokeWidth(stroke.getWidth());
        paint.setStrokeMiter(stroke.getMiter());
        paint.setStrokeCap(DrawStyleSpan_androidKt.m10869toAndroidCapBeK7IIE(stroke.m8908getCapKaPHkGw()));
        paint.setStrokeJoin(DrawStyleSpan_androidKt.m10870toAndroidJoinWw9F2mQ(stroke.m8909getJoinLxFBmk8()));
        PathEffect pathEffect = stroke.getPathEffect();
        paint.setPathEffect(pathEffect != null ? AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect) : null);
    }
}
