package defpackage;

import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplay;
import java.util.Set;

/* loaded from: classes.dex */
public final class rkc extends ijo implements rkd {
    private final Set a;
    private final sss b;
    private CarDisplay c;

    public rkc(byte[] bArr) {
        super("com.google.android.gms.car.display.manager.ICarDisplayChangedListener");
        this.a = new yy(0);
        this.b = new sss(Looper.getMainLooper());
    }

    public final synchronized void a() {
        this.a.clear();
    }

    public final synchronized void b(sgk sgkVar) {
        this.a.add(sgkVar);
        CarDisplay carDisplay = this.c;
        if (carDisplay != null) {
            sgkVar.c(carDisplay);
        }
    }

    public final synchronized void c(sgk sgkVar) {
        this.a.remove(sgkVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rkd
    public final synchronized void e(CarDisplay carDisplay) {
        yx yxVar = new yx((yy) this.a);
        while (yxVar.hasNext()) {
            this.b.post(new qqy((sgk) yxVar.next(), carDisplay, 8));
        }
        this.c = carDisplay;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        CarDisplay carDisplay = (CarDisplay) ijp.a(parcel, CarDisplay.CREATOR);
        ijp.d(parcel);
        e(carDisplay);
        parcel2.writeNoException();
        return true;
    }

    public rkc() {
        throw null;
    }
}
