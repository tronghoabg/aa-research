package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jpe implements java.util.function.Consumer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jpe(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.os.IBinder$DeathRecipient, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.b;
        if (i == 0) {
            defpackage.yqm yqmVar = defpackage.jpf.a;
            ((defpackage.yqj) yqmVar.l().ai((char) 2572)).u("onDelegateAcquisitionFailure()");
            java.lang.Object obj2 = this.a;
            defpackage.jpf jpfVar = (defpackage.jpf) obj2;
            jpfVar.c.set(false);
            if ((((java.lang.Throwable) obj) instanceof java.util.concurrent.CancellationException) && ((defpackage.jpy) obj2).n()) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 2573)).u("Delegate acquisition was cancelled, not refreshing delegate.");
                return;
            } else {
                jpfVar.i(2);
                return;
            }
        }
        if (i == 1) {
            defpackage.qvl qvlVar = (defpackage.qvl) obj;
            ((defpackage.yqj) defpackage.jpf.a.l().ai((char) 2569)).u("onDelegateAcquired()");
            ?? r11 = this.a;
            try {
                qvlVar.asBinder().linkToDeath(r11, 0);
                ((defpackage.yqj) ((defpackage.yqj) defpackage.jpf.a.f()).ai((char) 2570)).y("Successfully acquired new delegate: %s", new defpackage.zkf(defpackage.zke.a, qvlVar));
                defpackage.jpf jpfVar2 = (defpackage.jpf) r11;
                jpfVar2.b.set(20L);
                jpfVar2.c.set(false);
                return;
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.jpf.a.g()).p(e)).ai((char) 2571)).y("Failed to linkToDeath() for ICar delegate %s.", new defpackage.zkf(defpackage.zke.a, qvlVar));
                defpackage.jpf jpfVar3 = (defpackage.jpf) r11;
                jpfVar3.c.set(false);
                jpfVar3.i(1);
                return;
            }
        }
        if (i == 2) {
            defpackage.nrr nrrVar = (defpackage.nrr) obj;
            defpackage.yqm yqmVar2 = defpackage.msi.a;
            nrrVar.c = (defpackage.row) defpackage.kgu.c(new defpackage.xgb(nrrVar, (defpackage.qsh) this.a, 1), "GH.InputConfiguration", defpackage.zbe.INPUT_CONFIGURATION, defpackage.zbd.oP, false, "Car not connected. Cannot reliably determine InputConfiguration.", new java.lang.Object[0]);
            nrrVar.a = true;
            return;
        }
        if (i == 3) {
            android.os.RemoteException remoteException = (android.os.RemoteException) obj;
            if (defpackage.rrx.e("GH.CarClient", 4)) {
                defpackage.rrx.c("GH.CarClient", remoteException, "Tearing down in response to RemoteException.");
            }
            ((defpackage.ref) this.a).G();
            return;
        }
        if (i != 4) {
            ((defpackage.smr) this.a).f((com.google.android.gms.common.api.Status) obj);
        } else {
            ((com.google.android.gms.common.api.internal.BasePendingResult) this.a).j((com.google.android.gms.common.api.Status) obj);
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.b;
        if (i == 0) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 1) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 2) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i != 3) {
            return i != 4 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
