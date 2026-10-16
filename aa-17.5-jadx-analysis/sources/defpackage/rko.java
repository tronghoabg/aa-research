package defpackage;

import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarDisplayUiFeatures;
import java.util.Set;

/* loaded from: classes.dex */
public final class rko extends ijo implements rkp {
    private final Set a;
    private final sss b;

    public rko(byte[] bArr) {
        super("com.google.android.gms.car.display.manager.ICarDisplayUiFeaturesChangedListener");
        this.a = new yy(0);
        this.b = new sss(Looper.getMainLooper());
    }

    public final synchronized void a() {
        this.a.clear();
    }

    public final synchronized void b(rcg rcgVar) {
        this.a.add(rcgVar);
    }

    public final synchronized void c(rcg rcgVar) {
        this.a.remove(rcgVar);
    }

    @Override // defpackage.rkp
    public final void e(CarDisplayId carDisplayId, CarDisplayUiFeatures carDisplayUiFeatures) {
        yx yxVar = new yx((yy) this.a);
        while (yxVar.hasNext()) {
            this.b.post(new qqy((rcg) yxVar.next(), carDisplayUiFeatures, 10));
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        CarDisplayId carDisplayId = (CarDisplayId) ijp.a(parcel, CarDisplayId.CREATOR);
        CarDisplayUiFeatures carDisplayUiFeatures = (CarDisplayUiFeatures) ijp.a(parcel, CarDisplayUiFeatures.CREATOR);
        ijp.d(parcel);
        e(carDisplayId, carDisplayUiFeatures);
        parcel2.writeNoException();
        return true;
    }

    public rko() {
        throw null;
    }
}
