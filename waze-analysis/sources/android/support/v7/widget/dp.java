package android.support.v7.widget;

import android.content.Context;
import android.view.MenuItem;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class dp extends dm implements dn {

    /* renamed from: a, reason: collision with root package name */
    private dn f1367a;

    public dp(Context context, int i2) {
        super(context, null, i2, null);
    }

    @Override // android.support.v7.widget.dn
    public final void a(android.support.v7.view.menu.q qVar, MenuItem menuItem) {
        dn dnVar = this.f1367a;
        if (dnVar != null) {
            dnVar.a(qVar, menuItem);
        }
    }

    @Override // android.support.v7.widget.dn
    public final void b(android.support.v7.view.menu.q qVar, MenuItem menuItem) {
        dn dnVar = this.f1367a;
        if (dnVar != null) {
            dnVar.b(qVar, menuItem);
        }
    }

    public final void d(dn dnVar) {
        this.f1367a = dnVar;
    }

    public final void h() {
        this.f1356f.setEnterTransition(null);
    }

    public final void i() {
        this.f1356f.setExitTransition(null);
    }

    public final void l() {
        this.f1356f.setTouchModal(false);
    }

    @Override // android.support.v7.widget.dm
    final cl t(Context context, boolean z) {
        Cdo cdo = new Cdo(context, z);
        cdo.d(this);
        return cdo;
    }
}
