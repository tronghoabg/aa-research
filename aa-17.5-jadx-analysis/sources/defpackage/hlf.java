package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import androidx.car.app.model.TemplateWrapper;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class hlf implements hlo {
    private int b;
    public final geu i;
    public TemplateWrapper k;
    public View l;
    public hlf m;
    public View n;
    public final gzc o;
    private int ss;
    private Optional c = Optional.empty();
    private Rect d = new Rect();
    private final ViewTreeObserver.OnTouchModeChangeListener e = new rbw(this, 1);
    private final ViewTreeObserver.OnGlobalFocusChangeListener f = new hle(this, 0);
    public final eqc j = new eqc(this, true);

    public hlf(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        this.i = geuVar;
        this.k = TemplateWrapper.copyOf(templateWrapper);
        this.o = gzcVar;
    }

    protected static boolean I(View view, View view2, boolean z) {
        if (view == null || view2 == null) {
            return false;
        }
        return J(yfq.q(view), yfq.q(view2), z);
    }

    public static boolean J(List list, List list2, boolean z) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            if (view != null && view.hasFocus()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    View view2 = (View) it2.next();
                    if (view2 != null) {
                        if (z) {
                            if (view2.isShown() && view2.requestFocus()) {
                                return true;
                            }
                        } else if (view2.getVisibility() == 0 && view2.requestFocus()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.hlo
    public void A() {
        gks.c("CarApp.H.Tem", "Presenter onPause: %s", this);
        this.j.f(eps.d);
        ViewTreeObserver viewTreeObserver = e().getViewTreeObserver();
        viewTreeObserver.removeOnTouchModeChangeListener(this.e);
        viewTreeObserver.removeOnGlobalFocusChangeListener(this.f);
        this.i.A();
    }

    @Override // defpackage.hlo
    public void B() {
        gks.c("CarApp.H.Tem", "Presenter onResume: %s", this);
        this.j.f(eps.e);
        if (this.m == null) {
            ((geq) this.i.l(geq.class)).getClass();
            e();
        }
        ViewTreeObserver viewTreeObserver = e().getViewTreeObserver();
        viewTreeObserver.addOnTouchModeChangeListener(this.e);
        viewTreeObserver.addOnGlobalFocusChangeListener(this.f);
    }

    @Override // defpackage.hlo
    public final wb C() {
        return this.k.getTemplate();
    }

    @Override // defpackage.hlo
    public final gzc D() {
        return this.o;
    }

    protected final void E(View view, Rect rect) {
        geu geuVar = this.i;
        int i = geuVar.getResources().getConfiguration().screenWidthDp;
        int i2 = geuVar.getResources().getConfiguration().screenHeightDp;
        gks.c("CarApp.H.Tem", "App available screen width: %d, App available screen height: %d", Integer.valueOf(i), Integer.valueOf(i2));
        geuVar.i();
        if (fg(i - (((rect.left + rect.right) * 160) / geuVar.getResources().getDisplayMetrics().densityDpi), i2)) {
            rect.left = this.ss;
            rect.right = this.b;
        } else {
            this.ss = rect.left;
            this.b = rect.right;
        }
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // defpackage.hlo
    public void F() {
        gks.c("CarApp.H.Tem", "Presenter onCreate: %s", this);
        this.j.f(eps.c);
    }

    protected final boolean G() {
        return this.c.isPresent();
    }

    public final boolean H() {
        return e().hasWindowFocus();
    }

    @Override // defpackage.hlo
    public final void K() {
        View viewA = a();
        if (viewA != null) {
            viewA.requestFocus();
            this.l = viewA;
        }
    }

    protected View a() {
        return e();
    }

    @Override // defpackage.hlo
    public void b() {
        gks.c("CarApp.H.Tem", "Presenter onDestroy: %s", this);
        this.m = null;
        this.n = null;
        this.j.f(eps.a);
    }

    @Override // defpackage.hlo
    public void c() {
        gks.c("CarApp.H.Tem", "Presenter onStart: %s", this);
        this.j.f(eps.d);
    }

    public abstract void d();

    @Override // defpackage.hlo
    public boolean fc() {
        return false;
    }

    @Override // defpackage.hlo
    public void fd(TemplateWrapper templateWrapper) {
        this.k = TemplateWrapper.copyOf(templateWrapper);
        d();
        if (!templateWrapper.isRefresh()) {
            e().clearFocus();
            K();
            return;
        }
        View viewFindFocus = e().findFocus();
        if (viewFindFocus == null || viewFindFocus.getVisibility() != 0) {
            K();
        } else {
            this.l = viewFindFocus;
        }
    }

    @Override // defpackage.hlo
    public boolean fe() {
        return false;
    }

    @Override // defpackage.hlo
    public boolean ff() {
        return false;
    }

    protected boolean fg(int i, int i2) {
        return grx.c(grx.b(i, i2));
    }

    public void g(hlf hlfVar, View view) {
        this.m = hlfVar;
        this.n = view;
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return this.j;
    }

    @Override // defpackage.hlo
    public boolean i(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.hlo
    public void n() {
        gks.c("CarApp.H.Tem", "Presenter onStop: %s", this);
        this.j.f(eps.c);
    }

    public final String toString() {
        return String.format("[%s: %s (Insets: %s)]", Integer.toHexString(hashCode()), this.k.getTemplate().getClass().getSimpleName(), this.d);
    }

    @Override // defpackage.hlo
    public void z(WindowInsets windowInsets, int i) {
        int systemWindowInsetLeft;
        int iMax;
        int systemWindowInsetRight;
        int systemWindowInsetBottom;
        if (Build.VERSION.SDK_INT >= 30) {
            geu geuVar = this.i;
            if (geuVar.i().c() <= 4) {
            }
            Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.ime());
            systemWindowInsetLeft = insets.left;
            iMax = Math.max(insets.top, i);
            systemWindowInsetRight = insets.right;
            systemWindowInsetBottom = insets.bottom;
        } else {
            systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            iMax = Math.max(windowInsets.getSystemWindowInsetTop(), i);
            systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
            systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        }
        this.d = new Rect(systemWindowInsetLeft, iMax, systemWindowInsetRight, systemWindowInsetBottom);
        ((geq) this.i.l(geq.class)).getClass();
        e();
        if (Build.VERSION.SDK_INT < 29) {
            E(e(), new Rect(systemWindowInsetLeft, iMax, systemWindowInsetRight, systemWindowInsetBottom));
            return;
        }
        boolean zG = G();
        Optional optionalOfNullable = Optional.ofNullable(windowInsets.getDisplayCutout());
        this.c = optionalOfNullable;
        if (true == optionalOfNullable.isPresent()) {
            DisplayCutout displayCutoutM310m = hg$$ExternalSyntheticApiModelOutline0.m310m(optionalOfNullable.get());
            optionalOfNullable = Optional.ofNullable(Insets.of(displayCutoutM310m.getSafeInsetLeft(), displayCutoutM310m.getSafeInsetTop(), displayCutoutM310m.getSafeInsetRight(), displayCutoutM310m.getSafeInsetBottom()));
        }
        Insets insetsM = ep$$ExternalSyntheticApiModelOutline0.m(optionalOfNullable.orElse(Insets.NONE));
        Insets insetsOf = Insets.of(Math.max(systemWindowInsetLeft, insetsM.left), Math.max(iMax, insetsM.top), Math.max(systemWindowInsetRight, insetsM.right), Math.max(systemWindowInsetBottom, insetsM.bottom));
        if (G() ^ zG) {
            int unused = insetsOf.left;
            int unused2 = insetsOf.top;
            int unused3 = insetsOf.right;
            int unused4 = insetsOf.bottom;
        }
        E(e(), new Rect(insetsOf.left, insetsOf.top, insetsOf.right, insetsOf.bottom));
    }
}
