package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rzn implements java.lang.Runnable {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.SERVICE.USBMON");
    public final java.util.Map b;
    public final android.content.Context c;
    public final defpackage.rzw d;
    private final java.util.Queue e;
    private final java.lang.Runnable f;
    private final java.text.SimpleDateFormat g;
    private final android.os.Handler h;
    private final defpackage.rzf i;
    private final boolean j;
    private final boolean k;
    private final defpackage.rzt l;
    private defpackage.rzs m;
    private int n;
    private boolean o;
    private final defpackage.rzm p;

    public rzn(android.content.Context context, android.os.Handler handler, defpackage.rzw rzwVar, defpackage.rzf rzfVar) {
        defpackage.rit ritVar = defpackage.rit.INSTANCE;
        this.b = new java.util.HashMap();
        this.f = new defpackage.rzu(this, 1, null);
        this.g = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS", java.util.Locale.US);
        this.j = defpackage.adcq.a.fF().l();
        this.l = new defpackage.rzt();
        this.m = defpackage.rzs.a;
        this.o = true;
        this.c = context;
        this.h = handler;
        this.d = rzwVar;
        this.i = rzfVar;
        this.p = new defpackage.rzm(this);
        this.k = defpackage.acyx.a.fF().p();
        this.e = new defpackage.yfd(50);
    }

    private final synchronized void g(java.util.Date date, java.lang.String str) {
        java.util.Queue queue = this.e;
        queue.getClass();
        queue.add(android.util.Pair.create(date, str));
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, rzb] */
    private final void h(java.util.Date date) {
        try {
            defpackage.rzw rzwVar = this.d;
            for (java.util.Map.Entry entry : rzwVar.a().entrySet()) {
                b((java.lang.String) entry.getKey(), (rzq) entry.getValue(), date);
            }
            defpackage.rzs rzsVarE = rzwVar.e();
            if (rzsVarE == null || rzsVarE.equals(this.m)) {
                return;
            }
            if (this.k) {
                int iA = this.l.a(rzsVarE.c);
                if (iA == 3) {
                    defpackage.omv.i(this.c, defpackage.yyn.USB_PORT_DISCONNECTED);
                } else if (iA == 2) {
                    defpackage.omv.i(this.c, defpackage.yyn.USB_PORT_CONNECTED);
                }
            }
            i(this.m.c, rzsVarE.c, defpackage.rsu.e, defpackage.rsu.f);
            i(this.m.b, rzsVarE.b, defpackage.rsu.c, defpackage.rsu.d);
            i(this.m.e, rzsVarE.e, defpackage.rsu.a, defpackage.rsu.b);
            i(this.m.f, rzsVarE.f, defpackage.rsu.m, defpackage.rsu.n);
            i(this.m.g, rzsVarE.g, defpackage.rsu.o, defpackage.rsu.p);
            i(this.m.h, rzsVarE.h, defpackage.rsu.g, defpackage.rsu.h);
            i(this.m.i, rzsVarE.i, defpackage.rsu.i, defpackage.rsu.j);
            i(this.m.d, rzsVarE.d, defpackage.rsu.k, defpackage.rsu.l);
            defpackage.rzf rzfVar = this.i;
            if (!rzfVar.e.equals(rzsVarE)) {
                defpackage.you youVarListIterator = ((defpackage.ygw) rzfVar.a).listIterator(0);
                while (youVarListIterator.hasNext()) {
                    ((defpackage.ryv) youVarListIterator.next()).c(rzsVarE);
                }
                rzfVar.e = rzsVarE;
                defpackage.xyn xynVar = rzfVar.b;
                if (xynVar.f()) {
                    xynVar.b().b(rzsVarE);
                }
            }
            java.lang.String strConcat = "Usb status changed to: ".concat(rzsVarE.toString());
            a.f().ai(8587).y("%s", strConcat);
            this.m = rzsVarE;
            g(date, strConcat);
        } catch (java.lang.RuntimeException e) {
            if (android.os.Build.VERSION.SDK_INT != 31 || !ll$.ExternalSyntheticApiModelOutline0.m$1(e.getCause())) {
                throw e;
            }
        }
    }

    private final void i(boolean z, boolean z2, defpackage.rsu rsuVar, defpackage.rsu rsuVar2) {
        if (z != z2) {
            android.content.Context context = this.c;
            if (true != z2) {
                rsuVar = rsuVar2;
            }
            defpackage.omv.h(context, "com.google.android.gms.car.USB_STATE_CHANGED", rsuVar, null);
        }
    }

    final synchronized defpackage.ygw a() {
        defpackage.ygr ygrVar;
        java.util.Queue<android.util.Pair> queue = this.e;
        queue.getClass();
        int i = defpackage.ygw.d;
        ygrVar = new defpackage.ygr(4);
        for (android.util.Pair pair : queue) {
            ygrVar.i(this.g.format((java.util.Date) pair.first) + " " + ((java.lang.String) pair.second));
        }
        return ygrVar.g();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    public final void b(java.lang.String str, rzq rzqVar, java.util.Date date) {
        boolean z;
        android.content.Context context;
        java.util.Map map = this.b;
        rzq rzqVar2 = (rzq) map.get(str);
        if (rzqVar == null || rzqVar.equals(rzqVar2)) {
            return;
        }
        java.lang.String str2 = "Port status changed for " + str + ": " + rzqVar.toString();
        a.f().ai(8586).y("%s", str2);
        if (this.k) {
            int iA = this.l.a(rzqVar.a);
            if (iA == 3) {
                defpackage.omv.i(this.c, defpackage.yyn.USB_PORT_DISCONNECTED);
            } else if (iA == 2) {
                defpackage.omv.i(this.c, defpackage.yyn.USB_PORT_CONNECTED);
            }
        } else if (rzqVar2 != null) {
            if (rzqVar2.a != rzqVar.a) {
                z = rzqVar.a;
                context = this.c;
                if (z) {
                    defpackage.omv.i(context, defpackage.yyn.USB_PORT_CONNECTED);
                } else {
                    defpackage.omv.i(context, defpackage.yyn.USB_PORT_DISCONNECTED);
                }
            }
        } else {
            z = rzqVar.a;
            context = this.c;
            if (z) {
                defpackage.omv.i(context, defpackage.yyn.USB_PORT_CONNECTED);
            } else {
                defpackage.omv.i(context, defpackage.yyn.USB_PORT_DISCONNECTED);
            }
        }
        map.put(str, rzqVar);
        g(date, str2);
        defpackage.rzf rzfVar = this.i;
        if (rzqVar.equals(rzfVar.f)) {
            return;
        }
        defpackage.you youVarListIterator = ((defpackage.ygw) rzfVar.a).listIterator(0);
        while (youVarListIterator.hasNext()) {
            ((defpackage.ryv) youVarListIterator.next()).b(rzqVar);
        }
        rzfVar.f = rzqVar;
    }

    final synchronized void c(int i) {
        this.n = i;
        if (this.j) {
            this.h.removeCallbacks(this.f);
        }
        if (this.o) {
            android.content.Context context = this.c;
            if (defpackage.duw.c(context, "android.permission.MANAGE_USB") == 0) {
                a.f().ai(8588).u("Starting USB monitor");
                java.util.Date date = new java.util.Date();
                g(date, "Starting USB monitor");
                this.o = false;
                defpackage.rzf rzfVar = this.i;
                rzfVar.d = defpackage.xyn.h(context);
                rzfVar.b();
                android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.google.android.gms.car.CONNECTIVITY_EVENT");
                defpackage.you youVarListIterator = ((defpackage.ygw) rzfVar.a).listIterator(0);
                while (youVarListIterator.hasNext()) {
                    defpackage.ryv ryvVar = (defpackage.ryv) youVarListIterator.next();
                    ryvVar.d();
                    ryvVar.f();
                }
                if (rzfVar.c == null) {
                    rzfVar.c = new rze(rzfVar);
                    rzfVar.c.getClass();
                    defpackage.eth.a(context).b(rzfVar.c, intentFilter);
                }
                defpackage.omv.h(context, "com.google.android.gms.car.USB_MONITOR_LIFETIME", defpackage.rsr.a, null);
                h(date);
                this.h.postDelayed(this, this.n);
                defpackage.rzm rzmVar = this.p;
                if (!rzmVar.a) {
                    android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
                    intentFilter2.addAction("android.hardware.usb.action.USB_PORT_CHANGED");
                    rzmVar.b.c.registerReceiver(rzmVar, intentFilter2);
                    rzmVar.a = true;
                }
            }
        }
    }

    final synchronized void d() {
        e(this.j);
    }

    public final synchronized void e(boolean z) {
        if (this.o) {
            return;
        }
        if (!z) {
            f();
            return;
        }
        android.os.Handler handler = this.h;
        java.lang.Runnable runnable = this.f;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, defpackage.acyx.c());
    }

    public final synchronized void f() {
        this.h.removeCallbacks(this);
        defpackage.rzm rzmVar = this.p;
        if (rzmVar.a) {
            rzmVar.b.c.unregisterReceiver(rzmVar);
            rzmVar.a = false;
        }
        java.util.Date date = new java.util.Date();
        h(date);
        this.o = true;
        this.m = defpackage.rzs.a;
        this.b.clear();
        defpackage.rzf rzfVar = this.i;
        rzfVar.c.getClass();
        if (rzfVar.d.f()) {
            defpackage.eth.a((android.content.Context) rzfVar.d.b()).c(rzfVar.c);
        }
        defpackage.you youVarListIterator = ((defpackage.ygw) rzfVar.a).listIterator(0);
        while (youVarListIterator.hasNext()) {
            ((defpackage.ryv) youVarListIterator.next()).e();
        }
        rzfVar.b();
        defpackage.omv.h(this.c, "com.google.android.gms.car.USB_MONITOR_LIFETIME", defpackage.rsr.b, null);
        g(date, "Stopped USB monitor");
        a.f().ai(8589).u("Stopped USB monitor");
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.o) {
            return;
        }
        h(new java.util.Date());
        this.h.postDelayed(this, this.n);
    }
}
