package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes3.dex */
public final class wku extends dzp {
    final /* synthetic */ AppBarLayout a;
    final /* synthetic */ CoordinatorLayout b;
    final /* synthetic */ AppBarLayout.BaseBehavior c;

    public wku(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
        this.a = appBarLayout;
        this.b = coordinatorLayout;
        this.c = baseBehavior;
    }

    @Override // defpackage.dzp
    public final void c(View view, edg edgVar) {
        super.c(view, edgVar);
        edgVar.r(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.a;
        if (appBarLayout.f() == 0) {
            return;
        }
        AppBarLayout.BaseBehavior baseBehavior = this.c;
        View viewR = AppBarLayout.BaseBehavior.R(this.b);
        if (viewR != null) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((wkv) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                    if (baseBehavior.L() != (-appBarLayout.f())) {
                        edgVar.h(edf.f);
                        edgVar.M(true);
                    }
                    if (baseBehavior.L() != 0) {
                        if (!viewR.canScrollVertically(-1)) {
                            edgVar.h(edf.g);
                            edgVar.M(true);
                            return;
                        } else {
                            if ((-appBarLayout.b()) != 0) {
                                edgVar.h(edf.g);
                                edgVar.M(true);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // defpackage.dzp
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 4096) {
            this.a.i(false);
            return true;
        }
        if (i != 8192) {
            return super.i(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.c;
        if (baseBehavior.L() != 0) {
            CoordinatorLayout coordinatorLayout = this.b;
            View viewR = AppBarLayout.BaseBehavior.R(coordinatorLayout);
            boolean zCanScrollVertically = viewR.canScrollVertically(-1);
            AppBarLayout appBarLayout = this.a;
            if (!zCanScrollVertically) {
                appBarLayout.i(true);
                return true;
            }
            int i2 = -appBarLayout.b();
            if (i2 != 0) {
                baseBehavior.S(coordinatorLayout, appBarLayout, viewR, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
