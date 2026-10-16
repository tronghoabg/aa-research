package defpackage;

import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.control.CarProperty;
import com.google.android.gms.car.control.CarPropertyState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class riu extends ijo implements riv {
    private final ymf a;
    private final sss b;

    public riu(byte[] bArr) {
        super("com.google.android.gms.car.control.ICarPropertyUpdateListener");
        this.a = new yez(null);
        this.b = new sss(Looper.getMainLooper());
    }

    public final synchronized void a() {
        this.a.q();
    }

    public final synchronized void b(ajmd ajmdVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.t((CarProperty) it.next(), ajmdVar);
        }
    }

    public final synchronized void c(ajmd ajmdVar) {
        ArrayList arrayList = new ArrayList();
        ymf ymfVar = this.a;
        for (Map.Entry entry : ymfVar.u()) {
            if (((ajmd) entry.getValue()).equals(ajmdVar)) {
                arrayList.add((CarProperty) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ymfVar.C((CarProperty) arrayList.get(i), ajmdVar);
        }
    }

    @Override // defpackage.riv
    public final synchronized void e(CarPropertyState carPropertyState) {
        Iterator it = this.a.c(carPropertyState.a).iterator();
        while (it.hasNext()) {
            this.b.post(new rfc((ajmd) it.next(), carPropertyState, 10, null));
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        CarPropertyState carPropertyState = (CarPropertyState) ijp.a(parcel, CarPropertyState.CREATOR);
        ijp.d(parcel);
        e(carPropertyState);
        return true;
    }

    public riu() {
        throw null;
    }
}
