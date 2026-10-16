package com.google.android.gearhead.appdecor;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import defpackage.kfn;
import defpackage.kio;
import defpackage.lbh;
import defpackage.lit;
import defpackage.ljb;
import defpackage.ltu;
import defpackage.nrp;
import defpackage.nsg;
import defpackage.qfc;
import defpackage.qfd;
import defpackage.qhh;
import defpackage.qrz;
import defpackage.qsf;
import defpackage.qtt;
import defpackage.roj;
import defpackage.tse;
import defpackage.urf;
import defpackage.yfy;
import defpackage.ygr;
import defpackage.ylx;
import defpackage.ype;
import defpackage.yph;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class AppDecorService extends Service {
    public static final yph a = yph.c("ADU.AppDecorService");
    public static final ComponentName b = new ComponentName("com.google.android.projection.gearhead", AppDecorService.class.getName());
    public static final ygr c = ygr.t("com.google.android.projection.gearhead", "com.google.android.apps.gmm.dev", "com.google.android.apps.gmm.car", "com.google.android.apps.gmm.fishfood", "com.google.android.apps.gmm", "com.google.android.apps.gmm.qp", "com.google.android.apps.maps", RemoteApiConstants.NOW_PACKAGE);
    qhh f;
    public lit g;
    public roj j;
    qtt k;
    public tse l;
    public urf m;
    private ljb n;
    private kfn o;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final nsg h = new nrp(this, 3);
    public volatile yfy i = ylx.a;

    public final void a(int i, int i2) throws qrz {
        if (!this.j.d(i)) {
            ((ype) a.l().ai((char) 7039)).w("sensor type %d not supported by car", i);
            return;
        }
        this.j.f(this.n, i, i2);
        qsf qsfVarA = this.j.a(i);
        if (qsfVarA != null) {
            this.n.d(qsfVarA.a, qsfVarA.b, qsfVarA.c, qsfVarA.d);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.k = new qtt(this);
        this.f = new qhh(this.k);
        this.o = new qfc(this);
        this.n = new ljb(this, 5, null);
        kio.b().v(this.o);
        lbh.d().gK(this.f);
        lbh.d().getLifecycle().c(new qfd(this));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        roj rojVar = this.j;
        if (rojVar != null) {
            rojVar.b(this.n);
        }
        kio.b().w(this.o);
        lbh.c().p(this.g);
        lbh.d().d(this.f);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onLowMemory() {
        ltu.a().b(new ComponentName("com.google.android.projection.gearhead", getClass().getName()));
        super.onLowMemory();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        ltu.a().c(i, new ComponentName("com.google.android.projection.gearhead", getClass().getName()));
        super.onTrimMemory(i);
    }
}
