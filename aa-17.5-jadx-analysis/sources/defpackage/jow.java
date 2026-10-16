package defpackage;

import android.os.RemoteException;
import android.view.Surface;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class jow implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jow(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.os.IBinder$DeathRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [ipi, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) throws RemoteException {
        int i = this.b;
        if (i == 0) {
            qup qupVar = (qup) obj;
            ((ype) jox.a.l().ai((char) 2567)).u("onDelegateAcquired()");
            ?? r10 = this.a;
            try {
                qupVar.asBinder().linkToDeath(r10, 0);
                ((ype) ((ype) jox.a.f()).ai((char) 2568)).y("Successfully acquired new delegate: %s", new zjd(zjc.a, qupVar));
                jox joxVar = (jox) r10;
                joxVar.b.set(20L);
                joxVar.c.set(false);
                return;
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) jox.a.g()).p(e)).ai((char) 2569)).y("Failed to linkToDeath() for ICar delegate %s.", new zjd(zjc.a, qupVar));
                jox joxVar2 = (jox) r10;
                joxVar2.c.set(false);
                joxVar2.i(1);
                return;
            }
        }
        int i2 = 3;
        if (i == 1) {
            Optional optional = ((ipb) this.a).aj;
            imn imnVar = new imn((Surface) obj, i2);
            if (true != optional.isPresent()) {
                return;
            }
            optional.get().b((Surface) imnVar.a);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                RemoteException remoteException = (RemoteException) obj;
                if (rrd.e("GH.CarClient", 4)) {
                    rrd.c("GH.CarClient", remoteException, "Tearing down in response to RemoteException.");
                }
                ((rdj) this.a).G();
                return;
            }
            nrd nrdVar = (nrd) obj;
            yph yphVar = mse.a;
            nrdVar.c = (lds) kgq.c(new xfb(nrdVar, (qrn) this.a, 1), "GH.InputConfiguration", yzz.INPUT_CONFIGURATION, yzy.oP, false, "Car not connected. Cannot reliably determine InputConfiguration.", new Object[0]);
            nrdVar.a = true;
            return;
        }
        yph yphVar2 = jox.a;
        ((ype) yphVar2.l().ai((char) 2570)).u("onDelegateAcquisitionFailure()");
        Object obj2 = this.a;
        jox joxVar3 = (jox) obj2;
        joxVar3.c.set(false);
        if ((((Throwable) obj) instanceof CancellationException) && ((jpw) obj2).n()) {
            ((ype) ((ype) yphVar2.f()).ai((char) 2571)).u("Delegate acquisition was cancelled, not refreshing delegate.");
        } else {
            joxVar3.i(2);
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
