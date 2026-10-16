package v9;

import com.google.android.gms.tasks.Tasks;
import me.C3558a;
import nd.C3616b;
import w9.AbstractC4392k;
import w9.C4386e;

/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X8.c f47099b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3616b f47100c;

    public /* synthetic */ n(X8.c cVar, C3616b c3616b, int i5) {
        this.f47098a = i5;
        this.f47099b = cVar;
        this.f47100c = c3616b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47098a) {
            case 0:
                this.f47099b.e(this.f47100c);
                break;
            case 1:
                X8.c cVar = this.f47099b;
                cVar.getClass();
                Ba.c.p("GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", 1, new Object[0]);
                if (((C3558a) cVar.f16187d) != null) {
                    Ba.c.p("GrpcCallProvider", "Clearing the connectivityAttemptTimer", 1, new Object[0]);
                    ((C3558a) cVar.f16187d).n();
                    cVar.f16187d = null;
                }
                ((C4386e) cVar.f16185b).a(new n(cVar, this.f47100c, 4));
                break;
            case 2:
                X8.c cVar2 = this.f47099b;
                cVar2.getClass();
                ((C4386e) cVar2.f16185b).a(new n(cVar2, this.f47100c, 3));
                break;
            case 3:
                this.f47099b.e(this.f47100c);
                break;
            default:
                X8.c cVar3 = this.f47099b;
                cVar3.getClass();
                this.f47100c.n();
                cVar3.f16184a = Tasks.call(AbstractC4392k.f47446c, new G8.c(cVar3, 11));
                break;
        }
    }
}
