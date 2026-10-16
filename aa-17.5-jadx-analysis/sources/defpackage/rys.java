package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.util.Pair;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes.dex */
public final class rys implements Runnable {
    public static final ypf a = ols.R("CAR.SERVICE.USBMON");
    public final Map b;
    public final Context c;
    public final rza d;
    private final Queue e;
    private final Runnable f;
    private final SimpleDateFormat g;
    private final Handler h;
    private final ryk i;
    private final boolean j;
    private final boolean k;
    private final ryy l;
    private ryx m;
    private int n;
    private boolean o;
    private final ryr p;

    public rys(Context context, Handler handler, rza rzaVar, ryk rykVar) {
        rhx rhxVar = rhx.c;
        this.b = new HashMap();
        this.f = new rsv(this, 9, null);
        this.g = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS", Locale.US);
        this.j = adbr.a.gu().l();
        this.l = new ryy();
        this.m = ryx.a;
        this.o = true;
        this.c = context;
        this.h = handler;
        this.d = rzaVar;
        this.i = rykVar;
        this.p = new ryr(this);
        this.k = acxv.a.gu().p();
        this.e = new ydx(50);
    }

    private final synchronized void g(Date date, String str) {
        Queue queue = this.e;
        queue.getClass();
        queue.add(Pair.create(date, str));
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, ryg] */
    private final void h(Date date) {
        try {
            rza rzaVar = this.d;
            for (Map.Entry entry : rzaVar.a().entrySet()) {
                b((String) entry.getKey(), (ryv) entry.getValue(), date);
            }
            ryx ryxVarE = rzaVar.e();
            if (ryxVarE == null || ryxVarE.equals(this.m)) {
                return;
            }
            if (this.k) {
                int iA = this.l.a(ryxVarE.c);
                if (iA == 3) {
                    ols.M(this.c, yxi.USB_PORT_DISCONNECTED);
                } else if (iA == 2) {
                    ols.M(this.c, yxi.USB_PORT_CONNECTED);
                }
            }
            i(this.m.c, ryxVarE.c, rsa.e, rsa.f);
            i(this.m.b, ryxVarE.b, rsa.c, rsa.d);
            i(this.m.e, ryxVarE.e, rsa.a, rsa.b);
            i(this.m.f, ryxVarE.f, rsa.m, rsa.n);
            i(this.m.g, ryxVarE.g, rsa.o, rsa.p);
            i(this.m.h, ryxVarE.h, rsa.g, rsa.h);
            i(this.m.i, ryxVarE.i, rsa.i, rsa.j);
            i(this.m.d, ryxVarE.d, rsa.k, rsa.l);
            ryk rykVar = this.i;
            if (!rykVar.e.equals(ryxVarE)) {
                ynp ynpVarListIterator = ((yfq) rykVar.a).listIterator(0);
                while (ynpVarListIterator.hasNext()) {
                    ((ryb) ynpVarListIterator.next()).c(ryxVarE);
                }
                rykVar.e = ryxVarE;
                xxh xxhVar = rykVar.b;
                if (xxhVar.f()) {
                    xxhVar.b().b(ryxVarE);
                }
            }
            String strConcat = "Usb status changed to: ".concat(ryxVarE.toString());
            a.f().ai(8562).y("%s", strConcat);
            this.m = ryxVarE;
            g(date, strConcat);
        } catch (RuntimeException e) {
            if (Build.VERSION.SDK_INT != 31 || !lk$$ExternalSyntheticApiModelOutline0.m$1(e.getCause())) {
                throw e;
            }
        }
    }

    private final void i(boolean z, boolean z2, rsa rsaVar, rsa rsaVar2) {
        if (z != z2) {
            Context context = this.c;
            if (true != z2) {
                rsaVar = rsaVar2;
            }
            ols.L(context, "com.google.android.gms.car.USB_STATE_CHANGED", rsaVar, null);
        }
    }

