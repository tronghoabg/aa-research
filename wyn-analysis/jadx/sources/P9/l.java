package p9;

import E5.n0;
import Va.Y7;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import md.S;
import ne.C3618a;
import r9.C3955l;
import r9.P;
import r9.RunnableC3951h;

/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f43375b;

    public /* synthetic */ l(n nVar, int i5) {
        this.f43374a = i5;
        this.f43375b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f43375b;
        switch (this.f43374a) {
            case 0:
                n0 n0Var = nVar.f43386h;
                n0Var.getClass();
                Ba.c.p("RemoteStore", "Shutting down", 1, new Object[0]);
                Y7 y72 = (Y7) n0Var.f3479i;
                Runnable runnable = (Runnable) y72.f13869c;
                if (runnable != null) {
                    runnable.run();
                    y72.f13869c = null;
                }
                n0Var.f3477g = false;
                n0Var.f();
                X8.c cVar = ((v9.g) n0Var.f3475e).f47068c.f47095d;
                cVar.getClass();
                try {
                    S s10 = (S) Tasks.await((Task) cVar.f16184a);
                    s10.m();
                    try {
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        if (!s10.i(1L)) {
                            Ba.c.p(v9.m.class.getSimpleName(), "Unable to gracefully shutdown the gRPC ManagedChannel. Will attempt an immediate shutdown.", 1, new Object[0]);
                            s10.n();
                            if (!s10.i(60L)) {
                                Ba.c.p(v9.m.class.getSimpleName(), "Unable to forcefully shutdown the gRPC ManagedChannel.", 2, new Object[0]);
                            }
                        }
                    } catch (InterruptedException unused) {
                        s10.n();
                        Ba.c.p(v9.m.class.getSimpleName(), "Interrupted while shutting down the gRPC Managed Channel", 2, new Object[0]);
                        Thread.currentThread().interrupt();
                    }
                } catch (InterruptedException unused2) {
                    Ba.c.p(v9.m.class.getSimpleName(), "Interrupted while retrieving the gRPC Managed Channel", 2, new Object[0]);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e7) {
                    Ba.c.p(v9.m.class.getSimpleName(), "Channel is not initialized, shutdown will just do nothing. Channel initializing run into exception: %s", 2, e7);
                }
                ((io.flutter.plugin.platform.x) n0Var.f3480j).d(1);
                nVar.f43384f.S();
                P p10 = nVar.f43389l;
                if (p10 != null) {
                    p10.stop();
                }
                C3618a c3618a = nVar.k;
                if (c3618a != null) {
                    c3618a.stop();
                    break;
                }
                break;
            case 1:
                nVar.f43386h.h();
                break;
            case 2:
                n0 n0Var2 = nVar.f43386h;
                n0Var2.f3477g = false;
                n0Var2.f();
                ((io.flutter.plugin.platform.x) n0Var2.f3480j).d(3);
                break;
            default:
                C3955l c3955l = nVar.f43385g;
                c3955l.getClass();
                c3955l.f44631a.P("Delete All Indexes", new RunnableC3951h(c3955l, 2));
                break;
        }
    }
}
