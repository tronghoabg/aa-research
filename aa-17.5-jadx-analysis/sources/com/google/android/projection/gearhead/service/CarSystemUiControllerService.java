package com.google.android.projection.gearhead.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.kfn;
import defpackage.kio;
import defpackage.mpe;
import defpackage.qse;
import defpackage.roc;
import defpackage.roj;
import defpackage.tse;
import defpackage.woy;
import defpackage.xeo;
import defpackage.xeu;
import defpackage.ype;
import defpackage.yph;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class CarSystemUiControllerService extends Service {
    public static final yph a = yph.c("GH.CarSysUiSvc");
    public Intent c;
    public qse d;
    public roj e;
    public tse g;
    public final List b = new CopyOnWriteArrayList();
    final xeo f = new xeo(this);
    private final kfn h = new xeu(this);

    public static final void a(Intent intent) {
        woy.Z(kio.b().q());
        intent.getClass();
        if (!roc.bs(intent)) {
            ((ype) ((ype) a.g()).ai((char) 10182)).y("Unsupported intent: %s", intent);
            return;
        }
        try {
            mpe.a().i(intent);
        } catch (IllegalStateException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 10181)).y("Unable to start activity: %s", intent);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        kio.b().v(this.h);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        qse qseVar;
        super.onDestroy();
        roj rojVar = this.e;
        if (rojVar != null && (qseVar = this.d) != null) {
            rojVar.b(qseVar);
        }
        kio.b().w(this.h);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.g = null;
        this.b.clear();
        return super.onUnbind(intent);
    }
}
