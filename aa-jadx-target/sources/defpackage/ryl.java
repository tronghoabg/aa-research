package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ryl extends defpackage.ryk {
    private static final defpackage.yqk e = defpackage.omv.n("CAR.SERVICEUSBMON.IMPL");
    public final defpackage.rzn b;
    public final java.util.Set c = new java.util.HashSet();
    public boolean d = true;
    private final boolean f = defpackage.adct.a.fF().b();
    private final defpackage.rzw g;
    private final android.content.Context h;
    private final android.content.SharedPreferences i;
    private final defpackage.xyn j;

    public ryl(defpackage.rzw rzwVar, defpackage.rzn rznVar, android.content.Context context, defpackage.xyn xynVar) {
        this.g = rzwVar;
        this.b = rznVar;
        this.h = context;
        this.i = context.getSharedPreferences("reset_prefs", 0);
        this.j = xynVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ryk
    public final synchronized void c(java.io.PrintWriter printWriter) {
        if (this.f) {
            defpackage.rzw rzwVar = this.g;
            if (rzwVar.g()) {
                printWriter.println("\nCarServiceUsbMonitor");
                printWriter.println("Current");
                for (java.util.Map.Entry entry : rzwVar.a().entrySet()) {
                    printWriter.println("Port status for " + ((java.lang.String) entry.getKey()) + ": " + java.lang.String.valueOf(entry.getValue()));
                }
                printWriter.println("UsbState ".concat(java.lang.String.valueOf(java.lang.String.valueOf(rzwVar.e()))));
                defpackage.ygw ygwVarA = this.b.a();
                if (!ygwVarA.isEmpty()) {
                    printWriter.println("History");
                    int i = ((defpackage.ymx) ygwVarA).c;
                    for (int i2 = 0; i2 < i; i2++) {
                        java.lang.String str = (java.lang.String) ygwVarA.get(i2);
                        if (str != null) {
                            printWriter.println(str);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ryk
    public final synchronized void d(java.lang.Object obj, int i) {
        if (this.f && this.d && this.g.g()) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "intervalInMs has to be positive. Received: "));
            }
            this.c.add(obj);
            this.b.c(i);
        }
    }

    @Override // defpackage.ryk
    public final synchronized void e(java.lang.Object obj) {
        if (this.f && this.g.g()) {
            java.util.Set set = this.c;
            if (set.remove(obj) && set.isEmpty()) {
                this.b.d();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, rzb] */
    @Override // defpackage.ryk
    public final boolean f() {
        defpackage.rit ritVar = defpackage.rit.INSTANCE;
        rza rzaVarI = defpackage.rox.i("function");
        defpackage.xyn xynVar = this.j;
        if (xynVar.f()) {
            if (rzaVarI != null) {
                xynVar.b().d(this.h, 1, 4, rzaVarI);
                return true;
            }
            e.h().ai(8545).y("Reset method %s not supported on this version of Android", "function");
            return true;
        }
        defpackage.yqk yqkVar = e;
        yqkVar.h().ai(8541).u("Reset handler not provided. This should never happen for Android R and above.");
        if (this.f) {
            defpackage.adcq adcqVar = defpackage.adcq.a;
            if (adcqVar.fF().s()) {
                android.content.SharedPreferences sharedPreferences = this.i;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                long j = sharedPreferences.getLong("reset_timestamp", -1L);
                if (j != -1 && jCurrentTimeMillis - j < adcqVar.fF().h()) {
                    defpackage.omv.h(this.h, "com.google.android.gms.car.USB_ISSUE_FOUND", defpackage.rst.i, null);
                    yqkVar.h().ai(8542).u("USB connection has been reset recently");
                    return false;
                }
                yqkVar.h().ai(8543).u("Attempting to reset the USB connection");
                defpackage.omv.h(this.h, "com.google.android.gms.car.USB_RESET", defpackage.rsr.a, null);
                sharedPreferences.edit().putLong("reset_timestamp", java.lang.System.currentTimeMillis()).apply();
                try {
                    this.g.b();
                    return true;
                } catch (defpackage.ryz e2) {
                    e.h().p(e2).ai(8544).u("Failed to reset usb connection.");
                }
            }
        }
        return false;
    }
}
