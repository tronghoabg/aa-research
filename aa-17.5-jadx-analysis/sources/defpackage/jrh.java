package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* loaded from: classes2.dex */
public class jrh extends ouv {
    @Override // defpackage.ouv, defpackage.qru, defpackage.qrq, defpackage.qqh
    public void a(Bundle bundle) {
        super.a(bundle);
        ((rnw) this.e).q = 515;
        owk owkVar = ((ouv) this).d.c;
        Log.d("CSL.StatusBarController", "setAppBarInsetBehavior");
        owkVar.b = 2;
        ouu ouuVar = owkVar.c;
        if (ouuVar != null) {
            ViewGroup viewGroup = ouuVar.b.c;
            final int i = ouuVar.a;
            viewGroup.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: out
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
                    int i2 = i;
                    return systemWindowInsetTop >= i2 ? windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop() - i2, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom()) : windowInsets;
                }
            });
        }
        try {
            owkVar.a.m(2);
        } catch (RemoteException e) {
            Log.e("CSL.StatusBarController", "Error setting AppBar inset behavior", e);
        }
        kfl.k(getTheme());
        if (spu.aN(this)) {
            krz krzVarC = ksa.d().c();
            krzVarC.a.d(this);
            ksa.d().e.fE(this, new jue(this, krzVarC, 1, null));
        }
    }
}
