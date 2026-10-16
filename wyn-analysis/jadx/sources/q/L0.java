package q;

import ac.C1346a;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class L0 extends F0 implements G0 {

    /* renamed from: E, reason: collision with root package name */
    public static final Method f43670E;

    /* renamed from: D, reason: collision with root package name */
    public C1346a f43671D;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f43670E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // q.G0
    public final void D(p.k kVar, p.m mVar) {
        C1346a c1346a = this.f43671D;
        if (c1346a != null) {
            c1346a.D(kVar, mVar);
        }
    }

    @Override // q.G0
    public final void m(p.k kVar, p.m mVar) {
        C1346a c1346a = this.f43671D;
        if (c1346a != null) {
            c1346a.m(kVar, mVar);
        }
    }

    @Override // q.F0
    public final C3838t0 o(Context context, boolean z2) {
        K0 k02 = new K0(context, z2);
        k02.setHoverListener(this);
        return k02;
    }
}
