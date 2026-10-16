package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ilr extends defpackage.qzf {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.SENSOR");
    public static final defpackage.ygw b = defpackage.ygw.u(11, 9, 2, 7, 6);
    boolean c;
    defpackage.ild d;
    public final defpackage.ilj e;
    public final android.os.Handler f;
    public defpackage.ivi h;
    private final defpackage.jfn i;
    private final android.os.HandlerThread k;
    private boolean j = false;
    private final defpackage.mgr o = new defpackage.mgr(null);
    private final defpackage.mgr n = new defpackage.mgr(null);
    private final defpackage.qsw l = new defpackage.qsw();
    private final defpackage.qsx m = new defpackage.qsx();
    public final android.content.SharedPreferences.OnSharedPreferenceChangeListener g = new defpackage.ilq(this, 0);

    public ilr(defpackage.ilj iljVar, defpackage.jfn jfnVar, android.os.HandlerThread handlerThread) {
        this.c = false;
        this.k = handlerThread;
        this.e = iljVar;
        this.i = jfnVar;
        this.f = new defpackage.stq(handlerThread.getLooper(), (byte[]) null);
        if (defpackage.acqt.a.fF().a()) {
            this.c = true;
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 274)).u("Initializing night mode in ctor");
            d("NIGHT_SOURCE_START_UP");
        }
    }

    private final boolean f() {
        return this.o.a == 1;
    }

    final java.lang.String a() {
        if (defpackage.actb.a.fF().h()) {
            if (this.h != null) {
                defpackage.yqm yqmVar = a;
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 277)).u("getDayNightModeUserSetting DisplaySourceService available");
                int iW = this.h.w();
                int i = iW - 1;
                if (iW == 0) {
                    throw null;
                }
                if (i >= 3) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 278)).u("getDayNightModeUserSetting car theme supported, rely on car sensor for day night mode");
                    return "car";
                }
            } else {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 276)).u("getDayNightModeUserSetting Hero enabled but no DisplaySourceService found");
            }
        }
        java.lang.String strB = this.e.b("car_day_night_mode", "car");
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 275)).y("getDayNightModeUserSetting getting day night mode from CarServiceSettings: %s", strB);
        return strB;
    }

    @Override // defpackage.qzg
    public final void b(com.google.android.gms.car.CarSensorEvent carSensorEvent) {
        int i = carSensorEvent.b;
        if (i == 2) {
            carSensorEvent.e(this.l);
            return;
        }
        if (i == 9) {
            defpackage.mgr mgrVar = this.o;
            carSensorEvent.c(9);
            if (mgrVar == null) {
                mgrVar = new defpackage.mgr(null);
            }
            mgrVar.a = carSensorEvent.e[0];
            d("SENSOR");
            return;
        }
        if (i != 11) {
            if (i == 6) {
                carSensorEvent.f(this.m);
            } else {
                if (i != 7) {
                    throw new java.lang.RuntimeException(defpackage.a.bo(i, "unrequested event "));
                }
                carSensorEvent.h(this.n);
            }
        }
    }

    public final void c(defpackage.ild ildVar) {
        this.d = ildVar;
        this.e.d(this.g);
        android.os.Looper looper = this.k.getLooper();
        new defpackage.stq(looper).post(new defpackage.aq(this, ildVar, 7));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    final void d(java.lang.String str) {
        int i;
        java.lang.String strA = a();
        int iHashCode = strA.hashCode();
        boolean zF = false;
        if (iHashCode != 98260) {
            if (iHashCode != 99228) {
                if (iHashCode == 104817688 && strA.equals("night")) {
                    ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 279)).u("isNightModeEnabled DAY_NIGHT_MODE_VAL_NIGHT returning night=true");
                }
                zF = true;
            } else if (strA.equals("day")) {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 280)).u("isNightModeEnabled DAY_NIGHT_MODE_VAL_DAY returning night=false");
            }
            if (f() || (i = java.util.Calendar.getInstance().get(11)) < 5 || i > 21) {
                zF = true;
            }
        } else if (strA.equals("car")) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 281)).y("isNightModeEnabled DAY_NIGHT_MODE_VAL_CAR returning car day night sensor night=%s", java.lang.Boolean.valueOf(f()));
            zF = f();
        } else if (f()) {
            zF = true;
        } else {
            zF = true;
        }
        if (this.c == zF && this.j) {
            return;
        }
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(285);
        java.lang.String strA2 = a();
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zF);
        yqjVar.R("updateDayNightMode(source=%s): userSetting=%s, isNightMode=%b", str, strA2, boolValueOf);
        this.j = true;
        defpackage.jfn jfnVar = this.i;
        ((defpackage.yqj) ((defpackage.yqj) defpackage.jfn.a.f()).ai((char) 1979)).y("setting night mode %b", boolValueOf);
        jfnVar.b(defpackage.a.bQ(zF, "Night mode changed, isNight="));
        jfnVar.f = zF;
        ((defpackage.imi) jfnVar.h.a).aG();
        this.c = zF;
    }
}
