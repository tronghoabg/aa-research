package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class inw implements java.lang.Runnable {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ inw(android.support.v4.app.Fragment fragment, android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle, int i) {
        this.e = i;
        this.a = fragment;
        this.d = layoutInflater;
        this.c = viewGroup;
        this.b = bundle;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.Semaphore semaphore;
        int i = this.e;
        if (i == 0) {
            java.lang.Object obj = this.a;
            defpackage.inx inxVar = (defpackage.inx) this.d;
            com.google.android.gms.car.display.CarRegionId carRegionId = inxVar.d;
            defpackage.ioh iohVar = inxVar.g.m;
            if (obj != null) {
                carRegionId = ((defpackage.inn) obj).z;
            }
            try {
                synchronized (iohVar) {
                    semaphore = iohVar.g(carRegionId).m;
                }
                if (!defpackage.rcm.i(semaphore, defpackage.acps.a.fF().b())) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ioh.b.h()).ai(655)).y("Timeout waiting for previous client to stop on region %s!", carRegionId);
                }
            } catch (java.lang.InterruptedException unused) {
            }
            new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.imx(this, this.b, this.c, 3, (char[]) null));
            return;
        }
        if (i == 1) {
            java.lang.Object obj2 = this.b;
            java.lang.Object obj3 = this.c;
            ((android.support.v4.app.Fragment) this.a).m9lambda$performCreateView$6$androidsupportv4appFragment((android.view.LayoutInflater) this.d, (android.view.ViewGroup) obj3, (android.os.Bundle) obj2);
            return;
        }
        if (i != 2) {
            if (((java.util.concurrent.atomic.AtomicBoolean) this.c).getAndSet(true)) {
                return;
            }
            java.lang.Object obj4 = this.b;
            java.lang.Object obj5 = this.d;
            java.lang.Object obj6 = this.a;
            java.lang.String str = (java.lang.String) obj5;
            defpackage.skb.b().e(str, 1030);
            ((defpackage.ski) obj6).b((defpackage.sjx) obj4, str);
            return;
        }
        java.lang.Object obj7 = this.a;
        try {
            ((defpackage.sbq) obj7).h.close();
        } catch (java.io.IOException unused2) {
        }
        java.lang.Object obj8 = this.b;
        java.lang.Object obj9 = this.d;
        com.google.android.gms.carsetup.CarSetupServiceImpl.a.f().ai(8635).w("Handoff success with %d", this.c.size());
        ((defpackage.sbq) obj7).d.d((com.google.android.gms.carsetup.CarInfoInternal) obj8, ((defpackage.xpc) obj9).p);
    }

    public inw(defpackage.inx inxVar, defpackage.inn innVar, defpackage.inn innVar2, defpackage.ioa ioaVar, int i) {
        this.e = i;
        this.a = innVar;
        this.b = innVar2;
        this.c = ioaVar;
        this.d = inxVar;
    }

    public /* synthetic */ inw(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.e = i;
        this.a = obj;
        this.c = obj2;
        this.d = obj3;
        this.b = obj4;
    }
}
