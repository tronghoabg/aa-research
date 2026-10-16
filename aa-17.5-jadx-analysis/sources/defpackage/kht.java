package defpackage;

import android.os.Build;
import j$.time.Duration;
import j$.time.LocalDate;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class kht {
    public static final yph a = yph.c("GH.CPCalendarStore");
    public static final Duration b = Duration.ofSeconds(10);
    public final ScheduledExecutorService c = Executors.newScheduledThreadPool(1);

    private static boolean d() {
        return dup.c(mki.a.c, "android.permission.READ_CALENDAR") == 0;
    }

    private static final void e() {
        if (Build.VERSION.SDK_INT < 30) {
            String.format(Locale.US, "[runningOnWork=unknown, sdk=%d]", Integer.valueOf(Build.VERSION.SDK_INT));
        } else {
            String.format("[runningOnWork=%b]", Boolean.valueOf(kwo.b().c()));
        }
    }

    public final zgp a(final LocalDate localDate) {
        e();
        final zhc zhcVar = new zhc();
        if (d()) {
            wer.e(new Runnable() { // from class: khp
                @Override // java.lang.Runnable
                public final void run() {
                    Executor mainExecutor = mki.a.c.getMainExecutor();
                    kho khoVarE = kho.e();
                    afco afcoVar = tby.a;
                    zgp zgpVarN = szp.n(khoVarE.a(new eqm(localDate)), kht.b, this.a.c);
                    wub.ah(zgj.v(zgpVarN), new khs(2), mainExecutor);
                    zhcVar.r(zgpVarN);
                }
            });
            return zhcVar;
        }
        ((ype) ((ype) a.g()).ai((char) 3100)).u("[All-Day Events]: Permission not granted. Returning empty list.");
        int i = yfq.d;
        zhcVar.o(yls.a);
        return zhcVar;
    }

    public final zgp b(final Long l) {
        e();
        final zhc zhcVar = new zhc();
        if (d()) {
            wer.e(new Runnable() { // from class: khr
                @Override // java.lang.Runnable
                public final void run() {
                    Executor mainExecutor = mki.a.c.getMainExecutor();
                    kho khoVarE = kho.e();
                    afco afcoVar = tby.a;
                    zgp zgpVarN = szp.n(khoVarE.b(new eqm(l)), kht.b, this.a.c);
                    wub.ah(zgj.v(zgpVarN), new khs(3), mainExecutor);
                    zhcVar.r(zgpVarN);
                }
            });
            return zhcVar;
        }
        ((ype) ((ype) a.g()).ai((char) 3103)).u("[Reminders]: Permission not granted. Returning empty list.");
        int i = yfq.d;
        zhcVar.o(yls.a);
        return zhcVar;
    }

    public final zgp c(final Long l, final Long l2) {
        e();
        final zhc zhcVar = new zhc();
        if (d()) {
            wer.e(new Runnable() { // from class: khq
                @Override // java.lang.Runnable
                public final void run() {
                    Executor mainExecutor = mki.a.c.getMainExecutor();
                    kho khoVarE = kho.e();
                    afco afcoVar = tby.a;
                    zgp zgpVarN = szp.n(khoVarE.c(new eqm(l), new eqm(l2)), kht.b, this.a.c);
                    wub.ah(zgj.v(zgpVarN), new khs(0), mainExecutor);
                    zhcVar.r(zgpVarN);
                }
            });
            return zhcVar;
        }
        ((ype) ((ype) a.g()).ai((char) 3106)).u("[Timed Events]: Permission not granted. Returning empty list.");
        int i = yfq.d;
        zhcVar.o(yls.a);
        return zhcVar;
    }
}
