package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.CarCall;

/* loaded from: classes2.dex */
final class rne extends rng {
    final /* synthetic */ CarCall a;
    final /* synthetic */ CarCall.Details b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rne(CarCall carCall, CarCall.Details details) {
        super("onDetailsChanged");
        this.a = carCall;
        this.b = details;
    }

    @Override // defpackage.rng
    public final void a(qwa qwaVar) throws RemoteException {
        qwaVar.n(this.a, this.b);
    }
}
