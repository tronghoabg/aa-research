package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.GestureDirection;

/* loaded from: classes.dex */
public final class qwn extends ijo implements qwo {
    final /* synthetic */ nqu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwn(nqu nquVar) {
        super("com.google.android.gms.car.ICarGestureListener");
        this.a = nquVar;
    }

    @Override // defpackage.qwo
    public final void e(GestureDirection gestureDirection) {
        gestureDirection.getClass();
        nqu nquVar = this.a;
        nquVar.e.post(new mgw(gestureDirection, nquVar, 14));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        GestureDirection gestureDirection = (GestureDirection) ijp.a(parcel, GestureDirection.CREATOR);
        ijp.d(parcel);
        e(gestureDirection);
        return true;
    }
}
