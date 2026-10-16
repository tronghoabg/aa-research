package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qrx {
    public final android.media.MediaRouter a;
    public defpackage.rhc b;
    public defpackage.rhe c;
    public android.media.MediaRouter.RouteInfo d;
    final /* synthetic */ defpackage.qsa e;

    public qrx(defpackage.qsa qsaVar, android.content.Context context) {
        this.e = qsaVar;
        this.a = (android.media.MediaRouter) context.getSystemService("media_router");
        this.b = defpackage.acoo.a.fF().d() ? new defpackage.rhc(context, new mam(5)) : null;
    }

    public final void a() {
        defpackage.rhe rheVar = this.c;
        if (rheVar != null) {
            rheVar.a();
        }
    }

    public final void b() {
        a();
        if (this.b != null) {
            java.lang.String strG = this.e.g();
            if (strG != null) {
                defpackage.rhc rhcVar = this.b;
                if (rhcVar.c()) {
                    defpackage.whw whwVarD = rhcVar.d();
                    rha rhaVar = new rha(strG, 0);
                    defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
                    defpackage.zhs zhsVarA = whwVarD.a(rhaVar, zgtVar);
                    zhsVarA.c(new defpackage.zhi(zhsVarA, new ozh(rhcVar, strG, 5)), zgtVar);
                } else {
                    defpackage.rhc.a.h().ai(8035).u("Missing permissions for addPolicyAndDisable");
                }
            } else {
                defpackage.qsa.a.h().ai(7707).u("Can't disable A2DP for car; car bluetooth address is null");
            }
        }
        synchronized (this) {
            android.media.MediaRouter mediaRouter = this.a;
            android.media.MediaRouter.RouteInfo defaultRoute = mediaRouter.getDefaultRoute();
            android.media.MediaRouter.RouteInfo selectedRoute = mediaRouter.getSelectedRoute(1);
            if (defaultRoute != selectedRoute) {
                this.d = selectedRoute;
                defpackage.qsa.a.h().ai(7706).u("disabling A2dp route while in projection");
            }
            defpackage.qsa.a.f().ai(7705).w("Routing media audio via device type %d", ll$.ExternalSyntheticApiModelOutline0.m(defaultRoute));
            mediaRouter.selectRoute(1, defaultRoute);
        }
    }
}
