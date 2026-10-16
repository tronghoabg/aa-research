package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class inn {
    public final CarRegionId a;
    inz b;
    Intent c;
    int d;
    ing e;
    ComponentName f;
    boolean g;
    Rect i;
    public final inr j;
    public final HandlerThread k;
    final Handler l;
    public ing n;
    public inw o;
    public boolean p;
    final fbe q;
    public final List h = new ArrayList();
    public final Semaphore m = new Semaphore(0);

    public inn(iob iobVar, fbe fbeVar) {
        this.q = fbeVar;
        CarActivityRegionLayoutConfig carActivityRegionLayoutConfig = (CarActivityRegionLayoutConfig) fbeVar.b;
        this.i = carActivityRegionLayoutConfig.d.f;
        CarRegionId carRegionId = carActivityRegionLayoutConfig.c;
        this.a = carRegionId;
        inr inrVar = new inr(iobVar, carRegionId);
        this.j = inrVar;
        HandlerThread handlerThread = new HandlerThread(String.format(Locale.US, "WaitForStopThenStartClient-D:%d-R:%d", Integer.valueOf(carRegionId.h.b), Integer.valueOf(carRegionId.g)), -2);
        this.k = handlerThread;
        inrVar.setName(String.format(Locale.US, "ClientConnectionThread-D:%d-R:%d", Integer.valueOf(carRegionId.h.b), Integer.valueOf(carRegionId.g)));
        inrVar.start();
        handlerThread.start();
        this.l = new rbj(null, handlerThread.getLooper());
    }

    public final synchronized void a() {
        if (this.j.i) {
            this.p = true;
        }
    }

    public final synchronized void b(Runnable runnable) {
        this.l.post(runnable);
    }

    public final synchronized void c() {
        rbr.f(this.m);
    }

    public final synchronized void d(ing ingVar) {
        if (this.m.drainPermits() > 0) {
            ((ype) ((ype) iob.b.h()).ai(627)).y("Drained unexpected stop permit for region: %s", this.a);
        }
        this.n = ingVar;
    }

    public final synchronized void e() {
        ilb.d();
        inr inrVar = this.j;
        inrVar.g = false;
        synchronized (inrVar.f) {
            inrVar.k = null;
        }
        inrVar.interrupt();
        this.k.quit();
    }
}
