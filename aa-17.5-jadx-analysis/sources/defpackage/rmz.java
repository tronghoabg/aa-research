package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.CarCall;

/* loaded from: classes2.dex */
final class rmz extends rng {
    final /* synthetic */ CarCall a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmz(CarCall carCall) {
        super("onCallAdded");
        this.a = carCall;
    }

    @Override // defpackage.rng
    public final void a(qwa qwaVar) throws RemoteException {
        qwaVar.g(this.a);
    }
}
