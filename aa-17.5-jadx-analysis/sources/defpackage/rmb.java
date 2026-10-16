package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class rmb extends ijo implements rmc {
    public boolean a;
    private final WeakReference b;

    public rmb(rlz rlzVar) {
        super("com.google.android.gms.car.input.ICarEditableListener");
        this.a = true;
        this.b = new WeakReference(rlzVar);
    }

    @Override // defpackage.rmc
    public final void e(int i, int i2, int i3, int i4) {
        rlz rlzVar = (rlz) this.b.get();
        if (rlzVar != null) {
            rlzVar.a.post(new rfc(this, rlzVar, 12));
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int i2 = parcel.readInt();
        int i3 = parcel.readInt();
        int i4 = parcel.readInt();
        int i5 = parcel.readInt();
        ijp.d(parcel);
        e(i2, i3, i4, i5);
        parcel2.writeNoException();
        return true;
    }
}
