package i8;

import ea.S;

/* renamed from: i8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2858c extends z {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f36889g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f36890h;

    public /* synthetic */ C2858c(Object obj, int i5) {
        this.f36889g = i5;
        this.f36890h = obj;
    }

    @Override // i8.z
    public final void b() {
        switch (this.f36889g) {
            case 0:
                d dVar = (d) ((S) this.f36890h).f34501b;
                dVar.f36893b.b("unlinkToDeath", new Object[0]);
                dVar.f36904n.asBinder().unlinkToDeath(dVar.k, 0);
                dVar.f36904n = null;
                dVar.f36898g = false;
                return;
            default:
                synchronized (((d) this.f36890h).f36897f) {
                    try {
                        if (((d) this.f36890h).f36902l.get() > 0 && ((d) this.f36890h).f36902l.decrementAndGet() > 0) {
                            ((d) this.f36890h).f36893b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        d dVar2 = (d) this.f36890h;
                        if (dVar2.f36904n != null) {
                            dVar2.f36893b.b("Unbind from service.", new Object[0]);
                            d dVar3 = (d) this.f36890h;
                            dVar3.f36892a.unbindService(dVar3.f36903m);
                            d dVar4 = (d) this.f36890h;
                            dVar4.f36898g = false;
                            dVar4.f36904n = null;
                            dVar4.f36903m = null;
                        }
                        ((d) this.f36890h).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}
