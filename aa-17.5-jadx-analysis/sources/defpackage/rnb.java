package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.CarCall;

/* loaded from: classes2.dex */
final class rnb extends rng {
    final /* synthetic */ CarCall a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnb(CarCall carCall, int i) {
        super("onStateChanged");
        this.a = carCall;
        this.b = i;
    }

    @Override // defpackage.rng
    public final void a(qwa qwaVar) throws RemoteException {
        qwaVar.q(this.a, this.b);
    }
}
