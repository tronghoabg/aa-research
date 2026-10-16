package w;

import android.graphics.drawable.Drawable;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4348c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f47267a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f10, float f11, boolean z2) {
        if (!z2) {
            return f10;
        }
        return (float) (((1.0d - f47267a) * f11) + f10);
    }

    public static float b(float f10, float f11, boolean z2) {
        if (!z2) {
            return f10 * 1.5f;
        }
        return (float) (((1.0d - f47267a) * f11) + (f10 * 1.5f));
    }
}
