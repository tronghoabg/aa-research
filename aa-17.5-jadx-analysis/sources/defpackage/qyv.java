package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class qyv extends ijo implements qyw {
    private final WeakReference a;

    public qyv(sab sabVar) {
        super("com.google.android.gms.car.ICarVideoFocusListener");
        this.a = new WeakReference(sabVar);
    }

    @Override // defpackage.qyw
    public final void e(boolean z) {
        sab sabVar = (sab) this.a.get();
        if (sabVar != null) {
            sabVar.b.post(new jgv(sabVar, z, 13));
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zJ = ijp.j(parcel);
        ijp.d(parcel);
        e(zJ);
        return true;
    }
}
