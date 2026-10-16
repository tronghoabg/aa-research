package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class rpc extends wlx {
    final /* synthetic */ rpd a;

    public rpc(rpd rpdVar) {
        this.a = rpdVar;
    }

    @Override // defpackage.wlx
    public final void a(View view, int i) {
        if (i == 5) {
            new sss().postDelayed(new rnq(this.a, 6), 40L);
        }
    }

    @Override // defpackage.wlx
    public final void b(View view) {
    }
}
