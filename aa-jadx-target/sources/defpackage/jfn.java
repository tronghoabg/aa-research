package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jfn {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.SYS");
    private static final java.text.SimpleDateFormat i = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS", java.util.Locale.US);
    public final defpackage.yfd b;
    public final java.util.List c;
    public final int d;
    public boolean e;
    public boolean f;
    public final j$.util.concurrent.ConcurrentHashMap g;
    public final defpackage.izq h;
    private final android.content.Context j;
    private defpackage.swi k;
    private final defpackage.ilj l;
    private final defpackage.oiy m;
    private int n;

    public jfn(defpackage.izq izqVar, defpackage.ilj iljVar, android.content.Context context, int i2, defpackage.jfo jfoVar) {
        defpackage.oiy oiyVar = new defpackage.oiy();
        this.b = new defpackage.yfd(100);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.c = arrayList;
        this.g = new j$.util.concurrent.ConcurrentHashMap();
        this.n = 1;
        this.h = izqVar;
        this.l = iljVar;
        this.m = oiyVar;
        this.j = context;
        this.d = i2;
        arrayList.add(new defpackage.ili(null));
        java.lang.String strB = iljVar.b("car_day_night_mode", "car");
        boolean zEquals = "day".equals(strB);
        defpackage.zbd zbdVar = defpackage.zbd.cT;
        if (zEquals) {
            zbdVar = defpackage.zbd.cU;
        } else if ("night".equals(strB)) {
            zbdVar = defpackage.zbd.cV;
        } else if ("auto".equals(strB)) {
            zbdVar = defpackage.zbd.cS;
        }
        jfoVar.b(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.NIGHT_MODE_MODE, zbdVar).l());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    public final android.content.res.Configuration a(com.google.android.gms.car.display.CarDisplayId carDisplayId, android.content.res.Configuration configuration) {
        android.content.res.Configuration configuration2 = new android.content.res.Configuration();
        configuration2.uiMode = configuration.uiMode;
        configuration2.uiMode &= -49;
        int i2 = configuration2.uiMode;
        defpackage.xpw xpwVar = (defpackage.xpw) this.g.get(carDisplayId);
        if (xpwVar == null) {
            throw new java.util.NoSuchElementException("Unknown display " + carDisplayId.b);
        }
        int iOrdinal = xpwVar.ordinal();
        int i3 = 32;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i3 = 16;
            } else if (iOrdinal != 2) {
                throw new java.lang.RuntimeException(null, null);
            }
        } else if (true != this.f) {
            i3 = 16;
        }
        configuration2.uiMode = i2 | i3;
        return this.j.createConfigurationContext(configuration2).getResources().getConfiguration();
    }

    public final void b(java.lang.String str) {
        this.b.add(java.lang.String.format(java.util.Locale.US, "%s %s", i.format(new java.util.Date()), str));
    }

    public final synchronized void c() {
        defpackage.swi swiVar;
        b("end car mode and restore settings");
        if (this.d != 0) {
            int i2 = android.os.Build.VERSION.SDK_INT;
            android.content.Context context = this.j;
            if (i2 < 31) {
                android.app.UiModeManager uiModeManager = (android.app.UiModeManager) context.getApplicationContext().getSystemService("uimode");
                uiModeManager.getClass();
                if (uiModeManager.getCurrentModeType() == 3) {
                    uiModeManager.disableCarMode(0);
                    uiModeManager.disableCarMode(0);
                }
                this.m.a(false);
            } else {
                try {
                    android.app.UiModeManager uiModeManager2 = (android.app.UiModeManager) context.getApplicationContext().getSystemService(android.app.UiModeManager.class);
                    uiModeManager2.getClass();
                    if (uiModeManager2.releaseProjection(1)) {
                        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 1981)).u("Successfully released automotive projection.");
                        this.m.a(false);
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 1980)).u("Failed to release automotive projection.");
                    }
                } catch (java.lang.SecurityException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 1986)).u("Security exception attempting to release projection.");
                }
            }
            if (this.e) {
                for (defpackage.ili iliVar : this.c) {
                    if (iliVar.b != null) {
                        android.content.Context applicationContext = this.j.getApplicationContext();
                        if (android.os.Build.VERSION.SDK_INT < 29) {
                            android.app.UiModeManager uiModeManager3 = (android.app.UiModeManager) applicationContext.getSystemService("uimode");
                            uiModeManager3.getClass();
                            uiModeManager3.setNightMode(java.lang.Integer.parseInt(iliVar.b));
                        }
                    }
                }
                android.content.SharedPreferences.Editor editorEdit = this.l.c.edit();
                editorEdit.putBoolean("car_backup_valid", false);
                editorEdit.apply();
                ((defpackage.yqj) a.l().ai((char) 1987)).u("Restored settings.");
                this.e = false;
            }
            swiVar = this.k;
            if (swiVar != null && swiVar.b()) {
                this.k.e();
            }
            this.n = 1;
        } else {
            swiVar = this.k;
            if (swiVar != null) {
                this.k.e();
            }
            this.n = 1;
        }
        throw th;
    }

    public final synchronized void d() {
        defpackage.ysr.bj(this.n == 2);
        int i2 = this.d;
        b(java.lang.String.format(java.util.Locale.US, "starting car mode settings connType=%d", java.lang.Integer.valueOf(i2)));
        if (i2 != 0) {
            if (!this.e) {
                this.e = true;
                defpackage.ilj iljVar = this.l;
                java.util.List<defpackage.ili> list = this.c;
                android.content.SharedPreferences sharedPreferences = iljVar.c;
                if (sharedPreferences.getBoolean("car_backup_valid", false)) {
                    for (defpackage.ili iliVar : list) {
                        iliVar.b = sharedPreferences.getString("car_saved_setting_".concat(iliVar.a), null);
                    }
                } else {
                    android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    for (defpackage.ili iliVar2 : list) {
                        android.app.UiModeManager uiModeManager = (android.app.UiModeManager) iljVar.b.getSystemService("uimode");
                        uiModeManager.getClass();
                        iliVar2.b = java.lang.Integer.toString(uiModeManager.getNightMode());
                        java.lang.String str = iliVar2.b;
                        if (str != null) {
                            editorEdit.putString("car_saved_setting_".concat(iliVar2.a), str);
                        }
                    }
                    editorEdit.putBoolean("car_backup_valid", true);
                    editorEdit.apply();
                }
                for (defpackage.ili iliVar3 : list) {
                    this.j.getApplicationContext();
                }
                ((defpackage.yqj) a.l().ai((char) 1988)).y("Saved settings: %s", list);
            }
            if (android.os.Build.VERSION.SDK_INT < 31) {
                android.app.UiModeManager uiModeManager2 = (android.app.UiModeManager) this.j.getApplicationContext().getSystemService("uimode");
                uiModeManager2.getClass();
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    uiModeManager2.enableCarMode(100, 2);
                } else {
                    uiModeManager2.enableCarMode(2);
                }
                this.m.a(true);
            }
        }
        this.n = 3;
    }

    public final synchronized void e() {
        if (this.n != 1) {
            throw new java.lang.IllegalStateException();
        }
        if (this.k == null) {
            defpackage.swi swiVar = new defpackage.swi(this.j.getApplicationContext(), 1, "CarService");
            swiVar.g();
            this.k = swiVar;
        }
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 1991)).u("Acquiring wakelock");
        b("Acquiring wakelock");
        defpackage.swi swiVar2 = this.k;
        swiVar2.e.incrementAndGet();
        swiVar2.d(0L);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            try {
                android.app.UiModeManager uiModeManager = (android.app.UiModeManager) this.j.getApplicationContext().getSystemService(android.app.UiModeManager.class);
                uiModeManager.getClass();
                if (uiModeManager.requestProjection(1)) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1984)).u("Successfully set automotive projection.");
                    this.m.a(true);
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1983)).u("Failed to set automotive projection.");
                    defpackage.rox.o("CAR.SYS", "Failed to set automotive projection.", new java.lang.Object[0]);
                }
            } catch (java.lang.SecurityException e) {
                defpackage.rox.p("CAR.SYS", e, "Security exception requesting automotive projection.", new java.lang.Object[0]);
            }
        }
        this.n = 2;
    }
}
