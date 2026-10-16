package k1;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import b1.C1494c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class h0 extends l0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f38832e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f38833f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f38834g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f38835h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f38836c;

    /* renamed from: d, reason: collision with root package name */
    public C1494c f38837d;

    public h0() {
        this.f38836c = i();
    }

    private static WindowInsets i() {
        if (!f38833f) {
            try {
                f38832e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f38833f = true;
        }
        Field field = f38832e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
            }
        }
        if (!f38835h) {
            try {
                f38834g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            f38835h = true;
        }
        Constructor constructor = f38834g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
            }
        }
        return null;
    }

    @Override // k1.l0
    public v0 b() {
        a();
        v0 v0VarG = v0.g(null, this.f38836c);
        C1494c[] c1494cArr = this.f38845b;
        s0 s0Var = v0VarG.f38877a;
        s0Var.q(c1494cArr);
        s0Var.s(this.f38837d);
        return v0VarG;
    }

    @Override // k1.l0
    public void e(C1494c c1494c) {
        this.f38837d = c1494c;
    }

    @Override // k1.l0
    public void g(C1494c c1494c) {
        WindowInsets windowInsets = this.f38836c;
        if (windowInsets != null) {
            this.f38836c = windowInsets.replaceSystemWindowInsets(c1494c.f19121a, c1494c.f19122b, c1494c.f19123c, c1494c.f19124d);
        }
    }

    public h0(v0 v0Var) {
        super(v0Var);
        this.f38836c = v0Var.f();
    }
}
