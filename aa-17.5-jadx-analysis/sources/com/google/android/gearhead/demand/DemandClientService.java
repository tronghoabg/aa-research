package com.google.android.gearhead.demand;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import defpackage.eqn;
import defpackage.kxb;
import defpackage.lau;
import defpackage.ntw;
import defpackage.qhs;
import defpackage.xqe;
import defpackage.xqg;
import defpackage.ype;
import defpackage.yph;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class DemandClientService extends Service {
    public static final yph a = yph.c("GH.DemandClientService");
    public kxb b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Map d = new HashMap();
    private final eqn e = new ntw(this, 18);
    private final xqg f = new xqg(this);

    public static final int b(Bundle bundle) {
        if (bundle != null) {
            return bundle.getInt("open_cause") == 3 ? bundle.getInt("open_cause_key_code") == 84 ? 3 : 2 : bundle.getBoolean("gmm_mic") ? 10 : 1;
        }
        return 1;
    }

    public final /* synthetic */ void a(xqe xqeVar) {
        ((ype) a.l().ai((char) 7268)).u("registerCallbacks");
        if (this.b.m()) {
            Map map = this.d;
            if (map.containsKey(xqeVar.asBinder())) {
                return;
            }
            try {
                map.put(xqeVar.asBinder(), new qhs(this, xqeVar));
                this.b.i();
                xqeVar.e(this.b.i().e() != null ? ((Integer) this.b.i().e()).intValue() : 0);
            } catch (RemoteException | InstantiationException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7269)).u("Failed to register callbacks");
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        ((ype) a.l().ai((char) 7271)).u("onBind");
        return this.f;
    }

    @Override // android.app.Service
    public final void onCreate() {
        ((ype) a.l().ai((char) 7272)).u("onCreate");
        super.onCreate();
        kxb kxbVarC = lau.c();
        this.b = kxbVarC;
        kxbVarC.i().i(this.e);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ((ype) a.l().ai((char) 7273)).u("onDestroy");
        this.b.i().k(this.e);
        this.d.clear();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        ((ype) a.l().ai((char) 7274)).u("onUnbind");
        return false;
    }
}
