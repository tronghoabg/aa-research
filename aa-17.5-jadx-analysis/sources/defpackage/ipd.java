package defpackage;

import android.app.ActivityOptions;
import android.companion.virtual.VirtualDeviceManager;
import android.content.Context;
import android.content.IntentSender;
import com.google.android.gms.car.BlackHoleParams;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ipd {
    public static final yph a = yph.c("CAR.BH.Activity");
    private final BlackHoleParams b;
    private final Context c;
    private ScheduledExecutorService d;
    private ScheduledFuture e;
    private final usw f;

    public ipd(BlackHoleParams blackHoleParams, Context context, usw uswVar) {
        this.b = blackHoleParams;
        this.c = context;
        this.f = uswVar;
    }

    private final boolean d(IntentSender intentSender) {
        int displayId = this.f.h().c().getDisplayId();
        a.l().D("Starting blackhole on %s for %s", displayId, intentSender);
        try {
            intentSender.sendIntent(this.c, 0, null, null, ActivityOptions.makeBasic().setLaunchDisplayId(displayId).setPendingIntentBackgroundActivityStartMode(3).toBundle(), null, null);
            return true;
        } catch (IntentSender.SendIntentException e) {
            ((ype) ((ype) a.h()).p(e)).u("Unable to launch activity");
            c();
            return false;
        }
    }

    public final synchronized void a(IntentSender intentSender) {
        yph yphVar = a;
        yphVar.l().y("Starting black hole for %s", intentSender);
        if (d(intentSender)) {
            yphVar.l().u("activity started");
            usw uswVar = this.f;
            uswVar.h().j(uswVar.g());
            yphVar.l().u("display started");
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (this.d == null) {
                zgt zgtVarAJ = yrm.aJ(Executors.unconfigurableScheduledExecutorService(new tdy()));
                zgtVarAJ.getClass();
                this.d = zgtVarAJ;
            }
            ScheduledExecutorService scheduledExecutorService = this.d;
            if (scheduledExecutorService == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.e = scheduledExecutorService.schedule(new ilp(this, 10), this.b.b, TimeUnit.MILLISECONDS);
            yphVar.l().u("blackhole started");
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void b() {
        ScheduledExecutorService scheduledExecutorService = this.d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.d = null;
        }
        usw uswVar = this.f;
        ?? r2 = uswVar.b;
        Iterator it = r2.iterator();
        while (it.hasNext()) {
            uswVar.h().k((VirtualDeviceManager.IntentInterceptorCallback) it.next());
        }
        r2.clear();
        uswVar.f().release();
        uswVar.g().release();
        uswVar.h().j(null);
        uswVar.h().g();
    }

    public final synchronized void c() {
        a.l().y("stopBlackHole(%s)", false);
        this.e = null;
        this.f.h().j(null);
    }
}
