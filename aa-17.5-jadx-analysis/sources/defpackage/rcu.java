package defpackage;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.car.CarFrxEvent;
import com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackRequest;
import com.google.android.gms.car.control.CarAction;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.car.display.UiStyle;
import com.google.android.gms.car.lifecycle.CarActivityLayoutConfig;

/* loaded from: classes.dex */
public final /* synthetic */ class rcu implements rze {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rcu(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, rhr] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, rho] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, rho] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object, rjm] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object, rka] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Object, rka] */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.lang.Object, rkm] */
    @Override // defpackage.rze
    public final void a() throws RemoteException {
        int i = 3;
        switch (this.c) {
            case 0:
                ((rdj) this.a).C().aC((CarFrxEvent) this.b);
                return;
            case 1:
                ((rdj) this.b).C().bj((CarActivityLayoutConfig) this.a);
                return;
            case 2:
                rdj rdjVar = (rdj) this.a;
                if (!rdjVar.p(raj.t)) {
                    throw new IllegalStateException("This API can only be used if multi-display is enabled");
                }
                if (omc.c("CAR.CLIENT", 3)) {
                    rrd.a("CAR.CLIENT", null, "Multi-display client enabled. RegisterCarActivityLifecycleEventListener");
                }
                rdjVar.j.E(new rcv(this.b, 1));
                return;
            case 3:
                qup qupVarC = ((rdj) this.a).C();
                Object obj = this.b;
                if (!qupVarC.by((Intent) obj)) {
                    throw new IllegalArgumentException("No matching component for intent: ".concat(String.valueOf(String.valueOf(obj))));
                }
                return;
            case 4:
                ((rdj) this.b).C().bb((CarRegionId) this.a);
                return;
            case 5:
                rdj rdjVar2 = (rdj) this.a;
                if (!rdjVar2.p(raj.F)) {
                    throw new IllegalStateException("This API can only be used if coolwalk is enabled");
                }
                if (omc.c("CAR.CLIENT", 3)) {
                    rrd.a("CAR.CLIENT", null, "RegisterCarActivityLifecycleEventProcessor");
                }
                rdjVar2.i.E(new rcv(this.b, 0));
                return;
            case 6:
                ((rdj) this.a).h.E(new rcv(this.b, 2));
                return;
            case 7:
                ((lah) ((rdx) this.a).d).E(new rcv(this.b, i));
                return;
            case 8:
                rhj rhjVar = (rhj) this.a;
                ?? r1 = rhjVar.c;
                ((rhq) r1).a = (ajmd) this.b;
                rhjVar.b.f(r1);
                return;
            case 9:
                ((rhj) this.b).b.g((CarLocalMediaPlaybackRequest) this.a);
                return;
            case 10:
                ((rij) this.a).b.n((CarAction) this.b);
                return;
            case 11:
                ((lah) ((rjr) this.a).a).E(new rcv(this.b, 6));
                return;
            case 12:
                ((rjr) this.b).c.b(this.a);
                return;
            case 13:
                ((rjs) this.a).a.e((CarDisplayId) this.b);
                return;
            case 14:
                ((rjs) this.a).a.f((CarDisplayId) this.b);
                return;
            default:
                ((rju) this.a).b.c((UiStyle) this.b);
                return;
        }
    }

    public /* synthetic */ rcu(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
