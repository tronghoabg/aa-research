package defpackage;

import android.os.SystemClock;
import com.carstream.tech.car.e;
import com.carstream.tech.media.ControllerService;
import com.carstream.tech.media.PlaybackService;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class z6 {
    public static ControllerService a;
    public static boolean b;
    public static String c;
    public static long d;
    public static volatile x6 g;
    public static volatile v6 h;
    public static final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public static final AtomicLong f = new AtomicLong();
    public static final Set i = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    public static boolean a() {
        return !i.isEmpty();
    }

    public static void b(t6 t6Var) {
        if (t6Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = j;
            if (copyOnWriteArrayList.contains(t6Var)) {
                return;
            }
            copyOnWriteArrayList.add(t6Var);
        }
    }

    public static boolean c() {
        y6 y6VarN = n();
        if (y6VarN != null) {
            ((e) y6VarN).t();
            return true;
        }
        c = "";
        d = SystemClock.elapsedRealtime();
        return false;
    }

    public static boolean d(String str) {
        if (str != null && !str.trim().isEmpty()) {
            y6 y6VarN = n();
            if (y6VarN != null) {
                ((e) y6VarN).A(str);
                return true;
            }
            c = str;
            d = SystemClock.elapsedRealtime();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.w6 e() {
        /*
            java.util.concurrent.CopyOnWriteArrayList r0 = defpackage.z6.e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r0.next()
            w6 r2 = (defpackage.w6) r2
            y6 r3 = r2.b
            if (r3 != 0) goto L18
            goto L7
        L18:
            if (r1 == 0) goto L5e
            boolean r3 = r2.d
            boolean r4 = r1.d
            if (r3 == r4) goto L23
            boolean r3 = r2.d
            goto L5c
        L23:
            long r3 = r2.f
            long r5 = r1.f
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L39
            long r6 = r2.f
            long r8 = r1.f
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L37
        L35:
            r3 = r5
            goto L5c
        L37:
            r3 = r4
            goto L5c
        L39:
            boolean r3 = r2.c
            boolean r6 = r1.c
            if (r3 == r6) goto L42
            boolean r3 = r2.c
            goto L5c
        L42:
            long r6 = r2.e
            long r8 = r1.e
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 == 0) goto L53
            long r6 = r2.e
            long r8 = r1.e
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L37
            goto L35
        L53:
            long r6 = r2.p
            long r8 = r1.p
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L37
            goto L35
        L5c:
            if (r3 == 0) goto L7
        L5e:
            r1 = r2
            goto L7
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z6.e():w6");
    }

    public static void f() {
        w6 w6VarE = e();
        if (w6VarE == null) {
            return;
        }
        (((e) w6VarE.a).g() ? "toan man hinh" : "ban chieu").concat(w6VarE.c ? "" : ", DANG AN");
    }

    public static w6 g(u6 u6Var) {
        Iterator it = e.iterator();
        while (it.hasNext()) {
            w6 w6Var = (w6) it.next();
            if (w6Var.a == u6Var) {
                return w6Var;
            }
        }
        return null;
    }

    public static Boolean h() {
        u6 u6VarI = i();
        if (u6VarI == null) {
            return null;
        }
        try {
            return Boolean.valueOf(((e) u6VarI).g());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static u6 i() {
        Iterator it = e.iterator();
        w6 w6Var = null;
        while (it.hasNext()) {
            w6 w6Var2 = (w6) it.next();
            if (w6Var2.c && (w6Var == null || w6Var2.e > w6Var.e)) {
                w6Var = w6Var2;
            }
        }
        if (w6Var == null) {
            return null;
        }
        return w6Var.a;
    }

    public static void j() {
        Iterator it = e.iterator();
        while (it.hasNext()) {
            try {
                ((e) ((w6) it.next()).a).n();
            } catch (Throwable unused) {
            }
        }
        v6 v6Var = h;
        if (v6Var != null) {
            ((l6) v6Var).b.goToActivate();
        }
    }

    public static long k() {
        w6 w6VarL = l();
        if (w6VarL == null) {
            return 0L;
        }
        return w6VarL.j;
    }

    public static w6 l() {
        w6 w6VarE = e();
        if (w6VarE != null && !w6VarE.g.isEmpty()) {
            return w6VarE;
        }
        Iterator it = e.iterator();
        while (it.hasNext()) {
            w6 w6Var = (w6) it.next();
            if (w6Var.d && !w6Var.g.isEmpty()) {
                return w6Var;
            }
        }
        return w6VarE;
    }

    public static String m() {
        w6 w6VarL = l();
        return w6VarL == null ? "" : w6VarL.g;
    }

    public static y6 n() {
        w6 w6VarE = e();
        if (w6VarE == null) {
            return null;
        }
        return w6VarE.b;
    }

    public static long o(w6 w6Var) {
        if (w6Var == null) {
            return 0L;
        }
        if (!w6Var.d || w6Var.k == 0) {
            return w6Var.i;
        }
        long jElapsedRealtime = w6Var.i + (SystemClock.elapsedRealtime() - w6Var.k);
        return w6Var.j > 0 ? Math.min(jElapsedRealtime, w6Var.j) : jElapsedRealtime;
    }

    public static void p() {
        Iterator it = e.iterator();
        while (it.hasNext()) {
            try {
                ((e) ((w6) it.next()).a).x();
            } catch (Throwable unused) {
            }
        }
        ControllerService controllerService = a;
        if (controllerService != null) {
            controllerService.quitService();
        }
    }

    public static String q(w6 w6Var) {
        if (w6Var == null) {
            return "";
        }
        try {
            return w6Var.l ? "CarStream Box" : ((e) w6Var.a).g() ? "CarStream Full" : "CarStream";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void r(String str) {
        Iterator it = e.iterator();
        while (it.hasNext()) {
            y6 y6Var = ((w6) it.next()).b;
            if (y6Var != null) {
                try {
                    ((e) y6Var).D(str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void s(String str, boolean z) {
        boolean zA = a();
        Set set = i;
        if (z) {
            set.add(str);
        } else {
            set.remove(str);
        }
        boolean zA2 = a();
        if (zA == zA2) {
            return;
        }
        Iterator it = j.iterator();
        while (it.hasNext()) {
            try {
                ((t6) it.next()).a(zA2);
            } catch (Throwable unused) {
            }
        }
    }

    public static void t(u6 u6Var, String str, String str2, long j2, long j3, boolean z) {
        w6 w6VarG = g(u6Var);
        if (w6VarG != null) {
            w6VarG.d = z;
            if (z) {
                w6VarG.f = f.incrementAndGet();
            }
            if (str == null) {
                str = "";
            }
            w6VarG.g = str;
            if (str2 == null) {
                str2 = "";
            }
            w6VarG.h = str2;
            w6VarG.i = j2;
            w6VarG.j = j3;
            w6VarG.k = SystemClock.elapsedRealtime();
        }
        w6 w6VarE = e();
        b = w6VarE != null && w6VarE.d;
        ControllerService controllerService = a;
        if (controllerService != null) {
            controllerService.publishNowPlaying();
        }
        PlaybackService.refresh();
    }

    public static void u(u6 u6Var, boolean z) {
        w6 w6VarG = g(u6Var);
        if (w6VarG != null) {
            w6VarG.i = o(w6VarG);
            w6VarG.k = SystemClock.elapsedRealtime();
            w6VarG.d = z;
            if (z) {
                w6VarG.f = f.incrementAndGet();
            }
        }
        w6 w6VarE = e();
        boolean z2 = w6VarE != null && w6VarE.d;
        b = z2;
        ControllerService controllerService = a;
        if (controllerService != null) {
            controllerService.publishState(z2 ? 3 : 2);
        }
        PlaybackService.refresh();
    }

    public static void v(u6 u6Var, boolean z) {
        w6 w6VarG = g(u6Var);
        if (w6VarG != null) {
            w6VarG.c = z;
            if (z) {
                w6VarG.e = f.incrementAndGet();
            }
        }
        w6 w6VarE = e();
        boolean z2 = w6VarE != null && w6VarE.d;
        b = z2;
        ControllerService controllerService = a;
        if (controllerService != null) {
            controllerService.publishState(z2 ? 3 : 2);
        }
    }

    public static void w() {
        Iterator it = e.iterator();
        while (it.hasNext()) {
            w6 w6Var = (w6) it.next();
            try {
                y6 y6Var = w6Var.b;
                if (y6Var != null) {
                    ((e) y6Var).E();
                } else {
                    u6 u6Var = w6Var.a;
                    if (u6Var != null) {
                        ((e) u6Var).b.railAfterSettingChange();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static String x() {
        w6 w6VarL = l();
        if (w6VarL == null || w6VarL.h.isEmpty()) {
            return null;
        }
        return w6VarL.h;
    }
}
