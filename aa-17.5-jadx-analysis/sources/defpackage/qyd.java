package defpackage;

import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.RadioProgramInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class qyd extends ijo implements qye {
    private final WeakReference a;

    public qyd(qsb qsbVar) {
        super("com.google.android.gms.car.ICarRadioCallback");
        this.a = new WeakReference(qsbVar);
    }

    @Override // defpackage.qye
    public final void e(List list) {
        qsb qsbVar = (qsb) this.a.get();
        if (qsbVar != null) {
            Handler handler = (Handler) qsbVar.c;
            handler.sendMessage(handler.obtainMessage(17, list));
        } else if (omc.c("CAR.RADIO", 3)) {
            rrd.a("CAR.RADIO", null, "manager is null on callback");
        }
    }

    @Override // defpackage.qye
    public final void f(boolean z) {
        qsb qsbVar = (qsb) this.a.get();
        if (qsbVar == null) {
            if (omc.c("CAR.RADIO", 3)) {
                rrd.a("CAR.RADIO", null, "manager is null on callback");
            }
        } else {
            Boolean boolValueOf = Boolean.valueOf(z);
            Handler handler = (Handler) qsbVar.c;
            handler.sendMessage(handler.obtainMessage(14, boolValueOf));
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            ijp.d(parcel);
            i(i2);
        } else if (i == 2) {
            boolean zJ = ijp.j(parcel);
            ijp.d(parcel);
            f(zJ);
        } else if (i == 3) {
            RadioProgramInfo radioProgramInfo = (RadioProgramInfo) ijp.a(parcel, RadioProgramInfo.CREATOR);
            boolean zJ2 = ijp.j(parcel);
            boolean zJ3 = ijp.j(parcel);
            ijp.d(parcel);
            g(radioProgramInfo, zJ2, zJ3);
        } else if (i == 4) {
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(RadioProgramInfo.CREATOR);
            ijp.d(parcel);
            h(arrayListCreateTypedArrayList);
        } else {
            if (i != 5) {
                return false;
            }
            ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(RadioProgramInfo.CREATOR);
            ijp.d(parcel);
            e(arrayListCreateTypedArrayList2);
        }
        return true;
    }

    @Override // defpackage.qye
    public final void g(RadioProgramInfo radioProgramInfo, boolean z, boolean z2) {
        qsb qsbVar = (qsb) this.a.get();
        if (qsbVar != null) {
            Handler handler = (Handler) qsbVar.c;
            handler.sendMessage(handler.obtainMessage(15, z ? 1 : 0, z2 ? 1 : 0, radioProgramInfo));
        } else if (omc.c("CAR.RADIO", 3)) {
            rrd.a("CAR.RADIO", null, "manager is null on callback");
        }
    }

    @Override // defpackage.qye
    public final void h(List list) {
        qsb qsbVar = (qsb) this.a.get();
        if (qsbVar != null) {
            Handler handler = (Handler) qsbVar.c;
            handler.sendMessage(handler.obtainMessage(16, list));
        } else if (omc.c("CAR.RADIO", 3)) {
            rrd.a("CAR.RADIO", null, "manager is null on callback");
        }
    }

    @Override // defpackage.qye
    public final void i(int i) {
        qsb qsbVar = (qsb) this.a.get();
        if (qsbVar != null) {
            Handler handler = (Handler) qsbVar.c;
            handler.sendMessage(handler.obtainMessage(13, i, -1));
        } else if (omc.c("CAR.RADIO", 3)) {
            rrd.a("CAR.RADIO", null, "manager is null on callback");
        }
    }
}
