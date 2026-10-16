package c7;

import G6.L;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import cg.C1618g;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import e0.C2448K;
import e0.r;
import e0.z;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AbstractC3340k;
import pd.v;

/* renamed from: c7.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1576l {

    /* renamed from: e, reason: collision with root package name */
    public static C1576l f19704e;

    /* renamed from: a, reason: collision with root package name */
    public int f19705a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19706b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19707c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19708d;

    public C1576l(int i5) {
        switch (i5) {
            case 2:
                this.f19706b = new Object();
                this.f19707c = null;
                this.f19708d = null;
                this.f19705a = 0;
                break;
            default:
                this.f19706b = null;
                this.f19707c = null;
                this.f19705a = 0;
                this.f19708d = new Object();
                break;
        }
    }

    public static synchronized C1576l k(Context context) {
        try {
            if (f19704e == null) {
                zze.zza();
                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new H6.b("MessengerIpcClient", 2)));
                C1576l c1576l = new C1576l();
                c1576l.f19708d = new ServiceConnectionC1574j(c1576l);
                c1576l.f19705a = 1;
                c1576l.f19707c = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                c1576l.f19706b = context.getApplicationContext();
                f19704e = c1576l;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19704e;
    }

    public void a(boolean z2, v vVar, C1618g c1618g, boolean z10) {
        Fe.e.t(c1618g, "source");
        int iMin = Math.min(vVar.f43605c, ((v) vVar.f43609g.f19708d).f43605c);
        C1618g c1618g2 = vVar.f43603a;
        boolean z11 = c1618g2.f19902b > 0;
        int i5 = (int) c1618g.f19902b;
        if (z11 || iMin < i5) {
            if (!z11 && iMin > 0) {
                vVar.b(iMin, c1618g, false);
            }
            c1618g2.E(c1618g, (int) c1618g.f19902b);
            vVar.f43608f = z2 | vVar.f43608f;
        } else {
            vVar.b(i5, c1618g, z2);
        }
        if (z10) {
            try {
                ((pd.d) this.f19707c).flush();
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f19706b) {
            try {
                Q1.k.g(this.f19705a > 0);
                int i5 = this.f19705a - 1;
                this.f19705a = i5;
                if (i5 == 0 && (handlerThread = (HandlerThread) this.f19708d) != null) {
                    handlerThread.quit();
                    this.f19708d = null;
                    this.f19707c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(float f10) {
        Paint paint = (Paint) this.f19706b;
        AbstractC3340k.e(paint, "<this>");
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public void d(int i5) {
        this.f19705a = i5;
        Paint setNativeBlendMode = (Paint) this.f19706b;
        AbstractC3340k.e(setNativeBlendMode, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            C2448K.f34356a.a(setNativeBlendMode, i5);
        } else {
            setNativeBlendMode.setXfermode(new PorterDuffXfermode(z.u(i5)));
        }
    }

    public void e(long j8) {
        Paint setNativeColor = (Paint) this.f19706b;
        AbstractC3340k.e(setNativeColor, "$this$setNativeColor");
        setNativeColor.setColor(z.s(j8));
    }

    public void f(r rVar) {
        this.f19708d = rVar;
        Paint paint = (Paint) this.f19706b;
        AbstractC3340k.e(paint, "<this>");
        paint.setColorFilter(rVar != null ? rVar.f34383a : null);
    }

    public void g(int i5) {
        Paint setNativeStyle = (Paint) this.f19706b;
        AbstractC3340k.e(setNativeStyle, "$this$setNativeStyle");
        setNativeStyle.setStyle(i5 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public void h(v vVar, int i5) {
        if (vVar == null) {
            ((v) this.f19708d).a(i5);
            i();
            return;
        }
        vVar.a(i5);
        R1.i iVar = new R1.i(5);
        vVar.c(Math.min(vVar.f43605c, ((v) vVar.f43609g.f19708d).f43605c), iVar);
        if (iVar.f10117b > 0) {
            try {
                ((pd.d) this.f19707c).flush();
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void i() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f19706b
            pd.m r0 = (pd.m) r0
            pd.v[] r1 = r0.k()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            java.lang.Object r2 = r13.f19708d
            pd.v r2 = (pd.v) r2
            int r2 = r2.f43605c
            int r3 = r1.length
        L16:
            r4 = 0
            if (r3 <= 0) goto L6a
            if (r2 <= 0) goto L6a
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L26:
            if (r7 >= r3) goto L68
            if (r2 <= 0) goto L68
            r8 = r1[r7]
            int r9 = r8.f43605c
            cg.g r10 = r8.f43603a
            long r11 = r10.f19902b
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.f43606d
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L4e
            int r11 = r8.f43606d
            int r11 = r11 + r9
            r8.f43606d = r11
            int r2 = r2 - r9
        L4e:
            int r9 = r8.f43605c
            long r10 = r10.f19902b
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.f43606d
            int r9 = r9 - r10
            if (r9 <= 0) goto L65
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L65:
            int r7 = r7 + 1
            goto L26
        L68:
            r3 = r6
            goto L16
        L6a:
            R1.i r1 = new R1.i
            r2 = 5
            r1.<init>(r2)
            pd.v[] r0 = r0.k()
            int r2 = r0.length
            r3 = r4
        L76:
            if (r3 >= r2) goto L84
            r5 = r0[r3]
            int r6 = r5.f43606d
            r5.c(r6, r1)
            r5.f43606d = r4
            int r3 = r3 + 1
            goto L76
        L84:
            int r0 = r1.f10117b
            if (r0 <= 0) goto L97
            java.lang.Object r0 = r13.f19707c     // Catch: java.io.IOException -> L90
            pd.d r0 = (pd.d) r0     // Catch: java.io.IOException -> L90
            r0.flush()     // Catch: java.io.IOException -> L90
            return
        L90:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.C1576l.i():void");
    }

    public Looper j() {
        Looper looper;
        Object obj = this.f19708d;
        synchronized (obj) {
            try {
                if (this.f19705a != 0) {
                    AbstractC1732v.j((HandlerThread) this.f19706b, "Invalid state: handlerThread should already been initialized.");
                } else if (((HandlerThread) this.f19706b) == null) {
                    L.k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f19706b = handlerThread;
                    handlerThread.start();
                    this.f19707c = new zzgax(((HandlerThread) this.f19706b).getLooper());
                    L.k("Looper thread started.");
                } else {
                    L.k("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.f19705a++;
                looper = ((HandlerThread) this.f19706b).getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public synchronized Task l(C1575k c1575k) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(c1575k.toString()));
            }
            if (!((ServiceConnectionC1574j) this.f19708d).d(c1575k)) {
                ServiceConnectionC1574j serviceConnectionC1574j = new ServiceConnectionC1574j(this);
                this.f19708d = serviceConnectionC1574j;
                serviceConnectionC1574j.d(c1575k);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1575k.f19700b.getTask();
    }
}
