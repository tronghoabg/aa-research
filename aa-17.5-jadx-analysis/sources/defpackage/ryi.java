package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ryi extends rxf implements ryb, rxh {
    private static final ypf f = ols.R("GH.BR.DETECTOR");
    private final rjr g;

    public ryi(Context context, Executor executor, rjr rjrVar) {
        super(context, executor);
        f.l().ai(8553).u("Created IssueDetector.");
        this.g = rjrVar;
    }

    @Override // defpackage.rxh
    public final void a(okz okzVar, okx okxVar) {
        if (okzVar.b.size() <= 0) {
            f.l().ai(8555).u("No issues found to update, not queuing for bug report generation.");
            return;
        }
        f.l().ai(8554).u("Queuing check for TroubleshooterIssues requiring Bug Reports.");
        rjr rjrVar = this.g;
        synchronized (rjrVar.b) {
            Object obj = rjrVar.a;
            synchronized (rxk.b) {
                if (!((rxk) obj).h) {
                    rxk.a.h().ai(8479).u("AsyncManager must be started before queueing updates.");
                } else if (((rxk) obj).g.f()) {
                    ((rxl) ((rxk) obj).g.b()).sendEmptyMessage(1);
                }
            }
        }
    }

    @Override // defpackage.ryb
    public final void d() {
        f.l().ai(8556).u("TroubleshooterIssueDetector starting.");
        rjr rjrVar = this.g;
        synchronized (rjrVar.b) {
            ((ypf) rjrVar.c).l().ai(8497).u("Starting processing");
            Object obj = rjrVar.a;
            synchronized (rxk.b) {
                if (((rxk) obj).h) {
                    throw new IllegalStateException("Cannot start already started thread");
                }
                ((rxk) obj).h = true;
                rxk.a.l().ai(8481).u("Creating bug report thread.");
                ((rxk) obj).e.execute(new rpo(new ykd(obj), ((rxk) obj).d.b, 5));
            }
        }
        s(this);
    }

    @Override // defpackage.ryb
    public final void e() {
        f.l().ai(8557).u("TroubleshooterIssueDetector stopping.");
        t();
        rjr rjrVar = this.g;
        synchronized (rjrVar.b) {
            Object obj = rjrVar.a;
            synchronized (rxk.b) {
                if (((rxk) obj).h) {
                    if (((rxk) obj).g.f()) {
                        ((rxl) ((rxk) obj).g.b()).sendEmptyMessage(3);
                        ((rxk) obj).g = xvy.a;
                    }
                    if (((rxk) obj).f.f()) {
                        ((rxn) ((rxk) obj).f.b()).quitSafely();
                        ((rxk) obj).f = xvy.a;
                    }
                    ((rxk) obj).h = false;
                } else {
                    rxk.a.h().ai(8480).u("AsyncManager must be started before shutting down. Ignoring request.");
                }
            }
        }
    }

    @Override // defpackage.ryb
    public final /* synthetic */ String[] f() {
        return roc.g();
    }

    @Override // defpackage.ryb
    public final void b(ryv ryvVar) {
    }

    @Override // defpackage.ryb
    public final void c(ryx ryxVar) {
    }

    @Override // defpackage.ryb
    public final /* synthetic */ void v(String str, xxh xxhVar) {
    }
}
