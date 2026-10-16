package defpackage;

import android.os.Process;
import com.google.android.gms.car.diagnostics.CriticalError;
import java.lang.Thread;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class kje implements Thread.UncaughtExceptionHandler {
    private static final yph a = yph.c("GH.UncaughtICSEHandler");
    private final kjd b;
    private final Thread.UncaughtExceptionHandler c;

    public kje(kjd kjdVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = kjdVar;
        this.c = uncaughtExceptionHandler;
    }

    private final int a(Throwable th) {
        CriticalError criticalErrorA;
        if (!(th instanceof kir)) {
            if (th.getCause() != null) {
                return a(th.getCause());
            }
            return 5;
        }
        kir kirVar = (kir) th;
        zaa zaaVar = zaa.CAR_API_OUT_OF_CAR_LIFECYCLE_EXCEPTION;
        if (mki.a == null || !jri.a()) {
            ((ype) ((ype) ((ype) kjd.a.f()).p(kirVar)).ai((char) 3177)).y("%s only handled in projected. Forwarding to crash handler.", "IllegalCarConnectionStateException");
            return 2;
        }
        if (kirVar.c && !kio.b().p()) {
            ((ype) ((ype) ((ype) kjd.a.g()).p(kirVar)).ai((char) 3176)).u("Attempt to access car while not connected on client side. Forwarding to crash handler.");
            return 3;
        }
        ((ype) ((ype) ((ype) kjd.a.f()).p(kirVar)).ai((char) 3173)).y("Logging telemetry for %s.", "IllegalCarConnectionStateException");
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, kirVar.a, kirVar.b);
        rrbVarH.v(zaaVar);
        if (rrbVarH.z == null) {
            rrbVarH.z = new twj();
        }
        twj twjVar = rrbVarH.z;
        try {
            criticalErrorA = kjd.a();
        } catch (IllegalStateException e) {
            ((ype) ((ype) ((ype) kjd.a.g()).p(e)).ai((char) 3181)).u("Unable to fetch reason for last disconnect.");
            criticalErrorA = null;
        }
        if (criticalErrorA != null) {
            twjVar.b(yze.b(criticalErrorA.a));
            twjVar.c(yzf.b(criticalErrorA.b));
        } else {
            twjVar.b(yze.UNKNOWN_CODE);
            twjVar.c(yzf.UNKNOWN_DETAIL);
        }
        kio kioVarB = kio.b();
        twjVar.b = xxh.h(Long.valueOf(kioVarB.a() != kin.d ? -1L : kioVarB.c.a()));
        try {
            if (((Boolean) ((zeu) ebf.j().a(rrbVarH.l())).s()).booleanValue()) {
                ((ype) ((ype) kjd.a.f()).ai((char) 3174)).y("Telemetry guaranteed for %s.", "IllegalCarConnectionStateException");
                return 1;
            }
        } catch (InterruptedException | ExecutionException e2) {
            ((ype) ((ype) ((ype) kjd.a.h()).p(e2)).ai((char) 3179)).u("Failed to log telemetry");
        }
        ((ype) ((ype) ((ype) kjd.a.g()).p(kirVar)).ai((char) 3175)).y("Unable to guarantee telemetry for %s. Forwarding to crash handler.", "IllegalCarConnectionStateException");
        return 4;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            int iA = a(th);
            if (iA == 1 || iA == 4) {
                ((ype) ((ype) ((ype) a.f()).p(th)).ai(3182)).u("Exception handled, killing process.");
                Process.killProcess(Process.myPid());
                System.exit(10);
                return;
            }
        } catch (Throwable th2) {
            ((ype) ((ype) ((ype) a.g()).p(th2)).ai((char) 3183)).u("Error occurred when handling exception.");
        }
        this.c.uncaughtException(thread, th);
    }
}
