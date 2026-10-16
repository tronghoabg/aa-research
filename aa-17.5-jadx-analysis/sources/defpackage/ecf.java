package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class ecf extends ecm {
    private static Field a = null;
    private static boolean e = false;
    private static Constructor f = null;
    private static boolean g = false;
    private WindowInsets h;
    private dve i;

    public ecf() {
        this.h = j();
    }

    private static WindowInsets j() {
        if (!e) {
            try {
                a = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            e = true;
        }
        Field field = a;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!g) {
            try {
                f = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            g = true;
        }
        Constructor constructor = f;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // defpackage.ecm
    public ecy a() {
        i();
        ecy ecyVarQ = ecy.q(this.h, null);
        ecyVarQ.t(this.b);
        ecyVarQ.b.z(this.i);
        ecyVarQ.s(null);
        ecyVarQ.w(this.c);
        ecyVarQ.x(this.d);
        return ecyVarQ;
    }

    @Override // defpackage.ecm
    public void b(dve dveVar) {
        this.i = dveVar;
    }

    @Override // defpackage.ecm
    public void c(dve dveVar) {
        WindowInsets windowInsets = this.h;
        if (windowInsets != null) {
            this.h = windowInsets.replaceSystemWindowInsets(dveVar.b, dveVar.c, dveVar.d, dveVar.e);
        }
    }

    public ecf(ecy ecyVar) {
        super(ecyVar);
        this.h = ecyVar.e();
    }
}
