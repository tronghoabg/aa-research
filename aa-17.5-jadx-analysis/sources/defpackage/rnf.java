package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.CarCall;
import java.util.List;

/* loaded from: classes2.dex */
final class rnf extends rng {
    final /* synthetic */ CarCall a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnf(CarCall carCall, List list) {
        super("onCannedTextResponsesLoaded");
        this.a = carCall;
        this.b = list;
    }

    @Override // defpackage.rng
    public final void a(qwa qwaVar) throws RemoteException {
        qwaVar.j(this.a, this.b);
    }
}
