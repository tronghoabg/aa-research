package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.car.CarSensorEvent;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class qtf extends qyj {
    public static final ypf a = ols.R("CAR.SENSOR");
    static final int[] b = {11, 2, 7, 6};
    qsj c;
    boolean d;
    boolean e;
    public Location f;
    public final AtomicBoolean g;
    public long h;
    public final Random i;
    public Location j;
    public final Runnable k;
    public final Runnable l;
    private final HandlerThread m;
    private final Handler n;
    private final qsc o;
    private final qsd p;
    private final str q;
    private final mgj r;

    public qtf(Context context, HandlerThread handlerThread) {
        str strVar = new str(context.getApplicationContext());
        rhx rhxVar = rhx.c;
        this.d = false;
        this.e = false;
        this.f = null;
        this.g = new AtomicBoolean(false);
        this.h = 0L;
        this.i = new Random();
        this.r = new mgj(null);
        this.o = new qsc();
        this.p = new qsd();
        this.j = new Location("Car-GPS");
        this.k = new nwg(this, 9, null);
        this.l = new nwg(this, 10, null);
        this.m = handlerThread;
        this.n = new sss(handlerThread.getLooper());
        this.q = strVar;
    }

    public final void a(Location location) {
        vqk vqkVar = rlc.c;
        rlc.a(vqkVar);
        this.q.c(location);
        rlc.a(vqkVar);
    }

    @Override // defpackage.qyk
    public final void b(CarSensorEvent carSensorEvent) {
        int i = carSensorEvent.b;
        if (i == 2) {
            qsc qscVar = this.o;
            carSensorEvent.e(qscVar);
            AtomicBoolean atomicBoolean = this.g;
            float f = qscVar.a;
            atomicBoolean.set(f < 0.5f && f > -0.5f);
            return;
        }
        if (i == 6) {
            qsd qsdVar = this.p;
            carSensorEvent.f(qsdVar);
            if (qsdVar.a) {
                this.g.set(true);
                return;
            }
            return;
        }
        if (i != 7) {
            if (i == 10) {
                rbe.f(this.m.getLooper(), new qqy(this, carSensorEvent, 4));
                return;
            } else {
                if (i != 11) {
                    throw new RuntimeException(a.bp(i, "unrequested event "));
                }
                return;
            }
        }
        mgj mgjVar = this.r;
        carSensorEvent.h(mgjVar);
        if (mgjVar.a == 101) {
            this.g.set(true);
        }
    }

    public final void c(Runnable runnable, long j) {
        this.n.postDelayed(runnable, j);
    }

    protected final void d() {
        this.n.removeCallbacksAndMessages(null);
    }

    public final void f(qsj qsjVar) {
        this.c = qsjVar;
        rbe.f(this.m.getLooper(), new oyx(6));
    }
}
