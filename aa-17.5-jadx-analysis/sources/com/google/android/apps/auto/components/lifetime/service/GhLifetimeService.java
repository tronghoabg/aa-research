package com.google.android.apps.auto.components.lifetime.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.lbh;
import defpackage.lhl;
import defpackage.lhm;
import defpackage.lih;
import defpackage.lii;
import defpackage.mki;
import defpackage.rpi;
import defpackage.rpm;
import defpackage.ype;
import defpackage.yph;
import defpackage.yrm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class GhLifetimeService extends Service {
    public static final yph a = yph.c("GH.GhLifetimeService");
    public Boolean c;
    public boolean d;
    IBinder e;
    private final lii f = new lii(this);
    public final Map b = new LinkedHashMap();
    private final lhl g = new lih(this);

    public final int a() {
        return this.d ? 2 : 1;
    }

    public final void b(boolean z) {
        ype ypeVar = (ype) a.l().ai(3959);
        Map map = this.b;
        ypeVar.O("notifyProjectionLifetimeStateChanged(started:%b) listener count: %d", z, map.size());
        Iterator it = z ? map.keySet().iterator() : yrm.U(new ArrayList(map.keySet())).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            rpm rpmVar = (rpm) it.next();
            if (z) {
                try {
                    rpmVar.e(a());
                } catch (RemoteException e) {
                    ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 3960)).u("RemoteException calling onProjectionLifetimeStateChanged. Removing callback.");
                    IBinder.DeathRecipient deathRecipient = (IBinder.DeathRecipient) this.b.get(rpmVar);
                    arrayList.add(rpmVar);
                    if (deathRecipient != null) {
                        rpmVar.asBinder().unlinkToDeath(deathRecipient, 0);
                    }
                }
            } else {
                rpmVar.e(0);
            }
        }
        this.b.keySet().removeAll(arrayList);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        rpi rpiVar = new rpi(this.f);
        this.e = rpiVar;
        return rpiVar;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.c = Boolean.valueOf(((lhm) mki.a.i(lhm.class)).gN());
        this.d = ((lhm) mki.a.i(lhm.class)).gM();
        ((lhm) mki.a.i(lhm.class)).gL(this.g, true);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        lbh.d().d(this.g);
        super.onDestroy();
    }
}
