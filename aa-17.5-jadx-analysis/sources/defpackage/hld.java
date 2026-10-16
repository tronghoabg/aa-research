package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import androidx.car.app.model.TemplateWrapper;

/* loaded from: classes2.dex */
public abstract class hld extends hlf implements hlk {
    private final ViewTreeObserver.OnGlobalLayoutListener a;
    public final hll d;
    public boolean e;
    public final int f;

    public hld(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        super(geuVar, templateWrapper, gzcVar);
        this.a = new hx(this, 4);
        this.d = new hll(geuVar, this, y());
        this.f = geuVar.i().c() >= 8 ? gjk.c.a(geuVar) : 0;
    }

    @Override // defpackage.hlf, defpackage.hlo
    public void A() {
        e().getViewTreeObserver().removeOnGlobalLayoutListener(this.a);
        e().setOnTouchListener(null);
        e().setOnGenericMotionListener(null);
        super.A();
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void B() {
        super.B();
        e().getViewTreeObserver().addOnGlobalLayoutListener(this.a);
        gks.c("CarApp.H.Tem", "Pan and zoom is %s in %s", true != p() ? "DISABLED" : "ENABLED", C());
        if (p()) {
            View viewE = e();
            hll hllVar = this.d;
            viewE.setOnTouchListener(hllVar);
            e().setOnGenericMotionListener(hllVar);
        }
    }

    public abstract void fa(Rect rect, Rect rect2);

    public void fb() {
        hlf hlfVar = this.m;
        if (hlfVar instanceof hld) {
            ((hld) hlfVar).fb();
        } else {
            this.e = true;
            e().requestLayout();
        }
    }

    @Override // defpackage.hlf, defpackage.hlo
    public boolean fc() {
        return true;
    }

    public boolean p() {
        return false;
    }

    public long y() {
        return 30L;
    }

    @Override // defpackage.hlf, defpackage.hlo
    public void z(WindowInsets windowInsets, int i) {
        super.z(windowInsets, i);
        int i2 = Build.VERSION.SDK_INT;
        hll hllVar = this.d;
        if (i2 >= 30) {
            Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.ime());
            hllVar.a = -insets.left;
            hllVar.b = -insets.top;
        } else {
            hllVar.a = -windowInsets.getSystemWindowInsetLeft();
            hllVar.b = -windowInsets.getSystemWindowInsetTop();
        }
        fb();
    }

    public void m(boolean z) {
    }
}
