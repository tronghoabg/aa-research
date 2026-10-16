package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class vsg {
    private final xya c;
    private volatile Process d;
    public volatile boolean b = false;
    public final xwx a = new rgf(this, 8);

    public vsg(xyi xyiVar) {
        this.c = new xya(xyiVar);
    }

    public final void a(String str) {
        if (str.isEmpty()) {
            return;
        }
        Process process = this.d;
        if (process != null) {
            try {
                if (process.exitValue() != 0) {
                    this.b = true;
                    this.d = null;
                }
            } catch (IllegalThreadStateException unused) {
                return;
            }
        }
        if (this.b) {
            return;
        }
        synchronized (this) {
            xya xyaVar = this.c;
            if (!xyaVar.a || xyaVar.a(TimeUnit.MILLISECONDS) >= 60000) {
                xyaVar.d();
                xyaVar.e();
                this.d = (Process) this.a.a(str);
            }
        }
    }
}
