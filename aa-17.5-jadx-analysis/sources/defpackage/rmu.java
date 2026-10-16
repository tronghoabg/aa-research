package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.CarCall;

/* loaded from: classes2.dex */
final class rmu extends rng {
    final /* synthetic */ CarCall a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmu(CarCall carCall) {
        super("onCallDestroyed");
        this.a = carCall;
    }

    @Override // defpackage.rng
    public final void a(qwa qwaVar) throws RemoteException {
        qwaVar.h(this.a);
    }
}
