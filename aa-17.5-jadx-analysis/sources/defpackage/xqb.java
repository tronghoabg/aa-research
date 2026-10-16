package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class xqb {
    private static final Intent f = new Intent();
    public final Handler b;
    public xqh c;
    public final wpq e;
    private final Context g;
    private boolean h;
    private final Handler.Callback j;
    public final Object a = new Object();
    public final xqe d = new xqd(this);
    private final ServiceConnection i = new lbg(this, 3);

    static {
        new Intent();
    }

    public xqb(Context context, Looper looper, wpq wpqVar) {
        gly glyVar = new gly(this, 12);
        this.j = glyVar;
        f.setComponent(new ComponentName(qtr.a(context), "com.google.android.gearhead.demand.DemandClientService"));
        this.g = context;
        this.e = wpqVar;
        this.b = new Handler(looper, glyVar);
    }

    public final void a() {
        if (Log.isLoggable("GH.DemandClient", 3)) {
            Log.d("GH.DemandClient", "disconnect");
        }
        synchronized (this.a) {
            if (this.h) {
                xqh xqhVar = this.c;
                if (xqhVar != null) {
                    try {
                        xqhVar.g(this.d);
                    } catch (RemoteException e) {
                        if (Log.isLoggable("GH.DemandClient", 3)) {
                            Log.d("GH.DemandClient", "unable to unregisterCallbacks", e);
                        }
                    }
                    this.c = null;
                }
                this.h = false;
                if (Log.isLoggable("GH.DemandClient", 3)) {
                    Log.d("GH.DemandClient", "disconnect: unbinding");
                }
                this.g.unbindService(this.i);
            }
        }
    }

    public final void b(Bundle bundle) throws IllegalStateException {
        synchronized (this.a) {
            xqh xqhVar = this.c;
            if (xqhVar == null) {
                throw new IllegalStateException("not connected to demand space service");
            }
            try {
                xqhVar.e(bundle);
            } catch (RemoteException e) {
                if (Log.isLoggable("GH.DemandClient", 3)) {
                    Log.d("GH.DemandClient", "RemoteException from demand space service:".concat(String.valueOf(e.getMessage())));
                }
                throw new IllegalStateException("not connected to demand space service");
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final void c() {
        if (Log.isLoggable("GH.DemandClient", 3)) {
            Log.d("GH.DemandClient", "connect");
        }
        synchronized (this.a) {
            if (this.h) {
                if (Log.isLoggable("GH.DemandClient", 3)) {
                    Log.d("GH.DemandClient", "Connect called when client is already bound to service.");
                }
                return;
            }
            Intent intent = f;
            boolean zBindService = this.g.bindService(intent, this.i, 1);
            if (Log.isLoggable("GH.DemandClient", 3)) {
                if (zBindService) {
                    Log.d("GH.DemandClient", "Bound to Demand Service: ".concat(String.valueOf(String.valueOf(intent.getComponent()))));
                } else {
                    Log.d("GH.DemandClient", "Demand Service not found: ".concat(String.valueOf(String.valueOf(intent.getComponent()))));
                }
            }
            this.h = zBindService;
            if (!zBindService && Log.isLoggable("GH.DemandClient", 3)) {
                Log.d("GH.DemandClient", "connect: binding failed");
            }
        }
    }
}
