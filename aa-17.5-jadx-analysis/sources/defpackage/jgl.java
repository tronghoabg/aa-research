package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class jgl implements jgm {
    protected static final yph a = yph.c("CAR.WM.Vsync");
    public final jgn b;
    public double c;
    public double d;
    protected long f;
    protected long g;
    public double p;
    private final xyc s;
    public final ydx e = new ydx(20);
    public final AtomicInteger h = new AtomicInteger(0);
    public final AtomicInteger i = new AtomicInteger(0);
    public final int j = (int) acvt.j();
    public final boolean k = acvt.y();
    public long l = 0;
    public long m = 0;
    public long n = 0;
    public boolean o = false;
    public final AtomicBoolean q = new AtomicBoolean(false);
    public final Choreographer.FrameCallback r = new jgj(this, 0);

    public jgl(jgn jgnVar, xyc xycVar) {
        this.b = jgnVar;
        this.s = xycVar;
    }

    @Override // defpackage.jgm
    public final void a(PrintWriter printWriter) {
        printWriter.println("Using choreographer based VSync");
        printWriter.println("Num VSyncs: " + this.h.get() + " Num dropped: " + this.i.get() + " frame pace ahead: " + this.q.get() + " realtime base: " + this.l + " frame time base: " + this.m + " estimated clock offset: " + this.n + " last frame time: " + this.f + " lastFrameNormalizedTimeNanos: " + this.g);
        ArrayList arrayList = new ArrayList(this.e);
        printWriter.println("Recent frame history:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jgk jgkVar = (jgk) arrayList.get(i);
            long j = jgkVar.a;
            byte b = jgkVar.b;
            StringBuilder sb = new StringBuilder("  Timestamp: ");
            sb.append(j);
            sb.append(", Type: ");
            sb.append(b == 1 ? "Normal" : "Dropped by timer");
            printWriter.println(sb.toString());
        }
    }

    @Override // defpackage.jgm
    public final void b(Handler handler) {
        this.l = 0L;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
        this.h.set(0);
        xyc xycVar = this.s;
        this.d = 1000.0d / ((Integer) xycVar.gu()).intValue();
        this.c = (acvt.c() * 1000.0d) / ((Integer) xycVar.gu()).intValue();
        handler.post(new ire(this, 18));
    }

    @Override // defpackage.jgm
    public final /* synthetic */ void c() {
    }
}
