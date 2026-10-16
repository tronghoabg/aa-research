package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class jff {
    public static final yph a = yph.c("CAR.SYS");
    private static final SimpleDateFormat i = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS", Locale.US);
    public final ydx b;
    public final List c;
    public final int d;
    public boolean e;
    public boolean f;
    public final ConcurrentHashMap g;
    public final izj h;
    private final Context j;
    private svk k;
    private final ikz l;
    private final oie m;
    private int n;

    public jff(izj izjVar, ikz ikzVar, Context context, int i2, jfg jfgVar) {
        oie oieVar = new oie();
        this.b = new ydx(100);
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.g = new ConcurrentHashMap();
        this.n = 1;
        this.h = izjVar;
        this.l = ikzVar;
        this.m = oieVar;
        this.j = context;
        this.d = i2;
        arrayList.add(new iky(null));
        String strB = ikzVar.b("car_day_night_mode", "car");
        boolean zEquals = "day".equals(strB);
        yzy yzyVar = yzy.cT;
        if (zEquals) {
            yzyVar = yzy.cU;
        } else if ("night".equals(strB)) {
            yzyVar = yzy.cV;
        } else if ("auto".equals(strB)) {
            yzyVar = yzy.cS;
        }
        jfgVar.b(rrc.h(yxy.CAR_SERVICE, yzz.NIGHT_MODE_MODE, yzyVar).l());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.res.Configuration a(com.google.android.gms.car.display.CarDisplayId r4, android.content.res.Configuration r5) {
        /*
            r3 = this;
            android.content.res.Configuration r0 = new android.content.res.Configuration
            r0.<init>()
            int r5 = r5.uiMode
            r0.uiMode = r5
            int r5 = r0.uiMode
            r5 = r5 & (-49)
            r0.uiMode = r5
            int r5 = r0.uiMode
            j$.util.concurrent.ConcurrentHashMap r1 = r3.g
            java.lang.Object r1 = r1.get(r4)
            xov r1 = (defpackage.xov) r1
            if (r1 == 0) goto L4a
            int r4 = r1.ordinal()
            r1 = 32
            r2 = 1
            if (r4 == 0) goto L31
            if (r4 == r2) goto L35
            r2 = 2
            if (r4 != r2) goto L2a
            goto L37
        L2a:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r4 = 0
            r3.<init>(r4, r4)
            throw r3
        L31:
            boolean r4 = r3.f
            if (r2 == r4) goto L37
        L35:
            r1 = 16
        L37:
            r4 = r5 | r1
            r0.uiMode = r4
            android.content.Context r3 = r3.j
            android.content.Context r3 = r3.createConfigurationContext(r0)
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            return r3
        L4a:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            int r4 = r4.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown display "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jff.a(com.google.android.gms.car.display.CarDisplayId, android.content.res.Configuration):android.content.res.Configuration");
    }

    public final void b(String str) {
        this.b.add(String.format(Locale.US, "%s %s", i.format(new Date()), str));
    }

    public final synchronized void c() {
        svk svkVar;
        b("end car mode and restore settings");
        if (this.d != 0) {
            int i2 = Build.VERSION.SDK_INT;
            Context context = this.j;
            if (i2 < 31) {
                UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                uiModeManager.getClass();
                if (uiModeManager.getCurrentModeType() == 3) {
                    uiModeManager.disableCarMode(0);
                    uiModeManager.disableCarMode(0);
                }
                this.m.a(false);
            } else {
                try {
                    UiModeManager uiModeManager2 = (UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class);
                    uiModeManager2.getClass();
                    if (uiModeManager2.releaseProjection(1)) {
                        ((ype) ((ype) a.f()).ai((char) 1981)).u("Successfully released automotive projection.");
                        this.m.a(false);
                    } else {
                        ((ype) ((ype) a.f()).ai((char) 1980)).u("Failed to release automotive projection.");
                    }
                } catch (SecurityException e) {
                    ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 1986)).u("Security exception attempting to release projection.");
                }
            }
            if (this.e) {
                for (iky ikyVar : this.c) {
                    if (ikyVar.b != null) {
                        Context applicationContext = this.j.getApplicationContext();
                        if (Build.VERSION.SDK_INT < 29) {
                            UiModeManager uiModeManager3 = (UiModeManager) applicationContext.getSystemService("uimode");
                            uiModeManager3.getClass();
                            uiModeManager3.setNightMode(Integer.parseInt(ikyVar.b));
                        }
                    }
                }
                SharedPreferences.Editor editorEdit = this.l.c.edit();
                editorEdit.putBoolean("car_backup_valid", false);
                editorEdit.apply();
                ((ype) a.l().ai((char) 1987)).u("Restored settings.");
                this.e = false;
            }
            svkVar = this.k;
            if (svkVar != null && svkVar.b()) {
                this.k.e();
            }
            this.n = 1;
        } else {
            svkVar = this.k;
            if (svkVar != null) {
                this.k.e();
            }
            this.n = 1;
        }
    }

    public final synchronized void d() {
        if (this.n != 2) {
            throw new IllegalStateException();
        }
        int i2 = this.d;
        b(String.format(Locale.US, "starting car mode settings connType=%d", Integer.valueOf(i2)));
        if (i2 != 0) {
            if (!this.e) {
                this.e = true;
                ikz ikzVar = this.l;
                List<iky> list = this.c;
                SharedPreferences sharedPreferences = ikzVar.c;
                if (sharedPreferences.getBoolean("car_backup_valid", false)) {
                    for (iky ikyVar : list) {
                        ikyVar.b = sharedPreferences.getString("car_saved_setting_".concat(ikyVar.a), null);
                    }
                } else {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    for (iky ikyVar2 : list) {
                        UiModeManager uiModeManager = (UiModeManager) ikzVar.b.getSystemService("uimode");
                        uiModeManager.getClass();
                        ikyVar2.b = Integer.toString(uiModeManager.getNightMode());
                        String str = ikyVar2.b;
                        if (str != null) {
                            editorEdit.putString("car_saved_setting_".concat(ikyVar2.a), str);
                        }
                    }
                    editorEdit.putBoolean("car_backup_valid", true);
                    editorEdit.apply();
                }
                for (iky ikyVar3 : list) {
                    this.j.getApplicationContext();
                }
                ((ype) a.l().ai((char) 1988)).y("Saved settings: %s", list);
            }
            if (Build.VERSION.SDK_INT < 31) {
                UiModeManager uiModeManager2 = (UiModeManager) this.j.getApplicationContext().getSystemService("uimode");
                uiModeManager2.getClass();
                if (Build.VERSION.SDK_INT >= 30) {
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
        UiModeManager uiModeManager;
        if (this.n != 1) {
            throw new IllegalStateException();
        }
        if (this.k == null) {
            svk svkVar = new svk(this.j.getApplicationContext(), 1, "CarService");
            svkVar.g();
            this.k = svkVar;
        }
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 1991)).u("Acquiring wakelock");
        b("Acquiring wakelock");
        svk svkVar2 = this.k;
        svkVar2.e.incrementAndGet();
        svkVar2.d(0L);
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                uiModeManager = (UiModeManager) this.j.getApplicationContext().getSystemService(UiModeManager.class);
                uiModeManager.getClass();
            } catch (SecurityException e) {
                tss.r("CAR.SYS", e, "Security exception requesting automotive projection.", new Object[0]);
            }
            if (uiModeManager.requestProjection(1)) {
                ((ype) ((ype) yphVar.f()).ai((char) 1984)).u("Successfully set automotive projection.");
                this.m.a(true);
            } else {
                ((ype) ((ype) yphVar.f()).ai((char) 1983)).u("Failed to set automotive projection.");
                tss.q("CAR.SYS", "Failed to set automotive projection.", new Object[0]);
            }
        }
        this.n = 2;
    }
}
