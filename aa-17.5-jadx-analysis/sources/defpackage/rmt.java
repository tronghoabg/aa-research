package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.CarCall;

/* loaded from: classes2.dex */
final class rmt extends rng {
    final /* synthetic */ CarCall a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmt(CarCall carCall, String str) {
        super("onPostDialWait");
        this.a = carCall;
        this.b = str;
    }

    @Override // defpackage.rng
    public final void a(qwa qwaVar) throws RemoteException {
        qwaVar.p(this.a, this.b);
    }
}
