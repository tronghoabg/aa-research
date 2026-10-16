package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bk extends ce {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bm f46672a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a.bo f46673b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a.ac f46674c;

    /* renamed from: d, reason: collision with root package name */
    private final e.a.p[] f46675d;

    /* renamed from: e, reason: collision with root package name */
    private volatile e.a.ee f46676e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* synthetic */ bk(bm bmVar, e.a.bo boVar, e.a.p[] pVarArr) {
        super("connecting_and_lb");
        Objects.requireNonNull(bmVar);
        this.f46672a = bmVar;
        this.f46674c = e.a.ac.g();
        this.f46673b = boVar;
        this.f46675d = pVarArr;
    }

    static /* bridge */ /* synthetic */ Runnable r(bk bkVar, aj ajVar) {
        e.a.ac acVarA = bkVar.f46674c.a();
        try {
            e.a.bo boVar = bkVar.f46673b;
            af afVarB = ajVar.b(boVar.c(), boVar.b(), boVar.a(), bkVar.f46675d);
            bkVar.f46674c.b(acVarA);
            return bkVar.u(afVarB);
        } catch (Throwable th) {
            bkVar.f46674c.b(acVarA);
            throw th;
        }
    }

    @Override // e.a.d.ce, e.a.d.af
    public final void b(dn dnVar) {
        if (this.f46673b.a().t()) {
            dnVar.a("wait_for_ready");
            e.a.ee eeVar = this.f46676e;
            if (eeVar != null && !eeVar.l()) {
                dnVar.b("Last Pick Failure", eeVar);
            }
        }
        super.b(dnVar);
    }

    @Override // e.a.d.ce, e.a.d.af
    public final void c(e.a.ee eeVar) {
        super.c(eeVar);
        bm bmVar = this.f46672a;
        synchronized (bmVar.f46680b) {
            if (bmVar.f46685g != null) {
                boolean zRemove = bmVar.f46687i.remove(this);
                if (!bmVar.l() && zRemove) {
                    bmVar.f46682d.c(bmVar.f46684f);
                    if (bmVar.f46688j.f46678b != null) {
                        bmVar.f46682d.c(bmVar.f46685g);
                        bmVar.f46685g = null;
                    }
                }
            }
        }
        this.f46672a.f46682d.b();
    }

    @Override // e.a.d.ce
    protected final void s() {
        int i2 = 0;
        while (true) {
            e.a.p[] pVarArr = this.f46675d;
            if (i2 >= pVarArr.length) {
                return;
            }
            e.a.p pVar = pVarArr[i2];
            i2++;
        }
    }
}
