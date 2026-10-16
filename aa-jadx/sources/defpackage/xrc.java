package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xrc {
    private static final android.content.Intent f = new android.content.Intent();
    public final android.os.Handler b;
    public defpackage.xri c;
    public final defpackage.wva e;
    private final android.content.Context g;
    private boolean h;
    private final android.os.Handler.Callback j;
    public final java.lang.Object a = new java.lang.Object();
    public final defpackage.xrf d = new defpackage.xre(this);
    private final android.content.ServiceConnection i = new defpackage.lbl(this, 3);

    static {
        new android.content.Intent();
    }

    public xrc(android.content.Context context, android.os.Looper looper, defpackage.wva wvaVar) {
        defpackage.gmf gmfVar = new defpackage.gmf(this, 12);
        this.j = gmfVar;
        f.setComponent(new android.content.ComponentName(defpackage.qun.a(context), "com.google.android.gearhead.demand.DemandClientService"));
        this.g = context;
        this.e = wvaVar;
        this.b = new android.os.Handler(looper, gmfVar);
    }

    public final void a() {
        if (android.util.Log.isLoggable("GH.DemandClient", 3)) {
            android.util.Log.d("GH.DemandClient", "disconnect");
        }
        synchronized (this.a) {
            if (this.h) {
                defpackage.xri xriVar = this.c;
                if (xriVar != null) {
                    try {
                        xriVar.g(this.d);
                    } catch (android.os.RemoteException e) {
                        if (android.util.Log.isLoggable("GH.DemandClient", 3)) {
                            android.util.Log.d("GH.DemandClient", "unable to unregisterCallbacks", e);
                        }
                    }
                    this.c = null;
                }
                this.h = false;
                if (android.util.Log.isLoggable("GH.DemandClient", 3)) {
                    android.util.Log.d("GH.DemandClient", "disconnect: unbinding");
                }
                this.g.unbindService(this.i);
            }
        }
    }

    public final void b(android.os.Bundle bundle) throws java.lang.IllegalStateException {
        synchronized (this.a) {
            defpackage.xri xriVar = this.c;
            if (xriVar == null) {
                throw new java.lang.IllegalStateException("not connected to demand space service");
            }
            try {
                xriVar.e(bundle);
            } catch (android.os.RemoteException e) {
                if (android.util.Log.isLoggable("GH.DemandClient", 3)) {
                    android.util.Log.d("GH.DemandClient", "RemoteException from demand space service:".concat(java.lang.String.valueOf(e.getMessage())));
                }
                throw new java.lang.IllegalStateException("not connected to demand space service");
            }
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void c() {
        if (android.util.Log.isLoggable("GH.DemandClient", 3)) {
            android.util.Log.d("GH.DemandClient", "connect");
        }
        synchronized (this.a) {
            if (this.h) {
                if (android.util.Log.isLoggable("GH.DemandClient", 3)) {
                    android.util.Log.d("GH.DemandClient", "Connect called when client is already bound to service.");
                }
                return;
            }
            android.content.Intent intent = f;
            boolean zBindService = this.g.bindService(intent, this.i, 1);
            if (android.util.Log.isLoggable("GH.DemandClient", 3)) {
                if (zBindService) {
                    android.util.Log.d("GH.DemandClient", "Bound to Demand Service: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(intent.getComponent()))));
                } else {
                    android.util.Log.d("GH.DemandClient", "Demand Service not found: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(intent.getComponent()))));
                }
            }
            this.h = zBindService;
            if (!zBindService && android.util.Log.isLoggable("GH.DemandClient", 3)) {
                android.util.Log.d("GH.DemandClient", "connect: binding failed");
            }
        }
    }
}
