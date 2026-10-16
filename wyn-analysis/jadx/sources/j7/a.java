package J7;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f5719a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final E1.a f5720b = new E1.a(E1.a.f2812d);

    /* renamed from: c, reason: collision with root package name */
    public static final E1.a f5721c = new E1.a();

    /* renamed from: d, reason: collision with root package name */
    public static final E1.a f5722d = new E1.a(E1.a.f2813e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f10, float f11, float f12) {
        return N0.a.b(f11, f10, f12, f10);
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(float f10, int i5, int i10) {
        return Math.round(f10 * (i10 - i5)) + i5;
    }
}
