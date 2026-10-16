package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.CarCall;
import java.util.List;

/* loaded from: classes2.dex */
final class rnd extends rng {
    final /* synthetic */ CarCall a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnd(CarCall carCall, List list) {
        super("onChildrenChanged");
        this.a = carCall;
        this.b = list;
    }

    @Override // defpackage.rng
    public final void a(qwa qwaVar) throws RemoteException {
        qwaVar.k(this.a, this.b);
    }
}
