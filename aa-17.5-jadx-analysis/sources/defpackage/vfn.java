package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.model.Circle;
import com.google.android.libraries.maps.model.internal.ICircleDelegate;

/* loaded from: classes3.dex */
public final class vfn extends ijo implements vfo {
    final /* synthetic */ GoogleMap.OnCircleClickListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfn(GoogleMap.OnCircleClickListener onCircleClickListener) {
        super("com.google.android.libraries.maps.internal.IOnCircleClickListener");
        this.a = onCircleClickListener;
    }

    @Override // defpackage.vfo
    public final void e(ICircleDelegate iCircleDelegate) {
        this.a.onCircleClick(new Circle(iCircleDelegate));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ICircleDelegate iCircleDelegateAsInterface = ICircleDelegate.Stub.asInterface(parcel.readStrongBinder());
        ijp.d(parcel);
        e(iCircleDelegateAsInterface);
        parcel2.writeNoException();
        return true;
    }
}
