package defpackage;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
final class wma extends dzp {
    final /* synthetic */ wme a;

    public wma(wme wmeVar) {
        this.a = wmeVar;
    }

    @Override // defpackage.dzp
    public final void c(View view, edg edgVar) {
        super.c(view, edgVar);
        if (!this.a.c) {
            edgVar.w(false);
        } else {
            edgVar.g(1048576);
            edgVar.w(true);
        }
    }

    @Override // defpackage.dzp
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            wme wmeVar = this.a;
            if (wmeVar.c) {
                wmeVar.cancel();
                return true;
            }
            i = 1048576;
        }
        return super.i(view, i, bundle);
    }
}
