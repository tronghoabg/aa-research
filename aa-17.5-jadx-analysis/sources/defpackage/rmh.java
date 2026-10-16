package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class rmh extends ijo implements rmi {
    private final WeakReference a;

    public rmh(iof iofVar) {
        super("com.google.android.gms.car.input.ICarProjectionInputServiceCallback");
        this.a = new WeakReference(iofVar);
    }

    @Override // defpackage.rmi
    public final void e() {
        iof iofVar = (iof) this.a.get();
        if (iofVar != null) {
            iofVar.b.post(new ilp(iofVar, 3));
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        e();
        parcel2.writeNoException();
        return true;
    }
}