    final synchronized yfq a() {
        yfl yflVar;
        Queue<Pair> queue = this.e;
        queue.getClass();
        int i = yfq.d;
        yflVar = new yfl(4);
        for (Pair pair : queue) {
            yflVar.i(this.g.format((Date) pair.first) + " " + ((String) pair.second));
        }
        return yflVar.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r6, defpackage.ryv r7, java.util.Date r8) {
        /*
            r5 = this;
            java.util.Map r0 = r5.b
            java.lang.Object r1 = r0.get(r6)
            ryv r1 = (defpackage.ryv) r1
            if (r7 == 0) goto La1
            boolean r2 = r7.equals(r1)
            if (r2 != 0) goto La1
            java.lang.String r2 = r7.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Port status changed for "
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            ypf r3 = defpackage.rys.a
            yop r3 = r3.f()
            r4 = 8561(0x2171, float:1.1997E-41)
            yop r3 = r3.ai(r4)
            java.lang.String r4 = "%s"
            r3.y(r4, r2)
            boolean r3 = r5.k
            if (r3 == 0) goto L5d
            ryy r1 = r5.l
            boolean r3 = r7.a
            int r1 = r1.a(r3)
            r3 = 3
            if (r1 != r3) goto L52
            android.content.Context r1 = r5.c
            yxi r3 = defpackage.yxi.USB_PORT_DISCONNECTED
            defpackage.ols.M(r1, r3)
            goto L76
        L52:
            r3 = 2
            if (r1 != r3) goto L76
            android.content.Context r1 = r5.c
            yxi r3 = defpackage.yxi.USB_PORT_CONNECTED
            defpackage.ols.M(r1, r3)
            goto L76
        L5d:
            if (r1 == 0) goto L65
            boolean r3 = r7.a
            boolean r1 = r1.a
            if (r1 == r3) goto L76
        L65:
            boolean r1 = r7.a
            android.content.Context r3 = r5.c
            if (r1 == 0) goto L71
            yxi r1 = defpackage.yxi.USB_PORT_CONNECTED
            defpackage.ols.M(r3, r1)
            goto L76
        L71:
            yxi r1 = defpackage.yxi.USB_PORT_DISCONNECTED
            defpackage.ols.M(r3, r1)
        L76:
            r0.put(r6, r7)
            r5.g(r8, r2)
            ryk r5 = r5.i
            ryv r6 = r5.f
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto La1
            java.util.List r6 = r5.a
            yfq r6 = (defpackage.yfq) r6
            r8 = 0
            ynp r6 = r6.listIterator(r8)
        L8f:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L9f
            java.lang.Object r8 = r6.next()
            ryb r8 = (defpackage.ryb) r8
            r8.b(r7)
            goto L8f
        L9f:
            r5.f = r7
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rys.b(java.lang.String, ryv, java.util.Date):void");
    }

    final synchronized void c(int i) {
        this.n = i;
        if (this.j) {
            this.h.removeCallbacks(this.f);
        }
        if (this.o) {
            Context context = this.c;
            if (dup.c(context, "android.permission.MANAGE_USB") == 0) {
                a.f().ai(8563).u("Starting USB monitor");
                Date date = new Date();
                g(date, "Starting USB monitor");
                this.o = false;
                ryk rykVar = this.i;
                rykVar.d = xxh.h(context);
                rykVar.b();
                IntentFilter intentFilter = new IntentFilter("com.google.android.gms.car.CONNECTIVITY_EVENT");
                ynp ynpVarListIterator = ((yfq) rykVar.a).listIterator(0);
                while (ynpVarListIterator.hasNext()) {
                    ryb rybVar = (ryb) ynpVarListIterator.next();
                    rybVar.d();
                    rybVar.f();
                }
                if (rykVar.c == null) {
                    rykVar.c = new ryj(rykVar);
                    rykVar.c.getClass();
                    etb.a(context).b(rykVar.c, intentFilter);
                }
                ols.L(context, "com.google.android.gms.car.USB_MONITOR_LIFETIME", rrx.a, null);
                h(date);
                this.h.postDelayed(this, this.n);
                ryr ryrVar = this.p;
                if (!ryrVar.a) {
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction("android.hardware.usb.action.USB_PORT_CHANGED");
                    ryrVar.b.c.registerReceiver(ryrVar, intentFilter2);
                    ryrVar.a = true;
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
        Handler handler = this.h;
        Runnable runnable = this.f;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, acxv.c());
    }

    public final synchronized void f() {
        this.h.removeCallbacks(this);
        ryr ryrVar = this.p;
        if (ryrVar.a) {
            ryrVar.b.c.unregisterReceiver(ryrVar);
            ryrVar.a = false;
        }
        Date date = new Date();
        h(date);
        this.o = true;
        this.m = ryx.a;
        this.b.clear();
        ryk rykVar = this.i;
        rykVar.c.getClass();
        if (rykVar.d.f()) {
            etb.a((Context) rykVar.d.b()).c(rykVar.c);
        }
        ynp ynpVarListIterator = ((yfq) rykVar.a).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            ((ryb) ynpVarListIterator.next()).e();
        }
        rykVar.b();
        ols.L(this.c, "com.google.android.gms.car.USB_MONITOR_LIFETIME", rrx.b, null);
        g(date, "Stopped USB monitor");
        a.f().ai(8564).u("Stopped USB monitor");
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.o) {
            return;
        }
        h(new Date());
        this.h.postDelayed(this, this.n);
    }
}
