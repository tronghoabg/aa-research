package defpackage;

import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.control.CarControlGroup;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class rio extends ijo implements rip {
    private final ymf a;
    private final sss b;

    public rio(byte[] bArr) {
        super("com.google.android.gms.car.control.ICarControlGroupUpdateListener");
        this.a = new yez(null);
        this.b = new sss(Looper.getMainLooper());
    }

    public final synchronized void a() {
        this.a.q();
    }

    public final synchronized void b(int i, ajmd ajmdVar) {
        this.a.t(Integer.valueOf(i), ajmdVar);
    }

    public final synchronized void c(int i, ajmd ajmdVar) {
        this.a.C(Integer.valueOf(i), ajmdVar);
    }

    @Override // defpackage.rip
    public final synchronized void e(CarControlGroup carControlGroup) {
        Iterator it = this.a.c(Integer.valueOf(carControlGroup.a)).iterator();
        while (it.hasNext()) {
            this.b.post(new rfc((ajmd) it.next(), carControlGroup, 9, null));
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        CarControlGroup carControlGroup = (CarControlGroup) ijp.a(parcel, CarControlGroup.CREATOR);
        ijp.d(parcel);
        e(carControlGroup);
        return true;
    }

    public rio() {
        throw null;
    }
}
