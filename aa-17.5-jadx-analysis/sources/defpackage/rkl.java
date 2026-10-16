package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.display.UiStyle;

/* loaded from: classes.dex */
public abstract class rkl extends ijo implements rkm {
    public rkl() {
        super("com.google.android.gms.car.display.manager.ICarDisplayThemingManager");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 2) {
            UiStyle uiStyle = (UiStyle) ijp.a(parcel, UiStyle.CREATOR);
            ijp.d(parcel);
            c(uiStyle);
            parcel2.writeNoException();
        } else if (i != 3) {
            if (i != 4) {
                return false;
            }
            ClassLoader classLoader = ijp.a;
            boolean z = parcel.readInt() != 0;
            ijp.d(parcel);
            b(z);
            parcel2.writeNoException();
        } else {
            int iA = a();
            parcel2.writeNoException();
            parcel2.writeInt(iA);
        }
        return true;
    }
}
