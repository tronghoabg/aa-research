package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.PowerManager$OnThermalHeadroomChangedListener;
import android.os.SystemClock;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class ixs implements ixj {
    public static final yph a = yph.c("CAR.POWER");
    public float A;
    public boolean B;
    public long C;
    public final Object D;
    public boolean E;
    public final Runnable F;
    public boolean G;
    private final Looper H;
    private final Handler I;
    public int b;
    public long c;
    public int d;
    public float e;
    public boolean f;
    public boolean g;
    public final Context h;
    public final jfg i;
    public final ixk j;
    public final CopyOnWriteArrayList k;
    public final ixm l;
    public final Object m;
    public int n;
    public final HandlerThread o;
    public final Handler p;
    public final ixr q;
    public final Object r;
    public boolean s;
    public int t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public ixq x;
    public boolean y;
    public final boolean z;

    public ixs(Context context, jfg jfgVar) {
        Looper mainLooper;
        Runnable iqzVar;
        ixn ixnVar = new ixn(context);
        this.b = -1;
        this.d = -1;
        this.e = BitmapDescriptorFactory.HUE_RED;
        this.f = false;
        this.g = false;
        this.k = new CopyOnWriteArrayList();
        this.m = new Object();
        this.n = 0;
        this.s = false;
        this.t = 0;
        this.y = false;
        this.A = 1.0f;
        this.B = false;
        this.C = 0L;
        this.E = false;
        this.G = false;
        this.h = context;
        this.i = jfgVar;
        this.l = ixnVar;
        acqy acqyVar = acqy.a;
        if (acqyVar.gu().s()) {
            HandlerThread handlerThread = new HandlerThread("ProjectionPowerManagerThread");
            this.o = handlerThread;
            handlerThread.start();
            mainLooper = handlerThread.getLooper();
            this.H = mainLooper;
        } else {
            this.o = null;
            mainLooper = Looper.getMainLooper();
            this.H = mainLooper;
        }
        Handler handler = new Handler(mainLooper);
        this.p = handler;
        this.I = new Handler(Looper.getMainLooper());
        this.q = new ixr(this, mainLooper);
        this.j = new ixk(context, handler);
        int i = 1;
        boolean z = Build.VERSION.SDK_INT >= 36 && acqy.s();
        this.z = z;
        boolean z2 = Build.VERSION.SDK_INT >= 29;
        this.u = z2;
        this.v = acqyVar.gu().r();
        this.w = Build.VERSION.SDK_INT >= 31;
        if (z2) {
            this.r = new obp(this, i);
        } else {
            this.r = null;
        }
        if (z) {
            this.D = new PowerManager$OnThermalHeadroomChangedListener() { // from class: ixo
                public final void onThermalHeadroomChanged(float f, float f2, int i2, Map map) {
                    Float f3 = (Float) map.get(Integer.valueOf((int) acqy.l()));
                    if (f3 != null) {
                        this.a.A = f3.floatValue();
                    }
                }
            };
            iqzVar = new ire(this, 6, null);
        } else {
            this.D = null;
            iqzVar = new iqz(2);
        }
        this.F = iqzVar;
    }

    public final int a() {
        int i;
        synchronized (this.m) {
            i = this.n;
        }
        return i;
    }

    public final void b(final int i, final boolean z) {
        ((ype) a.l().ai(1529)).E("Power state change %d %b", i, z);
        this.I.post(new Runnable() { // from class: ixp
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = this.a.k.iterator();
                while (it.hasNext()) {
                    boolean z2 = z;
                    ((ixl) it.next()).aI(i, z2);
                }
            }
        });
    }

    public final void c(ixl ixlVar) {
        if (ixlVar == null) {
            return;
        }
        this.k.addIfAbsent(ixlVar);
    }

    public final void d() {
        int i;
        boolean z = false;
        if (this.u) {
            boolean z2 = this.f;
            boolean z3 = ((long) this.t) >= acqy.a.gu().k() || this.B;
            this.f = z3;
            if (z2 != z3) {
                ((ype) ((ype) a.f()).ai(1539)).R("thermal throttling %s due to thermal status: %s, forecastTooHot: %s", Boolean.valueOf(this.f), Integer.valueOf(this.t), Boolean.valueOf(this.B));
            }
        } else {
            float f = this.e;
            if (f >= 45.0f) {
                this.f = true;
                ((ype) ((ype) a.f()).ai((char) 1538)).y("battery temp too high, temp:%g", Float.valueOf(this.e));
            } else if (this.f && f < 40.0f) {
                this.f = false;
                ((ype) ((ype) a.f()).ai((char) 1537)).y("battery cooled down, temp:%g", Float.valueOf(this.e));
            }
        }
        if (this.v) {
            this.g = this.y;
            ((ype) ((ype) a.f()).ai(1536)).Q("battery level low is %b, power save mode %b", this.g, this.y);
        } else {
            int i2 = this.d;
            if (i2 != -1 && i2 <= 15) {
                this.g = true;
                ((ype) ((ype) a.f()).ai(1535)).w("battery level too low, level:%d", this.d);
            }
            if (this.g && this.d >= 20) {
                this.g = false;
                ((ype) ((ype) a.f()).ai(1534)).w("battery level above threshold, level:%d", this.d);
            }
        }
        if (this.b == -1) {
            this.b = this.d;
            this.c = SystemClock.elapsedRealtime();
        }
        int i3 = true != this.f ? 0 : 9;
        if (this.g) {
            i3 |= 3;
        }
        synchronized (this.m) {
            int i4 = this.n;
            i = i3 | ((-65536) & i4);
            if (i != i4) {
                this.n = i;
                z = true;
            }
        }
        if (z) {
            b(i, true);
        }
    }

    public final void e(int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i2;
        int i3;
        if (acqy.a.gu().p()) {
            return;
        }
        ixm ixmVar = this.l;
        long jUptimeMillis = SystemClock.uptimeMillis();
        ixn ixnVar = (ixn) ixmVar;
        if (ixnVar.b != null && ixnVar.c == 0) {
            try {
                ((ixn) ixmVar).b.invoke(((ixn) ixmVar).a, Long.valueOf(jUptimeMillis), Integer.valueOf(i), 2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (e.getCause() instanceof SecurityException) {
                    ixnVar.c = -3;
                } else {
                    ixnVar.c = -2;
                }
            }
        }
        synchronized (this.m) {
            i2 = this.n;
            i3 = 65536 | i2;
            this.n = i3;
        }
        if (i2 != i3) {
            b(i3, false);
        }
        this.q.b();
    }
}
