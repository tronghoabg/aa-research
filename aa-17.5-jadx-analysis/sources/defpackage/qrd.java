package defpackage;

import android.content.Context;
import android.media.MediaRouter;

/* loaded from: classes.dex */
public final class qrd {
    public final MediaRouter a;
    public rgh b;
    public rgj c;
    public MediaRouter.RouteInfo d;
    final /* synthetic */ qrg e;

    public qrd(qrg qrgVar, Context context) {
        this.e = qrgVar;
        this.a = (MediaRouter) context.getSystemService("media_router");
        this.b = acnm.a.gu().d() ? new rgh(context, new maf(5)) : null;
    }

    public final void a() {
        rgj rgjVar = this.c;
        if (rgjVar != null) {
            rgjVar.a();
        }
    }

    public final void b() {
        a();
        if (this.b != null) {
            String strG = this.e.g();
            if (strG != null) {
                rgh rghVar = this.b;
                if (rghVar.c()) {
                    wgx wgxVarD = rghVar.d();
                    rgf rgfVar = new rgf(strG, 0);
                    zfq zfqVar = zfq.a;
                    zgp zgpVarA = wgxVarD.a(rgfVar, zfqVar);
                    zgpVarA.c(new zgf(zgpVarA, new oyj(rghVar, strG, 5)), zfqVar);
                } else {
                    rgh.a.h().ai(8010).u("Missing permissions for addPolicyAndDisable");
                }
            } else {
                qrg.a.h().ai(7682).u("Can't disable A2DP for car; car bluetooth address is null");
            }
        }
        synchronized (this) {
            MediaRouter mediaRouter = this.a;
            MediaRouter.RouteInfo defaultRoute = mediaRouter.getDefaultRoute();
            MediaRouter.RouteInfo selectedRoute = mediaRouter.getSelectedRoute(1);
            if (defaultRoute != selectedRoute) {
                this.d = selectedRoute;
                qrg.a.h().ai(7681).u("disabling A2dp route while in projection");
            }
            qrg.a.f().ai(7680).w("Routing media audio via device type %d", defaultRoute.getDeviceType());
            mediaRouter.selectRoute(1, defaultRoute);
        }
    }
}
