package defpackage;

import android.os.Handler;
import com.google.android.apps.auto.components.permission.impl.PermissionPollerImpl;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class mdu {
    public final int a;
    public final mdn b;
    public final mdl c;
    public final Object d;
    public final Runnable e = new lqj(this, 19, null);
    public final Runnable f = new lqj(this, 20, null);
    public final /* synthetic */ PermissionPollerImpl g;

    public mdu(PermissionPollerImpl permissionPollerImpl, mdn mdnVar, mdl mdlVar, Object obj) {
        this.g = permissionPollerImpl;
        this.b = mdnVar;
        mdlVar.getClass();
        this.c = mdlVar;
        this.a = 30000;
        this.d = obj;
    }

    public final void a(yzy yzyVar) {
        ebf.j().F(rrc.h(yxy.FRX, this.b.a(), yzyVar).l());
    }

    public final void b() {
        a(yzy.qi);
        if (acxa.aL()) {
            c();
            this.c.a();
        } else {
            this.c.a();
            c();
        }
    }

    public final void c() {
        PermissionPollerImpl permissionPollerImpl = this.g;
        Handler handler = permissionPollerImpl.d;
        handler.removeCallbacks(this.e);
        handler.removeCallbacks(this.f);
        ArrayList arrayList = permissionPollerImpl.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            permissionPollerImpl.b.stopService(permissionPollerImpl.e);
        }
    }
}
