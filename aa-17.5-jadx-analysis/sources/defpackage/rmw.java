package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.car.CarCall;

/* loaded from: classes2.dex */
final class rmw extends rng {
    final /* synthetic */ CarCall a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmw(CarCall carCall, String str, Bundle bundle) {
        super("onConnectionEvent");
        this.a = carCall;
        this.b = str;
        this.c = bundle;
    }

    @Override // defpackage.rng
    public final void a(qwa qwaVar) throws RemoteException {
        qwaVar.m(this.a, this.b, this.c);
    }
}
