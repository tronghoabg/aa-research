package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class suh extends defpackage.ijw implements defpackage.sui {
    public suh() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.location.internal.FusedLocationProviderResult fusedLocationProviderResult = (com.google.android.gms.location.internal.FusedLocationProviderResult) defpackage.ijx.a(parcel, com.google.android.gms.location.internal.FusedLocationProviderResult.CREATOR);
            com.google.android.gms.common.api.ApiMetadata apiMetadata = (com.google.android.gms.common.api.ApiMetadata) defpackage.ijx.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
            defpackage.ijx.d(parcel);
            e(fusedLocationProviderResult, apiMetadata);
        } else {
            if (i != 2) {
                return false;
            }
            defpackage.ijx.d(parcel);
            f();
        }
        return true;
    }
}
