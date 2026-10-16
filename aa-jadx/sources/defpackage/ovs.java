package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ovs extends defpackage.qso {
    private defpackage.oxg a;
    private defpackage.oxi b;
    public android.view.ViewGroup c;
    public defpackage.oxd d;

    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.qso, defpackage.qsk, defpackage.qrd
    public void a(android.os.Bundle bundle) {
        defpackage.oxd oxdVar;
        super.a(bundle);
        this.a = new defpackage.oxg(getBaseContext());
        this.b = new defpackage.oxi();
        android.content.Context context = (android.content.Context) this.a.b;
        android.content.res.Resources resources = context.getResources();
        defpackage.erh erhVarF = null;
        try {
            defpackage.qre qreVar = this.e;
            erhVarF = ((defpackage.roy) (!((defpackage.ror) qreVar).y() ? null : ((defpackage.ror) qreVar).L.c("info"))).f();
        } catch (defpackage.qst | defpackage.qsu e) {
            android.util.Log.w("CSL.CarActivity", "Unable to get car info", e);
        }
        defpackage.erh erhVar = erhVarF;
        if (defpackage.otn.L(defpackage.oxe.MULTI_REGION_CAR_UI_ENTRY, context, resources)) {
            oxdVar = new defpackage.oxd(this.a, O(), this.b, erhVar, y(), z());
            this.d = oxdVar;
        } else if (defpackage.otn.L(defpackage.oxe.MULTI_DISPLAY_CAR_UI_ENTRY, context, resources)) {
            oxdVar = new defpackage.oxd(this.a, O(), this.b, erhVar, y());
            this.d = oxdVar;
        } else {
            android.util.Log.d("CSL.CarActivity", "Creating CarUiController without displayId");
            oxdVar = new defpackage.oxd(this.a, O(), this.b, erhVar);
            this.d = oxdVar;
        }
        android.view.View viewB = oxdVar.b();
        R();
        this.h.a(C().getDecorView());
        this.e.b(viewB);
        this.c = (android.view.ViewGroup) B(this.d.d);
        java.lang.String str = defpackage.oxf.DRAWER_HEADER_HEIGHT.d;
        int identifier = resources.getIdentifier(str, "dimen", context.getPackageName());
        if (identifier == 0) {
            throw new android.content.res.Resources.NotFoundException("Can't find resource: @dimen/".concat(java.lang.String.valueOf(str)));
        }
        final int dimensionPixelOffset = resources.getDimensionPixelOffset(identifier);
        defpackage.oxh oxhVar = this.d.c;
        android.content.Intent intentQ = q();
        boolean z = false;
        if (intentQ != null && intentQ.getBooleanExtra("assistant_activity", false)) {
            z = true;
        }
        try {
            oxhVar.a.o(z);
        } catch (android.os.RemoteException unused) {
            android.util.Log.e("CSL.StatusBarController", "Error setting demand window status");
        }
        if (!defpackage.otn.L(defpackage.oxe.SUPPORTS_WINDOW_INSETS, context, resources)) {
            this.c.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: ovp
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
                    return this.a.d.c.b != 2 ? windowInsets.replaceSystemWindowInsets(0, dimensionPixelOffset, 0, 0) : windowInsets.consumeSystemWindowInsets();
                }
            });
        } else {
            if (this.d.p.a.contains(defpackage.ovo.APP_BAR_INSET_BEHAVIOR.name())) {
                return;
            }
            oxhVar.c = new defpackage.ovr(this, dimensionPixelOffset);
        }
    }

    @Override // defpackage.qsk, defpackage.qrd
    public void d(android.content.res.Configuration configuration) {
        super.d(configuration);
        android.util.Log.d("CSL.CarActivity", "onConfigurationChanged ".concat(java.lang.String.valueOf(java.lang.String.valueOf(configuration))));
        getResources().getConfiguration().updateFrom(configuration);
        defpackage.oxd oxdVar = this.d;
        oxdVar.a(oxdVar.j, getResources().getConfiguration());
    }

    @Override // defpackage.qsk, defpackage.qrd
    public void g(android.os.Bundle bundle) {
        super.g(bundle);
        defpackage.oxd oxdVar = this.d;
        oxdVar.a(oxdVar.i, bundle);
    }

    @Override // defpackage.qso, defpackage.qsk, defpackage.qrd
    public void h() {
        super.h();
        defpackage.oxd oxdVar = this.d;
        oxdVar.a(oxdVar.e, new java.lang.Object[0]);
    }

    @Override // defpackage.qso, defpackage.qsk, defpackage.qrd
    public void j() {
        super.j();
        defpackage.oxd oxdVar = this.d;
        oxdVar.a(oxdVar.f, new java.lang.Object[0]);
    }

    @Override // defpackage.qso, defpackage.qrd, android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View viewOnCreateView = this.b.onCreateView(str, context, attributeSet);
        return viewOnCreateView != null ? viewOnCreateView : super.onCreateView(str, context, attributeSet);
    }

    @Override // defpackage.qrd
    public final void s(android.os.IBinder iBinder) {
        defpackage.oxd oxdVar = this.d;
        oxdVar.a(oxdVar.g, iBinder);
    }

    @Override // defpackage.qrd
    public final void t(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle("android:viewHierarchyState");
        if (bundle2 != null) {
            bundle2.setClassLoader(((android.content.Context) this.a.b).getClassLoader());
        }
        super.t(bundle);
        defpackage.oxd oxdVar = this.d;
        oxdVar.a(oxdVar.h, bundle);
        defpackage.odn odnVar = oxdVar.n;
        android.util.Log.d("CSL.MenuController", "onRestoreInstanceState");
        android.util.Log.w("CSL.MenuController", "Root MenuAdapter is null after day/night mode Activity recreate.");
    }

    @Override // defpackage.qrd
    public final void u(android.view.WindowManager.LayoutParams layoutParams) {
        int i = layoutParams.flags & Integer.MIN_VALUE;
        int i2 = layoutParams.flags & 67108864;
        defpackage.oxh oxhVar = this.d.c;
        android.util.Log.d("CSL.StatusBarController", "setStatusBarBackgroundVisibility");
        try {
            defpackage.oww owwVar = oxhVar.a;
            boolean z = true;
            boolean z2 = i2 == 0;
            if (i != 0) {
                z = false;
            }
            owwVar.p(z, z2);
        } catch (android.os.RemoteException e) {
            android.util.Log.e("CSL.StatusBarController", "Error setting status bar background visibility", e);
        }
    }

    @Override // defpackage.qsk, defpackage.qrd
    public final void v(int i) {
        this.c.removeAllViews();
        A().inflate(i, this.c, true);
    }

    @Override // defpackage.qsk
    public final void w(android.view.View view) {
        this.c.removeAllViews();
        this.c.addView(view);
    }

    @Override // defpackage.qrd
    public final void x(boolean z) {
        defpackage.oae oaeVar = this.d.l;
        if (z && getResources().getConfiguration().navigation == 2 && oaeVar.b()) {
            oaeVar.a();
        }
    }
}
