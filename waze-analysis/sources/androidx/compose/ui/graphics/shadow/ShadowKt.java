package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Interpolatable;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.util.MathHelpersKt;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ShadowKt {
    public static final Shadow lerp(Shadow shadow, Shadow shadow2, float f2) {
        if (shadow == null && shadow2 == null) {
            return null;
        }
        return shadow == null ? lerpNonNull(shadow2.transparentCopy$ui_graphics(), shadow2, f2) : shadow2 == null ? lerpNonNull(shadow, shadow.transparentCopy$ui_graphics(), f2) : lerpNonNull(shadow, shadow2, f2);
    }

    public static final Shadow lerpNonNull(Shadow shadow, Shadow shadow2, float f2) {
        float fM11207lerpMdfbLM = DpKt.m11207lerpMdfbLM(shadow.m8985getRadiusD9Ej5fM(), shadow2.m8985getRadiusD9Ej5fM(), f2);
        float fM11207lerpMdfbLM2 = DpKt.m11207lerpMdfbLM(shadow.m8986getSpreadD9Ej5fM(), shadow2.m8986getSpreadD9Ej5fM(), f2);
        long jM11208lerpxhh869w = DpKt.m11208lerpxhh869w(shadow.m8984getOffsetRKDOV3M(), shadow2.m8984getOffsetRKDOV3M(), f2);
        long jM8279lerpjxsXWHM = ColorKt.m8279lerpjxsXWHM(shadow.m8983getColor0d7_KjU(), shadow2.m8983getColor0d7_KjU(), f2);
        Object objLerp = Interpolatable.Companion.lerp(shadow.getBrush(), shadow2.getBrush(), f2);
        return new Shadow(fM11207lerpMdfbLM, fM11207lerpMdfbLM2, jM11208lerpxhh869w, jM8279lerpjxsXWHM, objLerp instanceof Brush ? (Brush) objLerp : null, MathHelpersKt.lerp(shadow.getAlpha(), shadow2.getAlpha(), f2), f2 < 0.5f ? shadow.m8982getBlendMode0nO6VwU() : shadow2.m8982getBlendMode0nO6VwU(), (o) null);
    }
}
