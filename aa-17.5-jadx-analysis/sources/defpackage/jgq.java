package defpackage;

import android.os.Handler;
import com.google.android.gms.car.display.CarDisplayId;
import java.io.PrintWriter;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jgq implements jgm {
    public Handler a;
    int b;
    private final xyc c;
    private final xyc d;
    private ScheduledExecutorService e;
    private Future f;
    private final Runnable g;

    public jgq(jgn jgnVar, CarDisplayId carDisplayId, xyc xycVar) {
        ilk ilkVar = new ilk(carDisplayId, 13);
        this.c = wub.L(xycVar);
        this.d = ilkVar;
        this.g = new aq(this, jgnVar, 17);
    }

    @Override // defpackage.jgm
    public final void a(PrintWriter printWriter) {
        printWriter.println("Using executor based VSync");
        printWriter.println("Period: " + this.b);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    @Override // defpackage.jgm
    public final void b(Handler handler) {
        this.a = handler;
        this.e = this.d.gu();
        int iIntValue = (int) ((1000.0d / ((Integer) this.c.gu()).intValue()) * 1000000.0d);
        this.b = iIntValue;
        ScheduledExecutorService scheduledExecutorService = this.e;
        scheduledExecutorService.getClass();
        this.f = scheduledExecutorService.scheduleAtFixedRate(this.g, 0L, iIntValue, TimeUnit.NANOSECONDS);
    }

    @Override // defpackage.jgm
    public final void c() {
        this.f.cancel(false);
        ScheduledExecutorService scheduledExecutorService = this.e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.e = null;
        }
    }
}
