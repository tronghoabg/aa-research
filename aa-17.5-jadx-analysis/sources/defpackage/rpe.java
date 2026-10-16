package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;

/* loaded from: classes.dex */
public final class rpe extends ijn implements rpg {
    public rpe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.lifecycle.ICarDisplayLayoutUpdateCompleteListener");
    }

    @Override // defpackage.rpg
    public final void e(String str, CarDisplayId carDisplayId) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        ijp.g(parcelGh, carDisplayId);
        gk(2, parcelGh);
    }
}
