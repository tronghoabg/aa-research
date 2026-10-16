package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public class ouv extends qru {
    private owj a;
    private owl b;
    public ViewGroup c;
    public owg d;

    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.qru, defpackage.qrq, defpackage.qqh
    public void a(Bundle bundle) throws Resources.NotFoundException {
        owg owgVar;
        super.a(bundle);
        this.a = new owj(getBaseContext());
        this.b = new owl();
        Context context = (Context) this.a.b;
        Resources resources = context.getResources();
        erb erbVarC = null;
        try {
            qqi qqiVar = this.e;
            erbVarC = ((rod) (!((rnw) qqiVar).y() ? null : ((rnw) qqiVar).M.g("info"))).c();
        } catch (qrz | qsa e) {
            Log.w("CSL.CarActivity", "Unable to get car info", e);
        }
        erb erbVar = erbVarC;
        if (osq.R(owh.MULTI_REGION_CAR_UI_ENTRY, context, resources)) {
            owgVar = new owg(this.a, O(), this.b, erbVar, y(), z());
            this.d = owgVar;
        } else if (osq.R(owh.MULTI_DISPLAY_CAR_UI_ENTRY, context, resources)) {
            owgVar = new owg(this.a, O(), this.b, erbVar, y());
            this.d = owgVar;
        } else {
            Log.d("CSL.CarActivity", "Creating CarUiController without displayId");
            owgVar = new owg(this.a, O(), this.b, erbVar);
            this.d = owgVar;
        }
        View viewB = owgVar.b();
        R();
        this.h.a(C().getDecorView());
        this.e.b(viewB);
        this.c = (ViewGroup) B(this.d.d);
        String str = owi.DRAWER_HEADER_HEIGHT.d;
        int identifier = resources.getIdentifier(str, "dimen", context.getPackageName());
        if (identifier == 0) {
            throw new Resources.NotFoundException("Can't find resource: @dimen/".concat(String.valueOf(str)));
        }
        final int dimensionPixelOffset = resources.getDimensionPixelOffset(identifier);
        owk owkVar = this.d.c;
        Intent intentQ = q();
        boolean z = false;
        if (intentQ != null && intentQ.getBooleanExtra("assistant_activity", false)) {
            z = true;
        }
        try {
            owkVar.a.o(z);
        } catch (RemoteException unused) {
            Log.e("CSL.StatusBarController", "Error setting demand window status");
        }
        if (!osq.R(owh.SUPPORTS_WINDOW_INSETS, context, resources)) {
            this.c.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ous
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return this.a.d.c.b != 2 ? windowInsets.replaceSystemWindowInsets(0, dimensionPixelOffset, 0, 0) : windowInsets.consumeSystemWindowInsets();
                }
            });
        } else {
            if (this.d.m.a.contains(our.a.name())) {
                return;
            }
            owkVar.c = new ouu(this, dimensionPixelOffset);
        }
    }

    @Override // defpackage.qrq, defpackage.qqh
    public void d(Configuration configuration) {
        super.d(configuration);
        Log.d("CSL.CarActivity", "onConfigurationChanged ".concat(String.valueOf(String.valueOf(configuration))));
        getResources().getConfiguration().updateFrom(configuration);
        owg owgVar = this.d;
        owgVar.a(owgVar.j, getResources().getConfiguration());
    }

    @Override // defpackage.qrq, defpackage.qqh
    public void g(Bundle bundle) {
        super.g(bundle);
        owg owgVar = this.d;
        owgVar.a(owgVar.i, bundle);
    }

    @Override // defpackage.qru, defpackage.qrq, defpackage.qqh
    public void h() {
        super.h();
        owg owgVar = this.d;
        owgVar.a(owgVar.e, new Object[0]);
    }

    @Override // defpackage.qru, defpackage.qrq, defpackage.qqh
    public void j() {
        super.j();
        owg owgVar = this.d;
        owgVar.a(owgVar.f, new Object[0]);
    }

    @Override // defpackage.qru, defpackage.qqh, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        View viewOnCreateView = this.b.onCreateView(str, context, attributeSet);
        return viewOnCreateView != null ? viewOnCreateView : super.onCreateView(str, context, attributeSet);
    }

    @Override // defpackage.qqh
    public final void s(IBinder iBinder) {
        owg owgVar = this.d;
        owgVar.a(owgVar.g, iBinder);
    }

    @Override // defpackage.qqh
    public final void t(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("android:viewHierarchyState");
        if (bundle2 != null) {
            bundle2.setClassLoader(((Context) this.a.b).getClassLoader());
        }
        super.t(bundle);
        owg owgVar = this.d;
        owgVar.a(owgVar.h, bundle);
        oct octVar = owgVar.o;
        Log.d("CSL.MenuController", "onRestoreInstanceState");
        Log.w("CSL.MenuController", "Root MenuAdapter is null after day/night mode Activity recreate.");
    }

    @Override // defpackage.qqh
    public final void u(WindowManager.LayoutParams layoutParams) {
        int i = layoutParams.flags & Integer.MIN_VALUE;
        int i2 = layoutParams.flags & 67108864;
        owk owkVar = this.d.c;
        Log.d("CSL.StatusBarController", "setStatusBarBackgroundVisibility");
        try {
            ovz ovzVar = owkVar.a;
            boolean z = true;
            boolean z2 = i2 == 0;
            if (i != 0) {
                z = false;
            }
            ovzVar.p(z, z2);
        } catch (RemoteException e) {
            Log.e("CSL.StatusBarController", "Error setting status bar background visibility", e);
        }
    }

    @Override // defpackage.qrq, defpackage.qqh
    public final void v(int i) {
        this.c.removeAllViews();
        A().inflate(i, this.c, true);
    }

    @Override // defpackage.qrq
    public final void w(View view) {
        this.c.removeAllViews();
        this.c.addView(view);
    }

    @Override // defpackage.qqh
    public final void x(boolean z) {
        nzj nzjVar = this.d.l;
        if (z && getResources().getConfiguration().navigation == 2 && nzjVar.b()) {
            nzjVar.a();
        }
    }
}
