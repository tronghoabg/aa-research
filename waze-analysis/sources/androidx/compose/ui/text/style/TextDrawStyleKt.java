package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.util.MathHelpersKt;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextDrawStyleKt {
    public static final TextForegroundStyle lerp(TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2, float f2) {
        if (textForegroundStyle instanceof BrushStyle) {
            if (textForegroundStyle2 instanceof BrushStyle) {
                BrushStyle brushStyle = (BrushStyle) textForegroundStyle;
                BrushStyle brushStyle2 = (BrushStyle) textForegroundStyle2;
                return TextForegroundStyle.Companion.from((Brush) SpanStyleKt.lerpDiscrete(brushStyle.getBrush(), brushStyle2.getBrush(), f2), MathHelpersKt.lerp(brushStyle.getAlpha(), brushStyle2.getAlpha(), f2));
            }
        } else if (!(textForegroundStyle2 instanceof BrushStyle)) {
            return TextForegroundStyle.Companion.m11038from8_81llA(ColorKt.m8279lerpjxsXWHM(textForegroundStyle.mo10891getColor0d7_KjU(), textForegroundStyle2.mo10891getColor0d7_KjU(), f2));
        }
        return (TextForegroundStyle) SpanStyleKt.lerpDiscrete(textForegroundStyle, textForegroundStyle2, f2);
    }

    /* renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m11037modulateDxMtmZc(long j2, float f2) {
        return (Float.isNaN(f2) || f2 >= 1.0f) ? j2 : Color.m8227copywmQWz5c$default(j2, Color.m8230getAlphaimpl(j2) * f2, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float takeOrElse(float f2, a<Float> aVar) {
        return Float.isNaN(f2) ? aVar.invoke().floatValue() : f2;
    }
}
