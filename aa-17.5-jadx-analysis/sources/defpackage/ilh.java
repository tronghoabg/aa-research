package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.car.CarSensorEvent;

/* loaded from: classes.dex */
public final class ilh extends qyj {
    public static final yph a = yph.c("CAR.SENSOR");
    public static final yfq b = yfq.u(11, 9, 2, 7, 6);
    boolean c;
    ikt d;
    public final ikz e;
    public final Handler f;
    public iva h;
    private final jff i;
    private final HandlerThread k;
    private boolean j = false;
    private final mgj o = new mgj(null);
    private final mgj n = new mgj(null);
    private final qsc l = new qsc();
    private final qsd m = new qsd();
    public final SharedPreferences.OnSharedPreferenceChangeListener g = new ilg(this, 0);

    public ilh(ikz ikzVar, jff jffVar, HandlerThread handlerThread) {
        this.c = false;
        this.k = handlerThread;
        this.e = ikzVar;
        this.i = jffVar;
        this.f = new sss(handlerThread.getLooper(), (byte[]) null);
        if (acpr.a.gu().a()) {
            this.c = true;
            ((ype) ((ype) a.f()).ai((char) 274)).u("Initializing night mode in ctor");
            d("NIGHT_SOURCE_START_UP");
        }
    }

    private final boolean f() {
        return this.o.a == 1;
    }

    final String a() {
        if (acrz.a.gu().i()) {
            if (this.h != null) {
                yph yphVar = a;
                ((ype) ((ype) yphVar.f()).ai((char) 277)).u("getDayNightModeUserSetting DisplaySourceService available");
                int iW = this.h.w();
                int i = iW - 1;
                if (iW == 0) {
                    throw null;
                }
                if (i >= 3) {
                    ((ype) ((ype) yphVar.f()).ai((char) 278)).u("getDayNightModeUserSetting car theme supported, rely on car sensor for day night mode");
                    return "car";
                }
            } else {
                ((ype) ((ype) a.f()).ai((char) 276)).u("getDayNightModeUserSetting Hero enabled but no DisplaySourceService found");
            }
        }
        String strB = this.e.b("car_day_night_mode", "car");
        ((ype) ((ype) a.f()).ai((char) 275)).y("getDayNightModeUserSetting getting day night mode from CarServiceSettings: %s", strB);
        return strB;
    }

    @Override // defpackage.qyk
    public final void b(CarSensorEvent carSensorEvent) {
        int i = carSensorEvent.b;
        if (i == 2) {
            carSensorEvent.e(this.l);
            return;
        }
        if (i == 9) {
            mgj mgjVar = this.o;
            carSensorEvent.c(9);
            if (mgjVar == null) {
                mgjVar = new mgj(null);
            }
            mgjVar.a = carSensorEvent.e[0];
            d("SENSOR");
            return;
        }
        if (i != 11) {
            if (i == 6) {
                carSensorEvent.f(this.m);
            } else {
                if (i != 7) {
                    throw new RuntimeException(a.bp(i, "unrequested event "));
                }
                carSensorEvent.h(this.n);
            }
        }
    }

    public final void c(ikt iktVar) {
        this.d = iktVar;
        this.e.d(this.g);
        Looper looper = this.k.getLooper();
        new sss(looper).post(new aq(this, iktVar, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void d(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.a()
            int r1 = r0.hashCode()
            r2 = 98260(0x17fd4, float:1.37692E-40)
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L47
            r2 = 99228(0x1839c, float:1.39048E-40)
            if (r1 == r2) goto L31
            r2 = 104817688(0x63f6418, float:3.5996645E-35)
            if (r1 == r2) goto L1a
            goto L69
        L1a:
            java.lang.String r1 = "night"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L69
            yph r0 = defpackage.ilh.a
            yop r0 = r0.f()
            java.lang.String r1 = "isNightModeEnabled DAY_NIGHT_MODE_VAL_NIGHT returning night=true"
            r2 = 279(0x117, float:3.91E-43)
            defpackage.a.bs(r0, r1, r2)
        L2f:
            r3 = r4
            goto L81
        L31:
            java.lang.String r1 = "day"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L69
            yph r0 = defpackage.ilh.a
            yop r0 = r0.f()
            java.lang.String r1 = "isNightModeEnabled DAY_NIGHT_MODE_VAL_DAY returning night=false"
            r2 = 280(0x118, float:3.92E-43)
            defpackage.a.bs(r0, r1, r2)
            goto L81
        L47:
            java.lang.String r1 = "car"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L69
            yph r0 = defpackage.ilh.a
            yop r0 = r0.f()
            boolean r1 = r6.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "isNightModeEnabled DAY_NIGHT_MODE_VAL_CAR returning car day night sensor night=%s"
            r3 = 281(0x119, float:3.94E-43)
            defpackage.a.bF(r0, r2, r1, r3)
            boolean r3 = r6.f()
            goto L81
        L69:
            boolean r0 = r6.f()
            if (r0 != 0) goto L2f
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 11
            int r0 = r0.get(r1)
            r1 = 5
            if (r0 < r1) goto L2f
            r1 = 21
            if (r0 <= r1) goto L81
            goto L2f
        L81:
            boolean r0 = r6.c
            if (r0 != r3) goto L8b
            boolean r0 = r6.j
            if (r0 != 0) goto L8a
            goto L8b
        L8a:
            return
        L8b:
            yph r0 = defpackage.ilh.a
            yop r0 = r0.f()
            ype r0 = (defpackage.ype) r0
            r1 = 285(0x11d, float:4.0E-43)
            yop r0 = r0.ai(r1)
            ype r0 = (defpackage.ype) r0
            java.lang.String r1 = r6.a()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "updateDayNightMode(source=%s): userSetting=%s, isNightMode=%b"
            r0.R(r5, r7, r1, r2)
            r6.j = r4
            jff r7 = r6.i
            yph r0 = defpackage.jff.a
            yop r0 = r0.f()
            java.lang.String r1 = "setting night mode %b"
            r4 = 1979(0x7bb, float:2.773E-42)
            defpackage.a.bF(r0, r1, r2, r4)
            java.lang.String r0 = "Night mode changed, isNight="
            java.lang.String r0 = defpackage.a.bR(r3, r0)
            r7.b(r0)
            r7.f = r3
            izj r7 = r7.h
            java.lang.Object r7 = r7.a
            ima r7 = (defpackage.ima) r7
            r7.aG()
            r6.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilh.d(java.lang.String):void");
    }
}
