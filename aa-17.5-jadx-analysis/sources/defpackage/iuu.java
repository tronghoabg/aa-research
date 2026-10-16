package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.MotionEvent;
import android.view.Surface;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarDisplayUiFeatures;
import j$.time.Duration;
import j$.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class iuu implements iuv, ijy, jkj {
    public static final yph a = yph.c("CAR.DISPLAY");
    public final iut c;
    public final jfg d;
    public final jev e;
    public final jew f;
    public final ilc g;
    public final ixs h;
    public final xyc i;
    public final CarDisplayId j;
    public final xjc k;
    public final xkd l;
    public final iwb m;
    public iur n;
    public iva o;
    public jkk p;
    public ikb q;
    public xop t;
    private final xyc u;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final iuo r = new iuo(this);
    public final ivo s = new ivo(this);

    public iuu(iut iutVar, jfg jfgVar, jev jevVar, jew jewVar, ilc ilcVar, ixs ixsVar, xyc xycVar, CarDisplayId carDisplayId, xjc xjcVar, xkd xkdVar, iwb iwbVar, xyc xycVar2) {
        this.c = iutVar;
        this.d = jfgVar;
        this.e = jevVar;
        this.f = jewVar;
        this.g = ilcVar;
        this.h = ixsVar;
        this.i = xycVar;
        this.j = carDisplayId;
        this.k = xjcVar;
        this.l = xkdVar;
        this.m = iwbVar;
        this.u = xycVar2;
    }

    @Override // defpackage.ijy
    public final void a(xke xkeVar, int i, int i2, Duration duration) {
        this.b.post(new ius(this, xkeVar, i, i2, duration, 0));
    }

    @Override // defpackage.ijy
    public final void b(MotionEvent motionEvent) {
        this.b.post(new ino(this, motionEvent, 9));
    }

    @Override // defpackage.iuv
    public final void c(xop xopVar) {
        Rect rect;
        CarDisplay carDisplay;
        if (this.p == null) {
            this.t = xopVar;
            return;
        }
        CarDisplayUiFeatures carDisplayUiFeatures = null;
        this.t = null;
        iuw iuwVarA = this.o.a();
        iuwVarA.getClass();
        iuo iuoVar = this.r;
        synchronized (iuoVar.c) {
            CarDisplay carDisplay2 = iuoVar.d;
            Point point = carDisplay2 == null ? null : carDisplay2.d;
            Size size = iuwVarA.m;
            Point point2 = new Point(size.getWidth(), size.getHeight());
            boolean z = false;
            if (acrz.g()) {
                aboh abohVar = xopVar.j;
                float f = iuwVarA.l;
                if (!Objects.equals(iuoVar.f, ivk.c(abohVar, f))) {
                    iuoVar.f = ivk.c(xopVar.j, f);
                    z = true;
                }
            }
            rect = iuwVarA.o;
            boolean zEquals = Objects.equals(iuoVar.e, rect);
            iuu iuuVar = iuoVar.b;
            boolean zEquals2 = iuuVar.k.equals(xjc.DISPLAY_TYPE_MAIN);
            if (Objects.equals(point, point2) && Objects.equals(carDisplay2.e, iuwVarA.n) && ((!zEquals2 || zEquals) && !z && (!acrz.g() || Objects.equals(carDisplay2.i, iuwVarA.r)))) {
                carDisplay = null;
            } else {
                iuoVar.d = iuoVar.f(iuwVarA, iuuVar);
                carDisplay = iuoVar.d;
            }
            if (zEquals) {
                rect = null;
            } else {
                iuoVar.e = rect;
            }
            CarDisplayUiFeatures carDisplayUiFeatures2 = iuwVarA.q;
            if (!Objects.equals(iuoVar.g, carDisplayUiFeatures2)) {
                iuoVar.g = carDisplayUiFeatures2;
                carDisplayUiFeatures = carDisplayUiFeatures2;
            }
        }
        if (carDisplay != null) {
            iuoVar.h.e(carDisplay);
        } else if (rect != null) {
            iuoVar.i.e(rect);
        }
        if (carDisplayUiFeatures != null) {
            iuoVar.j.e(carDisplayUiFeatures);
        }
        this.p.J(xopVar, UUID.fromString(this.r.g().g));
    }

    @Override // defpackage.iuv
    public final void d(Surface surface) {
        jkk jkkVar = this.p;
        boolean zE = e();
        Looper looperMyLooper = Looper.myLooper();
        iut iutVar = this.c;
        ima imaVar = (ima) iutVar;
        woy.aa(looperMyLooper == imaVar.o.getLooper(), "onVideoFocusGained should happen in the default handler thread.");
        synchronized (imaVar.q) {
            if (zE) {
                ols.K(((ima) iutVar).k, "com.google.android.gms.car.STARTUP_LATENCY_MEASUREMENT_EVENT", rry.c.ordinal(), null);
                ((ima) iutVar).O.e(yzz.VIDEO_FOCUS, yzy.Co);
                ((ima) iutVar).aP();
            }
            if (((ima) iutVar).s) {
                if (!jkkVar.am(surface)) {
                    imaVar.ax(yze.COMPOSITION, yzf.COMPOSITION_INIT_FAIL, "Starting composition failed");
                    return;
                }
                CarDisplayId carDisplayId = this.j;
                imaVar.E.c(jkkVar);
                iob iobVarN = imaVar.n();
                if (iobVarN != null) {
                    iobVarN.C(carDisplayId);
                }
                if (CarDisplayId.a.equals(carDisplayId)) {
                    imaVar.l.h(true);
                }
            }
        }
    }

    public final boolean e() {
        return CarDisplayId.a.equals(this.j);
    }

    @Override // defpackage.jkj
    public final boolean f() {
        return ((Boolean) this.u.gu()).booleanValue();
    }
}
