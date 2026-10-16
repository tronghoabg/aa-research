package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* loaded from: classes2.dex */
public abstract class stj extends ijo implements stk {
    public stj() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            FusedLocationProviderResult fusedLocationProviderResult = (FusedLocationProviderResult) ijp.a(parcel, FusedLocationProviderResult.CREATOR);
            ApiMetadata apiMetadata = (ApiMetadata) ijp.a(parcel, ApiMetadata.CREATOR);
            ijp.d(parcel);
            e(fusedLocationProviderResult, apiMetadata);
        } else {
            if (i != 2) {
                return false;
            }
            ijp.d(parcel);
            f();
        }
        return true;
    }
}
