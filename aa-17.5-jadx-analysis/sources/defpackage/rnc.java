package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.CarCall;

/* loaded from: classes2.dex */
final class rnc extends rng {
    final /* synthetic */ CarCall a;
    final /* synthetic */ CarCall b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnc(CarCall carCall, CarCall carCall2) {
        super("onParentChanged");
        this.a = carCall;
        this.b = carCall2;
    }

    @Override // defpackage.rng
    public final void a(qwa qwaVar) throws RemoteException {
        qwaVar.o(this.a, this.b);
    }
}
