package J9;

import Re.C0818m;
import android.app.Application;
import cf.C1608b;
import df.InterfaceC2432a;
import java.util.concurrent.Executor;
import md.AbstractC3556y;

/* loaded from: classes4.dex */
public final class r implements A9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5977a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2432a f5978b;

    public /* synthetic */ r(InterfaceC2432a interfaceC2432a, int i5) {
        this.f5977a = i5;
        this.f5978b = interfaceC2432a;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f5977a) {
            case 0:
                return new C0658q((ta.p) this.f5978b.get());
            case 1:
                return new C0661u((I) this.f5978b.get());
            case 2:
                return new J((Application) this.f5978b.get());
            case 3:
                Re.Q q4 = ((C0643b) this.f5978b.get()).f5916b;
                Fe.b.l(q4);
                return q4;
            case 4:
                return new C0643b((w8.d) this.f5978b.get());
            case 5:
                return new C0651j((Executor) this.f5978b.get());
            case 6:
                Application application = (Application) this.f5978b.get();
                C0657p c0657p = new C0657p();
                C1608b c1608b = c0657p.f5975e;
                c1608b.getClass();
                C0818m c0818m = new C0818m(c1608b, 3);
                int i5 = He.c.f5007a;
                Ne.b.b(i5, "bufferSize");
                Re.Q qC = new Re.M(c0818m, i5).c();
                qC.f();
                application.registerActivityLifecycleCallbacks(c0657p);
                return qC;
            default:
                md.S sA = AbstractC3556y.c((String) this.f5978b.get()).a();
                Fe.b.l(sA);
                return sA;
        }
    }

    public /* synthetic */ r(Object obj, InterfaceC2432a interfaceC2432a, int i5) {
        this.f5977a = i5;
        this.f5978b = interfaceC2432a;
    }
}
