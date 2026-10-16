package defpackage;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class owb extends ijo implements owc {
    public owb() {
        super("com.google.android.apps.auto.sdk.IToastController");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            CharSequence charSequenceB = ijp.b(parcel);
            int i2 = parcel.readInt();
            ijp.d(parcel);
            e(charSequenceB, i2);
        } else {
            if (i != 2) {
                return false;
            }
            CharSequence charSequenceB2 = ijp.b(parcel);
            int i3 = parcel.readInt();
            ComponentName componentName = (ComponentName) ijp.a(parcel, ComponentName.CREATOR);
            ijp.d(parcel);
            f(charSequenceB2, i3, componentName);
        }
        parcel2.writeNoException();
        return true;
    }
}
