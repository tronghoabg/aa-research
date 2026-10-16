package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class knv implements knw {
    public static final yph a = yph.c("CAR.USBMON.EVENTTIMEOUT");
    static final Duration b = Duration.ofSeconds(5);
    public final Handler c;
    public boolean d = false;
    final xya e = new xya(xvx.a);
    private final List f;
    private final rrj g;
    private final Runnable h;
    private final knu i;
    private final Context j;
    private final htm k;

    public knv(Context context, knu knuVar, rrj rrjVar, ScheduledExecutorService scheduledExecutorService) {
        ((ype) a.l().ai((char) 3257)).u("Constructing EventTimeoutRuleEngine");
        this.h = new etr(this, context, rrjVar, scheduledExecutorService, knuVar, 3);
        this.g = rrjVar;
        this.i = knuVar;
        this.j = context;
        this.c = new Handler(Looper.getMainLooper());
        rrk rrkVar = rrjVar.d;
        this.k = new htm(rrkVar == null ? rrk.a : rrkVar, (byte[]) null);
        this.f = yrm.V(rrjVar.e, new ikj(4));
    }

    public static final xxh d(Context context, xxh xxhVar) {
        return !xxhVar.f() ? xvy.a : new jlo(context).c(((BluetoothDevice) xxhVar.b()).getAddress(), false);
    }

    @Override // defpackage.knw
    public final Iterable a() {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        yflVar.i(this.k);
        yflVar.k(this.f);
        return yflVar.g();
    }

    @Override // defpackage.knw
    public final void b() {
        this.c.removeCallbacks(this.h);
    }

    @Override // defpackage.knw
    public final void c(Intent intent) {
        if (this.k.s(intent)) {
            xya xyaVar = this.e;
            if (xyaVar.a && xyaVar.c().compareTo(b) < 0) {
                ((ype) ((ype) a.f()).ai(3260)).y("Got entry intent after exit intent; ignoring it for rule %s", this.g.c);
                return;
            }
            ype ypeVar = (ype) a.l().ai(3259);
            rrj rrjVar = this.g;
            ypeVar.K("Entry intent matched for %s, posting timeout for %d ms", rrjVar.c, rrjVar.f);
            Handler handler = this.c;
            Runnable runnable = this.h;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, rrjVar.f);
            return;
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            if (((htm) it.next()).s(intent)) {
                ype ypeVar2 = (ype) a.l().ai(3258);
                rrj rrjVar2 = this.g;
                ypeVar2.y("Exit intent matched for %s", rrjVar2.c);
                xya xyaVar2 = this.e;
                xyaVar2.d();
                xyaVar2.e();
                b();
                if (this.d) {
                    if ((rrjVar2.b & 32) != 0) {
                        Context context = this.j;
                        yxi yxiVarB = yxi.b(rrjVar2.i);
                        if (yxiVarB == null) {
                            yxiVarB = yxi.UNKNOWN;
                        }
                        ols.M(context, yxiVarB);
                    }
                    knu knuVar = this.i;
                    int iAp = a.ap(rrjVar2.g);
                    if (iAp == 0) {
                        iAp = 1;
                    }
                    knt kntVar = (knt) knuVar;
                    Context context2 = kntVar.b;
                    if (context2 != null && kntVar.e != null) {
                        int i = iAp - 1;
                        if (i == 0 || i == 1) {
                            kntVar.d.c(context2, Instant.now().toEpochMilli());
                        } else {
                            rxf.h(context2, kntVar.c, yxo.STARTUP_DIAGNOSTIC);
                        }
                    }
                    this.d = false;
                    return;
                }
                return;
            }
        }
    }
}
