package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes3.dex */
public final class wvp extends dzp {
    final /* synthetic */ BaseTransientBottomBar a;

    public wvp(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // defpackage.dzp
    public final void c(View view, edg edgVar) {
        super.c(view, edgVar);
        edgVar.g(1048576);
        edgVar.w(true);
    }

    @Override // defpackage.dzp
    public final boolean i(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.i(view, i, bundle);
        }
        this.a.d(3);
        return true;
    }
}
