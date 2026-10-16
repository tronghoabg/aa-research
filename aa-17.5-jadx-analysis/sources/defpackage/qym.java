package defpackage;

import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.CarUiInfo;
import java.util.Set;

/* loaded from: classes.dex */
public final class qym extends ijo implements qyn {
    private final Set a;
    private final sss b;

    public qym(byte[] bArr) {
        super("com.google.android.gms.car.ICarUiInfoChangedListener");
        this.a = new yy(0);
        this.b = new sss(Looper.getMainLooper());
    }

    public final synchronized void a() {
        this.a.clear();
    }

    public final synchronized void b(rck rckVar) {
        this.a.add(rckVar);
    }

    public final synchronized void c(rck rckVar) {
        this.a.remove(rckVar);
    }

    @Override // defpackage.qyn
    public final synchronized void e(CarUiInfo carUiInfo) {
        yx yxVar = new yx((yy) this.a);
        while (yxVar.hasNext()) {
            this.b.post(new qqy((rck) yxVar.next(), carUiInfo, 11, (char[]) null));
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        CarUiInfo carUiInfo = (CarUiInfo) ijp.a(parcel, CarUiInfo.CREATOR);
        ijp.d(parcel);
        e(carUiInfo);
        return true;
    }

    public qym() {
        throw null;
    }
}
