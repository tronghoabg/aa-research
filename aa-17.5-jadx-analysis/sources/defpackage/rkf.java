package defpackage;

import android.graphics.Rect;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.Set;

/* loaded from: classes.dex */
public final class rkf extends ijo implements rkg {
    private final Set a;
    private final sss b;

    public rkf(byte[] bArr) {
        super("com.google.android.gms.car.display.manager.ICarDisplayContentInsetsChangedListener");
        this.a = new yy(0);
        this.b = new sss(Looper.getMainLooper());
    }

    public final synchronized void a() {
        this.a.clear();
    }

    public final synchronized void b(sgk sgkVar) {
        this.a.add(sgkVar);
    }

    public final synchronized void c(sgk sgkVar) {
        this.a.remove(sgkVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rkg
    public final void e(CarDisplayId carDisplayId, Rect rect) {
        yx yxVar = new yx((yy) this.a);
        while (yxVar.hasNext()) {
            this.b.post(new rdz((sgk) yxVar.next(), carDisplayId, rect, 0));
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        CarDisplayId carDisplayId = (CarDisplayId) ijp.a(parcel, CarDisplayId.CREATOR);
        Rect rect = (Rect) ijp.a(parcel, Rect.CREATOR);
        ijp.d(parcel);
        e(carDisplayId, rect);
        parcel2.writeNoException();
        return true;
    }

    public rkf() {
        throw null;
    }
}
