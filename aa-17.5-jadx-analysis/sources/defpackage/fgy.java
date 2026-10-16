package defpackage;

import android.os.Build;
import android.view.View;

/* loaded from: classes2.dex */
class fgy extends fgx {
    private static boolean a = true;

    @Override // defpackage.fgv
    public void e(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.e(view, i);
        } else if (a) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
