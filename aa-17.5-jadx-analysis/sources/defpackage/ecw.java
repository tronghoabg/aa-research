package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class ecw {
    static int a(int i) {
        int iStatusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                }
                i2 |= iStatusBars;
            }
        }
        return i2;
    }

    public static final void b(boolean z, ebj ebjVar) {
        ebjVar.c(z);
    }

    public static final void c(boolean z, ebj ebjVar) {
        ebjVar.d(z);
    }

    public static final eqa d(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            eqa eqaVar = tag instanceof eqa ? (eqa) tag : null;
            if (eqaVar != null) {
                return eqaVar;
            }
            Object objH = ebe.h(view);
            view = objH instanceof View ? (View) objH : null;
        }
        return null;
    }

    public static final void e(View view, eqa eqaVar) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, eqaVar);
    }

    public static final erq f(eru eruVar) {
        return eruVar instanceof epo ? ((epo) eruVar).getDefaultViewModelProviderFactory() : esj.a;
    }

    public static final esc g(eru eruVar) {
        return eruVar instanceof epo ? ((epo) eruVar).getDefaultViewModelCreationExtras() : esa.a;
    }

    public static final boolean h(CarUiInfo carUiInfo) {
        return Build.VERSION.SDK_INT >= 36 && acwo.c() && carUiInfo != null && carUiInfo.b;
    }

    public static final boolean i() {
        return acpc.a.gu().z() || imd.a.a;
    }
}
